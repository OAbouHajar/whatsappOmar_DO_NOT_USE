package X;

import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.util.concurrent.Executor;

/* renamed from: X.0pI  reason: invalid class name and case insensitive filesystem */
public final class C14510pI implements C14290ov {
    public C14260os A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C14510pI(C14260os r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void Aiu(C14210on r4) {
        if (r4.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new RunnableRunnableShape1S0100000_I0((Object) this, 16));
        }
    }
}
