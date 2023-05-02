package com.obwhatsapp.payments.ui;

import X.AnonymousClass1ZW;
import X.AnonymousClass29T;
import X.AnonymousClass5xP;
import X.AnonymousClass5xQ;
import X.AnonymousClass60V;
import X.AnonymousClass60X;
import X.AnonymousClass62O;
import X.AnonymousClass62P;
import X.AnonymousClass62Q;
import X.AnonymousClass64S;
import X.AnonymousClass69U;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C112285iF;
import X.C112715ix;
import X.C112825ja;
import X.C114245nR;
import X.C114255nS;
import X.C114305nY;
import X.C114585o0;
import X.C114595o1;
import X.C116285r8;
import X.C116295r9;
import X.C116715rp;
import X.C116825s0;
import X.C116835s1;
import X.C116845s2;
import X.C117325so;
import X.C117685tO;
import X.C117715tR;
import X.C119265wo;
import X.C1205762e;
import X.C1220768e;
import X.C1223969k;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C14860ps;
import X.C15830rv;
import X.C15910s6;
import X.C16150sX;
import X.C28401Vy;
import X.C28411Vz;
import X.C31081dR;
import X.C32241fu;
import X.C33481ie;
import X.C34151jm;
import X.C35301lh;
import X.C35481m0;
import X.C39841t9;
import X.C49132Rg;
import X.C53842gO;
import X.C811947f;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.redex.IDxCCallbackShape392S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape130S0100000_3_I1;
import com.facebook.redex.IDxNConsumerShape3S0110000_3_I1;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape70S0100000_3_I1;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.obwhatsapp.payments.ui.widget.PaymentView$$ExternalSyntheticLambda7;
import java.math.BigDecimal;
import java.util.List;

public class IndiaUpiSendPaymentActivity extends C112825ja implements C1220768e {
    public int A00;
    public C114305nY A01;
    public C114595o1 A02;
    public C114255nS A03;
    public AnonymousClass62Q A04;
    public C14860ps A05;
    public BigDecimal A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C33481ie A0A;
    public final C1223969k A0B;
    public final AnonymousClass69U A0C;

    public IndiaUpiSendPaymentActivity() {
        this(0);
        this.A00 = 0;
        this.A08 = false;
        this.A09 = false;
        this.A0A = new IDxCObserverShape70S0100000_3_I1(this, 1);
        this.A0C = new AnonymousClass62P(this);
        this.A0B = new AnonymousClass62O(this);
    }

