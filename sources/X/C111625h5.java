package X;

/* renamed from: X.5h5  reason: invalid class name and case insensitive filesystem */
public class C111625h5 extends C25251Jb {
    public final AnonymousClass1K0 A00;

    public C111625h5(AnonymousClass1K0 r4) {
        super("wa.action.phoenix.FcsReturnResult", "wa.action.phoenix.FcsReturnResultV2", "wa.action.phoenix.FdsIq", "wa.action.phoenix.FdsIqV2", "wa.action.phoenix.statemachine.GoBack", "wa.action.phoenix.statemachine.GoBackV2");
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        if ((r1 instanceof X.AnonymousClass1IX) != false) goto L_0x0163;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A8l(X.C14950q3 r12, X.C99354tt r13, X.C14970q5 r14) {
        /*
            r11 = this;
            X.0q4 r14 = (X.C14960q4) r14
            java.lang.String r1 = r13.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -1883695124: goto L_0x000d;
                case -579883706: goto L_0x0011;
                case -574422768: goto L_0x0089;
                case 775692624: goto L_0x00c2;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 0
            return r0
        L_0x000d:
            java.lang.String r0 = "wa.action.phoenix.FcsReturnResultV2"
            goto L_0x00c4
        L_0x0011:
            java.lang.String r0 = "wa.action.phoenix.FdsIqV2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            java.util.List r2 = r12.A00
            java.lang.String r6 = X.AnonymousClass000.A0n(r2, r0)
            r0 = 1
            java.lang.String r1 = X.AnonymousClass000.A0n(r2, r0)
            r0 = 2
            java.lang.String r5 = X.AnonymousClass000.A0n(r2, r0)
            r0 = 3
            java.util.Map r4 = X.C110115dX.A0j(r2, r0)
            X.1K0 r10 = r11.A00
            X.5zv r3 = new X.5zv
            r3.<init>(r14, r12, r11)
            r9 = 0
            X.C18450wi.A0H(r6, r9)
            r0 = 1
            X.C18450wi.A0H(r1, r0)
            r8 = 0
            X.418 r7 = X.AnonymousClass418.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0081 }
            X.0vk r1 = r10.A00
            if (r4 == 0) goto L_0x0183
            java.lang.String r0 = "job_id"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = (java.lang.String) r0
            X.0vu r2 = r1.A00(r0)
            if (r2 != 0) goto L_0x005f
            java.util.Map r0 = X.C61893Av.A01(r8, r8, r8)
            r3.AQx(r0)
            goto L_0x000b
        L_0x005f:
            X.1VZ r0 = r2.A00
            if (r0 == 0) goto L_0x0073
            X.0zd r1 = r10.A01
            java.lang.String r0 = r0.A0M
            X.2dh r8 = r1.A02(r0)
            X.62n r0 = new X.62n
            r0.<init>(r9)
            r8.A01(r0)
        L_0x0073:
            X.4W4 r1 = new X.4W4
            r1.<init>(r4, r6, r5)
            X.61m r0 = new X.61m
            r0.<init>(r3, r2, r8)
            r2.A05(r0, r7, r1)
            goto L_0x000b
        L_0x0081:
            java.util.Map r0 = X.C61893Av.A01(r8, r8, r8)
            r3.AQx(r0)
            goto L_0x000b
        L_0x0089:
            java.lang.String r0 = "wa.action.phoenix.statemachine.GoBackV2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            r1 = 0
            java.util.List r0 = r12.A00
            java.lang.String r4 = X.AnonymousClass000.A0n(r0, r1)
            r2 = 1
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r2)
            X.1K0 r0 = r11.A00
            X.C18450wi.A0H(r1, r2)
            X.0vk r0 = r0.A00
            X.0vu r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x000b
            X.1VZ r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            X.0zd r1 = r0.A0I
            java.lang.String r0 = r0.A0M
            X.2dh r3 = r1.A02(r0)
            r2 = 0
            r1 = 0
            X.62u r0 = new X.62u
            r0.<init>(r4, r1, r2)
            r3.A01(r0)
            goto L_0x000b
        L_0x00c2:
            java.lang.String r0 = "wa.action.phoenix.FcsReturnResult"
        L_0x00c4:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            java.util.List r1 = r12.A00
            java.util.Map r3 = X.C110115dX.A0j(r1, r0)
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            X.1e9 r5 = X.C31411e8.A01(r0)
            r0 = 2
            java.lang.Object r0 = r1.get(r0)
            X.1e9 r4 = X.C31411e8.A01(r0)
            r0 = 3
            java.lang.Object r0 = r1.get(r0)
            X.1e9 r2 = X.C31411e8.A01(r0)
            java.util.HashMap r6 = X.AnonymousClass000.A0x()
            if (r5 == 0) goto L_0x0179
            r0 = 4
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r1 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r1.<init>(r5, r0)
        L_0x00f8:
            java.lang.String r0 = "onStartLoading"
            r6.put(r0, r1)
            if (r4 == 0) goto L_0x0177
            r0 = 4
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r1 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r1.<init>(r4, r0)
        L_0x0105:
            java.lang.String r0 = "onLoadingCompletion"
            r6.put(r0, r1)
            if (r2 == 0) goto L_0x0175
            r0 = 4
            com.facebook.redex.IDxEWrapperShape175S0100000_3_I0 r1 = new com.facebook.redex.IDxEWrapperShape175S0100000_3_I0
            r1.<init>(r2, r0)
        L_0x0112:
            java.lang.String r0 = "onLoadingFailure"
            r6.put(r0, r1)
            X.1K0 r5 = r11.A00
            android.app.Activity r2 = X.AnonymousClass1K6.A00(r14)
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            X.0vk r1 = r5.A00
            r4 = 0
            if (r3 == 0) goto L_0x0183
            java.lang.String r0 = "job_id"
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = (java.lang.String) r0
            X.0vu r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x000b
            boolean r0 = r2 instanceof X.C000900k
            if (r0 == 0) goto L_0x014a
            X.00l r2 = (X.C001000l) r2
            if (r2 == 0) goto L_0x014a
            X.02C r0 = r2.AGM()
            com.obwhatsapp.wabloks.base.BkFcsPreloadingScreenFragment r0 = r5.A00(r0)
            if (r0 == 0) goto L_0x014a
            r0.A04 = r6
        L_0x014a:
            X.1VZ r2 = r1.A00
            if (r2 != 0) goto L_0x0172
            r1 = r4
        L_0x014f:
            boolean r0 = r1 instanceof X.C77633w6
            if (r0 == 0) goto L_0x0170
            X.3w6 r1 = (X.C77633w6) r1
            java.lang.String r0 = r1.A02
            if (r2 == 0) goto L_0x0170
            X.1IC r1 = r2.A02(r0)
            if (r1 == 0) goto L_0x0170
            boolean r0 = r1 instanceof X.AnonymousClass1IX
            if (r0 == 0) goto L_0x0170
        L_0x0163:
            boolean r0 = r1 instanceof X.AnonymousClass1IE
            if (r0 == 0) goto L_0x017c
            X.1IE r1 = (X.AnonymousClass1IE) r1
            if (r1 == 0) goto L_0x017c
            r1.A93(r3)
            goto L_0x000b
        L_0x0170:
            r1 = r4
            goto L_0x0163
        L_0x0172:
            X.4Qy r1 = r2.A03
            goto L_0x014f
        L_0x0175:
            r1 = 0
            goto L_0x0112
        L_0x0177:
            r1 = 0
            goto L_0x0105
        L_0x0179:
            r1 = 0
            goto L_0x00f8
        L_0x017c:
            java.lang.String r0 = "WaBkPhoenixInterpreterExtImpl: current resource is not a Bloks resource"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000b
        L_0x0183:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111625h5.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
