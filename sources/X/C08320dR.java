package X;

/* renamed from: X.0dR  reason: invalid class name and case insensitive filesystem */
public class C08320dR implements C12650kk {
    public final /* synthetic */ C08360dV A00;

    public C08320dR(C08360dV r1) {
        this.A00 = r1;
    }

    public void AZV() {
        C08360dV r2 = this.A00;
        boolean A1P = AnonymousClass000.A1P((r2.A01.A0E() > 1.0f ? 1 : (r2.A01.A0E() == 1.0f ? 0 : -1)));
        if (A1P != r2.A07) {
            r2.A07 = A1P;
            r2.A0K.invalidateSelf();
        }
    }
}
