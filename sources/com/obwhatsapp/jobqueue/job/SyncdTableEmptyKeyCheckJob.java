package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass139;
import X.C16150sX;
import X.C20360zv;
import X.C28791Xq;
import android.content.Context;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public class SyncdTableEmptyKeyCheckJob extends Job implements C28791Xq {
    public transient AnonymousClass139 A00;
    public transient C20360zv A01;

    public SyncdTableEmptyKeyCheckJob() {
        super(new JobParameters("syncd-table-empty-key-check", new LinkedList(), true));
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A01 = (C20360zv) r1.AOZ.get();
        this.A00 = (AnonymousClass139) r1.AOb.get();
    }
}
