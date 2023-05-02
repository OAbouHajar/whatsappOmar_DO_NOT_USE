package com.obwhatsapp.cron.daily;

import X.AnonymousClass02Q;
import X.AnonymousClass1FN;
import X.C13700nu;
import X.C16150sX;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class RandomizedDailyCronWorker extends Worker {
    public final Context A00;

    public RandomizedDailyCronWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
    }

    public AnonymousClass02Q A04() {
        ((AnonymousClass1FN) ((C16150sX) C13700nu.A0A(this.A00)).AKe.get()).A00(true);
        return AnonymousClass02Q.A00();
    }
}
