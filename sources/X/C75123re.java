package X;

/* renamed from: X.3re  reason: invalid class name and case insensitive filesystem */
public final class C75123re extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;

    public C75123re() {
        super(3266, AnonymousClass3K3.A0d(), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPsPhoneNumberHyperlink {");
        C16470t7.appendFieldToStringBuilder(A0r, "isPhoneNumHyperlinkOwner", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "phoneNumHyperlinkAction", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "phoneNumberStatusOnWa", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "sequenceNumber", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
