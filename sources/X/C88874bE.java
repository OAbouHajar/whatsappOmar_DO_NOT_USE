package X;

/* renamed from: X.4bE  reason: invalid class name and case insensitive filesystem */
public final class C88874bE {
    public static final C88874bE A01 = new C88874bE(false);
    public final boolean A00;

    public C88874bE(boolean z2) {
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C88874bE.class == obj.getClass() && this.A00 == ((C88874bE) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00 ^ true ? 1 : 0;
    }
}
