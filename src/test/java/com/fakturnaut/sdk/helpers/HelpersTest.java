package com.fakturnaut.sdk.helpers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.HexFormat;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** Tests of the helpers against the server's signing scheme (HMAC-SHA256 over "timestamp.body"). */
class HelpersTest {

    /** Secret of the tests. */
    private static final String SECRET = "whsec_test";

    /** Body of the tests. */
    private static final byte[] BODY =
            "{\"id\":\"e1\",\"type\":\"invoice.issued\",\"data\":{\"livemode\":\"false\"}}".getBytes(StandardCharsets.UTF_8);

    /** Signed time. */
    private static final Instant AT = Instant.ofEpochSecond(1_760_000_000L);

    /**
     * Signs like the server.
     *
     * @param body body
     * @return the header value
     * @throws Exception if HMAC is unavailable
     */
    private static String sign(byte[] body) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(SECRET.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        mac.update("1760000000.".getBytes(StandardCharsets.UTF_8));
        return "v1=" + HexFormat.of().formatHex(mac.doFinal(body));
    }

    @Test
    @DisplayName("accepts a correctly signed, recent request in either hex case")
    void accepts() throws Exception {
        String signature = sign(BODY);
        assertTrue(Webhooks.verify(BODY, "1760000000", signature, SECRET, 300, AT.plusSeconds(100)));
        assertTrue(Webhooks.verify(
                BODY, "1760000000", "v1=" + signature.substring(3).toUpperCase(Locale.ROOT), SECRET, 300, AT));
    }

    @Test
    @DisplayName("refuses changed bodies, wrong secrets, old timestamps and malformed headers")
    void refuses() throws Exception {
        String signature = sign(BODY);
        assertFalse(Webhooks.verify("x".getBytes(StandardCharsets.UTF_8), "1760000000", signature, SECRET, 300, AT));
        assertFalse(Webhooks.verify(BODY, "1760000000", signature, "whsec_other", 300, AT));
        assertFalse(Webhooks.verify(BODY, "1760000000", signature, SECRET, 300, AT.plusSeconds(301)));
        assertFalse(Webhooks.verify(BODY, "1760000000", "v0=" + signature.substring(3), SECRET, 300, AT));
        assertFalse(Webhooks.verify(BODY, "1760000000", "v1=abc", SECRET, 300, AT));
        assertFalse(Webhooks.verify(BODY, "x", signature, SECRET, 300, AT));
        assertFalse(Webhooks.verify(BODY, null, signature, SECRET, 300, AT));
        assertFalse(Webhooks.verify(BODY, "1760000000", signature, "", 300, AT));
        assertFalse(Webhooks.verify(BODY, "1760000000", signature, SECRET));
    }

    @Test
    @DisplayName("verifies the shared test vector the server signer produces (WebhookSignerTest.sharedVector)")
    void sharedVector() {
        String signature = "v1=44eddafa3b36ac0f1b44beeb5e80682d17e95912ac022a14861ea2b34457169a";
        assertTrue(Webhooks.verify(BODY, "1760000000", signature, SECRET, 300, AT));
        assertFalse(Webhooks.verify(BODY, "1760000000", signature + "\n", SECRET, 300, AT));
    }

    @Test
    @DisplayName("creates distinct idempotency keys the API accepts")
    void idempotency() {
        String key = Idempotency.newKey();
        assertTrue(key.matches("[\\x21-\\x7E]{1,200}"));
        assertNotEquals(key, Idempotency.newKey());
    }
}
