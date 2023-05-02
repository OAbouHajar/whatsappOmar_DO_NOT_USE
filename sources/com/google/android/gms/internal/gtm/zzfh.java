package com.google.android.gms.internal.gtm;

import X.C15000qA;
import android.content.SharedPreferences;

public final class zzfh extends zzbs {
    public SharedPreferences zza;
    public long zzb;
    public long zzc = -1;
    public final zzfg zzd = new zzfg(this, "monitoring", ((Number) zzeu.zzP.zzb()).longValue(), (zzff) null);

    public zzfh(zzbv zzbv) {
        super(zzbv);
    }

    public final long zza() {
        C15000qA.A00();
        zzW();
        long j2 = this.zzb;
        if (j2 == 0) {
            j2 = this.zza.getLong("first_run", 0);
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
                SharedPreferences.Editor edit = this.zza.edit();
                edit.putLong("first_run", j2);
                if (!edit.commit()) {
                    zzR("Failed to commit first run time");
                }
            }
            this.zzb = j2;
        }
        return j2;
    }

    public final void zzd() {
        this.zza = this.zza.zzb.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }
}
