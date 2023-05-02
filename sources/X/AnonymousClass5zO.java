package X;

import com.facebook.redex.IDxTListenerShape354S0100000_3_I1;

/* renamed from: X.5zO  reason: invalid class name */
public class AnonymousClass5zO implements C1221668n {
    public final C115805qL A00;
    public final AnonymousClass68B A01;
    public final AnonymousClass5vT A02;
    public volatile int A03;
    public volatile AnonymousClass5xD A04;
    public volatile Boolean A05;

    public AnonymousClass5zO() {
        this((C115805qL) null);
    }

    public AnonymousClass5zO(C115805qL r3) {
        this.A03 = 0;
        IDxTListenerShape354S0100000_3_I1 iDxTListenerShape354S0100000_3_I1 = new IDxTListenerShape354S0100000_3_I1(this, 1);
        this.A01 = iDxTListenerShape354S0100000_3_I1;
        this.A00 = r3;
        AnonymousClass5vT r0 = new AnonymousClass5vT();
        this.A02 = r0;
        r0.A01 = iDxTListenerShape354S0100000_3_I1;
    }

    public void A5c() {
        this.A02.A00();
    }

    public /* bridge */ /* synthetic */ Object AFb() {
        if (this.A05 == null) {
            throw AnonymousClass000.A0V("Configure Preview operation hasn't completed yet.");
        } else if (this.A05.booleanValue()) {
            return this.A04;
        } else {
            throw new AnonymousClass67O("Failed to configure preview.");
        }
    }
}
