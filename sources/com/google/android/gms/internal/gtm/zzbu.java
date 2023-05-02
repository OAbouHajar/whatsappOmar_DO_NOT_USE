package com.google.android.gms.internal.gtm;

import java.lang.Thread;

public final class zzbu implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzbv zza;

    public zzbu(zzbv zzbv) {
        this.zza = zzbv;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        zzfb zzfb = this.zza.zzf;
        if (zzfb != null) {
            zzfb.zzK("Job execution failed", th);
        }
    }
}
