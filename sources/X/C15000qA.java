package X;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzck;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0qA  reason: invalid class name and case insensitive filesystem */
public final class C15000qA {
    public static volatile C15000qA A06;
    public Thread.UncaughtExceptionHandler A00;
    public final Context A01;
    public final AnonymousClass3E9 A02 = new AnonymousClass3E9();
    public final C15010qB A03 = new C15010qB(this);
    public final List A04 = new CopyOnWriteArrayList();
    public volatile zzav A05;

    public C15000qA(Context context) {
        Context applicationContext = context.getApplicationContext();
        C13710nw.A01(applicationContext);
        this.A01 = applicationContext;
    }

    public static void A00() {
        if (!(Thread.currentThread() instanceof C105685At)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public static void A01(zzbr zzbr) {
        zzbv zzbv = zzbr.zza;
        zzbv.zzs(zzbv.zzh);
        zzbq zzbq = zzbv.zzh;
        A00();
        zzck zzck = zzbq.zza;
        A00();
        zzck.zzj = System.currentTimeMillis();
    }
}
