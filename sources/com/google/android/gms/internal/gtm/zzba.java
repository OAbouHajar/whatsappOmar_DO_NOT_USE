package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.C13680ns;
import X.C32381gG;
import android.text.TextUtils;
import java.util.HashMap;

public final class zzba extends C32381gG {
    public int zza;
    public int zzb;
    public String zzc;

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("language", this.zzc);
        Integer A0X = C13680ns.A0X();
        A0x.put("screenColors", A0X);
        A0x.put("screenWidth", Integer.valueOf(this.zza));
        A0x.put("screenHeight", Integer.valueOf(this.zzb));
        A0x.put("viewportWidth", A0X);
        return AnonymousClass3K3.A0m("viewportHeight", A0X, A0x);
    }

    public final /* bridge */ /* synthetic */ void zzc(C32381gG r2) {
        zzba zzba = (zzba) r2;
        int i2 = this.zza;
        if (i2 != 0) {
            zzba.zza = i2;
        }
        int i3 = this.zzb;
        if (i3 != 0) {
            zzba.zzb = i3;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzba.zzc = this.zzc;
        }
    }
}
