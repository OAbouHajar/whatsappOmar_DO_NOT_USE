package X;

/* renamed from: X.0RW  reason: invalid class name */
public final class AnonymousClass0RW {
    public final float A00;
    public final float A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public AnonymousClass0RW(String str, String str2, float f2, float f3, int i2) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = f2;
        this.A02 = i2;
        this.A01 = f3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0RW) {
                AnonymousClass0RW r5 = (AnonymousClass0RW) obj;
                if (!(C18450wi.A0R(this.A03, r5.A03) && C18450wi.A0R(this.A04, r5.A04) && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + 400) * 31, this.A00) + this.A02) * 31) + Float.floatToIntBits(this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CdsTypographyData(accessibilityRole=");
        A0r.append(this.A03);
        A0r.append(", fontFamily=");
        A0r.append(this.A04);
        A0r.append(", fontWeight=");
        A0r.append(400);
        A0r.append(", letterSpacing=");
        A0r.append(this.A00);
        A0r.append(", fontSize=");
        A0r.append(this.A02);
        A0r.append(", lineHeightMultiplier=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
