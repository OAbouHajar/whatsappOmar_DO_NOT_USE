package X;

import android.view.ViewGroup;

/* renamed from: X.3R7  reason: invalid class name */
public class AnonymousClass3R7 extends AnonymousClass01X {
    public C86974Uw A00;
    public final AnonymousClass01V A01;
    public final C16490t9 A02;
    public final C25841Li A03;
    public final C108745Pe A04;
    public final C17020u3 A05;

    public AnonymousClass3R7(AnonymousClass01V r1, C16490t9 r2, C25841Li r3, C108745Pe r4, C17020u3 r5) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = r5;
        this.A04 = r4;
    }

    public /* bridge */ /* synthetic */ void A05(C005602k r1) {
        ((C55982kl) r1).A07();
    }

    public /* bridge */ /* synthetic */ void A06(C005602k r1) {
        ((C55982kl) r1).A08();
    }

    public synchronized int A0C() {
        int i2;
        C86974Uw r0 = this.A00;
        if (r0 == null) {
            i2 = 0;
        } else {
            i2 = r0.A04.size() + (AnonymousClass000.A1V(this.A00.A00) ? 1 : 0);
        }
        return i2;
    }

    public void A0E(C86974Uw r2) {
        if (r2.equals(this.A00)) {
            A01();
        }
    }

    public synchronized void A0F(C86974Uw r2) {
        C86974Uw r0 = this.A00;
        if (r0 != null) {
            r0.A01.remove(this);
        }
        this.A00 = r2;
        if (r2 != null) {
            r2.A01.add(this);
            if (!r2.A04.isEmpty()) {
                A0E(r2);
            }
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r6.A01(r6.A00) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANf(X.C005602k r11, int r12) {
        /*
            r10 = this;
            X.32I r11 = (X.AnonymousClass32I) r11
            r9 = r10
            monitor-enter(r9)
            X.4Uw r0 = r10.A00     // Catch:{ all -> 0x0042 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0042 }
            int r0 = r0.size()     // Catch:{ all -> 0x0042 }
            if (r12 >= r0) goto L_0x0034
            X.4Uw r6 = r10.A00     // Catch:{ all -> 0x0042 }
            int r0 = r12 + 1
            double r3 = (double) r0     // Catch:{ all -> 0x0042 }
            java.util.List r5 = r6.A04     // Catch:{ all -> 0x0042 }
            int r0 = r5.size()     // Catch:{ all -> 0x0042 }
            double r1 = (double) r0     // Catch:{ all -> 0x0042 }
            r7 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r1 = r1 * r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            boolean r0 = r6.A03     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0038
            boolean r0 = r6.A02     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x0042 }
            boolean r1 = r6.A01(r0)     // Catch:{ all -> 0x0042 }
            r0 = 0
            if (r1 == 0) goto L_0x0036
        L_0x0032:
            r0 = 1
            goto L_0x0036
        L_0x0034:
            r0 = 0
            goto L_0x003e
        L_0x0036:
            r6.A03 = r0     // Catch:{ all -> 0x0042 }
        L_0x0038:
            java.lang.Object r0 = r5.get(r12)     // Catch:{ all -> 0x0042 }
            X.4jN r0 = (X.C93544jN) r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            r11.A00 = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r9)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R7.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C25841Li r4 = this.A03;
        C16490t9 r3 = this.A02;
        return new AnonymousClass32I(viewGroup, this.A01, r3, r4, this.A04, this.A05);
    }
}
