package X;

/* renamed from: X.1me  reason: invalid class name and case insensitive filesystem */
public final class C35881me extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;

    public C35881me() {
        super(2598, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidKeystoreAuthkeySuccess {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "androidKeystoreState", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "numFailures", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "numSuccessfulReads", this.A02);
        sb.append("}");
        return sb.toString();
    }
}
