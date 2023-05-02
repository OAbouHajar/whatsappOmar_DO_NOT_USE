package X;

/* renamed from: X.2Oq  reason: invalid class name */
public final class AnonymousClass2Oq extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public AnonymousClass2Oq() {
        super(3748, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A04);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A02);
        r3.AdT(7, this.A06);
        r3.AdT(8, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamNotificationDelivery {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "notificationAction", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "notificationDeliveryT", this.A04);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "notificationDestination", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "notificationId", this.A05);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "notificationSource", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A06);
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "uiNotificationType", num4 == null ? null : num4.toString());
        sb.append("}");
        return sb.toString();
    }
}
