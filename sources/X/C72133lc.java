package X;

/* renamed from: X.3lc  reason: invalid class name and case insensitive filesystem */
public final class C72133lc extends C31301dt {
    public final AnonymousClass4DO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72133lc(AnonymousClass4DO r2) {
        super(AnonymousClass428.A0O);
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C72133lc) && C18450wi.A0R(this.A00, ((C72133lc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("NearbyBusinessLocationRequestItem(nearbyLocationRequestClickListener="));
    }
}
