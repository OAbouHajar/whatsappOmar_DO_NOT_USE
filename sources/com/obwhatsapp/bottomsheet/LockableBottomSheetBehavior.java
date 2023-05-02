package com.obwhatsapp.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class LockableBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;

    public LockableBottomSheetBehavior() {
    }

    public LockableBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A09(View view, View view2, CoordinatorLayout coordinatorLayout, int i2) {
        if (this.A00) {
            super.A09(view, view2, coordinatorLayout, i2);
        }
    }

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i2, int i3, int i4) {
        if (this.A00) {
            super.A0A(view, view2, coordinatorLayout, iArr, i2, i3, i4);
        }
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0B(motionEvent, view, coordinatorLayout);
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0C(motionEvent, view, coordinatorLayout);
    }

    public boolean A0E(View view, View view2, CoordinatorLayout coordinatorLayout, float f2, float f3) {
        if (!this.A00) {
            return false;
        }
        return super.A0E(view, view2, coordinatorLayout, f2, f3);
    }
}
