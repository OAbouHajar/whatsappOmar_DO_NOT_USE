package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C13690nt;
import X.C32381gG;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzax extends C32381gG {
    public final Map zza = new HashMap(4);

    public final String toString() {
        HashMap A0x = AnonymousClass000.A0x();
        Iterator A0y = AnonymousClass000.A0y(this.zza);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            String valueOf = String.valueOf(A0z.getKey());
            StringBuilder A0g = C13690nt.A0g(valueOf.length() + 9);
            A0g.append("dimension");
            A0x.put(AnonymousClass000.A0h(valueOf, A0g), A0z.getValue());
        }
        return C32381gG.zzd(A0x, 0);
    }

    public final /* bridge */ /* synthetic */ void zzc(C32381gG r3) {
        ((zzax) r3).zza.putAll(this.zza);
    }
}
