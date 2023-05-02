package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape239S0100000_3_I1;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.payments.IDxAObserverShape92S0100000_3_I1;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.IDxUExtensionShape96S0100000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5kl  reason: invalid class name */
public abstract class AnonymousClass5kl extends C112935km implements C1223169c, AnonymousClass69Z, AnonymousClass1ZI, AnonymousClass69N, AnonymousClass68Z, AnonymousClass699 {
    public C17160ud A00;
    public C16260sj A01;
    public C30671cl A02;
    public AnonymousClass160 A03;
    public AnonymousClass1Vt A04;
    public AnonymousClass1GP A05;
    public C227819g A06;
    public C18320wV A07;
    public PaymentBottomSheet A08 = new PaymentBottomSheet();
    public C119295wr A09;
    public C14860ps A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass4PY A0G = new IDxAObserverShape92S0100000_3_I1(this, 2);
    public final AnonymousClass1Vo A0H = C110105dW.A0P("IndiaUpiBaseRequestPaymentActivity");

    public Intent A3j() {
        Intent A042 = C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class);
        A042.putExtra("extra_setup_mode", 2);
        A042.putExtra("extra_payments_entry_type", 6);
        A042.putExtra("extra_is_first_payment_method", true);
        A042.putExtra("extra_skip_value_props_display", false);
        return A042;
    }

    public void A3k() {
        if (!this.A01.A0C()) {
            RequestPermissionActivity.A0B(this);
            return;
        }
        int A012 = this.A09.A01();
        if (A012 == 1) {
            A2Z(new IDxCListenerShape239S0100000_3_I1(this, 0), R.string.str0fae, R.string.str196d, R.string.str0429);
        } else if (A012 != 2) {
            C111805hR r0 = (C111805hR) this.A02.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0B) || this.A0F) {
                this.A0A.A00();
            } else {
                Afg(R.string.str196e);
            }
        } else {
            C32241fu A002 = C32241fu.A00(this);
            A002.A02(R.string.str0f43);
            A002.A01(R.string.str196c);
            C110105dW.A0w(A002, this, 18, R.string.str18bc);
            C110105dW.A0v(A002, this, 19, R.string.str18bd);
            A002.A07(false);
            A002.A00();
        }
    }

    public void A3l(C30671cl r20, HashMap hashMap) {
        C30671cl r9 = r20;
        IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity = (IndiaUpiPauseMandateActivity) this;
        indiaUpiPauseMandateActivity.Afq(R.string.str13db);
        C110605eV r13 = indiaUpiPauseMandateActivity.A06;
        long A022 = IndiaUpiPauseMandateActivity.A02(indiaUpiPauseMandateActivity.A02);
        long A023 = IndiaUpiPauseMandateActivity.A02(indiaUpiPauseMandateActivity.A01);
        if (r20 == null) {
            r9 = r13.A00;
        }
        C112355iM r11 = r13.A0B;
        AnonymousClass1Vt r8 = r13.A01;
        String str = r13.A03;
        AnonymousClass61A r12 = new AnonymousClass61A(r13, A022, A023);
        Log.i("PAY: pausePayeeMandate called");
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("action", "upi-pause-mandate", A0u);
        r11.A02(r8, A0u);
        C112355iM.A01((AnonymousClass5xB) null, (C111855hW) r8.A0A, str, A0u, true);
        C112355iM.A00(r9, hashMap, A0u);
        C28371Vv[] A032 = r11.A03(r8);
        A0u.add(new C35081lL("pause-start-ts", A022 / 1000));
        A0u.add(new C35081lL("pause-end-ts", A023 / 1000));
        C112265iD r1 = r11.A06;
        if (r1 != null) {
            r1.A00("U66", A0u);
        }
        AnonymousClass4XO A024 = C116635rh.A02(r11, "upi-pause-mandate");
        r11.A01.A0H(new IDxNCallbackShape21S0200000_3_I1(r11.A00, r11.A02, r11.A05, A024, (AnonymousClass68Q) r12, r11, 7), C110105dW.A0W(A0u, A032), "set", 0);
    }

    public final void A3m(AnonymousClass1Vt r5) {
        C111855hW A0K = C110115dX.A0K(r5);
        String str = A0K.A0J;
        if (!this.A0C.A0C(2700) || A0K.A0B == null) {
            this.A0P.A05("UPI").AES().Ahi(C110105dW.A0K(str), new AnonymousClass60W(this, str));
            return;
        }
        this.A0H.A06("skipping verifyReceiver for mandates");
        this.A0C = str;
        this.A0B = (String) C110105dW.A0d(A0K.A07);
        A3n(this.A08);
    }

    public void A3n(PaymentBottomSheet paymentBottomSheet) {
        ConfirmPaymentFragment A012 = ConfirmPaymentFragment.A01(this.A02, (UserJid) null, this.A0n, this.A0F ^ true ? 1 : 0);
        A012.A0L = this;
        A012.A0M = this;
        paymentBottomSheet.A01 = A012;
        Afb(paymentBottomSheet, "ConfirmPaymentFragment");
    }

    public void A3o(PaymentBottomSheet paymentBottomSheet) {
        C30671cl r2 = this.A02;
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putParcelable("extra_bank_account", r2);
        IndiaUpiForgotPinDialogFragment indiaUpiForgotPinDialogFragment = new IndiaUpiForgotPinDialogFragment();
        indiaUpiForgotPinDialogFragment.A0T(A0D2);
        indiaUpiForgotPinDialogFragment.A04 = this;
        paymentBottomSheet.A01 = indiaUpiForgotPinDialogFragment;
        Afb(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
    }

    public void A3p(PaymentBottomSheet paymentBottomSheet) {
        paymentBottomSheet.A01 = C110115dX.A0T(this.A02, this);
        Afb(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
    }

    public void A3q(PaymentBottomSheet paymentBottomSheet, String str) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            paymentBottomSheet.A00 = null;
        }
        A2e(str);
    }

    public void A5E(ViewGroup viewGroup) {
        AnonymousClass5xC r3;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this;
            View inflate = indiaUpiMandatePaymentActivity.getLayoutInflater().inflate(R.layout.layout0122, viewGroup, true);
            TextView A0L = C13680ns.A0L(inflate, R.id.date_value);
            TextView A0L2 = C13680ns.A0L(inflate, R.id.frequency_value);
            TextView A0L3 = C13680ns.A0L(inflate, R.id.total_value);
            AnonymousClass1Vt r5 = indiaUpiMandatePaymentActivity.A01.A08;
            AnonymousClass1W2 r1 = r5.A0A;
            if ((r1 instanceof C111855hW) && (r3 = ((C111855hW) r1).A0B) != null) {
                A0L.setText(indiaUpiMandatePaymentActivity.A0H.A04(r3.A01));
                A0L2.setText(indiaUpiMandatePaymentActivity.A0H.A06(r3.A0E));
                A0L3.setText(indiaUpiMandatePaymentActivity.A0H.A05(r5.A08, r3.A0F));
                return;
            }
            return;
        }
        View inflate2 = getLayoutInflater().inflate(R.layout.layout0123, viewGroup, true);
        if (this.A04 != null) {
            C13680ns.A0L(inflate2, R.id.amount).setText(this.A02.A01("INR").A9H(this.A01, this.A04.A08, 0));
        }
    }

    public String AAl(C30671cl r2, int i2) {
        return getString(this instanceof IndiaUpiMandatePaymentActivity ? R.string.str18e1 : R.string.str10d2);
    }

    public String ABa(C30671cl r2) {
        return getString(R.string.str10d5);
    }

    public String ABb(C30671cl r3) {
        return C119405xi.A05(this, r3, this.A0P, false);
    }

    public String ABu(C30671cl r2, int i2) {
        return null;
    }

    public String ADg(C30671cl r6) {
        C35301lh A052 = this.A0C.A05();
        if (C39841t9.A03(A052)) {
            return null;
        }
        return C13680ns.A0d(this, C39841t9.A02(A052), C13680ns.A1b(), 0, R.string.str0b6f);
    }

    public boolean AJN() {
        C35511m3 r0 = this.A0B;
        return r0 != null && r0.A0B();
    }

    public void AMf(ViewGroup viewGroup) {
    }

    public void AMg(ViewGroup viewGroup) {
        View inflate = getLayoutInflater().inflate(R.layout.layout011b, viewGroup, true);
        C110105dW.A0r(C110105dW.A08(this, inflate, C13680ns.A0L(inflate, R.id.text), R.string.str0526), this, 35);
    }

    public void AMi(ViewGroup viewGroup) {
        View inflate = getLayoutInflater().inflate(R.layout.layout030e, viewGroup, true);
        ImageView A0J = C13680ns.A0J(inflate, R.id.payment_recipient_profile_pic);
        TextView A0L = C13680ns.A0L(inflate, R.id.payment_recipient_name);
        TextView A0L2 = C13680ns.A0L(inflate, R.id.payment_recipient_vpa);
        C004601z.A0E(inflate, R.id.expand_receiver_details_button).setVisibility(0);
        C110105dW.A0r(inflate, this, 36);
        this.A00.A05(A0J, R.drawable.avatar_contact);
        A0L.setText(this.A0B);
        A0L2.setText(C13680ns.A0d(this, this.A0C, new Object[1], 0, R.string.str0b6f));
    }

    public void AOl() {
        this.A08.A1N();
    }

    public void AP0(View view, View view2, C35511m3 r8, C30671cl r9, PaymentBottomSheet paymentBottomSheet) {
        A3q(this.A08, "ConfirmPaymentFragment");
        String[] split = this.A0D.A05().split(";");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (split[i2].equalsIgnoreCase(this.A02.A0A)) {
                this.A0E = true;
                break;
            } else {
                i2++;
            }
        }
        C111805hR r0 = (C111805hR) this.A02.A08;
        if (r0 == null || !AnonymousClass000.A1X(r0.A05.A00) || this.A0E) {
            A3k();
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A08 = paymentBottomSheet2;
        A3o(paymentBottomSheet2);
    }

    public void AP7() {
        Intent A042 = C110105dW.A04(this, IndiaUpiDebitCardVerificationActivity.class);
        C110115dX.A0o(A042, this.A02);
        A3M(A042);
        A042.putExtra("extra_previous_screen", "setup_pin_prompt");
        Ag3(A042, 1016);
    }

    public void AP9() {
        A3q(this.A08, "IndiaUpiForgotPinDialogFragment");
        C18300wT r2 = this.A0D;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(r2.A05());
        A0o.append(";");
        r2.A0J(AnonymousClass000.A0h(this.A02.A0A, A0o));
        this.A0E = true;
        A3k();
    }

    public void ARV(ViewGroup viewGroup, C30671cl r3) {
        C111345g2.A1g(getLayoutInflater(), viewGroup, this);
    }

    public void ARX() {
        Intent A022 = IndiaUpiPinPrimerFullSheetActivity.A02(this, (C35521m4) this.A02, true);
        A3M(A022);
        Ag3(A022, 1017);
    }

    public void ARY() {
        this.A08.A1N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (r2.A02 == null) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ASh(X.AnonymousClass2HJ r9, java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0058
            X.1Vo r1 = r8.A0H
            java.lang.String r0 = "onListKeys contains non empty keys"
            r1.A06(r0)
            X.4XO r1 = r8.A06
            java.lang.String r0 = "upi-get-credential"
            r1.A03(r0)
            X.1cl r7 = r8.A02
            r1 = r8
            boolean r0 = r8 instanceof com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 == 0) goto L_0x0071
            com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            X.5eV r5 = r1.A06
            if (r7 != 0) goto L_0x0023
            X.1cl r7 = r5.A00
        L_0x0023:
            X.1Vt r4 = r5.A01
            X.1W2 r3 = r4.A0A
            X.5hW r3 = (X.C111855hW) r3
            X.1tF r2 = r7.A08
            X.AnonymousClass00B.A06(r2)
            X.5hR r2 = (X.C111805hR) r2
            r0 = 0
            X.5tM r1 = new X.5tM
            r1.<init>(r0)
            r1.A06 = r10
            java.lang.String r0 = r7.A0B
            r1.A05 = r0
            X.1lh r0 = r2.A08
            r1.A02 = r0
            r1.A03 = r3
            X.1lh r0 = r7.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A08 = r0
            java.lang.String r0 = r3.A0J
            r1.A07 = r0
            X.1Vy r0 = r4.A08
            r1.A01 = r0
            X.1cy r0 = r5.A02
            r0.A0B(r1)
        L_0x0057:
            return
        L_0x0058:
            if (r9 == 0) goto L_0x0057
            int r2 = r9.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.C1200960h.A02(r8, r1, r2, r0)
            if (r0 != 0) goto L_0x0057
            X.4XO r0 = r8.A06
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x00f2
            X.C111345g2.A1y(r8)
            return
        L_0x0071:
            com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.5ea r3 = r1.A01
            if (r7 != 0) goto L_0x0079
            X.1cl r7 = r3.A06
        L_0x0079:
            X.1Vt r4 = r3.A08
            X.1W2 r5 = r4.A0A
            X.5hW r5 = (X.C111855hW) r5
            X.1tF r6 = r7.A08
            X.1Vo r1 = r3.A0L
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            java.lang.String r0 = r1.A02(r0)
            X.AnonymousClass00B.A07(r6, r0)
            X.5hR r6 = (X.C111805hR) r6
            r0 = 0
            X.5tQ r2 = new X.5tQ
            r2.<init>(r0)
            r2.A0A = r10
            java.lang.String r0 = r7.A0B
            r2.A09 = r0
            X.1lh r0 = r6.A08
            r2.A04 = r0
            r2.A05 = r5
            X.1lh r0 = r7.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r2.A0C = r0
            java.lang.String r0 = r5.A0J
            r2.A0B = r0
            r0 = 8
            int r1 = r3.A00
            if (r0 == r1) goto L_0x00d3
            r0 = 1
            if (r0 == r1) goto L_0x00d3
            r0 = 4
            if (r0 == r1) goto L_0x00d3
            r0 = 9
            if (r0 == r1) goto L_0x00d3
            r0 = 7
            if (r0 == r1) goto L_0x00d3
            r0 = 3
            if (r0 == r1) goto L_0x00c5
            r0 = 6
            if (r0 != r1) goto L_0x00cd
        L_0x00c5:
            java.lang.String r0 = r3.A0B
            r5.A0N = r0
        L_0x00c9:
            X.1Vy r0 = r4.A08
            r2.A02 = r0
        L_0x00cd:
            X.1cy r0 = r3.A0A
            r0.A0B(r2)
            return
        L_0x00d3:
            X.5xC r0 = r5.A0B
            if (r0 == 0) goto L_0x00ed
            X.5xB r1 = r0.A0C
            if (r1 == 0) goto L_0x00ed
            X.1lh r0 = r1.A04
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r5.A0N = r0
            X.1lh r0 = r1.A03
            if (r0 == 0) goto L_0x00ed
            X.1Vy r0 = r1.A00()
            r2.A02 = r0
        L_0x00ed:
            X.1Vy r0 = r2.A02
            if (r0 != 0) goto L_0x00cd
            goto L_0x00c9
        L_0x00f2:
            X.1Vo r2 = r8.A0H
            java.lang.String r0 = "onListKeys: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            if (r10 == 0) goto L_0x0114
            int r0 = r10.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0104:
            r1.append(r0)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A06(r0)
            r8.A3b()
            return
        L_0x0114:
            r0 = 0
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5kl.ASh(X.2HJ, java.lang.String):void");
    }

    public void AUW(PaymentBottomSheet paymentBottomSheet, int i2) {
        PaymentMethodsListPickerFragment A012 = PaymentMethodsListPickerFragment.A01(this.A0D);
        A012.A08 = new IDxUExtensionShape96S0100000_3_I1(this, 1);
        A012.A06 = this;
        A012.A0W(paymentBottomSheet.A01, 0);
        paymentBottomSheet.A1O(A012);
    }

    public void AUY(C30671cl r1) {
        this.A02 = r1;
    }

    public void AUZ(C30671cl r2, PaymentMethodRow paymentMethodRow) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            this.A02 = r2;
        }
    }

    public void AUc(PaymentBottomSheet paymentBottomSheet, int i2, int i3) {
    }

    public void AUg(PaymentBottomSheet paymentBottomSheet, int i2) {
    }

    public void AUh(int i2) {
        this.A0n = i2 == 1 ? "p2p" : "p2m";
    }

    public void AWT(boolean z2) {
        if (z2) {
            A3n(this.A08);
        }
    }

    public void AZ9(PaymentBottomSheet paymentBottomSheet) {
    }

    public boolean AfC(C30671cl r2, int i2) {
        return false;
    }

    public boolean AfK(C30671cl r2) {
        return true;
    }

    public boolean AfL() {
        return false;
    }

    public void AfY(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        PaymentBottomSheet paymentBottomSheet;
        String str;
        if (i2 != 155) {
            switch (i2) {
                case 1015:
                    return;
                case 1016:
                    if (i3 == -1 && intent != null) {
                        C30671cl r0 = (C30671cl) intent.getParcelableExtra("extra_bank_account");
                        if (r0 != null) {
                            this.A02 = r0;
                        }
                        C18300wT r2 = this.A0D;
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append(r2.A05());
                        A0o.append(";");
                        r2.A0J(AnonymousClass000.A0h(this.A02.A0A, A0o));
                        paymentBottomSheet = this.A08;
                        str = "IndiaUpiPinPrimerDialogFragment";
                        break;
                    } else {
                        return;
                    }
                    break;
                case 1017:
                    if (i3 == -1) {
                        C18300wT r22 = this.A0D;
                        StringBuilder A0o2 = AnonymousClass000.A0o();
                        A0o2.append(r22.A05());
                        A0o2.append(";");
                        r22.A0J(AnonymousClass000.A0h(this.A02.A0A, A0o2));
                        paymentBottomSheet = this.A08;
                        str = "IndiaUpiForgotPinDialogFragment";
                        break;
                    } else {
                        return;
                    }
                case 1018:
                    if (TextUtils.isEmpty(this.A0B)) {
                        Afq(R.string.str13db);
                        A3m(this.A04);
                        return;
                    }
                    A3n(this.A08);
                    return;
                default:
                    super.onActivityResult(i2, i3, intent);
                    return;
            }
            A3q(paymentBottomSheet, str);
            C30671cl r3 = this.A02;
            Intent A042 = C110105dW.A04(this, IndiaUpiPinSetUpCompletedActivity.class);
            C110115dX.A0o(A042, r3);
            A042.putExtra("on_settings_page", false);
            Ag3(A042, 1018);
        } else if (i3 == -1) {
            A3k();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.A02(this.A0G);
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 34) {
            return super.onCreateDialog(i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(R.string.str1005);
        C13690nt.A1F(A002);
        A002.A0C(new IDxDListenerShape160S0100000_3_I1(this, 9));
        return A002.create();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.A03(this.A0G);
    }
}
