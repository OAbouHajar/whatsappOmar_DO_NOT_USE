package X;

import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;

/* renamed from: X.11B  reason: invalid class name */
public class AnonymousClass11B extends C19470yU {
    public final C17140ub A00;
    public final AnonymousClass11A A01;
    public final C19150xq A02;
    public final AnonymousClass119 A03;
    public final C15890s4 A04;
    public final AnonymousClass118 A05;
    public final C16320sq A06;

    public AnonymousClass11B(C17140ub r1, AnonymousClass11A r2, C19150xq r3, AnonymousClass119 r4, C15890s4 r5, AnonymousClass118 r6, C16320sq r7) {
        this.A06 = r7;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r2 = r11.A11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C16740tZ r11, int r12) {
        /*
            r10 = this;
            X.0s4 r0 = r10.A04
            X.0s5 r1 = r0.A00
            X.0s8 r0 = X.C15910s6.A11
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0079
            X.118 r0 = r10.A05
            java.lang.Iterable r0 = r0.A00()
            java.util.Iterator r9 = r0.iterator()
        L_0x0016:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r5 = r9.next()
            X.1V3 r5 = (X.AnonymousClass1V3) r5
            boolean r0 = r5 instanceof X.C46802Gh
            if (r0 == 0) goto L_0x0016
            X.2Gh r5 = (X.C46802Gh) r5
            X.0tH r0 = r5.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0016
            X.1Vw r2 = r11.A11
            boolean r8 = r2.A02
            if (r8 != 0) goto L_0x0016
            X.0sA r1 = r5.A07     // Catch:{ SecurityException -> 0x0073 }
            java.lang.String r0 = "com.facebook.stella"
            X.0s3 r6 = r1.A02(r0)     // Catch:{ SecurityException -> 0x0073 }
            X.111 r7 = r5.A06     // Catch:{ SecurityException -> 0x0073 }
            boolean r0 = r11 instanceof X.C38831rU     // Catch:{ SecurityException -> 0x0073 }
            r4 = 0
            if (r0 == 0) goto L_0x0066
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ SecurityException -> 0x0073 }
            r3.<init>()     // Catch:{ SecurityException -> 0x0073 }
            X.0rv r2 = r2.A00     // Catch:{ SecurityException -> 0x0073 }
            r0 = r11
            X.1rU r0 = (X.C38831rU) r0     // Catch:{ SecurityException -> 0x0073 }
            java.lang.String r0 = r0.A01     // Catch:{ SecurityException -> 0x0073 }
            X.1Vw r1 = new X.1Vw     // Catch:{ SecurityException -> 0x0073 }
            r1.<init>(r2, r0, r8)     // Catch:{ SecurityException -> 0x0073 }
            X.10i r0 = r7.A00     // Catch:{ SecurityException -> 0x0073 }
            java.lang.String r1 = r0.A00(r1, r6)     // Catch:{ SecurityException -> 0x0073 }
            java.lang.String r0 = "message_id"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = "message_revoked"
            X.2Gi r4 = new X.2Gi     // Catch:{ SecurityException -> 0x0073 }
            r4.<init>(r0, r3)     // Catch:{ SecurityException -> 0x0073 }
        L_0x0066:
            r5.A01(r4)     // Catch:{ SecurityException -> 0x0073 }
            X.10k r0 = r5.A05     // Catch:{ SecurityException -> 0x0073 }
            X.2Gi r0 = r0.A00(r11, r6)     // Catch:{ SecurityException -> 0x0073 }
            r5.A01(r0)     // Catch:{ SecurityException -> 0x0073 }
            goto L_0x0016
        L_0x0073:
            java.lang.String r0 = "StellaEventHandler/cannot create event for untrusted package"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0016
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11B.A06(X.0tZ, int):void");
    }

    public void A07(C16740tZ r4, int i2) {
        if (this.A04.A00.A05(C15910s6.A11) && r4.A11.A02 && !r4.A0u && i2 == 24) {
            this.A06.Acl(new RunnableRunnableShape10S0100000_I0_9((Object) this, 9));
        }
    }

    public void ASz() {
    }

    public void AT0() {
        if (this.A04.A00.A05(C15910s6.A11)) {
            this.A05.A01();
        }
    }
}
