package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4qj  reason: invalid class name and case insensitive filesystem */
public final class C97874qj implements C15650rc, C15670re {
    public C15740rm A00;
    public final C437721l A01;
    public final boolean A02;

    public C97874qj(C437721l r1, boolean z2) {
        this.A01 = r1;
        this.A02 = z2;
    }

    public final void onConnected(Bundle bundle) {
        C13710nw.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnected(bundle);
    }

    public final void onConnectionFailed(C15700rh r5) {
        C13710nw.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C15740rm r0 = this.A00;
        C437721l r3 = this.A01;
        boolean z2 = this.A02;
        AnonymousClass3EC r02 = (AnonymousClass3EC) r0;
        Lock lock = r02.A0D;
        lock.lock();
        try {
            r02.A0E.Aib(r5, r3, z2);
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i2) {
        C13710nw.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnectionSuspended(i2);
    }
}
