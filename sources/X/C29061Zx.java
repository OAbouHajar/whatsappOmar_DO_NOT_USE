package X;

/* renamed from: X.1Zx  reason: invalid class name and case insensitive filesystem */
public final class C29061Zx extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;

    public C29061Zx() {
        super(2862, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamPsIdUpdate {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "psIdAction", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "psIdKey", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "psIdRotationFrequence", this.A02);
        sb.append("}");
        return sb.toString();
    }
}
