package X;

/* renamed from: X.5wW  reason: invalid class name */
public class AnonymousClass5wW {
    public static final C17930vs A0E;
    public static final C17380uz A0F;
    public static final C17380uz A0G;
    public static final C17380uz A0H;
    public final C16080sP A00;
    public final AnonymousClass013 A01;
    public final C216114t A02;
    public final C221116r A03;
    public final C28411Vz A04;
    public final C1204661t A05;
    public final C18310wU A06;
    public final AnonymousClass174 A07;
    public final C18090w8 A08;
    public final C118805vH A09;
    public final AnonymousClass1Vo A0A;
    public final AnonymousClass5ko A0B;
    public final C116205qz A0C;
    public final C16320sq A0D;

    static {
        C18390wc r1 = new C18390wc();
        A00(r1, 404);
        A00(r1, 440);
        A00(r1, 442);
        A00(r1, 443);
        C17380uz build = r1.build();
        A0G = build;
        C18390wc r12 = new C18390wc();
        r12.addAll(build);
        r12.add((Object) 11502);
        r12.add((Object) 17010);
        A00(r12, 11455);
        A00(r12, 11466);
        A00(r12, 4002);
        A00(r12, 11481);
        A00(r12, 11478);
        A00(r12, 11480);
        A00(r12, 11465);
        A00(r12, 11479);
        A00(r12, 12750);
        A00(r12, 20951);
        C17380uz build2 = r12.build();
        A0H = build2;
        C18390wc r13 = new C18390wc();
        r13.addAll(build);
        r13.add((Object) 11502);
        r13.add((Object) 17010);
        A00(r13, 11503);
        A00(r13, 11495);
        C17380uz build3 = r13.build();
        A0F = build3;
        AnonymousClass1C5 r14 = new AnonymousClass1C5();
        r14.put("pay-precheck", build2);
        r14.put("upi-accept-collect", build3);
        A0E = r14.build();
    }

    public AnonymousClass5wW(C16080sP r2, AnonymousClass013 r3, C216114t r4, C221116r r5, C1204661t r6, C18310wU r7, AnonymousClass174 r8, C18090w8 r9, C118805vH r10, AnonymousClass1Vo r11, AnonymousClass5ko r12, C116205qz r13, C16320sq r14) {
        C28411Vz r0 = C35481m0.A05;
        this.A0B = r12;
        this.A0D = r14;
        this.A00 = r2;
        this.A01 = r3;
        this.A0A = r11;
        this.A04 = r0;
        this.A06 = r7;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A05 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A0C = r13;
    }

