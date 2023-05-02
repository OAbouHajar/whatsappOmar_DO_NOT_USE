package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCCallbackShape2S1300000_3_I1;
import com.facebook.redex.IDxCListenerShape13S0101000_3_I1;
import com.facebook.redex.IDxCListenerShape1S0111000_3_I1;
import com.facebook.redex.IDxCListenerShape8S0101000_3_I1;
import com.facebook.redex.IDxCallbackShape45S0300000_3_I1;
import com.facebook.redex.IDxCallbackShape65S0200000_3_I1;
import com.obwhatsapp.CopyableTextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.PaymentDeleteAccountActivity;
import com.obwhatsapp.payments.ui.widget.PayToolbar;
import com.whatsapp.util.Log;

/* renamed from: X.5jv  reason: invalid class name and case insensitive filesystem */
public abstract class C112885jv extends C111375g5 implements View.OnClickListener {
    public int A00;
    public TextView A01;
    public TextView A02;
    public CopyableTextView A03;
    public C14870pt A04;
    public AnonymousClass1KO A05;
    public C17130ua A06;
    public AnonymousClass013 A07;
    public C30671cl A08;
    public AnonymousClass175 A09;
    public C27981Tw A0A;
    public AnonymousClass174 A0B;
    public C18290wS A0C;
    public AnonymousClass5o4 A0D;
    public C118925vd A0E;
    public PayToolbar A0F;
    public C16320sq A0G;
    public boolean A0H;
    public final AnonymousClass5Q4 A0I = new C1201460m(this);
    public final AnonymousClass1Vo A0J = C110105dW.A0Q("PaymentMethodDetailsActivity", "payment-settings");

    public void A2S(int i2) {
        if (i2 == R.string.str0f77) {
            finish();
        }
    }

    public final int A35(int i2) {
        TypedArray typedArray;
        try {
            typedArray = obtainStyledAttributes(i2, new int[]{16843071});
        } catch (Resources.NotFoundException e2) {
            Log.e(e2.getMessage());
            typedArray = null;
        }
        if (typedArray != null) {
            return typedArray.getDimensionPixelOffset(0, -1);
        }
        return -1;
    }

    public C005702l A36(CharSequence charSequence, String str, boolean z2) {
        int i2 = 201;
        if (z2) {
            i2 = 200;
        }
        C32241fu r3 = new C32241fu(this, R.style.style0174);
        r3.A06(charSequence);
        r3.A07(true);
        r3.setNegativeButton(R.string.str0394, new IDxCListenerShape8S0101000_3_I1(this, i2, 3));
        r3.A09(new IDxCListenerShape1S0111000_3_I1(this, i2, 1, z2), str);
        r3.A03(new IDxCListenerShape13S0101000_3_I1(this, i2, 3));
        if (!z2) {
            r3.setTitle(getString(R.string.str06b3));
        }
        return r3.create();
    }

    public void A37() {
        C13680ns.A1U(new C114455nn(this.A0C, this.A0J, new AnonymousClass5r1(this)), this.A0G);
    }

    public void A38(C30671cl r3, boolean z2) {
        int i2;
        Ac1();
        if (r3 == null) {
            finish();
            return;
        }
        this.A08 = r3;
        this.A0H = AnonymousClass000.A1R(r3.A01, 2);
        this.A02.setText((CharSequence) C110105dW.A0d(r3.A09));
        ImageView A042 = C110115dX.A04(this, R.id.payment_method_icon);
        if (r3 instanceof C35391lr) {
            i2 = C119405xi.A00((C35391lr) r3);
        } else {
            Bitmap A052 = r3.A05();
            if (A052 != null) {
                A042.setImageBitmap(A052);
                this.A0E.A00(r3);
            }
            i2 = R.drawable.av_bank;
        }
        A042.setImageResource(i2);
        this.A0E.A00(r3);
    }

