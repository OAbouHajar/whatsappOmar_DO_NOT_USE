package X;

import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;

/* renamed from: X.0yF  reason: invalid class name and case insensitive filesystem */
public class C19320yF implements C18950xW {
    public C45932Br A00;
    public C45952Bt A01;
    public boolean A02;
    public boolean A03;
    public final C16600tK A04;
    public final C16440t3 A05;
    public final C16320sq A06;

    public C19320yF(C16600tK r1, C16440t3 r2, C16320sq r3) {
        this.A05 = r2;
        this.A06 = r3;
        this.A04 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r13 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00(boolean r13) {
        /*
            r12 = this;
            r5 = r12
            monitor-enter(r5)
            r0 = 1
            r12.A02 = r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r12.A03     // Catch:{ all -> 0x0048 }
            r12.A03 = r13     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003c
            if (r13 != 0) goto L_0x0046
            X.2Br r0 = r12.A00     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            X.2Bt r0 = r12.A01     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            long r3 = r0.A00     // Catch:{ all -> 0x0048 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.0t3 r0 = r12.A05     // Catch:{ all -> 0x0048 }
            long r1 = r0.A00()     // Catch:{ all -> 0x0048 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            X.2Br r7 = r12.A00     // Catch:{ all -> 0x0048 }
            X.2Bt r0 = r12.A01     // Catch:{ all -> 0x0048 }
            X.1Vw r8 = r0.A01     // Catch:{ all -> 0x0048 }
            boolean r10 = r0.A03     // Catch:{ all -> 0x0048 }
            boolean r11 = r0.A02     // Catch:{ all -> 0x0048 }
            X.0pj r0 = r7.A00     // Catch:{ all -> 0x0048 }
            X.0sq r0 = r0.A0T     // Catch:{ all -> 0x0048 }
            r9 = 3
            com.facebook.redex.RunnableRunnableShape0S0220000_I0 r6 = new com.facebook.redex.RunnableRunnableShape0S0220000_I0     // Catch:{ all -> 0x0048 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0048 }
            r0.Acl(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x003e
        L_0x003c:
            if (r13 != 0) goto L_0x0046
        L_0x003e:
            r0 = 0
            r12.A01 = r0     // Catch:{ all -> 0x0044 }
            r12.A00 = r0     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r5)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19320yF.A00(boolean):void");
    }

    public void ARy() {
        boolean z2;
        synchronized (this) {
            this.A02 = false;
            z2 = this.A03;
        }
        if (z2) {
            this.A06.Ad4(new RunnableRunnableShape11S0100000_I0_10((Object) this, 43), "PeerPresenceManager/onHandlerConnected", 10000);
        }
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }
}
