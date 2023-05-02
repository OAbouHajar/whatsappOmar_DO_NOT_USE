package com.whatsapp.voipcalling;

import java.nio.FloatBuffer;

public class GlVideoRenderer {
    public long nativeHandle;

    static {
        initNative();
    }

    public static native void initNative();

    public native boolean init(int i2, int i3);

    public native void release();

    public native void renderNativeFrame(long j2, int i2, int i3, int i4, int i5, int i6);

    public native void renderOesTexture(int i2, int i3, int i4, FloatBuffer floatBuffer);

    public native void setCornerRadius(float f2);

    public native void setScaleType(int i2);

    public native void setWindow(int i2, int i3, int i4, int i5);
}
