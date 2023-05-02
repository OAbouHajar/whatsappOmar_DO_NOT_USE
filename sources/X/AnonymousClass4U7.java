package X;

/* renamed from: X.4U7  reason: invalid class name */
public class AnonymousClass4U7 {
    public int A00 = -1;
    public char[] A01 = new char[15];

    public void A00(char c2) {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        char[] cArr = this.A01;
        int length = cArr.length;
        if (length <= i2) {
            char[] cArr2 = new char[((length << 1) + 1)];
            System.arraycopy(cArr, 0, cArr2, 0, length);
            this.A01 = cArr2;
            cArr = cArr2;
        }
        cArr[this.A00] = c2;
    }

    public String toString() {
        return new String(this.A01, 0, this.A00 + 1);
    }
}
