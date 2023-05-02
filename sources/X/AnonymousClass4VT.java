package X;

/* renamed from: X.4VT  reason: invalid class name */
public final class AnonymousClass4VT {
    public final String A00;

    public AnonymousClass4VT(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4VT) && C18450wi.A0R(this.A00, ((AnonymousClass4VT) obj).A00));
    }

    public int hashCode() {
        return 4650 + AnonymousClass000.A0G(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BusinessApiResultsPage(pageSize=");
        A0r.append(150);
        A0r.append(", pageId=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
