package X;

/* renamed from: X.3st  reason: invalid class name and case insensitive filesystem */
public final class C75893st extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;

    public C75893st() {
        super(3126, new AnonymousClass00F(1, 1, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(7, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(1, this.A06);
        r3.AdT(12, this.A07);
        r3.AdT(15, this.A08);
        r3.AdT(17, this.A09);
        r3.AdT(18, this.A0A);
        r3.AdT(20, this.A0B);
        r3.AdT(21, this.A0C);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamGroupInfo {");
        C16470t7.appendFieldToStringBuilder(A0r, "exitGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "groupAddParticipants", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "groupAudioCall", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "groupDescription", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "groupDisappearingMessages", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "groupEncryption", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "groupInfoVisit", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "groupMuteClick", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "groupSearch", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "groupStarredMessages", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "groupVideoCall", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "inviteToGroupViaLink", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "reportGroup", this.A0C);
        return AnonymousClass000.A0h("}", A0r);
    }
}
