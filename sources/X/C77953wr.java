package X;

/* renamed from: X.3wr  reason: invalid class name and case insensitive filesystem */
public final class C77953wr extends AnonymousClass2SJ {
    public final Throwable throwable;

    public C77953wr(Throwable th) {
        this.throwable = th;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77953wr) && C18450wi.A0R(this.throwable, ((C77953wr) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.throwable, AnonymousClass000.A0r("Error(throwable="));
    }
}
