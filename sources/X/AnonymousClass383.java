package X;

import java.util.AbstractCollection;

/* renamed from: X.383  reason: invalid class name */
public final class AnonymousClass383 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.4CM} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4CO A00(X.C109615Sw r14) {
        /*
            X.4CO r10 = new X.4CO
            r10.<init>()
            X.424 r0 = r14.AaO()
            X.424 r9 = X.AnonymousClass424.START_OBJECT
            if (r0 == r9) goto L_0x0012
            r14.Afy()
            r0 = 0
            return r0
        L_0x0012:
            X.424 r0 = r14.ALo()
            X.424 r8 = X.AnonymousClass424.END_OBJECT
            if (r0 == r8) goto L_0x03f1
            java.lang.String r3 = r14.AaN()
            int r2 = X.C807145e.A00(r3)
            r1 = 32
            r0 = 0
            if (r2 < r1) goto L_0x0028
            r0 = 1
        L_0x0028:
            r14.ALo()
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "layout"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0046
            X.4CN r7 = new X.4CN
            r7.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x004a
            r14.Afy()
            r7 = 0
        L_0x0044:
            r10.A00 = r7
        L_0x0046:
            r14.Afy()
            goto L_0x0012
        L_0x004a:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x0044
            java.lang.String r1 = r14.AaN()
            boolean r0 = A03(r1)
            r14.ALo()
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "bloks_payload"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            X.4Oj r6 = new X.4Oj
            r6.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x007a
            r14.Afy()
            r6 = 0
        L_0x0074:
            r7.A00 = r6
        L_0x0076:
            r14.Afy()
            goto L_0x004a
        L_0x007a:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x0074
            java.lang.String r1 = r14.AaN()
            boolean r0 = A03(r1)
            r14.ALo()
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "action"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a3
            X.5Sx r0 = r14.AaP()
            X.0q1 r0 = X.C87574Xm.A00(r0)
            r6.A02 = r0
        L_0x009f:
            r14.Afy()
            goto L_0x007a
        L_0x00a3:
            java.lang.String r0 = "tree"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = X.C611837x.A00(r14)
            X.1dg r0 = (X.C31201dg) r0
            r6.A00 = r0
            goto L_0x009f
        L_0x00b5:
            java.lang.String r3 = "data"
            boolean r0 = r3.equals(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0147
            X.424 r1 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            if (r1 != r0) goto L_0x0143
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x00ca:
            X.424 r1 = r14.ALo()
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            if (r1 == r0) goto L_0x0143
            X.229 r4 = new X.229
            r4.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x00e1
            r14.Afy()
            goto L_0x00ca
        L_0x00e1:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x013f
            java.lang.String r2 = r14.AaN()
            boolean r0 = A03(r2)
            r14.ALo()
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "id"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L_0x0106
            java.lang.String r0 = A01(r14)
            r4.A00 = r0
        L_0x0102:
            r14.Afy()
            goto L_0x00e1
        L_0x0106:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = A01(r14)
            r4.A01 = r0
            goto L_0x0102
        L_0x0116:
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x0102
            X.424 r0 = r14.AaO()
            if (r0 != r9) goto L_0x013b
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
        L_0x0126:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x013c
            java.lang.String r1 = r14.AaN()
            r14.ALo()
            java.lang.Object r0 = X.AnonymousClass3A0.A00(r14)
            r2.put(r1, r0)
            goto L_0x0126
        L_0x013b:
            r2 = 0
        L_0x013c:
            r4.A02 = r2
            goto L_0x0102
        L_0x013f:
            r5.add(r4)
            goto L_0x00ca
        L_0x0143:
            r6.A04 = r5
            goto L_0x009f
        L_0x0147:
            java.lang.String r0 = "embedded_payloads"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01be
            X.424 r1 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            if (r1 != r0) goto L_0x01ba
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x015b:
            X.424 r1 = r14.ALo()
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            if (r1 == r0) goto L_0x01ba
            X.4Za r1 = new X.4Za
            r1.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x0172
            r14.Afy()
            goto L_0x015b
        L_0x0172:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x01b6
            java.lang.String r2 = r14.AaN()
            boolean r0 = A03(r2)
            r14.ALo()
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01a7
            X.5Sx r0 = r14.AaP()
            boolean r0 = r0.AJJ()
            if (r0 == 0) goto L_0x019e
            r0 = 0
        L_0x0198:
            r1.A01 = r0
        L_0x019a:
            r14.Afy()
            goto L_0x0172
        L_0x019e:
            X.5Sx r0 = r14.AaP()
            java.lang.String r0 = r0.AgS()
            goto L_0x0198
        L_0x01a7:
            java.lang.String r0 = "payload"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x019a
            X.4CO r0 = A00(r14)
            r1.A00 = r0
            goto L_0x019a
        L_0x01b6:
            r5.add(r1)
            goto L_0x015b
        L_0x01ba:
            r6.A05 = r5
            goto L_0x009f
        L_0x01be:
            java.lang.String r0 = "referenced"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01e2
            X.424 r1 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            if (r1 != r0) goto L_0x01de
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x01d2:
            X.424 r1 = r14.ALo()
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            if (r1 == r0) goto L_0x01de
            A02(r14, r5)
            goto L_0x01d2
        L_0x01de:
            r6.A09 = r5
            goto L_0x009f
        L_0x01e2:
            java.lang.String r0 = "referenced_external"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0206
            X.424 r1 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            if (r1 != r0) goto L_0x0202
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x01f6:
            X.424 r1 = r14.ALo()
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            if (r1 == r0) goto L_0x0202
            A02(r14, r5)
            goto L_0x01f6
        L_0x0202:
            r6.A08 = r5
            goto L_0x009f
        L_0x0206:
            java.lang.String r0 = "referenced_embedded_payloads"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x022a
            X.424 r1 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            if (r1 != r0) goto L_0x0226
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x021a:
            X.424 r1 = r14.ALo()
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            if (r1 == r0) goto L_0x0226
            A02(r14, r5)
            goto L_0x021a
        L_0x0226:
            r6.A07 = r5
            goto L_0x009f
        L_0x022a:
            java.lang.String r0 = "props"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0291
            X.424 r1 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            if (r1 != r0) goto L_0x028d
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x023e:
            X.424 r1 = r14.ALo()
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            if (r1 == r0) goto L_0x028d
            X.4ZZ r2 = new X.4ZZ
            r2.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x0255
            r14.Afy()
            goto L_0x023e
        L_0x0255:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x0289
            java.lang.String r3 = r14.AaN()
            boolean r0 = A03(r3)
            r14.ALo()
            if (r0 != 0) goto L_0x0276
            java.lang.String r0 = "id"
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = A01(r14)
            r2.A00 = r0
        L_0x0276:
            r14.Afy()
            goto L_0x0255
        L_0x027a:
            java.lang.String r0 = "name"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = A01(r14)
            r2.A01 = r0
            goto L_0x0276
        L_0x0289:
            r5.add(r2)
            goto L_0x023e
        L_0x028d:
            r6.A06 = r5
            goto L_0x009f
        L_0x0291:
            java.lang.String r0 = "error_attribution"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02e2
            X.4CM r2 = new X.4CM
            r2.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x02ab
            r14.Afy()
        L_0x02a7:
            r6.A01 = r5
            goto L_0x009f
        L_0x02ab:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x02e0
            java.lang.String r1 = r14.AaN()
            boolean r0 = A03(r1)
            r14.ALo()
            if (r0 != 0) goto L_0x02d3
            java.lang.String r0 = "logging_id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02d3
            X.5Sx r0 = r14.AaP()
            boolean r0 = r0.AJJ()
            if (r0 == 0) goto L_0x02d7
            r0 = 0
        L_0x02d1:
            r2.A00 = r0
        L_0x02d3:
            r14.Afy()
            goto L_0x02ab
        L_0x02d7:
            X.5Sx r0 = r14.AaP()
            java.lang.String r0 = r0.AgS()
            goto L_0x02d1
        L_0x02e0:
            r5 = r2
            goto L_0x02a7
        L_0x02e2:
            java.lang.String r0 = "component_queries"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            X.424 r0 = r14.AaO()
            X.424 r4 = X.AnonymousClass424.START_ARRAY
            if (r0 != r4) goto L_0x03ed
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x02f6:
            X.424 r0 = r14.ALo()
            X.424 r3 = X.AnonymousClass424.END_ARRAY
            if (r0 == r3) goto L_0x03ed
            X.4O5 r2 = new X.4O5
            r2.<init>()
            X.424 r0 = r14.AaO()
            if (r0 == r9) goto L_0x030d
            r14.Afy()
            goto L_0x02f6
        L_0x030d:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x03e8
            java.lang.String r1 = r14.AaN()
            boolean r0 = A03(r1)
            r14.ALo()
            if (r0 != 0) goto L_0x032f
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            r12 = 0
            if (r0 == 0) goto L_0x0333
            java.lang.String r0 = A01(r14)
            r2.A04 = r0
        L_0x032f:
            r14.Afy()
            goto L_0x030d
        L_0x0333:
            java.lang.String r0 = "app_id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0342
            java.lang.String r0 = A01(r14)
            r2.A03 = r0
            goto L_0x032f
        L_0x0342:
            java.lang.String r0 = "params"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0355
            X.5Sx r0 = r14.AaP()
            X.0q1 r0 = X.C87574Xm.A00(r0)
            r2.A01 = r0
            goto L_0x032f
        L_0x0355:
            java.lang.String r0 = "client_params"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0368
            X.5Sx r0 = r14.AaP()
            X.0q1 r0 = X.C87574Xm.A00(r0)
            r2.A00 = r0
            goto L_0x032f
        L_0x0368:
            java.lang.String r0 = "deps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0387
            X.424 r0 = r14.AaO()
            if (r0 != r4) goto L_0x0384
            java.util.HashSet r12 = X.C13680ns.A0o()
        L_0x037a:
            X.424 r0 = r14.ALo()
            if (r0 == r3) goto L_0x0384
            A02(r14, r12)
            goto L_0x037a
        L_0x0384:
            r2.A06 = r12
            goto L_0x032f
        L_0x0387:
            java.lang.String r0 = "targets"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03d0
            X.424 r0 = r14.AaO()
            if (r0 != r9) goto L_0x03cc
            java.util.HashMap r11 = X.AnonymousClass000.A0x()
        L_0x039a:
            X.424 r0 = r14.ALo()
            if (r0 == r8) goto L_0x03cb
            java.lang.String r1 = r14.AaN()
            r14.ALo()
            X.424 r13 = r14.AaO()
            X.424 r0 = X.AnonymousClass424.NULL
            if (r13 != r0) goto L_0x03b3
            r11.put(r1, r12)
            goto L_0x039a
        L_0x03b3:
            X.5Sx r0 = r14.AaP()
            boolean r0 = r0.AJJ()
            if (r0 != 0) goto L_0x039a
            X.5Sx r0 = r14.AaP()
            java.lang.String r0 = r0.AgS()
            if (r0 == 0) goto L_0x039a
            r11.put(r1, r0)
            goto L_0x039a
        L_0x03cb:
            r12 = r11
        L_0x03cc:
            r2.A05 = r12
            goto L_0x032f
        L_0x03d0:
            java.lang.String r0 = "cache_ttl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x032f
            X.5Sx r0 = r14.AaP()
            long r0 = r0.AKa()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            goto L_0x032f
        L_0x03e8:
            r5.add(r2)
            goto L_0x02f6
        L_0x03ed:
            r6.A03 = r5
            goto L_0x009f
        L_0x03f1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass383.A00(X.5Sw):X.4CO");
    }

    public static String A01(C109615Sw r2) {
        if (r2.AaP().AJJ()) {
            return null;
        }
        return r2.AaP().AgS();
    }

    public static void A02(C109615Sw r1, AbstractCollection abstractCollection) {
        String AgS;
        if (!r1.AaP().AJJ() && (AgS = r1.AaP().AgS()) != null) {
            abstractCollection.add(AgS);
        }
    }

    public static boolean A03(String str) {
        return C807145e.A00(str) >= 32;
    }
}
