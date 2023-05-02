package X;

import com.facebook.redex.RunnableRunnableShape0S0202000_I0;

/* renamed from: X.0xA  reason: invalid class name and case insensitive filesystem */
public class C18730xA {
    public final C19880z9 A00;
    public final C19940zF A01;
    public final C19890zA A02;

    public C18730xA(C19880z9 r1, C19940zF r2, C19890zA r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public int A00(int i2) {
        if (!this.A02.A00.A0E(C16620tM.A02, 2003)) {
            return -1;
        }
        C19880z9 r2 = this.A00;
        int andIncrement = r2.A02.getAndIncrement();
        r2.A00.ALF(i2, andIncrement);
        return andIncrement;
    }

    public void A01(AnonymousClass4L0 r10, int i2, int i3) {
        RunnableRunnableShape0S0202000_I0 runnableRunnableShape0S0202000_I0 = new RunnableRunnableShape0S0202000_I0((Object) this, i2, (Object) r10, i3, 3);
        if (this.A02.A00.A0E(C16620tM.A02, 2003)) {
            runnableRunnableShape0S0202000_I0.run();
        }
    }

    public void A02(AnonymousClass4L0 r10, int i2, int i3) {
        RunnableRunnableShape0S0202000_I0 runnableRunnableShape0S0202000_I0 = new RunnableRunnableShape0S0202000_I0((Object) this, i2, (Object) r10, i3, 4);
        if (this.A02.A00.A0E(C16620tM.A02, 2003)) {
            runnableRunnableShape0S0202000_I0.run();
        }
    }
}
