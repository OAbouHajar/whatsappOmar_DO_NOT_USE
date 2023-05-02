package com.obwhatsapp.status.playback.page;

import X.C004601z;
import X.C41811wh;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class StatusPlaybackPageItem$4 extends BottomSheetBehavior {
    public final /* synthetic */ C41811wh A00;

    public StatusPlaybackPageItem$4(C41811wh r1) {
        this.A00 = r1;
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return this.A00.A00.A0B != 3 && motionEvent.getPointerCount() < 2 && super.A0B(motionEvent, view, coordinatorLayout);
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A00.A0B == 3) {
            return false;
        }
        try {
            return super.A0C(motionEvent, view, coordinatorLayout);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        super.A0F(view, coordinatorLayout, i2);
        C004601z.A0b(view, -view.getTop());
        return true;
    }
}
