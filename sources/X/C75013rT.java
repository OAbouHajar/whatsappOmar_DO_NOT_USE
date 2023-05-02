package X;

/* renamed from: X.3rT  reason: invalid class name and case insensitive filesystem */
public final class C75013rT extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public C75013rT() {
        super(2582, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCallStanzaReceive {");
        C16470t7.appendFieldToStringBuilder(A0r, "callStanzaDuration", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "callStanzaOfflineCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "callStanzaStage", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "callStanzaType", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
