package X;

/* renamed from: X.4aw  reason: invalid class name and case insensitive filesystem */
public final class C88694aw {
    public static final long[] A03 = {128, 64, 32, 16, 8, 4, 2, 1};
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public long A00(C55142iu r11, int i2, boolean z2, boolean z3) {
        if (this.A01 == 0) {
            byte[] bArr = this.A02;
            if (!r11.AbV(bArr, 0, 1, z2)) {
                return -1;
            }
            byte b2 = bArr[0] & 255;
            int i3 = 0;
            while (true) {
                long[] jArr = A03;
                if (i3 >= jArr.length) {
                    i3 = -1;
                    break;
                }
                int i4 = ((jArr[i3] & ((long) b2)) > 0 ? 1 : ((jArr[i3] & ((long) b2)) == 0 ? 0 : -1));
                i3++;
                if (i4 != 0) {
                    break;
                }
            }
            this.A00 = i3;
            if (i3 != -1) {
                this.A01 = 1;
            } else {
                throw AnonymousClass000.A0V("No valid varint length mask found");
            }
        }
        int i5 = this.A00;
        if (i5 > i2) {
            this.A01 = 0;
            return -2;
        }
        if (i5 != 1) {
            r11.readFully(this.A02, 1, i5 - 1);
        }
        this.A01 = 0;
        byte[] bArr2 = this.A02;
        int i6 = this.A00;
        long j2 = ((long) bArr2[0]) & 255;
        if (z3) {
            j2 &= A03[i6 - 1] ^ -1;
        }
        for (int i7 = 1; i7 < i6; i7++) {
            j2 = (j2 << 8) | (((long) bArr2[i7]) & 255);
        }
        return j2;
    }
}
