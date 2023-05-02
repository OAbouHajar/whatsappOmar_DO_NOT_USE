package com.facebook.redex;

import X.C59882zE;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

public class IDxTListenerShape168S0100000_2_I1 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape168S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A01) {
            case 0:
                return true;
            case 1:
                C59882zE r1 = (C59882zE) this.A00;
                r1.A0B(motionEvent, r1.A09);
                return false;
            default:
                ((PointF) this.A00).set(motionEvent.getX(), motionEvent.getY());
                return false;
        }
    }
}
