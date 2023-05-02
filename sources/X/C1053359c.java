package X;

import android.support.v4.view.MotionEventCompat;
import java.util.Hashtable;

/* renamed from: X.59c  reason: invalid class name and case insensitive filesystem */
public class C1053359c implements AnonymousClass5T1 {
    public static Hashtable A03 = new Hashtable();
    public static byte[] A04 = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};
    public static byte[] A05 = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
    public static byte[] A06 = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    public static byte[] A07 = {8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
    public static byte[] A08 = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};
    public static byte[] A09 = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};
    public static byte[] A0A = {4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};
    public static byte[] A0B = {12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
    public static byte[] A0C = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
    public boolean A00;
    public byte[] A01 = A0C;
    public int[] A02 = null;

    static {
        A01("Default", A0C);
        A01("E-TEST", A0A);
        A01("E-A", A06);
        A01("E-B", A07);
        A01("E-C", A08);
        A01("E-D", A09);
        A01("Param-Z", A0B);
        A01("D-TEST", A05);
        A01("D-A", A04);
    }

    public static final int A00(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] << 24) & -16777216) + ((bArr[i2 + 2] << 16) & 16711680) + ((bArr[i2 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i2] & 255);
    }

    public static void A01(String str, byte[] bArr) {
        A03.put(C32941ha.A01(str), bArr);
    }

    public final int A02(int i2, int i3) {
        int i4 = i3 + i2;
        byte[] bArr = this.A01;
        int i5 = (bArr[(i4 >> 0) & 15] << 0) + (bArr[((i4 >> 4) & 15) + 16] << 4) + (bArr[((i4 >> 8) & 15) + 32] << 8) + (bArr[((i4 >> 12) & 15) + 48] << 12) + (bArr[((i4 >> 16) & 15) + 64] << 16) + (bArr[((i4 >> 20) & 15) + 80] << 20) + (bArr[((i4 >> 24) & 15) + 96] << 24) + (bArr[((i4 >> 28) & 15) + 112] << 28);
        return (i5 << 11) | (i5 >>> 21);
    }

    public String A9q() {
        return "GOST28147";
    }

    public int AA7() {
        return 8;
    }

    public void AI1(C46932Gv r6, boolean z2) {
        String str;
        if (r6 instanceof C1053559e) {
            byte[] bArr = ((C1053559e) r6).A00;
            if (bArr.length == A0C.length) {
                this.A01 = C33111hx.A02(bArr);
                return;
            }
            str = "invalid S-box passed to GOST28147 init";
        } else if (r6 instanceof C46922Gu) {
            byte[] bArr2 = ((C46922Gu) r6).A00;
            this.A00 = z2;
            if (bArr2.length == 32) {
                int[] iArr = new int[8];
                int i2 = 0;
                do {
                    iArr[i2] = A00(bArr2, i2 << 2);
                    i2++;
                } while (i2 != 8);
                this.A02 = iArr;
                return;
            }
            str = "Key length invalid. Key needs to be 32 byte - 256 bit!!!";
        } else if (r6 != null) {
            str = AnonymousClass000.A0h(AnonymousClass000.A0d(r6), AnonymousClass000.A0r("invalid parameter passed to GOST28147 init - "));
        } else {
            return;
        }
        throw AnonymousClass000.A0T(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Aaq(byte[] r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            int[] r5 = r11.A02
            if (r5 == 0) goto L_0x00b4
            int r1 = r14 + 8
            int r0 = r12.length
            if (r1 > r0) goto L_0x00ac
            int r1 = r15 + 8
            int r0 = r13.length
            if (r1 > r0) goto L_0x00a7
            int r3 = A00(r12, r14)
            int r0 = r14 + 4
            int r10 = A00(r12, r0)
            boolean r0 = r11.A00
            r9 = 7
            r7 = 3
            r2 = 8
            r8 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0022:
            r1 = 0
        L_0x0023:
            r0 = r5[r1]
            int r0 = r11.A02(r3, r0)
            r10 = r10 ^ r0
            int r1 = r1 + 1
            r6 = r3
            r3 = r10
            r10 = r6
            if (r1 < r2) goto L_0x0023
            int r4 = r4 + 1
            if (r4 >= r7) goto L_0x0036
            goto L_0x0022
        L_0x0036:
            r0 = r5[r9]
            int r0 = r11.A02(r3, r0)
            r6 = r6 ^ r0
            int r9 = r9 + -1
            r0 = r6
            r6 = r3
            r3 = r0
            if (r9 <= 0) goto L_0x005a
            goto L_0x0036
        L_0x0045:
            r0 = r5[r4]
            int r0 = r11.A02(r3, r0)
            r10 = r10 ^ r0
            int r4 = r4 + 1
            r6 = r3
            r3 = r10
            r10 = r6
            if (r4 < r2) goto L_0x0045
            r4 = 0
        L_0x0054:
            r1 = 7
        L_0x0055:
            r0 = 2
            if (r4 != r0) goto L_0x0094
            if (r1 != 0) goto L_0x0094
        L_0x005a:
            r0 = r5[r8]
            int r4 = r11.A02(r3, r0)
            r4 = r4 ^ r6
            int r1 = r15 + 3
            int r0 = r3 >>> 24
            byte r0 = (byte) r0
            r13[r1] = r0
            int r1 = r15 + 2
            int r0 = r3 >>> 16
            byte r0 = (byte) r0
            r13[r1] = r0
            int r1 = r15 + 1
            int r0 = r3 >>> 8
            byte r0 = (byte) r0
            r13[r1] = r0
            byte r0 = (byte) r3
            r13[r15] = r0
            int r3 = r15 + 4
            int r1 = r3 + 3
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            r13[r1] = r0
            int r1 = r3 + 2
            int r0 = r4 >>> 16
            byte r0 = (byte) r0
            r13[r1] = r0
            int r1 = r3 + 1
            int r0 = r4 >>> 8
            byte r0 = (byte) r0
            r13[r1] = r0
            byte r0 = (byte) r4
            r13[r3] = r0
            return r2
        L_0x0094:
            r0 = r5[r1]
            int r0 = r11.A02(r3, r0)
            r6 = r6 ^ r0
            int r1 = r1 + -1
            r0 = r6
            r6 = r3
            r3 = r0
            if (r1 >= 0) goto L_0x0055
            int r4 = r4 + 1
            if (r4 >= r7) goto L_0x005a
            goto L_0x0054
        L_0x00a7:
            X.5JD r0 = X.AnonymousClass5JD.A00()
            throw r0
        L_0x00ac:
            java.lang.String r1 = "input buffer too short"
            X.5JI r0 = new X.5JI
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            java.lang.String r0 = "GOST28147 engine not initialised"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053359c.Aaq(byte[], byte[], int, int):int");
    }

    public void reset() {
    }
}
