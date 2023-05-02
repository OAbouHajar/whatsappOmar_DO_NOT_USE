package com.obwhatsapp.payments.ui;

import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass1N6;
import X.AnonymousClass1Vo;
import X.AnonymousClass2SR;
import X.AnonymousClass61W;
import X.C001500q;
import X.C005602k;
import X.C006602z;
import X.C110105dW;
import X.C110755em;
import X.C111365g4;
import X.C113355lu;
import X.C113385lx;
import X.C113445m4;
import X.C113465m6;
import X.C113485m8;
import X.C113575mH;
import X.C114085n6;
import X.C114175nF;
import X.C116275r7;
import X.C117765tW;
import X.C1219967w;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import X.C53842gO;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxIFactoryShape5S0200000_3_I1;
import com.facebook.redex.IDxKListenerShape225S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.dialogs.ProgressDialogFragment;

public class IndiaUpiPaymentTransactionDetailsActivity extends PaymentTransactionDetailsListActivity implements C1219967w {
    public AnonymousClass61W A00;
    public C114175nF A01;
    public C117765tW A02;
    public AnonymousClass1N6 A03;
    public boolean A04;
    public final C53842gO A05;
    public final AnonymousClass1Vo A06;

    public IndiaUpiPaymentTransactionDetailsActivity() {
        this(0);
        this.A06 = C110105dW.A0P("IndiaUpiPaymentTransactionDetailsActivity");
        this.A05 = new C53842gO();
    }

    public IndiaUpiPaymentTransactionDetailsActivity(int i2) {
        this.A04 = false;
        C110105dW.A0t(this, 62);
    }