    public static void A00(C18390wc r1, int i2) {
        r1.add((Object) Integer.valueOf(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        r2 = r13.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r11, X.AnonymousClass2HJ r12, X.C117385su r13, java.lang.String r14) {
        /*
            r10 = this;
            X.0vs r0 = A0E
            java.lang.Object r1 = r0.get(r14)
            X.AnonymousClass00B.A06(r1)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            int r0 = r12.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0138
            X.5ko r8 = r10.A0B
            int r0 = r12.A00
            r5 = 0
            boolean r0 = X.C1200960h.A02(r8, r14, r0, r5)
            if (r0 != 0) goto L_0x0051
            int r3 = r12.A00
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r3 == r0) goto L_0x0147
            r0 = 11455(0x2cbf, float:1.6052E-41)
            r6 = 2
            r4 = 1
            if (r3 == r0) goto L_0x00c1
            r0 = 11495(0x2ce7, float:1.6108E-41)
            if (r3 == r0) goto L_0x00e7
            r0 = 12750(0x31ce, float:1.7867E-41)
            if (r3 == r0) goto L_0x009a
            r0 = 17010(0x4272, float:2.3836E-41)
            if (r3 == r0) goto L_0x0094
            r0 = 20951(0x51d7, float:2.9359E-41)
            if (r3 == r0) goto L_0x0085
            r0 = 11465(0x2cc9, float:1.6066E-41)
            if (r3 == r0) goto L_0x0070
            r0 = 11466(0x2cca, float:1.6067E-41)
            if (r3 == r0) goto L_0x0147
            r0 = 11502(0x2cee, float:1.6118E-41)
            if (r3 == r0) goto L_0x00c1
            r0 = 11503(0x2cef, float:1.6119E-41)
            if (r3 == r0) goto L_0x0052
            switch(r3) {
                case 11478: goto L_0x0147;
                case 11479: goto L_0x0070;
                case 11480: goto L_0x0147;
                case 11481: goto L_0x0147;
                default: goto L_0x0051;
            }
        L_0x0051:
            return
        L_0x0052:
            X.61t r0 = r10.A05
            java.lang.String r1 = r0.A00(r3)
            X.5qz r4 = r10.A0C
            r0 = 2131892181(0x7f1217d5, float:1.9419103E38)
            X.5wo r3 = new X.5wo
            r3.<init>(r0, r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            int r0 = r12.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.5ja r0 = r4.A00
            r0.A46(r3, r1, r2)
            return
        L_0x0070:
            X.5vH r4 = r10.A09
            com.whatsapp.jid.UserJid r6 = r13.A01
            r7 = 0
            r9 = r7
            r5 = r11
            r8 = r7
            r4.A00(r5, r6, r7, r8, r9)
            X.1Vo r2 = r10.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "invalid receiver vpa; showErrorAndFinish; error code: "
            goto L_0x0155
        L_0x0085:
            android.os.Bundle r1 = X.C13690nt.A0D()
            java.lang.String r0 = "error_code"
            r1.putInt(r0, r3)
            r0 = 33
            X.AnonymousClass29T.A02(r8, r1, r0)
            return
        L_0x0094:
            r0 = 26
            X.AnonymousClass29T.A01(r8, r0)
            return
        L_0x009a:
            X.1Vo r1 = r10.A0A
            java.lang.String r0 = "request has been cancelled; showErrorAndFinish; error code: "
            java.lang.String r0 = X.C13680ns.A0c(r3, r0)
            r1.A06(r0)
            java.lang.String r0 = r13.A02
            com.whatsapp.jid.UserJid r1 = r13.A01
            if (r1 == 0) goto L_0x00b7
            X.14t r0 = r10.A02
            X.0sH r1 = r0.A01(r1)
            X.0sP r0 = r10.A00
            java.lang.String r0 = r0.A08(r1)
        L_0x00b7:
            X.5qz r2 = r10.A0C
            r1 = 2131890331(0x7f12109b, float:1.941535E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r0
            goto L_0x011f
        L_0x00c1:
            X.1Vo r1 = r10.A0A
            java.lang.String r0 = "sender max transactions or max amount per day limit; showErrorAndFinish"
            r1.A06(r0)
            X.1Vz r3 = r10.A04
            X.013 r2 = r10.A01
            r1 = 100000(0x186a0, float:1.4013E-40)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.lang.String r3 = r3.A9I(r2, r0, r5)
            X.5qz r2 = r10.A0C
            r1 = 2131890275(0x7f121063, float:1.9415237E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r0 = 10
            X.AnonymousClass000.A1M(r6, r0, r5)
            r6[r4] = r3
            goto L_0x011f
        L_0x00e7:
            X.1Vo r1 = r10.A0A
            java.lang.String r0 = "collect request expired; showErrorAndFinish; error code: "
            java.lang.String r0 = X.C13680ns.A0c(r3, r0)
            r1.A06(r0)
            X.0sq r1 = r10.A0D
            X.65L r0 = new X.65L
            r0.<init>(r10, r13)
            r1.Acl(r0)
            X.174 r1 = r10.A07
            X.1Vz r0 = r1.A00()
            if (r0 == 0) goto L_0x0130
            X.1Vy r2 = r13.A00
            if (r2 == 0) goto L_0x0130
            X.1Vz r1 = r1.A00()
            X.013 r0 = r10.A01
            java.lang.String r1 = r1.A9H(r0, r2, r5)
        L_0x0112:
            X.5qz r2 = r10.A0C
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = r13.A04
            r6[r5] = r0
            r6[r4] = r1
            r1 = 2131890363(0x7f1210bb, float:1.9415416E38)
        L_0x011f:
            X.5ja r3 = r2.A00
            int r0 = r12.A00
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.5wo r0 = new X.5wo
            r0.<init>(r1)
            r3.A46(r0, r2, r6)
            return
        L_0x0130:
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r1 = r8.getString(r0)
            goto L_0x0112
        L_0x0138:
            X.1Vo r2 = r10.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r14)
            java.lang.String r0 = " error; showErrorAndFinish; error code: "
            r1.append(r0)
            r1.append(r12)
            goto L_0x015b
        L_0x0147:
            X.0wU r1 = r10.A06
            r0 = 0
            r1.A08(r0)
            X.1Vo r2 = r10.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "invalid sender vpa; showErrorAndFinish; get-methods; error code: "
        L_0x0155:
            r1.append(r0)
            r1.append(r3)
        L_0x015b:
            X.C110105dW.A1L(r2, r1)
            X.5qz r0 = r10.A0C
            X.5ja r0 = r0.A00
            r0.A41(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5wW.A01(android.content.Context, X.2HJ, X.5su, java.lang.String):void");
    }
}
