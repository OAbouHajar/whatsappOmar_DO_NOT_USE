package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C32381gG;
import android.text.TextUtils;
import java.util.HashMap;

public final class zzbe extends C32381gG {
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public boolean zze;
    public boolean zzf;

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("hitType", this.zza);
        A0x.put("clientId", this.zzb);
        A0x.put("userId", this.zzc);
        A0x.put("androidAdId", this.zzd);
        A0x.put("AdTargetingEnabled", Boolean.valueOf(this.zze));
        A0x.put("sessionControl", (Object) null);
        A0x.put("nonInteraction", Boolean.valueOf(this.zzf));
        return AnonymousClass3K3.A0m("sampleRate", AnonymousClass3K4.A0U(), A0x);
    }

    public final /* bridge */ /* synthetic */ void zzc(C32381gG r3) {
        zzbe zzbe = (zzbe) r3;
        if (!TextUtils.isEmpty(this.zza)) {
            zzbe.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzbe.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbe.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzbe.zzd = this.zzd;
        }
        if (this.zze) {
            zzbe.zze = true;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (this.zzf) {
            zzbe.zzf = true;
        }
    }
}
