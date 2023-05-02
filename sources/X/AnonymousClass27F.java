package X;

/* renamed from: X.27F  reason: invalid class name */
public final class AnonymousClass27F extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public AnonymousClass27F() {
        super(3032, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvProtoDecodeFailed {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "advDecodeErrorType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "advDecodeProtoType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}
