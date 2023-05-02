package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass04o;
import X.AnonymousClass10X;
import X.AnonymousClass160;
import X.AnonymousClass174;
import X.AnonymousClass17Y;
import X.AnonymousClass1HE;
import X.AnonymousClass1KO;
import X.AnonymousClass1ME;
import X.AnonymousClass1MF;
import X.AnonymousClass1N2;
import X.AnonymousClass1Vo;
import X.AnonymousClass1Vt;
import X.AnonymousClass1yL;
import X.AnonymousClass2St;
import X.AnonymousClass2ZK;
import X.AnonymousClass37Z;
import X.C001500q;
import X.C005602k;
import X.C006602z;
import X.C110105dW;
import X.C110755em;
import X.C112955kt;
import X.C113345lt;
import X.C113495m9;
import X.C113505mA;
import X.C113515mB;
import X.C113525mC;
import X.C113545mE;
import X.C113555mF;
import X.C113565mG;
import X.C113585mI;
import X.C113595mJ;
import X.C113605mK;
import X.C113615mL;
import X.C113625mM;
import X.C113635mN;
import X.C113645mO;
import X.C113655mP;
import X.C113665mQ;
import X.C113675mR;
import X.C114155nD;
import X.C114165nE;
import X.C117415sx;
import X.C117745tU;
import X.C117755tV;
import X.C1222969a;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C16000sG;
import X.C16080sP;
import X.C16260sj;
import X.C16740tZ;
import X.C16760tb;
import X.C17090uW;
import X.C17110uY;
import X.C17130ua;
import X.C17160ud;
import X.C17200uh;
import X.C18090w8;
import X.C18290wS;
import X.C19980zJ;
import X.C19990zK;
import X.C209212c;
import X.C209712h;
import X.C218315p;
import X.C227819g;
import X.C227919h;
import X.C228019i;
import X.C228919r;
import X.C25791Ld;
import X.C28381Vw;
import X.C38621r6;
import X.C41411vk;
import X.C50772aQ;
import X.C613738q;
import X.C61783Ah;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxIFactoryShape1S0300000_3_I1;
import com.facebook.redex.IDxIFactoryShape5S0200000_3_I1;
import com.obwhatsapp.R;

public class PaymentTransactionDetailsListActivity extends C112955kt {
    public C17090uW A00;
    public AnonymousClass1KO A01;
    public AnonymousClass10X A02;
    public C17130ua A03;
    public C16760tb A04;
    public AnonymousClass1ME A05;
    public C17160ud A06;
    public C16000sG A07;
    public C16080sP A08;
    public C17200uh A09;
    public C613738q A0A;
    public C16260sj A0B;
    public AnonymousClass013 A0C;
    public AnonymousClass160 A0D;
    public AnonymousClass1HE A0E;
    public C209212c A0F;
    public C19990zK A0G;
    public C227919h A0H;
    public C228019i A0I;
    public C227819g A0J;
    public AnonymousClass174 A0K;
    public C18090w8 A0L;
    public C18290wS A0M;
    public C209712h A0N;
    public C110755em A0O;
    public C117745tU A0P;
    public AnonymousClass1N2 A0Q;
    public C218315p A0R;
    public AnonymousClass1MF A0S;
    public C50772aQ A0T;
    public C17110uY A0U;
    public C25791Ld A0V;
    public AnonymousClass2ZK A0W;
    public AnonymousClass01D A0X;
    public String A0Y;
    public final AnonymousClass1Vo A0Z = C110105dW.A0Q("PaymentTransactionDetailsListActivity", "payment-settings");

