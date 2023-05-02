package X;

/* renamed from: X.5he  reason: invalid class name and case insensitive filesystem */
public final class C111925he extends C16470t7 {
    public Boolean A00;
    public String A01;
    public String A02;

    public C111925he() {
        super(2010, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamWaPaymentsGetStarted {");
        C16470t7.appendFieldToStringBuilder(A0r, "paymentsContinueSelected", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "paymentsCountryCode", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "paymentsEventId", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
