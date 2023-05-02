package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C107715Lc;
import X.C13690nt;
import android.util.Log;

@Deprecated
public final class zzfa {
    public static volatile C107715Lc zza = new zzcu();

    public static void zzb(String str, Object obj) {
        zzfb zzfb = zzfb.zza;
        if (zzfb != null) {
            zzfb.zzK(str, obj);
            return;
        }
        if (obj != null) {
            String str2 = (String) obj;
            StringBuilder A0g = C13690nt.A0g(str.length() + 1 + str2.length());
            A0g.append(str);
            A0g.append(":");
            str = AnonymousClass000.A0h(str2, A0g);
        }
        Log.e((String) zzeu.zzc.zzb(), str);
    }
}
