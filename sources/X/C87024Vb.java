package X;

/* renamed from: X.4Vb  reason: invalid class name and case insensitive filesystem */
public final class C87024Vb {
    public int A00;
    public final String A01;

    public C87024Vb(String str) {
        this.A01 = str;
    }

    public static int A00(C87024Vb r2) {
        return r2.A01.length() - r2.A00;
    }

    public final char A01() {
        while (!AnonymousClass000.A1P(A00(this))) {
            if (A02(0) != ' ') {
                return A02(0);
            }
            A03();
        }
        return 0;
    }

    public final char A02(int i2) {
        int i3 = this.A00;
        int i4 = i3 + i2;
        String str = this.A01;
        int length = str.length();
        if (i4 < length) {
            return str.charAt(i4);
        }
        StringBuilder A0r = AnonymousClass000.A0r("remaining data length is ");
        A0r.append(length - i3);
        throw new IndexOutOfBoundsException(C13680ns.A0i(", which is shorter than requested ", A0r, i2));
    }

    public final void A03() {
        int i2 = this.A00;
        int i3 = i2 + 1;
        int length = this.A01.length();
        if (i3 <= length) {
            this.A00 = i3;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("remaining data length is ");
        A0r.append(length - i2);
        throw new IndexOutOfBoundsException(C13680ns.A0i(", which is shorter than requested ", A0r, 1));
    }
}
