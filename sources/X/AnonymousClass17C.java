package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.17C  reason: invalid class name */
public class AnonymousClass17C {
    public final C16900tq A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger(0);

    public AnonymousClass17C(C16900tq r3) {
        this.A00 = r3;
    }

    public C37281ou A00(String str) {
        ThreadLocal threadLocal = this.A01;
        AnonymousClass1y0 r2 = (AnonymousClass1y0) threadLocal.get();
        if (r2 == null) {
            r2 = new AnonymousClass1y0(this.A00, this.A02.get());
            threadLocal.set(r2);
        }
        C37281ou A002 = r2.A00(str, this.A02.get());
        A002.A00.clearBindings();
        return A002;
    }

    public void A01() {
        Log.i("statementsmanager/resetstatements");
        this.A02.incrementAndGet();
        AnonymousClass1y0 r0 = (AnonymousClass1y0) this.A01.get();
        if (r0 != null) {
            r0.A01();
        }
    }
}
