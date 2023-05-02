package com.facebook.flexlayout.layoutoutput;

import X.AnonymousClass0JI;

public class MeasureOutput {
    public float[] arr;
    public Object measureResult;

    public MeasureOutput(float f2, float f3, float f4, Object obj) {
        float[] fArr = new float[AnonymousClass0JI.values().length];
        this.arr = fArr;
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = Float.NaN;
        this.measureResult = obj;
    }
}
