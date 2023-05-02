package com.facebook.redex;

import X.AnonymousClass3R4;
import X.C30141bo;
import X.C54622hr;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.StickyHeadersRecyclerView;

public class IDxGListenerShape15S0100000_2_I0 extends GestureDetector.SimpleOnGestureListener {
    public Object A00;
    public final int A01;

    public IDxGListenerShape15S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C30141bo r3 = (C30141bo) obj;
            View view = r3.A0L;
            if (view == null || r3.A07() || r3.A0H) {
                return false;
            }
            r3.A07.A02(view, 1);
            r3.A08.A0M(4);
            r3.A0H = true;
            return true;
        }
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) obj;
        return ((C54622hr) ((AnonymousClass3R4) stickyHeadersRecyclerView.A0N).A00).AXu(motionEvent, stickyHeadersRecyclerView.A08, stickyHeadersRecyclerView.A02);
    }
}
