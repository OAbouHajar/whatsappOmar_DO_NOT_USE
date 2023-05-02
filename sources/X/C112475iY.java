package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.5iY  reason: invalid class name and case insensitive filesystem */
public class C112475iY extends C112485iZ {
    public final /* synthetic */ C112255iC A00;
    public final /* synthetic */ C53312fV A01;
    public final /* synthetic */ C116195qy A02;
    public final /* synthetic */ Integer A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112475iY(Context context, C14870pt r8, C18340wX r9, AnonymousClass4XO r10, C112255iC r11, C53312fV r12, C116195qy r13, Integer num) {
        super(context, r8, r9, r10, "pay-precheck");
        this.A00 = r11;
        this.A02 = r13;
        this.A01 = r12;
        this.A03 = num;
    }

    public void A03(AnonymousClass2HJ r8) {
        super.A03(r8);
        A06(r8);
        this.A02.A00.A3z((C111765hN) null, (C111765hN) null, r8, (String) null, (String) null, false);
    }

    public void A04(AnonymousClass2HJ r8) {
        super.A04(r8);
        A06(r8);
        this.A02.A00.A3z((C111765hN) null, (C111765hN) null, r8, (String) null, (String) null, false);
    }

    public void A05(C28371Vv r20) {
        C112825ja r2;
        C53312fV r22;
        C111765hN r11;
        C53312fV r23;
        C28371Vv r0 = r20;
        super.A05(r0);
        try {
            C28371Vv A0J = r0.A0J("account");
            if (A0J == null) {
                Log.e("PAY: IndiaUpiPayPrecheckAction sendPrecheck: empty account node");
                A06((AnonymousClass2HJ) null);
                this.A02.A00.A3z((C111765hN) null, (C111765hN) null, C110115dX.A0N(), (String) null, (String) null, false);
                return;
            }
            C111775hO r9 = new C111775hO();
            C112255iC r6 = this.A00;
            AnonymousClass173 r112 = r6.A04;
            r9.A01(r112, A0J, 8);
            C28371Vv A0J2 = A0J.A0J("transaction");
            C28371Vv A0J3 = A0J.A0J("upi");
            C28371Vv A0J4 = A0J.A0J("account");
            AnonymousClass2HJ A002 = AnonymousClass2HJ.A00(A0J);
            C28371Vv A0J5 = A0J.A0J("offer_eligibility");
            if (A0J2 != null && A0J3 != null) {
                String A0M = A0J2.A0M("id");
                String A0M2 = A0J3.A0M("token");
                if (!(A0J5 == null || (r23 = this.A01) == null)) {
                    r6.A0A.A09((C53332fX) null, A0J5, r23.A01);
                }
                r6.A0B.A0A(this.A03, "pay-precheck", 2);
                this.A02.A00.A3z((C111765hN) null, (C111765hN) null, (AnonymousClass2HJ) null, A0M, A0M2, AnonymousClass000.A1V(A0J5));
            } else if (r9.A0F() != null) {
                C111765hN r12 = new C111765hN();
                if (A0J4 != null) {
                    r12.A01(r112, A0J4, 0);
                }
                if ("sender".equals(r9.A0F())) {
                    r11 = new C111765hN();
                    C16040sK r02 = r6.A02;
                    r02.A0B();
                    r11.A05 = r02.A05;
                    C35301lh A05 = r9.A05();
                    r11.A02 = A05;
                    r11.A03 = r9.A0E();
                    r6.A08.A08((AnonymousClass1TV) null);
                    if (A05.A00 != null) {
                        r6.A06.A0H(A05, r12.A03);
                        r12 = null;
                        r6.A0B.A0A(this.A03, "pay-precheck", 2);
                        this.A02.A00.A3z(r11, r12, (AnonymousClass2HJ) null, (String) null, (String) null, false);
                    }
                } else if (r12.A05 != null) {
                    if (r12.A04) {
                        r12.A02 = null;
                        r12.A03 = null;
                    }
                    C42511xv A012 = r6.A09.A01();
                    C13700nu.A0W(new C111745hL(A012, r12), A012.A03);
                    r11 = null;
                    r6.A0B.A0A(this.A03, "pay-precheck", 2);
                    this.A02.A00.A3z(r11, r12, (AnonymousClass2HJ) null, (String) null, (String) null, false);
                }
                r11 = null;
                r12 = null;
                r6.A0B.A0A(this.A03, "pay-precheck", 2);
                this.A02.A00.A3z(r11, r12, (AnonymousClass2HJ) null, (String) null, (String) null, false);
            } else {
                if (A002 != null) {
                    if (A002.A00 == 2896004) {
                        r6.A0D.Acl(new C1208563g(this));
                    }
                    if (!(A0J5 == null || (r22 = this.A01) == null)) {
                        r6.A0A.A09((C53332fX) null, A0J5, r22.A01);
                    }
                    A06(A002);
                    r2 = this.A02.A00;
                } else {
                    A06((AnonymousClass2HJ) null);
                    C116195qy r03 = this.A02;
                    A002 = C110115dX.A0N();
                    r2 = r03.A00;
                }
                r2.A3z((C111765hN) null, (C111765hN) null, A002, (String) null, (String) null, false);
            }
        } catch (AnonymousClass1W9 unused) {
            A06((AnonymousClass2HJ) null);
            this.A02.A00.A3z((C111765hN) null, (C111765hN) null, C110115dX.A0N(), (String) null, (String) null, false);
        }
    }

    public final void A06(AnonymousClass2HJ r4) {
        this.A00.A0B.A07(r4, this.A03, "pay-precheck");
    }
}
