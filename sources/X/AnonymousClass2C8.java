package X;

import com.facebook.redex.RunnableRunnableShape0S0410000_I0;

/* renamed from: X.2C8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2C8 implements AnonymousClass1WE {
    public final /* synthetic */ C209212c A00;
    public final /* synthetic */ C38241qT A01;
    public final /* synthetic */ C16730tY A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass2C8(C209212c r1, C38241qT r2, C16730tY r3, boolean z2) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = z2;
    }

    public final void accept(Object obj) {
        C209212c r2 = this.A00;
        C16730tY r4 = this.A02;
        C38241qT r5 = this.A01;
        boolean z2 = this.A03;
        C30761cu r3 = (C30761cu) obj;
        r2.A0k.A0D(r4);
        r2.A09(r3, r5, r4, false);
        AnonymousClass2C3 r1 = r2.A0X;
        synchronized (r1) {
            r1.remove(r4.A11);
        }
        r2.A06();
        r2.A0v.execute(new RunnableRunnableShape0S0410000_I0(r2, r3, r4, r5, 3, z2));
    }
}
