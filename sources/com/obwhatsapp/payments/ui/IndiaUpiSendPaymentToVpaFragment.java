package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass173;
import X.AnonymousClass1Vo;
import X.AnonymousClass5w2;
import X.AnonymousClass5x9;
import X.AnonymousClass60O;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C001000l;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110735ek;
import X.C112285iF;
import X.C112715ix;
import X.C114445nm;
import X.C118455ui;
import X.C119265wo;
import X.C119365wy;
import X.C1200960h;
import X.C13680ns;
import X.C14710pd;
import X.C14870pt;
import X.C16320sq;
import X.C17190ug;
import X.C18260wP;
import X.C18280wR;
import X.C18310wU;
import X.C18340wX;
import X.C221116r;
import X.C227719f;
import X.C227819g;
import X.C227919h;
import X.C23061Ai;
import X.C35301lh;
import X.C39841t9;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxCCallbackShape67S0200000_3_I1;
import com.facebook.redex.IDxIFactoryShape26S0100000_3_I1;
import com.facebook.redex.IDxSDetectorShape311S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.text.IDxWAdapterShape104S0100000_3_I1;
import com.whatsapp.jid.UserJid;

public class IndiaUpiSendPaymentToVpaFragment extends Hilt_IndiaUpiSendPaymentToVpaFragment {
    public EditText A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public C14870pt A04;
    public Button A05;
    public Button A06;
    public C18260wP A07;
    public AnonymousClass013 A08;
    public C221116r A09;
    public AnonymousClass173 A0A;
    public C14710pd A0B;
    public C35301lh A0C;
    public C35301lh A0D;
    public C17190ug A0E;
    public AnonymousClass60O A0F;
    public C119365wy A0G;
    public AnonymousClass60V A0H;
    public C227919h A0I;
    public C18340wX A0J;
    public C227819g A0K;
    public C18310wU A0L;
    public C112285iF A0M;
    public AnonymousClass61W A0N;
    public C118455ui A0O;
    public C1200960h A0P;
    public C110735ek A0Q;
    public C227719f A0R;
    public C112715ix A0S;
    public AnonymousClass5x9 A0T;
    public C18280wR A0U;
    public C23061Ai A0V;
    public C16320sq A0W;
    public boolean A0X;
    public final AnonymousClass1Vo A0Y = AnonymousClass1Vo.A00("IndiaUpiSendPaymentToVpaDialogFragment", "payment", "IN");

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0T.A02(new IDxSDetectorShape311S0100000_3_I1(this, 4));
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0312);
    }

    public void A13() {
        super.A13();
        this.A0M = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        this.A06 = null;
    }

    public void A14() {
        super.A14();
        if (this.A0T.A03()) {
            AnonymousClass5x9.A01(A0C());
        }
    }

    public void A18(Bundle bundle, View view) {
        EditText editText;
        int i2;
        Context A0u = A0u();
        C14870pt r2 = this.A04;
        C17190ug r4 = this.A0E;
        C18280wR r10 = this.A0U;
        this.A0M = new C112285iF(A0u, r2, this.A0A, r4, this.A0F, this.A0G, this.A0J, this.A0L, this.A0S, r10);
        C110735ek r42 = (C110735ek) new C006602z((AnonymousClass04o) new IDxIFactoryShape26S0100000_3_I1(this, 1), (C001500q) this).A01(C110735ek.class);
        this.A0Q = r42;
        C14710pd r1 = r42.A04;
        if (r1.A0C(2491)) {
            int A022 = r1.A02(2492);
            C13680ns.A1U(new C114445nm(r42.A03, r42, A022), r42.A08);
        }
        this.A00 = (EditText) C004601z.A0E(view, R.id.account_id_handle);
        this.A01 = (ProgressBar) C004601z.A0E(view, R.id.progress);
        this.A02 = C13680ns.A0L(view, R.id.error_text);
        this.A05 = (Button) C004601z.A0E(view, R.id.close_dialog_button);
        this.A06 = (Button) C004601z.A0E(view, R.id.primary_payment_button);
        this.A03 = C13680ns.A0L(view, R.id.title_text);
        this.A06.setEnabled(false);
        boolean A002 = AnonymousClass5w2.A00(this.A0B, this.A0H.A08());
        this.A0X = A002;
        TextView textView = this.A03;
        if (A002) {
            textView.setText(R.string.str18c9);
            editText = this.A00;
            i2 = R.string.str18c8;
        } else {
            textView.setText(R.string.str18ca);
            editText = this.A00;
            i2 = R.string.str18c7;
        }
        editText.setHint(i2);
        this.A00.addTextChangedListener(new IDxWAdapterShape104S0100000_3_I1(this, 1));
        C110105dW.A0r(this.A05, this, 83);
        C110105dW.A0r(this.A06, this, 82);
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            C35301lh r22 = (C35301lh) bundle2.getParcelable("extra_payment_handle");
            if (!C39841t9.A03(r22)) {
                EditText editText2 = this.A00;
                Object obj = r22.A00;
                AnonymousClass00B.A06(obj);
                editText2.setText((CharSequence) obj);
                A1A();
            }
        }
        this.A0N.AKS(0, (Integer) null, "enter_user_payment_id", (String) null);
        C110115dX.A0w(A0H(), this.A0Q.A00, this, 48);
        C110115dX.A0w(A0H(), this.A0Q.A02, this, 47);
        C110115dX.A0w(A0H(), this.A0Q.A01, this, 46);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.whatsapp.jid.UserJid, X.1lh] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1A() {
        /*
            r7 = this;
            boolean r0 = r7.A0X
            if (r0 == 0) goto L_0x009d
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            android.widget.EditText r0 = r7.A00
            java.lang.String r1 = X.C110105dW.A0e(r0)
            X.013 r0 = r7.A08
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r5 = r1.toLowerCase(r0)
            java.util.regex.Pattern r0 = X.AnonymousClass5w2.A00
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            java.lang.String r3 = "upiAlias"
            r4 = 0
            if (r0 == 0) goto L_0x0063
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x005e
            int r1 = r5.length()
            r0 = 8
            if (r1 < r0) goto L_0x005e
            r0 = 10
            if (r1 > r0) goto L_0x005e
            X.19f r0 = r7.A0R
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Set r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r1.next()
            X.2gR r0 = (X.C53872gR) r0
            X.1lh r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            X.C18450wi.A0B(r0)
            r2.add(r0)
            goto L_0x0044
        L_0x005e:
            r1 = 2131890019(0x7f120f63, float:1.9414718E38)
            goto L_0x00f2
        L_0x0063:
            boolean r0 = X.AnonymousClass5x5.A00(r5)
            if (r0 == 0) goto L_0x0099
            X.2gP r0 = X.C110105dW.A0L()
            X.1lh r0 = X.C110105dW.A0J(r0, r6, r5, r3)
            r7.A0D = r0
            X.60V r0 = r7.A0H
            java.lang.String r1 = X.AnonymousClass60V.A00(r0)
            X.1lh r0 = r7.A0D
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 != 0) goto L_0x0090
            X.1lh r0 = r7.A0D
            java.lang.Object r0 = X.C39841t9.A02(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0090
            goto L_0x00e5
        L_0x0090:
            X.60O r1 = r7.A0F
            X.1lh r0 = r7.A0D
            boolean r0 = r1.AId(r0)
            goto L_0x0104
        L_0x0099:
            r1 = 2131890022(0x7f120f66, float:1.9414724E38)
            goto L_0x00f2
        L_0x009d:
            X.2gP r3 = X.C110105dW.A0L()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            android.widget.EditText r0 = r7.A00
            java.lang.String r1 = X.C110105dW.A0e(r0)
            X.013 r0 = r7.A08
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "upiHandle"
            X.1lh r0 = X.C110105dW.A0J(r3, r2, r1, r0)
            r7.A0D = r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.AnonymousClass5x5.A00(r0)
            if (r0 != 0) goto L_0x00c9
            r1 = 2131890021(0x7f120f65, float:1.9414722E38)
            goto L_0x00f2
        L_0x00c9:
            X.60V r0 = r7.A0H
            java.lang.String r1 = X.AnonymousClass60V.A00(r0)
            X.1lh r0 = r7.A0D
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 != 0) goto L_0x00fb
            X.1lh r0 = r7.A0D
            java.lang.Object r0 = X.C39841t9.A02(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00fb
        L_0x00e5:
            r1 = 2131890091(0x7f120fab, float:1.9414864E38)
            goto L_0x00f2
        L_0x00e9:
            boolean r0 = r2.contains(r5)
            if (r0 == 0) goto L_0x0114
            r1 = 2131890090(0x7f120faa, float:1.9414862E38)
        L_0x00f2:
            X.5wo r0 = new X.5wo
            r0.<init>(r1)
            r7.A1C(r0)
            return
        L_0x00fb:
            X.60O r1 = r7.A0F
            X.1lh r0 = r7.A0D
            boolean r0 = r1.AId(r0)
            r4 = 0
        L_0x0104:
            if (r0 == 0) goto L_0x010c
            X.1lh r0 = r7.A0D
            r7.A1B(r4, r0)
            return
        L_0x010c:
            X.5ek r1 = r7.A0Q
            X.1lh r0 = r7.A0D
            r1.A05(r0, r4)
            goto L_0x0123
        L_0x0114:
            X.2gP r0 = X.C110105dW.A0L()
            X.1lh r1 = X.C110105dW.A0J(r0, r6, r5, r3)
            r7.A0C = r1
            X.5ek r0 = r7.A0Q
            r0.A05(r4, r1)
        L_0x0123:
            X.61W r3 = r7.A0N
            java.lang.Integer r2 = X.C13680ns.A0Y()
            java.lang.Integer r1 = X.C13690nt.A0U()
            java.lang.String r0 = "enter_user_payment_id"
            r3.AKS(r2, r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment.A1A():void");
    }

    public final void A1B(UserJid userJid, C35301lh r11) {
        C118455ui r1 = this.A0O;
        if (r1 != null) {
            PaymentBottomSheet paymentBottomSheet = r1.A01;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1C();
            }
            r1.A06.A00(r1.A02, new IDxCCallbackShape67S0200000_3_I1(r11, 0, r1), userJid, r11, false, false);
        }
    }

    public final void A1C(C119265wo r6) {
        AnonymousClass1Vo r2 = this.A0Y;
        StringBuilder A0r = AnonymousClass000.A0r("showErrorText: ");
        A0r.append(r6.A00);
        C110105dW.A1L(r2, A0r);
        this.A02.setVisibility(0);
        this.A02.setText(r6.A01(A02()));
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            C004601z.A0O(AnonymousClass00T.A03(A0C2, R.color.color0697), this.A00);
        }
        this.A0N.AKS(0, 51, "enter_user_payment_id", (String) null);
    }
}
