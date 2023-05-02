package com.facebook.redex;

import X.C016507v;

public class IDxIListenerShape216S0100000_I0 implements C016507v {
    public Object A00;
    public final int A01;

    public IDxIListenerShape216S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r8.A06() <= 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass030 AMY(android.view.View r7, X.AnonymousClass030 r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            if (r0 == 0) goto L_0x005c
            java.lang.Object r5 = r6.A00
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r5
            X.030 r0 = r5.A06
            boolean r0 = X.AnonymousClass08I.A01(r0, r8)
            if (r0 != 0) goto L_0x0056
            r5.A06 = r8
            r2 = 1
            if (r8 == 0) goto L_0x001c
            int r1 = r8.A06()
            r0 = 1
            if (r1 > 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r5.A08 = r0
            if (r0 != 0) goto L_0x005a
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x005a
        L_0x0027:
            r5.setWillNotDraw(r2)
            X.0VF r4 = r8.A00
            boolean r0 = r4.A09()
            if (r0 != 0) goto L_0x0053
            r3 = 0
            int r2 = r5.getChildCount()
        L_0x0037:
            if (r3 >= r2) goto L_0x0053
            android.view.View r1 = r5.getChildAt(r3)
            boolean r0 = r1.getFitsSystemWindows()
            if (r0 == 0) goto L_0x0057
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            X.06y r0 = r0.A0A
            if (r0 == 0) goto L_0x0057
            boolean r0 = r4.A09()
            if (r0 == 0) goto L_0x0057
        L_0x0053:
            r5.requestLayout()
        L_0x0056:
            return r8
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x005a:
            r2 = 0
            goto L_0x0027
        L_0x005c:
            int r2 = r8.A06()
            java.lang.Object r1 = r6.A00
            X.06G r1 = (X.AnonymousClass06G) r1
            r0 = 0
            int r3 = r1.A0J(r0, r8)
            if (r2 == r3) goto L_0x007b
            int r2 = r8.A04()
            int r1 = r8.A05()
            int r0 = r8.A03()
            X.030 r8 = r8.A08(r2, r3, r1, r0)
        L_0x007b:
            X.030 r8 = X.C004601z.A0K(r7, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxIListenerShape216S0100000_I0.AMY(android.view.View, X.030):X.030");
    }
}
