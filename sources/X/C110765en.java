package X;

/* renamed from: X.5en  reason: invalid class name and case insensitive filesystem */
public class C110765en extends C014206u {
    public final /* synthetic */ C112355iM A00;
    public final /* synthetic */ C117765tW A01;
    public final /* synthetic */ String A02;

    public C110765en(C112355iM r1, C117765tW r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public C003401n A6s(Class cls) {
        if (cls.isAssignableFrom(C110605eV.class)) {
            C117765tW r0 = this.A01;
            C16980tz r3 = r0.A0B;
            C16320sq r10 = r0.A0o;
            AnonymousClass160 r5 = r0.A0J;
            C16440t3 r2 = r0.A0A;
            C14870pt r1 = r0.A01;
            AnonymousClass013 r4 = r0.A0E;
            AnonymousClass5xN r9 = r0.A0j;
            C112355iM r8 = this.A00;
            return new C110605eV(r1, r2, r3, r4, r5, r0.A0V, r0.A0Z, r8, r9, r10, this.A02);
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
