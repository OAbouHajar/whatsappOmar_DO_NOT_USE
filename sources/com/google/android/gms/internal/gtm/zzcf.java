package com.google.android.gms.internal.gtm;

import X.C13680ns;
import X.C13710nw;
import X.C15000qA;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

public final class zzcf extends zzbs {
    public final zzav zza = new zzav();

    public zzcf(zzbv zzbv) {
        super(zzbv);
    }

    public final void zzd() {
        C15000qA r5 = this.zza.zzg;
        C13710nw.A01(r5);
        if (r5.A05 == null) {
            synchronized (r5) {
                if (r5.A05 == null) {
                    zzav zzav = new zzav();
                    Context context = r5.A01;
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    zzav.zzc = packageName;
                    zzav.zzd = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("GAv4", C13680ns.A0g(String.valueOf(packageName), "Error retrieving package info: appName set to "));
                    }
                    zzav.zza = packageName;
                    zzav.zzb = str;
                    r5.A05 = zzav;
                }
            }
        }
        r5.A05.zzc(this.zza);
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzj);
        zzft zzft = zzbv.zzj;
        zzft.zzW();
        String str2 = zzft.zzb;
        if (str2 != null) {
            this.zza.zza = str2;
        }
        zzft.zzW();
        String str3 = zzft.zza;
        if (str3 != null) {
            this.zza.zzb = str3;
        }
    }
}
