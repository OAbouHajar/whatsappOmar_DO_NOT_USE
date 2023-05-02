package X;

/* renamed from: X.2l4  reason: invalid class name and case insensitive filesystem */
public final class C56152l4 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public C56152l4() {
        super(1094, new AnonymousClass00F(1, 200, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A02);
        r3.AdT(7, this.A00);
        r3.AdT(1, this.A03);
        r3.AdT(5, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAppLaunch {");
        C16470t7.appendFieldToStringBuilder(sb, "appLaunchCpuT", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "appLaunchDestination", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "appLaunchT", this.A03);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "appLaunchTypeT", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}
