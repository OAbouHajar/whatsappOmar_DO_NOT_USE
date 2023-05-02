package X;

import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;

/* renamed from: X.26L  reason: invalid class name */
public abstract class AnonymousClass26L extends AnonymousClass26M implements AnonymousClass22Z {
    public final int A00;
    public final C18710x8 A01;
    public final C18650x2 A02;
    public final C84734Lr A03;
    public final C18690x6 A04;
    public final AnonymousClass4IY A05;
    public final C16320sq A06;

    public AnonymousClass26L(C18710x8 r1, C18650x2 r2, C84734Lr r3, C18690x6 r4, AnonymousClass4IY r5, C16320sq r6, int i2) {
        super(r2);
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A00 = i2;
        this.A05 = r5;
    }

    public AnonymousClass47H A01() {
        if (this instanceof C55242j8) {
            if (((C55242j8) this).A02.A07) {
                return new C77793wb();
            }
        } else if ((this instanceof AnonymousClass26K) && ((AnonymousClass26K) this).A05.A00 != null) {
            return new C77783wa();
        }
        return new C77813wd();
    }

    public void A02() {
        AnonymousClass4IY r2 = this.A05;
        Integer A012 = C18740xB.A01(A01(), this.A00);
        if (A012 != null) {
            AnonymousClass4IZ r22 = r2.A01;
            r22.A00 = Integer.valueOf(r22.A01.A00(A012.intValue()));
        }
    }

