package X;

/* renamed from: X.59q  reason: invalid class name and case insensitive filesystem */
public class C1054459q implements C46912Gt {
    public int A00;
    public int A01;
    public AnonymousClass5T1 A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0 = new byte[4];
        X.C31461eE.A02(r0, r2, 0);
        r4.A08 = r0;
        r4.A07 = new byte[r3];
        r4.A06 = new byte[r3];
        r4.A05 = new byte[r3];
        r4.A00 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1054459q(X.AnonymousClass5T1 r5) {
        /*
            r4 = this;
            int r3 = r5.AA7()
            int r1 = r3 << 3
            r4.<init>()
            int r0 = r1 % 8
            if (r0 != 0) goto L_0x002d
            if (r1 > r1) goto L_0x002a
            X.59X r0 = new X.59X
            r0.<init>(r5)
            r4.A02 = r0
            int r0 = r1 >> 3
            r4.A01 = r0
            r2 = 135(0x87, float:1.89E-43)
            switch(r1) {
                case 64: goto L_0x0030;
                case 128: goto L_0x0050;
                case 160: goto L_0x0033;
                case 192: goto L_0x0050;
                case 224: goto L_0x0036;
                case 256: goto L_0x0039;
                case 320: goto L_0x0030;
                case 384: goto L_0x003c;
                case 448: goto L_0x003f;
                case 512: goto L_0x0042;
                case 768: goto L_0x0045;
                case 1024: goto L_0x0049;
                case 2048: goto L_0x004d;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "Unknown block size for CMAC: "
        L_0x0021:
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x002a:
            java.lang.String r0 = "MAC size must be less or equal to "
            goto L_0x0021
        L_0x002d:
            java.lang.String r0 = "MAC size must be multiple of 8"
            goto L_0x0025
        L_0x0030:
            r2 = 27
            goto L_0x0050
        L_0x0033:
            r2 = 45
            goto L_0x0050
        L_0x0036:
            r2 = 777(0x309, float:1.089E-42)
            goto L_0x0050
        L_0x0039:
            r2 = 1061(0x425, float:1.487E-42)
            goto L_0x0050
        L_0x003c:
            r2 = 4109(0x100d, float:5.758E-42)
            goto L_0x0050
        L_0x003f:
            r2 = 2129(0x851, float:2.983E-42)
            goto L_0x0050
        L_0x0042:
            r2 = 293(0x125, float:4.1E-43)
            goto L_0x0050
        L_0x0045:
            r2 = 655377(0xa0011, float:9.18379E-40)
            goto L_0x0050
        L_0x0049:
            r2 = 524355(0x80043, float:7.34778E-40)
            goto L_0x0050
        L_0x004d:
            r2 = 548865(0x86001, float:7.69124E-40)
        L_0x0050:
            r0 = 4
            byte[] r0 = new byte[r0]
            r1 = 0
            X.C31461eE.A02(r0, r2, r1)
            r4.A08 = r0
            byte[] r0 = new byte[r3]
            r4.A07 = r0
            byte[] r0 = new byte[r3]
            r4.A06 = r0
            byte[] r0 = new byte[r3]
            r4.A05 = r0
            r4.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054459q.<init>(X.5T1):void");
    }

    public final byte[] A00(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i2 = length;
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 >= 0) {
                byte b2 = bArr[i2] & 255;
                AnonymousClass3K4.A0i(i3, bArr2, b2 << 1, i2);
                i3 = (b2 >>> 7) & 1;
            } else {
                byte b3 = (-i3) & 255;
                int i4 = length - 3;
                byte b4 = bArr2[i4];
                byte[] bArr3 = this.A08;
                bArr2[i4] = (byte) (b4 ^ (bArr3[1] & b3));
                int i5 = length - 2;
                bArr2[i5] = (byte) ((bArr3[2] & b3) ^ bArr2[i5]);
                int i6 = length - 1;
                bArr2[i6] = (byte) ((b3 & bArr3[3]) ^ bArr2[i6]);
                return bArr2;
            }
        }
    }

    public int A8A(byte[] bArr, int i2) {
        byte[] bArr2;
        AnonymousClass5T1 r5 = this.A02;
        int AA7 = r5.AA7();
        int i3 = this.A00;
        if (i3 == AA7) {
            bArr2 = this.A03;
        } else {
            new C1055359z().A4f(this.A06, i3);
            bArr2 = this.A04;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr3 = this.A07;
            if (i4 < bArr3.length) {
                byte[] bArr4 = this.A06;
                i4 = AnonymousClass3K3.A0O(bArr2, bArr4, i4, bArr4[i4]);
            } else {
                r5.Aaq(this.A06, bArr3, 0, 0);
                int i5 = this.A01;
                System.arraycopy(bArr3, 0, bArr, i2, i5);
                reset();
                return i5;
            }
        }
    }

    public int ADH() {
        return this.A01;
    }

    public void AHz(C46932Gv r5) {
        if (r5 == null || (r5 instanceof C46922Gu)) {
            AnonymousClass5T1 r3 = this.A02;
            r3.AI1(r5, true);
            byte[] bArr = this.A05;
            byte[] bArr2 = new byte[bArr.length];
            r3.Aaq(bArr, bArr2, 0, 0);
            byte[] A002 = A00(bArr2);
            this.A03 = A002;
            this.A04 = A00(A002);
            reset();
            return;
        }
        throw AnonymousClass000.A0T("CMac mode only permits key to be set.");
    }

    public void AhH(byte b2) {
        int i2 = this.A00;
        byte[] bArr = this.A06;
        if (i2 == bArr.length) {
            this.A02.Aaq(bArr, this.A07, 0, 0);
            this.A00 = 0;
            i2 = 0;
        }
        this.A00 = i2 + 1;
        bArr[i2] = b2;
    }

    public void reset() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.A06;
            if (i2 < bArr.length) {
                bArr[i2] = 0;
                i2++;
            } else {
                this.A00 = 0;
                this.A02.reset();
                return;
            }
        }
    }

    public void update(byte[] bArr, int i2, int i3) {
        if (i3 >= 0) {
            AnonymousClass5T1 r5 = this.A02;
            int AA7 = r5.AA7();
            int i4 = this.A00;
            int i5 = AA7 - i4;
            if (i3 > i5) {
                byte[] bArr2 = this.A06;
                System.arraycopy(bArr, i2, bArr2, i4, i5);
                byte[] bArr3 = this.A07;
                r5.Aaq(bArr2, bArr3, 0, 0);
                this.A00 = 0;
                i3 -= i5;
                i2 += i5;
                while (i3 > AA7) {
                    r5.Aaq(bArr, bArr3, i2, 0);
                    i3 -= AA7;
                    i2 += AA7;
                }
            }
            System.arraycopy(bArr, i2, this.A06, this.A00, i3);
            this.A00 += i3;
            return;
        }
        throw AnonymousClass000.A0T("Can't have a negative input length!");
    }
}
