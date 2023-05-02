package com.obwhatsapp.camera;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class CameraBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;
    public final View A01;
    public final boolean A02;

    public CameraBottomSheetBehavior(View view, boolean z2) {
        this.A01 = view;
        this.A02 = z2;
    }

    public void A09(View view, View view2, CoordinatorLayout coordinatorLayout, int i2) {
        if (this.A0B != 4) {
            super.A09(view, view2, coordinatorLayout, i2);
        }
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A02 || (coordinatorLayout.A0I(this.A01, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.A00)) {
            return super.A0B(motionEvent, view, coordinatorLayout);
        }
        return false;
    }
}
