package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4qi  reason: invalid class name and case insensitive filesystem */
public final class C97864qi implements C15650rc, C15670re {
    public final /* synthetic */ C15020qC A00;

    public /* synthetic */ C97864qi(C15020qC r1) {
        this.A00 = r1;
    }

    public final void onConnected(Bundle bundle) {
        C15020qC r2 = this.A00;
        C13710nw.A01(r2.A0G);
        AnonymousClass5UT r1 = r2.A05;
        C13710nw.A01(r1);
        r1.AiV(new C67403bV(r2));
    }

    public final void onConnectionFailed(C15700rh r4) {
        C15020qC r2 = this.A00;
        Lock lock = r2.A0K;
        lock.lock();
        try {
            if (!r2.A06 || r4.A00()) {
                r2.A03(r4);
            } else {
                r2.A00();
                r2.A02();
            }
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i2) {
    }
}
