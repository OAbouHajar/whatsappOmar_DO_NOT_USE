package X;

/* renamed from: X.3l7  reason: invalid class name and case insensitive filesystem */
public final class C71833l7 extends C86344Sg {
    public final AnonymousClass4DJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71833l7(AnonymousClass4DJ r2) {
        super(12);
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C71833l7) && C18450wi.A0R(this.A00, ((C71833l7) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("ProminentSearchBarItem(searchBarClickListener="));
    }
}
