package com.fakturnaut.sdk.helpers;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HexFormat;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Verifies Fakturnaut webhooks: the header {@code Einvoice-Signature: v1=<hex>} is the HMAC-SHA256 of
 * {@code <timestamp>.<raw body>} with the endpoint's secret, and the header {@code Einvoice-Timestamp} must be recent.
 */
public final class Webhooks {

    /** Default tolerance between the signed timestamp and now, in seconds (protects against replays). */
    public static final long DEFAULT_TOLERANCE_SECONDS = 300;

    /** Shape of the timestamp header. */
    private static final Pattern TIMESTAMP = Pattern.compile("\\d{1,12}");

    /** Shape of the signature header. */
    private static final Pattern SIGNATURE = Pattern.compile("v1=[0-9a-fA-F]{64}");

    /** Not instantiable. */
    private Webhooks() {}

    /**
     * Verifies a webhook request with the default tolerance and the system clock.
     *
     * @param body the raw request body, exactly as received
     * @param timestamp value of the {@code Einvoice-Timestamp} header, or {@code null}
     * @param signature value of the {@code Einvoice-Signature} header, or {@code null}
     * @param secret the endpoint's signing secret ({@code whsec_...}), shown once at registration
     * @return {@code true} if the request comes from Fakturnaut and is recent
     */
    public static boolean verify(byte[] body, String timestamp, String signature, String secret) {
        return verify(body, timestamp, signature, secret, DEFAULT_TOLERANCE_SECONDS, Instant.now());
    }

    /**
     * Verifies a webhook request.
     *
     * @param body the raw request body, exactly as received
     * @param timestamp value of the {@code Einvoice-Timestamp} header, or {@code null}
     * @param signature value of the {@code Einvoice-Signature} header, or {@code null}
     * @param secret the endpoint's signing secret
     * @param toleranceSeconds allowed difference between the timestamp and {@code now}
     * @param now the current time
     * @return {@code true} if the request comes from Fakturnaut and is recent
     * @throws IllegalStateException if the JVM lacks HmacSHA256, which every compliant JVM provides
     */
    public static boolean verify(
            byte[] body, String timestamp, String signature, String secret, long toleranceSeconds, Instant now) {
        if (secret == null || secret.isEmpty() || timestamp == null || signature == null
                || !TIMESTAMP.matcher(timestamp).matches() || !SIGNATURE.matcher(signature).matches()) {
            return false;
        }
        if (Math.abs(now.getEpochSecond() - Long.parseLong(timestamp)) > toleranceSeconds) {
            return false;
        }
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            mac.update((timestamp + ".").getBytes(StandardCharsets.UTF_8));
            byte[] expected = mac.doFinal(body);
            return MessageDigest.isEqual(expected, HexFormat.of().parseHex(signature.substring(3)));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HmacSHA256 is unavailable", e);
        }
    }
}
