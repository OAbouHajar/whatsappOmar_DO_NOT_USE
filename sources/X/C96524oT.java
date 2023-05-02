package X;

import java.util.Arrays;

/* renamed from: X.4oT  reason: invalid class name and case insensitive filesystem */
public class C96524oT implements C55132it {
    public C15060qG A00;
    public C87484Wy A01;
    public boolean A02;

    public final boolean A00(C55142iu r9) {
        C87284Wd r2 = new C87284Wd();
        if (r2.A01(r9, true) && (r2.A03 & 2) == 2) {
            int min = Math.min(r2.A00, 8);
            C90504eH A05 = C90504eH.A05(min);
            C90504eH.A06(r9, A05, min);
            A05.A0S(0);
            if (C90504eH.A00(A05) >= 5 && A05.A0C() == 127 && A05.A0I() == 1179402563) {
                this.A01 = new C65433Ut();
                return true;
            }
            A05.A0S(0);
            try {
                if (AnonymousClass4Xf.A00(A05, 1, true)) {
                    this.A01 = new C65443Uu();
                    return true;
                }
            } catch (AnonymousClass40M unused) {
            }
            A05.A0S(0);
            int A002 = C90504eH.A00(A05);
            byte[] bArr = C65453Uv.A01;
            int length = bArr.length;
            if (A002 >= length) {
                byte[] bArr2 = new byte[length];
                A05.A0V(bArr2, 0, length);
                if (Arrays.equals(bArr2, bArr)) {
                    this.A01 = new C65453Uv();
                    return true;
                }
            }
        }
        return false;
    }

