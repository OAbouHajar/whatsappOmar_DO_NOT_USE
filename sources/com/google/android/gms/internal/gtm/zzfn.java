package com.google.android.gms.internal.gtm;

import X.C13710nw;
import X.C15550rJ;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;

public final class zzfn {
    public static Boolean zza;
    public final Handler zzb = new zzga();
    public final Context zzc;

    public zzfn(Context context) {
        C13710nw.A01(context);
        this.zzc = context;
    }

    public static boolean zzh(Context context) {
        C13710nw.A01(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z2 = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z2 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z2);
        return z2;
    }

    public final int zza(Intent intent, int i2, int i3) {
        try {
            synchronized (zzfi.zza) {
                C15550rJ r1 = zzfi.zzb;
                if (r1 != null && r1.A03()) {
                    r1.A00();
                }
            }
        } catch (SecurityException unused) {
        }
        zzbv zzg = zzbv.zzg(this.zzc);
        zzbv.zzs(zzg.zzf);
        zzfb zzfb = zzg.zzf;
        if (intent == null) {
            zzfb.zzR("AnalyticsService started with null intent");
        } else {
            String action = intent.getAction();
            zzfb.zzQ("Local AnalyticsService called. startId, action", Integer.valueOf(i3), action);
            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
                RunnableRunnableShape0S0201000_I0 runnableRunnableShape0S0201000_I0 = new RunnableRunnableShape0S0201000_I0((Object) this, i3, (Object) zzfb, 0);
                zzbv zzg2 = zzbv.zzg(this.zzc);
                zzbv.zzs(zzg2.zzh);
                zzg2.zzh.zze(new zzfl(this, runnableRunnableShape0S0201000_I0));
                return 2;
            }
        }
        return 2;
    }

    public final /* synthetic */ void zzd(zzfb zzfb, JobParameters jobParameters) {
        zzfb.zzO("AnalyticsJobService processed last dispatch request");
        ((zzfm) this.zzc).zza(jobParameters, false);
    }

    public final boolean zzi(JobParameters jobParameters) {
        zzbv zzg = zzbv.zzg(this.zzc);
        zzbv.zzs(zzg.zzf);
        zzfb zzfb = zzg.zzf;
        String string = jobParameters.getExtras().getString("action");
        zzfb.zzP("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        zzfk zzfk = new zzfk(this, zzfb, jobParameters);
        zzbv zzg2 = zzbv.zzg(this.zzc);
        zzbv.zzs(zzg2.zzh);
        zzg2.zzh.zze(new zzfl(this, zzfk));
        return true;
    }
}
