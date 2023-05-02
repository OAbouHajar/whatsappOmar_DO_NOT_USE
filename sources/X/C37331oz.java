package X;

/* renamed from: X.1oz  reason: invalid class name and case insensitive filesystem */
public final class C37331oz extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;

    public C37331oz() {
        super(2286, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(4, this.A02);
        r3.AdT(1, this.A03);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapStarted {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapSource", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdRegAttemptId", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