    public IndiaUpiSendPaymentActivity(int i2) {
        this.A07 = false;
        C110105dW.A0t(this, 77);
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C2, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1n(A0C2, r1, this);
            C111345g2.A1m(A0C2, r1, this, C111345g2.A1f(r1, this));
            this.A05 = (C14860ps) r1.API.get();
        }
    }

    public final void A4B() {
        int i2;
        if (this.A08) {
            int i3 = this.A00;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        i2 = 36;
                    } else if (i3 == 3) {
                        i2 = 22;
                    } else if (i3 != 4) {
                        this.A08 = false;
                        AnonymousClass29T.A00(this, 37);
                        PaymentView paymentView = this.A0X;
                        if (paymentView != null) {
                            paymentView.A03();
                            return;
                        }
                        return;
                    } else {
                        i2 = 35;
                    }
                    AnonymousClass29T.A00(this, 37);
                    AnonymousClass29T.A01(this, i2);
                    this.A00 = 0;
                    return;
                }
                AnonymousClass29T.A01(this, 37);
            } else if (this.A01 == null) {
                AnonymousClass29T.A01(this, 37);
                C114305nY r1 = new C114305nY(this);
                this.A01 = r1;
                C13700nu.A0W(r1, this.A05);
            }
        }
    }

    public final void A4C() {
        if (this.A09) {
            A4F(true);
            if (C111345g2.A21(this) && this.A00 != 5) {
                C114305nY r1 = new C114305nY(this);
                this.A01 = r1;
                C13700nu.A0W(r1, this.A05);
                return;
            }
            return;
        }
        if (C39841t9.A03(this.A07)) {
            if (A47()) {
                String A002 = AnonymousClass60V.A00(this.A0C);
                if (A002 == null || !A002.equals(this.A09.A00)) {
                    Afq(R.string.str0fd6);
                    this.A0O.A01(this.A09, (C35301lh) null, new AnonymousClass60X(this, new AnonymousClass64S(this)));
                    return;
                }
                A46(new C119265wo(R.string.str0fab), (String) null, new Object[0]);
                return;
            } else if (this.A0C != null) {
                C114595o1 r12 = new C114595o1(this, false);
                this.A02 = r12;
                C13700nu.A0W(r12, this.A05);
            } else {
                finish();
                return;
            }
        }
        A4F(true);
    }

    public final void A4D(String str, String str2) {
        C53842gO A032 = this.A0E.A03(4, 51, "new_payment", this.A0g);
        A032.A0S = str;
        A032.A0T = str2;
        C111345g2.A1s(A032, this);
    }

    public final void A4E(String str, boolean z2) {
        if (str != null) {
            this.A0Y.A01(str);
            this.A0P.A01().A01(str).A00(new IDxNConsumerShape3S0110000_3_I1(this, 1, z2));
            return;
        }
        this.A05.A05();
        A46(new C119265wo(R.string.str1031), (String) null, new Object[0]);
    }

    public final void A4F(boolean z2) {
        int i2;
        String str;
        int i3;
        PaymentView paymentView;
        PaymentView paymentView2 = this.A0X;
        if (paymentView2 != null && !this.A0r) {
            if (this.A00 == null) {
                setContentView((View) paymentView2);
            }
            A3q();
            if (z2) {
                if (!C110115dX.A18(this.A0C) || this.A0C.A0C(979)) {
                    AnonymousClass5xP.A02(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, this.A0U, (String) null, true), this.A0E, "new_payment", this.A0g);
                } else {
                    A3C(this.A0C);
                }
            }
            String str2 = this.A0h;
            if (!(str2 == null || (paymentView = this.A0X) == null)) {
                paymentView.A1G = str2;
            }
            List list = this.A0j;
            if (list != null) {
                list.clear();
            }
            if (this.A0V != null || (!C111345g2.A21(this) && !this.A0C.A0Q())) {
                Ac1();
            } else {
                C114585o0 r1 = new C114585o0(this);
                this.A0V = r1;
                C13680ns.A1U(r1, this.A05);
            }
            if (z2) {
                if (this.A0F != null) {
                    if (TextUtils.isEmpty(this.A0g)) {
                        this.A0g = "chat";
                    }
                    i2 = 53;
                    i3 = 1;
                    str = "new_payment";
                } else {
                    i2 = null;
                    str = "enter_user_payment_id";
                    i3 = 0;
                }
                this.A0E.AKS(Integer.valueOf(i3), i2, str, this.A0g);
            }
        }
    }

    public final boolean A4G() {
        return getIntent().getIntExtra("extra_transaction_type", 0) == 20 && this.A0C.A0C(1847) && this.A0I.A0D();
    }

    public /* bridge */ /* synthetic */ Object Aat() {
        C1205762e r18;
        C28411Vz A012 = this.A02.A01("INR");
        C116715rp r2 = this.A0U;
        if (r2.A00) {
            r2.A00 = false;
            if (TextUtils.isEmpty(this.A0h)) {
                this.A0h = getString(R.string.str15ba);
            }
            if (TextUtils.isEmpty(this.A0k)) {
                this.A0k = A012.ADn().toString();
            }
        }
        C28401Vy A0C2 = !TextUtils.isEmpty(this.A0k) ? C110115dX.A0C(A012, new BigDecimal(this.A0k)) : A012.ADn();
        C28401Vy A0C3 = C110115dX.A0C(A012, new BigDecimal(this.A06.A02(C15910s6.A1r)));
        if (!A47()) {
            C14710pd r8 = this.A0C;
            r18 = new C1205762e(this, this.A08, this.A01, this.A0B, r8, this.A03, this.A0b, this.A0d);
        } else {
            r18 = null;
        }
        String str = (!this.A0C.A0C(1955) || !this.A09 || AnonymousClass1ZW.A0E(this.A0i)) ? this.A0j : "500500";
        String A1d = C111345g2.A1d(this);
        if (!AnonymousClass1ZW.A0E(A1d)) {
            str = A1d;
        }
        this.A04 = new AnonymousClass62Q(this, this.A01, A012, this.A0Y.A00(str, this.A0k, this.A0i), A0C2, A0C3);
        C15830rv r44 = this.A0E;
        String str2 = this.A0h;
        C34151jm r17 = this.A0c;
        Integer num = this.A0e;
        String str3 = this.A0m;
        C1223969k r13 = this.A0B;
        C116845s2 r7 = new C116845s2(this.A0r ^ true ? 1 : 0, getIntent().getIntExtra("extra_transfer_direction", 0));
        C116295r9 r6 = new C116295r9(!C111345g2.A21(this));
        C116825s0 r4 = new C116825s0(NumberEntryKeyboard.A00(this.A01), this.A0p);
        AnonymousClass69U r11 = this.A0C;
        String str4 = this.A0l;
        String str5 = this.A0i;
        String str6 = this.A0k;
        C116285r8 r3 = new C116285r8(A012);
        Integer valueOf = Integer.valueOf(R.style.style019d);
        return new C117715tR(r44, r18, r13, r11, new C117685tO(new Pair(valueOf, new int[]{0, 0, 0, 0}), new Pair(valueOf, new int[]{0, 0, 0, 0}), r3, this.A04, str4, str5, str6, R.style.style019c, false, false, false), new C117325so(this.A0C, this.A0P, this.A0Q, this.A0C.A0C(629)), r4, r6, new C116835s1(this, this.A0C.A0C(811)), r7, r17, num, str2, str3, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != 1018) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1008(0x3f0, float:1.413E-42)
            if (r4 == r0) goto L_0x0010
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r4 == r0) goto L_0x0029
            r0 = 1018(0x3fa, float:1.427E-42)
            if (r4 == r0) goto L_0x0010
        L_0x000c:
            super.onActivityResult(r4, r5, r6)
            return
        L_0x0010:
            boolean r0 = r3.A4G()
            if (r0 == 0) goto L_0x000c
            X.1Vy r2 = r3.A0A
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r3.Afq(r0)
            X.0sq r1 = r3.A05
            X.65e r0 = new X.65e
            r0.<init>(r2, r3)
            r1.Acl(r0)
            return
        L_0x0029:
            r3.A3p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06.A03 = this.A0F;
        if (bundle == null) {
            String A0b = C110115dX.A0b(this);
            if (A0b == null) {
                A0b = this.A0g;
            }
            this.A0F.A03(A0b, 185472016);
            C112715ix r6 = this.A0F;
            boolean z2 = !A47();
            C31081dR A002 = r6.A00(123, "p2p_flow_tag");
            if (A002 != null) {
                A002.A07.AKq("wa_to_wa", A002.A06.A05, 123, z2);
            }
        }
        this.A02.A02(this.A0A);
        C005402i x2 = x();
        if (x2 != null) {
            boolean z3 = this.A0r;
            int i2 = R.string.str0ddf;
            if (z3) {
                i2 = R.string.str10d2;
            }
            x2.A0B(i2);
            x2.A0N(true);
            if (!this.A0r) {
                x2.A08(0.0f);
            }
        }
        PaymentView paymentView = (PaymentView) LayoutInflater.from(this).inflate(R.layout.layout0541, (ViewGroup) null, false);
        this.A0X = paymentView;
        paymentView.A0s = this;
        getLifecycle().A00(new PaymentView$$ExternalSyntheticLambda7(paymentView));
        this.A09 = getIntent().getBooleanExtra("verify-vpa-in-background", false);
        if (this.A0C.A0C(1933) && AnonymousClass5xQ.A04(this.A0g)) {
            this.A06 = new BigDecimal(this.A06.A02(C15910s6.A1p));
        }
        this.A0p = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
        this.A0e = getIntent().getStringExtra("extra_merchant_code");
        if (A47()) {
            C114245nR r3 = new C114245nR();
            this.A03 = r3;
            PaymentView paymentView2 = this.A0X;
            if (paymentView2 != null) {
                ViewStub viewStub = (ViewStub) paymentView2.findViewById(R.id.payment_bottom_button);
                if (viewStub != null) {
                    C811947f.A00(viewStub, r3);
                } else {
                    r3.AZf(paymentView2.findViewById(R.id.payment_bottom_button_inflated));
                }
                this.A03.A00 = C110115dX.A06(this.A0X, 138);
            }
            this.A0O = new C112285iF(this, this.A05, this.A02, this.A0H, this.A0F, this.A0B, this.A0K, this.A0M, this.A0F, this.A0C);
            return;
        }
        this.A03 = new C114255nS();
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r5;
        int i3;
        int i4;
        C32241fu A002;
        int i5;
        int i6;
        if (i2 != 29) {
            switch (i2) {
                case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                    A002 = C32241fu.A00(this);
                    A002.A02(R.string.str19a8);
                    A002.A01(R.string.str19a7);
                    i3 = R.string.str0e87;
                    i4 = 63;
                    break;
                case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                    A002 = C32241fu.A00(this);
                    A002.A02(R.string.str117b);
                    A002.A01(R.string.str116f);
                    i3 = R.string.str0e87;
                    i4 = 64;
                    break;
                case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(R.string.str13db));
                    progressDialog.setCancelable(false);
                    progressDialog.setButton(-1, getString(R.string.str0394), new IDxCListenerShape130S0100000_3_I1(this, 69));
                    return progressDialog;
                default:
                    switch (i2) {
                        case 39:
                            A4D("-10021", "MAX_AMOUNT_2K_ALERT");
                            r5 = C32241fu.A00(this);
                            r5.A06(C13680ns.A0d(this, C35481m0.A05.A9I(this.A01, this.A06, 0), new Object[1], 0, R.string.str1083));
                            i5 = R.string.str0e87;
                            i6 = 67;
                            break;
                        case 40:
                            A4D("-10021", "MAX_AMOUNT_2K_ALERT");
                            r5 = C32241fu.A00(this);
                            r5.A06(C13680ns.A0d(this, C35481m0.A05.A9I(this.A01, new BigDecimal(C111345g2.A1d(this)), 0), new Object[1], 0, R.string.str1084));
                            i5 = R.string.str0e87;
                            i6 = 70;
                            break;
                        case 41:
                            A4D("-10021", "MAX_AMOUNT_2K_ALERT");
                            r5 = C32241fu.A00(this);
                            r5.A06(C13680ns.A0d(this, C35481m0.A05.A9I(this.A01, new BigDecimal(C111345g2.A1d(this)), 0), new Object[1], 0, R.string.str1082));
                            i5 = R.string.str0e87;
                            i6 = 68;
                            break;
                        default:
                            return super.onCreateDialog(i2);
                    }
                    C110105dW.A0w(r5, this, i6, i5);
                    r5.A07(false);
                    break;
            }
            C110105dW.A0w(r5, this, i4, i3);
            r5.A07(true);
        } else {
            r5 = C32241fu.A00(this);
            r5.A02(R.string.str18c1);
            r5.A01(R.string.str18c0);
            C110105dW.A0w(r5, this, 66, R.string.str1cf6);
            C110105dW.A0v(r5, this, 65, R.string.str0e87);
        }
        return r5.create();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.A06(123, 4);
        this.A02.A03(this.A0A);
        C114595o1 r0 = this.A02;
        if (r0 != null) {
            r0.A06(true);
        }
        C114305nY r02 = this.A01;
        if (r02 != null) {
            r02.A06(true);
        }
    }

    public void onPause() {
        super.onPause();
        PaymentView paymentView = this.A0X;
        if (paymentView != null) {
            paymentView.A03 = paymentView.A0w.A9l().getCurrentFocus();
        }
    }

    public void onResume() {
        super.onResume();
        if (C111345g2.A21(this)) {
            if (!this.A06.A07.contains("upi-get-challenge") && this.A0C.A06().A00 == null) {
                this.A0t.A06("onResume getChallenge");
                Afq(R.string.str13db);
                this.A06.A03("upi-get-challenge");
                A3Y();
                return;
            } else if (TextUtils.isEmpty((CharSequence) this.A0C.A05().A00)) {
                this.A08.A01(this, this.A06, new IDxCCallbackShape392S0100000_3_I1(this, 0));
                return;
            }
        }
        A3c();
    }
}
