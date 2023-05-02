package X;

import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0rJ  reason: invalid class name and case insensitive filesystem */
public class C15550rJ {
    public static final long A0G = TimeUnit.DAYS.toMillis(366);
    public static final Object A0H = new Object();
    public static volatile ScheduledExecutorService A0I;
    public int A00 = 0;
    public int A01;
    public long A02;
    public WorkSource A03;
    public C107825Lo A04 = C98074r3.A00;
    public AnonymousClass54P A05;
    public Future A06;
    public AtomicInteger A07 = new AtomicInteger(0);
    public boolean A08 = true;
    public final Context A09;
    public final PowerManager.WakeLock A0A;
    public final Object A0B = new Object();
    public final String A0C;
    public final Map A0D = new HashMap();
    public final Set A0E = new HashSet();
    public final ScheduledExecutorService A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r10.length() == 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        if (r10.length() != 0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        r0 = r1.concat(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        android.util.Log.e("WorkSourceUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        r0 = new java.lang.String(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15550rJ(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            r3 = 1
            java.lang.String r10 = r12.getPackageName()
            r11.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r11.A0B = r0
            r7 = 0
            r11.A00 = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r11.A0E = r0
            r4 = 1
            r11.A08 = r3
            X.4r3 r0 = X.C98074r3.A00
            r11.A04 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.A0D = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r7)
            r11.A07 = r0
            java.lang.String r0 = "WakeLock: wakeLockName must not be empty"
            X.C13710nw.A07(r13, r0)
            android.content.Context r0 = r12.getApplicationContext()
            r11.A09 = r0
            r0 = 0
            r11.A05 = r0
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = r12.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r2 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "*gcore*:"
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = r1.concat(r2)
        L_0x0058:
            r11.A0C = r0
        L_0x005a:
            java.lang.String r0 = "power"
            java.lang.Object r0 = r12.getSystemService(r0)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            if (r0 == 0) goto L_0x0138
            android.os.PowerManager$WakeLock r8 = r0.newWakeLock(r3, r13)
            r11.A0A = r8
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            if (r0 == 0) goto L_0x011b
            X.0rR r0 = X.C15560rQ.A00(r12)
            java.lang.String r2 = r12.getPackageName()
            java.lang.String r1 = "android.permission.UPDATE_DEVICE_STATS"
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r0 = r0.checkPermission(r1, r2)
            if (r0 != 0) goto L_0x011b
            if (r10 == 0) goto L_0x0092
            java.lang.String r0 = r10.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0096
        L_0x0092:
            java.lang.String r10 = r12.getPackageName()
        L_0x0096:
            java.lang.String r6 = "WorkSourceUtil"
            r5 = 0
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            if (r0 == 0) goto L_0x0102
            if (r10 == 0) goto L_0x0102
            goto L_0x00ab
        L_0x00a2:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0058
        L_0x00a8:
            r11.A0C = r13
            goto L_0x005a
        L_0x00ab:
            X.0rR r0 = X.C15560rQ.A00(r12)     // Catch:{ NameNotFoundException -> 0x00ea }
            android.content.Context r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x00ea }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ea }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r10, r7)     // Catch:{ NameNotFoundException -> 0x00ea }
            if (r0 != 0) goto L_0x00bc
            goto L_0x00f3
        L_0x00bc:
            int r9 = r0.uid
            android.os.WorkSource r5 = new android.os.WorkSource
            r5.<init>()
            java.lang.reflect.Method r3 = X.C89834d0.A01
            java.lang.String r2 = "Unable to assign blame through WorkSource"
            if (r3 == 0) goto L_0x00d5
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00e5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00e5 }
            r1[r7] = r0     // Catch:{ Exception -> 0x00e5 }
            r1[r4] = r10     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00e1
        L_0x00d5:
            java.lang.reflect.Method r3 = X.C89834d0.A00
            if (r3 == 0) goto L_0x0102
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00e5 }
            r1[r7] = r0     // Catch:{ Exception -> 0x00e5 }
        L_0x00e1:
            r3.invoke(r5, r1)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x0102
        L_0x00e5:
            r0 = move-exception
            android.util.Log.wtf(r6, r2, r0)
            goto L_0x0102
        L_0x00ea:
            java.lang.String r1 = "Could not find package: "
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0107
            goto L_0x00fb
        L_0x00f3:
            java.lang.String r1 = "Could not get applicationInfo from package: "
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0107
        L_0x00fb:
            java.lang.String r0 = r1.concat(r10)
        L_0x00ff:
            android.util.Log.e(r6, r0)
        L_0x0102:
            r11.A03 = r5
            if (r5 == 0) goto L_0x011b
            goto L_0x010d
        L_0x0107:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x00ff
        L_0x010d:
            r8.setWorkSource(r5)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0111 }
            goto L_0x011b
        L_0x0111:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "WakeLock"
            android.util.Log.wtf(r0, r1)
        L_0x011b:
            java.util.concurrent.ScheduledExecutorService r0 = A0I
            if (r0 != 0) goto L_0x0135
            java.lang.Object r2 = A0H
            monitor-enter(r2)
            java.util.concurrent.ScheduledExecutorService r0 = A0I     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x0130
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r4)     // Catch:{ all -> 0x0132 }
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r0)     // Catch:{ all -> 0x0132 }
            A0I = r0     // Catch:{ all -> 0x0132 }
        L_0x0130:
            monitor-exit(r2)     // Catch:{ all -> 0x0132 }
            goto L_0x0135
        L_0x0132:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0132 }
            throw r1
        L_0x0135:
            r11.A0F = r0
            return
        L_0x0138:
            r2 = 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = "expected a non-null reference"
            r1.append(r0, r7, r2)
            java.lang.String r0 = r1.toString()
            X.5Ak r1 = new X.5Ak
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15550rJ.<init>(android.content.Context, java.lang.String):void");
    }

    public void A00() {
        if (this.A07.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.A0C).concat(" release without a matched acquire!"));
        }
        synchronized (this.A0B) {
            if (this.A08) {
                TextUtils.isEmpty((CharSequence) null);
            }
            Map map = this.A0D;
            if (map.containsKey((Object) null)) {
                AnonymousClass4ZK r1 = (AnonymousClass4ZK) map.get((Object) null);
                if (r1 != null) {
                    int i2 = r1.A00 - 1;
                    r1.A00 = i2;
                    if (i2 == 0) {
                        map.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.A0C).concat(" counter does not exist"));
            }
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r6.A05 != null) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            java.lang.Object r3 = r6.A0B
            monitor-enter(r3)
            boolean r0 = r6.A03()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r6.A08     // Catch:{ all -> 0x00b2 }
            r4 = 0
            if (r0 == 0) goto L_0x0017
            int r0 = r6.A00     // Catch:{ all -> 0x00b2 }
            int r0 = r0 + -1
            r6.A00 = r0     // Catch:{ all -> 0x00b2 }
            if (r0 > 0) goto L_0x00b0
            goto L_0x0019
        L_0x0017:
            r6.A00 = r4     // Catch:{ all -> 0x00b2 }
        L_0x0019:
            java.util.Set r2 = r6.A0E     // Catch:{ all -> 0x00b2 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0034
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b2 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b2 }
            r2.clear()     // Catch:{ all -> 0x00b2 }
            int r0 = r1.size()     // Catch:{ all -> 0x00b2 }
            if (r0 <= 0) goto L_0x0034
            r1.get(r4)     // Catch:{ all -> 0x00b2 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x0034:
            java.util.Map r2 = r6.A0D     // Catch:{ all -> 0x00b2 }
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x00b2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x003e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b2 }
            X.4ZK r0 = (X.AnonymousClass4ZK) r0     // Catch:{ all -> 0x00b2 }
            r0.A00 = r4     // Catch:{ all -> 0x00b2 }
            goto L_0x003e
        L_0x004d:
            r2.clear()     // Catch:{ all -> 0x00b2 }
            java.util.concurrent.Future r0 = r6.A06     // Catch:{ all -> 0x00b2 }
            r5 = 0
            if (r0 == 0) goto L_0x005e
            r0.cancel(r4)     // Catch:{ all -> 0x00b2 }
            r6.A06 = r5     // Catch:{ all -> 0x00b2 }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x00b2 }
        L_0x005e:
            r6.A01 = r4     // Catch:{ all -> 0x00b2 }
            android.os.PowerManager$WakeLock r1 = r6.A0A     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.isHeld()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0098
            r1.release()     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x00aa
        L_0x006c:
            r4 = move-exception
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0090 }
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r6.A0C     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = " failed to release!"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0090 }
            android.util.Log.e(r2, r0, r4)     // Catch:{ all -> 0x0090 }
            X.54P r0 = r6.A05     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
            goto L_0x00ae
        L_0x008f:
            throw r4     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            X.54P r0 = r6.A05     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0097
            r6.A05 = r5     // Catch:{ all -> 0x00b2 }
        L_0x0097:
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x0098:
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r6.A0C     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = " should be held!"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x00b2 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00aa:
            X.54P r0 = r6.A05     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
        L_0x00ae:
            r6.A05 = r5     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r3)     // Catch:{ all -> 0x00b2 }
            return
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15550rJ.A01():void");
    }

    public void A02(long j2) {
        this.A07.incrementAndGet();
        long j3 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, A0G), 1);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.A0B) {
            if (!A03()) {
                this.A05 = AnonymousClass54P.A00;
                this.A0A.acquire();
                SystemClock.elapsedRealtime();
            }
            this.A00++;
            this.A01++;
            if (this.A08) {
                TextUtils.isEmpty((CharSequence) null);
            }
            Map map = this.A0D;
            AnonymousClass4ZK r6 = (AnonymousClass4ZK) map.get((Object) null);
            if (r6 == null) {
                r6 = new AnonymousClass4ZK((C98734st) null);
                map.put((Object) null, r6);
            }
            r6.A00++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Long.MAX_VALUE - elapsedRealtime > max) {
                j3 = elapsedRealtime + max;
            }
            if (j3 > this.A02) {
                this.A02 = j3;
                Future future = this.A06;
                if (future != null) {
                    future.cancel(false);
                }
                this.A06 = this.A0F.schedule(new RunnableRunnableShape1S0100000_I0((Object) this, 15), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean A03() {
        boolean z2;
        synchronized (this.A0B) {
            z2 = false;
            if (this.A00 > 0) {
                z2 = true;
            }
        }
        return z2;
    }
}
