package X;

/* renamed from: X.2HX  reason: invalid class name */
public final class AnonymousClass2HX {
    public final C35301lh A00;
    public final C35301lh A01;

    public AnonymousClass2HX(C35301lh r1, C35301lh r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2HX) {
                AnonymousClass2HX r5 = (AnonymousClass2HX) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvatarUserBackup(fbId=");
        sb.append(this.A00);
        sb.append(", password=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
