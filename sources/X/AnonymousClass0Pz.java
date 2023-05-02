package X;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Pz  reason: invalid class name */
public final class AnonymousClass0Pz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C12040jk A03 = new C08040cw();
    public final AnonymousClass0UL A04 = new AnonymousClass0UL();
    public final Executor A05 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C10930hv(this, false));
    public final Executor A06 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C10930hv(this, true));

    public AnonymousClass0Pz(AnonymousClass0O3 r4) {
        this.A00 = r4.A00;
        this.A02 = r4.A01;
        this.A01 = Integer.MAX_VALUE;
    }

    public int A00() {
        return Build.VERSION.SDK_INT == 23 ? 10 : 20;
    }
}
