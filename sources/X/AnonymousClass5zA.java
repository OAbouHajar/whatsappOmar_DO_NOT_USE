package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5zA  reason: invalid class name */
public class AnonymousClass5zA implements C13410lz {
    public static final String[] A0G = new String[0];
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C16440t3 A04;
    public final C117585tE A05;
    public final C116375rH A06;
    public final String A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A0A = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A0B = new ConcurrentLinkedQueue();
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicLong A0E;
    public volatile String A0F;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5zA(X.C16440t3 r15, X.C117585tE r16, X.C116375rH r17, java.lang.String r18, int r19, int r20, long r21, long r23) {
        /*
            r14 = this;
            r14.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r14.A09 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r14.A08 = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r14.A0A = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r14.A0B = r0
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r2)
            r14.A0C = r1
            r3 = 0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r3)
            r14.A0E = r0
            r14.A04 = r15
            r6 = r16
            r14.A05 = r6
            r0 = r17
            r14.A06 = r0
            r5 = r18
            r14.A07 = r5
            r9 = r19
            r14.A01 = r9
            r10 = r20
            r14.A00 = r10
            r3 = r21
            r14.A03 = r3
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r2)
            r14.A0D = r0
            r11 = r23
            r14.A02 = r11
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            r13 = 1
            if (r18 == 0) goto L_0x00cd
            X.5ve r7 = r6.A06
            r7.A01()
            java.util.concurrent.ConcurrentHashMap r0 = r7.A04
            java.lang.Object r4 = r0.get(r5)
            X.5s8 r4 = (X.C116905s8) r4
            if (r4 != 0) goto L_0x0077
            r3 = 812974081(0x30750001, float:8.9130486E-10)
            r0 = -1
            X.5s8 r4 = new X.5s8
            r4.<init>(r0, r3)
            java.util.concurrent.ConcurrentHashMap r0 = r7.A04
            r0.put(r5, r4)
        L_0x0077:
            int r3 = r4.A00
        L_0x0079:
            if (r3 != r13) goto L_0x00c7
            X.0yX r7 = r6.A03
        L_0x007d:
            r7.ALK(r8, r9, r10, r11, r13)
        L_0x0080:
            if (r18 == 0) goto L_0x0089
            java.lang.String r3 = "app_id"
            X.0yX r0 = r6.A03
            r0.AKp(r3, r5, r9, r10)
        L_0x0089:
            X.0v3 r3 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.5fX r8 = new X.5fX
            r8.<init>(r3, r6, r0, r9)
            java.lang.String r7 = "ttrc_tracking_version"
            java.lang.Integer r6 = r8.A06
            if (r6 != 0) goto L_0x00b9
            X.5tE r0 = r8.A05
            int r5 = r8.A03
            X.0yX r4 = r0.A03
            r4.AKg(r5, r7, r13)
        L_0x00a3:
            java.lang.String r3 = "ttrc_back_start_on_touch_up"
            if (r6 != 0) goto L_0x00b1
            r4.AKj(r5, r3, r2)
        L_0x00aa:
            r8.A00()
            r1.set(r2)
            return
        L_0x00b1:
            int r0 = r6.intValue()
            r4.AKq(r3, r5, r0, r2)
            goto L_0x00aa
        L_0x00b9:
            X.5tE r3 = r8.A05
            int r5 = r8.A03
            int r0 = r6.intValue()
            X.0yX r4 = r3.A03
            r4.AKn(r7, r5, r0, r13)
            goto L_0x00a3
        L_0x00c7:
            r0 = 2
            if (r3 != r0) goto L_0x0080
            X.0yX r7 = r6.A02
            goto L_0x007d
        L_0x00cd:
            X.5ve r0 = r6.A06
            X.5sp r0 = r0.A00(r9)
            int r3 = r0.A00
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zA.<init>(X.0t3, X.5tE, X.5rH, java.lang.String, int, int, long, long):void");
    }

    public static void A00(AnonymousClass5zA r5) {
        ConcurrentLinkedQueue concurrentLinkedQueue = r5.A0A;
        String[] strArr = A0G;
        r5.A08("cache_and_network_queries", (String[]) concurrentLinkedQueue.toArray(strArr));
        r5.A08("network_only_queries", (String[]) r5.A0B.toArray(strArr));
        r5.A08("steps", (String[]) r5.A08.keySet().toArray(strArr));
    }

    public final void A01() {
        String obj;
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        ConcurrentHashMap concurrentHashMap = this.A09;
        Iterator A0i = C110115dX.A0i(concurrentHashMap);
        while (A0i.hasNext()) {
            C118785vF r0 = (C118785vF) A0i.next();
            if (r0 != null && C118785vF.A00(r0) == C03780Jv.QUERY_NOT_NEEDED) {
                A0u.add("bloks_query");
            }
        }
        Iterator A0j = C13690nt.A0j(this.A08);
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            if (A0z != null) {
                Object key = A0z.getKey();
                C116385rI r02 = (C116385rI) A0z.getValue();
                if (r02 != null) {
                    if (C03790Jw.values()[r02.A00.get()] == C03790Jw.REVOKED) {
                        A0u2.add(key);
                    }
                }
            }
        }
        if (!A0u.isEmpty()) {
            A08("revoked_queries", (String[]) A0u.toArray(A0G));
        }
        if (!A0u2.isEmpty()) {
            A08("revoked_steps", (String[]) A0u2.toArray(A0G));
        }
        ArrayList A0u3 = AnonymousClass000.A0u();
        ArrayList A0u4 = AnonymousClass000.A0u();
        Iterator A0i2 = C110115dX.A0i(concurrentHashMap);
        while (A0i2.hasNext()) {
            C118785vF r3 = (C118785vF) A0i2.next();
            if (r3 != null && C118785vF.A00(r3) == C03780Jv.QUERY_SUCCESSFULLY_COMPLETED) {
                if (!r3.A02 || r3.A01) {
                    A0u4.add("bloks_query");
                } else {
                    A0u3.add("bloks_query");
                }
            }
        }
        if (!A0u3.isEmpty() || !A0u4.isEmpty()) {
            if (A0u4.isEmpty()) {
                obj = "CACHE";
            } else if (A0u3.isEmpty()) {
                obj = "NETWORK";
            } else {
                Collections.sort(A0u3);
                Collections.sort(A0u4);
                StringBuilder A0o = AnonymousClass000.A0o();
                Iterator it = A0u3.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass000.A0m(it);
                    if (A0m != null) {
                        if (A0o.length() != 0) {
                            A0o.append(", ");
                        }
                        A0o.append(A0m);
                        A0o.append("_C");
                    }
                }
                Iterator it2 = A0u4.iterator();
                while (it2.hasNext()) {
                    String A0m2 = AnonymousClass000.A0m(it2);
                    if (A0m2 != null) {
                        A0o.append(", ");
                        A0o.append(A0m2);
                        A0o.append("_N");
                    }
                }
                obj = A0o.toString();
            }
            AKl("ttrc_source", obj);
        }
        ArrayList A0u5 = AnonymousClass000.A0u();
        Iterator A0i3 = C110115dX.A0i(concurrentHashMap);
        while (A0i3.hasNext()) {
            C118785vF r03 = (C118785vF) A0i3.next();
            if (r03 != null && r03.A02) {
                A0u5.add("bloks_query");
            }
        }
        if (!A0u5.isEmpty()) {
            Collections.sort(A0u5);
            StringBuilder A0o2 = AnonymousClass000.A0o();
            Iterator it3 = A0u5.iterator();
            while (it3.hasNext()) {
                String A0m3 = AnonymousClass000.A0m(it3);
                if (A0m3 != null) {
                    if (A0o2.length() != 0) {
                        A0o2.append(", ");
                    }
                    A0o2.append(A0m3);
                }
            }
            AKl("ttrc_cache_rendered", A0o2.toString());
        }
    }

    public final void A02() {
        Iterator A0i = C110115dX.A0i(this.A09);
        while (A0i.hasNext()) {
            C118785vF r0 = (C118785vF) A0i.next();
            if (r0 != null) {
                AtomicInteger atomicInteger = r0.A04;
                if (C03780Jv.values()[atomicInteger.get()] != C03780Jv.QUERY_SUCCESSFULLY_COMPLETED) {
                    if (C03780Jv.values()[atomicInteger.get()] != C03780Jv.QUERY_NOT_NEEDED) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        if (A0A()) {
            A01();
            A03();
        }
    }

    public final void A03() {
        String str = this.A0F;
        C117585tE r0 = this.A05;
        int i2 = this.A01;
        int i3 = this.A00;
        C19500yX r02 = r0.A03;
        if (str == null) {
            r02.AKy(i2, i3, 2);
        } else {
            r02.AL1(str, i2, i3, 2);
        }
        A0C(AnonymousClass0KB.SUCCESSFULLY_FINISHED);
    }

    public final void A04(long j2) {
        C03780Jv A002;
        AtomicBoolean atomicBoolean = this.A0C;
        if (!atomicBoolean.get() && A0A()) {
            AnonymousClass0KB AGd = AGd();
            int i2 = 0;
            AnonymousClass0KB[] r3 = {AnonymousClass0KB.ZERO_QUERIES_AND_ZERO_STEPS, AnonymousClass0KB.PROCESSING_QUERIES_AND_STEPS};
            while (AGd != r3[i2]) {
                i2++;
                if (i2 >= 2) {
                    return;
                }
            }
            if (!atomicBoolean.getAndSet(true)) {
                Iterator A0i = C110115dX.A0i(this.A09);
                while (A0i.hasNext()) {
                    C118785vF r0 = (C118785vF) A0i.next();
                    if (r0 != null && (A002 = C118785vF.A00(r0)) != C03780Jv.QUERY_SUCCESSFULLY_COMPLETED && A002 != C03780Jv.QUERY_NOT_NEEDED && A002 != C03780Jv.CACHE_DONE_NETWORK_PENDING) {
                        return;
                    }
                }
                A06("time_to_initial_content", TimeUnit.NANOSECONDS.toMillis(j2));
            }
        }
    }

    public final void A05(String str) {
        A07(str, 3);
        if (A09()) {
            A0C(AnonymousClass0KB.MARKER_FAILED);
        }
        StringBuilder A0r = AnonymousClass000.A0r("marker_id:");
        int i2 = this.A01;
        A0r.append(i2);
        A0r.append(",error:");
        String A0h = AnonymousClass000.A0h(str, A0r);
        StringBuilder A0q = AnonymousClass000.A0q("marker_id:");
        A0q.append(i2);
        A0q.append(",instance_key:");
        A0q.append(this.A00);
        A0q.append(",error:");
        String A0h2 = AnonymousClass000.A0h(str, A0q);
        String A0h3 = AnonymousClass000.A0h(this.A07, AnonymousClass000.A0r("TTRCTrace|"));
        C117585tE r2 = this.A05;
        StringBuilder A0q2 = AnonymousClass000.A0q(A0h3);
        C110115dX.A15(A0q2, " : ", A0h);
        r2.A00.AcD(AnonymousClass000.A0h(A0h2, A0q2));
    }

    public void A06(String str, long j2) {
        String str2 = str;
        if (str != null) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
            C117585tE r0 = this.A05;
            int i2 = this.A01;
            int i3 = this.A00;
            r0.A03.ALB(str2, (String) null, TimeUnit.NANOSECONDS, i2, i3, nanos);
        }
    }

    public void A07(String str, short s2) {
        if (!TextUtils.isEmpty(str)) {
            C117585tE r3 = this.A05;
            C111225fX r4 = new C111225fX(r3.A00, r3, Integer.valueOf(this.A00), this.A01);
            if (str != null) {
                Integer num = r4.A06;
                C117585tE r0 = r4.A05;
                if (num == null) {
                    r0.A03.AKi(r4.A03, "end_reason", str);
                } else {
                    r0.A03.AKp("end_reason", str, r4.A03, num.intValue());
                }
            }
            r4.A00();
        }
        C117585tE r02 = this.A05;
        r02.A03.AKy(this.A01, this.A00, s2);
    }

    public void A08(String str, String[] strArr) {
        if (strArr != null) {
            C117585tE r0 = this.A05;
            r0.A03.AKr(str, strArr, this.A01, this.A00);
        }
    }

    public boolean A09() {
        AnonymousClass0KB AGd = AGd();
        AnonymousClass0KB[] r2 = {AnonymousClass0KB.ZERO_QUERIES_AND_ZERO_STEPS, AnonymousClass0KB.REGISTERING_QUERIES_AND_STEPS, AnonymousClass0KB.PROCESSING_QUERIES_AND_STEPS};
        int i2 = 0;
        while (AGd != r2[i2]) {
            i2++;
            if (i2 >= 3) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0A() {
        Iterator A0i = C110115dX.A0i(this.A08);
        while (A0i.hasNext()) {
            C116385rI r0 = (C116385rI) A0i.next();
            if (r0 != null) {
                AtomicInteger atomicInteger = r0.A00;
                if (C03790Jw.values()[atomicInteger.get()] != C03790Jw.DONE) {
                    if (C03790Jw.values()[atomicInteger.get()] != C03790Jw.REVOKED) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public boolean A0B(AnonymousClass0KB r5) {
        if (AGd() == new AnonymousClass0KB[]{r5}[0] || A0C(r5)) {
            return true;
        }
        return AGd() == new AnonymousClass0KB[]{r5}[0];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r1.compareAndSet(2, r3) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r4 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r2 = r5.A06;
        r0 = r5.A03;
        r3 = r2.A00;
        r2 = java.lang.Long.valueOf(r0);
        r0 = (X.C13410lz) r3.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r0 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r1 = r0.AGd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r1 == X.AnonymousClass0KB.MARKER_CANCELLED) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r1 == X.AnonymousClass0KB.MARKER_DROPPED) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r1 == X.AnonymousClass0KB.MARKER_FAILED) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r1 != X.AnonymousClass0KB.SUCCESSFULLY_FINISHED) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        r3.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(X.AnonymousClass0KB r6) {
        /*
            r5 = this;
            int r3 = r6.ordinal()
            int[] r0 = X.C115695qA.A02
            r1 = r0[r3]
            r2 = 1
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0081;
                case 2: goto L_0x0050;
                case 3: goto L_0x0044;
                case 4: goto L_0x0031;
                case 5: goto L_0x0018;
                case 6: goto L_0x0018;
                case 7: goto L_0x0018;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "State not implemented: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0018:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A0D
            boolean r0 = r1.compareAndSet(r4, r3)
            if (r0 != 0) goto L_0x0040
            boolean r0 = r1.compareAndSet(r2, r3)
            if (r0 != 0) goto L_0x0040
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L_0x0042
            A00(r5)
            goto L_0x0040
        L_0x0031:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A0D
            boolean r0 = r1.compareAndSet(r4, r3)
            if (r0 != 0) goto L_0x0040
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L_0x0042
        L_0x0040:
            r4 = r2
            goto L_0x0056
        L_0x0042:
            r2 = 0
            goto L_0x0040
        L_0x0044:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0D
            boolean r4 = r0.compareAndSet(r2, r3)
            if (r4 == 0) goto L_0x0081
            A00(r5)
            goto L_0x0058
        L_0x0050:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0D
            boolean r4 = r0.compareAndSet(r4, r3)
        L_0x0056:
            if (r4 == 0) goto L_0x0081
        L_0x0058:
            X.5rH r2 = r5.A06
            long r0 = r5.A03
            java.util.concurrent.ConcurrentHashMap r3 = r2.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r3.get(r2)
            X.0lz r0 = (X.C13410lz) r0
            if (r0 == 0) goto L_0x0081
            X.0KB r1 = r0.AGd()
            X.0KB r0 = X.AnonymousClass0KB.MARKER_CANCELLED
            if (r1 == r0) goto L_0x007e
            X.0KB r0 = X.AnonymousClass0KB.MARKER_DROPPED
            if (r1 == r0) goto L_0x007e
            X.0KB r0 = X.AnonymousClass0KB.MARKER_FAILED
            if (r1 == r0) goto L_0x007e
            X.0KB r0 = X.AnonymousClass0KB.SUCCESSFULLY_FINISHED
            if (r1 != r0) goto L_0x0081
        L_0x007e:
            r3.remove(r2)
        L_0x0081:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zA.A0C(X.0KB):boolean");
    }

    public void A4i(String str, TimeUnit timeUnit, long j2) {
        if (A0B(AnonymousClass0KB.REGISTERING_QUERIES_AND_STEPS)) {
            if (this.A09.putIfAbsent("bloks_query", new C118785vF(this, timeUnit.toMillis(86400))) != null) {
                A05(AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("Attempted to Add Query Twice for: ")));
            }
        }
    }

    public void A4j(String str) {
        if (A0B(AnonymousClass0KB.REGISTERING_QUERIES_AND_STEPS)) {
            if (this.A08.putIfAbsent("initial_content_step", new C116385rI()) != null) {
                A05(AnonymousClass000.A0h("initial_content_step", AnonymousClass000.A0r("Attempted to Add Additional Step Twice for: ")));
            }
        }
    }

    public void A5o(String str, long j2, long j3, boolean z2) {
        if (A0B(AnonymousClass0KB.PROCESSING_QUERIES_AND_STEPS)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j3);
            C118785vF r6 = (C118785vF) this.A09.get("bloks_query");
            if (r6 != null) {
                boolean z3 = false;
                if (r6.A02(z2 ? C03780Jv.QUERY_SUCCESSFULLY_COMPLETED : C03780Jv.CACHE_DONE_NETWORK_PENDING)) {
                    r6.A02 = true;
                    if (0 > r6.A03) {
                        z3 = true;
                    }
                    r6.A00 = z3;
                    AnonymousClass5zA r5 = r6.A05;
                    r5.AKm(AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("cache_was_recent_for_")), !z3);
                    r5.AKk(AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("cache_age_ms_for_")), 0);
                    r5.A0F = AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("ttcc_for_"));
                    r5.A0E.set(nanos);
                    r5.A06(r5.A0F, TimeUnit.NANOSECONDS.toMillis(nanos));
                    A04(nanos);
                    if (z2) {
                        r6.A01();
                        A02();
                    }
                }
            }
        }
    }

    public void A8t(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (A09()) {
            A0C(AnonymousClass0KB.MARKER_FAILED);
            A01();
            A07(str, 3);
            long nanos = TimeUnit.MILLISECONDS.toNanos(millis) - this.A02;
            C117585tE r6 = this.A05;
            AnonymousClass69Q r3 = r6.A01.AJd(78315522) ? new AnonymousClass5zS(r6.A00, r6, this.A07, 78315522) : new AnonymousClass5zR();
            r3.A4r("duration", TimeUnit.NANOSECONDS.toMillis(nanos));
            r3.Ae5(3);
            if (str != null) {
                r3.A4s("message", str);
            }
            r3.AcA();
        }
    }

    public AnonymousClass0KB AGd() {
        return AnonymousClass0KB.values()[this.A0D.get()];
    }

    public void AK6(String str) {
        C03780Jv A002;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (A09()) {
            A01();
            ConcurrentHashMap concurrentHashMap = this.A09;
            if (!concurrentHashMap.isEmpty() || !this.A08.isEmpty()) {
                Iterator A0i = C110115dX.A0i(concurrentHashMap);
                while (true) {
                    if (A0i.hasNext()) {
                        C118785vF r4 = (C118785vF) A0i.next();
                        if (r4 != null && (((A002 = C118785vF.A00(r4)) != C03780Jv.CACHE_DONE_NETWORK_PENDING || r4.A00) && A002 != C03780Jv.QUERY_SUCCESSFULLY_COMPLETED && A002 != C03780Jv.QUERY_NOT_NEEDED)) {
                            break;
                        }
                    } else if (A0A()) {
                        Iterator A0i2 = C110115dX.A0i(concurrentHashMap);
                        while (A0i2.hasNext()) {
                            C118785vF r2 = (C118785vF) A0i2.next();
                            if (r2 != null && C118785vF.A00(r2) == C03780Jv.CACHE_DONE_NETWORK_PENDING) {
                                r2.A01();
                            }
                        }
                        A03();
                        return;
                    }
                }
            }
            A0C(AnonymousClass0KB.MARKER_CANCELLED);
            A07("BloksSurfaceController_onDestroyView", 4);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanos = timeUnit.toNanos(millis) - this.A02;
            if (nanos > timeUnit.toNanos(5000)) {
                String str2 = this.A07;
                if (str2 == null) {
                    str2 = Integer.toString(this.A01);
                }
                C117585tE r5 = this.A05;
                AnonymousClass69Q r3 = r5.A01.AJd(78315521) ? new AnonymousClass5zS(r5.A00, r5, str2, 78315521) : new AnonymousClass5zR();
                r3.A4r("duration", TimeUnit.NANOSECONDS.toMillis(nanos));
                r3.Ae5(5);
                r3.AcA();
            }
        }
    }

    public void AKk(String str, long j2) {
        String str2 = str;
        if (str != null) {
            C117585tE r0 = this.A05;
            r0.A03.AKo(str2, this.A01, this.A00, j2);
        }
    }

    public void AKl(String str, String str2) {
        if (str != null && str2 != null) {
            C117585tE r0 = this.A05;
            r0.A03.AKp(str, str2, this.A01, this.A00);
        }
    }

    public void AKm(String str, boolean z2) {
        if (str != null) {
            C117585tE r0 = this.A05;
            r0.A03.AKq(str, this.A01, this.A00, z2);
        }
    }

    public void AL7(String str) {
        if (str != null) {
            C117585tE r0 = this.A05;
            r0.A03.AL9(this.A01, str, this.A00);
        }
    }

    public void AL8(String str, long j2) {
        if (!"surface_core_created_at".equals("surface_core_created_at")) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
            C117585tE r0 = this.A05;
            int i2 = this.A01;
            int i3 = this.A00;
            r0.A03.ALB("surface_core_created_at", (String) null, TimeUnit.NANOSECONDS, i2, i3, nanos);
        }
    }

    public void ALi(String str, boolean z2) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (A0B(AnonymousClass0KB.PROCESSING_QUERIES_AND_STEPS)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(millis);
            C118785vF r6 = (C118785vF) this.A09.get("bloks_query");
            if (r6 != null && r6.A02(C03780Jv.QUERY_SUCCESSFULLY_COMPLETED)) {
                r6.A01 = true;
                String A0h = AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("ttnc_for_"));
                AnonymousClass5zA r4 = r6.A05;
                r4.A0F = A0h;
                r4.A0E.set(nanos);
                r4.A06(A0h, TimeUnit.NANOSECONDS.toMillis(nanos));
                r6.A01();
                A04(nanos);
                A02();
            }
        }
    }

    public void AgK(String str) {
        C116385rI r0;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (A0B(AnonymousClass0KB.PROCESSING_QUERIES_AND_STEPS) && (r0 = (C116385rI) this.A08.get("initial_content_step")) != null) {
            AtomicInteger atomicInteger = r0.A00;
            if (C03790Jw.values()[atomicInteger.get()] == C03790Jw.PENDING) {
                C03790Jw r3 = C03790Jw.DONE;
                int i2 = C115695qA.A01[1];
                if (i2 == 1) {
                    return;
                }
                if (i2 != 2 && i2 != 3) {
                    throw AnonymousClass000.A0V(AnonymousClass000.A0g("State not implemented: ", r3));
                } else if (atomicInteger.compareAndSet(0, 1)) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(millis);
                    String A0h = AnonymousClass000.A0h("initial_content_step", AnonymousClass000.A0r("step_completed_"));
                    AtomicLong atomicLong = this.A0E;
                    if (atomicLong.get() <= nanos) {
                        this.A0F = A0h;
                        atomicLong.set(nanos);
                    }
                    A06(A0h, millis);
                    A04(atomicLong.get());
                    A02();
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01);
        A0o.append("_");
        return AnonymousClass000.A0l(A0o, this.A00);
    }
}
