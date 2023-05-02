package X;

/* renamed from: X.4Vl  reason: invalid class name and case insensitive filesystem */
public final class C87114Vl {
    public final long A00;
    public final String A01;

    public C87114Vl(String str, long j2) {
        this.A01 = str;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C87114Vl.class != obj.getClass()) {
                return false;
            }
            C87114Vl r7 = (C87114Vl) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(Long.valueOf(this.A00), A1Z);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("{ path = ");
        AnonymousClass3K3.A1N(A0r, this.A01);
        A0r.append("size");
        A0r.append(" = ");
        A0r.append(this.A00);
        return AnonymousClass000.A0h(" } \n", A0r);
    }
}
