package X;

/* renamed from: X.0R9  reason: invalid class name */
public final class AnonymousClass0R9 {
    public final int A00;
    public final int A01;

    public AnonymousClass0R9(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public static int A00(AnonymousClass0KH r0, AnonymousClass0KQ r1, int i2) {
        AnonymousClass0R9 A04 = AnonymousClass0XA.A04(r0, r1);
        return i2 != 0 ? A04.A00 : A04.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0R9) {
                AnonymousClass0R9 r5 = (AnonymousClass0R9) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CdsColorData(lightColor=");
        A0r.append(this.A01);
        A0r.append(", darkColor=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
