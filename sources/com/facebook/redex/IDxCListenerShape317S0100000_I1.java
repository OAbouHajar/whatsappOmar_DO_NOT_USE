package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape317S0100000_I1 implements View.OnAttachStateChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape317S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onViewAttachedToWindow(View view) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r2.removeGlobalOnLayoutListener(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewDetachedFromWindow(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            X.0Pd r0 = (X.C05070Pd) r0
            X.0X5 r0 = r0.A00
            r0.A07()
        L_0x000e:
            r4.removeOnAttachStateChangeListener(r3)
            return
        L_0x0012:
            java.lang.Object r1 = r3.A00
            X.0Cy r1 = (X.C02570Cy) r1
            android.view.ViewTreeObserver r0 = r1.A07
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x0026
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r1.A07 = r0
        L_0x0026:
            android.view.ViewTreeObserver r2 = r1.A07
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r1.A0L
            goto L_0x0043
        L_0x002b:
            java.lang.Object r1 = r3.A00
            X.0Cz r1 = (X.AnonymousClass0Cz) r1
            android.view.ViewTreeObserver r0 = r1.A04
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x003f
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r1.A04 = r0
        L_0x003f:
            android.view.ViewTreeObserver r2 = r1.A04
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r1.A0F
        L_0x0043:
            r2.removeGlobalOnLayoutListener(r0)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape317S0100000_I1.onViewDetachedFromWindow(android.view.View):void");
    }
}
