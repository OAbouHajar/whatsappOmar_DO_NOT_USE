package X;

/* renamed from: X.5eo  reason: invalid class name and case insensitive filesystem */
public class C110775eo extends C014206u {
    public final /* synthetic */ C35521m4 A00;
    public final /* synthetic */ C35301lh A01;
    public final /* synthetic */ C112315iI A02;
    public final /* synthetic */ C117765tW A03;

    public C110775eo(C35521m4 r1, C35301lh r2, C112315iI r3, C117765tW r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public C003401n A6s(Class cls) {
        if (cls.isAssignableFrom(C110575eS.class)) {
            C117765tW r0 = this.A03;
            return new C110575eS(r0.A0B, r0.A0E, this.A00, this.A01, this.A02);
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
