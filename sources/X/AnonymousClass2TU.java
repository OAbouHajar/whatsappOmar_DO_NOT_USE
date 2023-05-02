package X;

/* renamed from: X.2TU  reason: invalid class name */
public final class AnonymousClass2TU extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass2TU() {
        super(2692, new AnonymousClass00F(10, 1000, 1000000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A01);
        r3.AdT(5, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamActivityStats {");
        C16470t7.appendFieldToStringBuilder(sb, "featureName", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "memoryKbsConsumed", this.A01);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "memoryStatStage", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
