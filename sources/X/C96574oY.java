package X;

import android.util.Log;

/* renamed from: X.4oY  reason: invalid class name and case insensitive filesystem */
public final class C96574oY implements C55132it {
    public int A00 = -1;
    public long A01 = -1;
    public C15060qG A02;
    public C32481gS A03;
    public AnonymousClass5SO A04;

    public static C85114Ne A00(C55142iu r13) {
        long A0G;
        byte[] bArr;
        C90504eH A05 = C90504eH.A05(16);
        r13.AaL(A05.A02, 0, 8);
        int A032 = C90504eH.A03(A05, 0);
        A05.A0G();
        if (A032 == 1380533830) {
            r13.AaL(A05.A02, 0, 4);
            int A033 = C90504eH.A03(A05, 0);
            if (A033 != 1463899717) {
                Log.e("WavHeaderReader", C13680ns.A0c(A033, "Unsupported RIFF format: "));
            } else {
                while (true) {
                    C90504eH.A06(r13, A05, 8);
                    int A034 = C90504eH.A03(A05, 0);
                    A0G = A05.A0G();
                    if (A034 == 1718449184) {
                        break;
                    }
                    r13.A4m((int) A0G);
                }
                C90524eJ.A04(C13700nu.A0f((A0G > 16 ? 1 : (A0G == 16 ? 0 : -1))));
                C90504eH.A06(r13, A05, 16);
                A05.A0S(0);
                int A0A = A05.A0A();
                int A0A2 = A05.A0A();
                int A09 = A05.A09();
                A05.A09();
                int A0A3 = A05.A0A();
                int A0A4 = A05.A0A();
                int i2 = ((int) A0G) - 16;
                if (i2 > 0) {
                    bArr = new byte[i2];
                    r13.AaL(bArr, 0, i2);
                } else {
                    bArr = AnonymousClass3C1.A0A;
                }
                return new C85114Ne(bArr, A0A, A0A2, A09, A0A3, A0A4);
            }
        }
        return null;
    }

    public void AHx(C15060qG r3) {
        this.A02 = r3;
        this.A03 = r3.Ah1(0, 1);
        r3.A8W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r2 != 65534) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r5 != 0) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r12, X.AnonymousClass4Bt r13) {
        /*
            r11 = this;
            X.1gS r0 = r11.A03
            X.C90524eJ.A01(r0)
            X.5SO r0 = r11.A04
            if (r0 != 0) goto L_0x0020
            X.4Ne r3 = A00(r12)
            if (r3 == 0) goto L_0x00b8
            int r2 = r3.A02
            r0 = 17
            if (r2 != r0) goto L_0x0074
            X.0qG r2 = r11.A02
            X.1gS r1 = r11.A03
            X.4pL r0 = new X.4pL
            r0.<init>(r2, r1, r3)
            r11.A04 = r0
        L_0x0020:
            int r5 = r11.A00
            r6 = -1
            if (r5 != r6) goto L_0x00bb
            r12.AcS()
            r9 = 8
            X.4eH r8 = X.C90504eH.A05(r9)
        L_0x002e:
            byte[] r1 = r8.A02
            r0 = 0
            r12.AaL(r1, r0, r9)
            int r7 = X.C90504eH.A03(r8, r0)
            long r2 = r8.A0G()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r5 = "WavHeaderReader"
            if (r7 == r0) goto L_0x00c9
            r4 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r4) goto L_0x006d
            r0 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r0) goto L_0x0056
            java.lang.String r0 = "Ignoring unknown WAV chunk: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
            android.util.Log.w(r5, r0)
        L_0x0056:
            r0 = 8
            long r2 = r2 + r0
            if (r7 == r4) goto L_0x006d
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            java.lang.String r0 = "Chunk is too large (~2GB+) to skip; id: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
        L_0x0068:
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        L_0x006d:
            r2 = 12
        L_0x006f:
            int r0 = (int) r2
            r12.Afx(r0)
            goto L_0x002e
        L_0x0074:
            r0 = 6
            if (r2 != r0) goto L_0x0086
            X.0qG r1 = r11.A02
            X.1gS r2 = r11.A03
            r5 = -1
            java.lang.String r4 = "audio/g711-alaw"
        L_0x007e:
            X.4pK r0 = new X.4pK
            r0.<init>(r1, r2, r3, r4, r5)
            r11.A04 = r0
            goto L_0x0020
        L_0x0086:
            r0 = 7
            if (r2 != r0) goto L_0x0091
            X.0qG r1 = r11.A02
            X.1gS r2 = r11.A03
            r5 = -1
            java.lang.String r4 = "audio/g711-mlaw"
            goto L_0x007e
        L_0x0091:
            int r1 = r3.A00
            r0 = 1
            if (r2 == r0) goto L_0x00ab
            r0 = 3
            if (r2 == r0) goto L_0x00a5
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r2 == r0) goto L_0x00ab
        L_0x009e:
            java.lang.String r0 = "Unsupported WAV format type: "
            java.lang.String r0 = X.C13680ns.A0c(r2, r0)
            goto L_0x0068
        L_0x00a5:
            r0 = 32
            if (r1 != r0) goto L_0x009e
            r5 = 4
            goto L_0x00b1
        L_0x00ab:
            int r5 = X.AnonymousClass3C1.A01(r1)
            if (r5 == 0) goto L_0x009e
        L_0x00b1:
            X.0qG r1 = r11.A02
            X.1gS r2 = r11.A03
            java.lang.String r4 = "audio/raw"
            goto L_0x007e
        L_0x00b8:
            java.lang.String r0 = "Unsupported or unrecognized wav header."
            goto L_0x0068
        L_0x00bb:
            long r3 = r12.AF7()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            r12.Afx(r5)
            goto L_0x0116
        L_0x00c9:
            r12.Afx(r9)
            long r9 = r12.AF7()
            long r2 = r2 + r9
            long r0 = r12.getLength()
            r7 = -1
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00f5
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f5
            java.lang.String r4 = "Data exceeds input length: "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r4)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = X.C13680ns.A0j(r4, r0)
            android.util.Log.w(r5, r2)
            r2 = r0
        L_0x00f5:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            java.lang.Object r0 = r1.first
            int r3 = X.AnonymousClass000.A0D(r0)
            r11.A00 = r3
            java.lang.Object r0 = r1.second
            long r1 = X.C13700nu.A01(r0)
            r11.A01 = r1
            X.5SO r0 = r11.A04
            r0.AHw(r3, r1)
        L_0x0116:
            long r2 = r11.A01
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C90524eJ.A04(r0)
            long r0 = r12.AF7()
            long r2 = r2 - r0
            X.5SO r0 = r11.A04
            boolean r0 = r0.Acy(r12, r2)
            if (r0 != 0) goto L_0x0131
            r6 = 0
        L_0x0131:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96574oY.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        AnonymousClass5SO r0 = this.A04;
        if (r0 != null) {
            r0.AcO(j3);
        }
    }

    public boolean Afz(C55142iu r2) {
        return AnonymousClass000.A1V(A00(r2));
    }
}
