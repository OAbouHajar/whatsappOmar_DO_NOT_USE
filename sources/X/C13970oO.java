package X;

/* renamed from: X.0oO  reason: invalid class name and case insensitive filesystem */
public class C13970oO {
    public final Class A00;
    public final boolean A01;

    public C13970oO(Class cls, boolean z2) {
        this.A00 = cls;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13970oO)) {
            return false;
        }
        C13970oO r4 = (C13970oO) obj;
        return r4.A00.equals(this.A00) && r4.A01 == this.A01;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A01).hashCode();
    }
}
