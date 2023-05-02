package X;

/* renamed from: X.3rj  reason: invalid class name and case insensitive filesystem */
public final class C75173rj extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public String A03;

    public C75173rj() {
        super(3944, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamWaFsGroupJoinRequestAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "groupJid", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "groupJoinRequestAction", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "isSuccessful", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "serverResponseTime", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
