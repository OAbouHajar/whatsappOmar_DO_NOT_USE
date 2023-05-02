package X;

/* renamed from: X.2Do  reason: invalid class name */
public final class AnonymousClass2Do {
    public final C46312Dn A00;
    public final String A01;
    public final String A02;

    public AnonymousClass2Do(C46312Dn r1, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass2Do.class.equals(obj == null ? null : obj.getClass())) {
                if (obj != null) {
                    AnonymousClass2Do r10 = (AnonymousClass2Do) obj;
                    String str = this.A02;
                    String str2 = r10.A02;
                    if (C18450wi.A0R(str, str2)) {
                        String str3 = this.A01;
                        String str4 = r10.A01;
                        if (C18450wi.A0R(str3, str4)) {
                            C46312Dn r2 = this.A00;
                            C46312Dn r1 = r10.A00;
                            if (!C18450wi.A0R(r2, r1) || !C18450wi.A0R(str, str2) || !C18450wi.A0R(str3, str4) || !r2.equals(r1)) {
                                return false;
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.privacy.usernotice.badge.UserNoticeBadged");
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserNoticeBadge(text='");
        sb.append(this.A02);
        sb.append("', action='");
        sb.append(this.A01);
        sb.append("', timing=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
