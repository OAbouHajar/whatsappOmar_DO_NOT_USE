package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0d0  reason: invalid class name and case insensitive filesystem */
public class C08080d0 implements C12580kd, C12080jo {
    public static final String A0C = C06530Wm.A01("Processor");
    public Context A00;
    public PowerManager.WakeLock A01;
    public AnonymousClass0Pz A02;
    public WorkDatabase A03;
    public AnonymousClass04d A04;
    public List A05;
    public Map A06 = AnonymousClass000.A0x();
    public Map A07 = AnonymousClass000.A0x();
    public Map A08;
    public Set A09;
    public final Object A0A;
    public final List A0B;

    public C08080d0(Context context, AnonymousClass0Pz r3, WorkDatabase workDatabase, AnonymousClass04d r5, List list) {
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = workDatabase;
        this.A05 = list;
        this.A09 = new HashSet();
        this.A0B = AnonymousClass000.A0u();
        this.A01 = null;
        this.A0A = new Object();
        this.A08 = AnonymousClass000.A0x();
    }

    public static boolean A00(C10630hR r2, String str) {
        if (r2 != null) {
            r2.A02();
            C06530Wm.A00().A02(A0C, AnonymousClass000.A0h(str, AnonymousClass000.A0r("WorkerWrapper interrupted for ")));
            return true;
        }
        C06530Wm.A00().A02(A0C, AnonymousClass000.A0h(str, AnonymousClass000.A0r("WorkerWrapper could not be found for ")));
        return false;
    }

    public final void A01() {
        synchronized (this.A0A) {
            if (!(!this.A07.isEmpty())) {
                Context context = this.A00;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(intent);
                } catch (Throwable th) {
                    C06530Wm.A00();
                    Log.e(A0C, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.A01;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.A01 = null;
                }
            }
        }
    }

    public void A02(C12580kd r3) {
        synchronized (this.A0A) {
            this.A0B.add(r3);
        }
    }

