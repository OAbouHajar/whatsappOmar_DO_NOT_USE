package com.obwhatsapp.jobqueue.job.messagejob;

import X.AnonymousClass013;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass17F;
import X.AnonymousClass1QZ;
import X.C16000sG;
import X.C16150sX;
import X.C16740tZ;
import X.C16980tz;
import X.C223217m;
import android.content.Context;

public class ProcessVCardMessageJob extends AsyncMessageJob {
    public transient C16000sG A00;
    public transient C16980tz A01;
    public transient AnonymousClass013 A02;
    public transient AnonymousClass17F A03;
    public transient C223217m A04;
    public transient AnonymousClass1QZ A05;

    public ProcessVCardMessageJob(C16740tZ r5) {
        super(r5.A13, r5.A14);
    }

    public void Adl(Context context) {
        super.Adl(context);
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        C16150sX r1 = (C16150sX) r2;
        this.A01 = (C16980tz) r1.AQB.get();
        this.A05 = (AnonymousClass1QZ) r1.APn.get();
        this.A00 = (C16000sG) r1.A4x.get();
        this.A02 = r2.Ai9();
        this.A03 = (AnonymousClass17F) r1.AAo.get();
        this.A04 = (C223217m) r1.APl.get();
    }
}
