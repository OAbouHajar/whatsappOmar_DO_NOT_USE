package X;

/* renamed from: X.3qT  reason: invalid class name and case insensitive filesystem */
public final class C74393qT extends C16470t7 {
    public Boolean A00;

    public C74393qT() {
        super(2520, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdAppStateDirtyBits {");
        C16470t7.appendFieldToStringBuilder(A0r, "dirtyBitsFalsePositive", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
