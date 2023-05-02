package X;

/* renamed from: X.2gO  reason: invalid class name and case insensitive filesystem */
public final class C53842gO extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;

    public C53842gO() {
        super(2162, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A07);
        r3.AdT(24, this.A0G);
        r3.AdT(3, this.A08);
        r3.AdT(23, this.A0H);
        r3.AdT(32, this.A0I);
        r3.AdT(34, this.A00);
        r3.AdT(15, this.A0N);
        r3.AdT(13, this.A01);
        r3.AdT(11, this.A0O);
        r3.AdT(22, this.A0J);
        r3.AdT(21, this.A02);
        r3.AdT(18, this.A03);
        r3.AdT(20, this.A04);
        r3.AdT(19, this.A0P);
        r3.AdT(25, this.A0Q);
        r3.AdT(31, this.A09);
        r3.AdT(2, this.A0R);
        r3.AdT(9, this.A0S);
        r3.AdT(10, this.A0T);
        r3.AdT(1, this.A0U);
        r3.AdT(42, this.A0A);
        r3.AdT(40, this.A05);
        r3.AdT(36, this.A06);
        r3.AdT(38, this.A0V);
        r3.AdT(39, this.A0W);
        r3.AdT(17, this.A0B);
        r3.AdT(26, this.A0K);
        r3.AdT(27, this.A0L);
        r3.AdT(12, this.A0C);
        r3.AdT(14, this.A0M);
        r3.AdT(28, this.A0D);
        r3.AdT(30, this.A0E);
        r3.AdT(46, this.A0X);
        r3.AdT(35, this.A0Y);
        r3.AdT(6, this.A0Z);
        r3.AdT(5, this.A0a);
        r3.AdT(8, this.A0F);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamPaymentsUserAction {");
        Integer num = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "actionTarget", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "paymentAccountRowSelected", this.A0G);
        Integer num2 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "paymentActionType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "paymentNumberOfAccountsAvailable", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "paymentNumberOfPeopleInvited", this.A0I);
        C16470t7.appendFieldToStringBuilder(sb, "paymentSent", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "paymentSmsProviderNumber", this.A0N);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsAccountsExist", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBankId", this.A0O);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBanksRowSelected", this.A0J);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBanksScrolled", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBanksSearchActivated", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBanksSearchSelected", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBanksSearchString", this.A0P);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsBanksSelectedName", this.A0Q);
        Integer num3 = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "paymentsContactsBucket", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "paymentsCountryCode", this.A0R);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsErrorCode", this.A0S);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsErrorText", this.A0T);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsEventId", this.A0U);
        Integer num4 = this.A0A;
        C16470t7.appendFieldToStringBuilder(sb, "paymentsIqCallStatus", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "paymentsIsMandate", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsIsOrder", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsOrderType", this.A0V);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsP2mPaymentConfigId", this.A0W);
        Integer num5 = this.A0B;
        C16470t7.appendFieldToStringBuilder(sb, "paymentsRequestName", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "paymentsRequestRetryCount", this.A0K);
        C16470t7.appendFieldToStringBuilder(sb, "paymentsRequestRetryTimeDelaySeconds", this.A0L);
        Integer num6 = this.A0C;
        C16470t7.appendFieldToStringBuilder(sb, "paymentsResponseResult", num6 == null ? null : num6.toString());
        C16470t7.appendFieldToStringBuilder(sb, "paymentsSmsProviderRetryCount", this.A0M);
        Integer num7 = this.A0D;
        C16470t7.appendFieldToStringBuilder(sb, "paymentsUpiCheckPinErrorReason", num7 == null ? null : num7.toString());
        Integer num8 = this.A0E;
        C16470t7.appendFieldToStringBuilder(sb, "paymentsVerifyCardResult", num8 == null ? null : num8.toString());
        C16470t7.appendFieldToStringBuilder(sb, "previousScreenName", this.A0X);
        C16470t7.appendFieldToStringBuilder(sb, "queryParams", this.A0Y);
        C16470t7.appendFieldToStringBuilder(sb, "referral", this.A0Z);
        C16470t7.appendFieldToStringBuilder(sb, "screen", this.A0a);
        Integer num9 = this.A0F;
        C16470t7.appendFieldToStringBuilder(sb, "upiPaymentsPspId", num9 == null ? null : num9.toString());
        sb.append("}");
        return sb.toString();
    }
}
