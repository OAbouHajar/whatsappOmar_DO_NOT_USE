package X;

/* renamed from: X.3l2  reason: invalid class name and case insensitive filesystem */
public final class C71783l2 extends C86344Sg {
    public final int A00;

    public C71783l2(int i2) {
        super(9);
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C71783l2) && this.A00 == ((C71783l2) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SpaceViewItem(height=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
