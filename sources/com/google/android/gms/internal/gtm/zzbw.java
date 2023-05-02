package com.google.android.gms.internal.gtm;

import X.C13710nw;
import android.content.Context;

public final class zzbw {
    public final Context zza;
    public final Context zzb;

    public zzbw(Context context) {
        C13710nw.A01(context);
        Context applicationContext = context.getApplicationContext();
        C13710nw.A02(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }
}
