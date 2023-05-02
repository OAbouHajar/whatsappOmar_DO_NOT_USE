package X;

/* renamed from: X.5JE  reason: invalid class name */
public class AnonymousClass5JE extends C89194bk {
    public AnonymousClass5T8 A00 = new AnonymousClass5JS();

    public final byte[] A04(int i2) {
        AnonymousClass5T8 r7 = this.A00;
        int ABn = r7.ABn();
        byte[] bArr = new byte[ABn];
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A01;
            r7.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = this.A02;
            r7.update(bArr4, 0, bArr4.length);
            r7.A8A(bArr, 0);
            int i4 = i2;
            if (i2 > ABn) {
                i4 = ABn;
            }
            System.arraycopy(bArr, 0, bArr2, i3, i4);
            i3 += i4;
            i2 -= i4;
            if (i2 == 0) {
                return bArr2;
            }
            r7.reset();
            r7.update(bArr, 0, ABn);
        }
    }
}
