package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.18u  reason: invalid class name and case insensitive filesystem */
public class C226618u implements C19500yX {
    public final C16440t3 A00;
    public final C225118f A01;
    public final C17420v3 A02;
    public final C226518t A03;
    public final C226118p A04;
    public final C226118p A05;
    public final C225018e A06;
    public final C226018o A07;
    public final C225318h A08;
    public final AnonymousClass1WA A09;
    public final C16320sq A0A;
    public final AnonymousClass01D A0B;
    public final ConcurrentHashMap A0C = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A0D = new ConcurrentLinkedQueue();
    public final ConcurrentNavigableMap A0E = new ConcurrentSkipListMap();
    public final CopyOnWriteArrayList A0F = new CopyOnWriteArrayList();
    public final AtomicInteger A0G = new AtomicInteger(0);

    public C226618u(C16440t3 r3, C225118f r4, C17420v3 r5, C226518t r6, C226118p r7, C225018e r8, C226018o r9, C225318h r10, C16320sq r11, AnonymousClass01D r12) {
        this.A00 = r3;
        this.A0A = r11;
        this.A06 = r8;
        this.A02 = r5;
        this.A01 = r4;
        this.A08 = r10;
        this.A07 = r9;
        this.A04 = r7;
        this.A0B = r12;
        this.A03 = r6;
        this.A05 = r7;
        this.A09 = new AnonymousClass1WA(r11, false);
    }

    public C30191bu A00(Integer num, int i2) {
        Object obj;
        if (num == null) {
            obj = this.A0C.get(Integer.valueOf(i2));
        } else {
            obj = this.A0E.get(Long.valueOf((((long) num.intValue()) & 4294967295L) | (((long) i2) << 32)));
        }
        return (C30191bu) obj;
    }

