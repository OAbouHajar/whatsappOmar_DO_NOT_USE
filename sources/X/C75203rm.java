package X;

/* renamed from: X.3rm  reason: invalid class name and case insensitive filesystem */
public final class C75203rm extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C75203rm() {
        super(3022, AnonymousClass3K3.A0d(), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A01);
        r3.AdT(2, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCtwaWelcomeMessage {");
        C16470t7.appendFieldToStringBuilder(A0r, "ctwaWelcomeMessageAction", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "ctwaWelcomeMessageContainsIcebreakers", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "ctwaWelcomeMessageError", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "ctwaWelcomeMessageIcebreakersContainAutoreply", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "firstWelcomeMessageImpressionTime", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
