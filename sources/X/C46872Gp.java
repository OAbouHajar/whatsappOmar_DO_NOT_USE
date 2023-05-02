package X;

/* renamed from: X.2Gp  reason: invalid class name and case insensitive filesystem */
public class C46872Gp {
    public static C46882Gq A00(byte[] bArr, byte[] bArr2) {
        StringBuilder sb;
        C46882Gq r5 = new C46882Gq();
        C1054259l r1 = new C1054259l(new C46922Gu(bArr, bArr.length), bArr2);
        byte[] bArr3 = r1.A01;
        if (bArr3.length == 24) {
            C46932Gv r12 = r1.A00;
            if (r12 == null) {
                if (r5.A04) {
                    sb.append(" doesn't support re-init with null key");
                    throw new IllegalArgumentException(sb.toString());
                }
                sb = new StringBuilder("XSalsa20");
                sb.append(" KeyParameter can not be null for first initialisation");
                throw new IllegalStateException(sb.toString());
            } else if (r12 instanceof C46922Gu) {
                byte[] bArr4 = ((C46922Gu) r12).A00;
                if (bArr4.length == 32) {
                    int i2 = 16;
                    int[] iArr = r5.A06;
                    int[] iArr2 = C46882Gq.A0A;
                    iArr[0] = iArr2[4];
                    iArr[5] = iArr2[5];
                    iArr[10] = iArr2[6];
                    iArr[15] = iArr2[7];
                    int i3 = 0;
                    int i4 = 0;
                    do {
                        i4++;
                        iArr[i4] = C31461eE.A01(bArr4, i3);
                        i3 += 4;
                    } while (i4 < 4);
                    int i5 = 0;
                    do {
                        iArr[i5 + 11] = C31461eE.A01(bArr4, i2);
                        i2 += 4;
                        i5++;
                    } while (i5 < 4);
                    int i6 = 0;
                    int i7 = 0;
                    do {
                        iArr[i7 + 6] = C31461eE.A01(bArr3, i6);
                        i6 += 4;
                        i7++;
                    } while (i7 < 2);
                    int i8 = 8;
                    int i9 = 0;
                    do {
                        iArr[i9 + 8] = C31461eE.A01(bArr3, i8);
                        i8 += 4;
                        i9++;
                    } while (i9 < 2);
                    int[] iArr3 = new int[iArr.length];
                    C46882Gq.A00(iArr, iArr3);
                    iArr[1] = iArr3[0] - iArr[0];
                    iArr[2] = iArr3[5] - iArr[5];
                    iArr[3] = iArr3[10] - iArr[10];
                    iArr[4] = iArr3[15] - iArr[15];
                    iArr[11] = iArr3[6] - iArr[6];
                    iArr[12] = iArr3[7] - iArr[7];
                    iArr[13] = iArr3[8] - iArr[8];
                    iArr[14] = iArr3[9] - iArr[9];
                    int i10 = 16;
                    int i11 = 0;
                    do {
                        iArr[i11 + 6] = C31461eE.A01(bArr3, i10);
                        i10 += 4;
                        i11++;
                    } while (i11 < 2);
                    r5.A03 = 0;
                    r5.A00 = 0;
                    r5.A01 = 0;
                    r5.A02 = 0;
                    int i12 = 0;
                    iArr[9] = 0;
                    iArr[8] = 0;
                    byte[] bArr5 = r5.A05;
                    int[] iArr4 = r5.A07;
                    C46882Gq.A00(iArr, iArr4);
                    for (int A03 : iArr4) {
                        C31461eE.A03(bArr5, A03, i12);
                        i12 += 4;
                    }
                    r5.A04 = true;
                    return r5;
                }
                StringBuilder sb2 = new StringBuilder("XSalsa20");
                sb2.append(" requires a 256 bit key");
                throw new IllegalArgumentException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder("XSalsa20");
                sb3.append(" Init parameters must contain a KeyParameter (or null for re-init)");
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder("XSalsa20");
            sb4.append(" requires exactly ");
            sb4.append(24);
            sb4.append(" bytes of IV");
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C46882Gq A00 = A00(bArr, bArr2);
        C46902Gs r1 = new C46902Gs();
        byte[] bArr4 = new byte[32];
        A00.A01(bArr4, bArr4, 0, 32, 0);
        int length = bArr3.length;
        byte[] bArr5 = new byte[(length + 16)];
        A00.A01(bArr3, bArr5, 0, length, 16);
        r1.AHz(new C46922Gu(bArr4, 32));
        r1.update(bArr5, 16, length);
        r1.A8A(bArr5, 0);
        return bArr5;
    }
}
