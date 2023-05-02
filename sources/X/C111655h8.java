package X;

/* renamed from: X.5h8  reason: invalid class name and case insensitive filesystem */
public class C111655h8 extends C25251Jb {
    public final C117695tP A00;

    public C111655h8(C117695tP r4) {
        super("wa.action.novi.EncryptLogEventV2", "bk.action.waffle.HasPaymentAccount", "bk.action.waffle.StartPaymentOnboarding", "bk.action.waffle.DeletePaymentAccount", "bk.action.waffle.EligibleToShowPaymentsRow", "bk.action.waffle.ShowPaymentSettings", "wa.action.GetPaymentErrorMap");
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r1.equals("bk.action.waffle.HasPaymentAccount") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        switch(r1) {
            case 1: goto L_0x013f;
            case 2: goto L_0x008c;
            case 3: goto L_0x00ca;
            default: goto L_0x003f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r4 = r4.A00;
        r2 = ((X.C31411e8) r4.get(0)).A00;
        r5 = ((X.C31411e8) r4.get(1)).A00;
        r3 = r3.A00;
        r4 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0(r2, 0);
        r2 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0(r5, 2);
        r5 = X.AnonymousClass1K6.A00(r8);
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/deletePaymentAccount");
        r1 = new X.AnonymousClass60P(r2, r4, r3, r8);
        r6 = r3.A00;
        r15 = r3.A0C;
        r14 = r3.A0A;
        r13 = r3.A09;
        new X.AnonymousClass5vZ(r5, r6, r3.A01, r3.A02, r3.A04, r3.A05, r3.A06, r3.A08, r13, r14, r15).A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r1 = r3.A00;
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/hasPaymentAccount");
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        if (r0 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r0 = r0.A03().AHc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c6, code lost:
        if (r1.A0B.A05("BR") == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r2 = ((X.C31411e8) r4.A00.get(0)).A00;
        r7 = r3.A00;
        r6 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0(r2, 1);
        r2 = X.AnonymousClass1K6.A00(r8);
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/startPaymentOnboarding");
        r3 = r7.A09.A03().A9h(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f0, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f2, code lost:
        r5 = (X.C14530pL) r2;
        r5.A30(new com.facebook.redex.IDxEListenerShape16S0400000_3_I0(r5, r6, r7, r8, 0));
        r1 = 1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        r2 = ((X.C31411e8) r4.A00.get(0)).A00;
        r7 = r3.A00;
        r6 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0(r2, 3);
        r2 = X.AnonymousClass1K6.A00(r8);
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/showPaymentSettings");
        r3 = X.C110105dW.A04(r2, r7.A09.A03().AEX());
        r5 = (X.C14530pL) r2;
        r5.A30(new com.facebook.redex.IDxEListenerShape16S0400000_3_I0(r5, r6, r7, r8, 1));
        r1 = 1002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0177, code lost:
        r2.startActivityForResult(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A8l(X.C14950q3 r17, X.C99354tt r18, X.C14970q5 r19) {
        /*
            r16 = this;
            r8 = r19
            X.0q4 r8 = (X.C14960q4) r8
            r0 = r18
            java.lang.String r1 = r0.A00
            int r0 = r1.hashCode()
            r3 = r16
            r4 = r17
            switch(r0) {
                case -1136739112: goto L_0x0101;
                case -854340780: goto L_0x0032;
                case 1643238473: goto L_0x0029;
                case 1711378359: goto L_0x001f;
                case 1819198730: goto L_0x0015;
                case 1970461926: goto L_0x00a4;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        L_0x0015:
            java.lang.String r0 = "bk.action.waffle.DeletePaymentAccount"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = 4
            goto L_0x003b
        L_0x001f:
            java.lang.String r0 = "bk.action.waffle.StartPaymentOnboarding"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = 3
            goto L_0x003b
        L_0x0029:
            java.lang.String r0 = "bk.action.waffle.HasPaymentAccount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008c
            goto L_0x0013
        L_0x0032:
            java.lang.String r0 = "bk.action.waffle.ShowPaymentSettings"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = 1
        L_0x003b:
            r0 = 0
            switch(r1) {
                case 1: goto L_0x013f;
                case 2: goto L_0x008c;
                case 3: goto L_0x00ca;
                default: goto L_0x003f;
            }
        L_0x003f:
            r1 = 0
            java.util.List r4 = r4.A00
            java.lang.Object r1 = r4.get(r1)
            X.1e8 r1 = (X.C31411e8) r1
            X.1e9 r2 = r1.A00
            r1 = 1
            java.lang.Object r1 = r4.get(r1)
            X.1e8 r1 = (X.C31411e8) r1
            X.1e9 r5 = r1.A00
            X.5tP r3 = r3.A00
            r1 = 0
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r4 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r4.<init>(r2, r1)
            r1 = 2
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r2 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r2.<init>(r5, r1)
            android.app.Activity r5 = X.AnonymousClass1K6.A00(r8)
            java.lang.String r1 = "WaBkPaymentsInterpreterExtImpl/deletePaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.60P r1 = new X.60P
            r1.<init>(r2, r4, r3, r8)
            X.0pt r6 = r3.A00
            X.0sq r15 = r3.A0C
            X.0wR r14 = r3.A0A
            X.0wS r13 = r3.A09
            X.0t6 r8 = r3.A02
            X.0wT r10 = r3.A05
            X.0wU r11 = r3.A06
            X.0wV r12 = r3.A08
            X.0wP r7 = r3.A01
            X.0wX r9 = r3.A04
            X.5vZ r4 = new X.5vZ
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4.A00(r1)
            return r0
        L_0x008c:
            X.5tP r1 = r3.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/hasPaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wS r0 = r1.A09
            if (r0 == 0) goto L_0x00c8
            X.19r r0 = r0.A03()
            boolean r0 = r0.AHc()
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00a4:
            java.lang.String r0 = "bk.action.waffle.EligibleToShowPaymentsRow"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            X.5tP r1 = r3.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/isEligibleToShowPaymentsRow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0w8 r0 = r1.A07
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00c8
            X.0wF r1 = r1.A0B
            java.lang.String r0 = "BR"
            boolean r1 = r1.A05(r0)
            r0 = 1
            if (r1 != 0) goto L_0x009f
        L_0x00c8:
            r0 = 0
            goto L_0x009f
        L_0x00ca:
            r2 = 0
            java.util.List r1 = r4.A00
            java.lang.Object r1 = r1.get(r2)
            X.1e8 r1 = (X.C31411e8) r1
            X.1e9 r2 = r1.A00
            X.5tP r7 = r3.A00
            r1 = 1
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r6 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r6.<init>(r2, r1)
            android.app.Activity r2 = X.AnonymousClass1K6.A00(r8)
            java.lang.String r1 = "WaBkPaymentsInterpreterExtImpl/startPaymentOnboarding"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0wS r1 = r7.A09
            X.19r r1 = r1.A03()
            android.content.Intent r3 = r1.A9h(r2)
            if (r3 == 0) goto L_0x0014
            r5 = r2
            X.0pL r5 = (X.C14530pL) r5
            r9 = 0
            com.facebook.redex.IDxEListenerShape16S0400000_3_I0 r4 = new com.facebook.redex.IDxEListenerShape16S0400000_3_I0
            r4.<init>(r5, r6, r7, r8, r9)
            r5.A30(r4)
            r1 = 1001(0x3e9, float:1.403E-42)
            goto L_0x0177
        L_0x0101:
            java.lang.String r0 = "wa.action.GetPaymentErrorMap"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = 0
            java.util.List r0 = r4.A00
            java.lang.Object r2 = r0.get(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            X.5tP r1 = r3.A00
            java.util.HashMap r0 = X.AnonymousClass000.A0x()
            r5 = 0
            java.lang.String r4 = "error_message"
            if (r2 == 0) goto L_0x013b
            X.61t r3 = r1.A03
            int r1 = r2.intValue()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            if (r2 == 0) goto L_0x013b
            boolean r1 = r3.A02()
            if (r1 == 0) goto L_0x013b
            java.util.HashMap r1 = r3.A00
            java.lang.Object r1 = r1.get(r2)
            X.5sJ r1 = (X.C117015sJ) r1
            if (r1 == 0) goto L_0x013b
            java.lang.String r5 = r1.A00
        L_0x013b:
            r0.put(r4, r5)
            return r0
        L_0x013f:
            r2 = 0
            java.util.List r1 = r4.A00
            java.lang.Object r1 = r1.get(r2)
            X.1e8 r1 = (X.C31411e8) r1
            X.1e9 r2 = r1.A00
            X.5tP r7 = r3.A00
            r1 = 3
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r6 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r6.<init>(r2, r1)
            android.app.Activity r2 = X.AnonymousClass1K6.A00(r8)
            java.lang.String r1 = "WaBkPaymentsInterpreterExtImpl/showPaymentSettings"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0wS r1 = r7.A09
            X.19r r1 = r1.A03()
            java.lang.Class r1 = r1.AEX()
            android.content.Intent r3 = X.C110105dW.A04(r2, r1)
            r5 = r2
            X.0pL r5 = (X.C14530pL) r5
            r9 = 1
            com.facebook.redex.IDxEListenerShape16S0400000_3_I0 r4 = new com.facebook.redex.IDxEListenerShape16S0400000_3_I0
            r4.<init>(r5, r6, r7, r8, r9)
            r5.A30(r4)
            r1 = 1002(0x3ea, float:1.404E-42)
        L_0x0177:
            r2.startActivityForResult(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111655h8.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
