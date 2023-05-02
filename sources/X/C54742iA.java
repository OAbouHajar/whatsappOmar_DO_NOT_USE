package X;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
public final class C54742iA extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;

    public C54742iA() {
        super(2880, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(28, this.A01);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDirectoryBusinessOnboardingSmbClient {");
        String str = null;
        Integer num = this.A00;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(sb, "directoryEntryPoint", str);
        C16470t7.appendFieldToStringBuilder(sb, "directoryOnboardingLoggingVersion", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "directorySessionId", this.A02);
        sb.append("}");
        return sb.toString();
    }
}
