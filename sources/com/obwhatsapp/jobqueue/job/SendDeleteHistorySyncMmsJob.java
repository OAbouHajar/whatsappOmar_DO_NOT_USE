package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass1QV;
import X.C16150sX;
import X.C19040xf;
import X.C20330zs;
import X.C28791Xq;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SendDeleteHistorySyncMmsJob extends Job implements C28791Xq {
    public transient C20330zs A00;
    public transient AnonymousClass1QV A01;
    public transient C19040xf A02;
    public final String chunkId;
    public final String directPath;
    public final String mediaEncHash;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDeleteHistorySyncMmsJob(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            org.whispersystems.jobqueue.requirements.NetworkRequirement r0 = new org.whispersystems.jobqueue.requirements.NetworkRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            r4.chunkId = r5
            r4.directPath = r6
            r4.mediaEncHash = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void Adl(Context context) {
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        C16150sX r1 = (C16150sX) r2;
        this.A02 = (C19040xf) r1.ALG.get();
        this.A01 = (AnonymousClass1QV) r1.APT.get();
        this.A00 = r2.A1I();
    }
}
