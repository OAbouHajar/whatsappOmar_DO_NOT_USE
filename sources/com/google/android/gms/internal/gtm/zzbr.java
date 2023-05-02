package com.google.android.gms.internal.gtm;

import X.C13710nw;
import X.C13860oC;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;

public class zzbr {
    public final zzbv zza;

    public zzbr(zzbv zzbv) {
        C13710nw.A01(zzbv);
        this.zza = zzbv;
    }

    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String zza2 = zza(obj);
        String zza3 = zza(obj2);
        String zza4 = zza(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza2)) {
            sb.append(str2);
            sb.append(zza2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str2);
            sb.append(zza3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zza4)) {
            sb.append(str3);
            sb.append(zza4);
        }
        return sb.toString();
    }

    public static String zza(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj.toString();
    }

    private final void zzb(int i2, String str, Object obj, Object obj2, Object obj3) {
        zzfb zzfb;
        zzbv zzbv = this.zza;
        if (zzbv == null || (zzfb = zzbv.zzf) == null) {
            String str2 = (String) zzeu.zzc.zzb();
            if (Log.isLoggable(str2, i2)) {
                Log.println(i2, str2, zzD(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String str3 = (String) zzeu.zzc.zzb();
        if (Log.isLoggable(str3, i2)) {
            Log.println(i2, str3, zzD(str, obj, obj2, obj3));
        }
        if (i2 >= 5) {
            synchronized (zzfb) {
                C13710nw.A01(str);
                zzct zzct = zzfb.zza.zze;
                if (zzct.zzb == null) {
                    synchronized (zzct) {
                        if (zzct.zzb == null) {
                            ApplicationInfo applicationInfo = zzct.zza.zzb.getApplicationInfo();
                            String A00 = C13860oC.A00();
                            if (applicationInfo != null) {
                                String str4 = applicationInfo.processName;
                                boolean z2 = false;
                                if (str4 != null && str4.equals(A00)) {
                                    z2 = true;
                                }
                                zzct.zzb = Boolean.valueOf(z2);
                            }
                            if ((zzct.zzb == null || !zzct.zzb.booleanValue()) && "com.google.android.gms.analytics".equals(A00)) {
                                zzct.zzb = Boolean.TRUE;
                            }
                            if (zzct.zzb == null) {
                                zzct.zzb = Boolean.TRUE;
                                zzbv zzbv2 = zzct.zza;
                                zzbv.zzs(zzbv2.zzf);
                                zzbv2.zzf.zzJ("My process not in the list of running processes");
                            }
                        }
                    }
                }
                char c2 = 'c';
                if (zzct.zzb.booleanValue()) {
                    c2 = 'C';
                }
                char charAt = "01VDIWEA?".charAt(i2);
                String str5 = zzbt.zza;
                String zzD = zzD(str, zzfb.zzf(obj), zzfb.zzf(obj2), zzfb.zzf(obj3));
                int length = String.valueOf(str5).length();
                StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(zzD).length());
                sb.append("3");
                sb.append(charAt);
                sb.append(c2);
                sb.append(str5);
                sb.append(":");
                sb.append(zzD);
                String obj4 = sb.toString();
                if (obj4.length() > 1024) {
                    obj4 = obj4.substring(0, 1024);
                }
                zzfh zzfh = zzfb.zza.zzk;
                if (zzfh != null && zzfh.zza) {
                    zzfh.zzd.zzc(obj4);
                }
            }
        }
    }

    public final void zzF(String str) {
        zzb(3, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzG(String str, Object obj) {
        zzb(3, str, obj, (Object) null, (Object) null);
    }

    public final void zzH(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, (Object) null);
    }

    public final void zzI(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzJ(String str) {
        zzb(6, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzK(String str, Object obj) {
        zzb(6, str, obj, (Object) null, (Object) null);
    }

    public final void zzL(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, (Object) null);
    }

    public final void zzM(String str) {
        zzb(4, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzN(String str, Object obj) {
        zzb(4, "Dry run is enabled. GoogleAnalytics would have sent", obj, (Object) null, (Object) null);
    }

    public final void zzO(String str) {
        zzb(2, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzP(String str, Object obj) {
        zzb(2, str, obj, (Object) null, (Object) null);
    }

    public final void zzQ(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, (Object) null);
    }

    public final void zzR(String str) {
        zzb(5, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzS(String str, Object obj) {
        zzb(5, str, obj, (Object) null, (Object) null);
    }

    public final void zzT(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, (Object) null);
    }

    public final void zzU(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }
}
