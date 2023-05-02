package X;

/* renamed from: X.0Gd  reason: invalid class name and case insensitive filesystem */
public final class C02900Gd extends AnonymousClass02Q {
    public final C007203h A00;

    public C02900Gd(C007203h r1) {
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C02900Gd.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C02900Gd) obj).A00);
    }

    public int hashCode() {
        return (C02900Gd.class.getName().hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Success {mOutputData=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
