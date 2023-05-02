package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass1MA;
import X.AnonymousClass1N2;
import X.AnonymousClass1TS;
import X.AnonymousClass1Vt;
import X.AnonymousClass1XP;
import X.AnonymousClass2H9;
import X.AnonymousClass2ZJ;
import X.AnonymousClass5xG;
import X.AnonymousClass5xI;
import X.AnonymousClass5y1;
import X.AnonymousClass62D;
import X.AnonymousClass65O;
import X.AnonymousClass681;
import X.AnonymousClass69S;
import X.AnonymousClass69T;
import X.C110105dW;
import X.C110115dX;
import X.C110715ei;
import X.C111345g2;
import X.C111845hV;
import X.C114235nP;
import X.C117315sn;
import X.C118395uc;
import X.C119215wj;
import X.C119505ya;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14750ph;
import X.C15830rv;
import X.C16150sX;
import X.C16320sq;
import X.C16460t6;
import X.C16830ti;
import X.C16840tj;
import X.C16880tn;
import X.C17030uP;
import X.C19150xq;
import X.C218315p;
import X.C221116r;
import X.C28381Vw;
import X.C28401Vy;
import X.C30671cl;
import X.C32241fu;
import X.C35231la;
import X.C35251lc;
import X.C35431lv;
import X.C453428a;
import X.C49132Rg;
import X.C62013Bh;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxCBackShape39S0300000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.obwhatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.List;

public class BrazilOrderDetailsActivity extends BrazilPaymentActivity implements AnonymousClass69T, AnonymousClass69S, AnonymousClass681 {
    public long A00;
    public C17030uP A01;
    public C19150xq A02;
    public C221116r A03;
    public AnonymousClass1MA A04;
    public C114235nP A05;
    public C118395uc A06;
    public PaymentCheckoutOrderDetailsViewV2 A07;
    public AnonymousClass2ZJ A08;
    public C110715ei A09;
    public AnonymousClass1N2 A0A;
    public AnonymousClass5xI A0B;
    public C218315p A0C;
    public C28381Vw A0D;
    public C16830ti A0E;
    public AnonymousClass1TS A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;

    public BrazilOrderDetailsActivity() {
        this(0);
    }

    public BrazilOrderDetailsActivity(int i2) {
        this.A0I = false;
        C110105dW.A0t(this, 16);
    }

