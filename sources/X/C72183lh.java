package X;

/* renamed from: X.3lh  reason: invalid class name and case insensitive filesystem */
public final class C72183lh extends C31301dt {
    public final int A00;

    public C72183lh(int i2) {
        super(AnonymousClass428.A0a, C798541o.SECONDARY_TEXT_HEADER);
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C72183lh) && this.A00 == ((C72183lh) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SecondaryTextHeaderItem(headerType=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
