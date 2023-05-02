package X;

import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;

/* renamed from: X.10x  reason: invalid class name and case insensitive filesystem */
public class C206310x implements C19170xs {
    public final C16040sK A00;
    public final C206210w A01;
    public final C19230xz A02;
    public final C15960sC A03;
    public final C16320sq A04;

    public C206310x(C16040sK r1, C206210w r2, C19230xz r3, C15960sC r4, C16320sq r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void AS4() {
        C16040sK r0 = this.A00;
        r0.A0B();
        if (r0.A00 != null && this.A03.A01()) {
            C16320sq r3 = this.A04;
            r3.Acm(new RunnableRunnableShape7S0100000_I0_6(this.A02, 4), "ContactSyncHourlyCron/contactSyncMethods::fullSyncAndInitialize");
            r3.Acm(new RunnableRunnableShape7S0100000_I0_6(this.A01, 3), "ContactSyncHourlyCron/contactDiscoverySyncHelper::syncOutContactIfNoSyncInLastDay");
        }
    }
}
