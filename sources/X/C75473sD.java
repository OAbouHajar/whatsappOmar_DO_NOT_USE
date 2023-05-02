package X;

/* renamed from: X.3sD  reason: invalid class name and case insensitive filesystem */
public final class C75473sD extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C75473sD() {
        super(2870, new AnonymousClass00F(1, 1, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A05);
        r3.AdT(1, this.A00);
        r3.AdT(4, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(5, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStickerOrphanFileCleanUp {");
        C16470t7.appendFieldToStringBuilder(A0r, "numberOfStickersDeleted", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "orphanFileCleanUpFailureReason", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "orphanFileCleanUpResult", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "spaceSavedInKb", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "timeToDeleteMs", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "timeToQueryMs", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
