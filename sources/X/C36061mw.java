package X;

/* renamed from: X.1mw  reason: invalid class name and case insensitive filesystem */
public class C36061mw {
    public final String A00;
    public final C36421nW A01;

    public C36061mw(String str, C36421nW r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C36061mw)) {
            return false;
        }
        C36061mw r4 = (C36061mw) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }
}
