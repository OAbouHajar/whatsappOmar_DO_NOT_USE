package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.C32381gG;
import android.text.TextUtils;
import java.util.HashMap;

public final class zzav extends C32381gG {
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("appName", this.zza);
        A0x.put("appVersion", this.zzb);
        A0x.put("appId", this.zzc);
        return AnonymousClass3K3.A0m("appInstallerId", this.zzd, A0x);
    }

    /* renamed from: zzh */
    public final void zzc(zzav zzav) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzav.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzav.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzav.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzav.zzd = this.zzd;
        }
    }
}
