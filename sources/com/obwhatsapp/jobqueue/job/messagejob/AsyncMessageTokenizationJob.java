package com.obwhatsapp.jobqueue.job.messagejob;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass17F;
import X.C16150sX;
import X.C16740tZ;
import android.content.Context;

public final class AsyncMessageTokenizationJob extends AsyncMessageJob {
    public transient AnonymousClass17F A00;

    public AsyncMessageTokenizationJob(C16740tZ r5) {
        super(r5.A13, r5.A14);
    }

    public void Adl(Context context) {
        super.Adl(context);
        this.A00 = (AnonymousClass17F) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AAo.get();
    }
}
