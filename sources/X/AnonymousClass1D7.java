package X;

/* renamed from: X.1D7  reason: invalid class name */
public class AnonymousClass1D7 implements C23691Cz {
    public final AnonymousClass104 A00;
    public final C15860rz A01;

    public AnonymousClass1D7(AnonymousClass104 r1, C15860rz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* synthetic */ void AMa() {
    }

    public void AMb() {
        AnonymousClass104 r2 = this.A00;
        for (String A03 : r2.A01()) {
            r2.A03(A03);
        }
        this.A01.A0K().putBoolean("report_unhealthy_module", true).apply();
    }
}
