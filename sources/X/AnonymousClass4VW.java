package X;

/* renamed from: X.4VW  reason: invalid class name */
public final class AnonymousClass4VW {
    public final AnonymousClass3Y2 A00;
    public final C86834Ui A01;

    public /* synthetic */ AnonymousClass4VW(AnonymousClass3Y2 r1, C86834Ui r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass4VW)) {
            AnonymousClass4VW r4 = (AnonymousClass4VW) obj;
            return AnonymousClass45A.A00(this.A01, r4.A01) && AnonymousClass45A.A00(this.A00, r4.A00);
        }
    }

    public final int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(this.A00, A1Z);
    }

    public final String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(this.A01, "key");
        r2.A00(this.A00, "feature");
        return r2.toString();
    }
}
