package X;

import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0pG  reason: invalid class name and case insensitive filesystem */
public final class C14490pG implements C14260os, C14270ot, C14280ou {
    public final CountDownLatch A00 = new CountDownLatch(1);

    public C14490pG() {
    }

    public /* synthetic */ C14490pG(RunnableRunnableShape2S0200000_I0 runnableRunnableShape2S0200000_I0) {
    }

    public final void AO5() {
        this.A00.countDown();
    }

    public final void AQu(Exception exc) {
        this.A00.countDown();
    }

    public final void AYB(Object obj) {
        this.A00.countDown();
    }
}
