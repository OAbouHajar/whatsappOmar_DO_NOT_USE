package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map A00;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if ((((X.AnonymousClass0Bo) r2.getLayoutParams()).A0A instanceof com.google.android.material.transformation.FabTransformationScrimBehavior) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(android.view.View r7, android.view.View r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            android.view.ViewParent r5 = r8.getParent()
            boolean r0 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 == 0) goto L_0x0066
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r4 = r5.getChildCount()
            if (r9 == 0) goto L_0x0017
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r4)
            r6.A00 = r0
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x0061
            android.view.View r2 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof X.AnonymousClass0Bo
            if (r0 == 0) goto L_0x0033
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            X.06y r0 = r0.A0A
            boolean r1 = r0 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r2 == r8) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            java.util.Map r1 = r6.A00
            if (r9 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x0051
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0051
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r2)
            int r0 = X.AnonymousClass000.A0D(r0)
        L_0x004e:
            X.C004601z.A0d(r2, r0)
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0054:
            int r0 = r2.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            r0 = 4
            goto L_0x004e
        L_0x0061:
            if (r9 != 0) goto L_0x0066
            r0 = 0
            r6.A00 = r0
        L_0x0066:
            boolean r0 = super.A0I(r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationSheetBehavior.A0I(android.view.View, android.view.View, boolean, boolean):boolean");
    }
}
