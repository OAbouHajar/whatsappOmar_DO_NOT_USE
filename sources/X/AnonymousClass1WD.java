package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1WD  reason: invalid class name */
public class AnonymousClass1WD implements AnonymousClass1WE {
    public final AnonymousClass1XS A00 = new AnonymousClass1XS();
    public final AnonymousClass1XS A01 = new AnonymousClass1XS();
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public final void A00(AnonymousClass1WE r3) {
        this.A01.A03(r3, (Executor) null);
    }

    public final void A01(AnonymousClass1WE r2, Executor executor) {
        this.A01.A03(r2, executor);
    }

    public final void A02(Object obj) {
        if (this.A02.compareAndSet(false, true)) {
            this.A01.A04(obj);
        }
    }

    public final void A03(Throwable th) {
        if (this.A02.compareAndSet(false, true)) {
            this.A00.A04(th);
        }
    }

    public void A04() {
        this.A01.A01();
        this.A00.A01();
        if (!this.A02.get()) {
            Log.w("asyncfuture/unsubscribe called before completion, possibly not intended", new Throwable());
        }
    }

    public final void accept(Object obj) {
        A02(obj);
    }
}
