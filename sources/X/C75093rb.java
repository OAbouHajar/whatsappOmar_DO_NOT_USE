package X;

/* renamed from: X.3rb  reason: invalid class name and case insensitive filesystem */
public final class C75093rb extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public C75093rb() {
        super(3180, new AnonymousClass00F(1, 1, 100), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdAppStateSyncMutationStats {");
        C16470t7.appendFieldToStringBuilder(A0r, "applied", C13690nt.A0d(this.A00));
        String str = null;
        Integer num = this.A01;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(A0r, "orphan", str);
        C16470t7.appendFieldToStringBuilder(A0r, "syncdAction", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "unsupported", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
