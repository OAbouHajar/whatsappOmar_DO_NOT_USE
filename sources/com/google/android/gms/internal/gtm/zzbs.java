package com.google.android.gms.internal.gtm;

public abstract class zzbs extends zzbr {
    public boolean zza;

    public zzbs(zzbv zzbv) {
        super(zzbv);
    }

    public final void zzW() {
        if (!this.zza) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void zzd();
}
