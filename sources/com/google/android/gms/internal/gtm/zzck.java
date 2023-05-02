package com.google.android.gms.internal.gtm;

import X.AnonymousClass3BD;
import X.AnonymousClass3W1;
import X.AnonymousClass5RD;
import X.C13710nw;
import X.C15000qA;
import X.C58072sV;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

public final class zzck extends zzbs {
    public boolean zza;
    public final zzce zzb;
    public final zzfe zzc;
    public final zzfc zzd;
    public final zzcc zze;
    public long zzf = Long.MIN_VALUE;
    public final zzcw zzg;
    public final zzcw zzh;
    public final zzfo zzi;
    public long zzj;
    public boolean zzk;

    public zzck(zzbv zzbv, zzbw zzbw) {
        super(zzbv);
        C13710nw.A01(zzbw);
        this.zzd = new zzfc(zzbv);
        this.zzb = new zzce(zzbv);
        this.zzc = new zzfe(zzbv);
        this.zze = new zzcc(zzbv);
        this.zzi = new zzfo(this.zza.zzd);
        this.zzg = new zzcg(this, zzbv);
        this.zzh = new zzch(this, zzbv);
    }

    private final void zzag() {
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzi);
        zzcy zzcy = zzbv.zzi;
        if (zzcy.zzb) {
            zzcy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzd != 0) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzi);
        zzcy zzcy = zzbv.zzi;
        if (zzcy.zza && !zzcy.zzb) {
            C15000qA.A00();
            zzW();
            try {
                long zzc2 = this.zzb.zzc();
                if (zzc2 != 0 && Math.abs(System.currentTimeMillis() - zzc2) <= ((Number) zzeu.zzn.zzb()).longValue()) {
                    zzP("Dispatch alarm scheduled (ms)", zzeu.zzm.zzb());
                    zzcy.zzb();
                }
            } catch (SQLiteException e2) {
                zzK("Failed to get min/max hit times from local store", e2);
            }
        }
    }

    private final void zzaj(zzbx zzbx, zzaw zzaw) {
        C13710nw.A01(zzbx);
        C13710nw.A01(zzaw);
        AnonymousClass3W1 r4 = new AnonymousClass3W1(this.zza);
        String str = zzbx.zzb;
        C13710nw.A05(str);
        C13710nw.A05(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        Uri build = builder.build();
        AnonymousClass3BD r3 = r4.A00;
        List list = r3.A09;
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (build.equals(((AnonymousClass5RD) listIterator.next()).Aj2())) {
                listIterator.remove();
            }
        }
        zzbv zzbv = r4.A01;
        list.add(new C58072sV(zzbv, str));
        r4.A00 = zzbx.zzc;
        AnonymousClass3BD r2 = new AnonymousClass3BD(r3);
        zzbv.zzs(zzbv.zzo);
        zzcf zzcf = zzbv.zzo;
        zzcf.zzW();
        r2.A02(zzcf.zza);
        zzcx zzcx = zzbv.zzp;
        zzcx.zzW();
        C15000qA r0 = zzcx.zza.zzg;
        C13710nw.A01(r0);
        DisplayMetrics displayMetrics = r0.A01.getResources().getDisplayMetrics();
        zzba zzba = new zzba();
        zzba.zzc = zzfs.zzd(Locale.getDefault());
        zzba.zza = displayMetrics.widthPixels;
        zzba.zzb = displayMetrics.heightPixels;
        r2.A02(zzba);
        Iterator it = r4.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("zza");
        }
        zzbe zzbe = (zzbe) r2.A01(zzbe.class);
        zzbe.zza = "data";
        zzbe.zzf = true;
        r2.A02(zzaw);
        zzaz zzaz = (zzaz) r2.A01(zzaz.class);
        zzav zzav = (zzav) r2.A01(zzav.class);
        for (Map.Entry entry : zzbx.zze.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if ("an".equals(str2)) {
                zzav.zza = str3;
            } else if ("av".equals(str2)) {
                zzav.zzb = str3;
            } else if ("aid".equals(str2)) {
                zzav.zzc = str3;
            } else if ("aiid".equals(str2)) {
                zzav.zzd = str3;
            } else if ("uid".equals(str2)) {
                zzbe.zzc = str3;
            } else {
                C13710nw.A05(str2);
                if (str2 != null && str2.startsWith("&")) {
                    str2 = str2.substring(1);
                }
                C13710nw.A07(str2, "Name can not be empty or \"&\"");
                zzaz.zza.put(str2, str3);
            }
        }
        zzH("Sending installation campaign to", zzbx.zzb, zzaw);
        zzbv zzbv2 = this.zza;
        zzbv.zzs(zzbv2.zzk);
        r2.A01 = zzbv2.zzk.zza();
        C15000qA r6 = r2.A07.A01;
        if (r2.A06) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!r2.A05) {
            AnonymousClass3BD r5 = new AnonymousClass3BD(r2);
            r5.A02 = SystemClock.elapsedRealtime();
            long j2 = r5.A01;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            r5.A00 = j2;
            r5.A05 = true;
            r6.A03.execute(new RunnableRunnableShape2S0200000_I0(r6, 3, r5));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }

    public final long zza() {
        long longValue = ((Number) zzeu.zzi.zzb()).longValue();
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzj);
        zzft zzft = zzbv.zzj;
        zzft.zzW();
        if (!zzft.zzc) {
            return longValue;
        }
        zzbv zzbv2 = this.zza;
        zzbv.zzs(zzbv2.zzj);
        zzft zzft2 = zzbv2.zzj;
        zzft2.zzW();
        return ((long) zzft2.zzd) * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        if (r1 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        if (r4 <= 0) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzae() {
        /*
            r11 = this;
            X.C15000qA.A00()
            r11.zzW()
            boolean r0 = r11.zzk
            if (r0 != 0) goto L_0x013d
            long r4 = r11.zza()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x013d
            com.google.android.gms.internal.gtm.zzce r0 = r11.zzb
            long r4 = r0.zzb()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x013d
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzJ
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b4
            com.google.android.gms.internal.gtm.zzfc r5 = r11.zzd
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r0.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            com.google.android.gms.internal.gtm.zzbq r0 = r0.zzh
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            boolean r0 = r5.zzc
            if (r0 != 0) goto L_0x0092
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            android.content.Context r4 = r0.zzb
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r4.registerReceiver(r5, r0)
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = r4.getPackageName()
            r1.addCategory(r0)
            r4.registerReceiver(r5, r1)
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            android.content.Context r1 = r0.zzb
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0078 }
            if (r0 == 0) goto L_0x0078
            boolean r1 = r0.isConnected()     // Catch:{ SecurityException -> 0x0078 }
            r0 = 1
            if (r1 != 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r5.zzd = r0
            com.google.android.gms.internal.gtm.zzbv r1 = r5.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r4 = r1.zzf
            boolean r0 = r5.zzd
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "Registering connectivity change receiver. Network connected"
            r4.zzP(r0, r1)
            r0 = 1
            r5.zzc = r0
        L_0x0092:
            com.google.android.gms.internal.gtm.zzfc r4 = r11.zzd
            boolean r0 = r4.zzc
            if (r0 != 0) goto L_0x00a6
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf
            java.lang.String r0 = "Connectivity unknown. Receiver not registered"
            r1.zzR(r0)
        L_0x00a6:
            boolean r0 = r4.zzd
            if (r0 != 0) goto L_0x00b4
            r11.zzah()
            r11.zzag()
            r11.zzai()
            return
        L_0x00b4:
            r11.zzai()
            long r6 = r11.zza()
            com.google.android.gms.internal.gtm.zzbv r1 = r11.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r10 = r1.zzk
            X.C15000qA.A00()
            r10.zzW()
            long r4 = r10.zzc
            r8 = -1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00dc
            android.content.SharedPreferences r1 = r10.zza
            java.lang.String r0 = "last_dispatch"
            long r4 = r1.getLong(r0, r2)
            r10.zzc = r4
        L_0x00dc:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            long r0 = java.lang.Math.abs(r0)
            long r4 = r6 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00ff
        L_0x00ef:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzj
            java.lang.Object r0 = r0.zzb()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r4 = java.lang.Math.min(r0, r6)
        L_0x00ff:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "Dispatch scheduled (ms)"
            r11.zzP(r0, r1)
            com.google.android.gms.internal.gtm.zzcw r0 = r11.zzg
            long r2 = r0.zzd
            r7 = 0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x0114
            r0 = 1
        L_0x0114:
            com.google.android.gms.internal.gtm.zzcw r6 = r11.zzg
            if (r0 == 0) goto L_0x0139
            long r1 = r6.zzd
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x012d
            r2 = 0
        L_0x0120:
            r0 = 1
            long r4 = r4 + r2
            long r1 = java.lang.Math.max(r0, r4)
            com.google.android.gms.internal.gtm.zzcw r0 = r11.zzg
            r0.zze(r1)
            return
        L_0x012d:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.zzd
            long r2 = r2 - r0
            long r2 = java.lang.Math.abs(r2)
            goto L_0x0120
        L_0x0139:
            r6.zzg(r4)
            return
        L_0x013d:
            com.google.android.gms.internal.gtm.zzfc r3 = r11.zzd
            boolean r0 = r3.zzc
            if (r0 == 0) goto L_0x016d
            com.google.android.gms.internal.gtm.zzbv r1 = r3.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf
            java.lang.String r0 = "Unregistering connectivity change receiver"
            r1.zzO(r0)
            r0 = 0
            r3.zzc = r0
            r3.zzd = r0
            com.google.android.gms.internal.gtm.zzbv r0 = r3.zzb
            android.content.Context r0 = r0.zzb
            r0.unregisterReceiver(r3)     // Catch:{ IllegalArgumentException -> 0x015e }
            goto L_0x016d
        L_0x015e:
            r2 = move-exception
            com.google.android.gms.internal.gtm.zzbv r1 = r3.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf
            java.lang.String r0 = "Failed to unregister the network broadcast receiver"
            r1.zzK(r0, r2)
        L_0x016d:
            r11.zzah()
            r11.zzag()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzae():void");
    }

    public final void zzd() {
        zzce zzce = this.zzb;
        zzce.zzd();
        zzce.zza = true;
        zzfe zzfe = this.zzc;
        zzfe.zzd();
        zzfe.zza = true;
        zzcc zzcc = this.zze;
        zzcc.zzd();
        zzcc.zza = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        if (r14.zze.zzg() == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0103, code lost:
        zzO("Service connected, sending hits to the service");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        if (r7.isEmpty() != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010e, code lost:
        r9 = (com.google.android.gms.internal.gtm.zzex) r7.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        if (r14.zze.zzh(r9) == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011c, code lost:
        r2 = java.lang.Math.max(r2, r9.zzc);
        r7.remove(r9);
        zzG("Hit sent do device AnalyticsService for delivery", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r11 = r14.zzb;
        r0 = r9.zzc;
        X.C15000qA.A00();
        r11.zzW();
        r8 = new java.util.ArrayList(1);
        r1 = java.lang.Long.valueOf(r0);
        r8.add(r1);
        r11.zzP("Deleting hit, id", r1);
        r11.zzZ(r8);
        r6.add(java.lang.Long.valueOf(r9.zzc));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0159, code lost:
        if (r14.zzc.zze() == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015b, code lost:
        r7 = r14.zzc.zzc(r7);
        r8 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
        if (r8.hasNext() == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016b, code lost:
        r2 = java.lang.Math.max(r2, ((java.lang.Long) r8.next()).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r14.zzb.zzZ(r7);
        r6.addAll(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0186, code lost:
        if (r6.isEmpty() == false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ab, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        zzK("Failed to remove hit that was send for delivery", r1);
        zzah();
        zzag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r14.zzb.zzab();
        r14.zzb.zzaa();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        zzK("Failed to remove successfully uploaded hits", r1);
        zzah();
        zzag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r14.zzb.zzab();
        r14.zzb.zzaa();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d9, code lost:
        r14.zzb.zzab();
        r14.zzb.zzaa();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r14.zzb.zzab();
        r14.zzb.zzaa();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0207, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0208, code lost:
        zzK("Failed to commit local dispatch transaction", r0);
        zzah();
        zzag();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.internal.gtm.zzcz r15, long r16) {
        /*
            r14 = this;
            X.C15000qA.A00()
            r14.zzW()
            com.google.android.gms.internal.gtm.zzbv r1 = r14.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r6 = r1.zzk
            X.C15000qA.A00()
            r6.zzW()
            long r2 = r6.zzc
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            android.content.SharedPreferences r3 = r6.zza
            r1 = 0
            java.lang.String r0 = "last_dispatch"
            long r2 = r3.getLong(r0, r1)
            r6.zzc = r2
        L_0x0029:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
        L_0x0038:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "Dispatching local hits. Elapsed time since last dispatch (ms)"
            r14.zzG(r0, r1)
            r14.zzi()
            goto L_0x0048
        L_0x0045:
            r0 = -1
            goto L_0x0038
        L_0x0048:
            java.lang.String r13 = "Failed to commit local dispatch transaction"
            X.C15000qA.A00()     // Catch:{ Exception -> 0x0262 }
            r14.zzW()     // Catch:{ Exception -> 0x0262 }
            java.lang.String r0 = "Dispatching a batch of local hits"
            r14.zzO(r0)     // Catch:{ Exception -> 0x0262 }
            com.google.android.gms.internal.gtm.zzcc r0 = r14.zze     // Catch:{ Exception -> 0x0262 }
            boolean r0 = r0.zzg()     // Catch:{ Exception -> 0x0262 }
            r2 = 1
            r12 = 0
            r1 = 0
            if (r0 != 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            com.google.android.gms.internal.gtm.zzfe r0 = r14.zzc     // Catch:{ Exception -> 0x0262 }
            boolean r0 = r0.zze()     // Catch:{ Exception -> 0x0262 }
            r2 = r2 ^ r0
            if (r1 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = "No network or service available. Will retry later"
            r14.zzO(r0)     // Catch:{ Exception -> 0x0262 }
            goto L_0x0211
        L_0x0073:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzo     // Catch:{ Exception -> 0x0262 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ Exception -> 0x0262 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0262 }
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x0262 }
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzp     // Catch:{ Exception -> 0x0262 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ Exception -> 0x0262 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0262 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0262 }
            int r0 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x0262 }
            long r4 = (long) r0     // Catch:{ Exception -> 0x0262 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0262 }
            r6.<init>()     // Catch:{ Exception -> 0x0262 }
            r2 = 0
        L_0x0097:
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ all -> 0x01fb }
            r0.zzW()     // Catch:{ all -> 0x01fb }
            android.database.sqlite.SQLiteDatabase r0 = r0.zzf()     // Catch:{ all -> 0x01fb }
            r0.beginTransaction()     // Catch:{ all -> 0x01fb }
            r6.clear()     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x01e4 }
            java.util.List r7 = r0.zzj(r4)     // Catch:{ SQLiteException -> 0x01e4 }
            boolean r0 = r7.isEmpty()     // Catch:{ SQLiteException -> 0x01e4 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "Store is empty, nothing to dispatch"
            r14.zzO(r0)     // Catch:{ SQLiteException -> 0x01e4 }
            r14.zzah()     // Catch:{ SQLiteException -> 0x01e4 }
            r14.zzag()     // Catch:{ SQLiteException -> 0x01e4 }
            goto L_0x0195
        L_0x00bf:
            java.lang.String r1 = "Hits loaded from store. count"
            int r0 = r7.size()     // Catch:{ SQLiteException -> 0x01e4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x01e4 }
            r14.zzP(r1, r0)     // Catch:{ SQLiteException -> 0x01e4 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x01fb }
        L_0x00d0:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzex r0 = (com.google.android.gms.internal.gtm.zzex) r0     // Catch:{ all -> 0x01fb }
            long r0 = r0.zzc     // Catch:{ all -> 0x01fb }
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00d0
            java.lang.String r4 = "Database contains successfully uploaded hit"
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01fb }
            int r0 = r7.size()     // Catch:{ all -> 0x01fb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01fb }
            r14.zzL(r4, r1, r0)     // Catch:{ all -> 0x01fb }
            r14.zzah()     // Catch:{ all -> 0x01fb }
            r14.zzag()     // Catch:{ all -> 0x01fb }
            goto L_0x01a0
        L_0x00fb:
            com.google.android.gms.internal.gtm.zzcc r0 = r14.zze     // Catch:{ all -> 0x01fb }
            boolean r0 = r0.zzg()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = "Service connected, sending hits to the service"
            r14.zzO(r0)     // Catch:{ all -> 0x01fb }
        L_0x0108:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x01fb }
            if (r0 != 0) goto L_0x0153
            java.lang.Object r9 = r7.get(r12)     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzex r9 = (com.google.android.gms.internal.gtm.zzex) r9     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzcc r0 = r14.zze     // Catch:{ all -> 0x01fb }
            boolean r0 = r0.zzh(r9)     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0153
            long r0 = r9.zzc     // Catch:{ all -> 0x01fb }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x01fb }
            r7.remove(r9)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "Hit sent do device AnalyticsService for delivery"
            r14.zzG(r0, r9)     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzce r11 = r14.zzb     // Catch:{ SQLiteException -> 0x01ab }
            long r0 = r9.zzc     // Catch:{ SQLiteException -> 0x01ab }
            X.C15000qA.A00()     // Catch:{ SQLiteException -> 0x01ab }
            r11.zzW()     // Catch:{ SQLiteException -> 0x01ab }
            r10 = 1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01ab }
            r8.<init>(r10)     // Catch:{ SQLiteException -> 0x01ab }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x01ab }
            r8.add(r1)     // Catch:{ SQLiteException -> 0x01ab }
            java.lang.String r0 = "Deleting hit, id"
            r11.zzP(r0, r1)     // Catch:{ SQLiteException -> 0x01ab }
            r11.zzZ(r8)     // Catch:{ SQLiteException -> 0x01ab }
            long r0 = r9.zzc     // Catch:{ SQLiteException -> 0x01ab }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x01ab }
            r6.add(r0)     // Catch:{ SQLiteException -> 0x01ab }
            goto L_0x0108
        L_0x0153:
            com.google.android.gms.internal.gtm.zzfe r0 = r14.zzc     // Catch:{ all -> 0x01fb }
            boolean r0 = r0.zze()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0182
            com.google.android.gms.internal.gtm.zzfe r0 = r14.zzc     // Catch:{ all -> 0x01fb }
            java.util.List r7 = r0.zzc(r7)     // Catch:{ all -> 0x01fb }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x01fb }
        L_0x0165:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x01fb }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01fb }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01fb }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x01fb }
            goto L_0x0165
        L_0x017a:
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x01c2 }
            r0.zzZ(r7)     // Catch:{ SQLiteException -> 0x01c2 }
            r6.addAll(r7)     // Catch:{ SQLiteException -> 0x01c2 }
        L_0x0182:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0189
            goto L_0x01d9
        L_0x0189:
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0097
        L_0x0195:
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0211
        L_0x01a0:
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0211
        L_0x01ab:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove hit that was send for delivery"
            r14.zzK(r0, r1)     // Catch:{ all -> 0x01fb }
            r14.zzah()     // Catch:{ all -> 0x01fb }
            r14.zzag()     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0211
        L_0x01c2:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove successfully uploaded hits"
            r14.zzK(r0, r1)     // Catch:{ all -> 0x01fb }
            r14.zzah()     // Catch:{ all -> 0x01fb }
            r14.zzag()     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0211
        L_0x01d9:
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0211
        L_0x01e4:
            r1 = move-exception
            java.lang.String r0 = "Failed to read hits from persisted store"
            r14.zzS(r0, r1)     // Catch:{ all -> 0x01fb }
            r14.zzah()     // Catch:{ all -> 0x01fb }
            r14.zzag()     // Catch:{ all -> 0x01fb }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            goto L_0x0211
        L_0x01fb:
            r1 = move-exception
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzab()     // Catch:{ SQLiteException -> 0x0207 }
            com.google.android.gms.internal.gtm.zzce r0 = r14.zzb     // Catch:{ SQLiteException -> 0x0207 }
            r0.zzaa()     // Catch:{ SQLiteException -> 0x0207 }
            throw r1     // Catch:{ Exception -> 0x0262 }
        L_0x0207:
            r0 = move-exception
            r14.zzK(r13, r0)     // Catch:{ Exception -> 0x0262 }
            r14.zzah()     // Catch:{ Exception -> 0x0262 }
            r14.zzag()     // Catch:{ Exception -> 0x0262 }
        L_0x0211:
            com.google.android.gms.internal.gtm.zzbv r1 = r14.zza     // Catch:{ Exception -> 0x0262 }
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk     // Catch:{ Exception -> 0x0262 }
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)     // Catch:{ Exception -> 0x0262 }
            com.google.android.gms.internal.gtm.zzfh r4 = r1.zzk     // Catch:{ Exception -> 0x0262 }
            X.C15000qA.A00()     // Catch:{ Exception -> 0x0262 }
            r4.zzW()     // Catch:{ Exception -> 0x0262 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0262 }
            android.content.SharedPreferences r0 = r4.zza     // Catch:{ Exception -> 0x0262 }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ Exception -> 0x0262 }
            java.lang.String r0 = "last_dispatch"
            r3.putLong(r0, r1)     // Catch:{ Exception -> 0x0262 }
            r3.apply()     // Catch:{ Exception -> 0x0262 }
            r4.zzc = r1     // Catch:{ Exception -> 0x0262 }
            r14.zzae()     // Catch:{ Exception -> 0x0262 }
            if (r15 == 0) goto L_0x023d
            r0 = 0
            r15.zza(r0)     // Catch:{ Exception -> 0x0262 }
        L_0x023d:
            long r1 = r14.zzj     // Catch:{ Exception -> 0x0262 }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0293
            com.google.android.gms.internal.gtm.zzfc r0 = r14.zzd     // Catch:{ Exception -> 0x0262 }
            com.google.android.gms.internal.gtm.zzbv r0 = r0.zzb     // Catch:{ Exception -> 0x0262 }
            android.content.Context r3 = r0.zzb     // Catch:{ Exception -> 0x0262 }
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0262 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0262 }
            java.lang.String r0 = r3.getPackageName()     // Catch:{ Exception -> 0x0262 }
            r2.addCategory(r0)     // Catch:{ Exception -> 0x0262 }
            java.lang.String r1 = com.google.android.gms.internal.gtm.zzfc.zza     // Catch:{ Exception -> 0x0262 }
            r0 = 1
            r2.putExtra(r1, r0)     // Catch:{ Exception -> 0x0262 }
            r0 = 0
            r3.sendOrderedBroadcast(r2, r0)     // Catch:{ Exception -> 0x0262 }
            return
        L_0x0262:
            r5 = move-exception
            java.lang.String r0 = "Local dispatch failed"
            r14.zzK(r0, r5)
            com.google.android.gms.internal.gtm.zzbv r1 = r14.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r4 = r1.zzk
            X.C15000qA.A00()
            r4.zzW()
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r4.zza
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "last_dispatch"
            r1.putLong(r0, r2)
            r1.apply()
            r4.zzc = r2
            r14.zzae()
            if (r15 == 0) goto L_0x0293
            r15.zza(r5)
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzg(com.google.android.gms.internal.gtm.zzcz, long):void");
    }

    public final void zzi() {
        if (!this.zzk && ((Boolean) zzeu.zzb.zzb()).booleanValue() && !this.zze.zzg()) {
            long longValue = ((Number) zzeu.zzO.zzb()).longValue();
            zzfo zzfo = this.zzi;
            if (zzfo.zzc(longValue)) {
                zzfo.zzb = SystemClock.elapsedRealtime();
                zzO("Connecting to service");
                if (this.zze.zzf()) {
                    zzO("Connected to service");
                    this.zzi.zzb = 0;
                    zzm();
                }
            }
        }
    }

    public final void zzk(zzbx zzbx) {
        C15000qA.A00();
        zzG("Sending first hit to property", zzbx.zzb);
        zzbv zzbv = this.zza;
        zzbv.zzs(zzbv.zzk);
        zzfh zzfh = zzbv.zzk;
        if (!new zzfo(zzfh.zza.zzd, zzfh.zza()).zzc(((Number) zzeu.zzG.zzb()).longValue())) {
            zzbv zzbv2 = this.zza;
            zzbv.zzs(zzbv2.zzk);
            zzfh zzfh2 = zzbv2.zzk;
            C15000qA.A00();
            zzfh2.zzW();
            String str = null;
            String string = zzfh2.zza.getString("installation_campaign", (String) null);
            if (!TextUtils.isEmpty(string)) {
                str = string;
            }
            if (!TextUtils.isEmpty(str)) {
                zzbv zzbv3 = this.zza;
                zzbv.zzs(zzbv3.zzf);
                zzaw zzb2 = zzfs.zzb(zzbv3.zzf, str);
                zzG("Found relevant installation campaign", zzb2);
                zzaj(zzbx, zzb2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058 A[LOOP:1: B:13:0x0058->B:21:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0054 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm() {
        /*
            r7 = this;
            X.C15000qA.A00()
            X.C15000qA.A00()
            r7.zzW()
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzb
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r7.zzR(r0)
        L_0x001c:
            com.google.android.gms.internal.gtm.zzcc r0 = r7.zze
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "Service not connected"
            r7.zzO(r0)
        L_0x0029:
            return
        L_0x002a:
            com.google.android.gms.internal.gtm.zzce r0 = r7.zzb
            long r3 = r0.zzb()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r7.zzO(r0)
        L_0x003b:
            com.google.android.gms.internal.gtm.zzce r2 = r7.zzb     // Catch:{ SQLiteException -> 0x0099 }
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzo     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ SQLiteException -> 0x0099 }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x0099 }
            long r0 = (long) r0     // Catch:{ SQLiteException -> 0x0099 }
            java.util.List r6 = r2.zzj(r0)     // Catch:{ SQLiteException -> 0x0099 }
            boolean r0 = r6.isEmpty()     // Catch:{ SQLiteException -> 0x0099 }
            if (r0 == 0) goto L_0x0058
            r7.zzae()     // Catch:{ SQLiteException -> 0x0099 }
            goto L_0x0094
        L_0x0058:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x003b
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            com.google.android.gms.internal.gtm.zzex r1 = (com.google.android.gms.internal.gtm.zzex) r1
            com.google.android.gms.internal.gtm.zzcc r0 = r7.zze
            boolean r0 = r0.zzh(r1)
            if (r0 != 0) goto L_0x0071
            r7.zzae()
            return
        L_0x0071:
            r6.remove(r1)
            com.google.android.gms.internal.gtm.zzce r5 = r7.zzb     // Catch:{ SQLiteException -> 0x0095 }
            long r3 = r1.zzc     // Catch:{ SQLiteException -> 0x0095 }
            X.C15000qA.A00()     // Catch:{ SQLiteException -> 0x0095 }
            r5.zzW()     // Catch:{ SQLiteException -> 0x0095 }
            r0 = 1
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r2.<init>(r0)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0095 }
            r2.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r0 = "Deleting hit, id"
            r5.zzP(r0, r1)     // Catch:{ SQLiteException -> 0x0095 }
            r5.zzZ(r2)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0058
        L_0x0094:
            return
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove hit that was send for delivery"
            goto L_0x009c
        L_0x0099:
            r1 = move-exception
            java.lang.String r0 = "Failed to read hits from store"
        L_0x009c:
            r7.zzK(r0, r1)
            r7.zzah()
            r7.zzag()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzm():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b3, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b4, code lost:
        r11 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzn(java.lang.String r24) {
        /*
            r23 = this;
            r6 = r24
            X.C13710nw.A05(r6)
            X.C15000qA.A00()
            r4 = r23
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zza
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzaw r3 = com.google.android.gms.internal.gtm.zzfs.zzb(r0, r6)
            java.lang.String r8 = "0"
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Parsing failed. Ignoring invalid campaign data"
            r4.zzS(r0, r6)
        L_0x0020:
            return
        L_0x0021:
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            X.C15000qA.A00()
            r0.zzW()
            android.content.SharedPreferences r0 = r0.zza
            java.lang.String r5 = "installation_campaign"
            r2 = 0
            java.lang.String r1 = r0.getString(r5, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0040
            r2 = r1
        L_0x0040:
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "Ignoring duplicate install campaign"
            r4.zzR(r0)
            return
        L_0x004c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "Ignoring multiple install campaigns. original, new"
            r4.zzL(r0, r2, r6)
            return
        L_0x0058:
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r2 = r1.zzk
            X.C15000qA.A00()
            r2.zzW()
            android.content.SharedPreferences r0 = r2.zza
            android.content.SharedPreferences$Editor r1 = r0.edit()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x00af
            r1.remove(r5)
        L_0x0076:
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "Failed to commit campaign data"
            r2.zzR(r0)
        L_0x0081:
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r1 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv r0 = r1.zza
            X.5Lo r5 = r0.zzd
            long r0 = r1.zza()
            com.google.android.gms.internal.gtm.zzfo r2 = new com.google.android.gms.internal.gtm.zzfo
            r2.<init>(r5, r0)
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzG
            java.lang.Object r0 = r0.zzb()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            boolean r0 = r2.zzc(r0)
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "Campaign received too late, ignoring"
            r4.zzS(r0, r3)
            return
        L_0x00af:
            r1.putString(r5, r6)
            goto L_0x0076
        L_0x00b3:
            java.lang.String r0 = "Received installation campaign"
            r4.zzG(r0, r3)
            com.google.android.gms.internal.gtm.zzce r2 = r4.zzb
            r2.zzW()
            X.C15000qA.A00()
            android.database.sqlite.SQLiteDatabase r9 = r2.zzf()
            r0 = 5
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r0 = "cid"
            r1 = 0
            r11[r1] = r0     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r0 = "tid"
            r7 = 1
            r11[r7] = r0     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r5 = "adid"
            r0 = 2
            r11[r0] = r5     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r5 = "hits_count"
            r0 = 3
            r11[r0] = r5     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r5 = "params"
            r0 = 4
            r11[r0] = r5     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzh     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            int r6 = r0.intValue()     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r17 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r12 = "app_uid=?"
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            r13[r1] = r8     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.lang.String r10 = "properties"
            r14 = 0
            r5 = 2
            r0 = 1
            r16 = r14
            r15 = r14
            android.database.Cursor r11 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x01b3, all -> 0x01b1 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01af }
            r10.<init>()     // Catch:{ SQLiteException -> 0x01af }
            boolean r7 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x01af }
            if (r7 == 0) goto L_0x015a
        L_0x010e:
            java.lang.String r9 = r11.getString(r1)     // Catch:{ SQLiteException -> 0x01af }
            java.lang.String r8 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x01af }
            int r12 = r11.getInt(r5)     // Catch:{ SQLiteException -> 0x01af }
            r7 = 3
            r19 = 0
            if (r12 == 0) goto L_0x0121
            r19 = 1
        L_0x0121:
            int r7 = r11.getInt(r7)     // Catch:{ SQLiteException -> 0x01af }
            long r12 = (long) r7     // Catch:{ SQLiteException -> 0x01af }
            r7 = 4
            java.lang.String r14 = r11.getString(r7)     // Catch:{ SQLiteException -> 0x01af }
            boolean r7 = android.text.TextUtils.isEmpty(r14)     // Catch:{ SQLiteException -> 0x01af }
            if (r7 == 0) goto L_0x016c
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x01af }
            r7.<init>(r1)     // Catch:{ SQLiteException -> 0x01af }
        L_0x0136:
            boolean r14 = android.text.TextUtils.isEmpty(r9)     // Catch:{ SQLiteException -> 0x01af }
            if (r14 != 0) goto L_0x0166
            boolean r14 = android.text.TextUtils.isEmpty(r8)     // Catch:{ SQLiteException -> 0x01af }
            if (r14 != 0) goto L_0x0166
            r15 = 0
            com.google.android.gms.internal.gtm.zzbx r14 = new com.google.android.gms.internal.gtm.zzbx     // Catch:{ SQLiteException -> 0x01af }
            r22 = r7
            r20 = r12
            r18 = r8
            r17 = r9
            r14.<init>(r15, r17, r18, r19, r20, r22)     // Catch:{ SQLiteException -> 0x01af }
            r10.add(r14)     // Catch:{ SQLiteException -> 0x01af }
        L_0x0154:
            boolean r7 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x01af }
            if (r7 != 0) goto L_0x010e
        L_0x015a:
            int r0 = r10.size()     // Catch:{ SQLiteException -> 0x01af }
            if (r0 < r6) goto L_0x0198
            java.lang.String r0 = "Sending hits to too many properties. Campaign report might be incorrect"
            r2.zzR(r0)     // Catch:{ SQLiteException -> 0x01af }
            goto L_0x0198
        L_0x0166:
            java.lang.String r7 = "Read property with empty client id or tracker id"
            r2.zzT(r7, r9, r8)     // Catch:{ SQLiteException -> 0x01af }
            goto L_0x0154
        L_0x016c:
            java.lang.String r7 = "?"
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ URISyntaxException -> 0x018c }
            int r15 = r14.length()     // Catch:{ URISyntaxException -> 0x018c }
            if (r15 == 0) goto L_0x0186
            java.lang.String r14 = r7.concat(r14)     // Catch:{ URISyntaxException -> 0x018c }
        L_0x017c:
            java.net.URI r7 = new java.net.URI     // Catch:{ URISyntaxException -> 0x018c }
            r7.<init>(r14)     // Catch:{ URISyntaxException -> 0x018c }
            java.util.Map r7 = X.AnonymousClass4Z6.A00(r7)     // Catch:{ URISyntaxException -> 0x018c }
            goto L_0x0136
        L_0x0186:
            java.lang.String r14 = new java.lang.String     // Catch:{ URISyntaxException -> 0x018c }
            r14.<init>(r7)     // Catch:{ URISyntaxException -> 0x018c }
            goto L_0x017c
        L_0x018c:
            r14 = move-exception
            java.lang.String r7 = "Error parsing property parameters"
            r2.zzK(r7, r14)     // Catch:{ SQLiteException -> 0x01af }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x01af }
            r7.<init>(r1)     // Catch:{ SQLiteException -> 0x01af }
            goto L_0x0136
        L_0x0198:
            r11.close()
            java.util.Iterator r1 = r10.iterator()
        L_0x019f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            com.google.android.gms.internal.gtm.zzbx r0 = (com.google.android.gms.internal.gtm.zzbx) r0
            r4.zzaj(r0, r3)
            goto L_0x019f
        L_0x01af:
            r1 = move-exception
            goto L_0x01b5
        L_0x01b1:
            r0 = move-exception
            throw r0
        L_0x01b3:
            r1 = move-exception
            r11 = 0
        L_0x01b5:
            java.lang.String r0 = "Error loading hits from the database"
            r2.zzK(r0, r1)     // Catch:{ all -> 0x01bb }
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r0 = move-exception
            if (r11 == 0) goto L_0x01c1
            r11.close()
        L_0x01c1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzn(java.lang.String):void");
    }
}
