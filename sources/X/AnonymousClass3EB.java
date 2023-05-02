package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3EB  reason: invalid class name */
public final class AnonymousClass3EB implements C15030qD {
    public final AnonymousClass3EC A00;

    public AnonymousClass3EB(AnonymousClass3EC r1) {
        this.A00 = r1;
    }

    public final C438121p AiN(C438121p r2) {
        this.A00.A05.A0I.add(r2);
        return r2;
    }

    public final C438121p AiP(C438121p r2) {
        throw AnonymousClass000.A0V("GoogleApiClient is not connected yet.");
    }

    public final void AiU() {
        AnonymousClass3EC r2 = this.A00;
        Iterator A0q = C13680ns.A0q(r2.A09);
        while (A0q.hasNext()) {
            ((C15750rn) A0q.next()).A80();
        }
        r2.A05.A03 = Collections.emptySet();
    }

    public final void AiX() {
        AnonymousClass3EC r4 = this.A00;
        Lock lock = r4.A0D;
        lock.lock();
        try {
            AnonymousClass4O1 r5 = r4.A08;
            Map map = r4.A0B;
            r4.A0E = new C15020qC(r4.A02, r4.A03, r4.A04, r4, r5, map, lock);
            r4.A0E.AiU();
            r4.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void Aia(Bundle bundle) {
    }

    public final void Aib(C15700rh r1, C437721l r2, boolean z2) {
    }

    public final void Aic(int i2) {
    }

    public final boolean Aid() {
        return true;
    }
}
