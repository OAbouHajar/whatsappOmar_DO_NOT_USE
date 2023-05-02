package com.google.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass4Yt;

public final class OpusLibrary {
    static {
        synchronized (AnonymousClass4Yt.class) {
            if (AnonymousClass4Yt.A01.add("goog.exo.opus")) {
                StringBuilder A0o = AnonymousClass000.A0o();
                AnonymousClass3K3.A1N(A0o, AnonymousClass4Yt.A00);
                AnonymousClass4Yt.A00 = AnonymousClass000.A0h("goog.exo.opus", A0o);
            }
        }
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
