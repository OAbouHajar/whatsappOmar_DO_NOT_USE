package X;

/* renamed from: X.3qz  reason: invalid class name and case insensitive filesystem */
public final class C74713qz extends C16470t7 {
    public Boolean A00;
    public Integer A01;

    public C74713qz() {
        super(2178, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdRetryFromUnknownDevice {");
        C16470t7.appendFieldToStringBuilder(A0r, "offline", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "senderType", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