    public C005602k A35(ViewGroup viewGroup, int i2) {
        if (i2 == 306) {
            return new C113545mE(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0428));
        }
        switch (i2) {
            case 200:
                return new C113615mL(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout046b), this.A0C, this.A0N);
            case 201:
                return new C113625mM(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout046a), this.A0I);
            case 202:
                return new C113655mP(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0479), this.A08);
            case 203:
                C17200uh r8 = this.A09;
                C17160ud r7 = this.A06;
                C17110uY r10 = this.A0U;
                return new C113665mQ(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0472), this.A02, r7, r8, this.A08, r10);
            case 204:
                return new C113595mJ(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout046f));
            case 205:
                C14870pt r6 = this.A05;
                C19990zK r102 = this.A0G;
                return new C113675mR(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0471), r6, this.A00, this.A0A, this.A08, r102);
            case 206:
                return new C113565mG(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0474));
            case 207:
                return new C113345lt(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0469));
            case 208:
                return new C113515mB(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0481));
            case 209:
                C14710pd r62 = this.A0C;
                AnonymousClass10X r2 = this.A02;
                C16760tb r3 = this.A04;
                AnonymousClass013 r5 = this.A0C;
                C25791Ld r11 = this.A0V;
                C16260sj r4 = this.A0B;
                C209212c r82 = this.A0F;
                AnonymousClass1MF r9 = this.A0S;
                AnonymousClass1HE r72 = this.A0E;
                C50772aQ r103 = this.A0T;
                View A0H2 = C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout047a);
                return new C113525mC(A0H2, new C61783Ah(A0H2, r2, r3, r4, r5, r62, r72, r82, r9, r103, r11));
            case 210:
                return new C113505mA(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0475));
            case 211:
                return new C113585mI(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0476));
            case 212:
                return new C113635mN(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0477), this.A08, A36().ACC());
            case 213:
                return new C113555mF(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0473));
            case 214:
                return new C113645mO(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout046c), this.A08);
            case 215:
                return new C113605mK(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout046d));
            case 216:
                return new C113495m9(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout046e));
            default:
                return super.A35(viewGroup, i2);
        }
    }

    public C228919r A36() {
        return this.A0M.A03();
    }

    public C110755em A37(Bundle bundle) {
        C006602z r1;
        Class cls;
        if (this instanceof BrazilPaymentTransactionDetailActivity) {
            BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = (BrazilPaymentTransactionDetailActivity) this;
            if (bundle == null) {
                bundle = C13690nt.A0E(brazilPaymentTransactionDetailActivity);
            }
            boolean A052 = brazilPaymentTransactionDetailActivity.A0L.A05();
            C117755tV r2 = brazilPaymentTransactionDetailActivity.A03;
            if (A052) {
                r1 = new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(bundle, 2, r2), (C001500q) brazilPaymentTransactionDetailActivity);
                cls = C114155nD.class;
            } else {
                r1 = new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(bundle, 1, r2), (C001500q) brazilPaymentTransactionDetailActivity);
                cls = C114165nE.class;
            }
        } else {
            C117745tU r3 = this.A0P;
            C1222969a ACC = A36().ACC();
            if (bundle == null) {
                bundle = C13690nt.A0E(this);
            }
            r1 = new C006602z((AnonymousClass04o) new IDxIFactoryShape1S0300000_3_I1(bundle, ACC, r3, 1), (C001500q) this);
            cls = C110755em.class;
        }
        return (C110755em) r1.A01(cls);
    }

    public void A38(AnonymousClass1Vt r1, AnonymousClass2St r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03bc, code lost:
        r2.putExtra("extra_bank_account", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03bf, code lost:
        startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03fc, code lost:
        r2 = r0.A05;
        X.AnonymousClass00B.A06(r2);
        r1 = new X.C118325uV();
        r1.A04 = r3;
        r1.A01 = r8.A0C;
        r1.A02 = r2;
        r1.A03 = r8.A0R;
        r1.A00 = r8.A07;
        r1.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0419, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0502, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0505, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e6, code lost:
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A39(X.C117725tS r20) {
        /*
            r19 = this;
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r0 = r20
            int r2 = r0.A00
            java.lang.String r13 = "payment_transaction_details"
            java.lang.String r5 = "paymentHandle"
            java.lang.String r3 = "extra_bank_account"
            r10 = 0
            r1 = 1
            r4 = 0
            r8 = r19
            switch(r2) {
                case 0: goto L_0x0015;
                case 1: goto L_0x01b0;
                case 2: goto L_0x0502;
                case 3: goto L_0x01bf;
                case 4: goto L_0x01d2;
                case 5: goto L_0x01ea;
                case 6: goto L_0x021e;
                case 7: goto L_0x0235;
                case 8: goto L_0x024c;
                case 9: goto L_0x03ab;
                case 10: goto L_0x0252;
                case 11: goto L_0x01c3;
                case 12: goto L_0x041d;
                case 13: goto L_0x0348;
                case 14: goto L_0x0014;
                case 15: goto L_0x0014;
                case 16: goto L_0x0362;
                case 17: goto L_0x003c;
                case 18: goto L_0x004c;
                case 19: goto L_0x03c3;
                case 20: goto L_0x03c7;
                case 21: goto L_0x006c;
                case 22: goto L_0x03f2;
                case 23: goto L_0x03ef;
                case 24: goto L_0x0014;
                case 25: goto L_0x0145;
                case 26: goto L_0x016d;
                default: goto L_0x0014;
            }
        L_0x0014:
            return
        L_0x0015:
            android.os.Bundle r2 = r0.A02
            java.lang.String r0 = "action_bar_title_res_id"
            int r0 = r2.getInt(r0)
            X.02i r2 = r8.x()
            if (r2 == 0) goto L_0x0014
            r2.A0N(r1)
            r2.A0B(r0)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "extra_action_bar_display_close"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x0014
            r0 = 2131231794(0x7f080432, float:1.807968E38)
            r2.A09(r0)
            return
        L_0x003c:
            X.1Vt r1 = r0.A05
            if (r1 == 0) goto L_0x0014
            X.19r r2 = r8.A36()
            X.1Vt r1 = r0.A05
            java.lang.String r0 = "wa_payment_settings"
            X.C115315pY.A00(r8, r1, r2, r0, r4)
            return
        L_0x004c:
            boolean r0 = r8 instanceof com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r0 == 0) goto L_0x0065
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r8 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r8
            X.5nF r2 = r8.A01
        L_0x0054:
            boolean r0 = r2 instanceof X.C114165nE
            if (r0 == 0) goto L_0x0014
            X.5nE r2 = (X.C114165nE) r2
            X.0sq r1 = r2.A0j
            X.64h r0 = new X.64h
            r0.<init>(r2)
            r1.Acl(r0)
            return
        L_0x0065:
            boolean r0 = r8 instanceof com.obwhatsapp.payments.ui.BrazilPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0502
            X.5em r2 = r8.A0O
            goto L_0x0054
        L_0x006c:
            X.5em r3 = r8.A0O
            java.lang.String r14 = r8.A0Y
            r2 = 87
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            X.69a r9 = r3.A0e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r16 = r10
            r17 = 0
            r18 = 1
            r15 = r10
            r9.AKV(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0ti r7 = r0.A08
            if (r7 != 0) goto L_0x00d4
            java.lang.String r2 = "PAY : PaymentTransactionDetailsListActivity/EVENT_OPEN_ORDER_DETAILS_PAGE : orderMessageKey is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.1Vt r3 = r0.A05
            if (r3 == 0) goto L_0x00d2
            com.whatsapp.jid.UserJid r2 = r3.A0D
            if (r2 == 0) goto L_0x00d2
            java.lang.Boolean r5 = r3.A02()
            if (r5 == 0) goto L_0x00d2
            X.0sG r3 = r8.A07
            X.1Vt r2 = r0.A05
            com.whatsapp.jid.UserJid r2 = r2.A0D
            X.0sH r3 = r3.A0A(r2)
            boolean r2 = r5.booleanValue()
            if (r2 == 0) goto L_0x00cf
            java.lang.String r6 = r3.A09()
        L_0x00b1:
            r2 = 2131889829(0x7f120ea5, float:1.9414333E38)
            java.lang.String r5 = r8.getString(r2)
            r3 = 2131889828(0x7f120ea4, float:1.941433E38)
            java.lang.Object[] r2 = X.C13690nt.A1Z()
            r2[r4] = r6
            java.lang.String r0 = r0.A0D
            java.lang.String r0 = X.C13680ns.A0d(r8, r0, r2, r1, r3)
            X.02l r0 = X.AnonymousClass5xE.A01(r8, r10, r5, r0)
            r0.show()
            return
        L_0x00cf:
            java.lang.String r6 = r3.A0W
            goto L_0x00b1
        L_0x00d2:
            r6 = r10
            goto L_0x00b1
        L_0x00d4:
            X.AnonymousClass00B.A06(r7)
            X.1Vw r6 = r7.A11
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x00e3
            X.1ME r0 = r8.A05
            r0.A00()
            return
        L_0x00e3:
            X.0w8 r5 = r8.A0L
            X.19h r2 = r8.A0H
            X.AnonymousClass00B.A06(r7)
            X.0rv r3 = r6.A00
            X.AnonymousClass00B.A06(r3)
            X.AnonymousClass00B.A06(r7)
            java.lang.String r1 = r0.A0D
            X.AnonymousClass00B.A06(r1)
            int r4 = r0.A01
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x0140
            boolean r0 = r5.A0D(r10)
            if (r0 == 0) goto L_0x0140
            android.content.Intent r2 = r2.A00(r8)
        L_0x0109:
            if (r2 == 0) goto L_0x0014
            X.AnonymousClass1yL.A00(r2, r6)
            java.lang.String r0 = "extra_order_id"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "extra_order_discount_program_name"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "extra_order_type"
            r2.putExtra(r0, r10)
            java.lang.String r1 = "extra_transaction_type"
            java.lang.String r0 = "p2m"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_config_id"
            r2.putExtra(r0, r10)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "order_details"
            r2.putExtra(r1, r0)
            if (r4 <= 0) goto L_0x0137
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r2.putExtra(r0, r4)
        L_0x0137:
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            X.AnonymousClass477.A00(r8, r2, r3)
            return
        L_0x0140:
            android.content.Intent r2 = r2.A01(r8)
            goto L_0x0109
        L_0x0145:
            X.5em r2 = r8.A0O
            java.lang.String r14 = r8.A0Y
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            X.69a r9 = r2.A0e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r16 = r10
            r17 = 0
            r18 = 1
            r15 = r10
            r9.AKV(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.19r r0 = r8.A36()
            X.1GQ r0 = r0.ADT()
            if (r0 == 0) goto L_0x0014
            r0.A00(r8, r13)
            return
        L_0x016d:
            X.5em r3 = r8.A0O
            java.lang.String r14 = r8.A0Y
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            X.69a r9 = r3.A0e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r16 = r10
            r17 = 0
            r18 = 1
            r15 = r10
            r9.AKV(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0sK r2 = r8.A01
            X.1Vt r1 = r0.A05
            X.AnonymousClass00B.A06(r1)
            com.whatsapp.jid.UserJid r1 = r1.A0E
            boolean r1 = r2.A0I(r1)
            X.1Vt r0 = r0.A05
            if (r1 != 0) goto L_0x01ad
            com.whatsapp.jid.UserJid r0 = r0.A0E
        L_0x019a:
            X.AnonymousClass00B.A06(r0)
            r2.A0B()
            X.1ZT r0 = r2.A05
            if (r0 == 0) goto L_0x0014
            r2.A0B()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x01ad:
            com.whatsapp.jid.UserJid r0 = r0.A0D
            goto L_0x019a
        L_0x01b0:
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x01bb
            r0 = 2131890274(0x7f121062, float:1.9415235E38)
            r8.Afq(r0)
            return
        L_0x01bb:
            r8.Ac1()
            return
        L_0x01bf:
            r8.invalidateOptionsMenu()
            return
        L_0x01c3:
            android.content.Context r3 = r8.getApplicationContext()
            java.lang.String r2 = r0.A0G
            X.AnonymousClass00B.A06(r2)
            r0 = 1
            android.content.Intent r0 = X.C14750ph.A0k(r3, r2, r10, r4, r0)
            goto L_0x01e6
        L_0x01d2:
            X.0sH r2 = r0.A03
            X.AnonymousClass00B.A06(r2)
            X.0ph r1 = new X.0ph
            r1.<init>()
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r0 = r1.A0w(r8, r2, r0)
        L_0x01e6:
            r8.startActivity(r0)
            return
        L_0x01ea:
            X.19r r1 = r8.A36()
            java.lang.Class r1 = r1.AEk()
            android.content.Intent r3 = X.C110105dW.A04(r8, r1)
            X.2gP r2 = X.C110105dW.A0L()
            java.lang.String r1 = r0.A0F
            X.1lh r2 = X.C110105dW.A0J(r2, r6, r1, r5)
            java.lang.String r1 = "extra_payment_handle"
            r3.putExtra(r1, r2)
            java.lang.String r2 = "extra_referral_screen"
            java.lang.String r1 = "payment_transaction_history"
            r3.putExtra(r2, r1)
            java.lang.String r2 = r0.A0E
            java.lang.String r1 = "extra_payment_handle_id"
            r3.putExtra(r1, r2)
            X.1lh r1 = r0.A07
            java.lang.String r0 = "extra_payee_name"
            r3.putExtra(r0, r1)
            r8.A2V(r3)
            return
        L_0x021e:
            r2 = 2131890013(0x7f120f5d, float:1.9414706E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.19r r0 = r8.A36()
            int r0 = r0.AEb()
            java.lang.String r0 = r8.getString(r0)
            r1[r4] = r0
            r8.Afj(r1, r4, r2)
            return
        L_0x0235:
            java.lang.Class r1 = r0.A0A
            android.content.Intent r2 = X.C110105dW.A04(r8, r1)
            X.1cl r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
            r2.putExtra(r3, r0)
            java.lang.String r1 = "event_screen"
            java.lang.String r0 = "forgot_pin"
            r2.putExtra(r1, r0)
            goto L_0x03bf
        L_0x024c:
            java.lang.String r0 = r0.A0C
            r8.A2i(r10, r0)
            return
        L_0x0252:
            X.1Vt r14 = r0.A05
            X.AnonymousClass00B.A06(r14)
            X.1cl r13 = r0.A04
            boolean r0 = r14.A0E()
            if (r0 == 0) goto L_0x0262
            java.lang.String r2 = "payments:request"
            goto L_0x0264
        L_0x0262:
            java.lang.String r2 = "payments:transaction"
        L_0x0264:
            org.json.JSONObject r3 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = "lg"
            X.013 r0 = r8.A0C     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r0 = r0.A06()     // Catch:{ Exception -> 0x02b1 }
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = "lc"
            X.013 r0 = r8.A0C     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r0 = r0.A05()     // Catch:{ Exception -> 0x02b1 }
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = "platform"
            java.lang.String r0 = "android"
            org.json.JSONObject r1 = r3.put(r1, r0)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r0 = "context"
            org.json.JSONObject r3 = r1.put(r0, r2)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "p2p"
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = r14.A0J     // Catch:{ Exception -> 0x02b1 }
            if (r1 == 0) goto L_0x029f
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)     // Catch:{ Exception -> 0x02b1 }
        L_0x029f:
            if (r13 == 0) goto L_0x02b9
            java.lang.String r0 = r13.A0B     // Catch:{ Exception -> 0x02b1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x02b1 }
            if (r0 != 0) goto L_0x02b9
            java.lang.String r1 = "bank_name"
            java.lang.String r0 = r13.A0B     // Catch:{ Exception -> 0x02b1 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x02b1 }
            goto L_0x02b9
        L_0x02b1:
            r3 = move-exception
            X.1Vo r1 = r8.A0Z
            java.lang.String r0 = "debugInfoData fields"
            r1.A0A(r0, r3)
        L_0x02b9:
            android.os.Bundle r7 = X.C13690nt.A0D()
            boolean r0 = r14.A0E()
            if (r0 != 0) goto L_0x02ca
            java.lang.String r1 = r14.A0K
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            r7.putString(r0, r1)
        L_0x02ca:
            java.lang.String r1 = r14.A0F
            if (r1 == 0) goto L_0x02d3
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.paymentBankTxnId"
            r7.putString(r0, r1)
        L_0x02d3:
            if (r13 == 0) goto L_0x02e7
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.paymentMethod"
            r7.putParcelable(r0, r13)
            X.1tF r0 = r13.A08
            if (r0 == 0) goto L_0x0340
            java.lang.String r1 = r0.A07()
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.paymentBankPhone"
            r7.putString(r0, r1)
        L_0x02e7:
            java.lang.String r1 = r14.A0J
            if (r1 == 0) goto L_0x02f0
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.paymentErrorCode"
            r7.putString(r0, r1)
        L_0x02f0:
            int r1 = r14.A02
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L_0x0303
            r1 = 2
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.type"
            r7.putInt(r0, r1)
            java.lang.String r1 = "com.obwhatsapp.support.DescribeProblemActivity.paymentStatus"
            java.lang.String r0 = "RF"
            r7.putString(r1, r0)
        L_0x0303:
            X.19r r0 = r8.A36()
            X.1YB r0 = r0.AEY()
            if (r0 == 0) goto L_0x0320
            boolean r0 = r0.AHh()
            if (r0 == 0) goto L_0x0320
            android.net.Uri r0 = r8.A2B()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.uri"
            r7.putString(r0, r1)
        L_0x0320:
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.from"
            r7.putString(r0, r2)
            X.0sq r1 = r8.A05
            X.0ua r11 = r8.A03
            X.0s5 r10 = r8.A06
            X.1KO r9 = r8.A01
            X.013 r12 = r8.A0C
            X.0zG r15 = r8.A0D
            X.174 r0 = r8.A0K
            X.5o4 r6 = new X.5o4
            r17 = r2
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C13700nu.A0W(r6, r1)
            return
        L_0x0340:
            X.1Vo r1 = r8.A0Z
            java.lang.String r0 = "payment method missing country fields"
            r1.A05(r0)
            goto L_0x02e7
        L_0x0348:
            X.19g r7 = r8.A0J
            com.whatsapp.jid.UserJid r10 = r0.A06
            X.2gP r2 = X.C110105dW.A0L()
            java.lang.String r1 = r0.A0F
            X.1lh r11 = X.C110105dW.A0J(r2, r6, r1, r5)
            r1 = 2
            com.facebook.redex.IDxCCallbackShape67S0200000_3_I1 r9 = new com.facebook.redex.IDxCCallbackShape67S0200000_3_I1
            r9.<init>(r0, r1, r8)
            r12 = 0
            r13 = 0
            r7.A00(r8, r9, r10, r11, r12, r13)
            return
        L_0x0362:
            X.1cl r1 = r0.A04
            X.AnonymousClass00B.A06(r1)
            boolean r1 = r0.A0H
            if (r1 == 0) goto L_0x03a2
            java.lang.String r1 = r0.A0B
            X.AnonymousClass00B.A06(r1)
            X.4W4 r12 = new X.4W4
            r12.<init>(r10, r1, r10)
            java.util.HashMap r14 = X.AnonymousClass000.A0x()
            X.1cl r0 = r0.A04
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            r14.put(r0, r1)
            X.0pt r1 = r8.A05
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r1.A08(r4, r0)
            X.01D r0 = r8.A0X
            java.lang.Object r9 = r0.get()
            X.1JN r9 = (X.AnonymousClass1JN) r9
            r0 = 6
            com.facebook.redex.IDxRCallbackShape249S0100000_3_I1 r10 = new com.facebook.redex.IDxRCallbackShape249S0100000_3_I1
            r10.<init>(r8, r0)
            r0 = 4
            com.facebook.redex.IDxTCallbackShape262S0100000_3_I1 r11 = new com.facebook.redex.IDxTCallbackShape262S0100000_3_I1
            r11.<init>(r8, r0)
            r9.A00(r10, r11, r12, r13, r14)
            return
        L_0x03a2:
            java.lang.Class r1 = r0.A09
            android.content.Intent r2 = X.C110105dW.A04(r8, r1)
            X.1cl r0 = r0.A04
            goto L_0x03bc
        L_0x03ab:
            X.19r r1 = r8.A36()
            java.lang.Class r1 = r1.A9e()
            android.content.Intent r2 = X.C110105dW.A04(r8, r1)
            X.1cl r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
        L_0x03bc:
            r2.putExtra(r3, r0)
        L_0x03bf:
            r8.startActivity(r2)
            return
        L_0x03c3:
            super.onBackPressed()
            return
        L_0x03c7:
            X.5em r2 = r8.A0O
            java.lang.String r14 = r8.A0Y
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            X.69a r9 = r2.A0e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r16 = r10
            r17 = 0
            r18 = 1
            r15 = r10
            r9.AKV(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0zJ r2 = r8.A00
            X.2ZK r1 = r8.A0W
            java.lang.String r0 = "smb_transaction_details"
            android.content.Intent r0 = r1.A00(r0)
            r2.A06(r8, r0)
            return
        L_0x03ef:
            java.lang.String r3 = "wa_p2m_receipt_report_transaction"
            goto L_0x03fc
        L_0x03f2:
            X.1Vt r1 = r0.A05
            int r2 = r1.A03
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L_0x041a
            java.lang.String r3 = "wa_smb_p2m_payment_details"
        L_0x03fc:
            X.1Vt r2 = r0.A05
            X.AnonymousClass00B.A06(r2)
            X.5uV r1 = new X.5uV
            r1.<init>()
            r1.A04 = r3
            X.013 r0 = r8.A0C
            r1.A01 = r0
            r1.A02 = r2
            X.15p r0 = r8.A0R
            r1.A03 = r0
            X.0sG r0 = r8.A07
            r1.A00 = r0
            r1.A00(r8)
            return
        L_0x041a:
            java.lang.String r3 = "wa_p2m_receipt_support"
            goto L_0x03fc
        L_0x041d:
            X.5em r0 = r8.A0O
            X.5sx r0 = r0.A07
            if (r0 == 0) goto L_0x050f
            X.0tZ r3 = r0.A02
        L_0x0425:
            X.19h r0 = r8.A0H
            android.content.Intent r2 = r0.A02(r8, r1, r4)
            X.174 r0 = r8.A0K
            X.1Vz r5 = r0.A00()
            X.013 r4 = r8.A0C
            X.1Vt r0 = r3.A0L
            X.1Vy r0 = r0.A08
            java.lang.String r4 = r5.A9F(r4, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            r2.putExtra(r0, r4)
            X.15p r6 = r8.A0R
            X.1Vt r5 = r3.A0L
            int r4 = r5.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r4 != r0) goto L_0x0482
            int r0 = r5.A03
            if (r0 != r1) goto L_0x0482
            X.0w8 r0 = r6.A0B
            X.0pd r4 = r0.A03
            r0 = 2381(0x94d, float:3.336E-42)
            boolean r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x0482
            X.1N2 r0 = r8.A0Q
            X.174 r0 = r0.A00
            X.1Vz r5 = r0.A00()
            if (r5 == 0) goto L_0x0482
            X.1Vy r0 = r5.ADn()
            java.math.BigDecimal r0 = r0.A00
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "extra_payment_preset_min_amount"
            r2.putExtra(r0, r4)
            X.1Vy r0 = r5.ADP()
            java.math.BigDecimal r0 = r0.A00
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "extra_payment_preset_max_amount"
            r2.putExtra(r0, r4)
        L_0x0482:
            X.1Vw r0 = r3.A11
            X.0rv r5 = r0.A00
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r4 = "extra_jid"
            if (r0 == 0) goto L_0x0506
            java.lang.String r0 = r5.getRawString()
            r2.putExtra(r4, r0)
            X.1Vt r0 = r3.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.C16030sJ.A03(r0)
            java.lang.String r4 = "extra_receiver_jid"
        L_0x049d:
            r2.putExtra(r4, r0)
            java.lang.String r4 = r3.A0I()
            java.lang.String r0 = "extra_payment_note"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "extra_conversation_message_type"
            r2.putExtra(r0, r1)
            boolean r0 = r3.A0y()
            if (r0 == 0) goto L_0x04c6
            java.util.List r0 = r3.A0q
            X.AnonymousClass00B.A06(r0)
            java.util.ArrayList r0 = X.C16030sJ.A06(r0)
            java.util.ArrayList r1 = X.C13680ns.A0n(r0)
            java.lang.String r0 = "extra_mentioned_jids"
            r2.putStringArrayListExtra(r0, r1)
        L_0x04c6:
            X.1Vt r0 = r3.A0L
            if (r0 == 0) goto L_0x04d5
            X.1lo r1 = r0.A01()
            if (r1 == 0) goto L_0x04d5
            java.lang.String r0 = "extra_payment_background"
            r2.putExtra(r0, r1)
        L_0x04d5:
            X.0pd r1 = r8.A0C
            r0 = 812(0x32c, float:1.138E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 != 0) goto L_0x04e9
            X.0pd r1 = r8.A0C
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x04ff
        L_0x04e9:
            boolean r0 = r3 instanceof X.C38641rB
            if (r0 == 0) goto L_0x04ff
            X.1rB r3 = (X.C38641rB) r3
            X.1jm r1 = r3.A1A()
            java.lang.String r0 = "extra_payment_sticker"
            r2.putExtra(r0, r1)
            java.lang.Integer r1 = r3.A03
            java.lang.String r0 = "extra_payment_sticker_send_origin"
            r2.putExtra(r0, r1)
        L_0x04ff:
            r8.startActivity(r2)
        L_0x0502:
            r8.finish()
            return
        L_0x0506:
            X.1Vt r0 = r3.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.C16030sJ.A03(r0)
            goto L_0x049d
        L_0x050f:
            r3 = 0
            goto L_0x0425
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentTransactionDetailsListActivity.A39(X.5tS):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r2.A03 != 40) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (r2 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (X.AnonymousClass5wT.A00(r2) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r5.AKV(r6, r16, r17, "payment_transaction_details", r10, (java.lang.String) null, (java.lang.String) null, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3A(java.lang.Integer r16, java.lang.Integer r17) {
        /*
            r15 = this;
            X.5em r0 = r15.A0O
            X.5sx r0 = r0.A07
            r6 = 0
            if (r0 != 0) goto L_0x00cb
            r2 = r6
        L_0x0008:
            X.19r r0 = r15.A36()
            X.69a r5 = r0.ACC()
            if (r5 == 0) goto L_0x008d
            if (r2 == 0) goto L_0x006c
            X.15p r3 = r15.A0R
            int r1 = r2.A03
            r0 = 9
            if (r1 != r0) goto L_0x00a1
            java.lang.String r1 = "cashback"
        L_0x001e:
            java.lang.String r0 = "cashback"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "incentive"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            X.2St r6 = X.C110105dW.A0N()
        L_0x003a:
            java.lang.String r0 = "transaction_type"
            r6.A01(r0, r1)
            X.5em r0 = r15.A0O
            X.5sx r0 = r0.A07
            if (r0 == 0) goto L_0x0069
            X.1cl r4 = r0.A00
            if (r4 == 0) goto L_0x0069
            boolean r0 = r4 instanceof X.C111785hP
            if (r0 == 0) goto L_0x008e
            r0 = r4
            X.5hP r0 = (X.C111785hP) r0
            java.lang.String r3 = r0.A00
            java.lang.String r1 = "confirm"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = "custom_payment_instruction"
        L_0x0064:
            java.lang.String r0 = "payment_type"
            r6.A01(r0, r1)
        L_0x0069:
            r15.A38(r2, r6)
        L_0x006c:
            java.lang.String r10 = r15.A0Y
            if (r2 == 0) goto L_0x0077
            int r1 = r2.A03
            r0 = 40
            r13 = 1
            if (r1 == r0) goto L_0x007a
        L_0x0077:
            r13 = 0
            if (r2 == 0) goto L_0x0081
        L_0x007a:
            boolean r0 = X.AnonymousClass5wT.A00(r2)
            r14 = 1
            if (r0 != 0) goto L_0x0082
        L_0x0081:
            r14 = 0
        L_0x0082:
            r11 = 0
            java.lang.String r9 = "payment_transaction_details"
            r7 = r16
            r8 = r17
            r12 = r11
            r5.AKV(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x008d:
            return
        L_0x008e:
            boolean r0 = r4 instanceof X.C35441lw
            if (r0 != 0) goto L_0x0098
            boolean r0 = r4 instanceof X.C35391lr
            if (r0 != 0) goto L_0x0098
            r1 = 0
            goto L_0x0064
        L_0x0098:
            java.lang.String r1 = "native"
            goto L_0x0064
        L_0x009b:
            X.5id r6 = new X.5id
            r6.<init>()
            goto L_0x003a
        L_0x00a1:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00a9
            r0 = 100
            if (r1 != r0) goto L_0x00bb
        L_0x00a9:
            X.0w8 r1 = r3.A0B
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00bb
        L_0x00b7:
            java.lang.String r1 = "purchase"
            goto L_0x001e
        L_0x00bb:
            X.1W2 r0 = r2.A0A
            if (r0 == 0) goto L_0x00c7
            X.1lz r0 = r0.A00
            if (r0 == 0) goto L_0x00c7
            java.lang.String r1 = "incentive"
            goto L_0x001e
        L_0x00c7:
            java.lang.String r1 = "none"
            goto L_0x001e
        L_0x00cb:
            X.1Vt r2 = r0.A01
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentTransactionDetailsListActivity.A3A(java.lang.Integer, java.lang.Integer):void");
    }

    public boolean A3B() {
        return this.A0L.A0C(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (X.C13690nt.A0E(r4) != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            boolean r0 = r4.A3B()
            X.AnonymousClass00B.A0G(r0)
            java.lang.String r0 = X.C110115dX.A0a(r4)
            r4.A0Y = r0
            X.160 r0 = r4.A0D
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x001e
            if (r5 != 0) goto L_0x003a
            android.os.Bundle r0 = X.C13690nt.A0E(r4)
            if (r0 != 0) goto L_0x003a
        L_0x001e:
            X.1Vo r3 = r4.A0Z
            java.lang.String r0 = "PaymentStore uninitialized or no valid bundle: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            if (r5 != 0) goto L_0x002f
            android.os.Bundle r1 = X.C13690nt.A0E(r4)
            r0 = 1
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r2.append(r0)
            X.C110105dW.A1L(r3, r2)
            r4.finish()
            return
        L_0x003a:
            X.5em r2 = r4.A37(r5)
            r4.A0O = r2
            r0 = 61
            com.facebook.redex.IDxObserverShape118S0100000_3_I1 r1 = X.C110115dX.A07(r4, r0)
            X.027 r0 = r2.A02
            r0.A0A(r4, r1)
            r0 = 60
            com.facebook.redex.IDxObserverShape118S0100000_3_I1 r1 = X.C110115dX.A07(r4, r0)
            X.1cy r0 = r2.A09
            r0.A0A(r4, r1)
            X.5em r2 = r4.A0O
            r1 = 2
            X.5r7 r0 = new X.5r7
            r0.<init>(r1)
            r2.A0G(r0)
            X.0pt r3 = r4.A05
            X.0uY r2 = r4.A0U
            X.0rz r1 = r4.A09
            X.38q r0 = new X.38q
            r0.<init>(r3, r1, r2)
            r4.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentTransactionDetailsListActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C117415sx r0 = this.A0O.A07;
        if (!(r0 == null || r0.A02 == null)) {
            menu.add(0, R.id.menuitem_view_in_chat, 0, R.string.str0fd3);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        AnonymousClass37Z r1;
        AnonymousClass17Y r12;
        C41411vk r0;
        super.onDestroy();
        C110755em r02 = this.A0O;
        if (!(r02 == null || (r12 = r02.A0a) == null || (r0 = r02.A05) == null)) {
            r12.A03(r0);
        }
        C613738q r2 = this.A0A;
        if (r2 != null && (r1 = r2.A00) != null) {
            r1.A02 = true;
            r1.interrupt();
            r2.A00 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent A092;
        C117415sx r0 = this.A0O.A07;
        C16740tZ r4 = r0 != null ? r0.A02 : null;
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                A092 = C110105dW.A04(this, this instanceof IndiaUpiPaymentTransactionDetailsActivity ? IndiaPaymentTransactionHistoryActivity.class : PaymentTransactionHistoryActivity.class);
                A092.putExtra("extra_show_requests", this.A0O.A0A);
                if (Build.VERSION.SDK_INT >= 21) {
                    finishAndRemoveTask();
                }
            }
            return true;
        }
        if (r4 != null) {
            if (menuItem.getItemId() == R.id.menuitem_view_in_chat) {
                long j2 = r4.A13 == 0 ? 1 : r4.A13;
                long A072 = C38621r6.A07(r4);
                C19980zJ r7 = this.A00;
                C14750ph r1 = new C14750ph();
                AnonymousClass00B.A06(r4);
                C28381Vw r42 = r4.A11;
                r7.A07(this, AnonymousClass1yL.A00(r1.A0x(this, r42.A00).putExtra("row_id", j2).putExtra("sort_id", A072), r42));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_debug) {
                AnonymousClass00B.A0G(this.A0L.A0C(0));
                A092 = C13680ns.A09();
                String AET = A36().AET();
                if (TextUtils.isEmpty(AET)) {
                    return false;
                }
                A092.setClassName(this, AET);
                A092.putExtra("extra_transaction_id", r4.A0n);
                C28381Vw r02 = r4.A11;
                if (r02 != null) {
                    AnonymousClass1yL.A00(A092, r02);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
        startActivity(A092);
        return true;
    }
}
