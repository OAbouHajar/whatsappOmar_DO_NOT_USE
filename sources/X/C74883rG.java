package X;

/* renamed from: X.3rG  reason: invalid class name and case insensitive filesystem */
public final class C74883rG extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;

    public C74883rG() {
        super(3226, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDirectoryClientEntryPoints {");
        C16470t7.appendFieldToStringBuilder(A0r, "directoryClientEntryPointEventType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "directorySessionId", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "entrypointVersion", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
