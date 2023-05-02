package X;

import android.view.Choreographer;

/* renamed from: X.4jr  reason: invalid class name and case insensitive filesystem */
public class C93844jr implements Choreographer.FrameCallback {
    public final /* synthetic */ C85024Mu A00;

    public C93844jr(C85024Mu r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0172, code lost:
        if (r8 > r0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017a, code lost:
        if (r8 < r0) goto L_0x017c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r46) {
        /*
            r45 = this;
            r0 = r45
            X.4Mu r0 = r0.A00
            r44 = r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0211
            r0 = r44
            X.4bO r0 = r0.A01
            r39 = r0
            if (r0 == 0) goto L_0x0211
            long r14 = android.os.SystemClock.uptimeMillis()
            r0 = r44
            long r0 = r0.A00
            long r2 = r14 - r0
            double r0 = (double) r2
            r16 = r0
            r0 = r39
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r43 = r0
            java.util.Iterator r1 = r43.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0039
            r1.next()
            java.lang.String r0 = "onBeforeIntegrate"
        L_0x0034:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x0039:
            r0 = r39
            java.util.Set r0 = r0.A03
            r42 = r0
            java.util.Iterator r38 = r42.iterator()
        L_0x0043:
            boolean r0 = r38.hasNext()
            if (r0 == 0) goto L_0x01d6
            java.lang.Object r37 = r38.next()
            r0 = r37
            X.4X6 r0 = (X.AnonymousClass4X6) r0
            r37 = r0
            boolean r36 = r37.A04()
            if (r36 == 0) goto L_0x0065
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0065
            r1 = r42
            r0 = r37
            r1.remove(r0)
            goto L_0x0043
        L_0x0065:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r16 / r0
            if (r36 == 0) goto L_0x0075
            r0 = r37
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0075
            goto L_0x0043
        L_0x0075:
            r2 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            r2 = r4
        L_0x007f:
            r0 = r37
            double r0 = r0.A02
            double r34 = r0 + r2
            r1 = r34
            r0 = r37
            r0.A02 = r1
            X.4Zg r0 = r0.A03
            double r10 = r0.A01
            double r12 = r0.A00
            r0 = r37
            X.4Fz r0 = r0.A07
            r41 = r0
            double r8 = r0.A00
            double r6 = r0.A01
            r0 = r37
            X.4Fz r0 = r0.A09
            r40 = r0
            double r4 = r0.A00
            double r2 = r0.A01
        L_0x00a5:
            r32 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r34 > r32 ? 1 : (r34 == r32 ? 0 : -1))
            if (r0 < 0) goto L_0x0125
            double r34 = r34 - r32
            r0 = r34
            r2 = r37
            r2.A02 = r0
            int r0 = (r34 > r32 ? 1 : (r34 == r32 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            X.4Fz r0 = r2.A08
            r0.A00 = r8
            r0.A01 = r6
        L_0x00c0:
            double r0 = r2.A00
            double r30 = r0 - r4
            double r30 = r30 * r10
            double r2 = r12 * r6
            double r30 = r30 - r2
            double r4 = r6 * r32
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r18
            double r4 = r4 + r8
            double r2 = r30 * r32
            double r2 = r2 * r18
            double r28 = r6 + r2
            double r26 = r0 - r4
            double r26 = r26 * r10
            double r2 = r12 * r28
            double r26 = r26 - r2
            double r2 = r28 * r32
            double r2 = r2 * r18
            double r4 = r8 + r2
            double r2 = r26 * r32
            double r2 = r2 * r18
            double r20 = r6 + r2
            double r24 = r0 - r4
            double r24 = r24 * r10
            double r2 = r12 * r20
            double r24 = r24 - r2
            double r2 = r20 * r32
            double r4 = r8 + r2
            double r18 = r24 * r32
            double r2 = r6 + r18
            double r0 = r0 - r4
            double r0 = r0 * r10
            double r18 = r12 * r2
            double r0 = r0 - r18
            double r28 = r28 + r20
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r28 = r28 * r22
            double r20 = r6 + r28
            double r20 = r20 + r2
            r18 = 4595172819793696085(0x3fc5555555555555, double:0.16666666666666666)
            double r20 = r20 * r18
            double r26 = r26 + r24
            double r26 = r26 * r22
            double r30 = r30 + r26
            double r30 = r30 + r0
            double r30 = r30 * r18
            double r20 = r20 * r32
            double r8 = r8 + r20
            double r30 = r30 * r32
            double r6 = r6 + r30
            goto L_0x00a5
        L_0x0125:
            r0 = r40
            r0.A00 = r4
            r0.A01 = r2
            r0 = r41
            r0.A00 = r8
            r0.A01 = r6
            r4 = 0
            int r0 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0155
            double r34 = r34 / r32
            double r8 = r8 * r34
            r0 = r37
            X.4Fz r12 = r0.A08
            double r0 = r12.A00
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r34
            double r0 = r0 * r2
            double r8 = r8 + r0
            r0 = r41
            r0.A00 = r8
            double r6 = r6 * r34
            double r0 = r12.A01
            double r0 = r0 * r2
            double r6 = r6 + r0
            r0 = r41
            r0.A01 = r6
        L_0x0155:
            boolean r0 = r37.A04()
            r12 = 1
            if (r0 != 0) goto L_0x017c
            r0 = r37
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x019d
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x019d
            r0 = r37
            double r2 = r0.A01
            double r0 = r0.A00
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0174
            int r13 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x017c
        L_0x0174:
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x019d
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x019d
        L_0x017c:
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cf
            r0 = r37
            double r1 = r0.A00
            r0.A01 = r1
            r0 = r41
            r0.A00 = r1
        L_0x018a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x019b
            r0 = r41
            r0.A01 = r4
            r0 = r37
            X.4bO r1 = r0.A0A
            java.lang.String r0 = r0.A0B
            r1.A02(r0)
        L_0x019b:
            r36 = 1
        L_0x019d:
            r0 = r37
            boolean r0 = r0.A06
            r1 = 0
            if (r0 == 0) goto L_0x01a8
            r0 = r37
            r0.A06 = r1
        L_0x01a8:
            if (r36 == 0) goto L_0x01cd
            r0 = r37
            r0.A06 = r12
        L_0x01ae:
            r0 = r37
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x01b6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r2.next()
            X.5R7 r1 = (X.AnonymousClass5R7) r1
            r0 = r37
            r1.AXO(r0)
            if (r12 == 0) goto L_0x01b6
            r1.AXN(r0)
            goto L_0x01b6
        L_0x01cd:
            r12 = 0
            goto L_0x01ae
        L_0x01cf:
            r0 = r37
            r0.A00 = r8
            r0.A01 = r8
            goto L_0x018a
        L_0x01d6:
            boolean r0 = r42.isEmpty()
            if (r0 == 0) goto L_0x01e1
            r1 = 1
            r0 = r39
            r0.A00 = r1
        L_0x01e1:
            java.util.Iterator r1 = r43.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01f2
            r1.next()
            java.lang.String r0 = "onAfterIntegrate"
            goto L_0x0034
        L_0x01f2:
            r0 = r39
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0206
            r0 = r39
            X.4Mu r2 = r0.A01
            r0 = 0
            r2.A02 = r0
            android.view.Choreographer r1 = r2.A04
            android.view.Choreographer$FrameCallback r0 = r2.A03
            r1.removeFrameCallback(r0)
        L_0x0206:
            r0 = r44
            r0.A00 = r14
            android.view.Choreographer r1 = r0.A04
            android.view.Choreographer$FrameCallback r0 = r0.A03
            r1.postFrameCallback(r0)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93844jr.doFrame(long):void");
    }
}
