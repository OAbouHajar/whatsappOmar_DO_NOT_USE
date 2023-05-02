package X;

import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import java.util.concurrent.Executor;

/* renamed from: X.0p7  reason: invalid class name and case insensitive filesystem */
public final class C14410p7 implements C14290ov {
    public final C14230op A00;
    public final C14210on A01;
    public final Executor A02;

    public C14410p7(C14230op r1, C14210on r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Aiu(C14210on r4) {
        this.A02.execute(new RunnableRunnableShape2S0200000_I0(this, 7, r4));
    }
}
