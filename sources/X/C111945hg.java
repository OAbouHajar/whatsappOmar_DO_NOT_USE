package X;

/* renamed from: X.5hg  reason: invalid class name and case insensitive filesystem */
public final class C111945hg extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;

    public C111945hg() {
        super(2950, new AnonymousClass00F(1, 1, 1), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(1, this.A04);
        r3.AdT(14, this.A05);
        r3.AdT(15, this.A06);
        r3.AdT(16, this.A07);
        r3.AdT(10, this.A08);
        r3.AdT(6, this.A09);
        r3.AdT(13, this.A0A);
        r3.AdT(12, this.A0B);
        r3.AdT(11, this.A0C);
        r3.AdT(9, this.A0D);
        r3.AdT(8, this.A0E);
        r3.AdT(7, this.A0F);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPaymentsDaily {");
        C16470t7.appendFieldToStringBuilder(A0r, "invitedUserCnt", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "invitedUserRegisteredCnt", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "inviterUserCnt", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "invitesReceivedToUserCnt", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "invitesSentToUserCnt", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "startTs", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "totalOneTimeMandateCnt", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "totalRecurringMandateCnt", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "totalTransactionReceivedCnt", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "totalTransactionSentCnt", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "transactionReceivedWithBackgroundAndStickerCnt", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "transactionReceivedWithBackgroundCnt", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "transactionReceivedWithStickerCnt", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "transactionSentWithBackgroundAndStickerCnt", this.A0D);
        C16470t7.appendFieldToStringBuilder(A0r, "transactionSentWithBackgroundCnt", this.A0E);
        C16470t7.appendFieldToStringBuilder(A0r, "transactionSentWithStickerCnt", this.A0F);
        return AnonymousClass000.A0h("}", A0r);
    }
}
