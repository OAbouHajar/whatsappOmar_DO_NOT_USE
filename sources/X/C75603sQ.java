package X;

/* renamed from: X.3sQ  reason: invalid class name and case insensitive filesystem */
public final class C75603sQ extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;

    public C75603sQ() {
        super(3910, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(9, this.A06);
        r3.AdT(5, this.A07);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDragAndDropEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "dragDropTime", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "dragEndedTime", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "dragEnteredTime", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "dragExitedTime", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "dragMediaTypes", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "dragSessionId", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "dragStartTime", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaCount", this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }
}
