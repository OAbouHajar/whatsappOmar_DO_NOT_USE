package X;

import android.view.View;

/* renamed from: X.5h4  reason: invalid class name and case insensitive filesystem */
public final class C111615h4 extends C25881Lm {
    public C111615h4() {
        super(13538);
    }

    public /* bridge */ /* synthetic */ Object A00(C14990q7 r2, C31201dg r3) {
        return new C116995sH();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r2 == 8) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.View r7, X.C14990q7 r8, X.C31201dg r9, X.C31201dg r10) {
        /*
            r6 = this;
            r0 = 35
            X.0q1 r5 = r9.A0H(r0)
            r0 = 36
            X.0q1 r4 = r9.A0H(r0)
            if (r5 != 0) goto L_0x0011
            if (r4 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.Object r2 = X.C62183Bz.A05(r8, r9)
            X.5sH r2 = (X.C116995sH) r2
            r0 = 38
            java.lang.String r1 = r9.A0J(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A02
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0038
            X.5sa r1 = new X.5sa
            r1.<init>(r8, r10, r5, r4)
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r0.add(r1)
            java.lang.String r0 = "register"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x0038:
            X.5yt r3 = r2.A01
            r3.A02 = r10
            r3.A00 = r7
            r3.A01 = r8
            r3.A05 = r1
            r3.A03 = r5
            r3.A04 = r4
            android.view.ViewTreeObserver r0 = r7.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x005f
            int r2 = r7.getVisibility()
            r0 = 4
            if (r2 == r0) goto L_0x005f
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            r3.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111615h4.A01(android.view.View, X.0q7, X.1dg, X.1dg):void");
    }

    public void A02(View view, C14990q7 r5, C31201dg r6, C31201dg r7) {
        int visibility;
        C14930q1 A0H = r6.A0H(35);
        C14930q1 A0H2 = r6.A0H(36);
        if (A0H != null || A0H2 != null) {
            C116995sH r1 = (C116995sH) C62183Bz.A05(r5, r6);
            r6.A0J(38);
            if (r1.A02.get()) {
                throw AnonymousClass000.A0W("register");
            }
            C119695yt r2 = r1.A01;
            View view2 = r2.A00;
            if (view2 != null) {
                if (r2.A06 && (view2.getParent() == null || (visibility = view2.getVisibility()) == 4 || visibility == 8)) {
                    r2.A00();
                }
                r2.A00.getViewTreeObserver().removeOnGlobalLayoutListener(r2);
                r2.A00 = null;
                r2.A01 = null;
                r2.A03 = null;
                r2.A04 = null;
                r2.A06 = false;
            }
        }
    }
}
