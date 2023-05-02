package X;

/* renamed from: X.4Wz  reason: invalid class name and case insensitive filesystem */
public abstract class C87494Wz {
    public boolean equals(Object obj) {
        if (!(obj instanceof C87494Wz)) {
            return false;
        }
        C87494Wz r4 = (C87494Wz) obj;
        return getCount() == r4.getCount() && AnonymousClass45Q.A00(getElement(), r4.getElement());
    }

    public abstract int getCount();

    public abstract Object getElement();

    public int hashCode() {
        return AnonymousClass000.A0C(getElement()) ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(getElement());
        int count = getCount();
        if (count == 1) {
            return valueOf;
        }
        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 14);
        A0g.append(valueOf);
        return C13680ns.A0i(" x ", A0g, count);
    }
}
