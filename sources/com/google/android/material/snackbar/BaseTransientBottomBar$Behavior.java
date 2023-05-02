package com.google.android.material.snackbar;

import X.AnonymousClass4C8;
import X.C89414c8;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final AnonymousClass4C8 A00 = new AnonymousClass4C8(this);

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass4C8 r2 = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C89414c8.A00().A03(r2.A00);
            }
        } else if (coordinatorLayout.A0I(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C89414c8.A00().A02(r2.A00);
        }
        return super.A0B(motionEvent, view, coordinatorLayout);
    }
}
