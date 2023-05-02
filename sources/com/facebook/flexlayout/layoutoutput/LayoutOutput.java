package com.facebook.flexlayout.layoutoutput;

import X.AnonymousClass0JG;
import X.AnonymousClass0JH;

public class LayoutOutput {
    public float[] arr;
    public Object[] measureResults;

    public LayoutOutput(int i2) {
        this.measureResults = new Object[i2];
        this.arr = new float[(AnonymousClass0JH.values().length + (i2 * AnonymousClass0JG.values().length))];
    }
}
