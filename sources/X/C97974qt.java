package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4qt  reason: invalid class name and case insensitive filesystem */
public final class C97974qt implements AnonymousClass5SQ {
    public final /* synthetic */ C15580rV A00;

    public /* synthetic */ C97974qt(C15580rV r1) {
        this.A00 = r1;
    }

    public final void AiO(C15700rh r3) {
        C15580rV r0 = this.A00;
        Lock lock = r0.A0D;
        lock.lock();
        try {
            r0.A02 = r3;
            C15580rV.A00(r0);
        } finally {
            lock.unlock();
        }
    }

    public final void AiQ(Bundle bundle) {
        C15580rV r2 = this.A00;
        Lock lock = r2.A0D;
        lock.lock();
        try {
            Bundle bundle2 = r2.A01;
            if (bundle2 == null) {
                r2.A01 = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            r2.A02 = C15700rh.A04;
            C15580rV.A00(r2);
        } finally {
            lock.unlock();
        }
    }

    public final void AiT(int i2, boolean z2) {
        C15700rh r0;
        C15580rV r3 = this.A00;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            if (r3.A04 || (r0 = r3.A03) == null || r0.A01 != 0) {
                r3.A04 = false;
                r3.A08.AiT(i2, false);
                r3.A03 = null;
                r3.A02 = null;
            } else {
                r3.A04 = true;
                r3.A0A.onConnectionSuspended(i2);
            }
        } finally {
            lock.unlock();
        }
    }
}
