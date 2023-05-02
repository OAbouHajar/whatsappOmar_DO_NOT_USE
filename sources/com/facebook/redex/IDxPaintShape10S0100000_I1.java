package com.facebook.redex;

import X.C03060Hb;
import android.graphics.Paint;

public class IDxPaintShape10S0100000_I1 extends Paint {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxPaintShape10S0100000_I1(C03060Hb r2, int i2) {
        super(1);
        Paint.Style style;
        this.A01 = i2;
        this.A00 = r2;
        if (i2 != 0) {
            style = Paint.Style.STROKE;
        } else {
            super(1);
            style = Paint.Style.FILL;
        }
        setStyle(style);
    }
}
