package X;

import android.content.Context;

/* renamed from: X.2HI  reason: invalid class name */
public class AnonymousClass2HI extends AnonymousClass2HA {
    public final /* synthetic */ AnonymousClass1TV A00;
    public final /* synthetic */ AnonymousClass1MA A01;
    public final /* synthetic */ AnonymousClass1W5 A02;
    public final /* synthetic */ C1222969a A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HI(Context context, AnonymousClass1TV r2, C18340wX r3, AnonymousClass1MA r4, AnonymousClass1W5 r5, C1222969a r6, C14880pu r7, boolean z2) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = z2;
        this.A00 = r2;
    }

    public void A03(AnonymousClass2HJ r1) {
        A04(r1);
    }

    public void A04(AnonymousClass2HJ r3) {
        C1222969a r1 = this.A03;
        if (r1 != null) {
            r1.AKK(r3, 11);
        }
        AnonymousClass1TV r0 = this.A00;
        if (r0 != null) {
            r0.AWI(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if ("true".equals(r1) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C28371Vv r13) {
        /*
            r12 = this;
            X.69a r2 = r12.A03
            if (r2 == 0) goto L_0x000a
            r1 = 11
            r0 = 0
            r2.AKK(r0, r1)
        L_0x000a:
            X.3w1 r4 = new X.3w1
            r4.<init>()
            X.1MA r5 = r12.A01
            X.1HB r11 = r5.A0A
            X.1W5 r10 = r12.A02
            java.lang.String r9 = "account"
            X.1Vv r8 = r13.A0J(r9)
            if (r8 == 0) goto L_0x0048
            X.1Vv[] r0 = r8.A03
            if (r0 == 0) goto L_0x0048
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0048
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r7)
            r3 = 0
        L_0x002a:
            X.1Vv r2 = r8.A0I(r3)
            X.AnonymousClass00B.A06(r2)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "transaction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            X.1Vt r0 = r11.A02(r10, r2)
            r6.add(r0)
        L_0x0043:
            int r3 = r3 + 1
            if (r3 >= r7) goto L_0x0049
            goto L_0x002a
        L_0x0048:
            r6 = 0
        L_0x0049:
            r4.A01 = r6
            X.1Vv r0 = r13.A0J(r9)
            if (r0 == 0) goto L_0x0093
            java.lang.String r7 = "after"
            X.1lq r6 = new X.1lq
            r6.<init>()
            X.1lL[] r3 = r0.A0Q()
            if (r3 == 0) goto L_0x0091
            r2 = 0
        L_0x005f:
            int r0 = r3.length
            if (r2 >= r0) goto L_0x0091
            r0 = r3[r2]
            java.lang.String r8 = r0.A02
            java.lang.String r1 = r0.A03
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x0073
            r6.A00 = r1
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0073:
            java.lang.String r0 = "last"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            r6.A01 = r0
            goto L_0x0070
        L_0x0091:
            r4.A00 = r6
        L_0x0093:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x00c4
            X.0wT r6 = r5.A06
            X.0t3 r0 = r6.A01
            long r1 = r0.A00()
            android.content.SharedPreferences r0 = r6.A01()
            android.content.SharedPreferences$Editor r3 = r0.edit()
            java.lang.String r0 = "payments_all_transactions_last_sync_time"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            r0.apply()
            X.1Vo r6 = r6.A02
            java.lang.String r3 = "updateAllTransactionsLastSyncTimeMilli to: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.A06(r0)
        L_0x00c4:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x015b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x015b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = r4.A01
            java.util.Iterator r9 = r0.iterator()
        L_0x00de:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r8 = r9.next()
            X.1Vt r8 = (X.AnonymousClass1Vt) r8
            X.0rv r6 = r8.A0C
            boolean r3 = r8.A0Q
            java.lang.String r0 = r8.A0L
            X.1Vw r1 = new X.1Vw
            r1.<init>(r6, r0, r3)
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x010a
            X.0rv r0 = r1.A00
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x010a
            X.01Q r0 = new X.01Q
            r0.<init>(r1, r8)
            r7.add(r0)
            goto L_0x00de
        L_0x010a:
            r2.add(r8)
            goto L_0x00de
        L_0x010e:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0137
            X.0wS r0 = r5.A09
            r0.A06()
            X.1xv r6 = r0.A00
            X.AnonymousClass00B.A06(r6)
            X.AnonymousClass00B.A06(r6)
            java.util.List r3 = r4.A01
            r1 = 21
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r12, r1, r2)
            X.0sq r2 = r6.A03
            X.3pj r1 = new X.3pj
            r1.<init>(r6, r0, r3)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.Ack(r1, r0)
        L_0x0137:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x015b
            java.util.Iterator r3 = r7.iterator()
        L_0x0141:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r0 = r3.next()
            X.01Q r0 = (X.AnonymousClass01Q) r0
            X.0t6 r2 = r5.A03
            java.lang.Object r1 = r0.A00
            X.1Vw r1 = (X.C28381Vw) r1
            java.lang.Object r0 = r0.A01
            X.1Vt r0 = (X.AnonymousClass1Vt) r0
            r2.A0O(r0, r1)
            goto L_0x0141
        L_0x015b:
            X.1TV r0 = r12.A00
            if (r0 == 0) goto L_0x0162
            r0.AWJ(r4)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2HI.A05(X.1Vv):void");
    }
}
