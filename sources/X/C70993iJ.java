package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3iJ  reason: invalid class name and case insensitive filesystem */
public class C70993iJ extends AnonymousClass2GJ {
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03 = true;
    public final C19670yo A04;
    public final AnonymousClass12U A05;
    public final AnonymousClass12N A06;
    public final Object A07 = C13690nt.A0Y();

    public C70993iJ(C19670yo r2, AnonymousClass12U r3, AnonymousClass12N r4) {
        this.A05 = r3;
        this.A04 = r2;
        this.A06 = r4;
    }

    public boolean A00() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A00;
        }
        return z2;
    }

    public boolean A01() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A01;
        }
        return z2;
    }

    public boolean A02() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A02;
        }
        return z2;
    }

    public boolean A03() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A03;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r3.A00 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A07
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A01     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A03     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r3.A00     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70993iJ.A04():boolean");
    }

    public boolean A05() {
        C19670yo r5 = this.A04;
        AtomicBoolean atomicBoolean = r5.A0c;
        if (atomicBoolean.get()) {
            boolean A0F = r5.A0F(this.A06.A01(), this.A05.A00());
            synchronized (this.A07) {
                this.A03 = r5.A0K.A08();
                this.A02 = r5.A09;
                this.A00 = r5.A05;
                this.A01 = r5.A0g.get();
            }
            return A0F && atomicBoolean.get();
        }
    }

    public String toString() {
        return "backup-condition";
    }
}
