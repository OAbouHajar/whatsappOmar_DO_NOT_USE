package com.google.android.gms.internal.gtm;

import X.AnonymousClass3BF;
import X.C13710nw;
import X.C15000qA;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzcc extends zzbs {
    public final zzcb zza = new zzcb(this);
    public final zzcw zzb;
    public final zzfo zzc;
    public zzey zzd;

    public zzcc(zzbv zzbv) {
        super(zzbv);
        this.zzc = new zzfo(zzbv.zzd);
        this.zzb = new zzby(this, zzbv);
    }

    public static /* bridge */ /* synthetic */ void zzi(zzcc zzcc, zzey zzey) {
        C15000qA.A00();
        zzcc.zzd = zzey;
        zzcc.zzj();
        zzbv zzbv = zzcc.zza;
        zzbv.zzs(zzbv.zzh);
        zzbq zzbq = zzbv.zzh;
        C15000qA.A00();
        zzbq.zza.zzm();
    }

    private final void zzj() {
        this.zzc.zzb = SystemClock.elapsedRealtime();
        this.zzb.zzg(((Number) zzeu.zzK.zzb()).longValue());
    }

    public final void zzc() {
        C15000qA.A00();
        zzW();
        try {
            AnonymousClass3BF.A00().A01(this.zza.zzb, this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzbv zzbv = this.zza;
            zzbv.zzs(zzbv.zzh);
            zzbq zzbq = zzbv.zzh;
            zzbq.zzW();
            C15000qA.A00();
            zzck zzck = zzbq.zza;
            C15000qA.A00();
            zzck.zzW();
            zzck.zzO("Service disconnected");
        }
    }

    public final void zzd() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|12|13|14|15|(1:17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        r12.zzd = r2;
        zzj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzf() {
        /*
            r12 = this;
            X.C15000qA.A00()
            r12.zzW()
            com.google.android.gms.internal.gtm.zzey r0 = r12.zzd
            r4 = 1
            if (r0 != 0) goto L_0x0094
            com.google.android.gms.internal.gtm.zzcb r3 = r12.zza
            X.C15000qA.A00()
            java.lang.String r0 = "com.google.android.gms.analytics.service.START"
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r0)
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r1 = "com.google.android.gms.analytics.service.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            r8.setComponent(r0)
            com.google.android.gms.internal.gtm.zzcc r0 = r3.zza
            com.google.android.gms.internal.gtm.zzbv r0 = r0.zza
            android.content.Context r7 = r0.zzb
            java.lang.String r1 = "app_package_name"
            java.lang.String r0 = r7.getPackageName()
            r8.putExtra(r1, r0)
            X.3BF r6 = X.AnonymousClass3BF.A00()
            monitor-enter(r3)
            r5 = 0
            r3.zzc = r5     // Catch:{ all -> 0x0091 }
            r3.zzb = r4     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.gtm.zzcc r0 = r3.zza     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.gtm.zzcb r9 = r0.zza     // Catch:{ all -> 0x0091 }
            r11 = 129(0x81, float:1.81E-43)
            java.lang.Class r0 = r7.getClass()     // Catch:{ all -> 0x0091 }
            java.lang.String r10 = r0.getName()     // Catch:{ all -> 0x0091 }
            boolean r6 = r6.A02(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.gtm.zzcc r2 = r3.zza     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "Bind to service requested"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0091 }
            r2.zzP(r1, r0)     // Catch:{ all -> 0x0091 }
            r2 = 0
            if (r6 != 0) goto L_0x0060
            r3.zzb = r2     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x0060:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzL     // Catch:{ InterruptedException -> 0x0070 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ InterruptedException -> 0x0070 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ InterruptedException -> 0x0070 }
            long r0 = r0.longValue()     // Catch:{ InterruptedException -> 0x0070 }
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0070 }
            goto L_0x0077
        L_0x0070:
            com.google.android.gms.internal.gtm.zzcc r1 = r3.zza     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "Wait for service connect was interrupted"
            r1.zzR(r0)     // Catch:{ all -> 0x0091 }
        L_0x0077:
            r3.zzb = r2     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.gtm.zzey r2 = r3.zzc     // Catch:{ all -> 0x0091 }
            r3.zzc = r5     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x0086
            com.google.android.gms.internal.gtm.zzcc r1 = r3.zza     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "Successfully bound to service but never got onServiceConnected callback"
            r1.zzJ(r0)     // Catch:{ all -> 0x0091 }
        L_0x0086:
            monitor-exit(r3)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x008f
            r12.zzd = r2
            r12.zzj()
            return r4
        L_0x008f:
            r0 = 0
            return r0
        L_0x0091:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0091 }
            throw r0
        L_0x0094:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcc.zzf():boolean");
    }

    public final boolean zzg() {
        C15000qA.A00();
        zzW();
        return this.zzd != null;
    }

    public final boolean zzh(zzex zzex) {
        Parcel obtain;
        Parcel obtain2;
        C13710nw.A01(zzex);
        C15000qA.A00();
        zzW();
        zzey zzey = this.zzd;
        if (zzey == null) {
            return false;
        }
        String str = (String) (zzex.zzf ? zzeu.zzr : zzeu.zzq).zzb();
        List emptyList = Collections.emptyList();
        try {
            Map map = zzex.zza;
            long j2 = zzex.zzd;
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(zzey.zzb);
            obtain.writeMap(map);
            obtain.writeLong(j2);
            obtain.writeString(str);
            obtain.writeTypedList(emptyList);
            obtain2 = Parcel.obtain();
            zzey.zza.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzO("Failed to send hits to AnalyticsService");
            return false;
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
