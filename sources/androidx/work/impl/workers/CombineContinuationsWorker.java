package androidx.work.impl.workers;

import X.AnonymousClass02Q;
import X.C02900Gd;
import X.C18450wi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18450wi.A0H(context, 1);
        C18450wi.A0H(workerParameters, 2);
    }

    public AnonymousClass02Q A04() {
        return new C02900Gd(this.A01.A01);
    }
}
