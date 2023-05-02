package com.facebook.redex;

import X.AnonymousClass025;

public class IDxFunctionShape205S0100000_1_I0 implements AnonymousClass025 {
    public Object A00;
    public final int A01;

    public IDxFunctionShape205S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: X.2B9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: X.2B9} */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.util.AbstractCollection, java.util.AbstractList, java.lang.Object, java.util.LinkedList] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0260, code lost:
        if (r11 == false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0262, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0268, code lost:
        if (android.text.TextUtils.isEmpty(r5.A00) != false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026a, code lost:
        r7.add(new X.AnonymousClass2XI(X.C13680ns.A0d(r5.A00, r5.A00, new java.lang.Object[1], 0, com.obwhatsapp.R.string.str14a8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027f, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0283, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0284, code lost:
        com.whatsapp.util.Log.e("InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x028d, code lost:
        return X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b6, code lost:
        if (r1 == -3) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0461, code lost:
        r10.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0464, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x053b, code lost:
        r0.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x053e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0579, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0132, code lost:
        if (r0.A90(r15) == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017f, code lost:
        if (r8.size() <= 0) goto L_0x0181;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:324:0x0872 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:329:0x0877 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r30) {
        /*
            r29 = this;
            r1 = r30
            r2 = r29
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x028e;
                case 2: goto L_0x03e8;
                case 3: goto L_0x0625;
                case 4: goto L_0x0759;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r9 = r2.A00
            X.2B6 r9 = (X.AnonymousClass2B6) r9
            X.1XY r1 = (X.AnonymousClass1XY) r1
            long r20 = android.os.SystemClock.uptimeMillis()
            X.027 r0 = r9.A0C
            r28 = r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.A09(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A02
            r27 = r0
            r2 = 1
            r0.set(r2)
            java.lang.Object r8 = r1.A01
            X.1xi r8 = (X.C42391xi) r8
            int r0 = r8.A00
            r26 = r0
            X.026 r0 = r9.A06
            java.lang.Object r7 = r0.A01()
            X.2B9 r7 = (X.AnonymousClass2B9) r7
            r24 = 2
            int r6 = X.C42421xl.A00(r24)
            X.17S r5 = r9.A0M
            r3 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.ALF(r3, r6)
            int r2 = r8.A00
            java.lang.String r0 = "page"
            r5.AKn(r0, r3, r6, r2)
            int r2 = r8.A02
            java.lang.String r0 = "type"
            r5.AKn(r0, r3, r6, r2)
            X.0rv r0 = r8.A04
            boolean r2 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "jid"
            r5.AKq(r0, r3, r6, r2)
            r0 = 2
            X.AnonymousClass17S.A00(r8, r5, r6, r0)
            java.lang.String r0 = "MessageSearchManager/getMessagesForQuery/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r8.A02()
            int r0 = r0.length()
            java.lang.String r2 = X.AnonymousClass000.A0l(r2, r0)
            X.1Zf r23 = new X.1Zf
            r0 = r23
            r0.<init>((java.lang.String) r2)
            java.lang.Boolean r0 = r8.A08
            if (r0 == 0) goto L_0x00dc
            java.lang.Boolean r0 = r8.A01()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00dc
            r0 = 0
            r8.A08 = r0
            r3 = 1
        L_0x008b:
            X.17F r2 = r9.A0H
            X.024 r0 = r1.A00
            r25 = r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            android.util.Pair r12 = r2.A05(r0, r8, r14)
            java.lang.Object r0 = r12.first
            int r1 = X.AnonymousClass000.A0D(r0)
            r0 = -2
            if (r1 != r0) goto L_0x00ab
            r0 = 0
            r8.A0F = r0
            r0 = r25
            android.util.Pair r12 = r2.A05(r0, r8, r14)
        L_0x00ab:
            java.lang.Object r0 = r12.first
            int r1 = X.AnonymousClass000.A0D(r0)
            if (r1 == 0) goto L_0x00b8
            r0 = -3
            r22 = 0
            if (r1 != r0) goto L_0x00ba
        L_0x00b8:
            r22 = 1
        L_0x00ba:
            java.lang.Object r0 = r12.second
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
            java.lang.String r0 = "search"
            X.C42421xl.A02(r5, r14, r0)
        L_0x00c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00de
            X.0tZ r0 = X.C13680ns.A0V(r1)
            if (r3 == 0) goto L_0x00c8
            boolean r0 = r0.A0x
            if (r0 == 0) goto L_0x00c8
            r1.remove()
            goto L_0x00c8
        L_0x00dc:
            r3 = 0
            goto L_0x008b
        L_0x00de:
            java.lang.String r0 = "remove starred"
            X.C42421xl.A02(r5, r14, r0)
            java.lang.Object r0 = r12.second
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r19 = X.C13680ns.A0n(r0)
            java.util.ArrayList r18 = X.AnonymousClass000.A0u()
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            X.1xi r0 = r9.A0I
            X.1lG r13 = r0.A06
            X.0pd r3 = r9.A0K
            r0 = 1352(0x548, float:1.895E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r17 = r3.A0E(r2, r0)
            java.util.Iterator r16 = r19.iterator()
        L_0x010d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x053f
            X.0tZ r1 = X.C13680ns.A0V(r16)
            if (r1 == 0) goto L_0x0134
            boolean r0 = r1.A15
            if (r0 != 0) goto L_0x0134
            if (r13 == 0) goto L_0x0138
            X.1Vw r0 = r1.A11
            X.0rv r15 = r0.A00
            if (r15 == 0) goto L_0x0138
            X.1Ay r0 = r9.A0N
            X.1uu r0 = r0.A00(r13)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.A90(r15)
            if (r0 != 0) goto L_0x0138
        L_0x0134:
            r16.remove()
            goto L_0x010d
        L_0x0138:
            boolean r0 = r1.A0x
            if (r0 == 0) goto L_0x0157
            r11.add(r1)
        L_0x013f:
            boolean r0 = r1 instanceof X.C38681rF
            if (r0 != 0) goto L_0x014b
            boolean r0 = r1 instanceof X.C38721rJ
            if (r0 != 0) goto L_0x014b
            boolean r0 = r1 instanceof X.C38701rH
            if (r0 == 0) goto L_0x010d
        L_0x014b:
            X.0tY r1 = (X.C16730tY) r1
            boolean r0 = r1.A18()
            if (r0 == 0) goto L_0x010d
            r4.add(r1)
            goto L_0x010d
        L_0x0157:
            if (r17 == 0) goto L_0x0166
            int r0 = r1.A06()
            r15 = 1
            if (r0 != r15) goto L_0x0166
            r0 = r18
            r0.add(r1)
            goto L_0x013f
        L_0x0166:
            r10.add(r1)
            goto L_0x013f
        L_0x016a:
            java.lang.Object r5 = r2.A00
            X.2AY r5 = (X.AnonymousClass2AY) r5
            X.1XY r1 = (X.AnonymousClass1XY) r1
            java.lang.Object r8 = r1.A01
            java.util.List r8 = (java.util.List) r8
            X.024 r7 = r1.A00
            r6 = 1
            r4 = 0
            if (r8 == 0) goto L_0x0181
            int r0 = r8.size()
            r11 = 1
            if (r0 > 0) goto L_0x0182
        L_0x0181:
            r11 = 0
        L_0x0182:
            r7.A02()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            monitor-enter(r5)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.List r2 = r5.A0E     // Catch:{ all -> 0x0280 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0195
            X.0sG r0 = r5.A09     // Catch:{ all -> 0x0280 }
            X.18c r0 = r0.A06     // Catch:{ all -> 0x0280 }
            r0.A0R(r2, r4, r6, r4)     // Catch:{ all -> 0x0280 }
        L_0x0195:
            monitor-exit(r5)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r7.A02()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.HashMap r3 = X.AnonymousClass000.A0x()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r11 == 0) goto L_0x01e6
            X.0sP r1 = r5.A0A     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.2km r0 = new X.2km     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r0.<init>(r1, r8)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.List r10 = java.util.Collections.singletonList(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
        L_0x01ae:
            boolean r0 = r9.hasNext()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 == 0) goto L_0x0213
            X.0sH r8 = X.C13680ns.A0U(r9)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r7.A02()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r10 == 0) goto L_0x01df
            boolean r0 = r10.isEmpty()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 != 0) goto L_0x01df
            java.util.Iterator r2 = r10.iterator()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
        L_0x01c7:
            boolean r0 = r2.hasNext()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r2.next()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.2km r0 = (X.C55992km) r0     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.0sP r1 = r0.A00     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.List r0 = r0.A01     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            boolean r0 = r1.A0T(r8, r0, r6)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 != 0) goto L_0x01c7
            r0 = 0
            goto L_0x01e0
        L_0x01df:
            r0 = 1
        L_0x01e0:
            if (r0 == 0) goto L_0x01ae
            X.AnonymousClass2AY.A01(r8, r3)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            goto L_0x01ae
        L_0x01e6:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
        L_0x01ea:
            boolean r0 = r2.hasNext()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 == 0) goto L_0x0213
            X.0sH r1 = X.C13680ns.A0U(r2)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r7.A02()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.AnonymousClass2AY.A01(r1, r3)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            boolean r0 = r5.A01     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 != 0) goto L_0x01ea
            java.lang.String r0 = r1.A09()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 == 0) goto L_0x01ea
            int r0 = r0.size()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 <= r6) goto L_0x01ea
            r5.A01 = r6     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            goto L_0x01ea
        L_0x0213:
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r8.<init>()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.Iterator r3 = X.C13690nt.A0j(r3)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
        L_0x021c:
            boolean r0 = r3.hasNext()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 == 0) goto L_0x0239
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r3)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.lang.String r2 = X.C13690nt.A0f(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.2kn r0 = new X.2kn     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r0.<init>(r2, r1)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r8.add(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            goto L_0x021c
        L_0x0239:
            X.013 r1 = r5.A0B     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.2ko r0 = new X.2ko     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r0.<init>(r1)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.Collections.sort(r8, r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r7.<init>(r8)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            boolean r0 = r7.isEmpty()     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 != 0) goto L_0x0260
            android.app.Application r1 = r5.A00     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r0 = 2131893461(0x7f121cd5, float:1.94217E38)
            java.lang.String r1 = r1.getString(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.2kp r0 = new X.2kp     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r0.<init>(r1)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r7.add(r4, r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            return r7
        L_0x0260:
            if (r11 == 0) goto L_0x0579
            java.lang.String r0 = r5.A00     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            if (r0 != 0) goto L_0x0579
            android.app.Application r3 = r5.A00     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r2 = 2131891368(0x7f1214a8, float:1.9417454E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.lang.String r0 = r5.A00     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            java.lang.String r1 = X.C13680ns.A0d(r3, r0, r1, r4, r2)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            X.2XI r0 = new X.2XI     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r0.<init>(r1)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            r7.add(r0)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            return r7
        L_0x0280:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ 057 | IllegalStateException -> 0x0283 }
            throw r0     // Catch:{ 057 | IllegalStateException -> 0x0283 }
        L_0x0283:
            r1 = move-exception
            java.lang.String r0 = "InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            return r7
        L_0x028e:
            java.lang.Object r3 = r2.A00
            X.2Wt r3 = (X.C49942Wt) r3
            X.1XY r1 = (X.AnonymousClass1XY) r1
            java.lang.String r2 = "filter"
            long r15 = android.os.SystemClock.uptimeMillis()
            X.027 r4 = r3.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A09(r0)
            java.lang.Object r14 = r1.A01
            X.1xi r14 = (X.C42391xi) r14
            r0 = 1
            int r9 = X.C42421xl.A00(r0)
            X.17S r8 = r3.A0B
            r6 = 926875649(0x373f0001, float:1.1384488E-5)
            r8.ALF(r6, r9)
            int r5 = r14.A02
            java.lang.String r0 = "type"
            r8.AKn(r0, r6, r9, r5)
            X.0rv r0 = r14.A04
            r7 = 1
            boolean r5 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "jid"
            r8.AKq(r0, r6, r9, r5)
            X.AnonymousClass17S.A00(r14, r8, r9, r7)
            X.024 r11 = r1.A00
            java.lang.String r0 = "chatSearchManager/getContactsForQuery/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0D
            int r0 = r0.getAndIncrement()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = r14.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            X.1Zf r10 = new X.1Zf
            r10.<init>((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 057 -> 0x039a }
            int r0 = r14.A02     // Catch:{ 057 -> 0x039a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 057 -> 0x039a }
            boolean r0 = r1.equals(r0)     // Catch:{ 057 -> 0x039a }
            if (r0 == 0) goto L_0x0317
            X.0rv r0 = r14.A04     // Catch:{ 057 -> 0x039a }
            if (r0 != 0) goto L_0x0317
            java.util.List r0 = r14.A03()     // Catch:{ 057 -> 0x039a }
            boolean r0 = X.C13700nu.A0i(r0)     // Catch:{ 057 -> 0x039a }
            if (r0 != 0) goto L_0x0326
            X.1lG r0 = r14.A06     // Catch:{ 057 -> 0x039a }
            if (r0 != 0) goto L_0x0326
        L_0x0317:
            java.lang.String r0 = "empty"
            r10.A02(r0)     // Catch:{ 057 -> 0x039a }
            r8.AKx(r6, r9)     // Catch:{ 057 -> 0x039a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 057 -> 0x039a }
            r4.A09(r0)     // Catch:{ 057 -> 0x039a }
            goto L_0x0461
        L_0x0326:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ 057 -> 0x039a }
            java.util.List r0 = r14.A03()     // Catch:{ 057 -> 0x039a }
            boolean r0 = X.C13700nu.A0i(r0)     // Catch:{ 057 -> 0x039a }
            if (r0 == 0) goto L_0x0344
            X.14t r13 = r3.A08     // Catch:{ 057 -> 0x039a }
            X.0sP r12 = r3.A05     // Catch:{ 057 -> 0x039a }
            java.util.List r1 = r14.A03()     // Catch:{ 057 -> 0x039a }
            X.2kr r0 = new X.2kr     // Catch:{ 057 -> 0x039a }
            r0.<init>(r12, r13, r1)     // Catch:{ 057 -> 0x039a }
            r5.add(r0)     // Catch:{ 057 -> 0x039a }
        L_0x0344:
            X.1lG r1 = r14.A06     // Catch:{ 057 -> 0x039a }
            if (r1 == 0) goto L_0x0351
            X.1Ay r0 = r3.A0C     // Catch:{ 057 -> 0x039a }
            X.1uu r0 = r0.A00(r1)     // Catch:{ 057 -> 0x039a }
            r5.add(r0)     // Catch:{ 057 -> 0x039a }
        L_0x0351:
            r10.A02(r2)     // Catch:{ 057 -> 0x039a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ 057 -> 0x039a }
            X.C42421xl.A02(r8, r0, r2)     // Catch:{ 057 -> 0x039a }
            r11.A02()     // Catch:{ 057 -> 0x039a }
            X.0rs r0 = r3.A06     // Catch:{ 057 -> 0x039a }
            java.util.List r0 = r0.A05()     // Catch:{ 057 -> 0x039a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 057 -> 0x039a }
        L_0x0368:
            boolean r0 = r2.hasNext()     // Catch:{ 057 -> 0x039a }
            if (r0 == 0) goto L_0x038b
            X.0rv r1 = X.C13700nu.A0B(r2)     // Catch:{ 057 -> 0x039a }
            boolean r0 = com.obwhatsapp.yo.yo.H3T((X.C15830rv) r1)     // Catch:{ 057 -> 0x039a }
            if (r0 != 0) goto L_0x0368
            r11.A02()     // Catch:{ 057 -> 0x039a }
            boolean r0 = X.C216114t.A00(r1, r5)     // Catch:{ 057 -> 0x039a }
            if (r0 == 0) goto L_0x0368
            X.14t r0 = r3.A08     // Catch:{ 057 -> 0x039a }
            X.0sH r0 = r0.A01(r1)     // Catch:{ 057 -> 0x039a }
            r7.add(r0)     // Catch:{ 057 -> 0x039a }
            goto L_0x0368
        L_0x038b:
            java.lang.String r0 = "done"
            r10.A02(r0)     // Catch:{ 057 -> 0x039a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 057 -> 0x039a }
            r4.A09(r0)     // Catch:{ 057 -> 0x039a }
            r0 = 2
            X.C42421xl.A01(r8, r9, r0)     // Catch:{ 057 -> 0x039a }
            goto L_0x03b1
        L_0x039a:
            java.lang.String r0 = "cancelled"
            r10.A02(r0)     // Catch:{ all -> 0x0620 }
            long r4 = r10.A00()     // Catch:{ all -> 0x0620 }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ad
            r8.AKx(r6, r9)     // Catch:{ all -> 0x0620 }
            goto L_0x03b1
        L_0x03ad:
            r0 = 4
            X.C42421xl.A01(r8, r9, r0)     // Catch:{ all -> 0x0620 }
        L_0x03b1:
            r10.A01()
            java.lang.Boolean r0 = r3.A01
            if (r0 != 0) goto L_0x03c8
            X.0pd r2 = r3.A09
            r1 = 2883(0xb43, float:4.04E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
        L_0x03c8:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0579
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r15
            X.2kq r4 = new X.2kq
            r4.<init>()
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r4.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r4.A03 = r0
            X.0t9 r0 = r3.A0A
            goto L_0x053b
        L_0x03e8:
            java.lang.Object r3 = r2.A00
            X.2Ws r3 = (X.C49932Ws) r3
            X.1XY r1 = (X.AnonymousClass1XY) r1
            java.lang.String r2 = "filter"
            long r14 = android.os.SystemClock.uptimeMillis()
            X.027 r4 = r3.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A09(r0)
            java.lang.Object r13 = r1.A01
            X.1xi r13 = (X.C42391xi) r13
            r5 = 0
            int r8 = X.C42421xl.A00(r5)
            X.17S r6 = r3.A0B
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.ALF(r0, r8)
            X.AnonymousClass17S.A00(r13, r6, r8, r5)
            X.024 r11 = r1.A00
            java.lang.String r0 = "ContactSearchManager/getForContactsQuery/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r13.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            X.1Zf r10 = new X.1Zf
            r10.<init>((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            r11.A02()     // Catch:{ 057 -> 0x04ec }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ 057 -> 0x04ec }
            int r0 = r13.A02     // Catch:{ 057 -> 0x04ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 057 -> 0x04ec }
            boolean r0 = r1.equals(r0)     // Catch:{ 057 -> 0x04ec }
            if (r0 == 0) goto L_0x0451
            X.0rv r0 = r13.A04     // Catch:{ 057 -> 0x04ec }
            if (r0 != 0) goto L_0x0451
            java.util.List r0 = r13.A03()     // Catch:{ 057 -> 0x04ec }
            boolean r0 = X.C13700nu.A0i(r0)     // Catch:{ 057 -> 0x04ec }
            if (r0 != 0) goto L_0x0465
            X.1lG r0 = r13.A06     // Catch:{ 057 -> 0x04ec }
            if (r0 != 0) goto L_0x0465
        L_0x0451:
            java.lang.String r0 = "empty"
            r10.A02(r0)     // Catch:{ 057 -> 0x04ec }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.AKx(r0, r8)     // Catch:{ 057 -> 0x04ec }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 057 -> 0x04ec }
            r4.A09(r0)     // Catch:{ 057 -> 0x04ec }
        L_0x0461:
            r10.A01()
            return r7
        L_0x0465:
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()     // Catch:{ 057 -> 0x04ec }
            java.util.List r0 = r13.A03()     // Catch:{ 057 -> 0x04ec }
            boolean r0 = X.C13700nu.A0i(r0)     // Catch:{ 057 -> 0x04ec }
            if (r0 == 0) goto L_0x0483
            X.14t r12 = r3.A08     // Catch:{ 057 -> 0x04ec }
            X.0sP r5 = r3.A05     // Catch:{ 057 -> 0x04ec }
            java.util.List r1 = r13.A03()     // Catch:{ 057 -> 0x04ec }
            X.2kr r0 = new X.2kr     // Catch:{ 057 -> 0x04ec }
            r0.<init>(r5, r12, r1)     // Catch:{ 057 -> 0x04ec }
            r9.add(r0)     // Catch:{ 057 -> 0x04ec }
        L_0x0483:
            X.1lG r1 = r13.A06     // Catch:{ 057 -> 0x04ec }
            if (r1 == 0) goto L_0x0490
            X.1Ay r0 = r3.A0C     // Catch:{ 057 -> 0x04ec }
            X.1uu r0 = r0.A00(r1)     // Catch:{ 057 -> 0x04ec }
            r9.add(r0)     // Catch:{ 057 -> 0x04ec }
        L_0x0490:
            r10.A02(r2)     // Catch:{ 057 -> 0x04ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ 057 -> 0x04ec }
            X.C42421xl.A02(r6, r0, r2)     // Catch:{ 057 -> 0x04ec }
            r11.A02()     // Catch:{ 057 -> 0x04ec }
            X.14t r0 = r3.A08     // Catch:{ 057 -> 0x04ec }
            java.util.List r0 = r0.A02()     // Catch:{ 057 -> 0x04ec }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ 057 -> 0x04ec }
        L_0x04a7:
            boolean r0 = r12.hasNext()     // Catch:{ 057 -> 0x04ec }
            if (r0 == 0) goto L_0x04dd
            X.0sH r5 = X.C13680ns.A0U(r12)     // Catch:{ 057 -> 0x04ec }
            r11.A02()     // Catch:{ 057 -> 0x04ec }
            X.1ko r0 = r5.A0D     // Catch:{ 057 -> 0x04ec }
            if (r0 == 0) goto L_0x04a7
            X.0rs r0 = r3.A06     // Catch:{ 057 -> 0x04ec }
            java.util.List r2 = r0.A05()     // Catch:{ 057 -> 0x04ec }
            java.lang.Class<X.0rv> r1 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r5.A08(r1)     // Catch:{ 057 -> 0x04ec }
            boolean r0 = r2.contains(r0)     // Catch:{ 057 -> 0x04ec }
            if (r0 != 0) goto L_0x04a7
            com.whatsapp.jid.Jid r0 = r5.A08(r1)     // Catch:{ 057 -> 0x04ec }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ 057 -> 0x04ec }
            X.AnonymousClass00B.A06(r0)     // Catch:{ 057 -> 0x04ec }
            boolean r0 = X.C216114t.A00(r0, r9)     // Catch:{ 057 -> 0x04ec }
            if (r0 == 0) goto L_0x04a7
            r7.add(r5)     // Catch:{ 057 -> 0x04ec }
            goto L_0x04a7
        L_0x04dd:
            java.lang.String r0 = "done"
            r10.A02(r0)     // Catch:{ 057 -> 0x04ec }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 057 -> 0x04ec }
            r4.A09(r0)     // Catch:{ 057 -> 0x04ec }
            r0 = 2
            X.C42421xl.A01(r6, r8, r0)     // Catch:{ 057 -> 0x04ec }
            goto L_0x0506
        L_0x04ec:
            java.lang.String r0 = "cancelled"
            r10.A02(r0)     // Catch:{ all -> 0x0620 }
            long r4 = r10.A00()     // Catch:{ all -> 0x0620 }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0502
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.AKx(r0, r8)     // Catch:{ all -> 0x0620 }
            goto L_0x0506
        L_0x0502:
            r0 = 4
            X.C42421xl.A01(r6, r8, r0)     // Catch:{ all -> 0x0620 }
        L_0x0506:
            r10.A01()
            java.lang.Boolean r0 = r3.A01
            if (r0 != 0) goto L_0x051d
            X.0pd r2 = r3.A09
            r1 = 2883(0xb43, float:4.04E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
        L_0x051d:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0579
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r14
            X.2kq r4 = new X.2kq
            r4.<init>()
            java.lang.Integer r0 = X.C13680ns.A0X()
            r4.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r4.A03 = r0
            X.0t9 r0 = r3.A0A
        L_0x053b:
            r0.A06(r4)
            return r7
        L_0x053f:
            java.lang.String r0 = "filter"
            X.C42421xl.A02(r5, r14, r0)
            if (r7 == 0) goto L_0x0609
            java.util.List r1 = r7.A02
            r0 = r19
            r1.addAll(r0)
            java.util.List r1 = r7.A00
            r0 = r18
            r1.addAll(r0)
            java.util.List r0 = r7.A03
            r0.addAll(r11)
            java.util.List r0 = r7.A04
            r0.addAll(r10)
            java.util.List r0 = r7.A01
            r0.addAll(r4)
        L_0x0563:
            boolean r0 = r25.A04()
            if (r0 == 0) goto L_0x057a
            long r3 = r23.A00()
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x061b
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.AKx(r0, r6)
        L_0x0579:
            return r7
        L_0x057a:
            java.lang.String r0 = "found: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.Object r0 = r12.first
            r1.append(r0)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r12.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r1 = X.AnonymousClass000.A0l(r1, r0)
            r0 = r23
            r0.A02(r1)
            r23.A01()
            X.027 r1 = r9.A0A
            if (r22 == 0) goto L_0x0603
            r0 = -1
            X.C13680ns.A1P(r1, r0)
            java.lang.Boolean r0 = r8.A01()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x05b8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = r28
            r0.A09(r1)
        L_0x05b8:
            r1 = 0
            r0 = r27
            r0.set(r1)
            r0 = 2
            X.C42421xl.A01(r5, r6, r0)
            java.lang.Boolean r0 = r9.A01
            if (r0 != 0) goto L_0x05d2
            r0 = 2883(0xb43, float:4.04E-42)
            boolean r0 = r3.A0E(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A01 = r0
        L_0x05d2:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0579
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r20
            X.2kq r1 = new X.2kq
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A03 = r0
            java.lang.Boolean r0 = r8.A01()
            r1.A00 = r0
            int r0 = r8.A00
            java.lang.Long r0 = X.C13690nt.A0W(r0)
            r1.A02 = r0
            X.0t9 r0 = r9.A0L
            r0.A06(r1)
            return r7
        L_0x0603:
            r0 = r26
            X.C13680ns.A1P(r1, r0)
            goto L_0x05b8
        L_0x0609:
            X.2B9 r7 = new X.2B9
            r13 = r7
            r14 = r19
            r15 = r18
            r16 = r11
            r17 = r10
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x0563
        L_0x061b:
            r0 = 4
            X.C42421xl.A01(r5, r6, r0)
            return r7
        L_0x0620:
            r0 = move-exception
            r10.A01()
            throw r0
        L_0x0625:
            java.lang.Object r8 = r2.A00
            X.2Wr r8 = (X.C49922Wr) r8
            X.1XY r1 = (X.AnonymousClass1XY) r1
            java.lang.String r11 = "found groups in common"
            java.lang.String r9 = "filtered contacts"
            java.lang.String r2 = "filter"
            X.027 r4 = r8.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A09(r0)
            java.lang.Object r14 = r1.A01
            X.1xi r14 = (X.C42391xi) r14
            r0 = 3
            int r6 = X.C42421xl.A00(r0)
            X.024 r12 = r1.A00
            java.lang.String r0 = "GroupSearchManager/getGroupsForQuery/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r14.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            X.1Zf r5 = new X.1Zf
            r5.<init>((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            r12.A02()     // Catch:{ 057 -> 0x0732 }
            java.lang.Integer r1 = X.C13680ns.A0X()     // Catch:{ 057 -> 0x0732 }
            int r0 = r14.A02     // Catch:{ 057 -> 0x0732 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 057 -> 0x0732 }
            boolean r0 = r1.equals(r0)     // Catch:{ 057 -> 0x0732 }
            if (r0 == 0) goto L_0x071f
            X.0rv r0 = r14.A04     // Catch:{ 057 -> 0x0732 }
            if (r0 != 0) goto L_0x071f
            java.util.List r0 = r14.A03()     // Catch:{ 057 -> 0x0732 }
            boolean r0 = X.C13700nu.A0i(r0)     // Catch:{ 057 -> 0x0732 }
            if (r0 == 0) goto L_0x071f
            r5.A02(r2)     // Catch:{ 057 -> 0x0732 }
            X.17S r3 = r8.A06     // Catch:{ 057 -> 0x0732 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ 057 -> 0x0732 }
            X.C42421xl.A02(r3, r10, r2)     // Catch:{ 057 -> 0x0732 }
            r12.A02()     // Catch:{ 057 -> 0x0732 }
            java.util.HashSet r13 = X.C13680ns.A0o()     // Catch:{ 057 -> 0x0732 }
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()     // Catch:{ 057 -> 0x0732 }
            X.17F r0 = r8.A04     // Catch:{ 057 -> 0x0732 }
            java.util.List r0 = r0.A0I(r12, r14)     // Catch:{ 057 -> 0x0732 }
            r12.A02()     // Catch:{ 057 -> 0x0732 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ 057 -> 0x0732 }
        L_0x06a3:
            boolean r0 = r14.hasNext()     // Catch:{ 057 -> 0x0732 }
            if (r0 == 0) goto L_0x06be
            X.0sH r1 = X.C13680ns.A0U(r14)     // Catch:{ 057 -> 0x0732 }
            X.0rv r0 = r1.A0E     // Catch:{ 057 -> 0x0732 }
            boolean r0 = r13.contains(r0)     // Catch:{ 057 -> 0x0732 }
            if (r0 != 0) goto L_0x06a3
            X.0rv r0 = r1.A0E     // Catch:{ 057 -> 0x0732 }
            r13.add(r0)     // Catch:{ 057 -> 0x0732 }
            r2.add(r1)     // Catch:{ 057 -> 0x0732 }
            goto L_0x06a3
        L_0x06be:
            r5.A02(r9)     // Catch:{ 057 -> 0x0732 }
            X.C42421xl.A02(r3, r10, r9)     // Catch:{ 057 -> 0x0732 }
            java.util.HashSet r9 = X.C13680ns.A0o()     // Catch:{ 057 -> 0x0732 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ 057 -> 0x0732 }
        L_0x06cc:
            boolean r0 = r14.hasNext()     // Catch:{ 057 -> 0x0732 }
            if (r0 == 0) goto L_0x0705
            X.0sH r1 = X.C13680ns.A0U(r14)     // Catch:{ 057 -> 0x0732 }
            r12.A02()     // Catch:{ 057 -> 0x0732 }
            X.2Z7 r0 = r8.A05     // Catch:{ 057 -> 0x0732 }
            java.util.List r0 = r0.A00(r1)     // Catch:{ 057 -> 0x0732 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ 057 -> 0x0732 }
        L_0x06e3:
            boolean r0 = r13.hasNext()     // Catch:{ 057 -> 0x0732 }
            if (r0 == 0) goto L_0x06cc
            java.lang.Object r2 = r13.next()     // Catch:{ 057 -> 0x0732 }
            X.1jn r2 = (X.C34161jn) r2     // Catch:{ 057 -> 0x0732 }
            X.0sH r1 = r2.A01     // Catch:{ 057 -> 0x0732 }
            boolean r0 = r9.contains(r1)     // Catch:{ 057 -> 0x0732 }
            if (r0 != 0) goto L_0x06e3
            r9.add(r1)     // Catch:{ 057 -> 0x0732 }
            r7.add(r2)     // Catch:{ 057 -> 0x0732 }
            int r1 = r7.size()     // Catch:{ 057 -> 0x0732 }
            r0 = 15
            if (r1 < r0) goto L_0x06e3
        L_0x0705:
            r5.A02(r11)     // Catch:{ 057 -> 0x0732 }
            X.C42421xl.A02(r3, r10, r11)     // Catch:{ 057 -> 0x0732 }
            r0 = 25
            X.C13690nt.A1P(r7, r0)     // Catch:{ 057 -> 0x0732 }
            java.lang.String r0 = "done"
            r5.A02(r0)     // Catch:{ 057 -> 0x0732 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 057 -> 0x0732 }
            r4.A09(r0)     // Catch:{ 057 -> 0x0732 }
            r0 = 2
            X.C42421xl.A01(r3, r6, r0)     // Catch:{ 057 -> 0x0732 }
            goto L_0x0750
        L_0x071f:
            java.lang.String r0 = "empty"
            r5.A02(r0)     // Catch:{ 057 -> 0x0732 }
            X.17S r1 = r8.A06     // Catch:{ 057 -> 0x0732 }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.AKx(r0, r6)     // Catch:{ 057 -> 0x0732 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 057 -> 0x0732 }
            r4.A09(r0)     // Catch:{ 057 -> 0x0732 }
            goto L_0x0750
        L_0x0732:
            java.lang.String r0 = "cancelled"
            r5.A02(r0)     // Catch:{ all -> 0x0754 }
            long r3 = r5.A00()     // Catch:{ all -> 0x0754 }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x074a
            X.17S r1 = r8.A06     // Catch:{ all -> 0x0754 }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.AKx(r0, r6)     // Catch:{ all -> 0x0754 }
            goto L_0x0750
        L_0x074a:
            X.17S r1 = r8.A06     // Catch:{ all -> 0x0754 }
            r0 = 4
            X.C42421xl.A01(r1, r6, r0)     // Catch:{ all -> 0x0754 }
        L_0x0750:
            r5.A01()
            return r7
        L_0x0754:
            r0 = move-exception
            r5.A01()
            throw r0
        L_0x0759:
            java.lang.Object r3 = r2.A00
            X.2B6 r3 = (X.AnonymousClass2B6) r3
            X.1XY r1 = (X.AnonymousClass1XY) r1
            java.lang.Object r4 = r1.A01
            X.1xi r4 = (X.C42391xi) r4
            int r0 = r4.A02
            if (r0 == 0) goto L_0x076d
            android.util.SparseIntArray r7 = new android.util.SparseIntArray
            r7.<init>()
            return r7
        L_0x076d:
            X.027 r2 = r3.A0B
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A09(r0)
            X.17F r6 = r3.A0H
            X.024 r12 = r1.A00
            java.lang.String r0 = "FtsMessageStore/getMediaCounts/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r4.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            X.1Zf r3 = new X.1Zf
            r3.<init>((java.lang.String) r0)
            android.util.SparseIntArray r7 = new android.util.SparseIntArray
            r7.<init>()
            boolean r0 = r6.A0P()
            if (r0 != 0) goto L_0x07a8
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x079c:
            r3.A02(r0)
        L_0x079f:
            r3.A01()
        L_0x07a2:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A09(r0)
            return r7
        L_0x07a8:
            boolean r0 = X.AnonymousClass17F.A02(r12)
            java.lang.String r11 = "cancelled"
            if (r0 != 0) goto L_0x0895
            long r13 = r6.A04()
            r8 = 1
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x07be
            java.lang.String r0 = "v1"
            goto L_0x079c
        L_0x07be:
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r4.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r16 = ""
            if (r0 == 0) goto L_0x0808
            X.0rv r0 = r4.A04
            if (r0 != 0) goto L_0x0808
            r14 = r16
        L_0x07d8:
            X.013 r0 = r6.A05
            X.1xi r13 = new X.1xi
            r13.<init>(r0)
            int[] r10 = X.AnonymousClass17F.A0J
            int r4 = r10.length
            r9 = 0
            r1 = 0
        L_0x07e4:
            if (r1 >= r4) goto L_0x080e
            r15 = r10[r1]
            java.lang.String r0 = "SELECT count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? "
            r8.add(r0)
            r13.A02 = r15
            r0 = r16
            java.lang.String r0 = r6.A0C(r12, r13, r0)
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = " "
            r15.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r14, r15)
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x07e4
        L_0x0808:
            r0 = 0
            java.lang.String r14 = r6.A0B(r12, r4, r0)
            goto L_0x07d8
        L_0x080e:
            boolean r0 = X.AnonymousClass17F.A02(r12)
            if (r0 != 0) goto L_0x0895
            java.lang.String r0 = " UNION ALL "
            java.lang.String r4 = android.text.TextUtils.join(r0, r8)
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r1 = r5.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "matchterm"
            r3.A02(r0)
            X.0tq r0 = r6.A0D     // Catch:{ SQLiteDatabaseCorruptException -> 0x0888, SQLiteException -> 0x087e, 057 -> 0x0891, Exception -> 0x0878 }
            X.0tf r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0888, SQLiteException -> 0x087e, 057 -> 0x0891, Exception -> 0x0878 }
            X.0tg r0 = r8.A02     // Catch:{ all -> 0x0873 }
            android.database.Cursor r5 = r0.A07(r12, r4, r1)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "count"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x086e }
        L_0x0839:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x086e }
            if (r0 == 0) goto L_0x0862
            boolean r0 = X.AnonymousClass17F.A02(r12)     // Catch:{ all -> 0x086e }
            if (r0 == 0) goto L_0x084c
            r3.A02(r11)     // Catch:{ all -> 0x086e }
            r3.A01()     // Catch:{ all -> 0x086e }
            goto L_0x085a
        L_0x084c:
            int r1 = r5.getInt(r4)     // Catch:{ all -> 0x086e }
            if (r1 <= 0) goto L_0x0857
            r0 = r10[r9]     // Catch:{ all -> 0x086e }
            r7.put(r0, r1)     // Catch:{ all -> 0x086e }
        L_0x0857:
            int r9 = r9 + 1
            goto L_0x0839
        L_0x085a:
            r5.close()     // Catch:{ all -> 0x0873 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0888, SQLiteException -> 0x087e, 057 -> 0x0891, Exception -> 0x0878 }
            goto L_0x07a2
        L_0x0862:
            java.lang.String r0 = "counted"
            r3.A02(r0)     // Catch:{ all -> 0x086e }
            r5.close()     // Catch:{ all -> 0x0873 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0888, SQLiteException -> 0x087e, 057 -> 0x0891, Exception -> 0x0878 }
            goto L_0x0891
        L_0x086e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0872 }
        L_0x0872:
            throw r0     // Catch:{ all -> 0x0873 }
        L_0x0873:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0877 }
        L_0x0877:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0888, SQLiteException -> 0x087e, 057 -> 0x0891, Exception -> 0x0878 }
        L_0x0878:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 != 0) goto L_0x0891
            throw r1
        L_0x087e:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            goto L_0x079c
        L_0x0888:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r6.A0C
            r0.A02()
        L_0x0891:
            java.lang.String r0 = "complete"
            goto L_0x079c
        L_0x0895:
            r3.A02(r11)
            goto L_0x079f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape205S0100000_1_I0.apply(java.lang.Object):java.lang.Object");
    }
}
