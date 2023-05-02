package com.google.android.gms.internal.gtm;

public final class zzev implements zzcr {
    public final zzbv zza;
    public final zzew zzb = new zzew();

    public zzev(zzbv zzbv) {
        this.zza = zzbv;
    }

    public final /* bridge */ /* synthetic */ zzcq zza() {
        return this.zzb;
    }

    public final void zzb(String str, String str2) {
    }

    public final void zzc(String str, boolean z2) {
        if ("ga_dryRun".equals(str)) {
            this.zzb.zze = z2 ? 1 : 0;
            return;
        }
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzf);
        zzbv.zzf.zzS("Bool xml configuration name not recognized", str);
    }

    public final void zzd(String str, int i2) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.zzb.zzd = i2;
            return;
        }
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzf);
        zzbv.zzf.zzS("Int xml configuration name not recognized", str);
    }

    public final void zze(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.zzb.zza = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.zzb.zzb = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.zzb.zzc = str2;
        } else {
            zzbv zzbv = this.zza;
            zzbv.zzs(zzbv.zzf);
            zzbv.zzf.zzS("String xml configuration name not recognized", str);
        }
    }
}
