package com.google.android.gms.internal.gtm;

import X.C107825Lo;
import X.C13710nw;
import X.C15000qA;
import X.C65653Vp;
import X.C98074r3;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.util.List;

public final class zzbv {
    public static volatile zzbv zza;
    public final Context zzb;
    public final Context zzc;
    public final C107825Lo zzd = C98074r3.A00;
    public final zzct zze = new zzct(this);
    public final zzfb zzf;
    public final C15000qA zzg;
    public final zzbq zzh;
    public final zzcy zzi;
    public final zzft zzj;
    public final zzfh zzk;
    public final C65653Vp zzl;
    public final zzcn zzm;
    public final zzbi zzn;
    public final zzcf zzo;
    public final zzcx zzp;

    public zzbv(zzbw zzbw) {
        Context context = zzbw.zza;
        C13710nw.A02(context, "Application context can't be null");
        Context context2 = zzbw.zzb;
        C13710nw.A01(context2);
        this.zzb = context;
        this.zzc = context2;
        zzfb zzfb = new zzfb(this);
        zzfb.zzd();
        zzfb.zza = true;
        this.zzf = zzfb;
        zzs(zzfb);
        zzfb zzfb2 = this.zzf;
        String str = zzbt.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfb2.zzM(sb.toString());
        zzfh zzfh = new zzfh(this);
        zzfh.zzd();
        zzfh.zza = true;
        this.zzk = zzfh;
        zzft zzft = new zzft(this);
        zzft.zzd();
        zzft.zza = true;
        this.zzj = zzft;
        zzbq zzbq = new zzbq(this, zzbw);
        zzcn zzcn = new zzcn(this);
        zzbi zzbi = new zzbi(this);
        zzcf zzcf = new zzcf(this);
        zzcx zzcx = new zzcx(this);
        C13710nw.A01(context);
        if (C15000qA.A06 == null) {
            synchronized (C15000qA.class) {
                if (C15000qA.A06 == null) {
                    C15000qA.A06 = new C15000qA(context);
                }
            }
        }
        C15000qA r1 = C15000qA.A06;
        r1.A00 = new zzbu(this);
        this.zzg = r1;
        C65653Vp r2 = new C65653Vp(this);
        zzcn.zzd();
        zzcn.zza = true;
        this.zzm = zzcn;
        zzbi.zzd();
        zzbi.zza = true;
        this.zzn = zzbi;
        zzcf.zzd();
        zzcf.zza = true;
        this.zzo = zzcf;
        zzcx.zzd();
        zzcx.zza = true;
        this.zzp = zzcx;
        zzcy zzcy = new zzcy(this);
        zzcy.zzd();
        zzcy.zza = true;
        this.zzi = zzcy;
        zzbq.zzd();
        zzbq.zza = true;
        this.zzh = zzbq;
        zzbv zzbv = r2.A01;
        zzs(zzbv.zzj);
        zzft zzft2 = zzbv.zzj;
        zzft2.zzW();
        zzft2.zzW();
        if (zzft2.zze) {
            zzft2.zzW();
            r2.A02 = zzft2.zzf;
        }
        zzft2.zzW();
        r2.A01 = true;
        this.zzl = r2;
        zzck zzck = zzbq.zza;
        zzck.zzW();
        C13710nw.A04("Analytics backend already started", !zzck.zza);
        zzck.zza = true;
        C15000qA r22 = zzck.zza.zzg;
        C13710nw.A01(r22);
        r22.A03.submit(new RunnableRunnableShape1S0100000_I0((Object) zzck, 13));
    }

    public static zzbv zzg(Context context) {
        C13710nw.A01(context);
        if (zza == null) {
            synchronized (zzbv.class) {
                if (zza == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzbv zzbv = new zzbv(new zzbw(context));
                    zza = zzbv;
                    synchronized (C65653Vp.class) {
                        List<Runnable> list = C65653Vp.A04;
                        if (list != null) {
                            for (Runnable run : list) {
                                run.run();
                            }
                            C65653Vp.A04 = null;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    Long l2 = (Long) zzeu.zzQ.zzb();
                    if (elapsedRealtime2 > l2.longValue()) {
                        zzs(zzbv.zzf);
                        zzbv.zzf.zzT("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), l2);
                    }
                }
            }
        }
        return zza;
    }

    public static final void zzs(zzbs zzbs) {
        C13710nw.A02(zzbs, "Analytics service not created/initialized");
        boolean z2 = zzbs.zza;
        boolean z3 = false;
        if (z2) {
            z3 = true;
        }
        C13710nw.A03("Analytics service not initialized", z3);
    }
}
