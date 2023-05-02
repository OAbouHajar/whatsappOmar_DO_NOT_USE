package X;

/* renamed from: X.3wx  reason: invalid class name and case insensitive filesystem */
public final class C78013wx extends AnonymousClass2SP {
    public final int code;

    public C78013wx(int i2) {
        this.code = i2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78013wx) && this.code == ((C78013wx) obj).code);
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
