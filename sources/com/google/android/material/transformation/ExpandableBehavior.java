package com.google.android.material.transformation;

import X.AnonymousClass06y;
import X.AnonymousClass2WK;
import X.AnonymousClass2WM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class ExpandableBehavior extends AnonymousClass06y {
    public int A00 = 0;

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A05(View view, View view2, CoordinatorLayout coordinatorLayout) {
        int i2;
        AnonymousClass2WM r6 = (AnonymousClass2WM) view2;
        boolean z2 = ((AnonymousClass2WK) r6).A0F.A01;
        int i3 = this.A00;
        if (!z2) {
            i2 = 2;
            if (i3 != 1) {
                return false;
            }
        } else if (i3 != 0 && i3 != 2) {
            return false;
        } else {
            i2 = 1;
        }
        this.A00 = i2;
        return A0I((View) r6, view, z2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r3 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r5 = this;
            boolean r0 = X.C004601z.A0u(r6)
            if (r0 != 0) goto L_0x0044
            java.util.List r3 = r7.A07(r6)
            int r2 = r3.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r4 = r3.get(r1)
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r5.A0H(r6, r4, r7)
            if (r0 == 0) goto L_0x0046
            X.2WM r4 = (X.AnonymousClass2WM) r4
            if (r4 == 0) goto L_0x0044
            r0 = r4
            X.2WK r0 = (X.AnonymousClass2WK) r0
            X.2fi r0 = r0.A0F
            boolean r3 = r0.A01
            r1 = 1
            int r0 = r5.A00
            if (r3 == 0) goto L_0x0030
            if (r0 == 0) goto L_0x0035
            r1 = 2
        L_0x0030:
            if (r0 != r1) goto L_0x0044
            r2 = 2
            if (r3 == 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            r5.A00 = r2
            android.view.ViewTreeObserver r1 = r6.getViewTreeObserver()
            X.4l4 r0 = new X.4l4
            r0.<init>(r6, r4, r5, r2)
            r1.addOnPreDrawListener(r0)
        L_0x0044:
            r0 = 0
            return r0
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.A0F(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout) {
        return view2 instanceof AnonymousClass2WK;
    }

    public abstract boolean A0I(View view, View view2, boolean z2, boolean z3);
}
