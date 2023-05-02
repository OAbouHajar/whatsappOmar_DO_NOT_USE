package X;

import android.content.Context;

/* renamed from: X.2HD  reason: invalid class name */
public class AnonymousClass2HD extends AnonymousClass2HA {
    public final /* synthetic */ AnonymousClass1TV A00;
    public final /* synthetic */ C18310wU A01;
    public final /* synthetic */ C228919r A02;
    public final /* synthetic */ AnonymousClass2HC A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HD(Context context, AnonymousClass1TV r2, C18340wX r3, C18310wU r4, C228919r r5, AnonymousClass2HC r6, C14880pu r7, String str) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A04 = str;
        this.A03 = r6;
    }

    public void A03(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A01.A0I;
        StringBuilder sb = new StringBuilder("get-methods: on-request-error=");
        sb.append(r4);
        r2.A05(sb.toString());
        C1222969a ACC = this.A02.ACC();
        if (ACC != null) {
            ACC.AKK(r4, 12);
        }
        AnonymousClass1TV r0 = this.A00;
        if (r0 != null) {
            r0.AWC(r4);
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A01.A0I;
        StringBuilder sb = new StringBuilder("get-methods: on-response-error=");
        sb.append(r4);
        r2.A05(sb.toString());
        C1222969a ACC = this.A02.ACC();
        if (ACC != null) {
            ACC.AKK(r4, 12);
        }
        AnonymousClass1TV r0 = this.A00;
        if (r0 != null) {
            r0.AWI(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0172, code lost:
        if (r2 > 1) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C28371Vv r21) {
        /*
            r20 = this;
            r18 = r20
            r0 = r18
            X.0wU r4 = r0.A01
            X.1Vo r1 = r4.A0I
            java.lang.String r0 = "get-methods: on-response-success"
            r3 = 0
            r1.A03(r3, r0)
            r0 = r18
            X.19r r0 = r0.A02
            r17 = r0
            X.69a r1 = r17.ACC()
            r6 = 0
            if (r1 == 0) goto L_0x0020
            r0 = 12
            r1.AKK(r3, r0)
        L_0x0020:
            java.lang.String r1 = "account"
            r19 = r21
            r0 = r19
            X.1Vv r9 = r0.A0J(r1)
            java.lang.String r0 = "instance-id"
            java.lang.String r5 = r9.A0N(r0, r3)
            if (r5 == 0) goto L_0x007f
            r0 = r18
            java.lang.String r0 = r0.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "wa-support-phone-number"
            java.lang.String r1 = r9.A0N(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004e
            X.0wT r0 = r4.A0D
            r0.A0K(r1)
        L_0x004e:
            r0 = r18
            X.1TV r6 = r0.A00
            if (r6 == 0) goto L_0x007e
            X.3w0 r5 = new X.3w0
            r5.<init>()
            X.0wS r0 = r4.A0G
            r0.A06()
            X.1xv r4 = r0.A00
            X.AnonymousClass00B.A06(r4)
            X.1WD r3 = new X.1WD
            r3.<init>()
            X.0sq r2 = r4.A03
            r1 = 43
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            r1 = 15
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r0.<init>(r6, r1, r5)
            r3.A00(r0)
        L_0x007e:
            return
        L_0x007f:
            X.1HB r0 = r4.A0M
            java.util.ArrayList r1 = r0.A04(r9)
            X.AnonymousClass160.A04(r1)
            X.0w8 r0 = r4.A0F
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00a9
            if (r1 == 0) goto L_0x012d
            java.util.Iterator r2 = r1.iterator()
        L_0x0096:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r0 = r2.next()
            X.1cl r0 = (X.C30671cl) r0
            int r1 = r0.A04()
            r0 = 5
            if (r1 != r0) goto L_0x0096
        L_0x00a9:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            X.1Vv[] r0 = r9.A03
            if (r0 == 0) goto L_0x0136
            int r12 = r0.length
            if (r12 <= 0) goto L_0x0136
            r11 = 0
        L_0x00b6:
            X.1Vv r7 = r9.A0I(r11)
            X.AnonymousClass00B.A06(r7)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "alias"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0128
            r14 = 0
            r10 = r3
            r16 = r3
            r13 = r3
            r2 = 0
        L_0x00cd:
            X.1lL[] r1 = r7.A0Q()
            int r0 = r1.length
            if (r2 >= r0) goto L_0x010f
            r0 = r1[r2]
            java.lang.String r15 = r0.A02
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "alias_value"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00e6
            r14 = r1
        L_0x00e3:
            int r2 = r2 + 1
            goto L_0x00cd
        L_0x00e6:
            java.lang.String r0 = "alias_id"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00f1
            r16 = r1
            goto L_0x00e3
        L_0x00f1:
            java.lang.String r0 = "alias_type"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0100
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r1.toLowerCase(r0)
            goto L_0x00e3
        L_0x0100:
            java.lang.String r0 = "alias_status"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00e3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r13 = r1.toLowerCase(r0)
            goto L_0x00e3
        L_0x010f:
            X.2gP r7 = new X.2gP
            r7.<init>()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiAlias"
            X.1lh r2 = new X.1lh
            r2.<init>(r7, r1, r14, r0)
            X.2gR r1 = new X.2gR
            r0 = r16
            r1.<init>(r2, r10, r0, r13)
            r8.add(r1)
        L_0x0128:
            int r11 = r11 + 1
            if (r11 >= r12) goto L_0x0136
            goto L_0x00b6
        L_0x012d:
            X.0wS r0 = r4.A0G
            X.17O r0 = r0.A0C
            r0.A06()
            goto L_0x00a9
        L_0x0136:
            X.19f r7 = r17.AEO()
            if (r7 == 0) goto L_0x0175
            monitor-enter(r7)
            int r1 = r8.size()     // Catch:{ all -> 0x01a3 }
            r0 = 3
            if (r1 > r0) goto L_0x0174
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x01a3 }
            if (r0 != 0) goto L_0x0194
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x01a3 }
            r2 = 0
        L_0x014f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x01a3 }
            X.2gR r0 = (X.C53872gR) r0     // Catch:{ all -> 0x01a3 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.C18450wi.A0R(r1, r0)     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x014f
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x014f
            java.lang.String r1 = "Count overflow has happened."
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch:{ all -> 0x01a3 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a3 }
            throw r0     // Catch:{ all -> 0x01a3 }
        L_0x0171:
            r0 = 1
            if (r2 <= r0) goto L_0x0194
        L_0x0174:
            monitor-exit(r7)
        L_0x0175:
            r0 = r18
            X.1TV r0 = r0.A00
            if (r0 == 0) goto L_0x0180
            X.4y1 r6 = new X.4y1
            r6.<init>(r0)
        L_0x0180:
            r1 = 0
            r0 = r19
            r4.A06(r6, r0, r1)
            X.1TT r1 = r4.A0J
            r0 = r18
            X.2HC r0 = r0.A03
            if (r5 != 0) goto L_0x0190
            java.lang.String r5 = ""
        L_0x0190:
            r1.A00(r0, r5)
            return
        L_0x0194:
            boolean r0 = r7.A02(r8)     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x0174
            java.util.Set r0 = r7.A01     // Catch:{ all -> 0x01a3 }
            r0.clear()     // Catch:{ all -> 0x01a3 }
            r0.addAll(r8)     // Catch:{ all -> 0x01a3 }
            goto L_0x0174
        L_0x01a3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2HD.A05(X.1Vv):void");
    }
}
