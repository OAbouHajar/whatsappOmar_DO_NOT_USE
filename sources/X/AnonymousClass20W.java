package X;

import com.whatsapp.util.Log;

/* renamed from: X.20W  reason: invalid class name */
public class AnonymousClass20W {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C26061Me A02;

    public AnonymousClass20W(C26061Me r1, int i2, int i3) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = i3;
    }

    public void A00() {
        C26061Me r3 = this.A02;
        int i2 = this.A00;
        boolean z2 = true;
        if (r3.A01(i2) != 1) {
            z2 = false;
        }
        AnonymousClass00B.A0G(z2);
        Log.e("CategoryManager/onManifestError/manifest was errory");
        r3.A08(2, i2);
        r3.A0B((String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if ((r3 + 3600000) <= r5.A07.A00()) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass20T r9) {
        /*
            r8 = this;
            X.1Me r5 = r8.A02
            int r6 = r8.A00
            r7 = 0
            int r3 = r8.A01
            int r1 = r5.A01(r6)
            r0 = 1
            if (r1 == r0) goto L_0x000f
            r0 = 0
        L_0x000f:
            X.AnonymousClass00B.A0G(r0)
            boolean r0 = r5 instanceof X.C26051Md
            if (r0 == 0) goto L_0x00aa
            java.lang.String r2 = "filter"
        L_0x0018:
            if (r9 != 0) goto L_0x0033
            java.lang.String r1 = "CategoryManager/onManifestReady/No info in manifest for category "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2
        L_0x002c:
            r5.A08(r1, r6)
            r5.A0B(r7)
            return
        L_0x0033:
            java.lang.String r0 = r9.A01
            boolean r0 = r2.equals(r0)
            X.AnonymousClass00B.A0G(r0)
            X.20T r2 = r5.A02()
            if (r2 == 0) goto L_0x0076
            java.lang.String r1 = r2.A02()
            java.lang.String r0 = r9.A02()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r2.A04(r6)
            java.lang.String r0 = r9.A04(r6)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0076
            boolean r0 = r5.A0C(r6)
            if (r0 == 0) goto L_0x0073
            r0 = 5
            r5.A08(r0, r6)
            java.lang.String r0 = r2.A04(r6)
            r5.A0B(r0)
            r5.A06(r6)
            return
        L_0x0073:
            r5.A05()
        L_0x0076:
            if (r3 != 0) goto L_0x009b
            monitor-enter(r5)
            android.util.SparseArray r0 = r5.A02     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00ae }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x0084
            goto L_0x0089
        L_0x0084:
            long r3 = r0.longValue()     // Catch:{ all -> 0x00ae }
            goto L_0x008b
        L_0x0089:
            r3 = 0
        L_0x008b:
            monitor-exit(r5)
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r0
            X.0t3 r0 = r5.A07
            long r1 = r0.A00()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 4
            if (r0 > 0) goto L_0x002c
        L_0x009b:
            r0 = 3
            r5.A08(r0, r6)
            X.0sq r1 = r5.A0H
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((X.C26061Me) r5, (X.AnonymousClass20T) r9, (int) r6)
            r1.Acl(r0)
            return
        L_0x00aa:
            java.lang.String r2 = "doodle_emoji"
            goto L_0x0018
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass20W.A01(X.20T):void");
    }
}
