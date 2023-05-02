package com.facebook.redex;

import android.view.MotionEvent;
import android.view.View;

public class IDxTListenerShape33S0000000_3_I1 implements View.OnTouchListener {
    public final int A00;

    public IDxTListenerShape33S0000000_3_I1(int i2) {
        this.A00 = i2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00 == 0 || !(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1 || motionEvent.getY() >= 0.0f);
    }
}
