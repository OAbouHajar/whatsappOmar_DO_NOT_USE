package X;

/* renamed from: X.4WL  reason: invalid class name */
public final class AnonymousClass4WL {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass4WL(String str, String str2, String str3, boolean z2) {
        this.A03 = z2;
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WL) {
                AnonymousClass4WL r5 = (AnonymousClass4WL) obj;
                if (this.A03 != r5.A03 || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        int i2 = 0;
        int A0G = (((((z2 ? 1 : 0) * true) + AnonymousClass000.A0G(this.A02)) * 31) + AnonymousClass000.A0G(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0G + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("TopBannerViewUpdateEvent(showBanner=");
        A0r.append(this.A03);
        A0r.append(", title=");
        A0r.append(this.A02);
        A0r.append(", fbFollowerCount=");
        A0r.append(this.A00);
        A0r.append(", igFollowerCount=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
