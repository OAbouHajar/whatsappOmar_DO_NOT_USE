package X;

/* renamed from: X.3wl  reason: invalid class name and case insensitive filesystem */
public final class C77893wl extends AnonymousClass2SG {
    public final Throwable throwable;

    public C77893wl(Throwable th) {
        this.throwable = th;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77893wl) && C18450wi.A0R(this.throwable, ((C77893wl) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.throwable, AnonymousClass000.A0r("Error(throwable="));
    }
}
