package X;

/* renamed from: X.1U4  reason: invalid class name */
public final class AnonymousClass1U4 extends C16470t7 {
    public Long A00;
    public String A01;

    public AnonymousClass1U4() {
        super(2126, new AnonymousClass00F(1, 20, 200), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamSuperpackDecompressionSuccess {");
        C16470t7.appendFieldToStringBuilder(sb, "assetName", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "decompressionT", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
