package X;

import android.view.View;

/* renamed from: X.4n2  reason: invalid class name */
public class AnonymousClass4n2 implements C12900l9 {
    public final C86794Ue A00;
    public final C62143Bu A01;
    public final C31201dg A02;
    public final boolean A03;

    public AnonymousClass4n2(C86794Ue r1, C62143Bu r2, C31201dg r3, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z2;
    }

    public static int A00(float f2, float f3) {
        int round;
        int i2;
        if (f2 == f3) {
            round = Math.round(f2);
            i2 = 1073741824;
        } else if (Float.isNaN(f3)) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            round = Math.round(f3);
            i2 = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(round, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (java.lang.Float.isNaN(r7) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (java.lang.Float.isNaN(r2) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.A01 == 13320) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.flexlayout.layoutoutput.MeasureOutput ALX(float r12, float r13, float r14, float r15, float r16, float r17) {
        /*
            r11 = this;
            X.1dg r3 = r11.A02
            if (r3 == 0) goto L_0x0102
            r4 = r3
            int r1 = r3.A01
            r0 = 13320(0x3408, float:1.8665E-41)
            if (r1 != r0) goto L_0x0102
        L_0x000b:
            r2 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1V(r4)
            X.1dg r5 = X.C62143Bu.A02(r3)
            r4 = 0
            if (r0 != 0) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            r0 = 61
            float r10 = X.C62143Bu.A01(r5, r0)
            r0 = 57
            float r9 = X.C62143Bu.A01(r5, r0)
            r0 = 58
            float r8 = X.C62143Bu.A01(r5, r0)
            r0 = 55
            float r7 = X.C62143Bu.A01(r5, r0)
            r0 = 59
            float r6 = X.C62143Bu.A01(r5, r0)
            r0 = 56
            float r5 = X.C62143Bu.A01(r5, r0)
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L_0x00ed
        L_0x0062:
            r5 = 2143289344(0x7fc00000, float:NaN)
            if (r4 != 0) goto L_0x008c
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x006e
            r13 = r16
        L_0x006e:
            X.4Ue r2 = r11.A00
            int r1 = A00(r12, r13)
            int r0 = A00(r14, r15)
            X.5TP r3 = r3.A0D(r2, r1, r0)
            int r0 = r3.getWidth()
            float r2 = (float) r0
            int r0 = r3.getHeight()
        L_0x0085:
            float r1 = (float) r0
            com.facebook.flexlayout.layoutoutput.MeasureOutput r0 = new com.facebook.flexlayout.layoutoutput.MeasureOutput
            r0.<init>(r2, r1, r5, r3)
            return r0
        L_0x008c:
            boolean r6 = r11.A03
            if (r6 != 0) goto L_0x00e8
            r0 = 5
            r7 = r4[r0]
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 != 0) goto L_0x00e8
        L_0x0099:
            int r8 = java.lang.Math.round(r7)
            if (r6 == 0) goto L_0x00e2
            r0 = 5
            r2 = r4[r0]
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L_0x00e2
        L_0x00a8:
            int r0 = java.lang.Math.round(r2)
            int r8 = r8 + r0
            float r0 = X.AnonymousClass3K3.A03(r4, r1)
            int r7 = java.lang.Math.round(r0)
            r0 = 3
            float r0 = X.AnonymousClass3K3.A03(r4, r0)
            int r0 = java.lang.Math.round(r0)
            int r7 = r7 + r0
            X.4Ue r2 = r11.A00
            float r0 = (float) r8
            float r12 = r12 - r0
            float r13 = r13 - r0
            int r1 = A00(r12, r13)
            float r0 = (float) r7
            float r14 = r14 - r0
            float r15 = r15 - r0
            int r0 = A00(r14, r15)
            X.5TP r0 = r3.A0D(r2, r1, r0)
            X.4nJ r3 = new X.4nJ
            r3.<init>(r0, r4, r6)
            int r0 = r3.getWidth()
            float r2 = (float) r0
            int r0 = r3.getHeight()
            goto L_0x0085
        L_0x00e2:
            r0 = 2
            float r2 = X.AnonymousClass3K3.A03(r4, r0)
            goto L_0x00a8
        L_0x00e8:
            float r7 = X.AnonymousClass3K3.A03(r4, r2)
            goto L_0x0099
        L_0x00ed:
            r0 = 6
            float[] r4 = new float[r0]
            r4[r1] = r10
            r4[r2] = r9
            r0 = 2
            r4[r0] = r8
            r0 = 3
            r4[r0] = r7
            r0 = 4
            r4[r0] = r6
            r0 = 5
            r4[r0] = r5
            goto L_0x0062
        L_0x0102:
            r4 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4n2.ALX(float, float, float, float, float, float):com.facebook.flexlayout.layoutoutput.MeasureOutput");
    }
}
