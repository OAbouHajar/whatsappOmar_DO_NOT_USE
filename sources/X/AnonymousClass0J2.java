package X;

/* renamed from: X.0J2  reason: invalid class name */
public final class AnonymousClass0J2 extends AnonymousClass4Q1 {
    public final C88894bG A00;
    public final Throwable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0J2(C88894bG r2, Throwable th) {
        super(r2);
        C18450wi.A0H(th, 1);
        this.A01 = th;
        this.A00 = r2;
    }

    public final Throwable A01() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0J2) {
                AnonymousClass0J2 r5 = (AnonymousClass0J2) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Failure(exception=");
        A0r.append(this.A01);
        A0r.append(", fetchSummaryData=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
