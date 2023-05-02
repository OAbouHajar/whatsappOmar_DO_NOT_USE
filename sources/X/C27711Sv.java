package X;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Sv  reason: invalid class name and case insensitive filesystem */
public class C27711Sv {
    public final C16040sK A00;
    public final AnonymousClass01Z A01;
    public final C14710pd A02;
    public final AnonymousClass1AO A03;
    public final AnonymousClass18C A04;
    public final AnonymousClass1A9 A05;
    public final C25791Ld A06;

    public C27711Sv(C16040sK r1, AnonymousClass01Z r2, C14710pd r3, AnonymousClass1AO r4, AnonymousClass18C r5, AnonymousClass1A9 r6, C25791Ld r7) {
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
    }

    public static final boolean A00(C43241zg r4, C47512Jh r5, Object obj) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C16730tY r1 : Collections.unmodifiableList(r4.A01)) {
            synchronized (r1) {
                C16750ta r0 = r1.A02;
                AnonymousClass00B.A06(r0);
                if (r5.A56(r0, r1, obj)) {
                    atomicBoolean.set(true);
                }
            }
        }
        return atomicBoolean.get();
    }

    public static boolean A01(C16730tY r4, boolean z2) {
        synchronized (r4) {
            C16750ta r3 = r4.A02;
            AnonymousClass00B.A06(r3);
            if (r4.A0C != 1) {
                return false;
            }
            r4.A0R();
            r3.A0Z = false;
            r3.A0P = false;
            r3.A0L = z2;
            r3.A0C = 0;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C16750ta r4, X.C31761ez r5, X.C16730tY r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.A04()
            if (r0 != 0) goto L_0x000c
            monitor-enter(r5)
            boolean r0 = r5.A0G     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0012
        L_0x000c:
            java.lang.String r0 = r5.A04()
            r6.A04 = r0
        L_0x0012:
            java.lang.String r0 = r5.A05()
            if (r0 != 0) goto L_0x001e
            monitor-enter(r5)
            boolean r0 = r5.A0H     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0024
        L_0x001e:
            java.lang.String r0 = r5.A05()
            r6.A05 = r0
        L_0x0024:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0030
            monitor-enter(r5)
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            r6.A06 = r0
        L_0x0030:
            monitor-enter(r5)
            X.1y3 r0 = r5.A02     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0050
            X.1y4 r2 = r6.A12()
            X.AnonymousClass00B.A06(r2)
            byte[] r1 = r0.A00
            int[] r0 = r0.A01
            r2.A03(r1, r0)
            X.1y4 r1 = r6.A12()
            X.0pd r0 = r3.A02
            boolean r0 = X.C40541uI.A00(r0, r6)
            r1.A05 = r0
        L_0x0050:
            if (r4 == 0) goto L_0x00c4
            monitor-enter(r5)
            byte[] r0 = r5.A0I     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x005e
            monitor-enter(r5)
            byte[] r0 = r5.A0I     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            r4.A0Q = r0
        L_0x005e:
            monitor-enter(r5)
            byte[] r0 = r5.A0K     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x006a
            monitor-enter(r5)
            byte[] r0 = r5.A0K     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            r4.A0S = r0
        L_0x006a:
            monitor-enter(r5)
            byte[] r0 = r5.A0L     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0076
            monitor-enter(r5)
            byte[] r0 = r5.A0L     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            r4.A0T = r0
        L_0x0076:
            X.1XM r0 = r5.A00()
            if (r0 == 0) goto L_0x008c
            X.1XM r0 = r5.A00()
            byte[] r0 = r0.A01
            r4.A0U = r0
            X.1XM r0 = r5.A00()
            long r0 = r0.A00
            r4.A0B = r0
        L_0x008c:
            java.lang.Integer r0 = r5.A01()
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = r5.A01()
            int r0 = r0.intValue()
            r4.A06 = r0
        L_0x009c:
            java.lang.Integer r0 = r5.A02()
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r0 = r5.A02()
            int r0 = r0.intValue()
            r4.A08 = r0
        L_0x00ac:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00b8
            monitor-enter(r5)
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            r4.A0K = r0
        L_0x00b8:
            monitor-enter(r5)
            byte[] r0 = r5.A0J     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00c4
            monitor-enter(r5)
            byte[] r0 = r5.A0J     // Catch:{ all -> 0x00c5 }
            monitor-exit(r5)
            r4.A0R = r0
        L_0x00c4:
            return
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27711Sv.A02(X.0ta, X.1ez, X.0tY):void");
    }
}
