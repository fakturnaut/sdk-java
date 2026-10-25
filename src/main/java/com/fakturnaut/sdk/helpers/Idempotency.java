package com.fakturnaut.sdk.helpers;

import java.util.UUID;

/**
 * Idempotency keys: send the same key again when retrying a request after a timeout, and Fakturnaut returns the
 * original result ({@code Idempotent-Replayed: true}) instead of issuing or delivering twice.
 */
public final class Idempotency {

    /** Not instantiable. */
    private Idempotency() {}

    /**
     * Creates a new key for one logical request.
     *
     * @return a random UUID (36 visible ASCII characters)
     */
    public static String newKey() {
        return UUID.randomUUID().toString();
    }
}
