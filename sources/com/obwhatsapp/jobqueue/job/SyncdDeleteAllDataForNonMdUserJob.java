package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass139;
import X.C16040sK;
import X.C16150sX;
import X.C20360zv;
import X.C28791Xq;
import android.content.Context;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public class SyncdDeleteAllDataForNonMdUserJob extends Job implements C28791Xq {
    public transient C16040sK A00;
    public transient AnonymousClass139 A01;
    public transient C20360zv A02;

    public SyncdDeleteAllDataForNonMdUserJob() {
        super(new JobParameters("syncd-delete-all-data-for-non-md-user", new LinkedList(), true));
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A00 = (C16040sK) r1.ADr.get();
        this.A02 = (C20360zv) r1.AOZ.get();
        this.A01 = (AnonymousClass139) r1.AOb.get();
    }
}
