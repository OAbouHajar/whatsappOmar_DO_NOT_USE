package X;

/* renamed from: X.2Fs  reason: invalid class name */
public final class AnonymousClass2Fs extends C16470t7 {
    public Double A00;
    public Double A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public AnonymousClass2Fs() {
        super(2100, new AnonymousClass00F(1, 10, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A02);
        r3.AdT(1, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(3, this.A05);
        r3.AdT(12, this.A06);
        r3.AdT(10, this.A09);
        r3.AdT(8, this.A07);
        r3.AdT(7, this.A08);
        r3.AdT(6, this.A00);
        r3.AdT(11, this.A0A);
        r3.AdT(5, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidBatteryUsage {");
        C16470t7.appendFieldToStringBuilder(sb, "networkMobileBytesRx", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "networkMobileBytesTx", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "networkWifiBytesRx", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "networkWifiBytesTx", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "numberPushNotifications", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "sessionName", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "sessionUpT", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "sessionWallclockT", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "systemCpuTime", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "tags", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "userCpuTime", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
