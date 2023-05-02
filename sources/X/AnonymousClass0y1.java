package X;

import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0y1  reason: invalid class name */
public class AnonymousClass0y1 implements C19050xg {
    public final C16300so A00;
    public final AnonymousClass00F A01 = new AnonymousClass00F(10, 1000);
    public final C16320sq A02;
    public final AnonymousClass01T A03 = new AnonymousClass01T((Object) null, new AnonymousClass2IG());
    public final ReferenceQueue A04 = new ReferenceQueue();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public volatile Runnable A06;
    public volatile boolean A07 = true;

    public AnonymousClass0y1(C16300so r4, C16320sq r5) {
        this.A00 = r4;
        this.A02 = r5;
    }

    public void AMV() {
        this.A07 = false;
        if (this.A06 == null) {
            this.A06 = this.A02.Ad4(new RunnableRunnableShape11S0100000_I0_10((Object) this, 8), "MemoryLeakReporter/onAppBackgrounded", 5000);
        }
    }

    public void AMW() {
        this.A07 = true;
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A02.Ac3(runnable);
            this.A06 = null;
        }
    }
}
