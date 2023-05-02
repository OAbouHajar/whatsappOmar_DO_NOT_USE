package X;

import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Uz  reason: invalid class name and case insensitive filesystem */
public class C06250Uz {
    public static Executor A04 = Executors.newCachedThreadPool();
    public final Handler A00 = AnonymousClass000.A0L();
    public final Set A01 = new LinkedHashSet(1);
    public final Set A02 = new LinkedHashSet(1);
    public volatile C06150Um A03 = null;

    public C06250Uz(Callable callable, boolean z2) {
        if (z2) {
            try {
                A02((C06150Um) callable.call());
            } catch (Throwable th) {
                A02(new C06150Um(th));
            }
        } else {
            A04.execute(new C11320iY(this, callable));
        }
    }

    public synchronized void A00(C12630ki r2) {
        if (!(this.A03 == null || this.A03.A01 == null)) {
            r2.AWP(this.A03.A01);
        }
        this.A01.add(r2);
    }

    public synchronized void A01(C12630ki r2) {
        if (!(this.A03 == null || this.A03.A00 == null)) {
            r2.AWP(this.A03.A00);
        }
        this.A02.add(r2);
    }

    public final void A02(C06150Um r3) {
        if (this.A03 == null) {
            this.A03 = r3;
            this.A00.post(new C09610fn(this));
            return;
        }
        throw AnonymousClass000.A0V("A task may only be set once.");
    }
}
