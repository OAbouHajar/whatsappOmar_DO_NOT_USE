package com.google.android.gms.internal.gtm;

import X.C15000qA;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;

public final class zzch extends zzcw {
    public final /* synthetic */ zzck zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzch(zzck zzck, zzbv zzbv) {
        super(zzbv);
        this.zza = zzck;
    }

    public final void zza() {
        zzck zzck = this.zza;
        try {
            zzce zzce = zzck.zzb;
            C15000qA.A00();
            zzce.zzW();
            zzfo zzfo = zzce.zzd;
            if (zzfo.zzc(86400000)) {
                zzfo.zzb = SystemClock.elapsedRealtime();
                zzce.zzO("Deleting stale hits (if any)");
                zzce.zzP("Deleted stale hits, count", Integer.valueOf(zzce.zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
            }
            zzck.zzae();
        } catch (SQLiteException e2) {
            zzck.zzS("Failed to delete stale hits", e2);
        }
        zzck.zzh.zzg(86400000);
    }
}
