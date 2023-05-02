package X;

/* renamed from: X.3ho  reason: invalid class name and case insensitive filesystem */
public final class C70833ho extends C807845n {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public C70833ho(String str, int i2, int i3, boolean z2) {
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = z2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70833ho) {
                C70833ho r5 = (C70833ho) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && C18450wi.A0R(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = ((this.A00 * 31) + this.A01) * 31;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        return AnonymousClass3K4.A08(this.A02, (i2 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarBackground(backgroundColor=");
        A0r.append(this.A00);
        A0r.append(", ringColor=");
        A0r.append(this.A01);
        A0r.append(", isSelected=");
        A0r.append(this.A03);
        A0r.append(", contentDescription=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
