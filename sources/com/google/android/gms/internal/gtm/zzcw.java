package com.google.android.gms.internal.gtm;

import X.C13710nw;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;

public abstract class zzcw {
    public static volatile Handler zza;
    public final zzbv zzb;
    public final Runnable zzc = new RunnableRunnableShape1S0100000_I0((Object) this, 14);
    public volatile long zzd;

    public zzcw(zzbv zzbv) {
        C13710nw.A01(zzbv);
        this.zzb = zzbv;
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcw.class) {
            if (zza == null) {
                zza = new zzga(this.zzb.zzb.getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public abstract void zza();

    public final void zze(long j2) {
        if (this.zzd != 0) {
            long j3 = 0;
            if (j2 < 0) {
                zzf();
                return;
            }
            long abs = j2 - Math.abs(System.currentTimeMillis() - this.zzd);
            if (abs >= 0) {
                j3 = abs;
            }
            zzi().removeCallbacks(this.zzc);
            if (!zzi().postDelayed(this.zzc, j3)) {
                zzbv zzbv = this.zzb;
                zzbv.zzs(zzbv.zzf);
                zzbv.zzf.zzK("Failed to adjust delayed post. time", Long.valueOf(j3));
            }
        }
    }

    public final void zzf() {
        this.zzd = 0;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j2) {
        zzf();
        if (j2 >= 0) {
            this.zzd = System.currentTimeMillis();
            if (!zzi().postDelayed(this.zzc, j2)) {
                zzbv zzbv = this.zzb;
                zzbv.zzs(zzbv.zzf);
                zzbv.zzf.zzK("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }
}
