package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.4Wq  reason: invalid class name and case insensitive filesystem */
public class C87404Wq {
    public final C13180lb A00;
    public final C82064Bb A01 = new C82064Bb(this);
    public final C95604mu A02;
    public final LinkedHashSet A03 = new LinkedHashSet();

    public C87404Wq(C13180lb r2, C95604mu r3) {
        this.A00 = r2;
        this.A02 = r3;
    }

    public C09110ev A00() {
        C13180lb r1;
        C85004Ms r4;
        boolean z2;
        C09110ev r0;
        do {
            synchronized (this) {
                r1 = null;
                Iterator it = this.A03.iterator();
                if (it.hasNext()) {
                    r1 = (C13180lb) it.next();
                    it.remove();
                }
            }
            if (r1 == null) {
                return null;
            }
            C95604mu r5 = this.A02;
            synchronized (r5) {
                r4 = (C85004Ms) r5.A05.A02(r1);
                z2 = true;
                boolean z3 = false;
                if (r4 != null) {
                    C85004Ms r12 = (C85004Ms) r5.A04.A02(r1);
                    if (r12.A00 == 0) {
                        z3 = true;
                    }
                    AnonymousClass0T3.A01(z3);
                    r0 = r12.A02;
                } else {
                    r0 = null;
                    z2 = false;
                }
            }
            if (z2) {
                C95604mu.A00(r4);
                continue;
            }
        } while (r0 == null);
        return r0;
    }

    public C09110ev A01(int i2) {
        C85004Ms r2;
        Object obj;
        C09110ev A012;
        C95604mu r4 = this.A02;
        C95574mr r3 = new C95574mr(this.A00, i2);
        synchronized (r4) {
            r2 = (C85004Ms) r4.A05.A02(r3);
            AnonymousClass4X4 r1 = r4.A04;
            synchronized (r1) {
                obj = r1.A02.get(r3);
            }
            C85004Ms r0 = (C85004Ms) obj;
            A012 = r0 != null ? r4.A01(r0) : null;
        }
        C95604mu.A00(r2);
        r4.A04();
        r4.A03();
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[SYNTHETIC, Splitter:B:20:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C09110ev A02(X.C09110ev r13, int r14) {
        /*
            r12 = this;
            X.4mu r3 = r12.A02
            X.0lb r0 = r12.A00
            X.4mr r6 = new X.4mr
            r6.<init>(r0, r14)
            X.4Bb r7 = r12.A01
            r3.A04()
            monitor-enter(r3)
            X.4X4 r9 = r3.A05     // Catch:{ all -> 0x0075 }
            java.lang.Object r5 = r9.A02(r6)     // Catch:{ all -> 0x0075 }
            X.4Ms r5 = (X.C85004Ms) r5     // Catch:{ all -> 0x0075 }
            X.4X4 r4 = r3.A04     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r4.A02(r6)     // Catch:{ all -> 0x0075 }
            X.4Ms r0 = (X.C85004Ms) r0     // Catch:{ all -> 0x0075 }
            r11 = 0
            if (r0 == 0) goto L_0x002e
            r3.A05(r0)     // Catch:{ all -> 0x0075 }
            X.0ev r10 = r3.A02(r0)     // Catch:{ all -> 0x0075 }
        L_0x0029:
            java.lang.Object r1 = r13.A04()     // Catch:{ all -> 0x0075 }
            goto L_0x0030
        L_0x002e:
            r10 = r11
            goto L_0x0029
        L_0x0030:
            X.5NV r0 = r3.A06     // Catch:{ all -> 0x0073 }
            int r8 = r0.AG8(r1)     // Catch:{ all -> 0x0073 }
            r2 = 1
            int r1 = r4.A00()     // Catch:{ all -> 0x0071 }
            int r0 = r9.A00()     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x0055
            int r1 = r4.A01()     // Catch:{ all -> 0x0071 }
            int r0 = r9.A01()     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            X.4Fu r0 = r3.A01     // Catch:{ all -> 0x0073 }
            int r0 = r0.A00     // Catch:{ all -> 0x0073 }
            int r0 = r0 - r8
            if (r1 > r0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x0064
            X.4Ms r0 = new X.4Ms     // Catch:{ all -> 0x0075 }
            r0.<init>(r13, r7, r6)     // Catch:{ all -> 0x0075 }
            r4.A03(r6, r0)     // Catch:{ all -> 0x0075 }
            X.0ev r11 = r3.A01(r0)     // Catch:{ all -> 0x0075 }
        L_0x0064:
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            if (r10 == 0) goto L_0x006a
            r10.close()
        L_0x006a:
            X.C95604mu.A00(r5)
            r3.A03()
            return r11
        L_0x0071:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87404Wq.A02(X.0ev, int):X.0ev");
    }

    public boolean A03(int i2) {
        boolean containsKey;
        C95604mu r3 = this.A02;
        C95574mr r2 = new C95574mr(this.A00, i2);
        synchronized (r3) {
            AnonymousClass4X4 r1 = r3.A04;
            synchronized (r1) {
                containsKey = r1.A02.containsKey(r2);
            }
        }
        return containsKey;
    }
}
