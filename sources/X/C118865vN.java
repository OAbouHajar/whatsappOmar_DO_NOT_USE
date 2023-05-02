package X;

/* renamed from: X.5vN  reason: invalid class name and case insensitive filesystem */
public final class C118865vN {
    public final String A00;

    public C118865vN(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C118865vN) && C18450wi.A0R(this.A00, ((C118865vN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Device(paymentDeviceId=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
