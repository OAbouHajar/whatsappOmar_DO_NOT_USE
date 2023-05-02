package com.google.android.gms.internal.gtm;

import X.C13690nt;
import X.C13710nw;
import android.content.SharedPreferences;
import android.util.Pair;
import java.util.UUID;

public final class zzfg {
    public final /* synthetic */ zzfh zza;
    public final String zzb;
    public final long zzc;

    public /* synthetic */ zzfg(zzfh zzfh, String str, long j2, zzff zzff) {
        this.zza = zzfh;
        C13710nw.A05("monitoring");
        if (j2 > 0) {
            this.zzb = "monitoring";
            this.zzc = j2;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final void zzg() {
        zzfh zzfh = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = zzfh.zza.edit();
        edit.remove("monitoring".concat(":count"));
        edit.remove("monitoring".concat(":value"));
        edit.putLong("monitoring".concat(":start"), currentTimeMillis);
        edit.commit();
    }

    public final Pair zza() {
        long j2 = this.zza.zza.getLong("monitoring".concat(":start"), 0);
        long abs = j2 == 0 ? 0 : Math.abs(j2 - System.currentTimeMillis());
        long j3 = this.zzc;
        if (abs >= j3) {
            if (abs > j3 + j3) {
                zzg();
            } else {
                String string = this.zza.zza.getString("monitoring".concat(":value"), (String) null);
                long j4 = this.zza.zza.getLong("monitoring".concat(":count"), 0);
                zzg();
                if (string != null && j4 > 0) {
                    return C13690nt.A0I(string, Long.valueOf(j4));
                }
            }
        }
        return null;
    }

    public final void zzc(String str) {
        if (this.zza.zza.getLong("monitoring".concat(":start"), 0) == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            SharedPreferences sharedPreferences = this.zza.zza;
            String concat = "monitoring".concat(":count");
            long j2 = sharedPreferences.getLong(concat, 0);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = this.zza.zza.edit();
                edit.putString("monitoring".concat(":value"), str);
                edit.putLong(concat, 1);
                edit.apply();
            } else {
                long j3 = j2 + 1;
                SharedPreferences.Editor edit2 = this.zza.zza.edit();
                if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
                    edit2.putString("monitoring".concat(":value"), str);
                }
                edit2.putLong(concat, j3);
                edit2.apply();
            }
        }
    }
}
