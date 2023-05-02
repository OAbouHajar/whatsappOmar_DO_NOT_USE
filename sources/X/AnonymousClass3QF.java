package X;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3QF  reason: invalid class name */
public final class AnonymousClass3QF extends AnonymousClass0F8 implements C107765Li {
    public final Set A00;
    public final Semaphore A01 = new Semaphore(0);

    public AnonymousClass3QF(Context context, Set set) {
        super(context);
        this.A00 = set;
    }

    public final void A03() {
        this.A01.drainPermits();
        A09();
    }

    public final /* bridge */ /* synthetic */ Object A06() {
        int i2 = 0;
        for (C437121f A07 : this.A00) {
            if (A07.A07(this)) {
                i2++;
            }
        }
        try {
            this.A01.tryAcquire(i2, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e2) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
