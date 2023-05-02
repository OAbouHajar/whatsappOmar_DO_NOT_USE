package X;

/* renamed from: X.4Qd  reason: invalid class name and case insensitive filesystem */
public final class C85834Qd {
    public int A00 = 0;
    public final String A01;

    public C85834Qd(String str) {
        this.A01 = str;
    }

    public final int A00() {
        String str = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        char charAt = str.charAt(i2);
        if (charAt < 55296) {
            return charAt;
        }
        char c2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = this.A00;
            this.A00 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                return c2 | (charAt2 << i3);
            }
            c2 |= (charAt2 & 8191) << i3;
            i3 += 13;
        }
    }
}
