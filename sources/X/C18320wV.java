package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;

/* renamed from: X.0wV  reason: invalid class name and case insensitive filesystem */
public class C18320wV implements C18330wW {
    public boolean A00;
    public final AnonymousClass12K A01;
    public final C18090w8 A02;
    public final C18290wS A03;
    public final AnonymousClass1Vo A04 = AnonymousClass1Vo.A00("PaymentsLifecycleManager", "network", "COMMON");
    public final C18990xa A05;

    public C18320wV(C18340wX r4, AnonymousClass12K r5, C18090w8 r6, C18290wS r7, C18990xa r8) {
        this.A05 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r4.A00 = this;
    }

    public synchronized void A00() {
        if (this.A00) {
            this.A04.A06("payments was already initialized");
        } else if (this.A02.A09()) {
            this.A04.A06("initializing payments");
            AnonymousClass12K r3 = this.A01;
            synchronized (r3) {
                r3.A00 = true;
                r3.A02.A0K(new RunnableRunnableShape12S0100000_I0_11((Object) r3, 4));
            }
            this.A05.A02(this);
            this.A00 = true;
        }
    }

    public synchronized void A01(boolean z2, boolean z3) {
        this.A04.A06("reinitializing payments");
        this.A00 = false;
        this.A03.A08(z2, z3);
        this.A05.A03(this);
        AnonymousClass12K r3 = this.A01;
        synchronized (r3) {
            r3.A00 = false;
            r3.A02.A0K(new RunnableRunnableShape12S0100000_I0_11((Object) r3, 3));
        }
        A00();
    }

    public void ATC(boolean z2) {
        if (z2) {
            this.A03.A08(true, false);
        }
    }
}
