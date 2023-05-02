package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2x2  reason: invalid class name and case insensitive filesystem */
public class C59312x2 extends AnonymousClass4X3 {
    public final Context A00;
    public final C83484Gv A01;
    public final C19080xj A02;
    public final C210712r A03;
    public final AnonymousClass01V A04;
    public final C15860rz A05;
    public final C26531Od A06;
    public final C20350zu A07;
    public final AnonymousClass1SB A08;

    public C59312x2(Context context, C83484Gv r2, C19080xj r3, C210712r r4, AnonymousClass01V r5, C15860rz r6, C26531Od r7, C20350zu r8, AnonymousClass1SB r9) {
        super(context);
        this.A00 = context;
        this.A03 = r4;
        this.A08 = r9;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
    }

    public void A01() {
        A06();
        A05();
    }

    public void A02(Intent intent) {
        PowerManager.WakeLock wakeLock;
        try {
            C19080xj r7 = this.A02;
            r7.A00(0, true);
            Log.i(AnonymousClass000.A0g("DailyCronAction/dailyCron intent=", intent));
            PowerManager A0I = this.A04.A0I();
            if (A0I == null) {
                Log.w("DailyCronAction/dailyCron pm=null");
                wakeLock = null;
            } else {
                wakeLock = C43421zy.A00(A0I, "DailyCronAction#dailyCron", 1);
                wakeLock.setReferenceCounted(false);
                wakeLock.acquire(600000);
            }
            try {
                A06();
                if (A07()) {
                    Log.i("DailyCronAction/dailyCron; too frequent, skipping...");
                } else {
                    AnonymousClass1U7 A002 = this.A07.A00((AnonymousClass00F) null, "daily-cron");
                    try {
                        if (Log.rotate()) {
                            Log.compress();
                        }
                        AnonymousClass02N.A04(Log.logFile, ".gz", 3, true);
                        C15860rz r8 = this.A05;
                        if (r8.A1n("phoneid_last_sync_timestamp", 604800000) || System.currentTimeMillis() < r8.A0J("phoneid_last_sync_timestamp")) {
                            Context context = this.A00;
                            AnonymousClass1SB r12 = this.A08;
                            AnonymousClass00B.A06(context);
                            Context applicationContext = context.getApplicationContext();
                            AnonymousClass00B.A06(r12);
                            List<PackageInfo> installedPackages = applicationContext.getPackageManager().getInstalledPackages(0);
                            ArrayList A0u = AnonymousClass000.A0u();
                            String packageName = applicationContext.getPackageName();
                            for (PackageInfo next : installedPackages) {
                                if (!next.packageName.equals(packageName)) {
                                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(next.packageName, 64);
                                    if (C46772Ge.A03(packageInfo)) {
                                        A0u.add(packageInfo.packageName);
                                    }
                                }
                            }
                            A0u.size();
                            Iterator it = A0u.iterator();
                            while (it.hasNext()) {
                                String A0m = AnonymousClass000.A0m(it);
                                Intent A09 = C13680ns.A09();
                                A09.setAction("com.facebook.GET_PHONE_ID");
                                A09.setPackage(A0m);
                                PendingIntent A003 = C42341xd.A00(applicationContext, 0, C13680ns.A09(), 134217728);
                                Bundle A0D = C13690nt.A0D();
                                A0D.putParcelable("auth", A003);
                                applicationContext.sendOrderedBroadcast(A09, (String) null, new AnonymousClass3KZ(r12), (Handler) null, 1, (String) null, A0D);
                            }
                            r8.A0x("phoneid_last_sync_timestamp");
                        }
                        C26531Od r1 = this.A06;
                        C16900tq r0 = r1.A00;
                        r0.A04();
                        boolean z2 = r0.A01;
                        if (!z2) {
                            Log.i("DailyCronExecutor/executeDailyCron: messageStore not ready, skipping crons that need it.");
                        }
                        for (C23541Cj r02 : (Set) r1.A01.get()) {
                            r02.APJ();
                            if (z2) {
                                r02.APK();
                            }
                        }
                        A002.A00();
                        C13680ns.A0x(r8.A0K(), "last_daily_cron", System.currentTimeMillis());
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e(AnonymousClass000.A0h("com.whatsapp", AnonymousClass000.A0r("could not find package; packagename=")), e2);
                    } catch (Throwable th) {
                        A002.A00();
                        throw th;
                    }
                }
                r7.A00(0, false);
            } finally {
                A05();
                if (wakeLock != null) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            this.A02.A00(0, false);
            throw th2;
        }
    }

    public boolean A04(Intent intent) {
        String action = intent.getAction();
        return "com.obwhatsapp.action.DAILY_CRON".equals(action) || "com.obwhatsapp.action.DAILY_CATCHUP_CRON".equals(action);
    }

    public final void A05() {
    }

    public final void A06() {
    }

    public final boolean A07() {
        long j2 = C13680ns.A0B(this.A05).getLong("last_daily_cron", 0);
        Calendar instance = Calendar.getInstance();
        boolean A1U = C13690nt.A1U(instance);
        instance.set(11, A1U ? 1 : 0);
        long timeInMillis = instance.getTimeInMillis();
        long j3 = 86400000 + timeInMillis;
        if (j2 >= timeInMillis && j2 < j3) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 21600000) {
            return A1U;
        }
        return true;
    }
}
