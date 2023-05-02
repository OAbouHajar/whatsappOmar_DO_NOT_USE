package com.google.android.gms.internal.gtm;

import X.C13710nw;
import X.C15000qA;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;

public final class zzbq extends zzbs {
    public final zzck zza;

    public zzbq(zzbv zzbv, zzbw zzbw) {
        super(zzbv);
        C13710nw.A01(zzbw);
        this.zza = new zzck(zzbv, zzbw);
    }

    public final void zzd() {
        zzck zzck = this.zza;
        zzck.zzd();
        zzck.zza = true;
    }

    public final void zze(zzcz zzcz) {
        zzW();
        C15000qA r2 = this.zza.zzg;
        C13710nw.A01(r2);
        r2.A03.submit(new RunnableRunnableShape2S0200000_I0(this, 6, zzcz));
    }
}
