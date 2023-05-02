package com.google.android.gms.internal.gtm;

import X.C13710nw;
import java.util.Set;

public final class zzct {
    public final zzbv zza;
    public volatile Boolean zzb;
    public String zzc;
    public Set zzd;

    public zzct(zzbv zzbv) {
        C13710nw.A01(zzbv);
        this.zza = zzbv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.equals(r5) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set zza() {
        /*
            r6 = this;
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzB
            java.lang.Object r5 = r0.zzb()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r4 = r6.zzd
            if (r4 == 0) goto L_0x0016
            java.lang.String r0 = r6.zzc
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0034
        L_0x0016:
            java.lang.String r0 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r5, r0)
            java.util.HashSet r4 = X.C13680ns.A0o()
            int r2 = r3.length
            r1 = 0
        L_0x0022:
            if (r1 >= r2) goto L_0x0030
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002d }
            X.C13690nt.A1O(r4, r0)     // Catch:{ NumberFormatException -> 0x002d }
        L_0x002d:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0030:
            r6.zzc = r5
            r6.zzd = r4
        L_0x0034:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzct.zza():java.util.Set");
    }
}
