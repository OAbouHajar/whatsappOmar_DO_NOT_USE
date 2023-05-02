package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C32381gG;
import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import java.util.HashMap;

public final class zzaw extends C32381gG {
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put(FacebookFacade.RequestParameter.NAME, this.zza);
        A0x.put("source", this.zzb);
        A0x.put("medium", this.zzc);
        A0x.put("keyword", this.zzd);
        A0x.put("content", this.zze);
        A0x.put("id", this.zzf);
        A0x.put("adNetworkId", this.zzg);
        A0x.put("gclid", this.zzh);
        A0x.put("dclid", this.zzi);
        A0x.put("aclid", this.zzj);
        return C32381gG.zzd(A0x, 0);
    }

    public final /* bridge */ /* synthetic */ void zzc(C32381gG r2) {
        zzaw zzaw = (zzaw) r2;
        if (!TextUtils.isEmpty(this.zza)) {
            zzaw.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzaw.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzaw.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzaw.zzd = this.zzd;
        }
        if (!TextUtils.isEmpty(this.zze)) {
            zzaw.zze = this.zze;
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            zzaw.zzf = this.zzf;
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzaw.zzg = this.zzg;
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            zzaw.zzh = this.zzh;
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            zzaw.zzi = this.zzi;
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            zzaw.zzj = this.zzj;
        }
    }
}
