package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Dz  reason: invalid class name */
public final class AnonymousClass0Dz extends C05540Ry {
    public final JobInfo A00;
    public final JobScheduler A01;

    public AnonymousClass0Dz(ComponentName componentName, Context context, int i2) {
        super(componentName);
        A03(i2);
        this.A00 = new JobInfo.Builder(i2, this.A02).setOverrideDeadline(0).build();
        this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    public void A04(Intent intent) {
        this.A01.enqueue(this.A00, new JobWorkItem(intent));
    }
}
