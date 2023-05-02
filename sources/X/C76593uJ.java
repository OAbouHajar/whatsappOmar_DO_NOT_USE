package X;

/* renamed from: X.3uJ  reason: invalid class name and case insensitive filesystem */
public final class C76593uJ extends C810946u {
    public final String A00;

    public C76593uJ(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76593uJ) && C18450wi.A0R(this.A00, ((C76593uJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DebugInfo(debugInfoJson=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
