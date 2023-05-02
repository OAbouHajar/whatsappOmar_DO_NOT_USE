package com.google.android.material.appbar;

import X.AnonymousClass06y;
import X.AnonymousClass4RQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ViewOffsetBehavior extends AnonymousClass06y {
    public int A00 = 0;
    public AnonymousClass4RQ A01;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        A0I(view, coordinatorLayout, i2);
        AnonymousClass4RQ r2 = this.A01;
        if (r2 == null) {
            r2 = new AnonymousClass4RQ(view);
            this.A01 = r2;
        }
        View view2 = r2.A03;
        r2.A01 = view2.getTop();
        r2.A00 = view2.getLeft();
        r2.A00();
        int i3 = this.A00;
        if (i3 == 0) {
            return true;
        }
        AnonymousClass4RQ r1 = this.A01;
        if (r1.A02 != i3) {
            r1.A02 = i3;
            r1.A00();
        }
        this.A00 = 0;
        return true;
    }

    public void A0I(View view, CoordinatorLayout coordinatorLayout, int i2) {
        coordinatorLayout.A0D(view, i2);
    }

    public boolean A0J(int i2) {
        AnonymousClass4RQ r1 = this.A01;
        if (r1 == null) {
            this.A00 = i2;
            return false;
        } else if (r1.A02 == i2) {
            return false;
        } else {
            r1.A02 = i2;
            r1.A00();
            return true;
        }
    }
}
