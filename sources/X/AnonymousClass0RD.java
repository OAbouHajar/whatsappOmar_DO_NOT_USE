package X;

/* renamed from: X.0RD  reason: invalid class name */
public final class AnonymousClass0RD {
    public final float A00;
    public final AnonymousClass0R3 A01;
    public final AnonymousClass0R3 A02;

    public AnonymousClass0RD(AnonymousClass0R3 r1, AnonymousClass0R3 r2, float f2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0RD) {
                AnonymousClass0RD r5 = (AnonymousClass0RD) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A02, this.A01.hashCode() * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SplitInfo:{");
        StringBuilder A0r2 = AnonymousClass000.A0r("primaryActivityStack=");
        A0r2.append(this.A01);
        A0r2.append(',');
        AnonymousClass000.A1I(A0r2, A0r);
        StringBuilder A0r3 = AnonymousClass000.A0r("secondaryActivityStack=");
        A0r3.append(this.A02);
        A0r3.append(',');
        AnonymousClass000.A1I(A0r3, A0r);
        StringBuilder A0r4 = AnonymousClass000.A0r("splitRatio=");
        A0r4.append(this.A00);
        String A0h = AnonymousClass000.A0h(AnonymousClass000.A0k(A0r4), A0r);
        C18450wi.A0B(A0h);
        return A0h;
    }
}
