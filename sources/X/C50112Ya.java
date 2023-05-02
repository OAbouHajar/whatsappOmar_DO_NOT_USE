package X;

import android.os.Looper;
import java.util.Iterator;

/* renamed from: X.2Ya  reason: invalid class name and case insensitive filesystem */
public final class C50112Ya extends C003401n {
    public final AnonymousClass2YT A00;

    public C50112Ya(AnonymousClass2YT r1) {
        this.A00 = r1;
    }

    public void A04() {
        C50242Yo r2 = (C50242Yo) ((AnonymousClass2YU) ((AnonymousClass2YT) C004501y.A00(AnonymousClass2YT.class, this.A00))).A02.get();
        Thread thread = C50252Yp.A00;
        if (thread == null) {
            thread = Looper.getMainLooper().getThread();
            C50252Yp.A00 = thread;
        }
        if (Thread.currentThread() == thread) {
            Iterator it = r2.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onCleared");
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
