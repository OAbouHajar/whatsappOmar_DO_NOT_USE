package X;

/* renamed from: X.5vP  reason: invalid class name and case insensitive filesystem */
public class C118885vP {
    public boolean A00;
    public final C119355wx A01;

    public C118885vP(C119355wx r1) {
        this.A01 = r1;
    }

    public final void A00(String str) {
        A01(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Can only check if prepared on the Optic thread. ")));
        if (!this.A00) {
            StringBuilder A0r = AnonymousClass000.A0r("Not prepared: ");
            A0r.append(str);
            A0r.append(" Current thread: ");
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(Thread.currentThread().getName(), A0r));
        }
    }

    public final void A01(String str) {
        if (!this.A01.A09()) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(" Current thread: ");
            throw AnonymousClass000.A0a(AnonymousClass000.A0h(Thread.currentThread().getName(), A0q));
        }
    }

    public final void A02(String str, boolean z2) {
        A01(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Can only set the prepared state on the Optic thread. ")));
        this.A00 = z2;
    }
}
