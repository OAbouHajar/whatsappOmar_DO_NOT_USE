package X;

/* renamed from: X.3sB  reason: invalid class name and case insensitive filesystem */
public final class C75453sB extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;

    public C75453sB() {
        super(3676, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(6, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPollsActions {");
        C16470t7.appendFieldToStringBuilder(A0r, "groupSizeBucket", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "isAGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isAdmin", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "pollAction", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "pollCreationDs", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "pollOptionsCount", this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }
}