    public void AHx(C15060qG r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r21, X.AnonymousClass4Bt r22) {
        /*
            r20 = this;
            r4 = r20
            X.0qG r0 = r4.A00
            X.C90524eJ.A01(r0)
            X.4Wy r0 = r4.A01
            r7 = r21
            if (r0 != 0) goto L_0x0016
            boolean r0 = r4.A00(r7)
            if (r0 == 0) goto L_0x025c
            r7.AcS()
        L_0x0016:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0034
            X.0qG r1 = r4.A00
            r0 = 0
            r3 = 1
            X.1gS r2 = r1.Ah1(r0, r3)
            X.0qG r0 = r4.A00
            r0.A8W()
            X.4Wy r1 = r4.A01
            X.0qG r0 = r4.A00
            r1.A06 = r0
            r1.A07 = r2
            r1.A00(r3)
            r4.A02 = r3
        L_0x0034:
            X.4Wy r4 = r4.A01
            X.1gS r0 = r4.A07
            X.C90524eJ.A01(r0)
            int r0 = r4.A01
            if (r0 == 0) goto L_0x0061
            r10 = 1
            r3 = 2
            if (r0 == r10) goto L_0x0057
            if (r0 != r3) goto L_0x025a
            X.5SM r0 = r4.A08
            long r2 = r0.AbP(r7)
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00ec
            r0 = r22
            r0.A00 = r2
            r0 = 1
            return r0
        L_0x0057:
            long r1 = r4.A04
            int r0 = (int) r1
            r7.Afx(r0)
            r4.A01 = r3
            goto L_0x01df
        L_0x0061:
            X.4RM r3 = r4.A0C
            boolean r0 = r3.A00(r7)
            if (r0 == 0) goto L_0x0257
            long r5 = r7.AF7()
            long r0 = r4.A04
            long r5 = r5 - r0
            r4.A03 = r5
            X.4eH r8 = r3.A03
            X.4GD r2 = r4.A09
            boolean r0 = r4.A01(r2, r8, r0)
            if (r0 == 0) goto L_0x0083
            long r0 = r7.AF7()
            r4.A04 = r0
            goto L_0x0061
        L_0x0083:
            X.4GD r0 = r4.A09
            X.1gT r2 = r0.A00
            int r0 = r2.A0F
            r4.A00 = r0
            boolean r0 = r4.A0A
            r1 = 1
            if (r0 != 0) goto L_0x0097
            X.1gS r0 = r4.A07
            r0.A9D(r2)
            r4.A0A = r1
        L_0x0097:
            X.4GD r0 = r4.A09
            X.5SM r0 = r0.A01
            if (r0 != 0) goto L_0x00ac
            long r13 = r7.getLength()
            r1 = -1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ca
            X.4oz r0 = new X.4oz
            r0.<init>()
        L_0x00ac:
            r4.A08 = r0
        L_0x00ae:
            r0 = 2
            r4.A01 = r0
            byte[] r2 = r8.A02
            int r0 = r2.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x01df
            int r0 = r8.A00
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r1 = java.util.Arrays.copyOf(r2, r0)
            int r0 = r8.A00
            r8.A0U(r1, r0)
            goto L_0x01df
        L_0x00ca:
            X.4Wd r7 = r3.A02
            int r0 = r7.A03
            r0 = r0 & 4
            boolean r19 = X.AnonymousClass000.A1O(r0)
            long r5 = r4.A04
            int r1 = r7.A01
            int r0 = r7.A00
            int r1 = r1 + r0
            long r2 = (long) r1
            long r0 = r7.A04
            X.4p1 r7 = new X.4p1
            r9 = r7
            r10 = r4
            r11 = r5
            r15 = r2
            r17 = r0
            r9.<init>(r10, r11, r13, r15, r17, r19)
            r4.A08 = r7
            goto L_0x00ae
        L_0x00ec:
            r13 = -1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0110
            r0 = 2
            long r2 = r2 + r0
            long r0 = -r2
            boolean r2 = r4 instanceof X.C65443Uu
            if (r2 == 0) goto L_0x0253
            r8 = r4
            X.3Uu r8 = (X.C65443Uu) r8
            r8.A02 = r0
            r3 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r2)
            r8.A04 = r0
            X.4Ny r0 = r8.A02
            if (r0 == 0) goto L_0x010e
            int r3 = r0.A02
        L_0x010e:
            r8.A00 = r3
        L_0x0110:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0124
            X.5SM r0 = r4.A08
            X.1gD r1 = r0.A7a()
            X.C90524eJ.A01(r1)
            X.0qG r0 = r4.A06
            r0.AdD(r1)
            r4.A0B = r10
        L_0x0124:
            long r0 = r4.A03
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
            X.4RM r0 = r4.A0C
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0257
        L_0x0132:
            r4.A03 = r5
            X.4RM r0 = r4.A0C
            X.4eH r8 = r0.A03
            boolean r0 = r4 instanceof X.C65443Uu
            if (r0 == 0) goto L_0x01e9
            r9 = r4
            X.3Uu r9 = (X.C65443Uu) r9
            byte[] r7 = r8.A02
            r2 = 0
            byte r11 = r7[r2]
            r0 = r11 & 1
            if (r0 == r10) goto L_0x024f
            X.4Mx r3 = r9.A03
            X.C90524eJ.A01(r3)
            int r0 = r3.A00
            int r11 = r11 >> r10
            int r1 = 8 - r0
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 >>> r1
            r11 = r11 & r0
            X.4Bv[] r0 = r3.A04
            r0 = r0[r11]
            boolean r1 = r0.A00
            X.4Ny r0 = r3.A02
            if (r1 != 0) goto L_0x01e5
            int r12 = r0.A02
        L_0x0162:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x016b
            int r0 = r9.A00
            int r0 = r0 + r12
            int r2 = r0 >> 2
        L_0x016b:
            long r0 = (long) r2
            int r3 = r7.length
            int r2 = r8.A00
            int r2 = r2 + 4
            if (r3 >= r2) goto L_0x01e1
            byte[] r3 = java.util.Arrays.copyOf(r7, r2)
            int r2 = r3.length
            r8.A0U(r3, r2)
        L_0x017b:
            byte[] r7 = r8.A02
            int r11 = r8.A00
            int r16 = r11 + -4
            r17 = 255(0xff, double:1.26E-321)
            long r2 = r0 & r17
            int r15 = (int) r2
            byte r2 = (byte) r15
            r7[r16] = r2
            int r16 = r11 + -3
            r2 = 8
            long r2 = r0 >>> r2
            long r2 = r2 & r17
            int r15 = (int) r2
            byte r2 = (byte) r15
            r7[r16] = r2
            int r16 = r11 + -2
            r2 = 16
            long r2 = r0 >>> r2
            long r2 = r2 & r17
            int r15 = (int) r2
            byte r2 = (byte) r15
            r7[r16] = r2
            int r15 = r11 + -1
            r2 = 24
            long r2 = r0 >>> r2
            long r2 = r2 & r17
            int r11 = (int) r2
            byte r2 = (byte) r11
            r7[r15] = r2
            r9.A04 = r10
            r9.A00 = r12
        L_0x01b1:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x01da
            long r10 = r4.A02
            long r6 = r10 + r0
            long r2 = r4.A05
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x01da
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r2
            int r2 = r4.A00
            long r2 = (long) r2
            long r10 = r10 / r2
            X.1gS r3 = r4.A07
            int r2 = r8.A00
            r3.Acw(r8, r2)
            X.1gS r5 = r4.A07
            int r8 = r8.A00
            r9 = 0
            r6 = 0
            r7 = 1
            r5.Ad0(r6, r7, r8, r9, r10)
            r4.A05 = r13
        L_0x01da:
            long r2 = r4.A02
            long r2 = r2 + r0
            r4.A02 = r2
        L_0x01df:
            r0 = 0
            return r0
        L_0x01e1:
            r8.A0R(r2)
            goto L_0x017b
        L_0x01e5:
            int r12 = r0.A03
            goto L_0x0162
        L_0x01e9:
            boolean r0 = r4 instanceof X.C65453Uv
            if (r0 == 0) goto L_0x0229
            byte[] r1 = r8.A02
            r0 = 0
            byte r0 = r1[r0]
            r9 = r0 & 255(0xff, float:3.57E-43)
            r0 = r9 & 3
            r7 = 2
            if (r0 == 0) goto L_0x0227
            if (r0 == r10) goto L_0x0201
            if (r0 == r7) goto L_0x0201
            byte r0 = r1[r10]
            r7 = r0 & 63
        L_0x0201:
            r3 = 3
            int r9 = r9 >> r3
            r2 = r9 & 3
            r0 = 16
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r9 >= r0) goto L_0x0225
            r0 = 12
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r9 < r0) goto L_0x021f
            r0 = r2 & 1
            int r1 = r1 << r0
        L_0x0214:
            long r2 = (long) r7
            long r0 = (long) r1
            long r2 = r2 * r0
            int r0 = r4.A00
            long r0 = (long) r0
            long r0 = X.AnonymousClass3K3.A0S(r0, r2)
            goto L_0x01b1
        L_0x021f:
            if (r2 != r3) goto L_0x0225
            r1 = 60000(0xea60, float:8.4078E-41)
            goto L_0x0214
        L_0x0225:
            int r1 = r1 << r2
            goto L_0x0214
        L_0x0227:
            r7 = 1
            goto L_0x0201
        L_0x0229:
            byte[] r2 = r8.A02
            r0 = 0
            byte r1 = r2[r0]
            r0 = -1
            if (r1 != r0) goto L_0x024f
            r0 = 2
            byte r0 = r2[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            int r2 = r2 >> r1
            r0 = 6
            if (r2 == r0) goto L_0x023e
            r0 = 7
            if (r2 != r0) goto L_0x0244
        L_0x023e:
            r8.A0T(r1)
            r8.A0K()
        L_0x0244:
            int r1 = X.C87514Xe.A00(r8, r2)
            r0 = 0
            r8.A0S(r0)
            long r0 = (long) r1
            goto L_0x01b1
        L_0x024f:
            r0 = -1
            goto L_0x01b1
        L_0x0253:
            r4.A02 = r0
            goto L_0x0110
        L_0x0257:
            r0 = 3
            r4.A01 = r0
        L_0x025a:
            r0 = -1
            return r0
        L_0x025c:
            java.lang.String r0 = "Failed to determine bitstream type"
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96524oT.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        C87484Wy r3 = this.A01;
        if (r3 != null) {
            AnonymousClass4RM r5 = r3.A0C;
            C87284Wd r0 = r5.A02;
            r0.A03 = 0;
            r0.A04 = 0;
            r0.A02 = 0;
            r0.A01 = 0;
            r0.A00 = 0;
            r5.A03.A0Q(0);
            r5.A00 = -1;
            r5.A01 = false;
            if (j2 == 0) {
                r3.A00(!r3.A0B);
            } else if (r3.A01 != 0) {
                long A0S = AnonymousClass3K3.A0S((long) r3.A00, j3);
                r3.A05 = A0S;
                r3.A08.Ag7(A0S);
                r3.A01 = 2;
            }
        }
    }

    public boolean Afz(C55142iu r2) {
        try {
            return A00(r2);
        } catch (AnonymousClass40M unused) {
            return false;
        }
    }
}
