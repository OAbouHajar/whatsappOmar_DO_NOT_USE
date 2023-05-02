package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1UP;
import X.AnonymousClass1Vo;
import X.AnonymousClass2St;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C112815jT;
import X.C119405xi;
import X.C119535yd;
import X.C119655yp;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C32241fu;
import X.C35521m4;
import X.C49132Rg;
import X.C53842gO;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape213S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import java.util.Calendar;

public class IndiaUpiDebitCardVerificationActivity extends C112815jT {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public EditText A04;
    public EditText A05;
    public TextView A06;
    public Button A07;
    public C35521m4 A08;
    public Integer A09;
    public boolean A0A;
    public final AnonymousClass1Vo A0B;

    public IndiaUpiDebitCardVerificationActivity() {
        this(0);
        this.A0B = C110115dX.A0S("IndiaUpiDebitCardVerificationActivity");
    }

    public IndiaUpiDebitCardVerificationActivity(int i2) {
        this.A0A = false;
        C110105dW.A0t(this, 49);
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1n(A0C, r1, this);
        }
    }

    public final int A3k() {
        return (TextUtils.isEmpty(C110105dW.A0e(this.A02)) || C110105dW.A0e(this.A02).length() != 2 || TextUtils.isEmpty(C110105dW.A0e(this.A03)) || C110105dW.A0e(this.A03).length() != 4) ? 1 : 0;
    }

    public final void A3l() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        this.A06.startAnimation(alphaAnimation);
        this.A06.setVisibility(0);
    }

    public final void A3m() {
        if (A3n(this.A00, this.A01, true)) {
            C35521m4 r4 = this.A08;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(C110105dW.A0e(this.A02));
            String A0h = AnonymousClass000.A0h(C110105dW.A0e(this.A03), A0o);
            String A0e = C110105dW.A0e(this.A04);
            String A0e2 = C110105dW.A0e(this.A05);
            this.A00 = r4;
            this.A04 = A0h;
            this.A02 = A0e;
            this.A03 = A0e2;
            Afq(R.string.str1179);
            AnonymousClass1Vo r3 = this.A07;
            StringBuilder A0r = AnonymousClass000.A0r("onResume with states: ");
            A0r.append(this.A06);
            C110105dW.A1L(r3, A0r);
            if (!this.A06.A07.contains("upi-get-challenge") && this.A0C.A06().A00 == null) {
                this.A06.A03("upi-get-challenge");
                A3Y();
            } else if (!this.A06.A07.contains("upi-get-challenge")) {
                A3c();
            }
        }
        C53842gO A032 = this.A0E.A03(1, C13690nt.A0U(), "enter_debit_card", this.A0O);
        A032.A0X = this.A0L;
        A032.A0E = this.A09;
        this.A05.A06(A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0115, code lost:
        if (r5 >= r10) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011b, code lost:
        if (r7 > 12) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A3n(int r9, int r10, boolean r11) {
        /*
            r8 = this;
            android.widget.EditText r2 = r8.A04
            android.widget.EditText r1 = r8.A05
            r6 = -1
            java.lang.String r0 = X.C110105dW.A0e(r1)     // Catch:{ NumberFormatException -> 0x002e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002e }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = X.C110105dW.A0e(r1)     // Catch:{ NumberFormatException -> 0x002e }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002e }
            goto L_0x0019
        L_0x0018:
            r5 = -1
        L_0x0019:
            java.lang.String r0 = X.C110105dW.A0e(r2)     // Catch:{ NumberFormatException -> 0x002c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002c }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = X.C110105dW.A0e(r2)     // Catch:{ NumberFormatException -> 0x002c }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002c }
            goto L_0x0038
        L_0x002c:
            r2 = move-exception
            goto L_0x0030
        L_0x002e:
            r2 = move-exception
            r5 = -1
        L_0x0030:
            X.1Vo r1 = r8.A0B
            java.lang.String r0 = "IndiaUpiDebitCardVerifActivity checkMonthYear threw: "
            r1.A0A(r0, r2)
        L_0x0037:
            r7 = -1
        L_0x0038:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r4 = 1
            int r0 = r0.get(r4)
            int r0 = r0 + 50
            int r3 = r0 % 100
            r1 = 12
            r2 = 0
            if (r5 == r6) goto L_0x010e
            if (r7 == r6) goto L_0x010e
            r0 = 3
            if (r5 < r10) goto L_0x0138
            if (r5 != r10) goto L_0x0118
            if (r7 < r9) goto L_0x0056
            if (r7 > r1) goto L_0x0056
            r0 = 0
        L_0x0056:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x005e:
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
        L_0x0063:
            int r0 = r8.A3k()
            r2 = 3
            r4 = 0
            if (r0 == 0) goto L_0x007d
            android.widget.TextView r1 = r8.A06
            r0 = 2131887698(0x7f120652, float:1.941001E38)
            r1.setText(r0)
            r8.A3l()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x007a:
            r8.A09 = r0
            return r4
        L_0x007d:
            java.lang.Object r0 = r3.first
            int r1 = X.AnonymousClass000.A0D(r0)
            if (r1 == r2) goto L_0x0101
            java.lang.Object r0 = r3.second
            int r3 = X.AnonymousClass000.A0D(r0)
            if (r3 == r2) goto L_0x0101
            r0 = 2
            if (r1 != r0) goto L_0x00a3
            if (r3 != r0) goto L_0x00a3
            android.widget.TextView r1 = r8.A06
            r0 = 2131887693(0x7f12064d, float:1.941E38)
            r1.setText(r0)
            r8.A3l()
            r0 = 5
        L_0x009e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x007a
        L_0x00a3:
            r2 = 0
            if (r1 == 0) goto L_0x00dd
            android.widget.TextView r1 = r8.A06
            if (r3 == 0) goto L_0x00c6
            r0 = 2131887695(0x7f12064f, float:1.9410004E38)
            r1.setText(r0)
            r8.A3l()
            if (r11 == 0) goto L_0x00c4
            android.widget.EditText r0 = r8.A04
            r0.setText(r2)
            android.widget.EditText r0 = r8.A05
            r0.setText(r2)
            android.widget.EditText r0 = r8.A04
            r0.requestFocus()
        L_0x00c4:
            r0 = 6
            goto L_0x009e
        L_0x00c6:
            r0 = 2131887696(0x7f120650, float:1.9410006E38)
            r1.setText(r0)
            r8.A3l()
            if (r11 == 0) goto L_0x00db
            android.widget.EditText r0 = r8.A04
            r0.setText(r2)
            android.widget.EditText r0 = r8.A04
            r0.requestFocus()
        L_0x00db:
            r0 = 7
            goto L_0x009e
        L_0x00dd:
            if (r3 != 0) goto L_0x00e7
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.A09 = r0
            return r1
        L_0x00e7:
            android.widget.TextView r1 = r8.A06
            r0 = 2131887697(0x7f120651, float:1.9410008E38)
            r1.setText(r0)
            r8.A3l()
            if (r11 == 0) goto L_0x00fe
            android.widget.EditText r0 = r8.A05
            r0.setText(r2)
            android.widget.EditText r0 = r8.A05
            r0.requestFocus()
        L_0x00fe:
            r0 = 8
            goto L_0x009e
        L_0x0101:
            android.widget.TextView r1 = r8.A06
            r0 = 2131887694(0x7f12064e, float:1.9410002E38)
            r1.setText(r0)
            r8.A3l()
            r0 = 4
            goto L_0x009e
        L_0x010e:
            r0 = 2
            if (r5 == r6) goto L_0x012b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r5 < r10) goto L_0x0125
            goto L_0x0122
        L_0x0118:
            if (r7 < r4) goto L_0x011d
            r0 = 0
            if (r7 <= r1) goto L_0x011e
        L_0x011d:
            r0 = 1
        L_0x011e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0122:
            if (r5 > r3) goto L_0x0125
            r4 = 0
        L_0x0125:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x005e
        L_0x012b:
            if (r7 != r6) goto L_0x0138
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r0)
            goto L_0x0063
        L_0x0138:
            if (r7 < r4) goto L_0x013d
            if (r7 > r1) goto L_0x013d
            r4 = 0
        L_0x013d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.A3n(int, int, boolean):boolean");
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0E.A07((AnonymousClass2St) null, C13680ns.A0Y(), C13680ns.A0a(), this.A0L, "enter_debit_card", this.A0O);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110105dW.A0m(this);
        setContentView((int) R.layout.layout0328);
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            A0r.A0B(R.string.str0fdf);
            A0r.A0N(true);
        }
        C35521m4 r0 = (C35521m4) getIntent().getParcelableExtra("extra_bank_account");
        if (r0 == null) {
            this.A0B.A05("Bank account info is null, finishing");
            finish();
            return;
        }
        this.A08 = r0;
        C13680ns.A0N(this, R.id.add_card_number_label).setText(C13680ns.A0d(this, C119405xi.A06(r0), new Object[1], 0, R.string.str1011));
        ImageView A042 = C110115dX.A04(this, R.id.issuer_bank_logo);
        Bitmap A052 = this.A08.A05();
        if (A052 != null) {
            A042.setImageBitmap(A052);
        } else {
            A042.setImageResource(R.drawable.bank_logo_placeholder);
        }
        Button button = (Button) findViewById(R.id.confirm_button);
        this.A07 = button;
        button.setEnabled(false);
        C110105dW.A0r(this.A07, this, 39);
        EditText editText = (EditText) findViewById(R.id.add_card_number1);
        this.A02 = editText;
        AnonymousClass1UP.A06(editText);
        EditText editText2 = (EditText) findViewById(R.id.add_card_number2);
        this.A03 = editText2;
        AnonymousClass1UP.A06(editText2);
        this.A04 = (EditText) findViewById(R.id.add_card_month);
        this.A05 = (EditText) findViewById(R.id.add_card_year);
        AnonymousClass1UP.A06(this.A04);
        AnonymousClass1UP.A06(this.A05);
        this.A06 = C13680ns.A0N(this, R.id.payments_send_payment_error_text);
        Calendar instance = Calendar.getInstance();
        this.A00 = instance.get(2) + 1;
        this.A01 = instance.get(1) % 100;
        this.A02.addTextChangedListener(new C119535yd(this.A03, this, 2));
        this.A02.setOnKeyListener(new C119655yp((EditText) null, this.A03));
        this.A03.addTextChangedListener(new C119535yd(this.A04, this, 4));
        this.A03.setOnKeyListener(new C119655yp(this.A02, this.A04));
        this.A04.addTextChangedListener(new C119535yd(this.A05, this, 2));
        this.A04.setOnKeyListener(new C119655yp(this.A03, this.A05));
        this.A05.addTextChangedListener(new C119535yd((EditText) null, this, 2));
        this.A05.setOnKeyListener(new C119655yp(this.A04, (EditText) null));
        this.A05.setOnEditorActionListener(new IDxAListenerShape213S0100000_3_I1(this, 0));
        this.A02.requestFocus();
        this.A0E.A07((AnonymousClass2St) null, 0, (Integer) null, this.A0L, "enter_debit_card", this.A0O);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A3N(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str05ae);
            A3O(A002, "enter_debit_card");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0E.A07((AnonymousClass2St) null, 1, C13680ns.A0a(), this.A0L, "enter_debit_card", this.A0O);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        this.A0B.A01(findViewById(R.id.add_card_year));
    }
}
