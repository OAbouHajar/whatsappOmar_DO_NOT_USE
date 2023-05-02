package X;

/* renamed from: X.3s4  reason: invalid class name and case insensitive filesystem */
public final class C75383s4 extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;

    public C75383s4() {
        super(3466, AnonymousClass3K3.A0d(), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A02);
        r3.AdT(8, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCtwaUserJourney {");
        C16470t7.appendFieldToStringBuilder(A0r, "adId", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "businessJid", this.A04);
        String str = null;
        Integer num = this.A01;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(A0r, "ctwaUserJourneyOperation", str);
        C16470t7.appendFieldToStringBuilder(A0r, "icebreakersShown", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "sequenceNumber", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "trustBannerType", this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }
}
