package com.facebook.redex;

import X.AnonymousClass1WE;

public class IDxNConsumerShape152S0100000_1_I1 implements AnonymousClass1WE {
    public Object A00;
    public final int A01;

    public IDxNConsumerShape152S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (android.text.TextUtils.isEmpty(r0.A08.A08) != false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r21
            r1 = r20
            int r0 = r1.A01
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r5 = r1.A00
            X.30a r5 = (X.C600930a) r5
            X.4Mi r6 = (X.C84904Mi) r6
            X.0tZ r3 = r6.A01
            X.1Vw r2 = r3.A11
            android.widget.TextView r0 = r5.A0M
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0316
            X.1sv r0 = r6.A03
            r5.A0D = r0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.A02()
            r5.A1N(r0)
        L_0x002b:
            X.1sv r0 = r5.A0D
            r12 = 1
            r6 = 0
            if (r0 == 0) goto L_0x003c
            X.4SC r0 = r0.A08
            java.lang.String r0 = r0.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r11 = 1
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r11 = 0
        L_0x003d:
            r4 = 8
            if (r11 == 0) goto L_0x00bc
            android.widget.TextView r1 = r5.A0I
            r1.setVisibility(r6)
            r0 = 2131886851(0x7f120303, float:1.9408293E38)
            r1.setText(r0)
            X.1sv r0 = r5.A0D
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r1 = r5.A0K
            if (r0 == 0) goto L_0x00b1
            r1.setVisibility(r4)
        L_0x005b:
            X.1sv r7 = r5.A0D
            if (r7 == 0) goto L_0x0066
            X.2Ao r1 = r5.A0N
            android.widget.ImageView r0 = r5.A0G
            r1.A09(r0, r7)
        L_0x0066:
            X.0pd r1 = r5.A0M
            r0 = 875(0x36b, float:1.226E-42)
            r1.A0C(r0)
            r5.A00 = r6
            java.util.ArrayList r9 = r5.A0R
            r9.clear()
            java.util.ArrayList r8 = r5.A0S
            r8.clear()
            X.1sv r0 = r5.A0D
            r1 = 0
            if (r0 == 0) goto L_0x00c7
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x00c7
            java.util.Iterator r10 = r0.iterator()
        L_0x0086:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r7 = r10.next()
            X.1sw r7 = (X.C39711sw) r7
            java.lang.String r0 = r7.A02
            r8.add(r0)
            com.whatsapp.jid.UserJid r7 = r7.A01
            if (r7 == 0) goto L_0x00ad
            X.0sK r0 = r5.A0L
            boolean r0 = r0.A0I(r7)
            if (r0 != 0) goto L_0x00ad
            r9.add(r7)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            goto L_0x0086
        L_0x00ad:
            r9.add(r1)
            goto L_0x0086
        L_0x00b1:
            r1.setVisibility(r6)
            X.1sv r0 = r5.A0D
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            goto L_0x005b
        L_0x00bc:
            android.widget.TextView r0 = r5.A0K
            r0.setVisibility(r4)
            android.widget.TextView r0 = r5.A0I
            r0.setVisibility(r4)
            goto L_0x005b
        L_0x00c7:
            boolean r8 = r2.A02
            if (r8 != 0) goto L_0x01d8
            X.0rv r7 = r2.A00
            boolean r0 = X.C16030sJ.A0L(r7)
            X.0sG r2 = r5.A0a
            if (r0 == 0) goto L_0x01d1
            X.0rv r0 = r3.A0B()
            X.0sH r3 = X.C16000sG.A00(r2, r0)
            X.14s r0 = r5.A1a
            boolean r2 = r0.A03(r7)
            X.0ul r0 = r5.A1B
            X.0sL r7 = (X.C16050sL) r7
            X.0sO r0 = r0.A0a
            boolean r0 = r0.A0D(r7)
            r0 = r0 ^ 1
            r2 = r2 & r0
        L_0x00f0:
            X.1ko r0 = r3.A0D
            if (r0 == 0) goto L_0x00f5
            r12 = 0
        L_0x00f5:
            r12 = r12 & r2
            X.14s r2 = r5.A1a
            X.0rv r0 = X.C16010sH.A01(r3)
            boolean r0 = r2.A03(r0)
            r12 = r12 & r0
        L_0x0101:
            r0 = 2131362447(0x7f0a028f, float:1.8344675E38)
            android.view.View r3 = r5.findViewById(r0)
            r0 = 2131362463(0x7f0a029f, float:1.8344707E38)
            android.view.View r2 = r5.findViewById(r0)
            if (r12 != 0) goto L_0x01db
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x01b6
            android.widget.TextView r7 = r5.A0L
            r7.setVisibility(r6)
            r0 = 2131891444(0x7f1214f4, float:1.9417608E38)
            r7.setText(r0)
            r0 = 5
        L_0x0121:
            X.C34331k5.A03(r7, r5, r0)
        L_0x0124:
            if (r8 == 0) goto L_0x0162
            if (r11 == 0) goto L_0x012c
            int r0 = r5.A00
            if (r0 > 0) goto L_0x0193
        L_0x012c:
            r2.setVisibility(r4)
            android.widget.TextView r8 = r5.A0J
            r8.setVisibility(r4)
            X.1j5 r0 = r5.A0O
            r0.A03(r4)
            android.widget.LinearLayout r1 = r5.A0H
            r0 = 7
            X.C34331k5.A03(r1, r5, r0)
        L_0x013f:
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x015e
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L_0x015e
            r3.setVisibility(r4)
        L_0x014e:
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x01ed
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L_0x01ed
            r2.setVisibility(r6)
            return
        L_0x015e:
            r3.setVisibility(r6)
            goto L_0x014e
        L_0x0162:
            if (r11 != 0) goto L_0x0193
            X.0sK r0 = r5.A0L
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x018a
            r2.setVisibility(r6)
            android.widget.TextView r8 = r5.A0J
            r8.setVisibility(r6)
            r0 = 2131886248(0x7f1200a8, float:1.940707E38)
            r8.setText(r0)
            r0 = 3
            X.C34331k5.A03(r8, r5, r0)
        L_0x017e:
            android.widget.LinearLayout r1 = r5.A0H
            r0 = 7
            X.C34331k5.A03(r1, r5, r0)
        L_0x0184:
            X.1j5 r0 = r5.A0O
            r0.A03(r4)
            goto L_0x013f
        L_0x018a:
            r2.setVisibility(r4)
            android.widget.TextView r8 = r5.A0J
            r8.setVisibility(r4)
            goto L_0x017e
        L_0x0193:
            r2.setVisibility(r4)
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x01ab
            android.widget.TextView r8 = r5.A0J
            r8.setVisibility(r4)
            android.widget.LinearLayout r1 = r5.A0H
            r0 = 6
            X.C34331k5.A03(r1, r5, r0)
            X.1j5 r0 = r5.A0O
            r0.A03(r6)
            goto L_0x013f
        L_0x01ab:
            android.widget.LinearLayout r0 = r5.A0H
            r0.setOnClickListener(r1)
            android.widget.TextView r8 = r5.A0J
            r8.setVisibility(r4)
            goto L_0x0184
        L_0x01b6:
            X.1sv r0 = r5.A0D
            boolean r0 = r5.A1O(r0)
            android.widget.TextView r7 = r5.A0L
            if (r0 == 0) goto L_0x01cc
            r7.setVisibility(r6)
            r0 = 2131889073(0x7f120bb1, float:1.94128E38)
            r7.setText(r0)
            r0 = 4
            goto L_0x0121
        L_0x01cc:
            r7.setVisibility(r4)
            goto L_0x0124
        L_0x01d1:
            X.0sH r3 = X.C16000sG.A00(r2, r7)
            r2 = 1
            goto L_0x00f0
        L_0x01d8:
            r12 = 0
            goto L_0x0101
        L_0x01db:
            android.widget.TextView r0 = r5.A0L
            r0.setVisibility(r4)
            android.widget.TextView r0 = r5.A0J
            r0.setVisibility(r4)
            X.1j5 r0 = r5.A0O
            r0.A03(r4)
            r3.setVisibility(r4)
        L_0x01ed:
            r2.setVisibility(r4)
            return
        L_0x01f1:
            java.lang.Object r2 = r1.A00
            X.1Wc r2 = (X.C28441Wc) r2
            java.util.List r6 = (java.util.List) r6
            X.0ug r0 = r2.A07
            r19 = r0
            java.lang.String r8 = r19.A02()
            java.util.HashSet r7 = X.C13680ns.A0o()
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            java.lang.String r0 = "sync"
            X.1gQ r9 = new X.1gQ
            r9.<init>((java.lang.String) r0)
            java.util.Iterator r18 = r6.iterator()
        L_0x0217:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02a2
            java.lang.Object r1 = r18.next()
            X.1Wf r1 = (X.C28471Wf) r1
            if (r1 == 0) goto L_0x0217
            java.lang.String r13 = r1.A01
            X.11P r0 = r2.A06
            java.lang.Long r17 = r0.A00(r13)
            java.util.List r12 = r1.A02
            X.1XC r3 = r1.A00
            byte[] r11 = r1.A03
            X.0sK r0 = r2.A01
            boolean r16 = r0.A0G()
            java.lang.String r0 = "collection"
            X.1gQ r10 = new X.1gQ
            r10.<init>((java.lang.String) r0)
            java.lang.String r0 = "critical_unblock_low"
            boolean r0 = r0.equals(r13)
            r14 = r0 ^ 1
            java.lang.String r0 = "name"
            X.C32461gQ.A00(r10, r0, r13)
            java.lang.String r1 = "order"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (int) r14)
            r10.A02(r0)
            if (r17 == 0) goto L_0x0268
            long r0 = r17.longValue()
            java.lang.String r15 = "version"
            X.1lL r14 = new X.1lL
            r14.<init>((java.lang.String) r15, (long) r0)
            r10.A02(r14)
        L_0x0268:
            if (r16 == 0) goto L_0x027f
            if (r17 == 0) goto L_0x0276
            long r16 = r17.longValue()
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x027f
        L_0x0276:
            java.lang.String r1 = "return_snapshot"
            java.lang.String r0 = "true"
            X.C32461gQ.A00(r10, r1, r0)
        L_0x027f:
            if (r3 == 0) goto L_0x0296
            r14 = 0
            byte[] r3 = r3.A02()
            java.lang.String r1 = "patch"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (byte[]) r3, (X.C35081lL[]) r14)
            r10.A03(r0)
            r5.put(r13, r12)
            r4.put(r13, r11)
        L_0x0296:
            r7.add(r13)
            X.1Vv r0 = r10.A01()
            r9.A03(r0)
            goto L_0x0217
        L_0x02a2:
            java.lang.String r0 = "iq"
            X.1gQ r10 = new X.1gQ
            r10.<init>((java.lang.String) r0)
            X.1lL r0 = X.C35081lL.A00()
            r10.A02(r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:sync:app:state"
            X.C32461gQ.A00(r10, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C32461gQ.A00(r10, r1, r0)
            java.lang.String r0 = "id"
            X.C32461gQ.A00(r10, r0, r8)
            java.util.List r0 = r9.A02
            r0.clear()
            java.lang.String r3 = "data_namespace"
            r1 = 3
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r3, (int) r1)
            r9.A02(r0)
            X.1Vv r0 = r9.A01()
            r10.A03(r0)
            X.1Vv r10 = r10.A01()
            X.28L r9 = new X.28L
            r14 = r7
            r11 = r8
            r12 = r5
            r13 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A00 = r9
            X.0yJ r0 = r2.A05
            r0.A03(r6)
            java.lang.String r0 = "sync-request-handler/sendIq iqId:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.28L r0 = r2.A00
            java.lang.String r0 = r0.A02
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 238(0xee, float:3.34E-43)
            X.28L r0 = r2.A00
            java.lang.String r1 = r0.A02
            X.1Vv r0 = r0.A01
            r8 = 32000(0x7d00, double:1.581E-319)
            r3 = r19
            r4 = r2
            r5 = r0
            r6 = r1
            r3.A0B(r4, r5, r6, r7, r8)
        L_0x0316:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNConsumerShape152S0100000_1_I1.accept(java.lang.Object):void");
    }
}