    public void A03(C12580kd r3) {
        synchronized (this.A0A) {
            this.A0B.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass0OP r14, X.AnonymousClass0NV r15) {
        /*
            r13 = this;
            X.0R5 r4 = r15.A00
            java.lang.String r3 = r4.A01
            java.util.ArrayList r12 = X.AnonymousClass000.A0u()
            r9 = r13
            androidx.work.impl.WorkDatabase r8 = r13.A03
            X.0hh r0 = new X.0hh
            r0.<init>(r13, r3, r12)
            java.lang.Object r10 = r8.A02(r0)
            X.03i r10 = (X.C007303i) r10
            r6 = 0
            if (r10 != 0) goto L_0x0036
            X.C06530Wm.A00()
            java.lang.String r1 = A0C
            java.lang.String r0 = "Didn't find WorkSpec for id "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r4)
            android.util.Log.w(r1, r0)
            X.04d r0 = r13.A04
            X.0dE r0 = (X.C08190dE) r0
            java.util.concurrent.Executor r1 = r0.A02
            X.0gL r0 = new X.0gL
            r0.<init>(r13, r4)
            r1.execute(r0)
            return r6
        L_0x0036:
            java.lang.Object r2 = r13.A0A
            monitor-enter(r2)
            boolean r0 = r13.A05(r3)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0079
            java.util.Map r0 = r13.A08     // Catch:{ all -> 0x00e5 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x00e5 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x00e5 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x00e5 }
            X.0NV r0 = (X.AnonymousClass0NV) r0     // Catch:{ all -> 0x00e5 }
            X.0R5 r0 = r0.A00     // Catch:{ all -> 0x00e5 }
            int r1 = r0.A00     // Catch:{ all -> 0x00e5 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e5 }
            if (r1 != r0) goto L_0x008f
            r3.add(r15)     // Catch:{ all -> 0x00e5 }
            X.0Wm r5 = X.C06530Wm.A00()     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = A0C     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "Work "
            r1.append(r0)     // Catch:{ all -> 0x00e5 }
            r1.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = " is already enqueued for processing"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x00e5 }
            r5.A02(r3, r0)     // Catch:{ all -> 0x00e5 }
        L_0x0077:
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x009e
        L_0x0079:
            int r1 = r10.A0I     // Catch:{ all -> 0x00e5 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e5 }
            if (r1 != r0) goto L_0x008f
            android.content.Context r6 = r13.A00     // Catch:{ all -> 0x00e5 }
            X.0Pz r7 = r13.A02     // Catch:{ all -> 0x00e5 }
            X.04d r11 = r13.A04     // Catch:{ all -> 0x00e5 }
            X.0P8 r5 = new X.0P8     // Catch:{ all -> 0x00e5 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e5 }
            java.util.List r0 = r13.A05     // Catch:{ all -> 0x00e5 }
            r5.A07 = r0     // Catch:{ all -> 0x00e5 }
            goto L_0x009f
        L_0x008f:
            X.04d r0 = r13.A04     // Catch:{ all -> 0x00e5 }
            X.0dE r0 = (X.C08190dE) r0     // Catch:{ all -> 0x00e5 }
            java.util.concurrent.Executor r1 = r0.A02     // Catch:{ all -> 0x00e5 }
            X.0gL r0 = new X.0gL     // Catch:{ all -> 0x00e5 }
            r0.<init>(r13, r4)     // Catch:{ all -> 0x00e5 }
            r1.execute(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x0077
        L_0x009e:
            return r6
        L_0x009f:
            if (r14 == 0) goto L_0x00a3
            r5.A02 = r14     // Catch:{ all -> 0x00e5 }
        L_0x00a3:
            X.0hR r6 = new X.0hR     // Catch:{ all -> 0x00e5 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e5 }
            X.1bY r5 = r6.A01()     // Catch:{ all -> 0x00e5 }
            X.0gw r1 = new X.0gw     // Catch:{ all -> 0x00e5 }
            r1.<init>(r13, r4, r5)     // Catch:{ all -> 0x00e5 }
            X.0dE r11 = (X.C08190dE) r11     // Catch:{ all -> 0x00e5 }
            java.util.concurrent.Executor r0 = r11.A02     // Catch:{ all -> 0x00e5 }
            r5.A4b(r1, r0)     // Catch:{ all -> 0x00e5 }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00e5 }
            r0.put(r3, r6)     // Catch:{ all -> 0x00e5 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x00e5 }
            r1.<init>()     // Catch:{ all -> 0x00e5 }
            r1.add(r15)     // Catch:{ all -> 0x00e5 }
            java.util.Map r0 = r13.A08     // Catch:{ all -> 0x00e5 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            X.0hq r0 = r11.A01
            r0.execute(r6)
            X.0Wm r3 = X.C06530Wm.A00()
            java.lang.String r2 = A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0p(r13)
            java.lang.String r0 = ": processing "
            java.lang.String r0 = X.AnonymousClass000.A0e(r4, r0, r1)
            r3.A02(r2, r0)
            r0 = 1
            return r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08080d0.A04(X.0OP, X.0NV):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A07.containsKey(r4) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            java.util.Map r0 = r3.A06     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0014
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x0017 }
            boolean r1 = r0.containsKey(r4)     // Catch:{ all -> 0x0017 }
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08080d0.A05(java.lang.String):boolean");
    }

    public void AQm(AnonymousClass0R5 r7, boolean z2) {
        synchronized (this.A0A) {
            Map map = this.A06;
            String str = r7.A01;
            C10630hR r0 = (C10630hR) map.get(str);
            if (r0 != null && r7.equals(AnonymousClass0MO.A00(r0.A08))) {
                map.remove(str);
            }
            C06530Wm A002 = C06530Wm.A00();
            String str2 = A0C;
            StringBuilder A0p = AnonymousClass000.A0p(this);
            A0p.append(" ");
            A0p.append(str);
            A0p.append(" executed; reschedule = ");
            A0p.append(z2);
            A002.A02(str2, A0p.toString());
            for (C12580kd AQm : this.A0B) {
                AQm.AQm(r7, z2);
            }
        }
    }
}
