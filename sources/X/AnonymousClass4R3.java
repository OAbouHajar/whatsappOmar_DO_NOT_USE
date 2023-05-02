package X;

/* renamed from: X.4R3  reason: invalid class name */
public class AnonymousClass4R3 {
    public byte[] A00;
    public long[][] A01;

    public void A00(byte[] bArr) {
        long[][] jArr = this.A01;
        byte[] bArr2 = bArr;
        long[] jArr2 = jArr[bArr[15] & 255];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        for (int i2 = 14; i2 >= 0; i2--) {
            long[] jArr3 = jArr[bArr[i2] & 255];
            long j4 = j3 << 56;
            j3 = ((j3 >>> 8) | (j2 << 56)) ^ jArr3[1];
            j2 = (((((j2 >>> 8) ^ jArr3[0]) ^ j4) ^ (j4 >>> 1)) ^ (j4 >>> 2)) ^ (j4 >>> 7);
        }
        C31461eE.A04(bArr2, 0, j2);
        C31461eE.A04(bArr2, 8, j3);
    }
}
