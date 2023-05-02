package com.google.android.material.behavior;

import X.AnonymousClass055;
import X.AnonymousClass06y;
import X.AnonymousClass0VE;
import X.AnonymousClass5MG;
import X.C34341k6;
import X.C57142qC;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

public class SwipeDismissBehavior extends AnonymousClass06y {
    public float A00 = 0.5f;
    public float A01 = 0.0f;
    public int A02 = 2;
    public AnonymousClass0VE A03;
    public AnonymousClass5MG A04;
    public boolean A05;
    public final AnonymousClass055 A06 = new C57142qC(this);

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z2 = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.A0I(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A05 = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
        }
        if (!z2) {
            return false;
        }
        AnonymousClass0VE r2 = this.A03;
        if (r2 == null) {
            r2 = new AnonymousClass0VE(coordinatorLayout.getContext(), coordinatorLayout, this.A06);
            this.A03 = r2;
        }
        return r2.A0E(motionEvent);
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass0VE r0 = this.A03;
        if (r0 == null) {
            return false;
        }
        r0.A07(motionEvent);
        return true;
    }

    public boolean A0I(View view) {
        if (this instanceof BaseTransientBottomBar$Behavior) {
            return view instanceof C34341k6;
        }
        return true;
    }
}
