package X;

/* renamed from: X.0q5  reason: invalid class name and case insensitive filesystem */
public class C14970q5 {
    public AnonymousClass4YH A00;
    public AnonymousClass4K0 A01;
    public C25261Jc A02;
    public final C99344ts A03 = new C99344ts();

    public C14970q5(AnonymousClass4YH r3, AnonymousClass4K0 r4, C25261Jc r5) {
        if (!(r5 instanceof AnonymousClass3EZ)) {
            this.A02 = new AnonymousClass3EZ(r5);
            this.A01 = r4;
            this.A00 = r3;
            return;
        }
        throw new RuntimeException("passed extensions that were already chained");
    }
}
