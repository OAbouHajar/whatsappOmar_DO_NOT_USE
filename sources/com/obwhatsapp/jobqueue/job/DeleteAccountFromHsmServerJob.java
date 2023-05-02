package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass18X;
import X.C16150sX;
import X.C16320sq;
import X.C28791Xq;
import android.content.Context;
import java.util.Random;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class DeleteAccountFromHsmServerJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass18X A00;
    public transient C16320sq A01;
    public transient Random A02;

    public DeleteAccountFromHsmServerJob(JobParameters jobParameters) {
        super(jobParameters);
    }

    public void Adl(Context context) {
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A02 = new Random();
        this.A01 = r1.Ai4();
        this.A00 = (AnonymousClass18X) ((C16150sX) r1).A7j.get();
    }
}
