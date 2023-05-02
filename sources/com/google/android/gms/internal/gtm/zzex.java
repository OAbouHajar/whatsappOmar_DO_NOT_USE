package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C13680ns;
import X.C13690nt;
import X.C13710nw;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzex {
    public final Map zza;
    public final List zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final boolean zzf;
    public final String zzg;

    public zzex(zzbr zzbr, Map map, long j2, boolean z2, long j3, int i2, List list) {
        String str;
        String zzj;
        String zzj2;
        C13710nw.A01(zzbr);
        C13710nw.A01(map);
        this.zzd = j2;
        this.zzf = z2;
        this.zzc = j3;
        this.zze = i2;
        this.zzb = list != null ? list : Collections.emptyList();
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzcp zzcp = (zzcp) it.next();
                if ("appendVersion".equals(zzcp.zza)) {
                    str = zzcp.zzc;
                    break;
                }
            }
        }
        str = null;
        this.zzg = true != TextUtils.isEmpty(str) ? str : str2;
        HashMap A0x = AnonymousClass000.A0x();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Object key = A0z.getKey();
            if (!(key == null || !key.toString().startsWith("&") || (zzj2 = zzj(zzbr, A0z.getKey())) == null)) {
                Object value = A0z.getValue();
                String obj = value == null ? "" : value.toString();
                int length = obj.length();
                if (length > 8192) {
                    obj = obj.substring(0, 8192);
                    zzbr.zzT("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj);
                }
                A0x.put(zzj2, obj);
            }
        }
        Iterator A0y2 = AnonymousClass000.A0y(map);
        while (A0y2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass000.A0z(A0y2);
            Object key2 = A0z2.getKey();
            if ((key2 == null || !key2.toString().startsWith("&")) && (zzj = zzj(zzbr, A0z2.getKey())) != null) {
                Object value2 = A0z2.getValue();
                String obj2 = value2 == null ? "" : value2.toString();
                int length2 = obj2.length();
                if (length2 > 8192) {
                    obj2 = obj2.substring(0, 8192);
                    zzbr.zzT("Hit param value is too long and will be trimmed", Integer.valueOf(length2), obj2);
                }
                A0x.put(zzj, obj2);
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzfs.zzg(A0x, "_v", this.zzg);
            String str3 = this.zzg;
            if (str3.equals("ma4.0.0") || str3.equals("ma4.0.1")) {
                A0x.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(A0x);
    }

    public static String zzj(zzbr zzbr, Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("&")) {
                obj2 = obj2.substring(1);
            }
            int length = obj2.length();
            if (length > 256) {
                obj2 = obj2.substring(0, 256);
                zzbr.zzT("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
            }
            if (!TextUtils.isEmpty(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ht=");
        A0r.append(this.zzd);
        long j2 = this.zzc;
        if (j2 != 0) {
            A0r.append(", dbId=");
            A0r.append(j2);
        }
        int i2 = this.zze;
        if (i2 != 0) {
            A0r.append(", appUID=");
            A0r.append(i2);
        }
        ArrayList A0n = C13680ns.A0n(this.zza.keySet());
        Collections.sort(A0n);
        int size = A0n.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str = (String) A0n.get(i3);
            A0r.append(", ");
            A0r.append(str);
            A0r.append("=");
            A0r.append(C13690nt.A0e(str, this.zza));
        }
        return A0r.toString();
    }
}
