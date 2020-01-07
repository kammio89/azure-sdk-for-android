package com.azure.android.core.credential;

import org.threeten.bp.OffsetDateTime;

/**
 * Represents an immutable access token with a token string and an expiration time.
 */
public class AccessToken {
    private final String token;
    private final OffsetDateTime expiresAt;

    /**
     * Creates an access token instance.
     * @param token the token string.
     * @param expiresAt the expiration time.
     */
    public AccessToken(String token, OffsetDateTime expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt.minusMinutes(2); // 2 minutes before token expires
    }

    /**
     * @return the token string.
     */
    public String getToken() {
        return token;
    }

    /**
     * @return the time when the token expires, in UTC.
     */
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * @return if the token has expired.
     */
    public boolean isExpired() {
        return OffsetDateTime.now().isAfter(expiresAt);
    }
}
