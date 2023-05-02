package com.facebook.animated.gif;

import X.AnonymousClass41A;
import X.AnonymousClass41Q;
import X.C41981x0;
import X.C85074Na;
import java.nio.ByteBuffer;

public class GifImage implements C41981x0 {
    public static volatile boolean sInitialized;
    public long mNativeContext;

    public GifImage() {
    }

    public GifImage(long j2) {
        this.mNativeContext = j2;
    }

    public static AnonymousClass41Q fromGifDisposalMethod(int i2) {
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 2) {
                return AnonymousClass41Q.DISPOSE_TO_BACKGROUND;
            }
            if (i2 == 3) {
                return AnonymousClass41Q.DISPOSE_TO_PREVIOUS;
            }
        }
        return AnonymousClass41Q.DISPOSE_DO_NOT;
    }

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i2, boolean z2);

    public static native GifImage nativeCreateFromFileDescriptor(int i2, int i3, boolean z2);

    public static native GifImage nativeCreateFromNativeMemory(long j2, int i2, int i3, boolean z2);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native GifFrame getFrame(int i2);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    public void dispose() {
        nativeDispose();
    }

    public boolean doesRenderSupportScaling() {
        return false;
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public C85074Na getFrameInfo(int i2) {
        GifFrame nativeGetFrame = getFrame(i2);
        try {
            return new C85074Na(AnonymousClass41A.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(nativeGetFrame.getDisposalMode()), nativeGetFrame.getXOffset(), nativeGetFrame.getYOffset(), nativeGetFrame.getWidth(), nativeGetFrame.getHeight());
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        int i2 = nativeGetLoopCount + 1;
        if (nativeGetLoopCount == 0) {
            return 0;
        }
        return i2;
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }
}