    public void A39(boolean z2) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
        if (z2) {
            indiaUpiBankAccountDetailsActivity.A0J.A06("unlinking the payment account.");
            Intent A042 = C110105dW.A04(indiaUpiBankAccountDetailsActivity, PaymentDeleteAccountActivity.class);
            A042.putExtra("extra_remove_payment_account", 1);
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A042, 0);
            return;
        }
        indiaUpiBankAccountDetailsActivity.Afq(R.string.str13db);
        indiaUpiBankAccountDetailsActivity.A09.AgB();
        AnonymousClass61W r2 = indiaUpiBankAccountDetailsActivity.A09;
        IDxCallbackShape45S0300000_3_I1 iDxCallbackShape45S0300000_3_I1 = new IDxCallbackShape45S0300000_3_I1(new IDxCallbackShape65S0200000_3_I1(r2, 3, indiaUpiBankAccountDetailsActivity), r2, indiaUpiBankAccountDetailsActivity, 0);
        C39901tF r22 = indiaUpiBankAccountDetailsActivity.A00.A08;
        AnonymousClass00B.A07(r22, indiaUpiBankAccountDetailsActivity.A0J.A02("IndiaUpiBankAccountDetailsActivity onRemovePaymentMethod Unable to get IndiaUpiMethodData"));
        C111805hR r23 = (C111805hR) r22;
        C112315iI r6 = indiaUpiBankAccountDetailsActivity.A08;
        C35301lh r9 = r23.A09;
        String str = r23.A0F;
        C35301lh r4 = r23.A06;
        String str2 = indiaUpiBankAccountDetailsActivity.A00.A0A;
        if (C39841t9.A03(r9)) {
            r6.A0C.A01(r6.A00, (AnonymousClass4XO) null, new IDxCCallbackShape2S1300000_3_I1(r4, iDxCallbackShape45S0300000_3_I1, r6, str2, 1));
        } else {
            r6.A01(r9, r4, iDxCallbackShape45S0300000_3_I1, str, str2);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && i3 == -1) {
            Intent A092 = C13680ns.A09();
            int i4 = 0;
            if (intent != null) {
                i4 = intent.getIntExtra("extra_remove_payment_account", 0);
            }
            A092.putExtra("extra_remove_payment_account", i4);
            setResult(-1, A092);
            finish();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.default_payment_method_row) {
            if (!this.A0H) {
                Afq(R.string.str13db);
                if (this instanceof C112865jq) {
                    C112865jq r5 = (C112865jq) this;
                    r5.A3C(new AnonymousClass60R((C227319b) null, (C1222969a) null, r5, 0), r5.A08.A0A, (String) null);
                    return;
                }
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
                if (indiaUpiBankAccountDetailsActivity.A04.A0R()) {
                    Intent A042 = C110105dW.A04(indiaUpiBankAccountDetailsActivity, IndiaUpiPaymentsAccountSetupActivity.class);
                    A042.putExtra("extra_setup_mode", 2);
                    A042.putExtra("extra_payments_entry_type", 7);
                    C110115dX.A0p(A042, indiaUpiBankAccountDetailsActivity, "extra_referral_screen", "payment_bank_account_details");
                    return;
                }
                indiaUpiBankAccountDetailsActivity.Afq(R.string.str13db);
                indiaUpiBankAccountDetailsActivity.A09.AgB();
                AnonymousClass60R r7 = new AnonymousClass60R(indiaUpiBankAccountDetailsActivity.A0C, indiaUpiBankAccountDetailsActivity.A09, indiaUpiBankAccountDetailsActivity, 15);
                C39901tF r2 = indiaUpiBankAccountDetailsActivity.A00.A08;
                AnonymousClass00B.A07(r2, indiaUpiBankAccountDetailsActivity.A0J.A02("onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData"));
                C111805hR r22 = (C111805hR) r2;
                C112315iI r8 = indiaUpiBankAccountDetailsActivity.A08;
                C35301lh r1 = r22.A09;
                String str = r22.A0F;
                C35301lh r6 = r22.A06;
                String str2 = indiaUpiBankAccountDetailsActivity.A00.A0A;
                if (C39841t9.A03(r1)) {
                    r8.A0C.A01(r8.A00, (AnonymousClass4XO) null, new IDxCCallbackShape2S1300000_3_I1(r6, r7, r8, str2, 0));
                } else {
                    r8.A00(r1, r6, r7, str, str2);
                }
            }
        } else if (view.getId() == R.id.help_row) {
            C16320sq r23 = this.A0G;
            AnonymousClass5o4 r0 = this.A0D;
            if (r0 != null && r0.A03() == 1) {
                this.A0D.A06(false);
            }
            Bundle A0D2 = C13690nt.A0D();
            A0D2.putString("com.obwhatsapp.support.DescribeProblemActivity.from", "payments:account-details");
            C39901tF r02 = this.A08.A08;
            if (r02 != null) {
                A0D2.putString("com.obwhatsapp.support.DescribeProblemActivity.paymentBankPhone", r02.A07());
            }
            C17130ua r82 = this.A06;
            C15900s5 r72 = this.A06;
            AnonymousClass5o4 r3 = new AnonymousClass5o4(A0D2, this, this.A05, r72, r82, this.A07, this.A08, (AnonymousClass1Vt) null, this.A0D, this.A0B, "payments:account-details");
            this.A0D = r3;
            C13680ns.A1U(r3, r23);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            boolean r2 = r10 instanceof com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity
            if (r2 == 0) goto L_0x0055
            r9 = 1
            r0 = 2131559041(0x7f0d0281, float:1.8743415E38)
        L_0x000b:
            r10.setContentView((int) r0)
            r0 = 2131365902(0x7f0a100e, float:1.8351682E38)
            android.view.View r3 = r10.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.LayoutInflater r1 = r10.getLayoutInflater()
            r0 = 2131559515(0x7f0d045b, float:1.8744376E38)
            r5 = 0
            android.view.View r0 = r1.inflate(r0, r5)
            r3.addView(r0)
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x004a
            android.os.Bundle r0 = X.C13690nt.A0E(r10)
            if (r0 == 0) goto L_0x004a
            android.os.Bundle r0 = X.C13690nt.A0E(r10)
            java.lang.String r4 = "extra_bank_account"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r3 = "extra_bank_account_or_card_credential_id"
            if (r0 != 0) goto L_0x005a
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 != 0) goto L_0x005a
        L_0x004a:
            X.1Vo r1 = r10.A0J
            java.lang.String r0 = "got null bank account; finishing"
            r1.A04(r0)
            r10.finish()
            return
        L_0x0055:
            r9 = 0
            r0 = 2131559514(0x7f0d045a, float:1.8744374E38)
            goto L_0x000b
        L_0x005a:
            if (r9 == 0) goto L_0x006a
            r0 = 2131365041(0x7f0a0cb1, float:1.8349936E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.payments.ui.widget.PayToolbar r0 = (com.obwhatsapp.payments.ui.widget.PayToolbar) r0
            r10.A0F = r0
            r10.Aem(r0)
        L_0x006a:
            r1 = r10
            if (r2 == 0) goto L_0x01bd
            com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity r1 = (com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r1
            X.0w8 r0 = r1.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x007f
            X.0w8 r0 = r1.A07
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x01bd
        L_0x007f:
            X.0pt r6 = r10.A04
            X.0sq r1 = r10.A0G
            X.013 r0 = r10.A07
            X.5jA r2 = new X.5jA
            r2.<init>(r6, r0, r10, r1)
        L_0x008a:
            r10.A0E = r2
            boolean r0 = r2 instanceof X.C112755jA
            if (r0 == 0) goto L_0x0189
            X.5jA r2 = (X.C112755jA) r2
            X.5jv r0 = r2.A04
            android.view.View r8 = r0.A00
            r0 = 2131363112(0x7f0a0528, float:1.8346024E38)
            android.view.View r1 = X.C004601z.A0E(r8, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131558926(0x7f0d020e, float:1.8743182E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            r2.A00 = r1
            r0 = 2131364976(0x7f0a0c70, float:1.8349804E38)
            android.view.ViewGroup r0 = X.C13700nu.A07(r1, r0)
            r2.A02 = r0
            android.view.View r1 = r2.A00
            r0 = 2131364973(0x7f0a0c6d, float:1.8349798E38)
            android.view.ViewGroup r0 = X.C13700nu.A07(r1, r0)
            r2.A01 = r0
            android.view.View r1 = r2.A00
            r0 = 2131364975(0x7f0a0c6f, float:1.8349802E38)
            com.obwhatsapp.WaTextView r0 = X.C13680ns.A0S(r1, r0)
            r2.A06 = r0
            android.view.View r0 = r2.A00
            r7 = 2131364974(0x7f0a0c6e, float:1.83498E38)
            android.widget.ImageView r0 = X.C13680ns.A0J(r0, r7)
            r2.A04 = r0
            android.view.View r1 = r2.A00
            r0 = 2131364972(0x7f0a0c6c, float:1.8349796E38)
            com.obwhatsapp.WaTextView r0 = X.C13680ns.A0S(r1, r0)
            r2.A05 = r0
            android.view.View r0 = r2.A00
            r6 = 2131364971(0x7f0a0c6b, float:1.8349794E38)
            android.widget.ImageView r0 = X.C13680ns.A0J(r0, r6)
            r2.A03 = r0
            android.widget.ImageView r0 = X.C13680ns.A0J(r8, r7)
            int r1 = r2.A03
            X.AnonymousClass2SR.A08(r0, r1)
            android.widget.ImageView r0 = X.C13680ns.A0J(r8, r6)
            X.AnonymousClass2SR.A08(r0, r1)
        L_0x00fb:
            r0 = 2131365114(0x7f0a0cfa, float:1.8350084E38)
            android.widget.TextView r0 = X.C13680ns.A0N(r10, r0)
            r10.A02 = r0
            r0 = 2131365111(0x7f0a0cf7, float:1.8350078E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.CopyableTextView r0 = (com.obwhatsapp.CopyableTextView) r0
            r10.A03 = r0
            r0 = 2131365112(0x7f0a0cf8, float:1.835008E38)
            android.widget.TextView r0 = X.C13680ns.A0N(r10, r0)
            r10.A01 = r0
            r0 = 2131101455(0x7f06070f, float:1.781532E38)
            if (r9 == 0) goto L_0x0120
            r0 = 2131100198(0x7f060226, float:1.781277E38)
        L_0x0120:
            int r0 = X.AnonymousClass00T.A00(r10, r0)
            r10.A00 = r0
            r0 = 2131364030(0x7f0a08be, float:1.8347886E38)
            android.widget.ImageView r1 = X.C110115dX.A04(r10, r0)
            int r0 = r10.A00
            X.AnonymousClass2SR.A08(r1, r0)
            r0 = 2131364032(0x7f0a08c0, float:1.834789E38)
            android.view.View r0 = r10.findViewById(r0)
            r0.setOnClickListener(r10)
            X.1Tw r1 = r10.A0A
            X.5Q4 r0 = r10.A0I
            r1.A02(r0)
            android.os.Bundle r0 = X.C13690nt.A0E(r10)
            java.lang.Object r1 = r0.get(r4)
            android.os.Bundle r0 = X.C13690nt.A0E(r10)
            if (r1 == 0) goto L_0x017a
            java.lang.Object r0 = r0.get(r4)
            X.1cl r0 = (X.C30671cl) r0
            java.lang.String r5 = r0.A0A
        L_0x0159:
            r0 = 2131889292(0x7f120c8c, float:1.9413243E38)
            r10.Afq(r0)
            X.0wS r0 = r10.A0C
            X.1xv r0 = r0.A01()
            X.AnonymousClass00B.A06(r5)
            X.1WD r2 = r0.A01(r5)
            r0 = 6
            com.facebook.redex.IDxNConsumerShape155S0100000_3_I1 r1 = new com.facebook.redex.IDxNConsumerShape155S0100000_3_I1
            r1.<init>(r10, r0)
            X.0pt r0 = r10.A04
            java.util.concurrent.Executor r0 = r0.A06
            r2.A01(r1, r0)
            return
        L_0x017a:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0159
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r5 = r0.getStringExtra(r3)
            goto L_0x0159
        L_0x0189:
            X.5jv r0 = r2.A04
            android.view.View r1 = r0.A00
            r0 = 2131363112(0x7f0a0528, float:1.8346024E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131558927(0x7f0d020f, float:1.8743184E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            r0 = 2131363111(0x7f0a0527, float:1.8346022E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            r2.A00 = r0
            r0 = 2131363110(0x7f0a0526, float:1.834602E38)
            android.widget.ImageView r0 = X.C13680ns.A0J(r1, r0)
            r2.A01 = r0
            r0 = 2131363113(0x7f0a0529, float:1.8346026E38)
            android.widget.TextView r0 = X.C13680ns.A0L(r1, r0)
            r2.A02 = r0
            goto L_0x00fb
        L_0x01bd:
            X.5vd r2 = new X.5vd
            r2.<init>(r10)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112885jv.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        int i3;
        switch (i2) {
            case 200:
                i3 = R.string.str06b3;
                break;
            case 201:
                return A36(C13680ns.A0d(this, C119405xi.A05(this, this.A08, this.A0C, true), new Object[1], 0, R.string.str06b2), getString(R.string.str13e4), false);
            case 202:
                i3 = R.string.str06b1;
                break;
            default:
                return super.onCreateDialog(i2);
        }
        return A36(AnonymousClass2Sy.A05(this, this.A0B, getString(i3)), getString(R.string.str13e4), true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.str13f4));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A37();
            return true;
        }
    }

    public void onStop() {
        this.A0A.A03(this.A0I);
        super.onStop();
    }
}
