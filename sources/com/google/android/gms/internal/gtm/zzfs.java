package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.AnonymousClass4Z6;
import X.C13680ns;
import X.C13690nt;
import X.C13710nw;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;

public final class zzfs {
    public static zzaw zzb(zzfb zzfb, String str) {
        C13710nw.A01(zzfb);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map A00 = AnonymousClass4Z6.A00(new URI(C13680ns.A0g(String.valueOf(str), "?")));
            zzaw zzaw = new zzaw();
            zzaw.zze = C13690nt.A0e("utm_content", A00);
            zzaw.zzc = C13690nt.A0e("utm_medium", A00);
            zzaw.zza = C13690nt.A0e("utm_campaign", A00);
            zzaw.zzb = C13690nt.A0e("utm_source", A00);
            zzaw.zzd = C13690nt.A0e("utm_term", A00);
            zzaw.zzf = C13690nt.A0e("utm_id", A00);
            zzaw.zzg = C13690nt.A0e("anid", A00);
            zzaw.zzh = C13690nt.A0e("gclid", A00);
            zzaw.zzi = C13690nt.A0e("dclid", A00);
            zzaw.zzj = C13690nt.A0e("aclid", A00);
            return zzaw;
        } catch (URISyntaxException e2) {
            zzfb.zzS("No valid campaign data found", e2);
            return null;
        }
    }

    public static String zzd(Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    A0o.append("-");
                    A0o.append(locale.getCountry().toLowerCase(locale));
                }
                return A0o.toString();
            }
        }
        return null;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }
}
