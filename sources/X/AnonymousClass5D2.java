package X;

import kotlin.jvm.internal.IDxLambdaShape59S0000000_2_I1;

/* renamed from: X.5D2  reason: invalid class name */
public final class AnonymousClass5D2 extends AnonymousClass1UE implements C109135Qv, AnonymousClass1UH {
    public final AnonymousClass1UM collectContext;
    public final int collectContextSize;
    public final C109135Qv collector;
    public AnonymousClass1UG completion;
    public AnonymousClass1UM lastEmissionContext;

    public AnonymousClass5D2(AnonymousClass1UM r4, C109135Qv r5) {
        super(new C1051258h(), C1052258r.A00);
        this.collector = r5;
        this.collectContext = r4;
        this.collectContextSize = AnonymousClass000.A0D(r4.fold(C13680ns.A0X(), new IDxLambdaShape59S0000000_2_I1(4)));
    }

    public StackTraceElement A00() {
        return null;
    }

    public Object A04(Object obj) {
        Throwable A00 = C41201vP.A00(obj);
        if (A00 != null) {
            AnonymousClass1UM r1 = this.lastEmissionContext;
            if (r1 == null) {
                r1 = C1052258r.A00;
            }
            this.lastEmissionContext = new C1052058p(r1, A00);
        }
        AnonymousClass1UG r0 = this.completion;
        if (r0 != null) {
            r0.Acd(obj);
        }
        return AnonymousClass41O.COROUTINE_SUSPENDED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a5, code lost:
        r7 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A8L(java.lang.Object r21, X.AnonymousClass1UG r22) {
        /*
            r20 = this;
            r3 = r20
            r4 = r22
            X.1UM r5 = r4.AAx()     // Catch:{ all -> 0x01c4 }
            X.C06300Ve.A01(r5)     // Catch:{ all -> 0x01c4 }
            X.1UM r2 = r3.lastEmissionContext     // Catch:{ all -> 0x01c4 }
            r6 = r21
            if (r2 == r5) goto L_0x018e
            boolean r0 = r2 instanceof X.C1052058p     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0177
            X.58p r2 = (X.C1052058p) r2     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.Throwable r0 = r2.A00     // Catch:{ all -> 0x01c4 }
            r1.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = ", but then emission attempt of value '"
            r1.append(r0)     // Catch:{ all -> 0x01c4 }
            r1.append(r6)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            java.lang.String r6 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01c4 }
            r10 = 0
            X.C18450wi.A0H(r6, r10)     // Catch:{ all -> 0x01c4 }
            java.lang.String r15 = ""
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "\r\n"
            r2[r10] = r0     // Catch:{ all -> 0x01c4 }
            r0 = 1
            java.lang.String r14 = "\n"
            r2[r0] = r14     // Catch:{ all -> 0x01c4 }
            r1 = 2
            java.lang.String r0 = "\r"
            r2[r1] = r0     // Catch:{ all -> 0x01c4 }
            X.22G r0 = X.C008603x.A0B(r6, r2)     // Catch:{ all -> 0x01c4 }
            java.util.List r0 = X.C11490ir.A02(r0)     // Catch:{ all -> 0x01c4 }
            java.util.List r13 = X.AnonymousClass1JA.A0Q(r0)     // Catch:{ all -> 0x01c4 }
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x005b:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01c4 }
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c4 }
            boolean r0 = X.C008703y.A0L(r0)     // Catch:{ all -> 0x01c4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005b
            r5.add(r1)     // Catch:{ all -> 0x01c4 }
            goto L_0x005b
        L_0x0074:
            java.util.ArrayList r11 = X.AnonymousClass1J9.A0N(r5)     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r12 = r5.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x007c:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r9 = X.AnonymousClass000.A0m(r12)     // Catch:{ all -> 0x01c4 }
            int r8 = r9.length()     // Catch:{ all -> 0x01c4 }
            r7 = 0
        L_0x008b:
            r5 = -1
            if (r7 >= r8) goto L_0x00a5
            int r2 = r7 + 1
            char r1 = r9.charAt(r7)     // Catch:{ all -> 0x01c4 }
            boolean r0 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x00a1
            boolean r0 = java.lang.Character.isSpaceChar(r1)     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = r2
            goto L_0x008b
        L_0x00a3:
            if (r7 != r5) goto L_0x00a6
        L_0x00a5:
            r7 = r8
        L_0x00a6:
            X.C13690nt.A1O(r11, r7)     // Catch:{ all -> 0x01c4 }
            goto L_0x007c
        L_0x00aa:
            java.util.Iterator r5 = r11.iterator()     // Catch:{ all -> 0x01c4 }
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x00b6
            r2 = 0
            goto L_0x00d0
        L_0x00b6:
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x01c4 }
            java.lang.Comparable r2 = (java.lang.Comparable) r2     // Catch:{ all -> 0x01c4 }
        L_0x00bc:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x01c4 }
            java.lang.Comparable r1 = (java.lang.Comparable) r1     // Catch:{ all -> 0x01c4 }
            int r0 = r2.compareTo(r1)     // Catch:{ all -> 0x01c4 }
            if (r0 <= 0) goto L_0x00bc
            r2 = r1
            goto L_0x00bc
        L_0x00d0:
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x01c4 }
            r1 = 0
            if (r2 != 0) goto L_0x00d7
            r8 = 0
            goto L_0x00db
        L_0x00d7:
            int r8 = r2.intValue()     // Catch:{ all -> 0x01c4 }
        L_0x00db:
            int r12 = r6.length()     // Catch:{ all -> 0x01c4 }
            int r2 = r15.length()     // Catch:{ all -> 0x01c4 }
            int r0 = r13.size()     // Catch:{ all -> 0x01c4 }
            int r0 = r0 * r2
            int r12 = r12 + r0
            if (r2 != 0) goto L_0x0142
            r0 = 7
            kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1 r9 = new kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1     // Catch:{ all -> 0x01c4 }
            r9.<init>(r0)     // Catch:{ all -> 0x01c4 }
        L_0x00f1:
            int r0 = r13.size()     // Catch:{ all -> 0x01c4 }
            int r7 = r0 + -1
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r11 = r13.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x00ff:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x015c
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x01c4 }
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0116
            X.AnonymousClass1JA.A0T()     // Catch:{ all -> 0x01c4 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ all -> 0x01c4 }
            goto L_0x01c3
        L_0x0116:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01c4 }
            if (r1 == 0) goto L_0x011c
            if (r1 != r7) goto L_0x0123
        L_0x011c:
            boolean r0 = X.C008703y.A0L(r5)     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0123
            goto L_0x0140
        L_0x0123:
            r1 = r8
            X.C18450wi.A0H(r5, r10)     // Catch:{ all -> 0x01c4 }
            if (r8 < 0) goto L_0x0148
            int r0 = r5.length()     // Catch:{ all -> 0x01c4 }
            if (r8 <= r0) goto L_0x0130
            r1 = r0
        L_0x0130:
            java.lang.String r0 = r5.substring(r1)     // Catch:{ all -> 0x01c4 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r9.AIU(r0)     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0140
            r6.add(r0)     // Catch:{ all -> 0x01c4 }
        L_0x0140:
            r1 = r2
            goto L_0x00ff
        L_0x0142:
            X.5FT r9 = new X.5FT     // Catch:{ all -> 0x01c4 }
            r9.<init>()     // Catch:{ all -> 0x01c4 }
            goto L_0x00f1
        L_0x0148:
            java.lang.String r0 = "Requested character count "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x01c4 }
            r1.append(r8)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = " is less than zero."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01c4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c3
        L_0x015c:
            java.lang.StringBuilder r13 = X.C13690nt.A0g(r12)     // Catch:{ all -> 0x01c4 }
            r19 = -1
            java.lang.String r17 = "..."
            r16 = r15
            r18 = r6
            X.C003101j.A0G(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x01c4 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c3
        L_0x0177:
            java.lang.Integer r1 = X.C13680ns.A0X()     // Catch:{ all -> 0x01c4 }
            X.5Fx r0 = new X.5Fx     // Catch:{ all -> 0x01c4 }
            r0.<init>(r3)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r5.fold(r1, r0)     // Catch:{ all -> 0x01c4 }
            int r1 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x01c4 }
            int r0 = r3.collectContextSize     // Catch:{ all -> 0x01c4 }
            if (r1 != r0) goto L_0x01a6
            r3.lastEmissionContext = r5     // Catch:{ all -> 0x01c4 }
        L_0x018e:
            r3.completion = r4     // Catch:{ all -> 0x01c4 }
            X.5Qv r0 = r3.collector     // Catch:{ all -> 0x01c4 }
            java.lang.Object r2 = r0.A8L(r6, r3)     // Catch:{ all -> 0x01c4 }
            X.41O r1 = X.AnonymousClass41O.COROUTINE_SUSPENDED     // Catch:{ all -> 0x01c4 }
            boolean r0 = X.C18450wi.A0R(r2, r1)     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01a1
            r0 = 0
            r3.completion = r0     // Catch:{ all -> 0x01c4 }
        L_0x01a1:
            if (r2 == r1) goto L_0x01a5
            X.22M r2 = X.AnonymousClass22M.A00
        L_0x01a5:
            return r2
        L_0x01a6:
            java.lang.String r0 = "Flow invariant is violated:\n\t\tFlow was collected in "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x01c4 }
            X.1UM r0 = r3.collectContext     // Catch:{ all -> 0x01c4 }
            r1.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = ",\n\t\tbut emission happened in "
            r1.append(r0)     // Catch:{ all -> 0x01c4 }
            r1.append(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01c4 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x01c4 }
        L_0x01c3:
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r2 = move-exception
            X.1UM r1 = r4.AAx()
            X.58p r0 = new X.58p
            r0.<init>(r1, r2)
            r3.lastEmissionContext = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5D2.A8L(java.lang.Object, X.1UG):java.lang.Object");
    }

    public AnonymousClass1UH AAO() {
        AnonymousClass1UG r1 = this.completion;
        if (r1 instanceof AnonymousClass1UH) {
            return (AnonymousClass1UH) r1;
        }
        return null;
    }

    public AnonymousClass1UM AAx() {
        AnonymousClass1UM r0 = this.lastEmissionContext;
        return r0 == null ? C1052258r.A00 : r0;
    }
}
