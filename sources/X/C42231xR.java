package X;

/* renamed from: X.1xR  reason: invalid class name and case insensitive filesystem */
public final class C42231xR extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;

    public C42231xR() {
        super(3724, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A00);
        r3.AdT(7, this.A06);
        r3.AdT(8, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamIncomingMessageDrop {");
        String str = null;
        Integer num = this.A01;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(sb, "e2eDestination", str);
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "e2eSenderType", num2 == null ? null : num2.toString());
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "messageDropReason", num3 == null ? null : num3.toString());
        Integer num4 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "offline", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A06);
        Integer num5 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "revokeType", num5 == null ? null : num5.toString());
        sb.append("}");
        return sb.toString();
    }
}
