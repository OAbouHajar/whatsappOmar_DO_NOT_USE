package X;

/* renamed from: X.3rS  reason: invalid class name and case insensitive filesystem */
public final class C75003rS extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public C75003rS() {
        super(3852, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCallLinkActionEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "callLinkAction", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "callLinkActionEntryPoint", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "callLinkMedia", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "callLinkSharedApp", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
