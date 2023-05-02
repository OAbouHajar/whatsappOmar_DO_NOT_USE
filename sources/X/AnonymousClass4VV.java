package X;

/* renamed from: X.4VV  reason: invalid class name */
public final class AnonymousClass4VV {
    public final C89174bi A00;
    public final C89174bi A01;

    public AnonymousClass4VV(C89174bi r1, C89174bi r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass4VV A00(C89174bi r2, long j2, long j3) {
        return new AnonymousClass4VV(r2, new C89174bi(j2, j3));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4VV.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4VV r5 = (AnonymousClass4VV) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass3K3.A0H(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        C89174bi r0 = this.A00;
        A0r.append(r0);
        C89174bi r1 = this.A01;
        A0r.append(r0.equals(r1) ? "" : AnonymousClass000.A0g(", ", r1));
        return AnonymousClass000.A0h("]", A0r);
    }
}
