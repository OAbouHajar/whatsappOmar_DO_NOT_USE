package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

public final class AnalyticsJobService extends JobService implements zzfm {
    public zzfn A00;

    public boolean callServiceStopSelfResult(int i2) {
        return stopSelfResult(i2);
    }

    public final void onCreate() {
        super.onCreate();
        zzfn zzfn = this.A00;
        if (zzfn == null) {
            zzfn = new zzfn(this);
            this.A00 = zzfn;
        }
        zzbv zzg = zzbv.zzg(zzfn.zzc);
        zzbv.zzs(zzg.zzf);
        zzg.zzf.zzO("Local AnalyticsService is starting up");
    }

    public final void onDestroy() {
        zzfn zzfn = this.A00;
        if (zzfn == null) {
            zzfn = new zzfn(this);
            this.A00 = zzfn;
        }
        zzbv zzg = zzbv.zzg(zzfn.zzc);
        zzbv.zzs(zzg.zzf);
        zzg.zzf.zzO("Local AnalyticsService is shutting down");
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        zzfn zzfn = this.A00;
        if (zzfn == null) {
            zzfn = new zzfn(this);
            this.A00 = zzfn;
        }
        zzfn.zza(intent, i2, i3);
        return 2;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        zzfn zzfn = this.A00;
        if (zzfn == null) {
            zzfn = new zzfn(this);
            this.A00 = zzfn;
        }
        zzfn.zzi(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void zza(JobParameters jobParameters, boolean z2) {
        jobFinished(jobParameters, false);
    }
}
