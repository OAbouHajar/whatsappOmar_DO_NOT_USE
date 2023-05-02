package X;

import com.facebook.redex.RunnableRunnableShape0S0111000_I0;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0xj  reason: invalid class name and case insensitive filesystem */
public class C19080xj {
    public long A00;
    public AnonymousClass05C A01;
    public AnonymousClass04V A02;
    public AtomicInteger A03 = new AtomicInteger();
    public boolean A04 = true;
    public boolean A05 = false;
    public boolean[] A06;
    public boolean[] A07;
    public final C16300so A08;
    public final C15900s5 A09;
    public final C16440t3 A0A;
    public final C15860rz A0B;
    public final C19150xq A0C;
    public final C14710pd A0D;
    public final C16490t9 A0E;
    public final AnonymousClass11O A0F;
    public final AnonymousClass1WA A0G;
    public final C16320sq A0H;

    public C19080xj(C16300so r3, C15900s5 r4, C16440t3 r5, C15860rz r6, C19150xq r7, C14710pd r8, C16490t9 r9, AnonymousClass11O r10, C16320sq r11) {
        this.A0A = r5;
        this.A0D = r8;
        this.A08 = r3;
        this.A0H = r11;
        this.A0E = r9;
        this.A09 = r4;
        this.A0C = r7;
        this.A0F = r10;
        this.A0B = r6;
        this.A0G = new AnonymousClass1WA(r11, false);
        this.A07 = new boolean[8];
        this.A06 = new boolean[8];
    }

