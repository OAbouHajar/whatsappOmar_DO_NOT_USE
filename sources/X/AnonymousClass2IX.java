package X;

/* renamed from: X.2IX  reason: invalid class name */
public final class AnonymousClass2IX extends C16470t7 {
    public Double A00;
    public Integer A01;

    public AnonymousClass2IX() {
        super(2958, new AnonymousClass00F(1, 1, 1), 2, 248614979);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamTestAnonymousDailyId {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "psTestEnumField", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "psTestFloatField", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
