package X;

/* renamed from: X.1f2  reason: invalid class name and case insensitive filesystem */
public class C31791f2 {
    public final C31801f3 A00;

    public C31791f2(C36011mr r5, byte[] bArr, int i2, long j2) {
        C36691nx r3 = (C36691nx) C31801f3.A06.A0U();
        r3.A05(i2);
        byte[] A002 = r5.A01.A00();
        r3.A08(C28631Ww.A01(A002, 0, A002.length));
        byte[] bArr2 = r5.A00.A01;
        r3.A07(C28631Ww.A01(bArr2, 0, bArr2.length));
        r3.A09(C28631Ww.A01(bArr, 0, bArr.length));
        r3.A06(j2);
        this.A00 = (C31801f3) r3.A02();
    }

    public C31791f2(byte[] bArr) {
        this.A00 = (C31801f3) C28541Wm.A0E(C31801f3.A06, bArr);
    }

    public C36011mr A00() {
        try {
            C31801f3 r1 = this.A00;
            return new C36011mr(new C36671nv(r1.A03.A04(), (byte) 5), C28851Ya.A01(r1.A04.A04()));
        } catch (C31751ey e2) {
            throw new AssertionError(e2);
        }
    }
}