    public C30191bu A01(Integer num, int i2, long j2, short s2) {
        Object remove;
        if (num == null) {
            remove = this.A0C.remove(Integer.valueOf(i2));
        } else {
            remove = this.A0E.remove(Long.valueOf((((long) num.intValue()) & 4294967295L) | (((long) i2) << 32)));
        }
        C30191bu r1 = (C30191bu) remove;
        if (r1 != null) {
            r1.A01(j2, s2);
            this.A0G.decrementAndGet();
        }
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30191bu A02(java.lang.Integer r25, int r26, long r27, boolean r29) {
        /*
            r24 = this;
            r3 = r24
            X.18f r0 = r3.A01
            boolean r0 = r0.A03()
            r5 = 0
            if (r0 == 0) goto L_0x0026
            X.18o r2 = r3.A07
            r4 = r26
            boolean r0 = r2.AJd(r4)
            if (r0 == 0) goto L_0x0026
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0G
            r23 = r0
            int r1 = r23.get()
            r0 = 50
            if (r1 < r0) goto L_0x0027
            X.0v3 r0 = r3.A02
            r0.ALQ(r4)
        L_0x0026:
            return r5
        L_0x0027:
            X.18n r2 = (X.C225918n) r2
            X.18f r1 = r2.A01
            X.1ax r0 = r1.A01(r4)
            boolean r0 = r0.A02
            r22 = r0
            X.1ax r0 = r1.A01(r4)
            long r0 = r0.A01
            r20 = r0
            X.18p r5 = r3.A04
            X.18f r1 = r5.A01
            r1.A02()
            java.lang.Boolean r0 = r1.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0116
            r0 = 916783105(0x36a50001, float:4.9173836E-6)
            if (r4 == r0) goto L_0x0116
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            X.1ax r0 = r1.A01(r4)
            long r1 = r0.A00
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0116
            int[] r13 = X.C817649q.A00
            int r12 = r13.length
            r11 = 0
        L_0x006e:
            if (r11 >= r12) goto L_0x00ec
            r10 = r13[r11]
            r0 = 1
            int r0 = r10 - r0
            r8 = 1
            long r8 = r8 << r0
            long r15 = r1 & r8
            r8 = 0
            int r0 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00e6
            X.18o r8 = r5.A03
            X.18n r8 = (X.C225918n) r8
            X.18f r0 = r8.A01
            r0.A02()
            java.lang.Long r0 = r0.A04
            long r17 = r0.longValue()
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e6
            java.util.Random r0 = r8.A03
            long r8 = r0.nextLong()
            long r8 = r8 % r17
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00e6
        L_0x00a7:
            X.18m r15 = r5.A04
            java.util.concurrent.ConcurrentHashMap r9 = r15.A07
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r9.get(r8)
            if (r0 != 0) goto L_0x00e3
            monitor-enter(r9)
            java.lang.Object r0 = r9.get(r8)     // Catch:{ all -> 0x00e9 }
            X.1dO r0 = (X.C31051dO) r0     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x00e2
            r0 = 5
            if (r10 == r0) goto L_0x00d0
            r0 = 9
            if (r10 == r0) goto L_0x00c6
            goto L_0x00da
        L_0x00c6:
            X.0t3 r10 = r15.A02     // Catch:{ all -> 0x00e9 }
            X.18j r15 = r15.A05     // Catch:{ all -> 0x00e9 }
            X.1dQ r0 = new X.1dQ     // Catch:{ all -> 0x00e9 }
            r0.<init>(r10, r15)     // Catch:{ all -> 0x00e9 }
            goto L_0x00df
        L_0x00d0:
            X.01V r10 = r15.A01     // Catch:{ all -> 0x00e9 }
            X.18k r15 = r15.A06     // Catch:{ all -> 0x00e9 }
            X.1dP r0 = new X.1dP     // Catch:{ all -> 0x00e9 }
            r0.<init>(r10, r15)     // Catch:{ all -> 0x00e9 }
            goto L_0x00df
        L_0x00da:
            X.51W r0 = new X.51W     // Catch:{ all -> 0x00e9 }
            r0.<init>()     // Catch:{ all -> 0x00e9 }
        L_0x00df:
            r9.put(r8, r0)     // Catch:{ all -> 0x00e9 }
        L_0x00e2:
            monitor-exit(r9)     // Catch:{ all -> 0x00e9 }
        L_0x00e3:
            r14.add(r0)
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x006e
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00e9 }
            throw r0
        L_0x00ec:
            java.util.Iterator r2 = r14.iterator()
        L_0x00f0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r2.next()
            X.1dO r1 = (X.C31051dO) r1
            boolean r0 = r1.AJc()
            if (r0 == 0) goto L_0x0106
            r6.add(r1)
            goto L_0x00f0
        L_0x0106:
            r7.add(r1)
            goto L_0x00f0
        L_0x010a:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0173
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0173
        L_0x0116:
            X.1dN r2 = X.C31041dN.A02
        L_0x0118:
            X.0v3 r0 = r3.A02
            X.1bu r8 = new X.1bu
            r12 = r25
            r16 = r27
            r19 = r29
            r9 = r0
            r10 = r2
            r11 = r5
            r13 = r4
            r14 = r20
            r18 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r19)
            r23.incrementAndGet()
            r0 = 1
            r5.A01(r8, r0)
            if (r25 != 0) goto L_0x0158
            java.util.concurrent.ConcurrentHashMap r1 = r3.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r1.put(r0, r8)
        L_0x0140:
            X.1bu r4 = (X.C30191bu) r4
            if (r4 == 0) goto L_0x0157
            r2 = 4
            long r0 = java.lang.System.nanoTime()
            r4.A01(r0, r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A0D
            r0.add(r4)
            r23.decrementAndGet()
            r3.AiF()
        L_0x0157:
            return r8
        L_0x0158:
            java.util.concurrent.ConcurrentNavigableMap r2 = r3.A0E
            int r1 = r12.intValue()
            long r6 = (long) r4
            r0 = 32
            long r6 = r6 << r0
            long r4 = (long) r1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            long r4 = r4 | r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r2.put(r0, r8)
            goto L_0x0140
        L_0x0173:
            X.1bt[] r0 = X.C31041dN.A03
            java.lang.Object[] r1 = r7.toArray(r0)
            X.1bt[] r1 = (X.C30181bt[]) r1
            java.lang.Object[] r0 = r6.toArray(r0)
            X.1bt[] r0 = (X.C30181bt[]) r0
            X.1dN r2 = new X.1dN
            r2.<init>(r1, r0)
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226618u.A02(java.lang.Integer, int, long, boolean):X.1bu");
    }

    public final void A03(ConcurrentMap concurrentMap, long j2) {
        C30191bu r1;
        if (!concurrentMap.isEmpty()) {
            for (Map.Entry entry : concurrentMap.entrySet()) {
                C30191bu r6 = (C30191bu) entry.getValue();
                if (r6 != null) {
                    if (r6.A03 + TimeUnit.MILLISECONDS.toNanos((long) 300000) < j2 && (r1 = (C30191bu) concurrentMap.remove(entry.getKey())) != null) {
                        r1.A01(j2, 113);
                        this.A0D.add(r1);
                        this.A0G.decrementAndGet();
                    }
                }
            }
            AiF();
        }
    }

    public final void A04(ConcurrentMap concurrentMap, long j2) {
        C30191bu r1;
        if (!concurrentMap.isEmpty()) {
            Iterator it = new HashSet(concurrentMap.keySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C30191bu r0 = (C30191bu) concurrentMap.get(next);
                if (!(r0 == null || !r0.A0G || (r1 = (C30191bu) concurrentMap.remove(next)) == null)) {
                    r1.A01(j2, 630);
                    this.A0D.add(r1);
                    this.A0G.decrementAndGet();
                }
            }
            AiF();
        }
    }

    public void A8R(short s2, boolean z2) {
        if (this.A01.A03()) {
            long nanoTime = System.nanoTime();
            A04(this.A0E, nanoTime);
            A04(this.A0C, nanoTime);
        }
    }

    public void A8S(int i2, short s2) {
        if (this.A01.A03()) {
            long nanoTime = System.nanoTime();
            A03(this.A0C, nanoTime);
            A03(this.A0E, nanoTime);
        }
    }

    public Collection A9u() {
        HashSet hashSet = new HashSet(this.A0C.keySet());
        for (Number longValue : this.A0E.keySet()) {
            hashSet.add(Integer.valueOf((int) (longValue.longValue() >> 32)));
        }
        return hashSet;
    }

    public boolean AHX() {
        return !this.A0D.isEmpty();
    }

    public boolean AJC(int i2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            return A002.A0D.get() == -1 || A002.A0F.get() == -1;
        }
        return false;
    }

    public boolean AJD(int i2, int i3) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            return A002.A0D.get() == -1 || A002.A0F.get() == -1;
        }
        return false;
    }

    public void AKg(int i2, String str, int i3) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A00(1, str, Long.valueOf((long) i3));
        }
    }

    public void AKh(int i2, String str, long j2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A00(1, str, Long.valueOf(j2));
        }
    }

    public void AKi(int i2, String str, String str2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A00(str2.length(), str, str2);
        }
    }

    public void AKj(int i2, String str, boolean z2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A00(1, str, Boolean.valueOf(z2));
        }
    }

    public void AKn(String str, int i2, int i3, int i4) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A00(1, str, Long.valueOf((long) i4));
        }
    }

    public void AKo(String str, int i2, int i3, long j2) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A00(1, str, Long.valueOf(j2));
        }
    }

    public void AKp(String str, String str2, int i2, int i3) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A00(str2.length(), str, str2);
        }
    }

    public void AKq(String str, int i2, int i3, boolean z2) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A00(1, str, Boolean.valueOf(z2));
        }
    }

    public void AKr(String str, String[] strArr, int i2, int i3) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            int length = strArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                String str2 = strArr[i5];
                i4 = str2 == null ? i4 + 1 : i4 + str2.length();
            }
            A002.A00(i4, str, strArr);
        }
    }

    public void AKs(String str, double d2, int i2) {
        C17420v3 r1 = this.A02;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            r1.AHs(str, d2, i2);
            return;
        }
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A00(1, str, Double.valueOf(d2));
        }
    }

    public void AKt(String str, String[] strArr, int i2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            int length = strArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                String str2 = strArr[i4];
                i3 = str2 == null ? i3 + 1 : i3 + str2.length();
            }
            A002.A00(i3, "inflated_rows", strArr);
        }
    }

    public void AKu(C31031dM r6, int i2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            C226118p r3 = this.A05;
            r3.A00(A002.A01);
            r3.A05.Acl(new RunnableRunnableShape2S0300000_I0_2(r3, r6, A002, 8));
        }
    }

    public void AKx(int i2, int i3) {
        Integer valueOf = Integer.valueOf(i3);
        C30191bu r2 = (C30191bu) this.A0E.remove(Long.valueOf((((long) valueOf.intValue()) & 4294967295L) | (((long) i2) << 32)));
        this.A0G.decrementAndGet();
        if (r2 != null) {
            this.A04.A08.remove(Integer.valueOf(r2.A01));
        }
    }

    public void AKy(int i2, int i3, short s2) {
        C30191bu A012 = A01(Integer.valueOf(i3), i2, System.nanoTime(), s2);
        if (A012 != null) {
            this.A0D.add(A012);
            AiF();
        }
    }

    public void AKz(int i2, short s2) {
        C30191bu A012 = A01((Integer) null, i2, System.nanoTime(), s2);
        if (A012 != null) {
            this.A0D.add(A012);
            AiF();
        }
    }

    public void AL1(String str, int i2, int i3, short s2) {
        C30191bu A012 = A01(Integer.valueOf(i3), i2, System.nanoTime(), s2);
        if (A012 != null) {
            if (!A012.A04(str)) {
                this.A02.Aac(i2, str);
            }
            this.A0D.add(A012);
            AiF();
        }
    }

    public void AL2(String str, int i2, short s2) {
        C30191bu A012 = A01((Integer) null, 1029386189, System.nanoTime(), s2);
        if (A012 != null) {
            if (!A012.A04(str)) {
                this.A02.Aac(1029386189, str);
            }
            this.A0D.add(A012);
            AiF();
        }
    }

    public boolean AL4(int i2) {
        C225918n r3 = (C225918n) this.A07;
        C225118f r1 = r3.A01;
        if (!r1.A03()) {
            return false;
        }
        if (r1.A01(689639794).A02) {
            return r3.A00(689639794);
        }
        return true;
    }

    public void AL5(int i2, String str) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A03(str, (String) null, System.nanoTime());
        }
    }

    public void AL6(int i2, String str, String str2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A03(str, str2, System.nanoTime());
        }
    }

    public void AL9(int i2, String str, int i3) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A03(str, (String) null, System.nanoTime());
        }
    }

    public void ALA(String str, String str2, int i2, int i3) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A03(str, str2, System.nanoTime());
        }
    }

    public void ALB(String str, String str2, TimeUnit timeUnit, int i2, int i3, long j2) {
        C30191bu A002 = A00(Integer.valueOf(i3), i2);
        if (A002 != null) {
            A002.A03(str, str2, timeUnit.toNanos(j2));
        }
    }

    public void ALC(String str, TimeUnit timeUnit, int i2, long j2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A03(str, (String) null, timeUnit.toNanos(j2));
        }
    }

    public void ALD(String str, String str2, TimeUnit timeUnit, int i2, long j2) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A03(str, str2, timeUnit.toNanos(j2));
        }
    }

    public void ALE(int i2) {
        A02((Integer) null, i2, System.nanoTime(), true);
    }

    public void ALF(int i2, int i3) {
        A02(Integer.valueOf(i3), i2, System.nanoTime(), true);
    }

    public void ALG(int i2, int i3, boolean z2) {
        A02(Integer.valueOf(i3), i2, System.nanoTime(), z2);
    }

    public void ALH(int i2, String str, String str2) {
        C30191bu A022 = A02((Integer) null, i2, System.nanoTime(), true);
        if (A022 != null) {
            A022.A00(str2.length(), str, str2);
        }
    }

    public void ALI(String str, String str2, int i2, int i3, boolean z2) {
        C30191bu A022 = A02(Integer.valueOf(i3), i2, System.nanoTime(), z2);
        if (A022 != null) {
            A022.A00(str2.length(), "perf_origin", str2);
        }
    }

    public void ALJ(String str, String str2, TimeUnit timeUnit, int i2, long j2) {
        C30191bu A022 = A02((Integer) null, i2, timeUnit.toNanos(j2), true);
        if (A022 != null) {
            A022.A00(str2.length(), "perf_origin", str2);
        }
    }

    public void ALK(TimeUnit timeUnit, int i2, int i3, long j2, boolean z2) {
        A02(Integer.valueOf(i3), i2, timeUnit.toNanos(j2), true);
    }

    public Long AaJ() {
        C30191bu r0 = (C30191bu) this.A0D.peek();
        if (r0 == null) {
            return null;
        }
        long j2 = r0.A0F.get();
        if (j2 != -1) {
            return Long.valueOf(j2);
        }
        return null;
    }

    public Integer AaK() {
        C30191bu r0 = (C30191bu) this.A0D.peek();
        if (r0 != null) {
            return Integer.valueOf(r0.A01);
        }
        return null;
    }

    public String Aad() {
        String string;
        boolean z2;
        double d2;
        boolean z3;
        String str;
        C226518t r7 = this.A03;
        C30191bu r6 = (C30191bu) this.A0D.poll();
        if (r6 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                int i2 = r6.A00;
                jSONObject.put("marker_id", i2);
                ConcurrentHashMap concurrentHashMap = r6.A09;
                if (concurrentHashMap.get("subType") != null) {
                    jSONObject.put("da_type", concurrentHashMap.get("subType"));
                }
                Integer num = r6.A07;
                if (num != null) {
                    jSONObject.put("instance_id", num);
                }
                jSONObject.put("action_id", (short) r6.A0D.get());
                jSONObject.put("method", r6.A0H ? "per_user" : "random_sampling");
                jSONObject.put("sample_rate", r6.A02);
                long j2 = r6.A0F.get();
                long j3 = r6.A03;
                jSONObject.put("duration_ns", j2 - j3);
                C19070xi r9 = r7.A00.A02;
                synchronized (r9) {
                    try {
                        string = r9.A01.getString("ab_props:sys:config_key", (String) null);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                jSONObject.put("wa_ab_key2", string);
                jSONObject.put("wa_ab_expo_key", r9.A01());
                ArrayList arrayList = new ArrayList();
                for (Object next : r6.A0B.values()) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
                Collections.sort(arrayList);
                if (!arrayList.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C31101dT r12 = (C31101dT) it.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(FacebookFacade.RequestParameter.NAME, r12.A02);
                        jSONObject2.put("time_since_start_ns", r12.A00 - j3);
                        String str2 = r12.A01;
                        if (str2 != null) {
                            jSONObject2.put("data", str2);
                        }
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("points", jSONArray);
                }
                HashMap hashMap = new HashMap();
                ConcurrentHashMap concurrentHashMap2 = r6.A08;
                for (Object next2 : concurrentHashMap2.keySet()) {
                    Object obj = concurrentHashMap2.get(next2);
                    if (obj != null) {
                        hashMap.put(next2, obj);
                    }
                }
                if (!hashMap.isEmpty()) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        Class<?> cls = entry.getValue().getClass();
                        List list = (List) hashMap2.get(cls);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap2.put(cls, list);
                        }
                        list.add(entry);
                    }
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        if (key == String.class) {
                            str = "annotations";
                        } else if (key == Double.class) {
                            str = "annotations_double";
                        } else if (key == Boolean.class) {
                            str = "annotations_bool";
                        } else if (key == Long.class) {
                            str = "annotations_int";
                        } else if (key == String[].class) {
                            str = "annotations_string_array";
                        } else if (key == double[].class) {
                            str = "annotations_double_array";
                        } else if (key == boolean[].class) {
                            str = "annotations_bool_array";
                        } else if (key == long[].class) {
                            str = "annotations_int_array";
                        } else {
                            StringBuilder sb = new StringBuilder("Unknown class: ");
                            sb.append(key);
                            th = new IllegalArgumentException(sb.toString());
                            throw th;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        boolean isArray = ((Class) entry2.getKey()).isArray();
                        Iterator it2 = ((List) entry2.getValue()).iterator();
                        if (isArray) {
                            while (it2.hasNext()) {
                                Map.Entry entry3 = (Map.Entry) it2.next();
                                jSONObject3.put((String) entry3.getKey(), C226518t.A00((Class) entry2.getKey(), entry3.getValue()));
                            }
                        } else {
                            while (it2.hasNext()) {
                                Map.Entry entry4 = (Map.Entry) it2.next();
                                C226518t.A01((Class) entry2.getKey(), entry4.getValue(), (String) entry4.getKey(), jSONObject3);
                            }
                        }
                        jSONObject.put(str, jSONObject3);
                    }
                }
                HashMap hashMap3 = new HashMap();
                ConcurrentHashMap concurrentHashMap3 = r6.A0A;
                for (Pair pair : concurrentHashMap3.keySet()) {
                    Object obj2 = concurrentHashMap3.get(pair);
                    if (obj2 != null) {
                        Object obj3 = pair.first;
                        Object obj4 = pair.second;
                        Map map = (Map) hashMap3.get(obj3);
                        if (map == null) {
                            map = new HashMap();
                            hashMap3.put(obj3, map);
                        }
                        map.put(obj4, obj2);
                    }
                }
                if (!hashMap3.isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry entry5 : hashMap3.entrySet()) {
                        if (entry5.getValue() != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            for (Map.Entry entry6 : ((Map) entry5.getValue()).entrySet()) {
                                if (entry6.getValue() != null) {
                                    Class<?> cls2 = entry6.getValue().getClass();
                                    if (cls2 == Double.class) {
                                        C17420v3 r14 = r7.A01;
                                        String str3 = (String) entry6.getKey();
                                        double doubleValue = ((Number) entry6.getValue()).doubleValue();
                                        if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                                            r14.AHs(str3, doubleValue, i2);
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                        }
                                    }
                                    if (cls2 == double[].class) {
                                        C17420v3 r19 = r7.A01;
                                        String str4 = (String) entry6.getKey();
                                        double[] dArr = (double[]) entry6.getValue();
                                        int length = dArr.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= length) {
                                                z2 = true;
                                                break;
                                            }
                                            d2 = dArr[i3];
                                            if (Double.isNaN(d2)) {
                                                break;
                                            }
                                            i3++;
                                            if (Double.isInfinite(d2)) {
                                                break;
                                            }
                                        }
                                        r19.AHs(str4, d2, i2);
                                        z2 = false;
                                        if (!z2) {
                                        }
                                    }
                                    if (cls2.isArray()) {
                                        jSONObject5.put((String) entry6.getKey(), C226518t.A00(cls2, entry6.getValue()));
                                    } else {
                                        C226518t.A01(cls2, entry6.getValue(), (String) entry6.getKey(), jSONObject5);
                                    }
                                }
                            }
                            jSONObject4.put((String) entry5.getKey(), jSONObject5);
                        }
                    }
                    jSONObject.put("metadata", jSONObject4);
                }
                return jSONObject.toString();
            } catch (JSONException e2) {
                r7.A01.AK1(r6.A00, e2.getMessage());
            }
        }
        return null;
    }

    public void Aek(int i2, String str) {
        C30191bu A002 = A00((Integer) null, i2);
        if (A002 != null) {
            A002.A09.put("subType", str);
        }
    }

    public void AiF() {
        AnonymousClass1WA r1 = this.A09;
        r1.A00();
        r1.execute((Runnable) this.A0B.get());
    }
}
