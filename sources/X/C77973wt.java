package X;

/* renamed from: X.3wt  reason: invalid class name and case insensitive filesystem */
public final class C77973wt extends AnonymousClass2SJ {
    public final int code;

    public C77973wt(int i2) {
        this.code = i2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77973wt) && this.code == ((C77973wt) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("UnknownErrorCode(code=");
        A0r.append(this.code);
        return AnonymousClass000.A0j(A0r);
    }
}
