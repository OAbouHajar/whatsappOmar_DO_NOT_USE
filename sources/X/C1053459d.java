package X;

/* renamed from: X.59d  reason: invalid class name and case insensitive filesystem */
public abstract class C1053459d implements AnonymousClass5T1, C46892Gr {
    public final AnonymousClass5T1 A00;

    public C1053459d(AnonymousClass5T1 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d9, code lost:
        if (r0 == r2) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0205, code lost:
        if (r1 == r2) goto L_0x01db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte A00(byte r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass5JO
            if (r0 == 0) goto L_0x0058
            r7 = r8
            X.5JO r7 = (X.AnonymousClass5JO) r7
            int r1 = r7.A00
            r3 = 0
            if (r1 != 0) goto L_0x0020
            X.5T1 r1 = r7.A05
            byte[] r0 = r7.A02
            byte[] r2 = r7.A03
            r1.Aaq(r0, r2, r3, r3)
            int r1 = r7.A00
            int r0 = r1 + 1
            r7.A00 = r0
            byte r0 = r2[r1]
            r9 = r9 ^ r0
            byte r6 = (byte) r9
        L_0x001f:
            return r6
        L_0x0020:
            byte[] r0 = r7.A03
            int r2 = r1 + 1
            r7.A00 = r2
            byte r0 = r0[r1]
            r9 = r9 ^ r0
            byte r6 = (byte) r9
            byte[] r5 = r7.A02
            int r1 = r5.length
            if (r2 != r1) goto L_0x001f
            r7.A00 = r3
        L_0x0031:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x003e
            byte r0 = r5[r1]
            int r0 = r0 + 1
            byte r0 = (byte) r0
            r5[r1] = r0
            if (r0 == 0) goto L_0x0031
        L_0x003e:
            byte[] r4 = r7.A01
            int r3 = r4.length
            int r0 = r7.A04
            if (r3 >= r0) goto L_0x001f
            r2 = 0
        L_0x0046:
            if (r2 == r3) goto L_0x001f
            byte r1 = r5[r2]
            byte r0 = r4[r2]
            if (r1 != r0) goto L_0x0051
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0051:
            java.lang.String r0 = "Counter in CTR/SIC mode out of range."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0058:
            boolean r0 = r8 instanceof X.AnonymousClass5JK
            if (r0 == 0) goto L_0x008a
            r7 = r8
            X.5JK r7 = (X.AnonymousClass5JK) r7
            int r0 = r7.A00
            r3 = 0
            if (r0 != 0) goto L_0x006d
            X.5T1 r2 = r7.A05
            byte[] r1 = r7.A03
            byte[] r0 = r7.A02
            r2.Aaq(r1, r0, r3, r3)
        L_0x006d:
            byte[] r6 = r7.A02
            int r0 = r7.A00
            int r1 = r0 + 1
            r7.A00 = r1
            byte r0 = r6[r0]
            r9 = r9 ^ r0
            byte r5 = (byte) r9
            int r4 = r7.A04
            if (r1 != r4) goto L_0x0089
            r7.A00 = r3
            byte[] r1 = r7.A03
        L_0x0081:
            int r0 = r1.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r1, r4, r1, r3, r0)
            java.lang.System.arraycopy(r6, r3, r1, r0, r4)
        L_0x0089:
            return r5
        L_0x008a:
            boolean r0 = r8 instanceof X.AnonymousClass5JM
            if (r0 == 0) goto L_0x014c
            r2 = r8
            X.5JM r2 = (X.AnonymousClass5JM) r2
            int r0 = r2.A02
            r3 = 0
            if (r0 != 0) goto L_0x0136
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00ea
            r2.A03 = r3
            X.5T1 r1 = r2.A08
            byte[] r0 = r2.A06
            byte[] r5 = r2.A05
            r1.Aaq(r0, r5, r3, r3)
            r0 = 3
            byte r0 = r5[r0]
            int r4 = r0 << 24
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r0
            r0 = 2
            byte r0 = r5[r0]
            int r1 = r0 << 16
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r0
            int r4 = r4 + r1
            r0 = 1
            byte r0 = r5[r0]
            int r1 = r0 << 8
            r0 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            int r4 = r4 + r1
            byte r0 = r5[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r0
            r2.A00 = r4
            r6 = 4
            r0 = 7
            byte r0 = r5[r0]
            int r4 = r0 << 24
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r0
            r0 = 6
            byte r0 = r5[r0]
            int r1 = r0 << 16
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r0
            int r4 = r4 + r1
            r0 = 5
            byte r0 = r5[r0]
            int r1 = r0 << 8
            r0 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            int r4 = r4 + r1
            byte r0 = r5[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r0
            r2.A01 = r4
        L_0x00ea:
            int r5 = r2.A00
            r0 = 16843009(0x1010101, float:2.3694278E-38)
            int r5 = r5 + r0
            r2.A00 = r5
            int r6 = r2.A01
            r0 = 16843012(0x1010104, float:2.3694287E-38)
            int r6 = r6 + r0
            r2.A01 = r6
            if (r6 >= r0) goto L_0x0102
            if (r6 <= 0) goto L_0x0102
            int r6 = r6 + 1
            r2.A01 = r6
        L_0x0102:
            byte[] r4 = r2.A06
            r1 = 3
            int r0 = r5 >>> 24
            byte r0 = (byte) r0
            r4[r1] = r0
            r1 = 2
            int r0 = r5 >>> 16
            byte r0 = (byte) r0
            r4[r1] = r0
            r1 = 1
            int r0 = r5 >>> 8
            byte r0 = (byte) r0
            r4[r1] = r0
            byte r0 = (byte) r5
            r4[r3] = r0
            r5 = 4
            r1 = 7
            int r0 = r6 >>> 24
            byte r0 = (byte) r0
            r4[r1] = r0
            r1 = 6
            int r0 = r6 >>> 16
            byte r0 = (byte) r0
            r4[r1] = r0
            r1 = 5
            int r0 = r6 >>> 8
            byte r0 = (byte) r0
            r4[r1] = r0
            byte r0 = (byte) r6
            r4[r5] = r0
            X.5T1 r1 = r2.A08
            byte[] r0 = r2.A05
            r1.Aaq(r4, r0, r3, r3)
        L_0x0136:
            byte[] r6 = r2.A05
            int r0 = r2.A02
            int r1 = r0 + 1
            r2.A02 = r1
            byte r0 = r6[r0]
            r9 = r9 ^ r0
            byte r5 = (byte) r9
            int r4 = r2.A07
            if (r1 != r4) goto L_0x0089
            r2.A02 = r3
            byte[] r1 = r2.A06
            goto L_0x0081
        L_0x014c:
            boolean r0 = r8 instanceof X.AnonymousClass5JN
            if (r0 == 0) goto L_0x01b2
            r4 = r8
            X.5JN r4 = (X.AnonymousClass5JN) r4
            long r2 = r4.A00
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a4
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 % r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            X.5JL r5 = r4.A03
            X.5T1 r7 = r5.A00
            X.2Gu r0 = r4.A01
            r6 = 0
            r7.AI1(r0, r6)
            r0 = 32
            byte[] r2 = new byte[r0]
            byte[] r1 = X.AnonymousClass5JN.A04
            r7.Aaq(r1, r2, r6, r6)
            r0 = 8
            r7.Aaq(r1, r2, r0, r0)
            r0 = 16
            r7.Aaq(r1, r2, r0, r0)
            r0 = 24
            r7.Aaq(r1, r2, r0, r0)
            X.2Gu r1 = new X.2Gu
            r1.<init>(r2)
            r4.A01 = r1
            r0 = 1
            r7.AI1(r1, r0)
            byte[] r0 = r5.A06
            byte[] r3 = X.C33111hx.A02(r0)
            r7.Aaq(r3, r3, r6, r6)
            boolean r2 = r4.A02
            X.2Gu r1 = r4.A01
            X.59l r0 = new X.59l
            r0.<init>(r1, r3)
            r5.AI1(r0, r2)
        L_0x01a4:
            long r2 = r4.A00
            r0 = 1
            long r2 = r2 + r0
            r4.A00 = r2
            X.5JL r0 = r4.A03
            byte r0 = r0.A00(r9)
            return r0
        L_0x01b2:
            r6 = r8
            X.5JL r6 = (X.AnonymousClass5JL) r6
            boolean r1 = r6.A03
            int r0 = r6.A01
            r5 = 0
            if (r1 == 0) goto L_0x01e8
            if (r0 != 0) goto L_0x01c7
            X.5T1 r2 = r6.A02
            byte[] r1 = r6.A06
            byte[] r0 = r6.A05
            r2.Aaq(r1, r0, r5, r5)
        L_0x01c7:
            byte[] r0 = r6.A05
            int r1 = r6.A01
            byte r0 = r0[r1]
            r9 = r9 ^ r0
            byte r4 = (byte) r9
            byte[] r3 = r6.A07
            int r0 = r1 + 1
            r6.A01 = r0
            r3[r1] = r4
            int r2 = r6.A00
            if (r0 != r2) goto L_0x01e7
        L_0x01db:
            r6.A01 = r5
            byte[] r1 = r6.A06
            int r0 = r1.length
            int r0 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r5, r0)
            java.lang.System.arraycopy(r3, r5, r1, r0, r2)
        L_0x01e7:
            return r4
        L_0x01e8:
            if (r0 != 0) goto L_0x01f3
            X.5T1 r2 = r6.A02
            byte[] r1 = r6.A06
            byte[] r0 = r6.A05
            r2.Aaq(r1, r0, r5, r5)
        L_0x01f3:
            byte[] r3 = r6.A07
            int r2 = r6.A01
            r3[r2] = r9
            byte[] r0 = r6.A05
            int r1 = r2 + 1
            r6.A01 = r1
            byte r0 = r0[r2]
            r9 = r9 ^ r0
            byte r4 = (byte) r9
            int r2 = r6.A00
            if (r1 != r2) goto L_0x01e7
            goto L_0x01db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053459d.A00(byte):byte");
    }

    public void A01(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            throw new AnonymousClass5JI("input buffer too small");
        } else if (i4 + i3 > bArr2.length) {
            throw AnonymousClass5JD.A00();
        } else {
            while (i2 < i5) {
                bArr2[i4] = A00(bArr[i2]);
                i4++;
                i2++;
            }
        }
    }
}
