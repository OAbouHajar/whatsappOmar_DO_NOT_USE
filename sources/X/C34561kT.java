package X;

/* renamed from: X.1kT  reason: invalid class name and case insensitive filesystem */
public final class C34561kT extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public C34561kT() {
        super(3782, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(12, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(13, this.A03);
        r3.AdT(7, this.A09);
        r3.AdT(14, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(9, this.A06);
        r3.AdT(10, this.A07);
        r3.AdT(11, this.A08);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMexEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "isMex", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventDurationT", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventEndTime", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventEnvelopeResponseStatus", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventOperation", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventPayloadResponseStatus", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventRequestSize", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventResponseSize", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventRetries", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "mexEventStartTime", this.A08);
        sb.append("}");
        return sb.toString();
    }
}
