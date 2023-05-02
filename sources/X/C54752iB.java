package X;

/* renamed from: X.2iB  reason: invalid class name and case insensitive filesystem */
public final class C54752iB extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;

    public C54752iB() {
        super(2034, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A00);
        r3.AdT(6, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(3, this.A04);
        r3.AdT(2, this.A05);
        r3.AdT(1, this.A01);
        r3.AdT(7, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamQrCodeScan {");
        C16470t7.appendFieldToStringBuilder(sb, "isContact", this.A00);
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "linkOwnerType", num == null ? null : num.toString());
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "qrCodeCameraSource", num2 == null ? null : num2.toString());
        Integer num3 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "qrCodeErrorReason", num3 == null ? null : num3.toString());
        Integer num4 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "qrCodeType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "scannedCodeSuccessfully", this.A01);
        Integer num5 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "srcLinkParam", num5 == null ? null : num5.toString());
        sb.append("}");
        return sb.toString();
    }
}
