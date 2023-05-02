package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C32381gG;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzbb extends C32381gG {
    public final List zza = AnonymousClass000.A0u();
    public final List zzb = AnonymousClass000.A0u();
    public final Map zzc = AnonymousClass000.A0x();

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        if (!this.zza.isEmpty()) {
            A0x.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            A0x.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            A0x.put("impressions", this.zzc);
        }
        A0x.put("productAction", (Object) null);
        return C32381gG.zzd(A0x, 0);
    }

    public final /* bridge */ /* synthetic */ void zzc(C32381gG r8) {
        zzbb zzbb = (zzbb) r8;
        zzbb.zza.addAll(this.zza);
        zzbb.zzb.addAll(this.zzb);
        Iterator A0y = AnonymousClass000.A0y(this.zzc);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Object key = A0z.getKey();
            for (Object next : (List) A0z.getValue()) {
                if (next != null) {
                    String str = key == null ? "" : key;
                    if (!zzbb.zzc.containsKey(str)) {
                        zzbb.zzc.put(str, AnonymousClass000.A0u());
                    }
                    ((List) zzbb.zzc.get(str)).add(next);
                }
            }
        }
    }
}
