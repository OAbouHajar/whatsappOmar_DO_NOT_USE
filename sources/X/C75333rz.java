package X;

/* renamed from: X.3rz  reason: invalid class name and case insensitive filesystem */
public final class C75333rz extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C75333rz() {
        super(1180, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
        r3.AdT(6, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(1, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStatusReply {");
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterBiz", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterInAddressBook", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "statusReplyMessageType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "statusReplyResult", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "statusSessionId", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
