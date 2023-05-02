package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.concurrent.Executor;

/* renamed from: X.4sv  reason: invalid class name and case insensitive filesystem */
public final class C98754sv implements C14260os, C14270ot, C14280ou, C14290ov {
    public final AnonymousClass5MD A00;
    public final C14210on A01;
    public final Executor A02;

    public C98754sv(AnonymousClass5MD r1, C14210on r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void AO5() {
        this.A01.A02();
    }

    public final void AQu(Exception exc) {
        this.A01.A07(exc);
    }

    public final void AYB(Object obj) {
        this.A01.A08(obj);
    }

    public final void Aiu(C14210on r4) {
        this.A02.execute(new RunnableRunnableShape12S0200000_I1(r4, 23, this));
    }
}
