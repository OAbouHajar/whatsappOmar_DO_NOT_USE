package com.google.android.gms.analytics;

import X.C13680ns;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

public final class AnalyticsService extends Service implements zzfm {
    public zzfn A00;

    public boolean callServiceStopSelfResult(int i2) {
        return stopSelfResult(i2);
    }

    public IBinder onBind(Intent intent) {
        if (this.A00 != null) {
            return null;
        }
        this.A00 = new zzfn(this);
        return null;
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

    public final void zza(JobParameters jobParameters, boolean z2) {
        throw C13680ns.A0m();
    }
}
