package X;

/* renamed from: X.2IA  reason: invalid class name */
public final class AnonymousClass2IA extends C16470t7 {
    public String A00;
    public String A01;
    public String A02;

    public AnonymousClass2IA() {
        super(2812, new AnonymousClass00F(1, 1, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamSamsungBatteryWarning {");
        C16470t7.appendFieldToStringBuilder(sb, "data", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "extras", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "extrasJson", this.A02);
        sb.append("}");
        return sb.toString();
    }
}
