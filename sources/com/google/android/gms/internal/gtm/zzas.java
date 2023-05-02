package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;

public class zzas implements IInterface {
    public final IBinder zza;
    public final String zzb = "com.google.android.gms.analytics.internal.IAnalyticsService";

    public zzas(IBinder iBinder, String str) {
        this.zza = iBinder;
    }

    public final IBinder asBinder() {
        return this.zza;
    }
}
