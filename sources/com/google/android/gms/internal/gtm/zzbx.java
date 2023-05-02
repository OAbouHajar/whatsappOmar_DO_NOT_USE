package com.google.android.gms.internal.gtm;

import X.C13710nw;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzbx {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public long zzd;
    public final Map zze;

    public zzbx(long j2, String str, String str2, boolean z2, long j3, Map map) {
        C13710nw.A05(str);
        C13710nw.A05(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z2;
        this.zzd = j3;
        this.zze = map != null ? new HashMap(map) : Collections.emptyMap();
    }
}
