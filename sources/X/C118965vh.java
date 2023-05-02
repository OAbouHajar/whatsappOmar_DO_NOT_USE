package X;

import android.content.res.Resources;

/* renamed from: X.5vh  reason: invalid class name and case insensitive filesystem */
public class C118965vh {
    public final Resources A00;
    public final C17030uP A01;
    public final C16440t3 A02;
    public final AnonymousClass013 A03;
    public final C216114t A04;
    public final C14710pd A05;
    public final C18090w8 A06;
    public final C18290wS A07;
    public final AnonymousClass69T A08;
    public final C218315p A09;
    public final C17110uY A0A;

    public C118965vh(Resources resources, C17030uP r2, C16440t3 r3, AnonymousClass013 r4, C216114t r5, C14710pd r6, C18090w8 r7, C18290wS r8, AnonymousClass69T r9, C218315p r10, C17110uY r11) {
        this.A02 = r3;
        this.A05 = r6;
        this.A0A = r11;
        this.A09 = r10;
        this.A03 = r4;
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A00 = resources;
        this.A08 = r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0352, code lost:
        if (r0.contains(r4) == false) goto L_0x0354;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C117735tT A00(android.content.Context r54, X.C16840tj r55) {
        /*
            r53 = this;
            r25 = r55
            r0 = r25
            X.0tZ r0 = (X.C16740tZ) r0
            r27 = r0
            X.1lc r3 = X.C110115dX.A0W(r25)
            X.1lZ r14 = r3.A05
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            r35 = r0
            X.AnonymousClass00B.A06(r35)
            r2 = r53
            X.14t r1 = r2.A04
            X.0sH r21 = r1.A01(r0)
            java.lang.String r0 = r21.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r31 = r21.A0B()
        L_0x002d:
            boolean r0 = android.text.TextUtils.isEmpty(r31)
            r12 = 1
            r41 = r0 ^ 1
            java.lang.String r0 = r14.A01
            int r18 = X.C35251lc.A00(r0)
            X.013 r0 = r2.A03
            r32 = r0
            java.lang.String r28 = r3.A03(r0)
            X.1lY r0 = r14.A06
            r30 = r0
            r0 = r27
            X.1Vt r1 = r0.A0L
            X.0w8 r0 = r2.A06
            r24 = r0
            java.lang.String r15 = r3.A08
            boolean r0 = r0.A0D(r15)
            r45 = 0
            if (r0 == 0) goto L_0x0104
            if (r1 == 0) goto L_0x0062
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0062
        L_0x0060:
            r45 = 1
        L_0x0062:
            r0 = r27
            X.1Vt r1 = r0.A0L
            boolean r0 = r2 instanceof X.C114235nP
            r19 = r0
            if (r0 == 0) goto L_0x00d3
            r40 = 1
        L_0x006e:
            X.1lY r0 = r3.A06
            X.1lv r22 = r3.A02(r0)
            X.1lY r1 = r14.A03
            if (r1 != 0) goto L_0x00aa
            r11 = 0
            r4 = 0
            r34 = 0
        L_0x007d:
            X.1lY r0 = r14.A04
            r23 = r0
            java.util.List r13 = r14.A08
            java.util.Iterator r16 = r13.iterator()
            r7 = 0
        L_0x0088:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r16.next()
            X.4jO r0 = (X.C93554jO) r0
            int r8 = r0.A00
            int r7 = r7 + r8
            X.1lY r6 = r0.A02
            if (r6 == 0) goto L_0x0088
            X.1lY r0 = r0.A01
            long r0 = r0.A01
            long r9 = r6.A01
            long r0 = r0 - r9
            long r8 = (long) r8
            long r0 = r0 * r8
            long r4 = r4 + r0
            if (r11 != 0) goto L_0x0088
            int r11 = r6.A00
            goto L_0x0088
        L_0x00aa:
            long r4 = r1.A01
            int r11 = r1.A00
            r0 = r32
            java.lang.String r34 = r3.A04(r0, r1)
            if (r34 == 0) goto L_0x007d
            boolean r0 = r32.A0T()
            r0 = r0 ^ 1
            java.lang.String r1 = "–"
            if (r0 == 0) goto L_0x00ce
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r1)
            r1 = r34
        L_0x00c6:
            r0.append(r1)
            java.lang.String r34 = r0.toString()
            goto L_0x007d
        L_0x00ce:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r34)
            goto L_0x00c6
        L_0x00d3:
            r0 = r24
            boolean r0 = r0.A0D(r15)
            r40 = 1
            if (r0 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x0100
            boolean r0 = r1.A0F()
        L_0x00e3:
            if (r0 == 0) goto L_0x0100
            goto L_0x006e
        L_0x00e6:
            java.lang.String r0 = r3.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r14.A01
            int r1 = X.C35251lc.A00(r0)
            r0 = 4
            if (r1 != r0) goto L_0x0100
        L_0x00f7:
            X.15p r1 = r2.A09
            r0 = r35
            boolean r0 = r1.A0d(r0)
            goto L_0x00e3
        L_0x0100:
            r40 = 0
            goto L_0x006e
        L_0x0104:
            java.lang.String r0 = r3.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x0060
        L_0x0116:
            java.lang.String r31 = r21.A09()
            goto L_0x002d
        L_0x011c:
            int r0 = r13.size()
            r13 = 2
            if (r0 >= r13) goto L_0x0228
            android.content.res.Resources r0 = r2.A00
            r20 = r0
            r6 = 2131889878(0x7f120ed6, float:1.9414432E38)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            boolean r7 = X.C13690nt.A1W(r0, r7)
            r1 = r20
            r1.getString(r6, r0)
        L_0x0135:
            X.1lb r0 = r14.A02
            if (r0 == 0) goto L_0x0222
            r12 = 2131889832(0x7f120ea8, float:1.9414339E38)
            java.lang.Object[] r8 = new java.lang.Object[r13]
            long r0 = r0.A00
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r9
            r6 = r32
            java.text.DateFormat r9 = X.C28891Zc.A08(r6, r7)
            java.util.Date r6 = new java.util.Date
            r6.<init>(r0)
            java.lang.String r6 = r9.format(r6)
            r8[r7] = r6
            X.0t3 r6 = r2.A02
            long r9 = r6.A02(r0)
            r0 = r32
            java.lang.String r6 = X.C47672Jx.A00(r0, r9)
            r1 = 1
            r0 = r20
            java.lang.String r29 = X.C13700nu.A0F(r0, r6, r8, r1, r12)
            r8 = 0
        L_0x0169:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x021e
            X.1lY r0 = new X.1lY
            r0.<init>(r11, r1, r4)
            r4 = r32
            java.lang.String r33 = r3.A04(r4, r0)
        L_0x0179:
            r0 = r27
            X.1Vt r6 = r0.A0L
            java.util.HashMap r17 = X.AnonymousClass000.A0x()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r0 = r2.A01(r6)
            r4 = 2131889847(0x7f120eb7, float:1.941437E38)
            if (r0 == 0) goto L_0x0191
            r4 = 2131890378(0x7f1210ca, float:1.9415446E38)
        L_0x0191:
            r0 = r54
            java.lang.String r4 = r0.getString(r4)
            X.5sn r5 = new X.5sn
            r5.<init>(r1, r4, r1, r7)
            r4 = r17
            r4.put(r8, r5)
            r7 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r5 = r2.A01(r6)
            r4 = 2131889820(0x7f120e9c, float:1.9414314E38)
            if (r5 == 0) goto L_0x01b2
            r4 = 2131890378(0x7f1210ca, float:1.9415446E38)
        L_0x01b2:
            java.lang.String r4 = r0.getString(r4)
            X.5sn r5 = new X.5sn
            r5.<init>(r1, r4, r1, r7)
            r4 = r17
            r4.put(r8, r5)
            r7 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r5 = r2.A01(r6)
            r4 = 2131889818(0x7f120e9a, float:1.941431E38)
            if (r5 == 0) goto L_0x01d1
            r4 = 2131890378(0x7f1210ca, float:1.9415446E38)
        L_0x01d1:
            java.lang.String r4 = r0.getString(r4)
            X.5sn r5 = new X.5sn
            r5.<init>(r1, r4, r1, r7)
            r4 = r17
            r4.put(r8, r5)
            java.util.List r4 = r3.A0C
            r16 = r4
            if (r4 == 0) goto L_0x023a
            java.util.Iterator r9 = r16.iterator()
        L_0x01e9:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x023a
            java.lang.Object r4 = r9.next()
            X.1la r4 = (X.C35231la) r4
            java.lang.String r7 = r4.A01
            java.lang.String r5 = "payment_instruction"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01e9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            boolean r7 = r2.A01(r6)
            r5 = 2131889848(0x7f120eb8, float:1.9414371E38)
            if (r7 == 0) goto L_0x020f
            r5 = 2131890378(0x7f1210ca, float:1.9415446E38)
        L_0x020f:
            java.lang.String r7 = r0.getString(r5)
            X.5sn r5 = new X.5sn
            r5.<init>(r4, r7, r1, r13)
            r4 = r17
            r4.put(r8, r5)
            goto L_0x01e9
        L_0x021e:
            r33 = r1
            goto L_0x0179
        L_0x0222:
            r8 = 0
            r29 = 0
            goto L_0x0169
        L_0x0228:
            r7 = 0
            android.content.res.Resources r1 = r2.A00
            r20 = r1
            r8 = 2131755259(0x7f1000fb, float:1.9141392E38)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            X.AnonymousClass000.A1M(r6, r0, r7)
            r1.getQuantityString(r8, r0, r6)
            goto L_0x0135
        L_0x023a:
            X.0uP r4 = r2.A01
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r35)
            boolean r6 = r4.A02(r1)
            r1 = r27
            X.1Vt r4 = r1.A0L
            if (r19 == 0) goto L_0x0448
            r1 = r2
            X.5nP r1 = (X.C114235nP) r1
            boolean r5 = r17.isEmpty()
            r12 = 0
            if (r5 == 0) goto L_0x0417
            java.lang.String r4 = "BrazilPaymentCheckoutOrderDetailsViewConfigurationFactory"
            java.lang.String r1 = "shouldShowPaymentButton, missing default Whatsapp payment option in the map"
            X.C110105dW.A1O(r4, r1)
        L_0x025b:
            r1 = r24
            boolean r1 = r1.A0D(r15)
            if (r1 == 0) goto L_0x0412
            java.util.Map r1 = r24.A03()
            java.lang.Object r7 = r1.get(r15)
            X.AnonymousClass00B.A06(r7)
            X.0uY r11 = r2.A0A
            r5 = 2131893590(0x7f121d56, float:1.942196E38)
            r8 = 1
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r6 = 0
            r1 = r20
            java.lang.String r10 = X.C13700nu.A0F(r1, r7, r4, r6, r5)
            r7 = 3
            java.lang.String[] r5 = new java.lang.String[r7]
            java.lang.String r1 = "p2m-lite-wa-terms"
            r5[r6] = r1
            java.lang.String r1 = "p2m-lite-wa-policies"
            r5[r8] = r1
            java.lang.String r1 = "p2m-lite-meta-privacy-policy"
            r5[r13] = r1
            java.lang.String[] r4 = new java.lang.String[r7]
            X.0pd r1 = r2.A05
            r9 = 2669(0xa6d, float:3.74E-42)
            java.lang.String r9 = r1.A05(r9)
            r4[r6] = r9
            r9 = 2670(0xa6e, float:3.741E-42)
            java.lang.String r9 = r1.A05(r9)
            r4[r8] = r9
            r9 = 2671(0xa6f, float:3.743E-42)
            java.lang.String r1 = r1.A05(r9)
            r4[r13] = r1
            java.lang.Runnable[] r1 = new java.lang.Runnable[r7]
            X.63P r7 = new X.63P
            r7.<init>()
            r1[r6] = r7
            X.63N r6 = new X.63N
            r6.<init>()
            r1[r8] = r6
            X.63O r6 = new X.63O
            r6.<init>()
            r1[r13] = r6
            android.text.SpannableString r26 = r11.A05(r10, r1, r5, r4)
        L_0x02c3:
            if (r19 == 0) goto L_0x0397
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r1 = r17
            java.lang.Object r4 = r1.get(r4)
            X.5sn r4 = (X.C117315sn) r4
            java.lang.Integer r5 = X.C13680ns.A0X()
            java.lang.Object r1 = r1.get(r5)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            if (r1 == 0) goto L_0x0332
            if (r4 == 0) goto L_0x0332
            r1 = 2131889880(0x7f120ed8, float:1.9414436E38)
            java.lang.String r49 = r0.getString(r1)
            r1 = 2131886764(0x7f1202ac, float:1.9408116E38)
            java.lang.String r51 = r0.getString(r1)
            r1 = 2131231059(0x7f080153, float:1.8078188E38)
            java.lang.Integer r47 = java.lang.Integer.valueOf(r1)
            java.lang.String r48 = "WhatsappPay"
            java.lang.String r50 = ""
            X.5ya r1 = new X.5ya
            r52 = 1
            r46 = r1
            r46.<init>(r47, r48, r49, r50, r51, r52)
            r7.add(r1)
            r1 = 2131889881(0x7f120ed9, float:1.9414438E38)
            java.lang.String r49 = r0.getString(r1)
            X.1la r1 = r4.A01
            X.AnonymousClass00B.A06(r1)
            java.lang.String r4 = r1.A00
            r1 = 2131887394(0x7f120522, float:1.9409394E38)
            java.lang.String r51 = r0.getString(r1)
            r52 = 0
            r0 = 2131232219(0x7f0805db, float:1.8080541E38)
            java.lang.Integer r47 = java.lang.Integer.valueOf(r0)
            java.lang.String r48 = "CustomPaymentInstructions"
            X.5ya r0 = new X.5ya
            r46 = r0
            r50 = r4
            r46.<init>(r47, r48, r49, r50, r51, r52)
            r7.add(r0)
        L_0x0332:
            r0 = r27
            long r9 = r0.A13
            r0 = r35
            java.lang.String r4 = r0.user
            if (r19 != 0) goto L_0x0354
            X.0pd r1 = r2.A05
            r0 = 1763(0x6e3, float:2.47E-42)
            java.lang.String r0 = r1.A05(r0)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0354
            if (r0 == 0) goto L_0x0354
            boolean r0 = r0.contains(r4)
            r43 = 1
            if (r0 != 0) goto L_0x0356
        L_0x0354:
            r43 = 0
        L_0x0356:
            r44 = r12 ^ 1
            r6 = 2131889850(0x7f120eba, float:1.9414375E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r4 = r3.A09
            r1 = 0
            r0 = r20
            java.lang.String r27 = X.C13700nu.A0F(r0, r4, r5, r1, r6)
            X.69T r5 = r2.A08
            java.lang.String r4 = r3.A03
            r1 = r30
            r0 = r32
            r3.A04(r0, r1)
            java.lang.String r2 = r14.A00
            X.1lY r1 = r14.A05
            r3.A04(r0, r1)
            r1 = r23
            r3.A04(r0, r1)
            X.5tT r19 = new X.5tT
            r20 = r0
            r23 = r35
            r24 = r5
            r30 = r4
            r32 = r2
            r35 = r17
            r36 = r7
            r37 = r18
            r38 = r9
            r42 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45)
            return r19
        L_0x0397:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            if (r16 == 0) goto L_0x0332
            java.lang.String r1 = r14.A01
            int r1 = X.C35251lc.A00(r1)
            if (r1 != r8) goto L_0x0332
            r1 = 2131889872(0x7f120ed0, float:1.941442E38)
            java.lang.String r49 = r0.getString(r1)
            r1 = 2131889871(0x7f120ecf, float:1.9414418E38)
            java.lang.String r50 = r0.getString(r1)
            r1 = 2131886764(0x7f1202ac, float:1.9408116E38)
            java.lang.String r51 = r0.getString(r1)
            r47 = 0
            r52 = 0
            java.lang.String r48 = "WhatsappPay"
            X.5ya r0 = new X.5ya
            r46 = r0
            r46.<init>(r47, r48, r49, r50, r51, r52)
            r7.add(r0)
            X.0pd r1 = r2.A05
            r0 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r1.A05(r0)
            java.util.Map r5 = X.C115255pS.A00(r0)
            java.util.Iterator r9 = r16.iterator()
        L_0x03da:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0332
            java.lang.Object r1 = r9.next()
            X.1la r1 = (X.C35231la) r1
            java.lang.String r0 = r1.A01
            java.lang.Object r0 = r5.get(r0)
            X.5ya r0 = (X.C119505ya) r0
            if (r0 == 0) goto L_0x03da
            java.lang.String r4 = r1.A02
            java.util.List r1 = r0.A08
            if (r1 == 0) goto L_0x03da
            java.util.Iterator r6 = r1.iterator()
        L_0x03fa:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x03da
            java.lang.String r1 = X.AnonymousClass000.A0m(r6)
            java.util.regex.Matcher r1 = X.C110115dX.A0k(r4, r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x03fa
            r7.add(r0)
            goto L_0x03da
        L_0x0412:
            r8 = 1
            r26 = 0
            goto L_0x02c3
        L_0x0417:
            if (r6 == 0) goto L_0x0427
            X.0w8 r5 = r1.A00
            X.0pd r6 = r5.A03
            r5 = 2178(0x882, float:3.052E-42)
            boolean r5 = r6.A0C(r5)
            if (r5 != 0) goto L_0x0427
            goto L_0x025b
        L_0x0427:
            java.lang.String r5 = r3.A01
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x043f
            java.lang.String r5 = r3.A03
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x043f
            X.0w8 r5 = r1.A00
            boolean r5 = r5.A06()
            if (r5 != 0) goto L_0x0445
        L_0x043f:
            boolean r1 = r1.A01(r4)
            if (r1 == 0) goto L_0x025b
        L_0x0445:
            r12 = 1
            goto L_0x025b
        L_0x0448:
            r1 = r24
            boolean r5 = r1.A0D(r15)
            r12 = 1
            r1 = r18
            if (r1 != r12) goto L_0x045f
            if (r5 != 0) goto L_0x0462
            X.0pd r4 = r2.A05
            r1 = 994(0x3e2, float:1.393E-42)
            boolean r1 = r4.A0C(r1)
            if (r1 != 0) goto L_0x025b
        L_0x045f:
            r12 = 0
            goto L_0x025b
        L_0x0462:
            boolean r1 = r24.A07()
            if (r1 == 0) goto L_0x045f
            if (r4 == 0) goto L_0x025b
            boolean r1 = r4.A0F()
            if (r1 != 0) goto L_0x045f
            goto L_0x025b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118965vh.A00(android.content.Context, X.0tj):X.5tT");
    }

    public boolean A01(AnonymousClass1Vt r5) {
        if (r5 == null) {
            return false;
        }
        C18290wS r1 = this.A07;
        return this.A09.A0c(r5, r1.A03().AB6(), r1.A03().ADT(), 2);
    }
}
