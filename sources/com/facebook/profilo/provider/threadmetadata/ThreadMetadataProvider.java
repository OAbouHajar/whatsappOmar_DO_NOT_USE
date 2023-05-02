package com.facebook.profilo.provider.threadmetadata;

import X.C32721h1;
import X.C32751h7;
import X.C32841hK;
import com.facebook.profilo.mmapbuf.core.Buffer;

public final class ThreadMetadataProvider extends C32721h1 {
    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public static native void nativeLogThreadMetadata(Buffer buffer);

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return -1;
    }

    public int getTracingProviders() {
        return 0;
    }

    public void logOnTraceEnd(C32841hK r2, C32751h7 r3) {
        nativeLogThreadMetadata(r2.A09);
    }

    public void onTraceEnded(C32841hK r3, C32751h7 r4) {
        if (r3.A00 != 2) {
            nativeLogThreadMetadata(r3.A09);
        }
    }
}
