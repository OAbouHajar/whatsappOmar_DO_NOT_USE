package X;

/* renamed from: X.23R  reason: invalid class name */
public final class AnonymousClass23R extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass23R() {
        super(3686, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMessageSecretErrors {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "messageSecretAllowedList", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "messageSecretError", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}
