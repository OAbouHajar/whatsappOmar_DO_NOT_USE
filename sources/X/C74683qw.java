package X;

/* renamed from: X.3qw  reason: invalid class name and case insensitive filesystem */
public final class C74683qw extends C16470t7 {
    public Integer A00;
    public Long A01;

    public C74683qw() {
        super(1034, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A01);
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamForwardPicker {");
        C16470t7.appendFieldToStringBuilder(A0r, "forwardPickerContactsSelected", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "forwardPickerResult", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
