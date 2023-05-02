package com.obwhatsapp.jobqueue.job.messagejob;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C16820th;
import X.C16900tq;
import X.C28791Xq;
import android.content.Context;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public abstract class AsyncMessageJob extends Job implements C28791Xq {
    public transient C16820th A00;
    public transient C16900tq A01;
    public final long rowId;
    public final long sortId;

    public AsyncMessageJob(long j2, long j3) {
        super(new JobParameters("async-message", new LinkedList(), true));
        this.rowId = j2;
        this.sortId = j3;
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A00 = (C16820th) r1.A3B.get();
        this.A01 = (C16900tq) r1.AFT.get();
    }
}
