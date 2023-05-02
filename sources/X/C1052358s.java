package X;

/* renamed from: X.58s  reason: invalid class name and case insensitive filesystem */
public abstract class C1052358s implements AnonymousClass22J {
    public void A00(Throwable th) {
        if (this instanceof AnonymousClass5GA) {
            ((AnonymousClass5GA) this).A00.A09();
        } else if (this instanceof AnonymousClass5GE) {
            ((AnonymousClass5GE) this).A00.AIU(th);
        } else if (this instanceof AnonymousClass5GD) {
            ((AnonymousClass5GD) this).A00.dispose();
        } else {
            AnonymousClass5GC r0 = (AnonymousClass5GC) this;
            if (th != null) {
                r0.A00.cancel(false);
            }
        }
    }
}
