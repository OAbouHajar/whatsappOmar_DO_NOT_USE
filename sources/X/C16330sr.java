package X;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0sr  reason: invalid class name and case insensitive filesystem */
public class C16330sr {
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C16300so A02;
    public final AnonymousClass01V A03;
    public final C16440t3 A04;
    public final C14710pd A05;
    public final C16490t9 A06;
    public final AnonymousClass0y3 A07;
    public final C17340uv A08;
    public final C23381Bt A09;
    public final C16400sy A0A;
    public final C16360su A0B;
    public final C23371Bs A0C;
    public final C23351Bq A0D;
    public final C103024zu A0E;
    public final C17320ut A0F;
    public final C23361Br A0G;
    public final C16370sv A0H;
    public final C19760yx A0I;
    public final C28921Zf A0J;
    public final AnonymousClass01D A0K;
    public final AnonymousClass01D A0L;
    public final AnonymousClass01D A0M;
    public final List A0N = new ArrayList();

    public C16330sr(C16300so r3, AnonymousClass01V r4, C16440t3 r5, C14710pd r6, C16490t9 r7, AnonymousClass0y3 r8, C17340uv r9, C23381Bt r10, C16400sy r11, C16360su r12, C23371Bs r13, C23351Bq r14, C17320ut r15, C23361Br r16, C16370sv r17, C19760yx r18, AnonymousClass01D r19, AnonymousClass01D r20, AnonymousClass01D r21) {
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A0B = r12;
        this.A03 = r4;
        this.A08 = r9;
        this.A0M = r19;
        this.A0D = r14;
        this.A07 = r8;
        this.A0I = r18;
        this.A0G = r16;
        this.A0H = r17;
        this.A0C = r13;
        this.A09 = r10;
        this.A0F = r15;
        this.A0L = r20;
        this.A0K = r21;
        this.A0A = r11;
        C28921Zf r0 = new C28921Zf("ExportFlowManager/duration");
        this.A0J = r0;
        r0.A01();
        C103024zu r02 = new C103024zu(this);
        this.A0E = r02;
        r15.A02(r02);
    }

    public final synchronized long A00() {
        return this.A0J.A00();
    }

