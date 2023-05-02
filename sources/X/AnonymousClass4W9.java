package X;

/* renamed from: X.4W9  reason: invalid class name */
public final class AnonymousClass4W9 {
    public final C35301lh A00;
    public final C35301lh A01;
    public final C35301lh A02;

    public AnonymousClass4W9(C35301lh r2, C35301lh r3, C35301lh r4) {
        C18450wi.A0J(r2, r3);
        C18450wi.A0H(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W9) {
                AnonymousClass4W9 r5 = (AnonymousClass4W9) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A02, AnonymousClass000.A0E(this.A01, AnonymousClass3K3.A0H(this.A00)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("XFamilyFbUserEntity(accessToken=");
        A0r.append(this.A00);
        A0r.append(", fullName=");
        A0r.append(this.A01);
        A0r.append(", profilePictureUrl=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
