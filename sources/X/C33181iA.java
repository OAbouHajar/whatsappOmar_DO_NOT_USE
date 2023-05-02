package X;

/* renamed from: X.1iA  reason: invalid class name and case insensitive filesystem */
public final class C33181iA extends C16470t7 {
    public Double A00;
    public String A01;
    public String A02;

    public C33181iA() {
        super(2128, new AnonymousClass00F(1, 1, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamSuperpackDecompressionFailure {");
        C16470t7.appendFieldToStringBuilder(sb, "assetName", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "exceptionMessage", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "freeSpaceAvailable", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
