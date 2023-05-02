package X;

/* renamed from: X.2Rb  reason: invalid class name and case insensitive filesystem */
public class C49102Rb {
    public C109365Rv A00;
    public AnonymousClass32x A01;
    public boolean A02 = false;
    public final float A03;
    public final C455929m A04;
    public final AnonymousClass397 A05;
    public final C455729k A06;
    public final C88254aC A07;

    public C49102Rb(C455929m r3, AnonymousClass397 r4, C455729k r5, C88254aC r6, float f2) {
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = f2;
        this.A07 = r6;
        for (AnonymousClass32x A0R : r5.A01()) {
            A0R.A0R(r6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r2 != 6) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(android.view.MotionEvent r13, float r14, int r15, boolean r16) {
        /*
            r12 = this;
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r2 = r13.getActionMasked()
            r1 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 == r1) goto L_0x0047
            r0 = 2
            if (r2 == r0) goto L_0x001c
            r0 = 3
            if (r2 == r0) goto L_0x0047
            r0 = 5
            if (r2 == r0) goto L_0x0071
            r0 = 6
            if (r2 == r0) goto L_0x0047
        L_0x001b:
            return r1
        L_0x001c:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x001b
            X.32x r0 = r12.A01
            if (r0 == 0) goto L_0x001b
            int r7 = r13.getHistorySize()
            r6 = 0
        L_0x0029:
            if (r6 >= r7) goto L_0x00f2
            X.32x r5 = r12.A01
            X.397 r3 = r12.A05
            float r2 = r13.getHistoricalX(r6)
            float r0 = r13.getHistoricalY(r6)
            android.graphics.PointF r4 = r3.A00(r2, r0)
            long r2 = r13.getHistoricalEventTime(r6)
            X.3Ag r0 = r5.A03
            r0.A04(r4, r2)
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0047:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0069
            X.32x r5 = r12.A01
            if (r5 == 0) goto L_0x0069
            X.397 r3 = r12.A05
            float r2 = r13.getX()
            float r0 = r13.getY()
            android.graphics.PointF r4 = r3.A00(r2, r0)
            long r2 = r13.getEventTime()
            X.3Ag r0 = r5.A03
            r0.A03(r4, r2)
            r0 = 0
            r12.A01 = r0
        L_0x0069:
            X.5Rv r0 = r12.A00
            if (r0 == 0) goto L_0x001b
            r0.AQ0()
            return r1
        L_0x0071:
            float r0 = r12.A03
            X.32x r2 = new X.32x
            r2.<init>(r0)
            r12.A01 = r2
            X.4aC r0 = r12.A07
            r2.A0R(r0)
            r2.A09(r15)
            X.32x r0 = r12.A01
            r0.A0O(r14)
            X.32x r5 = r12.A01
            X.29m r4 = r12.A04
            if (r16 == 0) goto L_0x00e8
            android.graphics.Bitmap r0 = r4.A05
            if (r0 != 0) goto L_0x0094
            r4.A03(r1)
        L_0x0094:
            android.graphics.Bitmap r3 = r4.A05
        L_0x0096:
            android.graphics.PointF r2 = r4.A0D
            int r0 = r4.A00
            r5.A01 = r3
            r5.A02 = r2
            r5.A00 = r0
            X.32x r0 = r12.A01
            X.397 r4 = r12.A05
            float r3 = r13.getX()
            float r2 = r13.getY()
            android.graphics.PointF r5 = r4.A00(r3, r2)
            long r10 = r13.getEventTime()
            android.graphics.Bitmap r3 = r0.A01
            android.graphics.PointF r6 = r0.A02
            int r9 = r0.A00
            android.graphics.Paint r4 = r0.A01
            if (r16 == 0) goto L_0x00da
            float r8 = r0.A02()
            X.4aC r7 = r0.A04
            X.333 r2 = new X.333
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.A03 = r2
        L_0x00cb:
            X.32x r2 = r12.A01
            X.29k r0 = r12.A06
            r0.A03(r2)
            X.5Rv r0 = r12.A00
            if (r0 == 0) goto L_0x001b
            r0.APz()
            return r1
        L_0x00da:
            float r7 = r0.A02()
            float r8 = r0.A06
            X.3uu r2 = new X.3uu
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.A03 = r2
            goto L_0x00cb
        L_0x00e8:
            android.graphics.Bitmap r0 = r4.A06
            if (r0 != 0) goto L_0x00ef
            r4.A04(r1)
        L_0x00ef:
            android.graphics.Bitmap r3 = r4.A06
            goto L_0x0096
        L_0x00f2:
            X.397 r3 = r12.A05
            float r2 = r13.getX()
            float r0 = r13.getY()
            android.graphics.PointF r4 = r3.A00(r2, r0)
            X.32x r0 = r12.A01
            long r2 = r13.getEventTime()
            X.3Ag r0 = r0.A03
            r0.A04(r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49102Rb.A00(android.view.MotionEvent, float, int, boolean):boolean");
    }
}
