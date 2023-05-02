package X;

/* renamed from: X.3y3  reason: invalid class name and case insensitive filesystem */
public final class C78443y3 extends C811447a {
    public final String A00;

    public C78443y3(String str) {
        C18450wi.A0H(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78443y3) && C18450wi.A0R(this.A00, ((C78443y3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Error(reason=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
