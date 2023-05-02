package X;

import com.whatsapp.util.Log;

/* renamed from: X.1rK  reason: invalid class name and case insensitive filesystem */
public abstract class C38731rK extends C16730tY {
    public C38731rK(C16750ta r1, C28381Vw r2, C16730tY r3, byte b2, long j2, boolean z2) {
        super(r1, r2, r3, b2, j2, z2);
    }

    public C38731rK(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public C38731rK(C445524n r1, C28381Vw r2, byte b2, long j2, boolean z2, boolean z3) {
        super(r2, b2, j2);
        A1C(r1, z2, z3);
    }

    public C16870tm A0F() {
        C16870tm A0F = super.A0F();
        AnonymousClass00B.A06(A0F);
        return A0F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r15 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (android.text.TextUtils.isEmpty(r10.A06) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0263, code lost:
        if (r10.A00 > 0) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C69593fI A19(X.C69593fI r11, X.AnonymousClass1WV r12, X.AnonymousClass1GC r13, byte[] r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            X.0ta r5 = r10.A02
            X.0tm r9 = r10.A0F()
            if (r5 == 0) goto L_0x029f
            if (r15 != 0) goto L_0x000e
            byte[] r0 = r5.A0U
            if (r0 == 0) goto L_0x029f
        L_0x000e:
            java.lang.String r3 = r10.A08
            if (r3 == 0) goto L_0x0267
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0267
            r11.A03()
            X.1Wm r2 = r11.A00
            X.24n r2 = (X.C445524n) r2
            int r1 = r2.A00
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A0J = r3
            if (r15 == 0) goto L_0x0035
        L_0x002d:
            java.lang.String r0 = r10.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0046
        L_0x0035:
            java.lang.String r2 = r10.A06
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A0I = r2
        L_0x0046:
            r4 = 0
            if (r15 == 0) goto L_0x0051
            java.lang.String r0 = r10.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006b
        L_0x0051:
            java.lang.String r0 = r10.A05
            byte[] r1 = android.util.Base64.decode(r0, r4)
            int r0 = r1.length
            X.1Ww r2 = X.C28631Ww.A01(r1, r4, r0)
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A08 = r2
        L_0x006b:
            java.lang.String r0 = r10.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r10.A04
            byte[] r1 = android.util.Base64.decode(r0, r4)
            int r0 = r1.length
            X.1Ww r2 = X.C28631Ww.A01(r1, r4, r0)
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.A00 = r0
            r1.A07 = r2
        L_0x008d:
            r6 = 0
            if (r15 == 0) goto L_0x0097
            long r0 = r10.A01
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0261
        L_0x0097:
            long r0 = r10.A01
            r11.A03()
            X.1Wm r3 = r11.A00
            X.24n r3 = (X.C445524n) r3
            int r2 = r3.A00
            r2 = r2 | 8
            r3.A00 = r2
            r3.A05 = r0
            if (r15 != 0) goto L_0x0261
            long r0 = r10.A01
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x00cb
            java.lang.String r3 = "FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "; message.key="
            r2.append(r0)
            X.1Vw r0 = r10.A11
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00cb:
            int r2 = r10.A00
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 16
            r1.A00 = r0
            r1.A03 = r2
        L_0x00dc:
            java.lang.String r2 = r10.A13()
            if (r2 == 0) goto L_0x00f1
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
            r1.A0G = r2
        L_0x00f1:
            if (r15 == 0) goto L_0x00f7
            byte[] r0 = r5.A0U
            if (r0 == 0) goto L_0x010d
        L_0x00f7:
            byte[] r1 = r5.A0U
            int r0 = r1.length
            X.1Ww r2 = X.C28631Ww.A01(r1, r4, r0)
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            r1.A0A = r2
        L_0x010d:
            long r0 = r5.A0B
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0125
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r11.A03()
            X.1Wm r3 = r11.A00
            X.24n r3 = (X.C445524n) r3
            int r2 = r3.A00
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r3.A00 = r2
            r3.A06 = r0
        L_0x0125:
            X.1cv r7 = r10.A0U
            r6 = 1
            if (r7 == 0) goto L_0x0192
            java.lang.String r0 = r7.A04
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = r7.A07
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x0192
            byte[] r1 = r7.A09
            byte[] r0 = r5.A0U
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0192
            long r2 = r7.A02
            long r0 = r5.A0B
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0192
            boolean r6 = r7.A0B
            java.lang.String r3 = r7.A04
            r11.A03()
            X.1Wm r2 = r11.A00
            X.24n r2 = (X.C445524n) r2
            int r1 = r2.A00
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A0K = r3
            java.lang.String r0 = r7.A07
            byte[] r1 = android.util.Base64.decode(r0, r4)
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r4, r0)
            r11.A03()
            X.1Wm r2 = r11.A00
            X.24n r2 = (X.C445524n) r2
            int r1 = r2.A00
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A0D = r3
            java.lang.String r0 = r7.A05
            byte[] r1 = android.util.Base64.decode(r0, r4)
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r4, r0)
            r11.A03()
            X.1Wm r2 = r11.A00
            X.24n r2 = (X.C445524n) r2
            int r1 = r2.A00
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A0C = r3
        L_0x0192:
            r2 = r16
            if (r16 != 0) goto L_0x024c
            byte[] r0 = r9.A07()
            if (r0 == 0) goto L_0x024c
            if (r6 == 0) goto L_0x024c
            byte[] r1 = r9.A07()
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r4, r0)
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.A00 = r0
            r1.A09 = r3
        L_0x01b6:
            boolean r0 = X.C41071vB.A0O(r12, r10, r14)
            if (r0 == 0) goto L_0x01cf
            X.21S r0 = r13.A00(r12, r10, r14, r2)
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            r1.A0F = r0
            int r0 = r1.A00
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.A00 = r0
        L_0x01cf:
            int r2 = r5.A06
            if (r2 <= 0) goto L_0x01f7
            int r0 = r5.A08
            if (r0 <= 0) goto L_0x01f7
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            r1.A02 = r2
            int r2 = r5.A08
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A00 = r0
            r1.A04 = r2
        L_0x01f7:
            java.lang.String r0 = r5.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x022e
            java.lang.String r2 = r5.A0G
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.A00 = r0
            r1.A0H = r2
        L_0x0210:
            java.util.List r3 = X.C41071vB.A0L(r5)
            r11.A03()
            X.1Wm r2 = r11.A00
            X.24n r2 = (X.C445524n) r2
            X.1XE r1 = r2.A0E
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x022a
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A0E = r1
        L_0x022a:
            X.C28591Ws.A01(r3, r1)
            return r11
        L_0x022e:
            java.lang.String r0 = "FMessageVideoCommon/message without direct path received; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r10.A11
            r1.append(r0)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.0rv r0 = r10.A0M
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0210
        L_0x024c:
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r10.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01b6
        L_0x0261:
            int r0 = r10.A00
            if (r0 <= 0) goto L_0x00dc
            goto L_0x00cb
        L_0x0267:
            if (r15 == 0) goto L_0x0271
            java.lang.String r0 = r10.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
        L_0x0271:
            r11.A03()
            X.1Wm r1 = r11.A00
            X.24n r1 = (X.C445524n) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A0L = r3
            if (r15 != 0) goto L_0x002d
            java.lang.String r0 = r10.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with url not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r10.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0035
        L_0x029f:
            java.lang.String r0 = "FMessageVideoCommon/unable to send encrypted media message due to missing mediaKey; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r10.A11
            r1.append(r0)
            java.lang.String r0 = "; media_wa_type="
            r1.append(r0)
            byte r0 = r10.A10
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38731rK.A19(X.3fI, X.1WV, X.1GC, byte[], boolean, boolean):X.3fI");
    }