    public void A00(int i2, boolean z2) {
        this.A0G.execute(new RunnableRunnableShape0S0111000_I0(this, i2, 1, z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0290, code lost:
        r0 = (java.lang.Number) r7.get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "background"
            r5 = r16
            boolean r0 = r5.equals(r0)
            r14 = r0 ^ 1
            X.04V r0 = r15.A02
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x005e
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r15.A00
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            X.0pd r2 = r15.A0D
            r1 = 2640(0xa50, float:3.7E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
        L_0x002c:
            X.0rz r8 = r15.A0B
            X.01D r0 = r8.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r5 = "network_statistics_last_report_time"
            r0 = -1
            long r9 = r2.getLong(r5, r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r12 = r1 - r9
            r3 = 157680000000(0x24b675dc00, double:7.79042710362E-313)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
        L_0x0052:
            X.11O r4 = r15.A0F
            X.1Zn r3 = r4.A00
            if (r3 == 0) goto L_0x0204
            X.AnonymousClass00B.A06(r3)
            monitor-enter(r3)
            goto L_0x01f6
        L_0x005e:
            X.04V r3 = r15.A02
            boolean r2 = r3.A02
            X.02d r1 = r3.A04
            X.02f r0 = r3.A00
            boolean r0 = r1.A02(r0)
            r2 = r2 & r0
            r3.A02 = r2
            if (r2 != 0) goto L_0x0160
            r4 = 0
        L_0x0070:
            X.04W r4 = (X.AnonymousClass04W) r4
            if (r4 == 0) goto L_0x002c
            X.2Fs r3 = new X.2Fs
            r3.<init>()
            r3.A09 = r5
            java.lang.Class<X.04X> r0 = X.AnonymousClass04X.class
            X.02f r8 = r4.A03(r0)
            X.04X r8 = (X.AnonymousClass04X) r8
            long r0 = r8.realtimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A08 = r0
            long r0 = r8.uptimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A07 = r0
            java.lang.Class<X.04Y> r0 = X.AnonymousClass04Y.class
            X.02f r2 = r4.A03(r0)
            X.04Y r2 = (X.AnonymousClass04Y) r2
            double r0 = r2.systemTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.A00 = r0
            double r0 = r2.userTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.A01 = r0
            java.lang.Class<X.04Z> r0 = X.AnonymousClass04Z.class
            X.02f r4 = r4.A03(r0)
            X.04Z r4 = (X.AnonymousClass04Z) r4
            long r0 = r4.mobileBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A02 = r0
            long r0 = r4.mobileBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A03 = r0
            long r0 = r4.wifiBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            long r0 = r4.wifiBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean[] r9 = r15.A06
            r0 = 0
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = "daily_cron "
            r1.append(r0)
        L_0x00e4:
            r0 = 1
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = "db_backup "
            r1.append(r0)
        L_0x00ee:
            r0 = 2
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "gdrive_backup "
            r1.append(r0)
        L_0x00f8:
            r0 = 3
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "voice_call "
            r1.append(r0)
        L_0x0103:
            r0 = 4
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "video_call "
            r1.append(r0)
        L_0x010e:
            r0 = 5
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "db_migration "
            r1.append(r0)
        L_0x0118:
            r0 = 6
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "gdrive_backup_with_worker "
            r1.append(r0)
        L_0x0122:
            r0 = 7
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = "gdrive_old_media_enc_re_upload "
            r1.append(r0)
        L_0x012c:
            java.lang.String r0 = r1.toString()
            r3.A0A = r0
            java.util.concurrent.atomic.AtomicInteger r7 = r15.A03
            long r0 = r7.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
            X.0t9 r6 = r15.A0E
            r6.A06(r3)
            double r4 = r2.systemTimeS
            double r0 = r2.userTimeS
            double r4 = r4 + r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r0
            long r2 = r8.realtimeMs
            double r0 = (double) r2
            double r4 = r4 / r0
            r0 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r4 = r4 * r0
            X.0s5 r1 = r15.A09
            X.1aL r0 = X.C15910s6.A15
            java.lang.Class<X.0s6> r3 = X.C15910s6.class
            monitor-enter(r3)
            goto L_0x0173
        L_0x0160:
            X.02f r1 = r3.A00
            X.02f r0 = r3.A01
            X.02f r4 = r3.A03
            r1.A02(r0, r4)
            X.02f r1 = r3.A01
            X.02f r0 = r3.A00
            r3.A01 = r0
            r3.A00 = r1
            goto L_0x0070
        L_0x0173:
            android.content.SharedPreferences r2 = r1.A00     // Catch:{ all -> 0x0301 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0301 }
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = r2.getFloat(r1, r0)     // Catch:{ all -> 0x0301 }
            monitor-exit(r3)     // Catch:{ all -> 0x0301 }
            double r0 = (double) r0     // Catch:{ all -> 0x0301 }
            r3 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0190
            X.0so r2 = r15.A08
            java.lang.String r1 = java.lang.Double.toString(r4)
            java.lang.String r0 = "CriticalBatteryUsageEvent"
            r2.AcB(r0, r1, r3)
        L_0x0190:
            boolean[] r1 = r15.A07
            r0 = 8
            java.lang.System.arraycopy(r1, r3, r9, r3, r0)
            r7.set(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r8.realtimeMs
            long r8 = r2.toSeconds(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            X.0sq r0 = r15.A0H
            boolean r0 = r0 instanceof X.C23291Bk
            if (r0 == 0) goto L_0x002c
            X.1Ue r0 = X.C23291Bk.A06
            X.1Un r5 = r0.A00
            java.util.concurrent.atomic.AtomicLong r0 = r5.A03
            r3 = 0
            long r0 = r0.getAndSet(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.atomic.AtomicLong r0 = r5.A04
            long r0 = r0.getAndSet(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r1 = android.util.Pair.create(r2, r0)
            X.2Ft r5 = new X.2Ft
            r5.<init>()
            r5.A00 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r5.A04 = r0
            java.lang.Object r0 = r1.first
            java.lang.Long r0 = (java.lang.Long) r0
            r5.A02 = r0
            java.lang.Object r0 = r1.second
            java.lang.Long r0 = (java.lang.Long) r0
            r5.A03 = r0
            X.0xq r4 = r15.A0C
            long r2 = r4.A00
            r0 = 0
            r4.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A01 = r0
            r6.A06(r5)
            goto L_0x002c
        L_0x01f6:
            r3.A00()     // Catch:{ all -> 0x0224 }
            java.util.HashMap r0 = X.C46702Fq.A00     // Catch:{ all -> 0x0224 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0224 }
            r7.<init>(r0)     // Catch:{ all -> 0x0224 }
            r0.clear()     // Catch:{ all -> 0x0224 }
            goto L_0x020a
        L_0x0204:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            goto L_0x020e
        L_0x020a:
            monitor-exit(r3)
            r4.A00()
        L_0x020e:
            X.1Zn r3 = r4.A00
            if (r3 == 0) goto L_0x0227
            X.AnonymousClass00B.A06(r3)
            monitor-enter(r3)
            r3.A00()     // Catch:{ all -> 0x0224 }
            java.util.HashMap r0 = X.C46702Fq.A01     // Catch:{ all -> 0x0224 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0224 }
            r6.<init>(r0)     // Catch:{ all -> 0x0224 }
            r0.clear()     // Catch:{ all -> 0x0224 }
            goto L_0x022d
        L_0x0224:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0227:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            goto L_0x0231
        L_0x022d:
            monitor-exit(r3)
            r4.A00()
        L_0x0231:
            android.content.SharedPreferences$Editor r0 = r8.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r1)
            r0.apply()
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0300
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0300
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0254
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0300
        L_0x0254:
            X.2Fr r0 = new X.2Fr
            r0.<init>()
            X.00F r0 = r0.samplingRate
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0300
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r0 = r7.keySet()
            r1.addAll(r0)
            java.util.Set r0 = r6.keySet()
            r1.addAll(r0)
            java.util.Iterator r11 = r1.iterator()
        L_0x0278:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0300
            java.lang.Object r5 = r11.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            boolean r0 = r7.containsKey(r5)
            r9 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r8 = 0
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02fe
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r9
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x02a7:
            boolean r0 = r6.containsKey(r5)
            if (r0 == 0) goto L_0x02c4
            java.lang.Object r0 = r6.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02c4
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r9
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L_0x02c4:
            if (r4 == 0) goto L_0x02f1
            long r9 = r4.longValue()
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f1
        L_0x02d0:
            X.2Fr r2 = new X.2Fr
            r2.<init>()
            r2.A00 = r5
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r2.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A01 = r0
            r2.A02 = r4
            r2.A03 = r8
            X.0t9 r1 = r15.A0E
            X.00F r0 = r2.samplingRate
            int r0 = r0.A03
            r1.A07(r2, r0)
            goto L_0x0278
        L_0x02f1:
            if (r8 == 0) goto L_0x0278
            long r9 = r8.longValue()
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0278
            goto L_0x02d0
        L_0x02fe:
            r4 = r8
            goto L_0x02a7
        L_0x0300:
            return
        L_0x0301:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0301 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19080xj.A01(java.lang.String):void");
    }
}
