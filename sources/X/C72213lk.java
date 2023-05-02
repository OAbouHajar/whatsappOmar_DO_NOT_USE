package X;

/* renamed from: X.3lk  reason: invalid class name and case insensitive filesystem */
public final class C72213lk extends C31301dt {
    public final int A00;
    public final AnonymousClass26B A01;
    public final AnonymousClass1DU A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72213lk(AnonymousClass26B r2, AnonymousClass1DU r3, int i2) {
        super(AnonymousClass428.A0E);
        C18450wi.A0I(r2, 2, r3);
        this.A00 = i2;
        this.A01 = r2;
        this.A02 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72213lk) {
                C72213lk r5 = (C72213lk) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A02, AnonymousClass000.A0E(this.A01, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("HeaderWithLocationViewItem(title=");
        A0r.append(this.A00);
        A0r.append(", searchLocation=");
        A0r.append(this.A01);
        A0r.append(", onLocationClickListener=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
