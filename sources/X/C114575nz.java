package X;

import java.util.List;

/* renamed from: X.5nz  reason: invalid class name and case insensitive filesystem */
public class C114575nz extends C16690tT {
    public final AnonymousClass013 A00;
    public final AnonymousClass17F A01;
    public final C18290wS A02;
    public final C39961tL A03;
    public final C117965tq A04;
    public final C118875vO A05;
    public final C218315p A06;
    public final String A07;
    public final boolean A08 = true;
    public final boolean A09;

    public C114575nz(AnonymousClass013 r2, AnonymousClass17F r3, C18290wS r4, C39961tL r5, C117965tq r6, C118875vO r7, C218315p r8, String str, boolean z2) {
        this.A07 = str;
        this.A09 = z2;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0149 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0152 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r15) {
        /*
            r14 = this;
            boolean r1 = r14.A09
            X.1tL r4 = r14.A03
            r0 = 1
            if (r1 == 0) goto L_0x004f
            r4.A05 = r0
        L_0x0009:
            X.013 r0 = r14.A00
            X.1xi r2 = new X.1xi
            r2.<init>(r0)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A07 = r0
            r2.A05 = r4
            r0 = 100
            r2.A01 = r0
            java.lang.String r3 = r14.A07
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0028
            r2.A04(r3)
        L_0x0028:
            X.17F r1 = r14.A01
            r0 = 0
            android.util.Pair r0 = r1.A05(r0, r2, r0)
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.util.Iterator r1 = r0.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vt r0 = r0.A0L
            if (r0 == 0) goto L_0x003b
            r2.add(r0)
            goto L_0x003b
        L_0x004f:
            r4.A04 = r0
            goto L_0x0009
        L_0x0052:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x01c7
            X.0wS r0 = r14.A02
            r0.A06()
            X.16r r1 = r0.A08
            boolean r0 = r1.A0i()
            if (r0 == 0) goto L_0x0100
            android.util.Pair r6 = r1.A0H(r4)
        L_0x0067:
            boolean r5 = r1.A0i()
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r0 = 12
            java.lang.String r11 = java.lang.Integer.toString(r0)
            r10 = 0
            r4[r10] = r11
            if (r5 == 0) goto L_0x00fc
            java.lang.String r0 = "(status!=? AND interop_id IS NULL AND (metadata LIKE '%\"messageDeleted\":true%' ))"
        L_0x007b:
            android.util.Pair r7 = android.util.Pair.create(r4, r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.lang.String r9 = " )"
            boolean r8 = r1.A0i()
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r10] = r11
            if (r8 == 0) goto L_0x00f9
            java.lang.String r0 = "( status!=? AND interop_id IS NOT NULL )"
        L_0x0092:
            android.util.Pair r8 = android.util.Pair.create(r4, r0)
            java.lang.String r0 = "(( "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r0)
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = " OR "
            r4.append(r0)
            java.lang.Object r0 = r7.second
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = " ) AND "
            r4.append(r0)
            java.lang.Object r0 = r6.second
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r9 = X.AnonymousClass000.A0h(r9, r4)
            java.lang.Object r0 = r8.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.addAll(r0)
            com.whatsapp.jid.UserJid r4 = r1.A0O()
            X.14v r0 = r1.A03
            r0.A01(r4)
            r4.getRawString()
            java.lang.Object r0 = r7.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.addAll(r0)
            java.lang.Object r0 = r6.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.addAll(r0)
            java.lang.String r12 = "init_timestamp DESC"
            boolean r0 = r1.A0i()
            if (r0 == 0) goto L_0x0106
            java.lang.String[] r8 = X.C221116r.A0B
            java.lang.String r7 = "pay_transaction"
            goto L_0x010a
        L_0x00f9:
            java.lang.String r0 = "( status!=? AND key_remote_jid IS NULL )"
            goto L_0x0092
        L_0x00fc:
            java.lang.String r0 = "(status!=? AND key_remote_jid IS NOT NULL AND (metadata LIKE '%\"messageDeleted\":true%' ))"
            goto L_0x007b
        L_0x0100:
            android.util.Pair r6 = r1.A0G(r4)
            goto L_0x0067
        L_0x0106:
            java.lang.String[] r8 = X.C221116r.A0A
            java.lang.String r7 = "pay_transactions"
        L_0x010a:
            X.0tq r0 = r1.A04     // Catch:{ Exception -> 0x0153 }
            X.0tf r4 = r0.get()     // Catch:{ Exception -> 0x0153 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x014e }
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x014e }
            java.lang.Object[] r10 = r5.toArray(r0)     // Catch:{ all -> 0x014e }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x014e }
            r11 = 0
            r13 = r11
            android.database.Cursor r8 = r6.A09(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x014e }
            if (r8 == 0) goto L_0x014a
            java.lang.String r0 = "readMessagelessPayments"
            java.util.List r7 = r1.A0U(r8, r0)     // Catch:{ all -> 0x0145 }
            X.1Vo r6 = r1.A09     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "readMessagelessPayments returned: "
            r5.append(r0)     // Catch:{ all -> 0x0145 }
            int r0 = r7.size()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0)     // Catch:{ all -> 0x0145 }
            r6.A07(r0)     // Catch:{ all -> 0x0145 }
            r8.close()     // Catch:{ all -> 0x014e }
            r4.close()     // Catch:{ Exception -> 0x0153 }
            goto L_0x015f
        L_0x0145:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0149 }
        L_0x0149:
            throw r0     // Catch:{ all -> 0x014e }
        L_0x014a:
            r4.close()     // Catch:{ Exception -> 0x0153 }
            goto L_0x015b
        L_0x014e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0152 }
        L_0x0152:
            throw r0     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            r4 = move-exception
            X.1Vo r1 = r1.A09
            java.lang.String r0 = "PaymentTransactionStore/readMessagelessPayments "
            r1.A0A(r0, r4)
        L_0x015b:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
        L_0x015f:
            java.util.Iterator r6 = r7.iterator()
        L_0x0163:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r4 = r6.next()
            X.1Vt r4 = (X.AnonymousClass1Vt) r4
            X.1W2 r5 = r4.A0A
            X.AnonymousClass00B.A06(r5)
            boolean r1 = r4.A0E()
            boolean r0 = r4.A0Q
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x01b3
            java.lang.String r1 = r5.A0I()
        L_0x0181:
            X.AnonymousClass00B.A06(r1)
            X.1Vy r0 = r4.A08
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0199
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x019c
        L_0x0199:
            r2.add(r4)
        L_0x019c:
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x0163
            X.15p r1 = r14.A06
            r0 = 0
            java.lang.String r0 = r1.A0T(r4, r0)
            if (r0 == 0) goto L_0x0163
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0163
            r2.add(r4)
            goto L_0x0163
        L_0x01b3:
            java.lang.String r1 = r5.A0J()
            goto L_0x0181
        L_0x01b8:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01c7
            r1 = 2
            com.facebook.redex.IDxComparatorShape21S0000000_3_I1 r0 = new com.facebook.redex.IDxComparatorShape21S0000000_3_I1
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
        L_0x01c7:
            X.5vO r0 = r14.A05
            java.util.List r1 = r0.A02(r2)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114575nz.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r6 = (AnonymousClass01Q) obj;
        C117965tq r4 = this.A04;
        String str = this.A07;
        C39961tL r2 = this.A03;
        Object obj2 = r6.A00;
        AnonymousClass00B.A06(obj2);
        Object obj3 = r6.A01;
        AnonymousClass00B.A06(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
