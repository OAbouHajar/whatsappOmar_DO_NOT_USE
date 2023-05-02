package X;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.4oZ  reason: invalid class name and case insensitive filesystem */
public final class C96584oZ implements C55132it {
    public static final int A0D;
    public static final byte[] A0E;
    public static final byte[] A0F;
    public static final int[] A0G = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] A0H;
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public long A04;
    public long A05;
    public C15060qG A06;
    public C32371gD A07;
    public C32481gS A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final byte[] A0C = new byte[1];

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0H = iArr;
        Charset charset = AnonymousClass4BH.A05;
        A0E = "#!AMR\n".getBytes(charset);
        A0F = "#!AMR-WB\n".getBytes(charset);
        A0D = iArr[8];
    }

    public final boolean A00(C55142iu r6) {
        byte[] bArr = A0E;
        r6.AcS();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        r6.AaL(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.A0B = false;
        } else {
            bArr = A0F;
            r6.AcS();
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            r6.AaL(bArr3, 0, length2);
            if (!Arrays.equals(bArr3, bArr)) {
                return false;
            }
            this.A0B = true;
        }
        r6.Afx(bArr.length);
        return true;
    }

    public void AHx(C15060qG r3) {
        this.A06 = r3;
        this.A08 = r3.Ah1(0, 1);
        r3.A8W();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r12, X.AnonymousClass4Bt r13) {
        /*
            r11 = this;
            X.1gS r0 = r11.A08
            X.C90524eJ.A01(r0)
            long r4 = r12.AF7()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            boolean r0 = r11.A00(r12)
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "Could not find AMR header."
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        L_0x001c:
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x003e
            r6 = 1
            r11.A09 = r6
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "audio/amr-wb"
            r5 = 16000(0x3e80, float:2.2421E-41)
        L_0x002b:
            X.1gS r4 = r11.A08
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            r1.A0R = r0
            int r0 = A0D
            r1.A08 = r0
            r1.A04 = r6
            r1.A0D = r5
            X.AnonymousClass3K3.A19(r1, r4)
        L_0x003e:
            int r1 = r11.A00
            r4 = -1
            if (r1 != 0) goto L_0x00bd
            goto L_0x0049
        L_0x0044:
            java.lang.String r0 = "audio/3gpp"
            r5 = 8000(0x1f40, float:1.121E-41)
            goto L_0x002b
        L_0x0049:
            r12.AcS()     // Catch:{ EOFException -> 0x00e6 }
            byte[] r5 = r11.A0C     // Catch:{ EOFException -> 0x00e6 }
            r1 = 0
            r0 = 1
            r12.AaL(r5, r1, r0)     // Catch:{ EOFException -> 0x00e6 }
            byte r1 = r5[r1]     // Catch:{ EOFException -> 0x00e6 }
            r0 = r1 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L_0x00a1
            int r0 = r1 >> 3
            r5 = r0 & 15
            if (r5 < 0) goto L_0x0084
            r0 = 15
            if (r5 > r0) goto L_0x0084
            boolean r1 = r11.A0B     // Catch:{ EOFException -> 0x00e6 }
            if (r1 == 0) goto L_0x0068
            goto L_0x006f
        L_0x0068:
            r0 = 12
            if (r5 < r0) goto L_0x007a
            r0 = 14
            goto L_0x0075
        L_0x006f:
            r0 = 10
            if (r5 < r0) goto L_0x007d
            r0 = 13
        L_0x0075:
            if (r5 <= r0) goto L_0x0084
            if (r1 == 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            int[] r0 = A0G     // Catch:{ EOFException -> 0x00e6 }
            goto L_0x007f
        L_0x007d:
            int[] r0 = A0H     // Catch:{ EOFException -> 0x00e6 }
        L_0x007f:
            r1 = r0[r5]     // Catch:{ EOFException -> 0x00e6 }
            r11.A01 = r1     // Catch:{ EOFException -> 0x00e6 }
            goto L_0x00ac
        L_0x0084:
            java.lang.String r0 = "Illegal AMR "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ EOFException -> 0x00e6 }
            boolean r0 = r11.A0B     // Catch:{ EOFException -> 0x00e6 }
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "WB"
        L_0x0090:
            r1.append(r0)     // Catch:{ EOFException -> 0x00e6 }
            java.lang.String r0 = " frame type "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r5)     // Catch:{ EOFException -> 0x00e6 }
            X.40M r0 = X.AnonymousClass40M.A00(r0)     // Catch:{ EOFException -> 0x00e6 }
            goto L_0x00ab
        L_0x009e:
            java.lang.String r0 = "NB"
            goto L_0x0090
        L_0x00a1:
            java.lang.String r0 = "Invalid padding bits for frame header "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ EOFException -> 0x00e6 }
            X.40M r0 = X.AnonymousClass40M.A00(r0)     // Catch:{ EOFException -> 0x00e6 }
        L_0x00ab:
            throw r0     // Catch:{ EOFException -> 0x00e6 }
        L_0x00ac:
            r11.A00 = r1
            int r0 = r11.A02
            if (r0 != r4) goto L_0x00b5
            r0 = r1
            r11.A02 = r1
        L_0x00b5:
            if (r0 != r1) goto L_0x00bd
            int r0 = r11.A03
            int r0 = r0 + 1
            r11.A03 = r0
        L_0x00bd:
            X.1gS r0 = r11.A08
            r6 = 1
            r8 = 0
            int r1 = r0.Acz(r12, r1, r8, r6)
            if (r1 != r4) goto L_0x00c9
            r7 = -1
            goto L_0x00e7
        L_0x00c9:
            int r0 = r11.A00
            int r0 = r0 - r1
            r11.A00 = r0
            if (r0 > 0) goto L_0x00e4
            X.1gS r4 = r11.A08
            long r9 = r11.A05
            long r0 = r11.A04
            long r9 = r9 + r0
            int r7 = r11.A01
            r5 = 0
            r4.Ad0(r5, r6, r7, r8, r9)
            long r4 = r11.A04
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r4 = r4 + r0
            r11.A04 = r4
        L_0x00e4:
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = -1
        L_0x00e7:
            boolean r0 = r11.A0A
            if (r0 != 0) goto L_0x00ff
            r6 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.1gC r1 = new X.1gC
            r1.<init>(r4, r2)
            r11.A07 = r1
            X.0qG r0 = r11.A06
            r0.AdD(r1)
            r11.A0A = r6
        L_0x00ff:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96584oZ.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0;
        if (j2 != 0) {
            C32371gD r1 = this.A07;
            if (r1 instanceof C96744op) {
                this.A05 = ((C96744op) r1).A00(j2);
                return;
            }
        }
        this.A05 = 0;
    }

    public boolean Afz(C55142iu r2) {
        return A00(r2);
    }
}
