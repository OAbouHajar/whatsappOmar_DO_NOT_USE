package X;

/* renamed from: X.3rD  reason: invalid class name and case insensitive filesystem */
public final class C74853rD extends C16470t7 {
    public Integer A00;
    public String A01;
    public String A02;

    public C74853rD() {
        super(470, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(7, this.A01);
        r3.AdT(21, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamContactUsSession {");
        C16470t7.appendFieldToStringBuilder(A0r, "contactUsExitState", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "contactUsProblemDescription", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "languageCode", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
