package X;

/* renamed from: X.2kD  reason: invalid class name and case insensitive filesystem */
public final class C55712kD extends C16470t7 {
    public Integer A00;
    public String A01;
    public String A02;

    public C55712kD() {
        super(3456, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(7, this.A02);
        r3.AdT(8, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamOrderDetailsActionsSmb {");
        C16470t7.appendFieldToStringBuilder(sb, "actionCategory", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "orderDetailEntryPoint", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "orderDetailsCreationAction", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
