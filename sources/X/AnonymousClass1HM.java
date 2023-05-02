package X;

import com.facebook.redex.RunnableRunnableShape0S0310100_I0;

/* renamed from: X.1HM  reason: invalid class name */
public class AnonymousClass1HM {
    public final C212613k A00;
    public final C212613k A01;

    public AnonymousClass1HM(C212613k r1, C212613k r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00(C38641rB r8, AnonymousClass1z1 r9) {
        C212613k r3 = r8.A1A().A0H ? this.A00 : this.A01;
        C34151jm A1A = r8.A1A();
        long j2 = r8.A01;
        if (A1A.A0H == r3.A0B) {
            r3.A09.execute(new RunnableRunnableShape0S0310100_I0(r9, r3, A1A, j2));
        }
    }
}
