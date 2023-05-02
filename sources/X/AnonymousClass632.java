package X;

import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;

/* renamed from: X.632  reason: invalid class name */
public class AnonymousClass632 implements AnonymousClass5SD {
    public final /* synthetic */ C29671b0 A00;
    public final /* synthetic */ C29671b0 A01;
    public final /* synthetic */ AnonymousClass1KG A02;
    public final /* synthetic */ Object A03;

    public AnonymousClass632(C29671b0 r1, C29671b0 r2, AnonymousClass1KG r3, Object obj) {
        this.A02 = r3;
        this.A03 = obj;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AWK(C29661az r10) {
        AnonymousClass1KG r0 = this.A02;
        Object obj = this.A03;
        C29671b0 r7 = this.A01;
        C29671b0 r6 = this.A00;
        AnonymousClass1KF r2 = r0.A00;
        RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I0 = new RunnableRunnableShape0S0400000_I0(r10, obj, r6, r7, 38);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableRunnableShape0S0400000_I0.run();
        } else {
            r2.A00.post(runnableRunnableShape0S0400000_I0);
        }
    }

    public void AWO(AnonymousClass2WZ r6) {
        AnonymousClass1KF r4 = this.A02.A00;
        RunnableRunnableShape3S0200000_I0_1 runnableRunnableShape3S0200000_I0_1 = new RunnableRunnableShape3S0200000_I0_1(this.A03, 31, this.A00.A9V());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableRunnableShape3S0200000_I0_1.run();
        } else {
            r4.A00.post(runnableRunnableShape3S0200000_I0_1);
        }
    }
}
