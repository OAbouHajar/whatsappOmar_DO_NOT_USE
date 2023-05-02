package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.15H  reason: invalid class name */
public final class AnonymousClass15H {
    public static final long A07 = TimeUnit.DAYS.toMillis(1);
    public final C16440t3 A00;
    public final C216314v A01;
    public final AnonymousClass170 A02;
    public final C17580vJ A03;
    public final C221916z A04;
    public final Map A05;
    public final Set A06;

    public AnonymousClass15H(C16440t3 r3, C216314v r4, AnonymousClass170 r5, C17580vJ r6, C221916z r7) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r6, 3);
        C18450wi.A0H(r7, 5);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
        this.A06 = linkedHashSet;
        this.A05 = linkedHashMap;
    }

    public final long A00(AnonymousClass1ZX r7) {
        long A012 = this.A01.A01(r7);
        Map map = this.A05;
        Long valueOf = Long.valueOf(A012);
        if (map.containsKey(valueOf)) {
            C41231vS r0 = (C41231vS) map.get(valueOf);
            if (r0 == null) {
                return 0;
            }
            return r0.A00;
        }
        long A002 = this.A02.A00(A012);
        A02(A012, A002);
        return A002;
    }

    public synchronized Boolean A01(AnonymousClass1ZX r6) {
        Boolean bool;
        C18450wi.A0H(r6, 0);
        long A012 = this.A01.A01(r6);
        Map map = this.A05;
        Long valueOf = Long.valueOf(A012);
        if (map.containsKey(valueOf)) {
            C41231vS r0 = (C41231vS) map.get(valueOf);
            if (r0 != null) {
                bool = r0.A01;
            }
        } else if (A012 != -1) {
            bool = this.A02.A01(A012);
            A09(bool, A012);
        }
        bool = null;
        return bool;
    }

    public final void A02(long j2, long j3) {
        Boolean bool;
        boolean z2;
        Map map = this.A05;
        Long valueOf = Long.valueOf(j2);
        C41231vS r0 = (C41231vS) map.get(valueOf);
        if (r0 == null) {
            AnonymousClass170 r02 = this.A02;
            bool = r02.A01(j2);
            z2 = r02.A02(j2);
        } else {
            bool = r0.A01;
            z2 = r0.A02;
        }
        map.put(valueOf, new C41231vS(bool, j3, z2));
    }

    public final void A03(long j2, boolean z2) {
        Boolean bool;
        long j3;
        Map map = this.A05;
        Long valueOf = Long.valueOf(j2);
        C41231vS r0 = (C41231vS) map.get(valueOf);
        if (r0 == null) {
            AnonymousClass170 r02 = this.A02;
            bool = r02.A01(j2);
            j3 = r02.A00(j2);
        } else {
            bool = r0.A01;
            j3 = r0.A00;
        }
        map.put(valueOf, new C41231vS(bool, j3, z2));
    }

    public synchronized void A04(AnonymousClass1ZX r4) {
        C18450wi.A0H(r4, 0);
        if (A01(r4) == null) {
            boolean z2 = false;
            if (this.A03.A01(r4) == null) {
                z2 = true;
            }
            A07(r4, this.A01.A01(r4), z2);
            if (z2) {
                this.A04.A00(r4, 1, 1, true);
            }
        }
    }

    public synchronized void A05(AnonymousClass1ZX r4) {
        C18450wi.A0H(r4, 0);
        A07(r4, this.A01.A01(r4), true);
    }

    public final void A06(AnonymousClass1ZX r5, long j2) {
        C41231vS r3 = (C41231vS) this.A05.get(Long.valueOf(j2));
        if (r3 != null) {
            for (C41241vT r1 : this.A06) {
                if (C18450wi.A0R(r5, r1.A02)) {
                    r1.A00.A09(r3.A01);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C41191vO.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass1ZX r7, long r8, boolean r10) {
        /*
            r6 = this;
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            X.170 r0 = r6.A02
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x0047 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x0047 }
            X.1cj r5 = r3.A00()     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0039 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "is_pn_shared"
            X.C38611r4.A05(r4, r0, r10)     // Catch:{ all -> 0x0039 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "lid_chat_state"
            r0 = 5
            r2.A06(r4, r1, r0)     // Catch:{ all -> 0x0039 }
            r5.A00()     // Catch:{ all -> 0x0039 }
            r5.close()     // Catch:{ all -> 0x0040 }
            r3.close()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0047 }
            goto L_0x004d
        L_0x0039:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            X.C41191vO.A00(r5, r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.1vQ r2 = new X.1vQ
            r2.<init>(r0)
        L_0x004d:
            java.lang.Throwable r1 = X.C41201vP.A00(r2)
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "LidChatStateStore/failed to set phone number shared state"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0058:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r2 instanceof X.C41211vQ
            if (r0 == 0) goto L_0x005f
            r2 = r1
        L_0x005f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x0071
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r6.A09(r0, r8)
            r6.A06(r7, r8)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15H.A07(X.1ZX, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C41191vO.A00(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C41191vO.A00(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A08(X.AnonymousClass1ZX r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            X.C18450wi.A0H(r9, r0)     // Catch:{ all -> 0x007f }
            X.14v r0 = r8.A01     // Catch:{ all -> 0x007f }
            long r1 = r0.A01(r9)     // Catch:{ all -> 0x007f }
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007d
            X.170 r0 = r8.A02     // Catch:{ all -> 0x007f }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x0056 }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x0056 }
            X.1cj r6 = r5.A00()     // Catch:{ all -> 0x004f }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0048 }
            r7.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0048 }
            r7.put(r3, r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "pnh_duplicate_lid_thread"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0048 }
            r7.put(r3, r0)     // Catch:{ all -> 0x0048 }
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "lid_chat_state"
            r0 = 5
            r4.A06(r7, r3, r0)     // Catch:{ all -> 0x0048 }
            r6.A00()     // Catch:{ all -> 0x0048 }
            r6.close()     // Catch:{ all -> 0x004f }
            r5.close()     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0056 }
            goto L_0x005c
        L_0x0048:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.C41191vO.A00(r6, r3)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C41191vO.A00(r5, r3)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.1vQ r4 = new X.1vQ     // Catch:{ all -> 0x007f }
            r4.<init>(r0)     // Catch:{ all -> 0x007f }
        L_0x005c:
            java.lang.Throwable r3 = X.C41201vP.A00(r4)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0068
            java.lang.String r0 = "{LidChatStateStore/}failed to set duplicate flag"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x007f }
        L_0x0068:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x007f }
            boolean r0 = r4 instanceof X.C41211vQ     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x006f
            r4 = r3
        L_0x006f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x007f }
            boolean r0 = r4.booleanValue()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007d
            r8.A03(r1, r10)     // Catch:{ all -> 0x007f }
            r8.A06(r9, r1)     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r8)
            return
        L_0x007f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15H.A08(X.1ZX, boolean):void");
    }

    public final void A09(Boolean bool, long j2) {
        C41231vS r3;
        Map map = this.A05;
        Long valueOf = Long.valueOf(j2);
        C41231vS r0 = (C41231vS) map.get(valueOf);
        if (r0 == null) {
            AnonymousClass170 r2 = this.A02;
            r3 = new C41231vS(bool, r2.A00(j2), r2.A02(j2));
        } else {
            r3 = new C41231vS(bool, r0.A00, r0.A02);
        }
        map.put(valueOf, r3);
    }

    public synchronized boolean A0A(AnonymousClass1ZX r6) {
        boolean z2;
        C18450wi.A0H(r6, 0);
        long A012 = this.A01.A01(r6);
        C41231vS r0 = (C41231vS) this.A05.get(Long.valueOf(A012));
        if (r0 != null) {
            z2 = r0.A02;
        } else if (A012 == -1) {
            z2 = false;
        } else {
            z2 = this.A02.A02(A012);
            A03(A012, z2);
        }
        return z2;
    }

    public synchronized boolean A0B(AnonymousClass1ZX r7) {
        boolean z2;
        C18450wi.A0H(r7, 0);
        z2 = false;
        if (A00(r7) + A07 > System.currentTimeMillis()) {
            z2 = true;
        }
        return z2;
    }
}