    public void A1q() {
        if (!this.A0I) {
            this.A0I = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r2 = A0C2.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A0C2, r2, this, C110105dW.A0F(r2));
            C111345g2.A1k(A0C2, r2, this, C111345g2.A1e(r2, this));
            C111345g2.A1p(r2, this);
            C111345g2.A1o(r2, this);
            C111345g2.A1j(A0C2, r2, (AnonymousClass5xG) r2.AHX.get(), this);
            this.A0A = (AnonymousClass1N2) r2.AHZ.get();
            this.A0C = (C218315p) r2.AIL.get();
            this.A02 = (C19150xq) r2.AFC.get();
            this.A01 = (C17030uP) r2.APp.get();
            this.A03 = (C221116r) r2.AHt.get();
            this.A04 = (AnonymousClass1MA) r2.AHr.get();
            this.A0F = (AnonymousClass1TS) r2.AGj.get();
            this.A08 = A0C2.A0S();
        }
    }

    public void A3L(C28401Vy r3, C30671cl r4, AnonymousClass1XP r5, String str, String str2, String str3, int i2) {
        this.A05.Acl(new AnonymousClass65O(this, str2));
        super.A3L(r3, r4, r5, str, str2, str3, i2);
    }

    public void A3N(C111845hV r2, int i2) {
        super.A3N(r2, i2);
        r2.A02 = A3F();
    }

    public final void A3O(C35431lv r9, C16840tj r10) {
        Afq(R.string.str13db);
        C16320sq r7 = this.A05;
        C16460t6 r2 = this.A09;
        AnonymousClass1MA r5 = this.A04;
        C62013Bh.A02(this.A05, r2, this.A03, new IDxCBackShape39S0300000_3_I1(r9, this, r10, 0), r5, r10, r7);
    }

    public void AOP(C35431lv r14, C15830rv r15, C117315sn r16, C16840tj r17, String str) {
        String str2;
        C117315sn r11 = r16;
        if (r16 == null) {
            str2 = "invalid payment method";
        } else {
            int i2 = r11.A00;
            C35431lv r8 = r14;
            C15830rv r9 = r15;
            C16840tj r6 = r17;
            if (i2 == -1) {
                List list = r11.A03;
                AnonymousClass00B.A06(list);
                String str3 = ((C119505ya) C13690nt.A0Z(list)).A07;
                AnonymousClass00B.A06(list);
                PaymentOptionsBottomSheet A012 = PaymentOptionsBottomSheet.A01(str3, "order_details", list, this.A0C.A0C(1345));
                A012.A03 = new AnonymousClass62D(r8, r9, this, r11, r6);
                C453428a.A01(A012, AGM());
            } else if (i2 == 0) {
                A3O(r14, r6);
            } else if (i2 == 2) {
                C35231la r0 = r11.A01;
                if (r0 == null) {
                    str2 = "invalid external payemnt configuration payload";
                } else {
                    AnonymousClass00B.A06(r15);
                    String str4 = r0.A00;
                    AnonymousClass00B.A06(str4);
                    AnonymousClass00B.A06(r15);
                    AnonymousClass00B.A06(str4);
                    C453428a.A01(PaymentCustomInstructionsBottomSheet.A01(r15, str4, "order_details", this.A0C.A0C(1345)), AGM());
                }
            } else if (i2 != 3) {
                C110105dW.A1O("BrazilOrderDetailsActivity", "onCheckoutCtaButtonClicked : the selected payment method is not supported");
            } else {
                C110715ei r02 = this.A09;
                AnonymousClass00B.A06(r15);
                r02.A07(r15, r6, 3);
                finish();
            }
            this.A0F.A02(r6, i2 != 0 ? i2 != 2 ? i2 != 3 ? null : "confirm" : "non-native" : "native", 5, true, true);
            return;
        }
        C110105dW.A1O("BrazilOrderDetailsActivity", str2);
    }

    public void ATg(C15830rv r7, C16840tj r8, long j2) {
        this.A0F.A02(r8, (String) null, 8, false, false);
        Intent A0x = new C14750ph().A0x(this, r7);
        A0x.putExtra("extra_quoted_message_row_id", j2);
        startActivity(A0x);
    }

    public void AUC(C15830rv r12, C16840tj r13, String str) {
        this.A0F.A02(r13, (String) null, 7, true, false);
        C16880tn AAt = r13.AAt();
        AnonymousClass00B.A06(AAt);
        C35251lc r7 = AAt.A01;
        AnonymousClass1N2 r5 = this.A0A;
        AnonymousClass00B.A06(r7);
        Intent A002 = r5.A00(this, r7, !TextUtils.isEmpty(r7.A01) ? this.A0D : null, (String) null, str);
        if (A002 == null) {
            Log.e("Pay: BrazilOrderDetailsActivity/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            startActivity(A002);
        }
    }

    public void AUb(C35431lv r1, C16840tj r2, String str, String str2, List list) {
    }

    public void Ac4() {
        Ac1();
    }

    public boolean AfM(int i2) {
        return i2 == 405 || i2 == 401 || i2 == 403 || i2 == 420;
    }

    public void Afk(C15830rv r5, int i2, long j2) {
        int i3 = R.string.str0ead;
        int i4 = R.string.str0eac;
        if (i2 == 401 || i2 == 403 || i2 == 420) {
            i3 = R.string.str0eab;
            i4 = R.string.str0eaa;
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A07(false);
        A002.setTitle(getString(i3));
        C110115dX.A0m(this, A002, i4);
        C110105dW.A0w(A002, this, 5, R.string.str0e87);
        A002.setNegativeButton(R.string.str03d3, new AnonymousClass5y1(r5, this, j2));
        C13690nt.A1G(A002);
    }

    public void Afu() {
        Afq(R.string.str13db);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (this.A0J && i3 == 0) {
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C119215wj r3;
        AnonymousClass5xI r0 = this.A0B;
        if (!(r0 == null || (r3 = (C119215wj) r0.A01) == null)) {
            Bundle A0D2 = C13690nt.A0D();
            Boolean bool = r3.A04;
            if (bool != null) {
                A0D2.putBoolean("should_show_shimmer_key", bool.booleanValue());
            }
            A0D2.putParcelable("checkout_error_code_key", r3.A01);
            A0D2.putParcelable("merchant_jid_key", r3.A00);
            A0D2.putSerializable("merchant_status_key", r3.A02);
            C16830ti r02 = r3.A03;
            if (r02 != null) {
                AnonymousClass1Vt r03 = r02.A0L;
                A0D2.putParcelable("payment_transaction_key", r03 == null ? null : new AnonymousClass2H9(r03));
            }
            bundle.putBundle("save_order_detail_state_key", A0D2);
        }
        super.onSaveInstanceState(bundle);
    }
}
