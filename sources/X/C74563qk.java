package X;

/* renamed from: X.3qk  reason: invalid class name and case insensitive filesystem */
public final class C74563qk extends C16470t7 {
    public Integer A00;
    public Long A01;

    public C74563qk() {
        super(3880, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAutoMuteLargeGroupActions {");
        C16470t7.appendFieldToStringBuilder(A0r, "autoMuteAction", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "autoMuteGroupSize", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
