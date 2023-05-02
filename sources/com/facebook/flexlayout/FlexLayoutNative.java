package com.facebook.flexlayout;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;
import com.facebook.flexlayout.styles.FlexItemCallback;
import com.facebook.soloader.SoLoader;

public class FlexLayoutNative {
    static {
        SoLoader.A06("flexlayout");
    }

    public static native int jni_AddNumbers(int i2, int i3);

    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f2, float f3, float f4, float f5, float f6, float f7, LayoutOutput layoutOutput, FlexItemCallback[] flexItemCallbackArr);

    public static native float jni_getBaseline(long j2, float f2, float f3);
}
