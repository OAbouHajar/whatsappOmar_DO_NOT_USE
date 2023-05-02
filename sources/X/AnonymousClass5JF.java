package X;

/* renamed from: X.5JF  reason: invalid class name */
public class AnonymousClass5JF extends C89194bk {
    public AnonymousClass5T8 A00;

    public AnonymousClass5JF(AnonymousClass5T8 r1) {
        this.A00 = r1;
    }

    public final byte[] A04() {
        AnonymousClass5T8 r5 = this.A00;
        int ABn = r5.ABn();
        byte[] bArr = new byte[ABn];
        byte[] bArr2 = this.A01;
        r5.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.A02;
        r5.update(bArr3, 0, bArr3.length);
        r5.A8A(bArr, 0);
        for (int i2 = 1; i2 < this.A00; i2++) {
            r5.update(bArr, 0, ABn);
            r5.A8A(bArr, 0);
        }
        return bArr;
    }
}
