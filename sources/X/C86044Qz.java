package X;

/* renamed from: X.4Qz  reason: invalid class name and case insensitive filesystem */
public class C86044Qz {
    public int A00;
    public byte[] A01 = new byte[200];

    public boolean A00(byte[] bArr) {
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return true;
            }
            int i3 = (this.A00 - i2) - 1;
            if (i3 < 0) {
                i3 += this.A01.length;
            }
            if (this.A01[i3] != bArr[(length - i2) - 1]) {
                return false;
            }
            i2++;
        }
    }
}
