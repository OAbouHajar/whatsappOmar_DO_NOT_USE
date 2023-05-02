package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.concurrent.Executor;

/* renamed from: X.4t8  reason: invalid class name and case insensitive filesystem */
public final class C98884t8 implements C14290ov {
    public C14270ot A00;
    public final Object A01 = C13690nt.A0Y();
    public final Executor A02;

    public C98884t8(C14270ot r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void Aiu(C14210on r4) {
        if (!r4.A0A() && !r4.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new RunnableRunnableShape12S0200000_I1(r4, 21, this));
        }
    }
}
