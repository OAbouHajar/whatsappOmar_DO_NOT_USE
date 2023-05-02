package X;

/* renamed from: X.2JB  reason: invalid class name */
public final class AnonymousClass2JB extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public AnonymousClass2JB() {
        super(3056, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(1, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDisappearingModeSettingChange {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "disappearingModeEntryPoint", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "lastToggleTimestamp", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "newEphemeralityDuration", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "previousEphemeralityDuration", this.A03);
        sb.append("}");
        return sb.toString();
    }
}
