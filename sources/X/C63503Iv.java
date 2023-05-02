package X;

/* renamed from: X.3Iv  reason: invalid class name and case insensitive filesystem */
public final class C63503Iv extends AnonymousClass1DR implements AnonymousClass1UJ {
    public final /* synthetic */ AnonymousClass2O4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63503Iv(AnonymousClass2O4 r2) {
        super(2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r1 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r1 = new java.lang.Object[]{r6};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        r3.A09(new X.AnonymousClass2VN(r1, r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r2 = new X.AnonymousClass2VN(new java.lang.Object[0], r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        r2 = new X.AnonymousClass2VN(new java.lang.Object[0], r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        r3.A09(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object AIV(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            X.5Mj r10 = (X.C108025Mj) r10
            int r2 = X.AnonymousClass000.A0D(r11)
            r4 = 0
            X.C18450wi.A0H(r10, r4)
            boolean r0 = r10 instanceof X.C102444yx
            if (r0 == 0) goto L_0x0096
            X.2O4 r7 = r9.this$0
            X.4yx r10 = (X.C102444yx) r10
            X.2BN r8 = r10.A00
            X.42o r1 = r8.A00
            X.42o r0 = X.C801042o.REQUESTER_ACCOUNT_DELETED
            if (r1 != r0) goto L_0x0093
            X.027 r0 = r7.A00
            java.util.List r1 = X.C13690nt.A0k(r0)
            if (r1 == 0) goto L_0x0027
            int r0 = r2 + -1
            r1.remove(r0)
        L_0x0027:
            X.1cy r0 = r7.A0B
        L_0x0029:
            X.C13680ns.A1P(r0, r2)
            X.027 r1 = r7.A02
            r0 = 0
            r1.A09(r0)
            X.0sH r1 = r8.A03
            if (r1 == 0) goto L_0x0048
            X.0sP r0 = r7.A04
            java.lang.String r6 = r0.A0A(r1)
            if (r6 == 0) goto L_0x0048
            X.42o r0 = r8.A00
            int r0 = r0.ordinal()
            r5 = 1
            switch(r0) {
                case 1: goto L_0x006d;
                case 2: goto L_0x007b;
                case 3: goto L_0x0061;
                case 4: goto L_0x0067;
                case 5: goto L_0x0073;
                default: goto L_0x0048;
            }
        L_0x0048:
            X.42N r1 = r8.A01
            X.42N r0 = X.AnonymousClass42N.A01
            if (r1 == r0) goto L_0x0052
            X.42N r0 = X.AnonymousClass42N.A03
            if (r1 != r0) goto L_0x005e
        L_0x0052:
            X.0sq r2 = r7.A0D
            r1 = 47
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r7, r1, r8)
            r2.Acl(r0)
        L_0x005e:
            X.22M r0 = X.AnonymousClass22M.A00
            return r0
        L_0x0061:
            X.1cy r3 = r7.A0A
            r2 = 2131888827(0x7f120abb, float:1.94123E38)
            goto L_0x0086
        L_0x0067:
            X.1cy r3 = r7.A0A
            r2 = 2131888832(0x7f120ac0, float:1.941231E38)
            goto L_0x0078
        L_0x006d:
            X.1cy r3 = r7.A0A
            r2 = 2131888840(0x7f120ac8, float:1.9412327E38)
            goto L_0x0086
        L_0x0073:
            X.1cy r3 = r7.A0A
            r2 = 2131888841(0x7f120ac9, float:1.9412329E38)
        L_0x0078:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            goto L_0x008a
        L_0x007b:
            X.2X8 r1 = r8.A02
            X.2X8 r0 = X.AnonymousClass2X8.APPROVE
            if (r1 != r0) goto L_0x0048
            X.1cy r3 = r7.A0A
            r2 = 2131888828(0x7f120abc, float:1.9412302E38)
        L_0x0086:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r6
        L_0x008a:
            X.2VN r0 = new X.2VN
            r0.<init>(r1, r2, r4)
            r3.A09(r0)
            goto L_0x0048
        L_0x0093:
            X.1cy r0 = r7.A0C
            goto L_0x0029
        L_0x0096:
            boolean r0 = r10 instanceof X.C102434yw
            if (r0 == 0) goto L_0x00de
            X.2O4 r2 = r9.this$0
            X.4yw r10 = (X.C102434yw) r10
            X.027 r1 = r2.A02
            r0 = 0
            r1.A09(r0)
            X.42i r0 = r10.A00
            int r0 = r0.ordinal()
            r5 = 1
            switch(r0) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00af;
                case 5: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x005e
        L_0x00af:
            X.1cy r3 = r2.A0A
            r1 = 2131888841(0x7f120ac9, float:1.9412329E38)
            goto L_0x00ba
        L_0x00b5:
            X.1cy r3 = r2.A0A
            r1 = 2131888842(0x7f120aca, float:1.941233E38)
        L_0x00ba:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.2VN r2 = new X.2VN
            r2.<init>(r0, r1, r4)
            goto L_0x00da
        L_0x00c2:
            X.1cy r3 = r2.A0A
            r1 = 2131888838(0x7f120ac6, float:1.9412323E38)
            goto L_0x00d3
        L_0x00c8:
            X.1cy r3 = r2.A0A
            r1 = 2131888837(0x7f120ac5, float:1.941232E38)
            goto L_0x00d3
        L_0x00ce:
            X.1cy r3 = r2.A0A
            r1 = 2131888839(0x7f120ac7, float:1.9412325E38)
        L_0x00d3:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.2VN r2 = new X.2VN
            r2.<init>(r0, r1, r5)
        L_0x00da:
            r3.A09(r2)
            goto L_0x005e
        L_0x00de:
            boolean r0 = r10 instanceof X.C102454yy
            if (r0 == 0) goto L_0x005e
            X.2O4 r2 = r9.this$0
            X.027 r1 = r2.A02
            r0 = 0
            r1.A09(r0)
            X.1cy r3 = r2.A0A
            r2 = 2131888841(0x7f120ac9, float:1.9412329E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.2VN r0 = new X.2VN
            r0.<init>(r1, r2, r4)
            r3.A09(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63503Iv.AIV(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
