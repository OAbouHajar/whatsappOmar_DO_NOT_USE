package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4qu  reason: invalid class name and case insensitive filesystem */
public final class C97984qu implements AnonymousClass5SQ {
    public final /* synthetic */ C15580rV A00;

    public /* synthetic */ C97984qu(C15580rV r1) {
        this.A00 = r1;
    }

    public final void AiO(C15700rh r3) {
        C15580rV r0 = this.A00;
        Lock lock = r0.A0D;
        lock.lock();
        try {
            r0.A03 = r3;
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
            r2.A03 = C15700rh.A04;
            C15580rV.A00(r2);
        } finally {
            lock.unlock();
        }
    }

    public final void AiT(int i2, boolean z2) {
        C15580rV r3 = this.A00;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            if (r3.A04) {
                r3.A04 = false;
                r3.A08.AiT(i2, false);
                r3.A03 = null;
                r3.A02 = null;
            } else {
                r3.A04 = true;
                r3.A09.onConnectionSuspended(i2);
            }
        } finally {
            lock.unlock();
        }
    }
}
