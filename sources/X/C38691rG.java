package X;

/* renamed from: X.1rG  reason: invalid class name and case insensitive filesystem */
public abstract class C38691rG extends C16730tY {
    public C38691rG(C16750ta r1, C28381Vw r2, C38691rG r3, byte b2, long j2, boolean z2) {
        super(r1, r2, r3, b2, j2, z2);
    }

    public C38691rG(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public C16870tm A0F() {
        C16870tm A0F = super.A0F();
        AnonymousClass00B.A06(A0F);
        return A0F;
    }

    public C68803e1 A19(C68803e1 r6, AnonymousClass21Q r7, AnonymousClass1GC r8) {
        boolean z2 = r7.A09;
        boolean z3 = r7.A07;
        C68803e1 A1A = A1A(r6, z2, z3);
        if (A1A != null) {
            AnonymousClass1WV r2 = r7.A05;
            byte[] bArr = r7.A0A;
            if (C41071vB.A0O(r2, this, bArr)) {
                AnonymousClass21S A00 = r8.A00(r2, this, bArr, z3);
                A1A.A03();
                C445224k r1 = (C445224k) A1A.A00;
                r1.A0J = A00;
                r1.A00 |= 4096;
            }
        }
        return A1A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (r3.A0U == null) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C68803e1 A1A(X.C68803e1 r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            X.0ta r3 = r12.A02
            X.0tm r11 = r12.A0F()
            if (r3 == 0) goto L_0x02ef
            if (r14 != 0) goto L_0x000e
            byte[] r0 = r3.A0U
            if (r0 == 0) goto L_0x02ef
        L_0x000e:
            java.lang.String r4 = r12.A08
            if (r4 == 0) goto L_0x02b7
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x02b7
            r13.A03()
            X.1Wm r2 = r13.A00
            X.24k r2 = (X.C445224k) r2
            int r1 = r2.A00
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A0N = r4
        L_0x002b:
            java.lang.String r2 = r12.A06
            if (r2 != 0) goto L_0x0031
            java.lang.String r2 = "image/jpeg"
        L_0x0031:
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A0M = r2
            java.lang.String r2 = r12.A13()
            if (r2 == 0) goto L_0x0055
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A0K = r2
        L_0x0055:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            java.lang.String r0 = r12.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007a
        L_0x0060:
            java.lang.String r0 = r12.A05
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r4 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A08 = r4
        L_0x007a:
            java.lang.String r0 = r12.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r12.A04
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r4 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            r1.A07 = r4
        L_0x009c:
            java.lang.String r6 = "; message.key="
            r7 = 0
            if (r14 == 0) goto L_0x0283
            long r0 = r12.A01
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0283
            java.lang.String r5 = "FMessageImageCommon/buildE2eMessage/image media size not set, size="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r0)
            r4.append(r6)
            X.1Vw r0 = r12.A11
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00c1:
            byte[] r0 = r3.A0U
            if (r0 == 0) goto L_0x00db
        L_0x00c5:
            byte[] r1 = r3.A0U
            int r0 = r1.length
            X.1Ww r4 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A0B = r4
        L_0x00db:
            long r0 = r3.A0B
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f3
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            r13.A03()
            X.1Wm r5 = r13.A00
            X.24k r5 = (X.C445224k) r5
            int r4 = r5.A00
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r5.A00 = r4
            r5.A06 = r0
        L_0x00f3:
            int r4 = r3.A06
            if (r4 <= 0) goto L_0x011b
            int r0 = r3.A08
            if (r0 <= 0) goto L_0x011b
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            r1.A03 = r4
            int r4 = r3.A08
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
            r1.A04 = r4
        L_0x011b:
            java.lang.String r0 = r3.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026e
            java.lang.String r4 = r3.A0G
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A00 = r0
            r1.A0L = r4
        L_0x0134:
            X.1y4 r10 = r12.A12()
            r6 = 1
            if (r10 == 0) goto L_0x01ae
            byte[] r4 = r10.A05()
            int[] r9 = r10.A06()
            if (r9 == 0) goto L_0x01ae
            if (r4 == 0) goto L_0x01ae
            int r8 = r9.length
            r0 = 2
            if (r8 < r0) goto L_0x01ae
            int r1 = r4.length
            int r0 = r1 / 10
            if (r0 != r8) goto L_0x01ae
            X.1Ww r5 = X.C28631Ww.A01(r4, r2, r1)
            r13.A03()
            X.1Wm r4 = r13.A00
            X.24k r4 = (X.C445224k) r4
            int r1 = r4.A00
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r4.A00 = r1
            r4.A0E = r5
            r7 = 0
        L_0x0165:
            r5 = r9[r7]
            r13.A03()
            X.1Wm r4 = r13.A00
            X.24k r4 = (X.C445224k) r4
            X.27P r1 = r4.A0H
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x017d
            X.27P r1 = X.C28541Wm.A0F(r1)
            r4.A0H = r1
        L_0x017d:
            X.2sw r1 = (X.C58132sw) r1
            int r0 = r1.A00
            r1.A02(r0, r5)
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0165
            boolean r0 = r10.A05
            r6 = r6 ^ r0
            java.lang.String r0 = r3.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = r3.A0K
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r5 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r4 = r13.A00
            X.24k r4 = (X.C445224k) r4
            int r1 = r4.A00
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r4.A00 = r1
            r4.A0D = r5
        L_0x01ae:
            X.1cv r7 = r12.A0U
            if (r7 == 0) goto L_0x021a
            java.lang.String r0 = r7.A04
            if (r0 == 0) goto L_0x021a
            java.lang.String r0 = r7.A07
            if (r0 == 0) goto L_0x021a
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x021a
            byte[] r1 = r7.A09
            byte[] r0 = r3.A0U
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x021a
            long r4 = r7.A02
            long r0 = r3.A0B
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x021a
            boolean r6 = r7.A0B
            java.lang.String r5 = r7.A04
            r13.A03()
            X.1Wm r4 = r13.A00
            X.24k r4 = (X.C445224k) r4
            int r1 = r4.A00
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r4.A00 = r1
            r4.A0O = r5
            java.lang.String r0 = r7.A07
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r5 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r4 = r13.A00
            X.24k r4 = (X.C445224k) r4
            int r1 = r4.A00
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r4.A00 = r1
            r4.A0G = r5
            java.lang.String r0 = r7.A05
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r5 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r4 = r13.A00
            X.24k r4 = (X.C445224k) r4
            int r1 = r4.A00
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r4.A00 = r1
            r4.A0F = r5
        L_0x021a:
            if (r15 != 0) goto L_0x025a
            byte[] r0 = r11.A07()
            if (r0 == 0) goto L_0x025a
            if (r6 == 0) goto L_0x025a
            byte[] r1 = r11.A07()
            int r0 = r1.length
            X.1Ww r2 = X.C28631Ww.A01(r1, r2, r0)
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.A00 = r0
            r1.A0A = r2
        L_0x023c:
            java.util.List r3 = X.C41071vB.A0L(r3)
            r13.A03()
            X.1Wm r2 = r13.A00
            X.24k r2 = (X.C445224k) r2
            X.1XE r1 = r2.A0I
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0256
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A0I = r1
        L_0x0256:
            X.C28591Ws.A01(r3, r1)
            return r13
        L_0x025a:
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/image thumbnail missing; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r12.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x023c
        L_0x026e:
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with directPath not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r12.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0134
        L_0x0283:
            long r0 = r12.A01
            r13.A03()
            X.1Wm r5 = r13.A00
            X.24k r5 = (X.C445224k) r5
            int r4 = r5.A00
            r4 = r4 | 16
            r5.A00 = r4
            r5.A05 = r0
            if (r14 != 0) goto L_0x00c1
            long r0 = r12.A01
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x00c5
            java.lang.String r5 = "FMessageImageCommon/buildE2eMessage/sending image with media size not set, size="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r0)
            r4.append(r6)
            X.1Vw r0 = r12.A11
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00c5
        L_0x02b7:
            if (r14 == 0) goto L_0x02c1
            java.lang.String r0 = r12.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002b
        L_0x02c1:
            r13.A03()
            X.1Wm r1 = r13.A00
            X.24k r1 = (X.C445224k) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A0P = r4
            if (r14 != 0) goto L_0x002b
            java.lang.String r0 = r12.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with url not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r12.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x002b
        L_0x02ef:
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/unable to send encrypted media message due to missing mediaKey; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r12.A11
            r1.append(r0)
            java.lang.String r0 = "; media_wa_type="
            r1.append(r0)
            byte r0 = r12.A10
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38691rG.A1A(X.3e1, boolean, boolean):X.3e1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0220, code lost:
        r5.A08 = r12.A04;
        r5.A06 = r12.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0232, code lost:
        if (r13 != false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ee, code lost:
        if (r13 != false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021e, code lost:
        if ((r2 & 32) == 32) goto L_0x0220;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1B(X.C445224k r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            X.0ta r5 = new X.0ta
            r5.<init>()
            r11.A02 = r5
            int r1 = r12.A00
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x01cb
            X.1Ww r0 = r12.A0B
            byte[] r0 = r0.A04()
            X.C42941yx.A00(r5, r11, r0)
        L_0x0017:
            int r3 = r12.A00
            r2 = 1024(0x400, float:1.435E-42)
            r1 = r3 & r2
            r0 = 0
            if (r1 != r2) goto L_0x0021
            r0 = 1
        L_0x0021:
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x002a
            long r0 = r12.A06
            long r0 = r0 * r8
            r5.A0B = r0
        L_0x002a:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r3 & r2
            r0 = 0
            if (r1 != r2) goto L_0x0032
            r0 = 1
        L_0x0032:
            r7 = 2
            if (r0 == 0) goto L_0x0071
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r3 & r1
            if (r0 != r1) goto L_0x0071
            r0 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r0
            if (r3 != r0) goto L_0x0071
            X.1cv r3 = new X.1cv
            r3.<init>()
            java.lang.String r0 = r12.A0O
            r3.A04 = r0
            X.1Ww r0 = r12.A0G
            byte[] r2 = r0.A04()
            X.1Ww r0 = r12.A0F
            byte[] r1 = r0.A04()
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r7)
            r3.A07 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r3.A05 = r0
            X.1Ww r0 = r12.A0B
            byte[] r0 = r0.A04()
            r3.A09 = r0
            long r0 = r12.A06
            long r0 = r0 * r8
            r3.A02 = r0
            r11.A0h(r3)
        L_0x0071:
            X.27P r0 = r12.A0H
            int r2 = r0.size()
            int r1 = r12.A00
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            r8 = 65536(0x10000, float:9.18355E-41)
            r0 = 0
            if (r1 != r8) goto L_0x0082
            r0 = 1
        L_0x0082:
            r4 = 32
            if (r0 == 0) goto L_0x0102
            if (r2 <= 0) goto L_0x0102
            X.1Ww r0 = r12.A0E
            byte[] r1 = r0.A04()
            int[] r9 = new int[r2]
            r6 = 0
            r3 = 0
        L_0x0092:
            X.27P r0 = r12.A0H
            X.2sw r0 = (X.C58132sw) r0
            r0.A01(r3)
            int[] r0 = r0.A01
            r0 = r0[r3]
            r9[r3] = r0
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x0092
            if (r2 < r7) goto L_0x0102
            int r0 = r1.length
            int r0 = r0 / 10
            if (r0 != r2) goto L_0x0102
            X.1y4 r0 = r11.A12()
            X.AnonymousClass00B.A06(r0)
            r0.A03(r1, r9)
            int r1 = r12.A00
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x00ca
            X.1Ww r0 = r12.A0D
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 != r4) goto L_0x00ca
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r5.A0K = r0
        L_0x00ca:
            int r1 = r12.A00
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x00e0
            X.1Ww r0 = r12.A0C
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 != r4) goto L_0x00e0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r5.A0J = r0
        L_0x00e0:
            r3 = 10
            byte[] r2 = new byte[r3]
            X.1Ww r10 = r12.A0E
            int r0 = r10.A03()
            X.C28631Ww.A00(r6, r3, r0)
            X.1Wu r10 = (X.C28611Wu) r10
            boolean r0 = r10 instanceof X.AnonymousClass2ND
            if (r0 == 0) goto L_0x01c4
            X.2ND r10 = (X.AnonymousClass2ND) r10
            byte[] r1 = r10.bytes
            int r0 = r10.bytesOffset
            java.lang.System.arraycopy(r1, r0, r2, r6, r3)
        L_0x00fc:
            r5.A0R = r2
            r0 = r9[r6]
            r5.A04 = r0
        L_0x0102:
            X.1Ww r0 = r12.A0A
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0115
            r0 = 1
            r11.A02 = r0
            X.0tm r0 = r11.A0F()
            r0.A03(r1, r14)
        L_0x0115:
            java.lang.String r6 = "; message.key="
            if (r13 == 0) goto L_0x0121
            int r0 = r12.A00
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x012b
        L_0x0121:
            long r2 = r12.A05
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x027d
            r11.A01 = r2
        L_0x012b:
            r3 = 14
            java.lang.String r2 = "FMessageImageCommon/bogus sha-256 hash received; length="
            if (r13 == 0) goto L_0x0139
            int r0 = r12.A00
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x0148
        L_0x0139:
            X.1Ww r0 = r12.A08
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 != r4) goto L_0x0259
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r11.A05 = r0
        L_0x0148:
            int r1 = r12.A00
            r0 = 256(0x100, float:3.59E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x015e
            X.1Ww r0 = r12.A07
            byte[] r1 = r0.A04()
            int r0 = r1.length
            if (r0 != r4) goto L_0x0235
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r11.A04 = r0
        L_0x015e:
            int r2 = r12.A00
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x01ba
            java.lang.String r0 = r12.A0N
        L_0x0168:
            r11.A17(r0)
        L_0x016b:
            java.lang.String r0 = r12.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = r12.A0K
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r8, r0)
            r11.A03 = r0
        L_0x017b:
            if (r13 == 0) goto L_0x0183
            int r0 = r12.A00
            r0 = r0 & 2
            if (r0 != r7) goto L_0x01f0
        L_0x0183:
            java.lang.String r2 = r12.A0M
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            r1.append(r6)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x01ba:
            if (r13 == 0) goto L_0x01c1
            r1 = 1
            r0 = r2 & 1
            if (r0 != r1) goto L_0x016b
        L_0x01c1:
            java.lang.String r0 = r12.A0P
            goto L_0x0168
        L_0x01c4:
            byte[] r0 = r10.bytes
            java.lang.System.arraycopy(r0, r6, r2, r6, r3)
            goto L_0x00fc
        L_0x01cb:
            if (r13 != 0) goto L_0x0017
            java.lang.String r0 = "FMessageImageCommon/missing media key; message.key="
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
        L_0x01ec:
            r11.A06 = r2
            if (r13 == 0) goto L_0x022e
        L_0x01f0:
            int r1 = r12.A00
            r0 = 512(0x200, float:7.175E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x022e
            java.lang.String r0 = "FMessageImageCommon/message without direct path received; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.0rv r0 = r11.A0M
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0214:
            int r2 = r12.A00
            r1 = 64
            r0 = r2 & 64
            if (r0 != r1) goto L_0x0228
            r0 = r2 & 32
            if (r0 != r4) goto L_0x0228
        L_0x0220:
            int r0 = r12.A04
            r5.A08 = r0
            int r0 = r12.A03
            r5.A06 = r0
        L_0x0228:
            X.1XE r0 = r12.A0I
            X.C41071vB.A0M(r5, r0)
            return
        L_0x022e:
            java.lang.String r0 = r12.A0L
            r5.A0G = r0
            if (r13 == 0) goto L_0x0220
            goto L_0x0214
        L_0x0235:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r6)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x0259:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r6)
            X.1Vw r0 = r11.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x027d:
            java.lang.String r0 = "FMessageImageCommon/bogus media size received; fileLength="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            r1.append(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C38691rG.A1B(X.24k, boolean, boolean):void");
    }
}
