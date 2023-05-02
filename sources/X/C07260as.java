package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.0as  reason: invalid class name and case insensitive filesystem */
public final class C07260as implements C12990lI {
    public final JobWorkItem A00;
    public final /* synthetic */ AnonymousClass0A9 A01;

    public C07260as(JobWorkItem jobWorkItem, AnonymousClass0A9 r2) {
        this.A01 = r2;
        this.A00 = jobWorkItem;
    }

    public void A6U() {
        AnonymousClass0A9 r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    public Intent getIntent() {
        return this.A00.getIntent();
    }
}
