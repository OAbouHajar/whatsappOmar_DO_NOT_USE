package com.obwhatsapp.camera.bottomsheet;

import X.AnonymousClass2V7;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.obwhatsapp.camera.CameraBottomSheetBehavior;

public class CameraBottomSheetController$5 extends CameraBottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass2V7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraBottomSheetController$5(View view, AnonymousClass2V7 r2, boolean z2) {
        super(view, z2);
        this.A01 = r2;
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00 || !super.A0B(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return motionEvent.getPointerCount() < 2 || motionEvent.getY() > ((float) this.A01.A08.getTop());
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return this.A00 && super.A0C(motionEvent, view, coordinatorLayout);
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        this.A00 = true;
        return super.A0F(view, coordinatorLayout, i2);
    }
}
