package X;

/* renamed from: X.27C  reason: invalid class name */
public final class AnonymousClass27C extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public Long A02;

    public AnonymousClass27C() {
        super(3046, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvIdentityTimestampInvalid {");
        C16470t7.appendFieldToStringBuilder(sb, "advIdentityIncomingTimestampInHours", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "advIdentityLocalTimestampInHours", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "advIdentityPrimaryIdentityMatch", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
