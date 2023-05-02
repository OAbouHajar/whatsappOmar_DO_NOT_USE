package X;

/* renamed from: X.5eZ  reason: invalid class name and case insensitive filesystem */
public class C110635eZ extends C003401n {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public AnonymousClass027 A01 = C13690nt.A0O();
    public AnonymousClass027 A02 = C13690nt.A0O();
    public AnonymousClass027 A03 = C13690nt.A0O();
    public AnonymousClass027 A04 = C13690nt.A0O();
    public AnonymousClass027 A05 = C13690nt.A0O();
    public AnonymousClass027 A06 = C13690nt.A0O();
    public AnonymousClass027 A07 = C13690nt.A0O();
    public AnonymousClass027 A08 = C13690nt.A0O();
    public AnonymousClass027 A09 = C13690nt.A0O();
    public C30801cy A0A = new C30801cy();
    public String A0B;
    public final C15900s5 A0C;
    public final C16980tz A0D;
    public final AnonymousClass013 A0E;
    public final AnonymousClass60V A0F;
    public final AnonymousClass175 A0G;
    public final AnonymousClass174 A0H;

    public C110635eZ(C15900s5 r2, C16980tz r3, AnonymousClass013 r4, AnonymousClass60V r5, AnonymousClass175 r6, AnonymousClass174 r7) {
        this.A0D = r3;
        this.A0C = r2;
        this.A0E = r4;
        this.A0G = r6;
        this.A0H = r7;
        this.A0F = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r0 = r2.A0O;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r2 = 0
            if (r7 == 0) goto L_0x0010
            android.net.Uri r0 = android.net.Uri.parse(r7)
            X.5xh r0 = X.C119395xh.A00(r0, r8)
            if (r0 == 0) goto L_0x0010
            r0.A08 = r7
            r2 = r0
        L_0x0010:
            X.60V r0 = r6.A0F
            java.lang.String r1 = X.AnonymousClass60V.A00(r0)
            if (r2 == 0) goto L_0x0133
            java.lang.String r0 = r2.A0O
            if (r0 == 0) goto L_0x0133
            boolean r0 = r0.equalsIgnoreCase(r1)
        L_0x0020:
            java.lang.Integer r3 = X.C13680ns.A0a()
            r4 = 10
            if (r0 == 0) goto L_0x0048
            X.1cy r1 = r6.A0A
            X.5sV r0 = new X.5sV
            r0.<init>(r4)
            r1.A0B(r0)
            X.027 r2 = r6.A04
            X.0tz r0 = r6.A0D
            android.content.Context r1 = r0.A00
            r0 = 2131890198(0x7f121016, float:1.9415081E38)
        L_0x003b:
            java.lang.String r0 = r1.getString(r0)
            r2.A0B(r0)
            X.027 r0 = r6.A02
            r0.A0B(r3)
        L_0x0047:
            return
        L_0x0048:
            boolean r0 = X.AnonymousClass5xQ.A03(r2)
            if (r0 == 0) goto L_0x0062
            X.1cy r1 = r6.A0A
            X.5sV r0 = new X.5sV
            r0.<init>(r4)
            r1.A0B(r0)
            X.027 r2 = r6.A04
            X.0tz r0 = r6.A0D
            android.content.Context r1 = r0.A00
            r0 = 2131890199(0x7f121017, float:1.9415083E38)
            goto L_0x003b
        L_0x0062:
            r6.A0B = r8
            X.027 r0 = r6.A06
            r0.A0B(r2)
            X.027 r1 = r6.A01
            java.lang.String r0 = r2.A09
            r1.A0B(r0)
            X.027 r1 = r6.A00
            java.lang.String r0 = r2.A0O
            r1.A0B(r0)
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "upi://mandate"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
            X.027 r1 = r6.A03
            r0 = 2131886764(0x7f1202ac, float:1.9408116E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
        L_0x008d:
            X.027 r1 = r6.A02
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r1.A0B(r0)
            X.0s5 r1 = r6.A0C
            X.0s8 r0 = X.C15910s6.A0n
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r2.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0047
            X.027 r1 = r6.A09
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
            X.027 r1 = r6.A08
            java.lang.String r0 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.C13700nu.A0V(r1, r0)
            return
        L_0x00bb:
            X.174 r0 = r6.A0H
            X.1Vz r5 = r0.A00()
            X.013 r4 = r6.A0E
            java.lang.String r0 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fe
            r4 = 0
        L_0x00cc:
            X.027 r3 = r6.A03
            X.175 r0 = r6.A0G
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x00f1
            r1 = 2131886764(0x7f1202ac, float:1.9408116E38)
        L_0x00d9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A0B(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x008d
            X.027 r1 = r6.A07
            X.5wE r0 = new X.5wE
            r0.<init>(r4)
            r1.A0B(r0)
            goto L_0x008d
        L_0x00f1:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 2131890070(0x7f120f96, float:1.9414821E38)
            if (r0 == 0) goto L_0x00d9
            r1 = 2131890069(0x7f120f95, float:1.941482E38)
            goto L_0x00d9
        L_0x00fe:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            java.lang.String r1 = r2.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = r2.A0A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0123
            X.1Vy r1 = X.C110115dX.A0B(r5, r1)
            r0 = 0
            java.lang.String r0 = r5.A9H(r4, r1, r0)
            r3.append(r0)
            java.lang.String r0 = " - "
            r3.append(r0)
        L_0x0123:
            java.lang.String r0 = r2.A0A
            X.1Vy r1 = X.C110115dX.A0B(r5, r0)
            r0 = 0
            java.lang.String r0 = r5.A9H(r4, r1, r0)
            java.lang.String r4 = X.AnonymousClass000.A0h(r0, r3)
            goto L_0x00cc
        L_0x0133:
            r0 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110635eZ.A05(java.lang.String, java.lang.String):void");
    }
}
