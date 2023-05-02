package X;

/* renamed from: X.3rV  reason: invalid class name and case insensitive filesystem */
public final class C75033rV extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C75033rV() {
        super(2312, new AnonymousClass00F(1, 10, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(4, this.A03);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamChatAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "chatActionChatType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "chatActionEntryPoint", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "chatActionMuteDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "chatActionType", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
