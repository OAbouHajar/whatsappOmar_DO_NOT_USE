package X;

/* renamed from: X.3wn  reason: invalid class name and case insensitive filesystem */
public final class C77913wn extends AnonymousClass2SG {
    public final int code;

    public C77913wn(int i2) {
        this.code = i2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77913wn) && this.code == ((C77913wn) obj).code);
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
