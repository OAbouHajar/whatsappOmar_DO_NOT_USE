package com.google.gson.stream;

import java.io.IOException;

/* compiled from: XFMFile */
public final class MalformedJsonException extends IOException {
    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th) {
        super(str, th);
    }

    public MalformedJsonException(Throwable th) {
        super(th);
    }
}
