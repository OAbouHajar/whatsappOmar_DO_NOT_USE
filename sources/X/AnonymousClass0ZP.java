package X;

/* renamed from: X.0ZP  reason: invalid class name */
public class AnonymousClass0ZP implements C12940lD {
    public final /* synthetic */ AnonymousClass0ZV A00;

    public AnonymousClass0ZP(AnonymousClass0ZV r1) {
        this.A00 = r1;
    }

    public void AOk(C016607w r3, boolean z2) {
        if (r3 instanceof AnonymousClass0Cw) {
            r3.A02().A0G(false);
        }
        C12940lD r0 = this.A00.A09;
        if (r0 != null) {
            r0.AOk(r3, z2);
        }
    }

    public boolean AUB(C016607w r4) {
        AnonymousClass0ZV r2 = this.A00;
        if (r4 == r2.A08) {
            return false;
        }
        ((AnonymousClass0Cw) r4).getItem().getItemId();
        C12940lD r0 = r2.A09;
        if (r0 != null) {
            return r0.AUB(r4);
        }
        return false;
    }
}
