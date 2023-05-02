package X;

/* renamed from: X.2Qj  reason: invalid class name and case insensitive filesystem */
public final class C49022Qj extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;

    public C49022Qj() {
        super(3862, new AnonymousClass00F(1, 1, 1), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBlockEvents {");
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "blockEntryPoint", num == null ? null : num.toString());
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "blockEventActionType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "blockEventIsSuspicious", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "blockEventIsUnsub", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
