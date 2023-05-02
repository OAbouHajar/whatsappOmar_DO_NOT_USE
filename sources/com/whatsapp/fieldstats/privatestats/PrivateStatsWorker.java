package com.whatsapp.fieldstats.privatestats;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass02Q;
import X.C16150sX;
import X.C16420t0;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;

public class PrivateStatsWorker extends Worker {
    public final C16420t0 A00;

    public PrivateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (C16420t0) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AJO.get();
    }

    public AnonymousClass02Q A04() {
        Log.i("PrivateStatsWorker/doWork--->>> in doWork");
        C16420t0 r3 = this.A00;
        r3.A07.Acl(new RunnableRunnableShape9S0100000_I0_8(r3, 12));
        return AnonymousClass02Q.A00();
    }
}
