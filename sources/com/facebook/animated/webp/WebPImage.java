package com.facebook.animated.webp;

import X.AnonymousClass41A;
import X.AnonymousClass41Q;
import X.AnonymousClass4YF;
import X.C41981x0;
import X.C85074Na;
import java.nio.ByteBuffer;

public class WebPImage implements C41981x0 {
    public long mNativeContext;

    public WebPImage() {
    }

    public WebPImage(long j2) {
        this.mNativeContext = j2;
    }

    public static WebPImage createFromByteArray(byte[] bArr) {
        AnonymousClass4YF.A00();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j2, int i2);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native WebPFrame getFrame(int i2);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public void dispose() {
        nativeDispose();
    }

    public boolean doesRenderSupportScaling() {
        return true;
    }

    public void finalize() {
        nativeFinalize();
    }

    public WebPFrame getFrame(int i2) {
        return getFrame(i2);
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public C85074Na getFrameInfo(int i2) {
        WebPFrame nativeGetFrame = getFrame(i2);
        try {
            return new C85074Na(nativeGetFrame.isBlendWithPreviousFrame() ? AnonymousClass41A.BLEND_WITH_PREVIOUS : AnonymousClass41A.NO_BLEND, nativeGetFrame.shouldDisposeToBackgroundColor() ? AnonymousClass41Q.DISPOSE_TO_BACKGROUND : AnonymousClass41Q.DISPOSE_DO_NOT, nativeGetFrame.getXOffset(), nativeGetFrame.getYOffset(), nativeGetFrame.getWidth(), nativeGetFrame.getHeight());
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }
}
