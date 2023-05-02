package com.obwhatsapp.status.playback.page;

import X.C41811wh;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class StatusPlaybackPageItem$2 extends BottomSheetBehavior {
    public float A00;
    public boolean A01;
    public final /* synthetic */ C41811wh A02;

    public StatusPlaybackPageItem$2(C41811wh r1) {
        this.A02 = r1;
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if ((!this.A01 && view.isShown()) || motionEvent.getPointerCount() >= 2) {
            return false;
        }
        boolean A0B = super.A0B(motionEvent, view, coordinatorLayout);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A00 = motionEvent.getY();
        } else if (actionMasked == 2 && this.A00 < motionEvent.getY() && this.A0B == 4) {
            return false;
        } else {
            return A0B;
        }
        return A0B;
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        this.A01 = true;
        return super.A0F(view, coordinatorLayout, i2);
    }
}
