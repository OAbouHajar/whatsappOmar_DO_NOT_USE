package X;

/* renamed from: X.1mY  reason: invalid class name and case insensitive filesystem */
public final class C35821mY extends C16470t7 {
    public Long A00;
    public String A01;

    public C35821mY() {
        super(2052, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidPerfTimer {");
        C16470t7.appendFieldToStringBuilder(sb, "androidPerfDuration", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "androidPerfName", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
