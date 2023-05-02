package X;

/* renamed from: X.0gN  reason: invalid class name and case insensitive filesystem */
public class C09970gN implements Runnable {
    public final /* synthetic */ C10630hR A00;
    public final /* synthetic */ C29981bY A01;

    public C09970gN(C10630hR r1, C29981bY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C10630hR r5 = this.A00;
        AnonymousClass0H9 r4 = r5.A0F;
        if (!r4.isCancelled()) {
            try {
                this.A01.get();
                C06530Wm A002 = C06530Wm.A00();
                String str = C10630hR.A0I;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Starting work for ");
                A002.A02(str, AnonymousClass000.A0h(r5.A08.A0G, A0o));
                r4.A08(r5.A03.A02());
            } catch (Throwable th) {
                r4.A0A(th);
            }
        }
    }
}
