package X;

/* renamed from: X.3sF  reason: invalid class name and case insensitive filesystem */
public final class C75493sF extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C75493sF() {
        super(2952, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A05);
        r3.AdT(5, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(10, this.A04);
        r3.AdT(9, this.A00);
        r3.AdT(8, this.A01);
        r3.AdT(3, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamBusinessMessageLevelCsat {");
        C16470t7.appendFieldToStringBuilder(A0r, "businessJid", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "csatActionType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "csatEntryPoint", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "csatUserRating", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "hasCsatRating", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isCsatRatingChanged", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "messageTemplateId", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
