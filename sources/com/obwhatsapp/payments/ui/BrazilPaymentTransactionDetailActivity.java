package com.obwhatsapp.payments.ui;

import X.AnonymousClass1Vt;
import X.AnonymousClass1W1;
import X.AnonymousClass2St;
import X.AnonymousClass5wT;
import X.C005602k;
import X.C110105dW;
import X.C110115dX;
import X.C111365g4;
import X.C113475m7;
import X.C117225se;
import X.C117415sx;
import X.C117725tS;
import X.C117755tV;
import X.C118955vg;
import X.C1222969a;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape30S0200000_3_I1;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;

public class BrazilPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public C117225se A00;
    public C1222969a A01;
    public C118955vg A02;
    public C117755tV A03;
    public boolean A04;

    public BrazilPaymentTransactionDetailActivity() {
        this(0);
    }

    public BrazilPaymentTransactionDetailActivity(int i2) {
        this.A04 = false;
        C110105dW.A0t(this, 28);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111365g4.A09(r1, this);
            C111365g4.A02(A0C, r1, this);
            C111365g4.A03(A0C, r1, this, r1.AE1);
            this.A02 = (C118955vg) r1.A2T.get();
            this.A03 = (C117755tV) r1.A2X.get();
            this.A01 = (C1222969a) r1.A2U.get();
            this.A00 = A0C.A0P();
        }
    }

    public C005602k A35(ViewGroup viewGroup, int i2) {
        return i2 == 217 ? new C113475m7(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0468)) : super.A35(viewGroup, i2);
    }

    public void A39(C117725tS r6) {
        int i2 = r6.A00;
        if (i2 != 0) {
            if (i2 != 10) {
                if (i2 != 201) {
                    switch (i2) {
                        case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                            break;
                        case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                            A3C(r6, 124, "wa_p2m_receipt_report_transaction");
                            break;
                        case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                            Intent A042 = C110105dW.A04(this, BrazilPaymentSettingsActivity.class);
                            A042.putExtra("referral_screen", "chat");
                            startActivity(A042);
                            finish();
                            return;
                    }
                } else {
                    AnonymousClass1Vt r4 = r6.A05;
                    if (r4 != null) {
                        C32241fu A002 = C32241fu.A00(this);
                        A002.A02(R.string.str0399);
                        C110115dX.A0m(getBaseContext(), A002, R.string.str0398);
                        A002.setNegativeButton(R.string.str1c24, (DialogInterface.OnClickListener) null);
                        A002.setPositiveButton(R.string.str0396, new IDxCListenerShape30S0200000_3_I1(r4, 7, this));
                        C13690nt.A1G(A002);
                        A3A(C13680ns.A0Y(), 161);
                        return;
                    }
                    return;
                }
            }
            if (i2 == 22) {
                C117415sx r0 = this.A0O.A07;
                AnonymousClass1Vt r2 = r0 != null ? r0.A01 : r6.A05;
                String str = null;
                if (r2 != null && AnonymousClass5wT.A00(r2)) {
                    str = r2.A03 == 200 ? "wa_smb_p2m_payment_details" : "wa_p2m_receipt_support";
                }
                A3C(r6, 39, str);
            } else {
                A3A(C13680ns.A0Y(), 39);
            }
        } else {
            A3A(0, (Integer) null);
        }
        super.A39(r6);
    }

    public final void A3C(C117725tS r9, Integer num, String str) {
        AnonymousClass2St A0N;
        C117415sx r0 = this.A0O.A07;
        AnonymousClass1Vt r2 = r0 != null ? r0.A01 : r9.A05;
        if (r2 == null || !AnonymousClass5wT.A00(r2)) {
            A0N = C110105dW.A0N();
        } else {
            A0N = C110105dW.A0N();
            A0N.A01("product_flow", "p2m");
            A0N.A01("transaction_id", r2.A0K);
            A0N.A01("transaction_status", AnonymousClass1W1.A04(r2.A03, r2.A02));
            A0N.A01("transaction_status_name", this.A0R.A0K(r2));
        }
        A0N.A01("hc_entrypoint", str);
        A0N.A01("app_type", "consumer");
        this.A01.AKU(A0N, C13680ns.A0Y(), num, "payment_transaction_details", (String) null);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0Y = C13680ns.A0Y();
        A3A(A0Y, A0Y);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            Integer A0Y = C13680ns.A0Y();
            A3A(A0Y, A0Y);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
