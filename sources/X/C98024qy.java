package X;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4qy  reason: invalid class name and case insensitive filesystem */
public final class C98024qy implements C108415Nw {
    public final C437721l A00;
    public final WeakReference A01;
    public final boolean A02;

    public C98024qy(C437721l r2, C15020qC r3, boolean z2) {
        this.A01 = C13690nt.A0h(r3);
        this.A00 = r2;
        this.A02 = z2;
    }

    public final void AWA(C15700rh r5) {
        C15020qC r3 = (C15020qC) this.A01.get();
        if (r3 != null) {
            C13710nw.A04("onReportServiceBinding must be called on the GoogleApiClient handler thread", AnonymousClass000.A1Y(Looper.myLooper(), r3.A0F.A05.A06));
            Lock lock = r3.A0K;
            lock.lock();
            try {
                if (r3.A07(0)) {
                    if (r5.A01 != 0) {
                        r3.A04(r5, this.A00, this.A02);
                    }
                    if (r3.A06()) {
                        r3.A02();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
