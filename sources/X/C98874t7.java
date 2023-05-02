package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.concurrent.Executor;

/* renamed from: X.4t7  reason: invalid class name and case insensitive filesystem */
public final class C98874t7 implements C14290ov {
    public AnonymousClass5OG A00;
    public final Object A01 = C13690nt.A0Y();
    public final Executor A02;

    public C98874t7(AnonymousClass5OG r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void Aiu(C14210on r4) {
        synchronized (this.A01) {
        }
        this.A02.execute(new RunnableRunnableShape12S0200000_I1(r4, 20, this));
    }
}
