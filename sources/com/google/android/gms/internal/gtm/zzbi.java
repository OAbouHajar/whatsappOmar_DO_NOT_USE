package com.google.android.gms.internal.gtm;

import X.C13690nt;
import X.C47082Hk;
import android.text.TextUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class zzbi extends zzbs {
    public static boolean zza;
    public C47082Hk zzb;
    public final zzfo zzc;
    public String zzd;
    public boolean zze = false;
    public final Object zzf = C13690nt.A0Y();

    public zzbi(zzbv zzbv) {
        super(zzbv);
        this.zzc = new zzfo(zzbv.zzd);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[Catch:{ IllegalStateException -> 0x0029, Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[Catch:{ IllegalStateException -> 0x0029, Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[Catch:{ IllegalStateException -> 0x0029, Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized X.C47082Hk zzc() {
        /*
            r12 = this;
            monitor-enter(r12)
            com.google.android.gms.internal.gtm.zzfo r2 = r12.zzc     // Catch:{ all -> 0x016f }
            r0 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r2.zzc(r0)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x016b
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x016f }
            r2.zzb = r0     // Catch:{ all -> 0x016f }
            r8 = 1
            r9 = 0
            com.google.android.gms.internal.gtm.zzbv r0 = r12.zza     // Catch:{ IllegalStateException -> 0x0029, Exception -> 0x001c }
            android.content.Context r0 = r0.zzb     // Catch:{ IllegalStateException -> 0x0029, Exception -> 0x001c }
            X.2Hk r5 = X.C47072Hj.A00(r0)     // Catch:{ IllegalStateException -> 0x0029, Exception -> 0x001c }
            goto L_0x002f
        L_0x001c:
            r1 = move-exception
            boolean r0 = zza     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x002e
            zza = r8     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "Error getting advertiser id"
            r12.zzS(r0, r1)     // Catch:{ all -> 0x016f }
            goto L_0x002e
        L_0x0029:
            java.lang.String r0 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details."
            r12.zzR(r0)     // Catch:{ all -> 0x016f }
        L_0x002e:
            r5 = r9
        L_0x002f:
            X.2Hk r2 = r12.zzb     // Catch:{ all -> 0x016f }
            if (r5 != 0) goto L_0x0035
            r7 = r9
            goto L_0x0037
        L_0x0035:
            java.lang.String r7 = r5.A00     // Catch:{ all -> 0x016f }
        L_0x0037:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x015a
            com.google.android.gms.internal.gtm.zzbv r1 = r12.zza     // Catch:{ all -> 0x016f }
            com.google.android.gms.internal.gtm.zzcn r0 = r1.zzm     // Catch:{ all -> 0x016f }
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)     // Catch:{ all -> 0x016f }
            com.google.android.gms.internal.gtm.zzcn r0 = r1.zzm     // Catch:{ all -> 0x016f }
            java.lang.String r6 = r0.zzb()     // Catch:{ all -> 0x016f }
            java.lang.Object r4 = r12.zzf     // Catch:{ all -> 0x016f }
            monitor-enter(r4)     // Catch:{ all -> 0x016f }
            boolean r0 = r12.zze     // Catch:{ all -> 0x0157 }
            r3 = 0
            if (r0 != 0) goto L_0x00a2
            com.google.android.gms.internal.gtm.zzbv r0 = r12.zza     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            android.content.Context r0 = r0.zzb     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            java.lang.String r2 = "gaClientIdData"
            java.io.FileInputStream r11 = r0.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            r0 = 128(0x80, float:1.794E-43)
            byte[] r10 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            int r1 = r11.read(r10, r3, r0)     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            int r0 = r11.available()     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            if (r0 <= 0) goto L_0x007a
            java.lang.String r0 = "Hash file seems corrupted, deleting it."
            r12.zzR(r0)     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            com.google.android.gms.internal.gtm.zzbv r0 = r12.zza     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            android.content.Context r0 = r0.zzb     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            r0.deleteFile(r2)     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            goto L_0x00d2
        L_0x007a:
            if (r1 > 0) goto L_0x0085
            java.lang.String r0 = "Hash file is empty."
            r12.zzO(r0)     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            goto L_0x00d2
        L_0x0085:
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            r2.<init>(r10, r3, r1)     // Catch:{ FileNotFoundException -> 0x00d2, IOException -> 0x0090 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            goto L_0x00a0
        L_0x008e:
            r1 = move-exception
            goto L_0x0092
        L_0x0090:
            r1 = move-exception
            r2 = r9
        L_0x0092:
            java.lang.String r0 = "Error reading Hash file, deleting it"
            r12.zzS(r0, r1)     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.gtm.zzbv r0 = r12.zza     // Catch:{ all -> 0x0157 }
            android.content.Context r1 = r0.zzb     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "gaClientIdData"
            r1.deleteFile(r0)     // Catch:{ all -> 0x0157 }
        L_0x00a0:
            r9 = r2
            goto L_0x00d2
        L_0x00a2:
            java.lang.String r0 = r12.zzd     // Catch:{ all -> 0x0157 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x00d6
            if (r2 == 0) goto L_0x00bf
            java.lang.String r1 = r2.A00     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = zze(r0)     // Catch:{ all -> 0x0157 }
            r12.zzd = r0     // Catch:{ all -> 0x0157 }
            goto L_0x00d6
        L_0x00bf:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0157 }
            boolean r0 = r12.zzf(r0)     // Catch:{ all -> 0x0157 }
            monitor-exit(r4)     // Catch:{ all -> 0x0157 }
            goto L_0x0154
        L_0x00d2:
            r12.zzd = r9     // Catch:{ all -> 0x0157 }
            r12.zze = r8     // Catch:{ all -> 0x0157 }
        L_0x00d6:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = zze(r0)     // Catch:{ all -> 0x0157 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x00ee
            monitor-exit(r4)     // Catch:{ all -> 0x0157 }
            goto L_0x015d
        L_0x00ee:
            java.lang.String r1 = r12.zzd     // Catch:{ all -> 0x0157 }
            boolean r0 = r2.equals(r1)     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x00f8
            monitor-exit(r4)     // Catch:{ all -> 0x0157 }
            goto L_0x015a
        L_0x00f8:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "Resetting the client id because Advertising Id changed."
            r12.zzO(r0)     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.gtm.zzbv r1 = r12.zza     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.gtm.zzcn r0 = r1.zzm     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.gtm.zzcn r6 = r1.zzm     // Catch:{ all -> 0x0157 }
            monitor-enter(r6)     // Catch:{ all -> 0x0157 }
            r0 = 0
            r6.zza = r0     // Catch:{ all -> 0x0137 }
            com.google.android.gms.internal.gtm.zzbv r0 = r6.zza     // Catch:{ all -> 0x0137 }
            X.0qA r2 = r0.zzg     // Catch:{ all -> 0x0137 }
            X.C13710nw.A01(r2)     // Catch:{ all -> 0x0137 }
            com.google.android.gms.internal.gtm.zzcm r1 = new com.google.android.gms.internal.gtm.zzcm     // Catch:{ all -> 0x0137 }
            r1.<init>(r6)     // Catch:{ all -> 0x0137 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0137 }
            boolean r0 = r0 instanceof X.C105685At     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x0130
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0137 }
            r0.<init>(r1)     // Catch:{ all -> 0x0137 }
            r0.run()     // Catch:{ all -> 0x0137 }
        L_0x012c:
            r6.zzb = r0     // Catch:{ all -> 0x0137 }
            monitor-exit(r6)     // Catch:{ all -> 0x0137 }
            goto L_0x013a
        L_0x0130:
            X.0qB r0 = r2.A03     // Catch:{ all -> 0x0137 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ all -> 0x0137 }
            goto L_0x012c
        L_0x0137:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0137 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x013a:
            java.lang.String r6 = r6.zzb()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "New client Id"
            r12.zzP(r0, r6)     // Catch:{ all -> 0x0157 }
        L_0x0143:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0157 }
            boolean r0 = r12.zzf(r0)     // Catch:{ all -> 0x0157 }
            monitor-exit(r4)     // Catch:{ all -> 0x0157 }
        L_0x0154:
            if (r0 == 0) goto L_0x015d
            goto L_0x015a
        L_0x0157:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x015a:
            r12.zzb = r5     // Catch:{ all -> 0x016f }
            goto L_0x016b
        L_0x015d:
            java.lang.String r0 = "Failed to reset client id on adid change. Not using adid"
            r12.zzJ(r0)     // Catch:{ all -> 0x016f }
            java.lang.String r1 = ""
            X.2Hk r0 = new X.2Hk     // Catch:{ all -> 0x016f }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x016f }
            r12.zzb = r0     // Catch:{ all -> 0x016f }
        L_0x016b:
            X.2Hk r0 = r12.zzb     // Catch:{ all -> 0x016f }
            monitor-exit(r12)
            return r0
        L_0x016f:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbi.zzc():X.2Hk");
    }

    public static String zze(String str) {
        MessageDigest messageDigest;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    break;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, messageDigest.digest(str.getBytes()))});
    }

    private final boolean zzf(String str) {
        try {
            String zze2 = zze(str);
            zzO("Storing hashed adid.");
            FileOutputStream openFileOutput = this.zza.zzb.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze2.getBytes());
            openFileOutput.close();
            this.zzd = zze2;
            return true;
        } catch (IOException e2) {
            zzK("Error creating hash file", e2);
            return false;
        }
    }

    public final String zza() {
        zzW();
        C47082Hk zzc2 = zzc();
        String str = zzc2 != null ? zzc2.A00 : null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzW();
        C47082Hk zzc2 = zzc();
        return zzc2 != null && !zzc2.A01;
    }

    public final void zzd() {
    }
}
