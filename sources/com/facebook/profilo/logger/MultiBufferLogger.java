package com.facebook.profilo.logger;

import com.facebook.jni.HybridClassBase;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.soloader.SoLoader;
import java.util.concurrent.atomic.AtomicInteger;

public final class MultiBufferLogger extends HybridClassBase {
    public final AtomicInteger mBuffersCount = new AtomicInteger(0);
    public volatile boolean mLoaded;
    public volatile long mNativePtr;

    private native long initHybrid();

    private native void nativeAddBuffer(Buffer buffer);

    private native void nativeRemoveBuffer(Buffer buffer);

    public static native int nativeWriteBytesEntry(long j2, int i2, int i3, int i4, String str);

    public static native int nativeWriteStandardEntry(long j2, int i2, int i3, long j3, int i4, int i5, int i6, long j4);

    public void addBuffer(Buffer buffer) {
        ensureLoaded();
        nativeAddBuffer(buffer);
        this.mBuffersCount.incrementAndGet();
    }

    public final void ensureLoaded() {
        if (!this.mLoaded) {
            synchronized (this) {
                if (!this.mLoaded) {
                    SoLoader.A06("profilo");
                    this.mNativePtr = initHybrid();
                    this.mLoaded = true;
                }
            }
        }
    }

    public void removeBuffer(Buffer buffer) {
        ensureLoaded();
        nativeRemoveBuffer(buffer);
        this.mBuffersCount.decrementAndGet();
    }

    public int writeBytesEntry(int i2, int i3, int i4, String str) {
        if (this.mBuffersCount.intValue() == 0) {
            return 0;
        }
        ensureLoaded();
        return nativeWriteBytesEntry(this.mNativePtr, i2, i3, i4, str);
    }

    public int writeStandardEntry(int i2, int i3, long j2, int i4, int i5, int i6, long j3) {
        if (this.mBuffersCount.intValue() == 0) {
            return 0;
        }
        ensureLoaded();
        return nativeWriteStandardEntry(this.mNativePtr, i2, i3, 0, 0, i5, 0, j3);
    }
}
