package X;

/* renamed from: X.1rH  reason: invalid class name and case insensitive filesystem */
public class C38701rH extends C16730tY implements C16850tk, C30081bi {
    public C42661yC A00;

    public C38701rH(C16750ta r12, C28381Vw r13, C38701rH r14, long j2, boolean z2) {
        super(r12, r13, r14, r14.A10, j2, z2);
        C42661yC r0 = r14.A00;
        if (r0 != null) {
            A19(new C42661yC(r0.A02, r0.A01));
        }
    }

    public C38701rH(C28381Vw r2, long j2) {
        super(r2, (byte) 2, j2);
    }

    public void A19(C42661yC r3) {
        this.A00 = r3;
        if (r3 == null) {
            this.A09 = -32769 & this.A09;
        } else {
            A0S(32768);
        }
    }

    public boolean A1A() {
        return this.A08 != 1 && "audio/ogg; codecs=opus".equals(this.A06) && C30921dB.A05(this);
    }

    public boolean A1B() {
        int i2 = this.A08;
        return i2 == 1 || (i2 != 1 && "audio/ogg; codecs=opus".equals(this.A06) && !C30921dB.A05(this)) || A1A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r7 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (android.text.TextUtils.isEmpty(r12.A05) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r1 = android.util.Base64.decode(r12.A05, 0);
        r8 = X.C28631Ww.A01(r1, 0, r1.length);
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 4;
        r1.A06 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (android.text.TextUtils.isEmpty(r12.A04) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r1 = android.util.Base64.decode(r12.A04, 0);
        r8 = X.C28631Ww.A01(r1, 0, r1.length);
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 128;
        r1.A05 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r7 == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r12.A01 <= 0) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r0 = r12.A01;
        r3.A03();
        r9 = (X.C445424m) r3.A00;
        r9.A01 |= 8;
        r9.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r7 != false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r0 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r0 > 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        r8 = new java.lang.StringBuilder("FMessageAudio/buildE2eMessage/sending audio with media size not set, size=");
        r8.append(r0);
        r8.append("; message.key=");
        r8.append(r12.A11);
        com.whatsapp.util.Log.w(r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        r8 = r12.A00;
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 16;
        r1.A02 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fe, code lost:
        if (r12.A08 != 1) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0100, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 32;
        r1.A0E = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        if (r7 == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0114, code lost:
        if (r6.A0U == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        r2 = r6.A0U;
        r2 = X.C28631Ww.A01(r2, 0, r2.length);
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 64;
        r1.A07 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012d, code lost:
        r5 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012f, code lost:
        if (r5 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0131, code lost:
        r2 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0133, code lost:
        if (r2 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0135, code lost:
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
        if (r1 <= 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        if (r1 > 192) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        r2 = X.C28631Ww.A01(r2, 0, r1);
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 4096;
        r1.A09 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0150, code lost:
        r2 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
        if (r2 == 0) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0154, code lost:
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 8192;
        r1.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        r0 = r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0167, code lost:
        if (r0 <= 0) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0169, code lost:
        r3.A03();
        r5 = (X.C445424m) r3.A00;
        r5.A01 |= 512;
        r5.A04 = r0 / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017b, code lost:
        r2 = r13.A05;
        r1 = r13.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0183, code lost:
        if (X.C41071vB.A0O(r2, r12, r1) == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0185, code lost:
        r0 = r14.A00(r2, r12, r1, r13.A07);
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A0A = r0;
        r1.A01 |= 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a0, code lost:
        if (android.text.TextUtils.isEmpty(r6.A0G) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a2, code lost:
        r2 = r6.A0G;
        r3.A03();
        r1 = (X.C445424m) r3.A00;
        r1.A01 |= 256;
        r1.A0B = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c9, code lost:
        r1 = new java.lang.StringBuilder("FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key=");
        r1.append(r12.A11);
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01df, code lost:
        if (r12.A00 <= 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e9, code lost:
        if (android.text.TextUtils.isEmpty(r12.A06) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5j(X.AnonymousClass21Q r13, X.AnonymousClass1GC r14) {
        /*
            r12 = this;
            X.0ta r6 = r12.A02
            r2 = 0
            r5 = 1
            if (r6 == 0) goto L_0x01ed
            boolean r7 = r13.A09
            if (r7 != 0) goto L_0x000e
            byte[] r0 = r6.A0U
            if (r0 == 0) goto L_0x01ed
        L_0x000e:
            X.1iE r4 = r13.A04
            X.1Wm r0 = r4.A00
            X.1iD r0 = (X.C33211iD) r0
            X.24m r0 = r0.A02
            if (r0 != 0) goto L_0x001a
            X.24m r0 = X.C445424m.A0F
        L_0x001a:
            X.1Wr r3 = r0.A0U()
            if (r7 == 0) goto L_0x0028
            java.lang.String r0 = r12.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01e3
        L_0x0028:
            java.lang.String r8 = r12.A08
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 1
            r1.A01 = r0
            r1.A0D = r8
            if (r7 != 0) goto L_0x01e3
            java.lang.String r0 = r12.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with url not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r12.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0056:
            java.lang.String r8 = r12.A06
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 2
            r1.A01 = r0
            r1.A0C = r8
            if (r7 == 0) goto L_0x0071
        L_0x0069:
            java.lang.String r0 = r12.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008b
        L_0x0071:
            java.lang.String r0 = r12.A05
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r8 = X.C28631Ww.A01(r1, r2, r0)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 4
            r1.A01 = r0
            r1.A06 = r8
        L_0x008b:
            java.lang.String r0 = r12.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = r12.A04
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r8 = X.C28631Ww.A01(r1, r2, r0)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A01 = r0
            r1.A05 = r8
        L_0x00ad:
            r10 = 0
            if (r7 == 0) goto L_0x00b7
            long r0 = r12.A01
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x01dd
        L_0x00b7:
            long r0 = r12.A01
            r3.A03()
            X.1Wm r9 = r3.A00
            X.24m r9 = (X.C445424m) r9
            int r8 = r9.A01
            r8 = r8 | 8
            r9.A01 = r8
            r9.A03 = r0
            if (r7 != 0) goto L_0x01dd
            long r0 = r12.A01
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x00eb
            java.lang.String r9 = "FMessageAudio/buildE2eMessage/sending audio with media size not set, size="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r0 = "; message.key="
            r8.append(r0)
            X.1Vw r0 = r12.A11
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00eb:
            int r8 = r12.A00
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 16
            r1.A01 = r0
            r1.A02 = r8
        L_0x00fc:
            int r0 = r12.A08
            if (r0 != r5) goto L_0x0101
            r2 = 1
        L_0x0101:
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 32
            r1.A01 = r0
            r1.A0E = r2
            if (r7 == 0) goto L_0x0116
            byte[] r0 = r6.A0U
            if (r0 == 0) goto L_0x012d
        L_0x0116:
            byte[] r2 = r6.A0U
            int r1 = r2.length
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 64
            r1.A01 = r0
            r1.A07 = r2
        L_0x012d:
            X.1yC r5 = r12.A00
            if (r5 == 0) goto L_0x0163
            byte[] r2 = r5.A02
            if (r2 == 0) goto L_0x0150
            int r1 = r2.length
            if (r1 <= 0) goto L_0x0150
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x0150
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.A01 = r0
            r1.A09 = r2
        L_0x0150:
            int r2 = r5.A01
            if (r2 == 0) goto L_0x0163
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.A01 = r0
            r1.A00 = r2
        L_0x0163:
            long r0 = r6.A0B
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x017b
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r7
            r3.A03()
            X.1Wm r5 = r3.A00
            X.24m r5 = (X.C445424m) r5
            int r2 = r5.A01
            r2 = r2 | 512(0x200, float:7.175E-43)
            r5.A01 = r2
            r5.A04 = r0
        L_0x017b:
            X.1WV r2 = r13.A05
            byte[] r1 = r13.A0A
            boolean r0 = X.C41071vB.A0O(r2, r12, r1)
            if (r0 == 0) goto L_0x019a
            boolean r0 = r13.A07
            X.21S r0 = r14.A00(r2, r12, r1, r0)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            r1.A0A = r0
            int r0 = r1.A01
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.A01 = r0
        L_0x019a:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r2 = r6.A0G
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A01 = r0
            r1.A0B = r2
        L_0x01b3:
            r4.A03()
            X.1Wm r1 = r4.A00
            X.1iD r1 = (X.C33211iD) r1
            X.1Wm r0 = r3.A02()
            X.24m r0 = (X.C445424m) r0
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            return
        L_0x01c9:
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r12.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01b3
        L_0x01dd:
            int r0 = r12.A00
            if (r0 <= 0) goto L_0x00fc
            goto L_0x00eb
        L_0x01e3:
            java.lang.String r0 = r12.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0069
            goto L_0x0056
        L_0x01ed:
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x0249
            X.1iE r4 = r13.A04
            X.1Wm r0 = r4.A00
            X.1iD r0 = (X.C33211iD) r0
            X.24m r0 = r0.A02
            if (r0 != 0) goto L_0x01fd
            X.24m r0 = X.C445424m.A0F
        L_0x01fd:
            X.1Wr r3 = r0.A0U()
            int r0 = r12.A08
            if (r0 != r5) goto L_0x0206
            r2 = 1
        L_0x0206:
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 32
            r1.A01 = r0
            r1.A0E = r2
            X.1WV r2 = r13.A05
            byte[] r1 = r13.A0A
            boolean r0 = X.C41071vB.A0O(r2, r12, r1)
            if (r0 == 0) goto L_0x0234
            boolean r0 = r13.A07
            X.21S r0 = r14.A00(r2, r12, r1, r0)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            r1.A0A = r0
            int r0 = r1.A01
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.A01 = r0
        L_0x0234:
            int r2 = r12.A00
            if (r2 <= 0) goto L_0x01b3
            r3.A03()
            X.1Wm r1 = r3.A00
            X.24m r1 = (X.C445424m) r1
            int r0 = r1.A01
            r0 = r0 | 16
            r1.A01 = r0
            r1.A02 = r2
            goto L_0x01b3
        L_0x0249:
            java.lang.String r0 = "FMessageAudio/unable to send encrypted media message due to missing mediaKey; key="
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
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38701rH.A5j(X.21Q, X.1GC):void");
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r8) {
        long j2 = this.A0I;
        return new C38701rH(this.A02, r8, this, j2, true);
    }
}
