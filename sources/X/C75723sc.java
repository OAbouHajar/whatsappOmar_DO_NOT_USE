package X;

/* renamed from: X.3sc  reason: invalid class name and case insensitive filesystem */
public final class C75723sc extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C75723sc() {
        super(3680, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(9, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A06);
        r3.AdT(7, this.A07);
        r3.AdT(8, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPollsDailyStats {");
        C16470t7.appendFieldToStringBuilder(A0r, "groupSizeBucket", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "isAGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "optionsCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "pollCreationDs", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "pollId", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "pollVoteDeletes", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "pollVotes", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "pollVotesChanged", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "usersParticipated", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}
