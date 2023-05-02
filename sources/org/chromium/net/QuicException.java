package org.chromium.net;

public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
