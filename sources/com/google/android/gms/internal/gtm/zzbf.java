package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.C13680ns;
import X.C32381gG;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.UUID;

public final class zzbf extends C32381gG {
    public int zza;

    public zzbf() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("screenName", (Object) null);
        Boolean bool = Boolean.FALSE;
        A0x.put("interstitial", bool);
        A0x.put("automatic", bool);
        A0x.put("screenId", Integer.valueOf(this.zza));
        A0x.put("referrerScreenId", C13680ns.A0X());
        A0x.put("referrerScreenName", (Object) null);
        return AnonymousClass3K3.A0m("referrerUri", (Object) null, A0x);
    }

    public final /* bridge */ /* synthetic */ void zzc(C32381gG r3) {
        zzbf zzbf = (zzbf) r3;
        TextUtils.isEmpty((CharSequence) null);
        int i2 = this.zza;
        if (i2 != 0) {
            zzbf.zza = i2;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            TextUtils.isEmpty((CharSequence) null);
        }
    }
}
