package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.0Yo  reason: invalid class name and case insensitive filesystem */
public class C06950Yo implements View.OnTouchListener {
    public C04620Ng A00;
    public final float A01;
    public final C14990q7 A02;
    public final C31201dg A03;
    public final C31201dg A04;

    public C06950Yo(C14990q7 r2, C31201dg r3, C31201dg r4) {
        this.A04 = r3;
        this.A02 = r2;
        this.A03 = r4;
        this.A00 = (C04620Ng) C62183Bz.A05(r2, r3);
        this.A01 = (float) ViewConfiguration.get(r2.A00()).getScaledTouchSlop();
    }

    public static final boolean A00(View view, float f2, float f3, float f4) {
        C18450wi.A0H(view, 0);
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    public final void A01() {
        C31201dg r4 = this.A04;
        C14930q1 A0H = r4.A0H(35);
        if (A0H != null) {
            C14940q2 r2 = new C14940q2();
            r2.A03(this.A03, 0);
            C14990q7 r1 = this.A02;
            r2.A03(r1, 1);
            C29701b3.A01(r1, r4, r2.A01(), A0H);
        }
    }

    public final void A02() {
        C31201dg r4 = this.A04;
        C14930q1 A0H = r4.A0H(38);
        if (A0H != null) {
            C14940q2 r2 = new C14940q2();
            r2.A03(this.A03, 0);
            C14990q7 r1 = this.A02;
            r2.A03(r1, 1);
            C29701b3.A01(r1, r4, r2.A01(), A0H);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r5.A00.A00 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r1 = r7.getAction()
            r3 = 0
            if (r1 == 0) goto L_0x0015
            r0 = 1
            if (r1 == r0) goto L_0x0044
            r0 = 3
            if (r1 == r0) goto L_0x0062
            r0 = 4
            if (r1 == r0) goto L_0x0062
        L_0x0010:
            X.0Ng r0 = r5.A00
            boolean r0 = r0.A00
            return r0
        L_0x0015:
            X.1dg r4 = r5.A04
            r0 = 36
            X.0q1 r2 = r4.A0H(r0)
            if (r2 != 0) goto L_0x0020
            return r3
        L_0x0020:
            X.0q2 r1 = new X.0q2
            r1.<init>()
            X.1dg r0 = r5.A03
            r1.A03(r0, r3)
            X.0q3 r1 = r1.A01()
            X.0q7 r0 = r5.A02
            java.lang.Object r2 = X.C29701b3.A01(r0, r4, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x006c
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.C29691b2.A00(r1, r0)
            goto L_0x005d
        L_0x0044:
            X.0Ng r0 = r5.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            float r2 = r7.getX()
            float r1 = r7.getY()
            float r0 = r5.A01
            boolean r0 = A00(r6, r2, r1, r0)
            if (r0 == 0) goto L_0x0068
            r5.A02()
        L_0x005d:
            X.0Ng r0 = r5.A00
            r0.A00 = r3
            goto L_0x0010
        L_0x0062:
            X.0Ng r0 = r5.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
        L_0x0068:
            r5.A01()
            goto L_0x005d
        L_0x006c:
            X.0Ng r1 = r5.A00
            boolean r0 = X.C89554cQ.A02(r2)
            r1.A00 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06950Yo.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
