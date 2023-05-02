package X;

/* renamed from: X.27D  reason: invalid class name */
public final class AnonymousClass27D extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public Long A02;

    public AnonymousClass27D() {
        super(3040, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A00);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvListTimestampInvalid {");
        C16470t7.appendFieldToStringBuilder(sb, "advListIncomingTimestampInHours", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "advListIsExpired", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "advListLocalTimestampInHours", this.A02);
        sb.append("}");
        return sb.toString();
    }
}
