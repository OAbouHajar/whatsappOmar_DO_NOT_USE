package X;

/* renamed from: X.3r2  reason: invalid class name and case insensitive filesystem */
public final class C74743r2 extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public C74743r2() {
        super(1936, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStarMessage {");
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "starMessageEntryPoint", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