    public void A1R(AnonymousClass01A r3) {
        super.A1R(r3);
        if (r3 instanceof ProgressDialogFragment) {
            ((ProgressDialogFragment) r3).A00 = new IDxKListenerShape225S0100000_3_I1(this, 1);
        }
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
            this.A03 = (AnonymousClass1N6) r1.A8V.get();
            this.A00 = C110105dW.A0O(r1);
            this.A02 = (C117765tW) r1.ACL.get();
        }
    }

    public C005602k A35(ViewGroup viewGroup, int i2) {
        switch (i2) {
            case 1000:
                return new C113445m4(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0332));
            case 1001:
                View A0H = C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0319);
                AnonymousClass2SR.A08(C13680ns.A0K(A0H, R.id.payment_empty_icon), C13680ns.A0D(viewGroup).getColor(R.color.color04cd));
                return new C113485m8(A0H);
            case 1004:
                return new C113575mH(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0325));
            case 1005:
                return new C113385lx(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout034f));
            case 1006:
                return new C113355lu(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout031b));
            case 1007:
                return new C113465m6(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0333));
            default:
                return super.A35(viewGroup, i2);
        }
    }

    public C110755em A37(Bundle bundle) {
        C006602z r1;
        Class cls;
        if (bundle == null) {
            bundle = C13690nt.A0E(this);
        }
        if (bundle == null || !bundle.getBoolean("extra_new_mandate_transaction", false)) {
            r1 = new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(bundle, 4, this.A02), (C001500q) this);
            cls = C114175nF.class;
        } else {
            r1 = new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(bundle, 3, this.A02), (C001500q) this);
            cls = C114085n6.class;
        }
        C114175nF r0 = (C114175nF) r1.A01(cls);
        this.A01 = r0;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0142, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e1, code lost:
        r1.A01(r0);
        r1.setPositiveButton(com.obwhatsapp.R.string.str0e87, (android.content.DialogInterface.OnClickListener) null);
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ed, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A39(X.C117725tS r12) {
        /*
            r11 = this;
            X.1Vt r5 = r12.A05
            if (r5 == 0) goto L_0x000e
            X.2gO r1 = r11.A05
            boolean r0 = r5.A0Q
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
        L_0x000e:
            int r2 = r12.A00
            if (r2 == 0) goto L_0x008f
            r0 = 4
            java.lang.String r4 = "payment_transaction_details"
            r3 = 1
            if (r2 == r0) goto L_0x0076
            r0 = 9
            if (r2 == r0) goto L_0x0056
            r0 = 10
            if (r2 != r0) goto L_0x002d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002a:
            r11.A3A(r1, r0)
        L_0x002d:
            boolean r0 = r12 instanceof X.C114125nA
            r1 = 7
            r10 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            if (r0 == 0) goto L_0x0045
            r5 = r12
            X.5nA r5 = (X.C114125nA) r5
            r4 = 4
            java.lang.String r8 = "payment_transaction_details"
            r3 = 0
            switch(r2) {
                case 101: goto L_0x0095;
                case 102: goto L_0x00f1;
                case 103: goto L_0x00fd;
                case 104: goto L_0x0041;
                case 105: goto L_0x0119;
                case 106: goto L_0x0139;
                case 107: goto L_0x0146;
                case 108: goto L_0x0165;
                case 109: goto L_0x0154;
                case 110: goto L_0x0173;
                case 111: goto L_0x0184;
                case 112: goto L_0x018e;
                case 113: goto L_0x01a5;
                case 114: goto L_0x01d4;
                default: goto L_0x0041;
            }
        L_0x0041:
            super.A39(r12)
            return
        L_0x0045:
            if (r2 != r1) goto L_0x0041
            X.1cl r0 = r12.A04
            X.AnonymousClass00B.A06(r0)
            X.1m4 r0 = (X.C35521m4) r0
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A02(r11, r0, r10)
            r11.startActivity(r0)
            return
        L_0x0056:
            X.2gO r1 = r11.A05
            X.C110115dX.A10(r1, r3)
            r0 = 59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A0a = r4
            java.lang.String r0 = r11.A0Y
            r1.A0Z = r0
            if (r5 == 0) goto L_0x0089
            boolean r0 = X.AnonymousClass5wT.A00(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A06 = r0
            goto L_0x0089
        L_0x0076:
            X.2gO r1 = r11.A05
            X.C110115dX.A10(r1, r3)
            r0 = 60
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A0a = r4
            java.lang.String r0 = r11.A0Y
            r1.A0Z = r0
        L_0x0089:
            X.61W r0 = r11.A00
            r0.AKR(r1)
            goto L_0x002d
        L_0x008f:
            java.lang.Integer r1 = X.C13680ns.A0X()
            r0 = 0
            goto L_0x002a
        L_0x0095:
            X.1Vo r1 = r11.A06
            java.lang.String r0 = "return back to caller without getting the finalized status"
            r1.A06(r0)
            r3 = -1
            java.lang.String r1 = r5.A02
            java.lang.String r7 = r5.A05
            java.lang.String r6 = r5.A04
            java.lang.String r5 = r5.A03
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r0 = "txnId="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            r0 = 0
            r4[r0] = r1
            java.lang.String r0 = "txnRef="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r0)
            r4[r10] = r0
            java.lang.String r0 = "Status="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r6, r0)
            r0 = 2
            r4[r0] = r1
            java.lang.String r0 = "responseCode="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r5, r0)
            r0 = 3
            r4[r0] = r1
            java.util.List r1 = java.util.Arrays.asList(r4)
            java.lang.String r0 = "&"
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = "response"
            r2.putExtra(r0, r1)
            r11.setResult(r3, r2)
            goto L_0x0142
        L_0x00f1:
            X.1N6 r1 = r11.A03
            java.lang.String r0 = r5.A06
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.A01(r11, r0)
            return
        L_0x00fd:
            X.1Vt r1 = r5.A05
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0108
            r4 = 9
        L_0x0108:
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A02(r11, r1, r8, r4)
            r11.startActivity(r0)
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A3A(r6, r0)
            return
        L_0x0119:
            X.19h r1 = r11.A0H
            r0 = 0
            android.content.Intent r2 = r1.A02(r11, r0, r0)
            X.1lh r1 = r5.A00
            java.lang.String r0 = "extra_payment_handle"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r5.A0E
            java.lang.String r0 = "extra_payment_handle_id"
            r2.putExtra(r0, r1)
            X.1lh r1 = r5.A07
            java.lang.String r0 = "extra_payee_name"
            r2.putExtra(r0, r1)
            r11.A2V(r2)
            return
        L_0x0139:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r11, r0)
            r11.startActivity(r0)
        L_0x0142:
            r11.finish()
            return
        L_0x0146:
            r11.A3C()
            com.obwhatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = new com.obwhatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment
            r0.<init>()
            r0.A04 = r11
            r11.Afc(r0)
            return
        L_0x0154:
            r11.A3C()
            X.1fu r1 = X.C32241fu.A00(r11)
            r0 = 2131892569(0x7f121959, float:1.941989E38)
            r1.A02(r0)
            r0 = 2131892567(0x7f121957, float:1.9419886E38)
            goto L_0x01e1
        L_0x0165:
            X.1fu r1 = X.C32241fu.A00(r11)
            r0 = 2131892560(0x7f121950, float:1.9419872E38)
            r1.A02(r0)
            r0 = 2131892568(0x7f121958, float:1.9419888E38)
            goto L_0x01e1
        L_0x0173:
            r11.A3C()
            X.1fu r1 = X.C32241fu.A00(r11)
            r0 = 2131892558(0x7f12194e, float:1.9419868E38)
            r1.A02(r0)
            r0 = 2131892559(0x7f12194f, float:1.941987E38)
            goto L_0x01e1
        L_0x0184:
            X.5nF r1 = r11.A01
            r1.A0T(r10)
            r0 = 0
            r1.A0S(r0)
            return
        L_0x018e:
            X.1Vt r0 = r5.A05
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A02(r11, r0, r8, r1)
            r11.startActivity(r0)
            X.61W r5 = r11.A00
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = r11.A0Y
            r5.AKT(r6, r7, r8, r9, r10)
            return
        L_0x01a5:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r0 = com.obwhatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r11, r0)
            java.lang.String r0 = "extra_disable_search"
            r2.putExtra(r0, r10)
            X.1lg r1 = r5.A01
            if (r1 == 0) goto L_0x01ce
            java.lang.String r0 = "extra_predefined_search_filter"
            r2.putExtra(r0, r1)
        L_0x01b9:
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r2.putExtra(r0, r4)
            r0 = 2131890454(0x7f121116, float:1.94156E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "extra_list_screen_configurable_title"
            r2.putExtra(r0, r1)
            r11.startActivity(r2)
            return
        L_0x01ce:
            java.lang.String r0 = "extra_show_empty_list_screen"
            r2.putExtra(r0, r10)
            goto L_0x01b9
        L_0x01d4:
            X.1fu r1 = X.C32241fu.A00(r11)
            r0 = 2131890259(0x7f121053, float:1.9415205E38)
            r1.A02(r0)
            r0 = 2131890258(0x7f121052, float:1.9415203E38)
        L_0x01e1:
            r1.A01(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1.setPositiveButton(r0, r3)
            r1.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity.A39(X.5tS):void");
    }

    public final void A3C() {
        this.A00.AKS(C13680ns.A0Y(), 138, "payment_transaction_details", (String) null);
    }

    public void onBackPressed() {
        Integer A0Y = C13680ns.A0Y();
        A3A(A0Y, A0Y);
        this.A01.A0G(new C116275r7(301));
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 100) {
            return super.onCreateDialog(i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(R.string.str10b3);
        A002.A07(false);
        C110105dW.A0w(A002, this, 46, R.string.str0e87);
        A002.A02(R.string.str10af);
        return A002.create();
    }

    public void onNewIntent(Intent intent) {
        C114175nF r2 = this.A01;
        if (r2 != null) {
            r2.A01 = intent.getBooleanExtra("extra_return_after_completion", false);
        }
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (C13690nt.A0E(this) != null) {
            bundle.putAll(C13690nt.A0E(this));
        }
        super.onSaveInstanceState(bundle);
    }
}
