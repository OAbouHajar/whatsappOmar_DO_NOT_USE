package com.google.android.gms.internal.gtm;

import X.C107825Lo;
import X.C13710nw;
import android.os.SystemClock;

public final class zzfo {
    public final C107825Lo zza;
    public long zzb;

    public zzfo(C107825Lo r1) {
        C13710nw.A01(r1);
        this.zza = r1;
    }

    public zzfo(C107825Lo r1, long j2) {
        C13710nw.A01(r1);
        this.zza = r1;
        this.zzb = j2;
    }

    public final boolean zzc(long j2) {
        long j3 = this.zzb;
        return j3 == 0 || SystemClock.elapsedRealtime() - j3 > j2;
    }
}
