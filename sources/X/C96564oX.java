package X;

import java.io.EOFException;

/* renamed from: X.4oX  reason: invalid class name and case insensitive filesystem */
public final class C96564oX implements C55132it {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public long A03;
    public long A04;
    public C15060qG A05;
    public C32481gS A06;
    public C32481gS A07;
    public AnonymousClass5UQ A08;
    public C93724jf A09;
    public boolean A0A;
    public final AnonymousClass4S0 A0B = new AnonymousClass4S0();
    public final C88644ar A0C = new C88644ar();
    public final C85734Ps A0D = new C85734Ps();
    public final C32481gS A0E;
    public final C90504eH A0F = C90504eH.A05(10);

    public C96564oX() {
        C96764or r0 = new C96764or();
        this.A0E = r0;
        this.A06 = r0;
    }

    public final AnonymousClass5UQ A00(C55142iu r7) {
        C90504eH r3 = this.A0F;
        r7.AaL(r3.A02, 0, 4);
        r3.A0S(0);
        AnonymousClass4S0 r1 = this.A0B;
        r1.A00(r3.A07());
        return new C65363Um(r1, r7.getLength(), r7.AF7());
    }

    public final boolean A01(C55142iu r8) {
        AnonymousClass5UQ r0 = this.A08;
        if (r0 != null) {
            long ABc = r0.ABc();
            if (ABc != -1 && r8.AEy() > ABc - 4) {
                return true;
            }
        }
        try {
            return !r8.AaM(this.A0F.A02, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean A02(C55142iu r18, boolean z2) {
        int i2;
        int i3;
        int A002;
        int i4 = 131072;
        if (z2) {
            i4 = 32768;
        }
        C55142iu r11 = r18;
        r11.AcS();
        if (r11.AF7() == 0) {
            C93724jf A003 = this.A0D.A00(r11, (C108305Nl) null);
            this.A09 = A003;
            if (A003 != null) {
                this.A0C.A00(A003);
            }
            i3 = (int) r11.AEy();
            if (!z2) {
                r11.Afx(i3);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!A01(r11)) {
                int A032 = C90504eH.A03(this.A0F, 0);
                if ((i2 == 0 || ((long) (-128000 & A032)) == (((long) i2) & -128000)) && (A002 = C89824cz.A00(A032)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.A0B.A00(A032);
                        i2 = A032;
                    }
                    r11.A4m(A002 - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 != i4) {
                        if (z2) {
                            r11.AcS();
                            r11.A4m(i3 + i7);
                        } else {
                            r11.Afx(1);
                        }
                        i6 = i7;
                        i2 = 0;
                        i5 = 0;
                    } else if (z2) {
                        return false;
                    } else {
                        throw AnonymousClass40M.A00("Searched too many bytes.");
                    }
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z2) {
            r11.Afx(i3 + i6);
        } else {
            r11.AcS();
        }
        this.A01 = i2;
        return true;
    }

    public void AHx(C15060qG r3) {
        this.A05 = r3;
        C32481gS Ah1 = r3.Ah1(0, 1);
        this.A07 = Ah1;
        this.A06 = Ah1;
        this.A05.A8W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025c, code lost:
        if (X.C90504eH.A03(r12, 36) == 1447187017) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0268, code lost:
        if (r1 != 1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1 == 1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034f, code lost:
        if (r4 != null) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0351, code lost:
        r4 = A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r5 == 1447187017) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c3, code lost:
        if (r7.A01 != -1) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d4, code lost:
        if (r5 != 1231971951) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d6, code lost:
        r4 = A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f9, code lost:
        if (r1 > 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fb, code lost:
        r7.A00 = r2;
        r7.A01 = r1;
        r4 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r32, X.AnonymousClass4Bt r33) {
        /*
            r31 = this;
            r0 = r31
            X.1gS r1 = r0.A07
            X.C90524eJ.A01(r1)
            int r1 = r0.A01
            r8 = r32
            if (r1 != 0) goto L_0x0014
            r1 = 0
            r0.A02(r8, r1)     // Catch:{ EOFException -> 0x0012 }
            goto L_0x0014
        L_0x0012:
            r0 = -1
            return r0
        L_0x0014:
            X.5UQ r1 = r0.A08
            if (r1 != 0) goto L_0x026e
            X.4S0 r3 = r0.A0B
            int r2 = r3.A02
            X.4eH r12 = X.C90504eH.A05(r2)
            byte[] r1 = r12.A02
            r13 = 0
            r8.AaL(r1, r13, r2)
            int r1 = r3.A05
            r4 = 1
            r2 = r1 & 1
            int r1 = r3.A01
            if (r2 == 0) goto L_0x0266
            r9 = 36
            if (r1 != r4) goto L_0x0035
        L_0x0033:
            r9 = 21
        L_0x0035:
            int r2 = r12.A00
            int r1 = r9 + 4
            if (r2 < r1) goto L_0x024d
            int r5 = X.C90504eH.A03(r12, r9)
            r1 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r5 == r1) goto L_0x0049
            r1 = 1231971951(0x496e666f, float:976486.94)
            if (r5 != r1) goto L_0x024d
        L_0x0049:
            r1 = 1483304551(0x58696e67, float:1.02664153E15)
            r14 = 1231971951(0x496e666f, float:976486.94)
            if (r5 == r1) goto L_0x017b
            if (r5 == r14) goto L_0x017b
            r1 = 1447187017(0x56425249, float:5.3414667E13)
            if (r5 != r1) goto L_0x0260
        L_0x0058:
            long r6 = r8.getLength()
            long r1 = r8.AF7()
            r4 = 10
            r12.A0T(r4)
            int r5 = r12.A07()
            r4 = 0
            if (r5 <= 0) goto L_0x00bd
            int r9 = r3.A03
            long r13 = (long) r5
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r5 = 32000(0x7d00, float:4.4842E-41)
            r4 = 576(0x240, float:8.07E-43)
            if (r9 < r5) goto L_0x007a
            r4 = 1152(0x480, float:1.614E-42)
        L_0x007a:
            long r4 = (long) r4
            long r15 = r15 * r4
            long r4 = (long) r9
            r17 = r4
            long r20 = X.AnonymousClass3C1.A05(r13, r15, r17)
            int r10 = r12.A0F()
            int r19 = r12.A0F()
            int r9 = r12.A0F()
            r4 = 2
            r12.A0T(r4)
            int r4 = r3.A02
            long r4 = (long) r4
            long r17 = r1 + r4
            long[] r4 = new long[r10]
            r16 = r4
            long[] r15 = new long[r10]
            r11 = 0
        L_0x009f:
            if (r11 >= r10) goto L_0x014b
            long r4 = (long) r11
            long r4 = r4 * r20
            long r13 = (long) r10
            long r4 = r4 / r13
            r16[r11] = r4
            r4 = r17
            long r4 = java.lang.Math.max(r1, r4)
            r15[r11] = r4
            r4 = 1
            if (r9 == r4) goto L_0x013a
            r4 = 2
            if (r9 == r4) goto L_0x0135
            r4 = 3
            if (r9 == r4) goto L_0x013f
            r4 = 4
            if (r9 == r4) goto L_0x0130
            r4 = 0
        L_0x00bd:
            int r1 = r3.A02
            r8.Afx(r1)
        L_0x00c2:
            X.4jf r1 = r0.A09
            long r17 = r8.AF7()
            if (r1 == 0) goto L_0x026c
            X.1mP[] r9 = r1.A00
            int r7 = r9.length
            r2 = 0
        L_0x00ce:
            if (r2 >= r7) goto L_0x026c
            r13 = r9[r2]
            boolean r1 = r13 instanceof X.AnonymousClass3VD
            if (r1 == 0) goto L_0x012d
            X.3VD r13 = (X.AnonymousClass3VD) r13
            r6 = 0
        L_0x00d9:
            if (r6 >= r7) goto L_0x0127
            r5 = r9[r6]
            boolean r1 = r5 instanceof X.AnonymousClass3V7
            if (r1 == 0) goto L_0x0124
            X.3V7 r5 = (X.AnonymousClass3V7) r5
            java.lang.String r2 = r5.A00
            java.lang.String r1 = "TLEN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0124
            java.lang.String r1 = r5.A01
            long r1 = java.lang.Long.parseLong(r1)
            long r1 = X.C90604eR.A01(r1)
        L_0x00f7:
            int[] r12 = r13.A03
            int r11 = r12.length
            int r5 = r11 + 1
            long[] r10 = new long[r5]
            long[] r9 = new long[r5]
            r5 = 0
            r10[r5] = r17
            r15 = 0
            r9[r5] = r15
            r7 = 1
        L_0x0108:
            if (r7 > r11) goto L_0x0284
            int r6 = r13.A00
            int r14 = r7 + -1
            r5 = r12[r14]
            int r6 = r6 + r5
            long r5 = (long) r6
            long r17 = r17 + r5
            int r6 = r13.A01
            int[] r5 = r13.A04
            r5 = r5[r14]
            int r6 = r6 + r5
            long r5 = (long) r6
            long r15 = r15 + r5
            r10[r7] = r17
            r9[r7] = r15
            int r7 = r7 + 1
            goto L_0x0108
        L_0x0124:
            int r6 = r6 + 1
            goto L_0x00d9
        L_0x0127:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00f7
        L_0x012d:
            int r2 = r2 + 1
            goto L_0x00ce
        L_0x0130:
            int r4 = r12.A0E()
            goto L_0x0143
        L_0x0135:
            int r4 = r12.A0F()
            goto L_0x0143
        L_0x013a:
            int r4 = r12.A0C()
            goto L_0x0143
        L_0x013f:
            int r4 = r12.A0D()
        L_0x0143:
            int r4 = r4 * r19
            long r4 = (long) r4
            long r1 = r1 + r4
            int r11 = r11 + 1
            goto L_0x009f
        L_0x014b:
            r9 = -1
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x016c
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x016c
            java.lang.String r4 = "VBRI data size mismatch: "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r4)
            r5.append(r6)
            java.lang.String r4 = ", "
            r5.append(r4)
            java.lang.String r5 = X.C13680ns.A0j(r5, r1)
            java.lang.String r4 = "VbriSeeker"
            android.util.Log.w(r4, r5)
        L_0x016c:
            X.4ou r4 = new X.4ou
            r17 = r4
            r18 = r16
            r19 = r15
            r22 = r1
            r17.<init>(r18, r19, r20, r22)
            goto L_0x00bd
        L_0x017b:
            long r1 = r8.getLength()
            long r18 = r8.AF7()
            int r6 = r3.A04
            int r4 = r3.A03
            int r17 = r12.A07()
            r10 = r17 & 1
            r7 = 1
            if (r10 != r7) goto L_0x024a
            int r7 = r12.A0E()
            if (r7 == 0) goto L_0x024a
            long r15 = (long) r7
            long r6 = (long) r6
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r10
            long r10 = (long) r4
            r22 = r6
            r24 = r10
            r20 = r15
            long r20 = X.AnonymousClass3C1.A05(r20, r22, r24)
            r6 = 6
            r4 = r17 & 6
            if (r4 == r6) goto L_0x0200
            int r1 = r3.A02
            r22 = -1
            r16 = 0
            X.4ov r4 = new X.4ov
            r15 = r4
            r17 = r1
            r15.<init>(r16, r17, r18, r20, r22)
        L_0x01ba:
            X.4ar r7 = r0.A0C
            int r1 = r7.A00
            r2 = -1
            if (r1 == r2) goto L_0x01dc
            int r1 = r7.A01
            if (r1 == r2) goto L_0x01dc
        L_0x01c5:
            int r1 = r3.A02
            r8.Afx(r1)
            if (r4 == 0) goto L_0x00c2
            long[] r1 = r4.A05
            boolean r1 = X.AnonymousClass000.A1V(r1)
            if (r1 != 0) goto L_0x00c2
            if (r5 != r14) goto L_0x00c2
            X.5UQ r4 = r0.A00(r8)
            goto L_0x00c2
        L_0x01dc:
            r8.AcS()
            int r1 = r9 + 141
            r8.A4m(r1)
            X.4eH r6 = r0.A0F
            byte[] r2 = r6.A02
            r1 = 3
            r8.AaL(r2, r13, r1)
            r6.A0S(r13)
            int r1 = r6.A0D()
            int r2 = r1 >> 12
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            if (r2 > 0) goto L_0x01fb
            if (r1 <= 0) goto L_0x01c5
        L_0x01fb:
            r7.A00 = r2
            r7.A01 = r1
            goto L_0x01c5
        L_0x0200:
            long r29 = r12.A0I()
            r6 = 100
            long[] r15 = new long[r6]
            r4 = 0
        L_0x0209:
            int r7 = r12.A0C()
            long r10 = (long) r7
            r15[r4] = r10
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x0209
            r6 = -1
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0237
            long r6 = r18 + r29
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0237
            java.lang.String r4 = "XING data size mismatch: "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r4)
            r4.append(r1)
            java.lang.String r1 = ", "
            r4.append(r1)
            java.lang.String r2 = X.C13680ns.A0j(r4, r6)
            java.lang.String r1 = "XingSeeker"
            android.util.Log.w(r1, r2)
        L_0x0237:
            int r1 = r3.A02
            X.4ov r4 = new X.4ov
            r22 = r4
            r23 = r15
            r24 = r1
            r25 = r18
            r27 = r20
            r22.<init>(r23, r24, r25, r27, r29)
            goto L_0x01ba
        L_0x024a:
            r4 = 0
            goto L_0x01c5
        L_0x024d:
            int r2 = r12.A00
            r1 = 40
            if (r2 < r1) goto L_0x0260
            r1 = 36
            int r2 = X.C90504eH.A03(r12, r1)
            r1 = 1447187017(0x56425249, float:5.3414667E13)
            if (r2 != r1) goto L_0x0260
            goto L_0x0058
        L_0x0260:
            r4 = 0
            r8.AcS()
            goto L_0x00c2
        L_0x0266:
            r9 = 13
            if (r1 == r4) goto L_0x0035
            goto L_0x0033
        L_0x026c:
            r5 = 0
            goto L_0x0289
        L_0x026e:
            long r4 = r0.A03
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02c6
            long r2 = r8.AF7()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x02c6
            long r4 = r4 - r2
            int r1 = (int) r4
            r8.Afx(r1)
            goto L_0x02c6
        L_0x0284:
            X.4ow r5 = new X.4ow
            r5.<init>(r10, r9, r1)
        L_0x0289:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x034a
            X.3Un r4 = new X.3Un
            r4.<init>()
        L_0x0292:
            r0.A08 = r4
            X.0qG r1 = r0.A05
            r1.AdD(r4)
            X.1gS r5 = r0.A06
            X.1gR r4 = X.AnonymousClass3K4.A0N()
            java.lang.String r1 = r3.A06
            r4.A0R = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r4.A08 = r1
            int r1 = r3.A01
            r4.A04 = r1
            int r1 = r3.A03
            r4.A0D = r1
            X.4ar r2 = r0.A0C
            int r1 = r2.A00
            r4.A05 = r1
            int r1 = r2.A01
            r4.A06 = r1
            X.4jf r1 = r0.A09
            r4.A0J = r1
            X.AnonymousClass3K3.A19(r4, r5)
            long r1 = r8.AF7()
            r0.A03 = r1
        L_0x02c6:
            int r2 = r0.A00
            r10 = 1
            r7 = -1
            r12 = 0
            if (r2 != 0) goto L_0x0312
            r8.AcS()
            boolean r1 = r0.A01(r8)
            if (r1 != 0) goto L_0x0357
            X.4eH r1 = r0.A0F
            int r9 = X.C90504eH.A03(r1, r12)
            int r1 = r0.A01
            long r3 = (long) r1
            r1 = -128000(0xfffffffffffe0c00, float:NaN)
            r1 = r1 & r9
            long r1 = (long) r1
            r5 = -128000(0xfffffffffffe0c00, double:NaN)
            long r3 = r3 & r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0344
            int r1 = X.C89824cz.A00(r9)
            if (r1 == r7) goto L_0x0344
            X.4S0 r4 = r0.A0B
            r4.A00(r9)
            long r1 = r0.A02
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x030e
            X.5UQ r3 = r0.A08
            long r1 = r8.AF7()
            long r1 = r3.AGZ(r1)
            r0.A02 = r1
        L_0x030e:
            int r2 = r4.A02
            r0.A00 = r2
        L_0x0312:
            X.1gS r1 = r0.A06
            int r2 = r1.Acz(r8, r2, r12, r10)
            if (r2 == r7) goto L_0x0357
            int r1 = r0.A00
            int r1 = r1 - r2
            r0.A00 = r1
            if (r1 > 0) goto L_0x0342
            X.1gS r8 = r0.A06
            long r1 = r0.A04
            long r13 = r0.A02
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r3
            X.4S0 r5 = r0.A0B
            int r3 = r5.A03
            long r3 = (long) r3
            long r1 = r1 / r3
            long r13 = r13 + r1
            int r11 = r5.A02
            r9 = 0
            r8.Ad0(r9, r10, r11, r12, r13)
            long r3 = r0.A04
            int r1 = r5.A04
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.A04 = r3
            r0.A00 = r12
        L_0x0342:
            r0 = 0
            return r0
        L_0x0344:
            r8.Afx(r10)
            r0.A01 = r12
            goto L_0x0342
        L_0x034a:
            if (r5 == 0) goto L_0x034f
            r4 = r5
            goto L_0x0292
        L_0x034f:
            if (r4 != 0) goto L_0x0292
            X.5UQ r4 = r0.A00(r8)
            goto L_0x0292
        L_0x0357:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96564oX.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0;
        this.A00 = 0;
    }

    public boolean Afz(C55142iu r2) {
        return A02(r2, true);
    }
}