    public void A1A(C69593fI r10, AnonymousClass21Q r11, AnonymousClass1GC r12) {
        boolean z2 = r11.A09;
        C69593fI A19 = A19(r10, r11.A05, r12, r11.A0A, z2, r11.A07);
        C16750ta r0 = this.A02;
        if (r0 == null || ((!z2 && r0.A0U == null) || A19 == null)) {
            StringBuilder sb = new StringBuilder("FMessageVideo/unable to send encrypted media message due to missing; media_wa_type=");
            sb.append(this.A10);
            Log.w(sb.toString());
            return;
        }
        C42591y4 A12 = A12();
        AnonymousClass00B.A06(A12);
        byte[] A05 = A12.A05();
        if (A05 != null) {
            C28631Ww A01 = C28631Ww.A01(A05, 0, A05.length);
            A19.A03();
            C445524n r2 = (C445524n) A19.A00;
            r2.A00 |= 32768;
            r2.A0B = A01;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1B(X.C445524n r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C38801rR
            if (r0 == 0) goto L_0x004e
            X.0ta r4 = r5.A02
            X.AnonymousClass00B.A06(r4)
            int r2 = r6.A00
            r1 = 32
            r0 = r2 & 32
            if (r0 != r1) goto L_0x0047
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r0
            if (r2 != r0) goto L_0x0044
            int[] r3 = X.C818049u.A00
            int r1 = r6.A01
            if (r1 == 0) goto L_0x004b
            r0 = 1
            if (r1 == r0) goto L_0x0048
            r0 = 2
            if (r1 != r0) goto L_0x004b
            X.42V r2 = X.AnonymousClass42V.A03
        L_0x0024:
            int r0 = r2.ordinal()
            r1 = r3[r0]
            r0 = 1
            if (r1 == r0) goto L_0x0045
            r0 = 2
            if (r1 == r0) goto L_0x0045
            r0 = 3
            if (r1 == r0) goto L_0x0044
            java.lang.String r1 = "MessageUtil/getGifAttribution/error: Unexpected gif attribution="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0044:
            r0 = 0
        L_0x0045:
            r4.A05 = r0
        L_0x0047:
            return
        L_0x0048:
            X.42V r2 = X.AnonymousClass42V.A01
            goto L_0x0024
        L_0x004b:
            X.42V r2 = X.AnonymousClass42V.A02
            goto L_0x0024
        L_0x004e:
            X.0ta r3 = r5.A02
            X.AnonymousClass00B.A06(r3)
            int r0 = r6.A00
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0075
            X.1Ww r0 = r6.A0B
            byte[] r2 = r0.A04()
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0075
            X.1y4 r1 = r5.A12()
            X.AnonymousClass00B.A06(r1)
            monitor-enter(r1)
            r0 = 0
            r1.A03(r2, r0)     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0074:
            monitor-exit(r1)
        L_0x0075:
            X.1XE r0 = r6.A0E
            X.C41071vB.A0M(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38731rK.A1B(X.24n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r13 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if ((r2 & 256) == 256) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r4.A08 = r12.A04;
        r4.A06 = r12.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1C(X.C445524n r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            X.0ta r4 = new X.0ta
            r4.<init>()
            r11.A02 = r4
            int r0 = r12.A00
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x00ff
            X.1Ww r0 = r12.A0A
            byte[] r0 = r0.A04()
            X.C42941yx.A00(r4, r11, r0)
        L_0x0018:
            int r2 = r12.A00
            r0 = 4096(0x1000, float:5.74E-42)
            r2 = r2 & r0
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = 0
            if (r2 != r1) goto L_0x0023
            r0 = 1
        L_0x0023:
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x002c
            long r0 = r12.A06
            long r0 = r0 * r9
            r4.A0B = r0
        L_0x002c:
            X.1Ww r0 = r12.A09
            byte[] r1 = r0.A04()
            int r0 = r1.length
            r6 = 1
            if (r0 <= 0) goto L_0x003f
            r11.A02 = r6
            X.0tm r0 = r11.A0F()
            r0.A03(r1, r14)
        L_0x003f:
            java.lang.String r5 = "; message.key="
            if (r13 == 0) goto L_0x004b
            int r0 = r12.A00
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x0057
        L_0x004b:
            long r2 = r12.A05
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0204
            r11.A01 = r2
            if (r13 == 0) goto L_0x0064
        L_0x0057:
            int r2 = r12.A00
            r1 = 512(0x200, float:7.175E-43)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x006c
            r0 = 256(0x100, float:3.59E-43)
            r2 = r2 & r0
            if (r2 != r0) goto L_0x006c
        L_0x0064:
            int r0 = r12.A04
            r4.A08 = r0
            int r0 = r12.A02
            r4.A06 = r0
        L_0x006c:
            r8 = 14
            java.lang.String r2 = "FMessageVideoCommon/bogus sha-256 hash received; length="
            r7 = 32
            r3 = 2
            if (r13 == 0) goto L_0x007c
            int r0 = r12.A00
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x008b
        L_0x007c:
            X.1Ww r0 = r12.A08
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 != r7) goto L_0x01e0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r11.A05 = r0
        L_0x008b:
            int r1 = r12.A00
            r0 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x00a1
            X.1Ww r0 = r12.A07
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 != r7) goto L_0x01bc
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r11.A04 = r0
        L_0x00a1:
            if (r13 == 0) goto L_0x00a9
            int r0 = r12.A00
            r0 = r0 & 2
            if (r0 != r3) goto L_0x0124
        L_0x00a9:
            java.lang.String r2 = r12.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "empty video mime type"
        L_0x00b3:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r12.A0I
            r1.append(r0)
            r1.append(r5)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0120
            java.lang.String r1 = "unrecognized video mime type; mimeType="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x00b3
        L_0x00ff:
            if (r13 != 0) goto L_0x0018
            java.lang.String r0 = "FMessageVideoCommon/missing media key; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x0120:
            java.lang.String r0 = r12.A0I
            r11.A06 = r0
        L_0x0124:
            int r2 = r12.A00
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x01b2
            java.lang.String r0 = r12.A0J
        L_0x012e:
            r11.A17(r0)
        L_0x0131:
            java.lang.String r0 = r12.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0143
            java.lang.String r1 = r12.A0G
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r0, r1)
            r11.A03 = r0
        L_0x0143:
            if (r13 == 0) goto L_0x01ad
            int r1 = r12.A00
            r0 = 2048(0x800, float:2.87E-42)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x01ad
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x015f:
            int r2 = r12.A00
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x01a3
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x01a3
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 != r0) goto L_0x01a3
            X.1cv r5 = new X.1cv
            r5.<init>()
            java.lang.String r0 = r12.A0K
            r5.A04 = r0
            X.1Ww r0 = r12.A0D
            byte[] r2 = r0.A04()
            X.1Ww r0 = r12.A0C
            byte[] r1 = r0.A04()
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r3)
            r5.A07 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r5.A05 = r0
            X.1Ww r0 = r12.A0A
            byte[] r0 = r0.A04()
            r5.A09 = r0
            long r0 = r12.A06
            long r0 = r0 * r9
            r5.A02 = r0
            r11.A0h(r5)
        L_0x01a3:
            int r0 = r12.A03
            r11.A00 = r0
            X.1XE r0 = r12.A0E
            X.C41071vB.A0M(r4, r0)
            return
        L_0x01ad:
            java.lang.String r0 = r12.A0H
            r4.A0G = r0
            goto L_0x015f
        L_0x01b2:
            if (r13 == 0) goto L_0x01b8
            r0 = r2 & 1
            if (r0 != r6) goto L_0x0131
        L_0x01b8:
            java.lang.String r0 = r12.A0L
            goto L_0x012e
        L_0x01bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r5)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x01e0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r5)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x0204:
            java.lang.String r0 = "FMessageVideoCommon/bogus media size received; file_length="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            r1.append(r5)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38731rK.A1C(X.24n, boolean, boolean):void");
    }
}