    public final C75813sl A01(int i2) {
        long A012;
        C16360su r2 = this.A0B;
        String A022 = r2.A02();
        C75813sl r10 = new C75813sl();
        r10.A05 = Integer.valueOf(i2);
        r10.A09 = A022;
        r10.A03 = 1;
        if (10 == i2) {
            r10.A07 = Long.valueOf(A00() / 1000);
            C24811Hj r11 = (C24811Hj) this.A0L.get();
            Long A002 = ((C18590ww) this.A0K.get()).A00();
            C16370sv r0 = this.A0H;
            long A003 = r0.A00();
            long A013 = r0.A01();
            long A023 = ((C14730pf) this.A0M.get()).A02();
            if (A002 != null) {
                r10.A00 = Double.valueOf((double) r11.A01(A002.longValue()));
            }
            r10.A02 = Double.valueOf((double) r11.A01(A003));
            r10.A01 = Double.valueOf((double) r11.A01(A013));
            A012 = r11.A01(A023);
        } else if (8 == i2) {
            r10.A06 = Long.valueOf(((C24811Hj) this.A0L.get()).A01(((C14730pf) this.A0M.get()).A02()));
            r10.A07 = Long.valueOf(A00() / 1000);
            r10.A08 = Long.valueOf((long) this.A0E.A00);
            r2.A03();
            return r10;
        } else if (3 == i2) {
            C24811Hj r6 = (C24811Hj) this.A0L.get();
            Long A004 = ((C18590ww) this.A0K.get()).A00();
            long A024 = ((C14730pf) this.A0M.get()).A02();
            if (A004 != null) {
                r10.A00 = Double.valueOf((double) r6.A01(A004.longValue()));
            }
            A012 = r6.A01(A024);
        } else {
            r10.A07 = Long.valueOf(A00() / 1000);
            r10.A08 = Long.valueOf((long) this.A0E.A00);
            return r10;
        }
        r10.A06 = Long.valueOf(A012);
        return r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008f, code lost:
        if (r2 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab A[LOOP:2: B:51:0x00a5->B:53:0x00ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0102 A[LOOP:3: B:61:0x00fc->B:63:0x0102, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r11 = this;
            java.lang.String r1 = "ExportFlowManager/cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r0 = r11.A09()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "ExportFlowManager/cancelExport() already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r1)
            monitor-enter(r11)
            android.os.CancellationSignal r0 = r11.A00     // Catch:{ all -> 0x013b }
            r5 = 0
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.CountDownLatch r0 = r11.A01     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "ExportFlowManager/cancellationSignal or exportCompleted is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013b }
            r0 = 1
            goto L_0x0032
        L_0x0027:
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013b }
            android.os.CancellationSignal r0 = r11.A00     // Catch:{ all -> 0x013b }
            r0.cancel()     // Catch:{ all -> 0x013b }
        L_0x0031:
            r0 = 0
        L_0x0032:
            monitor-exit(r11)     // Catch:{ all -> 0x013b }
            r4 = 8
            if (r0 == 0) goto L_0x0041
            r11.A07(r4)
            r11.A06()
            r11.A05()
            return
        L_0x0041:
            r8 = 2
            r9 = 1000(0x3e8, double:4.94E-321)
            X.0ut r3 = r11.A0F     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            java.lang.Iterable r0 = r3.A01()     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
        L_0x004e:
            boolean r0 = r1.hasNext()     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            X.5T7 r0 = (X.AnonymousClass5T7) r0     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            r0.AO7()     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            goto L_0x004e
        L_0x005e:
            monitor-enter(r11)     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            java.util.concurrent.CountDownLatch r7 = r11.A01     // Catch:{ all -> 0x0080 }
            monitor-exit(r11)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x00b5
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            boolean r2 = r7.await(r0, r2)     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
            if (r2 == 0) goto L_0x0075
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007e }
            goto L_0x0091
        L_0x0075:
            r3.A04(r8)     // Catch:{ InterruptedException -> 0x007e }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007e }
            goto L_0x00b5
        L_0x007e:
            r1 = move-exception
            goto L_0x0085
        L_0x0080:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ InterruptedException -> 0x0083, all -> 0x010c }
        L_0x0083:
            r1 = move-exception
            r2 = 0
        L_0x0085:
            X.0ut r3 = r11.A0F     // Catch:{ all -> 0x00e3 }
            r3.A04(r8)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e3 }
            if (r2 == 0) goto L_0x00b5
        L_0x0091:
            r11.A05()
        L_0x0094:
            r6.A01()
            r11.A07(r4)
            r11.A06()
            java.lang.Iterable r0 = r3.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r1.next()
            X.5T7 r0 = (X.AnonymousClass5T7) r0
            r0.AO6()
            goto L_0x00a5
        L_0x00b5:
            long r0 = r6.A00()
            long r0 = r0 / r9
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r1 = r11.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.AcB(r0, r2, r5)
            goto L_0x0094
        L_0x00dd:
            X.4zu r0 = r11.A0E
            r3.A03(r0)
            return
        L_0x00e3:
            r3 = move-exception
            if (r2 == 0) goto L_0x010d
            r11.A05()
        L_0x00e9:
            r6.A01()
            r11.A07(r4)
            r11.A06()
            X.0ut r2 = r11.A0F
            java.lang.Iterable r0 = r2.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00fc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r1.next()
            X.5T7 r0 = (X.AnonymousClass5T7) r0
            r0.AO6()
            goto L_0x00fc
        L_0x010c:
            r3 = move-exception
        L_0x010d:
            long r0 = r6.A00()
            long r0 = r0 / r9
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r1 = r11.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.AcB(r0, r2, r5)
            goto L_0x00e9
        L_0x0135:
            X.4zu r0 = r11.A0E
            r2.A03(r0)
            throw r3
        L_0x013b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x013b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16330sr.A02():void");
    }

    public void A03() {
        this.A0A.A02();
        A02();
        this.A07.A03(true);
        Log.i("ExportFlowManager/cancelExportFlowAndClearData/complete");
        AnonymousClass01D r2 = this.A0B.A02;
        ((SharedPreferences) r2.get()).edit().remove("/export/start_time").apply();
        ((SharedPreferences) r2.get()).edit().remove("/export/provider_closed/timestamp").apply();
        C19760yx r3 = this.A0I;
        if (r3.A0P.A00.getInt("registration_state", 1) == 11) {
            r3.A08();
        }
        Log.i("ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/success");
    }

    public void A04() {
        boolean A0E2 = this.A05.A0E(C16620tM.A02, 843);
        C23381Bt r0 = this.A09;
        PackageManager packageManager = r0.A01;
        ComponentName componentName = r0.A00;
        boolean z2 = true;
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            z2 = false;
        }
        if (A0E2 != z2) {
            int i2 = 0;
            if (A0E2) {
                i2 = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i2, 1);
        }
    }

    public void A05() {
        Log.i("ExportFlowManager/reset()");
        ((SharedPreferences) this.A0B.A02.get()).edit().remove("/export/enc/active/owner").remove("/export/enc/active/version").remove("/export/enc/active/account_hash").remove("/export/enc/active/server_salt").remove("/export/enc/active/last_fetch_time").remove("/export/enc/active/seed").apply();
        this.A0H.A04();
        this.A0D.A01();
    }

    public final synchronized void A06() {
        this.A0J.A01();
    }

    public final void A07(int i2) {
        if (8 != i2 || ((SharedPreferences) this.A0B.A02.get()).getString("/export/logging/funnelId", (String) null) != null) {
            this.A06.A04(A01(i2));
        }
    }

    public boolean A08() {
        return this.A0A.A05() || ((SharedPreferences) this.A0B.A02.get()).getLong("/export/start_time", 0) > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A09() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.isCanceled()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16330sr.A09():boolean");
    }
}