    public void A03() {
        C31081dR r1;
        C31081dR r12;
        if (this instanceof C55242j8) {
            this.A06.Acl(new RunnableRunnableShape4S0100000_I0_3(this, 0));
        } else if (this instanceof AnonymousClass2j5) {
            AnonymousClass2j5 r3 = (AnonymousClass2j5) this;
            r3.A02.A01(new C49822Vz(0));
            r3.A08.A02("plm_details_view_tag");
            r3.A06.Acl(new RunnableRunnableShape3S0100000_I0_2(r3, 49));
        } else if (this instanceof AnonymousClass26R) {
            AnonymousClass26R r2 = (AnonymousClass26R) this;
            r2.A09.A02("view_product_tag");
            r2.A06.Acl(new RunnableRunnableShape3S0100000_I0_2(r2, 48));
        } else if (this instanceof AnonymousClass26K) {
            AnonymousClass26K r22 = (AnonymousClass26K) this;
            if (r22.A05.A06 == null && (r12 = (C31081dR) r22.A08.A02.get("catalog_collections_view_tag")) != null) {
                r12.A08("datasource_catalog");
            }
            r22.A06.Acl(new RunnableRunnableShape3S0100000_I0_2(r22, 47));
        } else if (this instanceof C59642yd) {
            C59642yd r23 = (C59642yd) this;
            if (r23.A02.A05 == null && (r1 = (C31081dR) r23.A05.A02.get("catalog_collections_view_tag")) != null) {
                r1.A08("datasource_collections");
            }
            r23.A06.Acl(new RunnableRunnableShape17S0100000_I1((Object) r23, 26));
        } else {
            this.A06.Acl(new RunnableRunnableShape17S0100000_I1((Object) this, 25));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (r15 != 2498054) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.UserJid r14, int r15, boolean r16) {
        /*
            r13 = this;
            X.0x6 r4 = r13.A04
            int r6 = r13.A00
            long r8 = (long) r15
            r7 = 2
            X.0sq r0 = r4.A03
            X.564 r3 = new X.564
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r0.Acl(r3)
            X.4IY r3 = r13.A05
            X.47H r0 = r13.A01()
            java.lang.Integer r2 = X.C18740xB.A01(r0, r6)
            if (r2 == 0) goto L_0x0039
            java.lang.String r1 = "graphql"
            r0 = 0
            X.4L0 r4 = new X.4L0
            r4.<init>(r14, r1, r0)
            X.4IZ r3 = r3.A01
            int r2 = r2.intValue()
            r0 = 10
            com.facebook.redex.RunnableRunnableShape1S0201000_I1 r1 = new com.facebook.redex.RunnableRunnableShape1S0201000_I1
            r1.<init>(r4, r2, r3, r0)
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0039
            r1.run()
        L_0x0039:
            X.4Lr r3 = r13.A03
            if (r16 == 0) goto L_0x0043
            r1 = 2498054(0x261e06, float:3.500519E-39)
            r0 = 1
            if (r15 == r1) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r2 = 1
            if (r0 == 0) goto L_0x0058
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0050
            r13.APn(r14)
        L_0x004e:
            r0 = 1
            return r0
        L_0x0050:
            r3.A01 = r2
            X.0x8 r0 = r3.A02
            r0.A01(r13, r14)
            goto L_0x004e
        L_0x0058:
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            if (r0 != r2) goto L_0x0146
            X.0x2 r0 = r3.A03
            boolean r0 = r0 instanceof X.C18660x3
            if (r0 != 0) goto L_0x0146
            java.util.Set r1 = X.C18650x2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0146
            r0 = r13
            boolean r1 = r13 instanceof X.C55242j8
            if (r1 == 0) goto L_0x0081
            X.2j8 r0 = (X.C55242j8) r0
            X.2yO r0 = r0.A03
            r0.A02()
            goto L_0x004e
        L_0x0081:
            boolean r1 = r13 instanceof X.AnonymousClass2j5
            if (r1 == 0) goto L_0x00b7
            X.2j5 r0 = (X.AnonymousClass2j5) r0
            X.39J r4 = r0.A02
            X.0ug r8 = r0.A07
            X.0uc r3 = r0.A01
            X.0x7 r9 = r0.A09
            X.3Aa r5 = new X.3Aa
            r5.<init>(r2)
            X.0so r2 = r0.A00
            X.2j6 r1 = r0.A04
            com.whatsapp.jid.UserJid r6 = r1.A00
            java.lang.String r10 = r1.A02
            java.lang.String r11 = r1.A01
            java.util.List r12 = r1.A03
            X.0x9 r7 = r0.A06
            X.2yP r1 = new X.2yP
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.0uc r0 = r1.A01
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00b3
            r1.A02()
            goto L_0x004e
        L_0x00b3:
            r1.A03()
            goto L_0x004e
        L_0x00b7:
            boolean r1 = r13 instanceof X.AnonymousClass26R
            if (r1 == 0) goto L_0x00fc
            X.26R r0 = (X.AnonymousClass26R) r0
            X.0ug r9 = r0.A08
            X.0x0 r10 = r0.A09
            X.26S r7 = r0.A06
            X.0x1 r3 = r0.A01
            X.0uc r2 = r0.A00
            r1 = 0
            X.3Aa r5 = new X.3Aa
            r5.<init>(r1)
            X.0wP r6 = r0.A05
            X.0x9 r8 = r0.A07
            X.4Q4 r4 = r0.A02
            X.2yQ r1 = new X.2yQ
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.0wP r0 = r1.A03
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x00ea
            X.4Q4 r2 = r1.A01
            X.26S r1 = r1.A04
            r0 = -1
            r2.A00(r1, r0)
            goto L_0x004e
        L_0x00ea:
            X.0uc r0 = r1.A01
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00f7
            r1.A02()
            goto L_0x004e
        L_0x00f7:
            r1.A03()
            goto L_0x004e
        L_0x00fc:
            boolean r1 = r13 instanceof X.AnonymousClass26K
            if (r1 == 0) goto L_0x0131
            X.26K r0 = (X.AnonymousClass26K) r0
            X.26O r7 = r0.A05
            X.4Ka r1 = r7.A00
            r2 = 0
            if (r1 == 0) goto L_0x010a
            r2 = 1
        L_0x010a:
            r1 = 0
            if (r2 == 0) goto L_0x0114
            X.5RX r0 = r0.A03
            r0.AQt(r7, r1)
            goto L_0x004e
        L_0x0114:
            X.0so r2 = r0.A00
            X.0x0 r10 = r0.A08
            X.0ug r9 = r0.A07
            X.3Aa r5 = new X.3Aa
            r5.<init>(r1)
            X.0wP r6 = r0.A04
            X.0uc r3 = r0.A01
            X.5RX r4 = r0.A03
            X.0x9 r8 = r0.A06
            X.2yS r1 = new X.2yS
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.A07()
            goto L_0x004e
        L_0x0131:
            boolean r1 = r13 instanceof X.C59642yd
            if (r1 == 0) goto L_0x013e
            X.2yd r0 = (X.C59642yd) r0
            X.2yT r0 = r0.A03
            r0.A06()
            goto L_0x004e
        L_0x013e:
            X.2yc r0 = (X.C59632yc) r0
            r1 = 0
            r0.A05(r1)
            goto L_0x004e
        L_0x0146:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26L.A04(com.whatsapp.jid.UserJid, int, boolean):boolean");
    }
}
