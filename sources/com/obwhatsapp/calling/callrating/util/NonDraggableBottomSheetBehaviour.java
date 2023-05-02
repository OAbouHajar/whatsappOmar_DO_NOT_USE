package com.obwhatsapp.calling.callrating.util;

import X.C18450wi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.obwhatsapp.bottomsheet.LockableBottomSheetBehavior;

public final class NonDraggableBottomSheetBehaviour extends LockableBottomSheetBehavior {
    public NonDraggableBottomSheetBehaviour() {
        super((Context) null, (AttributeSet) null);
    }

    public NonDraggableBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A09(View view, View view2, CoordinatorLayout coordinatorLayout, int i2) {
        C18450wi.A0H(coordinatorLayout, 0);
        C18450wi.A0J(view, view2);
        if (this.A00) {
            super.A09(view, view2, coordinatorLayout, i2);
        }
    }

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i2, int i3, int i4) {
        C18450wi.A0H(coordinatorLayout, 0);
        C18450wi.A0J(view, view2);
        C18450wi.A0H(iArr, 5);
        if (this.A00) {
            super.A0A(view, view2, coordinatorLayout, iArr, i2, i3, i4);
        }
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18450wi.A0H(coordinatorLayout, 0);
        C18450wi.A0J(view, motionEvent);
        return this.A00 && super.A0B(motionEvent, view, coordinatorLayout);
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18450wi.A0H(coordinatorLayout, 0);
        C18450wi.A0J(view, motionEvent);
        return this.A00 && super.A0C(motionEvent, view, coordinatorLayout);
    }

    public boolean A0D(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2, int i3) {
        C18450wi.A0J(view, view2);
        C18450wi.A0H(view3, 3);
        if (this.A00) {
            this.A06 = 0;
            this.A0L = false;
            return (i2 & 2) != 0;
        }
    }

    public boolean A0E(View view, View view2, CoordinatorLayout coordinatorLayout, float f2, float f3) {
        C18450wi.A0H(view2, 2);
        return this.A00 && super.A0E(view, view2, coordinatorLayout, f2, f3);
    }
}
