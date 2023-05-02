package com.google.android.gms.internal.gtm;

import X.C13680ns;
import X.C13700nu;
import X.C13710nw;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;

public final class zzcy extends zzbs {
    public boolean zza;
    public boolean zzb;
    public final AlarmManager zzc = ((AlarmManager) this.zza.zzb.getSystemService("alarm"));
    public Integer zzd;

    public zzcy(zzbv zzbv) {
        super(zzbv);
    }

    private final int zzf() {
        Integer num = this.zzd;
        if (num == null) {
            num = Integer.valueOf(C13680ns.A0g(String.valueOf(this.zza.zzb.getPackageName()), "analytics").hashCode());
            this.zzd = num;
        }
        return num.intValue();
    }

    public final void zza() {
        this.zzb = false;
        try {
            AlarmManager alarmManager = this.zzc;
            Context context = this.zza.zzb;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, C13700nu.A02("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfu.zza));
        } catch (NullPointerException unused) {
        }
        if (Build.VERSION.SDK_INT >= 24) {
            int zzf = zzf();
            zzP("Cancelling job. JobID", Integer.valueOf(zzf));
            ((JobScheduler) this.zza.zzb.getSystemService("jobscheduler")).cancel(zzf);
        }
    }

    public final void zzb() {
        zzW();
        C13710nw.A04("Receiver not registered", this.zza);
        long A01 = C13700nu.A01(zzeu.zzm.zzb());
        if (A01 > 0) {
            zza();
            long elapsedRealtime = SystemClock.elapsedRealtime() + A01;
            this.zzb = true;
            zzeu.zzR.zzb();
            if (Build.VERSION.SDK_INT >= 24) {
                zzO("Scheduling upload with JobScheduler");
                Context context = this.zza.zzb;
                ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService");
                int zzf = zzf();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo build = new JobInfo.Builder(zzf, componentName).setMinimumLatency(A01).setOverrideDeadline(A01 + A01).setExtras(persistableBundle).build();
                zzP("Scheduling job. JobID", Integer.valueOf(zzf));
                zzfv.zza(context, build, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            zzO("Scheduling upload with AlarmManager");
            AlarmManager alarmManager = this.zzc;
            Context context2 = this.zza.zzb;
            alarmManager.setInexactRepeating(2, elapsedRealtime, A01, PendingIntent.getBroadcast(context2, 0, C13700nu.A02("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context2, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfu.zza));
        }
    }

    public final void zzd() {
        try {
            zza();
            if (C13700nu.A01(zzeu.zzm.zzb()) > 0) {
                Context context = this.zza.zzb;
                ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    zzO("Receiver registered for local dispatch.");
                    this.zza = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
