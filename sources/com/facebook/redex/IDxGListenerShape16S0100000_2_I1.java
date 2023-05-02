package com.facebook.redex;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.qrcode.QrScannerViewV2;

public class IDxGListenerShape16S0100000_2_I1 extends GestureDetector.SimpleOnGestureListener {
    public Object A00;
    public final int A01;

    public IDxGListenerShape16S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onLongPress(MotionEvent motionEvent) {
        if (1 - this.A01 != 0) {
            super.onLongPress(motionEvent);
            return;
        }
        View view = (View) this.A00;
        if (view.isLongClickable()) {
            view.performLongClick();
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A01 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        ((QrScannerViewV2) this.A00).A01.A9A(motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
