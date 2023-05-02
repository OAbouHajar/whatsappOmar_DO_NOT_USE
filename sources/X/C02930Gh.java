package X;

/* renamed from: X.0Gh  reason: invalid class name and case insensitive filesystem */
public final class C02930Gh extends AnonymousClass0MH {
    public final Throwable A00;

    public C02930Gh(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FAILURE (");
        A0r.append(this.A00.getMessage());
        return AnonymousClass000.A0h(")", A0r);
    }
}
