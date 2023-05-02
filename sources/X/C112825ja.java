package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.facebook.redex.IDxCListenerShape130S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape163S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape239S0100000_3_I1;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.payments.CheckFirstTransaction;
import com.obwhatsapp.payments.IDxAObserverShape92S0100000_3_I1;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.obwhatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.obwhatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ja  reason: invalid class name and case insensitive filesystem */
public abstract class C112825ja extends C112915kf implements C1222868z, AnonymousClass69N, AnonymousClass699, C1220067x, C1220267z {
    public AnonymousClass01Y A00;
    public C17160ud A01;
    public C17140ub A02;
    public C16080sP A03;
    public AnonymousClass2Ao A04;
    public C17200uh A05;
    public C16260sj A06;
    public C221116r A07;
    public C16010sH A08;
    public C28411Vz A09;
    public C28401Vy A0A;
    public C30671cl A0B;
    public UserJid A0C;
    public AnonymousClass1XP A0D;
    public CheckFirstTransaction A0E;
    public AnonymousClass60O A0F;
    public C118055tz A0G;
    public C111855hW A0H = new C111855hW();
    public AnonymousClass1GP A0I;
    public AnonymousClass17Y A0J;
    public C227819g A0K;
    public AnonymousClass5xE A0L;
    public C18320wV A0M;
    public C112345iL A0N;
    public C112285iF A0O;
    public C209512f A0P;
    public C209712h A0Q;
    public C117365ss A0R;
    public AnonymousClass5wW A0S;
    public C118145uD A0T;
    public C116715rp A0U;
    public C114585o0 A0V;
    public PaymentDescriptionRow A0W;
    public PaymentView A0X;
    public AnonymousClass5vS A0Y;
    public C119295wr A0Z;
    public C218315p A0a;
    public C17020u3 A0b;
    public String A0c = "";
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i = null;
    public List A0j;
    public AnonymousClass01J A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public final AnonymousClass4PY A0s = new IDxAObserverShape92S0100000_3_I1(this, 3);
    public final AnonymousClass1Vo A0t = AnonymousClass1Vo.A00("IndiaUpiPaymentActivity", "payment", "IN");
    public final AtomicInteger A0u = new AtomicInteger();

    public static /* synthetic */ AnonymousClass2St A02(C28401Vy r3, C53322fW r4, C112825ja r5) {
        return (C39841t9.A03(r5.A06) || !r5.A0a.A0e(r5.A0G)) ? AnonymousClass5xP.A00(r5.A05, r3, r4, (String) null, true) : C112525id.A00();
    }

    private void A03() {
        if (!this.A06.A0C()) {
            this.A0F.AL3("request_phone_number_permission", 123);
            RequestPermissionActivity.A0B(this);
            return;
        }
        int A012 = this.A0Z.A01();
        if (A012 == 1) {
            A2Z(new IDxCListenerShape239S0100000_3_I1(this, 1), R.string.str0fae, R.string.str196d, R.string.str0429);
        } else if (A012 != 2) {
            C111805hR r0 = (C111805hR) this.A0B.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0B) || this.A0p) {
                this.A06.A02("pay-entry-ui");
                Afq(R.string.str13db);
                this.A0G = true;
                if (A49()) {
                    A3s();
                    A45(A3l(this.A0A, this.A01), false);
                    this.A0o = true;
                }
                this.A0A.A00();
                return;
            }
            Afg(R.string.str196e);
        } else {
            C32241fu A002 = C32241fu.A00(this);
            A002.A02(R.string.str0f43);
            A002.A01(R.string.str196c);
            C110105dW.A0w(A002, this, 31, R.string.str18bc);
            C110105dW.A0v(A002, this, 39, R.string.str18bd);
            A002.A07(false);
            A002.A00();
        }
    }

    public static void A09(C30671cl r3, C112825ja r4) {
        C30671cl r0 = r4.A0B;
        if (r0 != r3) {
            r4.A3t(63, C111345g2.A20(r0, r4) ? "add_credential_prompt" : "available_payment_methods_prompt");
        }
        r4.A0B = r3;
        PaymentView paymentView = r4.A0X;
        if (paymentView != null) {
            paymentView.setBankLogo(r3.A05());
            r4.A0X.setPaymentMethodText(C119405xi.A05(r4, r4.A0B, r4.A0P, true));
        }
    }

    public void A2S(int i2) {
        if (i2 != R.string.str10c6 && i2 != R.string.str0fe9) {
            A3H();
            finish();
        }
    }

    public void A39(Bundle bundle) {
        this.A09 = null;
        this.A0Q = null;
        super.A39(bundle);
    }

    public final Dialog A3j(Bundle bundle) {
        AnonymousClass61W r4 = this.A0E;
        r4.A02.A06(r4.A04(0, 51, "payment_confirm_prompt", this.A0g, this.A0g, this.A0f, C112765jH.A23(this)));
        C32241fu A002 = C32241fu.A00(this);
        A002.A02(R.string.str0eb4);
        C110105dW.A0w(A002, this, 35, R.string.str0e87);
        A002.A07(false);
        if (bundle != null) {
            A002.A06(this.A03.A01(bundle, getString(R.string.str0eb3)));
        }
        return A002.create();
    }

    public final Intent A3k() {
        Intent A042 = C110105dW.A04(this, IndiaUpiPaymentSettingsActivity.class);
        this.A0H.A0F = C224718b.A00(this.A01, this.A05, false);
        C111855hW r1 = this.A0H;
        r1.A0P = this.A0i;
        A042.putExtra("extra_country_transaction_data", r1);
        A042.putExtra("extra_transaction_send_amount", this.A0A);
        A042.putExtra("extra_payment_method", this.A0B);
        A042.putExtra("extra_open_transaction_confirmation_fragment", true);
        A042.putExtra("extra_encrypted_interop_description", this.A0d);
        C110115dX.A0r(A042, this.A0g);
        A042.putExtra("extra_receiver_vpa", this.A09);
        A042.putExtra("extra_payment_upi_number", this.A08);
        A3M(A042);
        return A042;
    }

    public C53312fV A3l(C28401Vy r5, int i2) {
        C53302fU r2;
        if (i2 == 0 && (r2 = this.A0T.A00().A01) != null) {
            if (r5.A00.compareTo(r2.A09.A00.A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public ConfirmPaymentFragment A3m(C28401Vy r16, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass1WD A012;
        PaymentView paymentView = this.A0X;
        C34151jm stickerIfSelected = paymentView != null ? paymentView.getStickerIfSelected() : null;
        C53322fW r12 = null;
        C35361lo paymentBackground = paymentView != null ? paymentView.getPaymentBackground() : null;
        if (stickerIfSelected == null && paymentBackground == null) {
            A012 = null;
        } else {
            C18270wQ r5 = this.A0S;
            C15830rv r7 = this.A0E;
            AnonymousClass00B.A06(r7);
            UserJid userJid = this.A0G;
            long j2 = this.A02;
            C16740tZ A002 = j2 != 0 ? this.A09.A0K.A00(j2) : null;
            PaymentView paymentView2 = this.A0X;
            A012 = r5.A01(paymentBackground, r7, userJid, A002, stickerIfSelected, paymentView2 != null ? paymentView2.getStickerSendOrigin() : null);
        }
        this.A0D = null;
        this.A0f = null;
        C28411Vz A013 = this.A02.A01("INR");
        ConfirmPaymentFragment A014 = ConfirmPaymentFragment.A01(this.A0B, (UserJid) null, this.A0n, this.A0p ^ true ? 1 : 0);
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0X;
        if (!(paymentIncentiveViewModel == null || paymentIncentiveViewModel.A02.A01() == null)) {
            r12 = (C53322fW) ((AnonymousClass5xI) this.A0X.A02.A01()).A01;
        }
        C28401Vy r11 = r16;
        A014.A0L = new AnonymousClass622(A013, r11, r12, this, paymentBottomSheet);
        A014.A0M = new AnonymousClass625(A012, r11, r12, A014, this);
        return A014;
    }

    public final String A3n() {
        C35301lh r0;
        if (!C39841t9.A03(this.A07)) {
            r0 = this.A07;
        } else if (this.A08 != null && !A47()) {
            return this.A03.A0E(this.A08);
        } else {
            r0 = this.A09;
        }
        return (String) C110105dW.A0d(r0);
    }

    public final String A3o() {
        if (!TextUtils.isEmpty(this.A0I)) {
            this.A0t.A06(AnonymousClass000.A0h(this.A0I, AnonymousClass000.A0r("getSeqNum/incomingPayRequestId")));
            return this.A0I;
        } else if (!TextUtils.isEmpty(this.A0m)) {
            this.A0t.A06(AnonymousClass000.A0h(this.A0m, AnonymousClass000.A0r("getSeqNum/transactionId")));
            return this.A0m;
        } else {
            String A1b = C111345g2.A1b(this);
            this.A0t.A06(AnonymousClass000.A0h(AnonymousClass5x3.A00(A1b), AnonymousClass000.A0r("getSeqNum/seqNum generated:")));
            return A1b;
        }
    }

    public void A3p() {
        if (this instanceof IndiaUpiSendPaymentActivity) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
            if (indiaUpiSendPaymentActivity.A4G()) {
                C28401Vy r2 = indiaUpiSendPaymentActivity.A0A;
                indiaUpiSendPaymentActivity.Afq(R.string.str13db);
                indiaUpiSendPaymentActivity.A05.Acl(new C1213565e(r2, indiaUpiSendPaymentActivity));
                return;
            }
            indiaUpiSendPaymentActivity.A0B.AUV();
            return;
        }
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
        if (indiaUpiCheckOrderDetailsActivity.A0C.A0C(1916)) {
            C35301lh r1 = indiaUpiCheckOrderDetailsActivity.A09;
            if (!C39841t9.A04(r1)) {
                indiaUpiCheckOrderDetailsActivity.A4B(indiaUpiCheckOrderDetailsActivity.A0A, (String) r1.A00);
            }
        }
    }

    public void A3q() {
        if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            UserJid of = UserJid.of(indiaUpiCheckOrderDetailsActivity.A05.A08.A00);
            indiaUpiCheckOrderDetailsActivity.A0C = of;
            indiaUpiCheckOrderDetailsActivity.A08 = (of == null || indiaUpiCheckOrderDetailsActivity.A47()) ? null : indiaUpiCheckOrderDetailsActivity.A08.A01(indiaUpiCheckOrderDetailsActivity.A0C);
            return;
        }
        if (this.A0E == null) {
            this.A0E = C15830rv.A02(getIntent().getStringExtra("extra_jid"));
            this.A0G = UserJid.getNullable(getIntent().getStringExtra("extra_receiver_jid"));
        }
        C15830rv r1 = this.A0E;
        this.A0C = C16030sJ.A0L(r1) ? this.A0G : UserJid.of(r1);
        C16010sH A012 = A47() ? null : this.A08.A01(this.A0C);
        this.A08 = A012;
        PaymentView paymentView = this.A0X;
        if (paymentView == null) {
            return;
        }
        if (A012 != null) {
            String AFP = AFP();
            boolean A48 = A48();
            paymentView.A1F = AFP;
            paymentView.A0G.setText(AFP);
            paymentView.A06.setVisibility(C13680ns.A02(A48 ? 1 : 0));
            paymentView.A0X.A06(paymentView.A0V, A012);
            return;
        }
        Object[] A1b = C13680ns.A1b();
        Object obj = this.A09.A00;
        AnonymousClass00B.A06(obj);
        String A0d2 = C13680ns.A0d(this, obj, A1b, 0, R.string.str10d4);
        PaymentView paymentView2 = this.A0X;
        String str = (String) C110105dW.A0d(this.A07);
        boolean A482 = A48();
        if (!TextUtils.isEmpty(str)) {
            paymentView2.A1F = str;
            paymentView2.A0H.setText(A0d2);
        } else {
            paymentView2.A1F = A0d2;
        }
        paymentView2.A0G.setText(paymentView2.A02(paymentView2.A1F, R.string.str10d3));
        paymentView2.A06.setVisibility(C13680ns.A02(A482 ? 1 : 0));
        paymentView2.A0W.A05(paymentView2.A0V, R.drawable.avatar_contact);
    }

    public void A3r() {
        Intent A042 = C110105dW.A04(this, IndiaUpiBankPickerActivity.class);
        A042.putExtra("extra_payments_entry_type", 6);
        A042.putExtra("extra_is_first_payment_method", !C111345g2.A21(this));
        A042.putExtra("extra_skip_value_props_display", C111345g2.A21(this));
        startActivityForResult(A042, 1008);
    }

    public final void A3s() {
        C39901tF r3 = this.A0B.A08;
        AnonymousClass1Vo r2 = this.A0t;
        AnonymousClass00B.A07(r3, r2.A02("onListKeys: Cannot get IndiaUpiMethodData"));
        C111805hR r32 = (C111805hR) r3;
        this.A0H.A0N = A3o();
        C111855hW r1 = this.A0H;
        r1.A0E = this.A0D;
        r1.A0L = AnonymousClass60V.A00(this.A0C);
        this.A0H.A0M = this.A0C.A0D();
        C35301lh r0 = this.A09;
        if (r0 == null) {
            r2.A06(AnonymousClass000.A0h(this.A0Q, AnonymousClass000.A0r("vpa is null, while fetching list-keys, vpaId: ")));
        } else {
            this.A0H.A0J = (String) C39841t9.A02(r0);
        }
        C111855hW r22 = this.A0H;
        r22.A0H = this.A0K;
        r22.A0I = this.A0M;
        r22.A0K = this.A0Q;
        r22.A05 = this.A05.A00();
        this.A0H.A09 = r32.A06;
    }

    public void A3t(int i2, String str) {
        AnonymousClass61W r0 = this.A0E;
        String str2 = str;
        r0.A02.A06(r0.A04(C13680ns.A0Y(), Integer.valueOf(i2), str2, this.A0g, this.A0g, this.A0f, C112765jH.A23(this)));
    }

    public void A3u(Context context, boolean z2) {
        Intent A042 = C110105dW.A04(context, IndiaUpiPaymentsAccountSetupActivity.class);
        A042.putExtra("extra_setup_mode", 1);
        if (context instanceof IndiaUpiCheckOrderDetailsActivity) {
            A042.putExtra("extra_payments_entry_type", 11);
            A042.putExtra("extra_order_type", this.A0g);
            A042.putExtra("extra_payment_config_id", this.A0f);
        } else {
            A042.putExtra("extra_payments_entry_type", 6);
        }
        A042.putExtra("extra_is_first_payment_method", !C111345g2.A21(this));
        A042.putExtra("extra_skip_value_props_display", z2);
        C35301lh r1 = this.A06;
        if (r1 != null) {
            A042.putExtra("extra_order_formatted_discount_amount", r1);
        }
        UserJid userJid = this.A0G;
        if (userJid != null) {
            A042.putExtra("extra_receiver_jid", userJid.getRawString());
        }
        C110115dX.A0r(A042, this.A0g);
        AnonymousClass22U.A00(A042, "payViewAddPayment");
        startActivityForResult(A042, 1008);
    }

    public /* synthetic */ void A3v(AnonymousClass01A r2) {
        if ((this instanceof IndiaUpiQuickBuyActivity) && (r2 instanceof PaymentBottomSheet)) {
            ((PaymentBottomSheet) r2).A00 = null;
        }
    }

    public /* synthetic */ void A3w(AnonymousClass01A r3) {
        if ((this instanceof IndiaUpiQuickBuyActivity) && (r3 instanceof PaymentBottomSheet)) {
            ((PaymentBottomSheet) r3).A00 = new IDxDListenerShape160S0100000_3_I1(this, 20);
        }
    }

    public void A3x(C28401Vy r15) {
        this.A0F.AL3("confirm_payment", 123);
        this.A0A = r15;
        AnonymousClass61W r4 = this.A0E;
        String str = this.A0g;
        boolean A23 = C112765jH.A23(this);
        r4.AKV((C39841t9.A03(this.A06) || !this.A0a.A0e(this.A0G)) ? AnonymousClass5xP.A00(this.A05, r15, this.A0U, (String) null, true) : C112525id.A00(), 1, 47, "payment_confirm_prompt", str, this.A0g, this.A0f, false, A23);
        C111805hR r6 = (C111805hR) this.A0B.A08;
        String[] split = this.A0D.A05().split(";");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (split[i2].equalsIgnoreCase(this.A0B.A0A)) {
                this.A0m = true;
                break;
            } else {
                i2++;
            }
        }
        if (r6 == null || !Boolean.TRUE.equals(r6.A05.A00) || this.A0m) {
            A03();
            return;
        }
        C30671cl r2 = this.A0B;
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putParcelable("extra_bank_account", r2);
        IndiaUpiForgotPinDialogFragment indiaUpiForgotPinDialogFragment = new IndiaUpiForgotPinDialogFragment();
        indiaUpiForgotPinDialogFragment.A0T(A0D2);
        indiaUpiForgotPinDialogFragment.A04 = this;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = indiaUpiForgotPinDialogFragment;
        Afb(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
        A3w(paymentBottomSheet);
    }

    public final void A3y(AnonymousClass1Vt r5, boolean z2) {
        String str;
        Intent A042 = C110105dW.A04(this, IndiaUpiPaymentTransactionDetailsActivity.class);
        C110115dX.A0q(A042, r5, r5.A0C);
        A042.putExtra("extra_transaction_ref", this.A0P);
        if (this.A0q) {
            A042.setFlags(33554432);
            A042.putExtra("extra_return_after_completion", true);
            str = "external_app";
        } else {
            str = this.A0g;
        }
        A042.putExtra("referral_screen", str);
        A042.putExtra("extra_payment_flow_entry_point", this.A01);
        if (z2) {
            A042.setFlags(67108864);
        }
        A042.putExtra("extra_action_bar_display_close", true);
        A2X(A042, true);
        Ac1();
        A3H();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
        if ("pay-precheck".equals("pay-precheck") == false) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3z(X.C111765hN r19, X.C111765hN r20, X.AnonymousClass2HJ r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r18 = this;
            r11 = 0
            r3 = 1
            r5 = 0
            r6 = r19
            boolean r9 = X.AnonymousClass000.A1V(r6)
            r1 = r20
            boolean r7 = X.AnonymousClass000.A1V(r1)
            r10 = r18
            X.61W r2 = r10.A0E
            r0 = 21
            r4 = r21
            X.2gO r8 = r2.A02(r4, r0)
            if (r21 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0107
            r0 = 3
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0D = r0
        L_0x0026:
            X.1cl r0 = r10.A0B
            X.1tF r0 = r0.A08
            if (r0 == 0) goto L_0x0103
            X.5hR r0 = (X.C111805hR) r0
            java.lang.String r0 = r0.A0C
        L_0x0030:
            r8.A0O = r0
            X.1Vo r2 = r10.A0t
            java.lang.String r0 = "PaymentWamEvent checkpin event:"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r7)
            r2.A06(r0)
            java.lang.String r0 = "precheck"
            r8.A0a = r0
            X.C111345g2.A1s(r8, r10)
            if (r21 != 0) goto L_0x0078
            if (r19 != 0) goto L_0x0078
            if (r20 != 0) goto L_0x0078
            r7 = r22
            if (r22 == 0) goto L_0x0078
            java.lang.String r0 = "onPrecheck success, sending payment"
            r2.A06(r0)
            r10.A0m = r7
            r0 = r23
            r10.A0i = r0
            boolean r0 = r10.A49()
            if (r0 == 0) goto L_0x010c
            r10.A0n = r3
            boolean r0 = r10.A0l
            if (r0 == 0) goto L_0x0077
            android.content.Intent r0 = r10.A3k()
            r10.finish()
            r10.startActivity(r0)
        L_0x0077:
            return
        L_0x0078:
            r10.Ac1()
            r10.A0o = r5
            if (r21 != 0) goto L_0x011b
            java.lang.String r4 = "vpaId: "
            java.lang.String r5 = "vpa: "
            if (r20 == 0) goto L_0x0101
            java.lang.String r0 = "onPrecheck received receiver vpa update: jid: "
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r0)
            com.whatsapp.jid.UserJid r0 = r1.A05
            r7.append(r0)
            r7.append(r5)
            X.1lh r0 = r1.A02
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r1.A03
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r7)
            r2.A06(r0)
            com.whatsapp.jid.UserJid r0 = r1.A05
            r10.A0G = r0
            X.1lh r0 = r1.A02
            r10.A09 = r0
            java.lang.String r0 = r1.A03
            r10.A0Q = r0
            boolean r0 = r10.A4A(r1)
            r0 = r0 ^ 1
        L_0x00b6:
            if (r19 == 0) goto L_0x00fd
            java.lang.String r0 = "onPrecheck received sender vpa update: jid"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            com.whatsapp.jid.UserJid r0 = r6.A05
            r1.append(r0)
            r1.append(r5)
            X.1lh r0 = r6.A02
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A03
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A06(r0)
        L_0x00d7:
            r10.Ac1()
            X.1fu r2 = X.C32241fu.A00(r10)
            r0 = 2131890320(0x7f121090, float:1.9415328E38)
            if (r3 == 0) goto L_0x00e6
            r0 = 2131890579(0x7f121193, float:1.9415854E38)
        L_0x00e6:
            r2.A01(r0)
            r1 = 2131893158(0x7f121ba6, float:1.9421085E38)
            r0 = 38
            X.C110105dW.A0w(r2, r10, r0, r1)
            r1 = 2131889635(0x7f120de3, float:1.941394E38)
            r0 = 36
            X.C110105dW.A0v(r2, r10, r0, r1)
            r2.A00()
            return
        L_0x00fd:
            if (r0 == 0) goto L_0x0077
            r3 = 0
            goto L_0x00d7
        L_0x0101:
            r0 = 0
            goto L_0x00b6
        L_0x0103:
            java.lang.String r0 = ""
            goto L_0x0030
        L_0x0107:
            if (r7 == 0) goto L_0x0026
            r0 = 4
            goto L_0x0020
        L_0x010c:
            com.obwhatsapp.payments.CheckFirstTransaction r0 = r10.A0E
            X.1WD r1 = r0.A00
            com.facebook.redex.IDxNConsumerShape3S0110000_3_I1 r0 = new com.facebook.redex.IDxNConsumerShape3S0110000_3_I1
            r2 = r24
            r0.<init>(r10, r5, r2)
            r1.A00(r0)
            return
        L_0x011b:
            int r1 = r4.A00
            r0 = 2896004(0x2c3084, float:4.058166E-39)
            if (r1 == r0) goto L_0x0157
            r0 = 2896003(0x2c3083, float:4.058165E-39)
            if (r1 == r0) goto L_0x0157
            X.5wW r3 = r10.A0S
            java.lang.String r2 = "pay-precheck"
            com.whatsapp.jid.UserJid r14 = r10.A0C
            X.1lh r0 = r10.A07
            java.lang.Object r15 = X.C110105dW.A0d(r0)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r0 = "upi-accept-collect"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0152
            boolean r0 = r2.equals(r2)
            if (r0 != 0) goto L_0x0153
        L_0x0144:
            r16 = r11
            r17 = r11
            X.5su r12 = new X.5su
            r13 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            r3.A01(r10, r4, r12, r2)
            return
        L_0x0152:
            r1 = 0
        L_0x0153:
            X.AnonymousClass00B.A0F(r1)
            goto L_0x0144
        L_0x0157:
            X.0t3 r1 = r10.A05
            X.2fW r0 = r10.A0U
            X.2St r3 = X.AnonymousClass5xP.A00(r1, r11, r0, r11, r5)
            X.61W r2 = r10.A0E
            java.lang.String r1 = "incentive_unavailable"
            java.lang.String r0 = "payment_confirm_prompt"
            X.AnonymousClass5xP.A02(r3, r2, r1, r0)
            r0 = 7
            r10.A01 = r0
            r10.A3E(r11)
            r10.A0G = r5
            X.5xE r9 = r10.A0L
            int r15 = r4.A00
            r0 = 16
            com.facebook.redex.IDxDListenerShape160S0100000_3_I1 r12 = new com.facebook.redex.IDxDListenerShape160S0100000_3_I1
            r12.<init>(r10, r0)
            r14 = r11
            r13 = r11
            X.02l r0 = r9.A04(r10, r11, r12, r13, r14, r15)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112825ja.A3z(X.5hN, X.5hN, X.2HJ, java.lang.String, java.lang.String, boolean):void");
    }

    public void A40(AnonymousClass2HJ r11) {
        Ac1();
        if (r11 == null) {
            A3H();
            this.A05.Acl(new AnonymousClass64H(this));
            return;
        }
        AnonymousClass5wW r3 = this.A0S;
        String str = this.A0m;
        C28401Vy r5 = this.A0A;
        String str2 = (String) this.A09.A00;
        boolean z2 = true;
        if (!"upi-accept-collect".equals("upi-accept-collect")) {
            if ("upi-accept-collect".equals("pay-precheck")) {
                z2 = false;
            }
            r3.A01(this, r11, new C117385su(r5, (UserJid) null, (String) null, str, str2), "upi-accept-collect");
        }
        AnonymousClass00B.A0F(z2);
        r3.A01(this, r11, new C117385su(r5, (UserJid) null, (String) null, str, str2), "upi-accept-collect");
    }

    public void A41(AnonymousClass2HJ r7) {
        PaymentView paymentView;
        this.A0F.A05(123, "network_op_error_code", (long) this.A06.A00);
        C112715ix r4 = this.A0F;
        r4.A05(123, "error_code", (long) r7.A00);
        r4.A06(123, 3);
        Ac1();
        C119265wo A042 = this.A0B.A04(this.A06, 0);
        if (!(A042.A00 != R.string.str0fef || (paymentView = this.A0X) == null || paymentView.A00 == 1)) {
            A042.A00 = R.string.str0fee;
        }
        A46(A042, String.valueOf(r7.A00), new Object[0]);
    }

    public final void A42(AnonymousClass2HJ r4, boolean z2) {
        Ac1();
        if (r4 == null) {
            A3H();
            this.A05.Acl(new C1213265b(this, z2));
        } else if (!C1200960h.A02(this, "upi-send-to-vpa", r4.A00, false)) {
            A41(r4);
        }
    }

    public void A43(AnonymousClass2St r11, String str, int i2) {
        AnonymousClass2St r1 = r11;
        String str2 = str;
        this.A0E.AKV(r1, C13680ns.A0Y(), Integer.valueOf(i2), str2, this.A0g, this.A0g, this.A0f, false, C112765jH.A23(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4.A00(X.C110105dW.A03(r3.A05)) != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A44(X.C53322fW r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002e
            boolean r0 = r3.A47()
            if (r0 != 0) goto L_0x0018
            int r2 = r4.A00
        L_0x000a:
            r3.A01 = r2
            r3.A0U = r4
        L_0x000e:
            X.2fU r0 = r4.A01
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.A0F
        L_0x0014:
            r3.A3E(r0)
            return
        L_0x0018:
            java.lang.String r0 = r3.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002e
            X.0t3 r0 = r3.A05
            long r0 = X.C110105dW.A03(r0)
            int r1 = r4.A00(r0)
            r0 = 1
            r2 = 2
            if (r1 == r0) goto L_0x000a
        L_0x002e:
            r0 = 6
            r3.A01 = r0
            if (r4 == 0) goto L_0x0034
            goto L_0x000e
        L_0x0034:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112825ja.A44(X.2fW):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0I) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A45(X.C53312fV r30, boolean r31) {
        /*
            r29 = this;
            r0 = r29
            boolean r1 = r0 instanceof com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity
            r9 = r30
            if (r1 == 0) goto L_0x0073
            boolean r1 = r0.A47()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r0.A0I
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r21 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r21 = 0
        L_0x001a:
            java.lang.String r2 = r0.A0c
            X.5ss r1 = r0.A0R
            java.lang.String r1 = X.C115225pN.A00(r1, r2)
            r0.A0d = r1
            if (r31 != 0) goto L_0x004d
            if (r30 != 0) goto L_0x004d
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r4 = r0.A0X
            if (r4 == 0) goto L_0x004d
            X.1GO r1 = r4.A06
            X.2fU r3 = r1.A02()
            X.2fT r2 = r1.A03()
            X.1yJ r1 = r4.A04
            boolean r1 = r1.A0A(r3, r2)
            if (r1 == 0) goto L_0x004d
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r3 = r0.A0X
            com.whatsapp.jid.UserJid r2 = r0.A0C
            X.0sq r1 = r3.A07
            X.660 r0 = new X.660
            r0.<init>(r2, r3)
            r1.Acl(r0)
            return
        L_0x004d:
            X.5uD r3 = r0.A0T
            X.1cl r5 = r0.A0B
            com.whatsapp.jid.UserJid r6 = r0.A0C
            X.1Vy r4 = r0.A0A
            java.lang.String r10 = r0.A0n
            java.lang.String r11 = r0.A0o
            boolean r2 = r0.A0q
            boolean r1 = r0.A0s
            X.5hW r8 = r0.A0H
            r12 = 0
            r17 = 0
            X.1lh r7 = r0.A07
            java.lang.String r0 = r0.A0d
            r14 = r12
            r15 = r12
            r13 = r12
            r19 = r2
            r20 = r1
            r16 = r0
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            return
        L_0x0073:
            com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r0
            X.5uD r10 = r0.A0T
            X.1cl r12 = r0.A0B
            com.whatsapp.jid.UserJid r13 = r0.A0C
            X.1Vy r11 = r0.A0A
            java.lang.String r8 = r0.A0n
            X.5hW r7 = r0.A0H
            X.629 r3 = r0.A05
            java.lang.String r6 = r3.A0C
            java.lang.String r5 = r3.A0A
            long r1 = r3.A00
            java.lang.String r4 = r0.A0g
            java.lang.String r3 = r3.A0D
            X.1lh r14 = r0.A07
            r18 = 0
            r26 = 1
            r28 = 0
            r27 = 1
            r15 = r7
            r16 = r9
            r17 = r8
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r3
            r23 = r18
            r24 = r1
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112825ja.A45(X.2fV, boolean):void");
    }

    public void A46(C119265wo r9, String str, Object... objArr) {
        Ac1();
        AnonymousClass2St A002 = AnonymousClass5xP.A00(this.A05, (C28401Vy) null, this.A0U, (String) null, true);
        String str2 = this instanceof IndiaUpiCheckOrderDetailsActivity ? "order_details" : "new_payment";
        AnonymousClass5xP.A01(A002, this.A0E, 51, str2, this.A0g, 4);
        C53842gO A032 = this.A0E.A03(4, 51, str2, this.A0g);
        A032.A0S = str;
        C111345g2.A1s(A032, this);
        this.A0G = false;
        int i2 = r9.A00;
        if (i2 == 0) {
            i2 = R.string.str1160;
            r9.A00 = R.string.str1160;
        } else if (i2 == R.string.str108e || i2 == R.string.str108b || i2 == R.string.str108a || i2 == R.string.str108c || i2 == R.string.str108d) {
            objArr = new Object[]{AFP()};
        }
        Afj(objArr, 0, i2);
    }

    public boolean A47() {
        return this.A0G == null && this.A0E == null && !C39841t9.A03(this.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A0X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A48() {
        /*
            r2 = this;
            boolean r0 = X.C111345g2.A21(r2)
            if (r0 == 0) goto L_0x000f
            com.obwhatsapp.payments.ui.widget.PaymentView r0 = r2.A0X
            if (r0 == 0) goto L_0x000f
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112825ja.A48():boolean");
    }

    public final boolean A49() {
        return "payments_camera".equalsIgnoreCase(C110115dX.A0a(this)) && this.A0C.A0C(2820);
    }

    public boolean A4A(C111765hN r13) {
        if (!r13.A04 || r13.A05) {
            return false;
        }
        Ac1();
        if (!r13.A06) {
            AnonymousClass29T.A01(this, 15);
            return true;
        } else if (!C111345g2.A21(this)) {
            Intent A042 = C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A042.putExtra("extra_setup_mode", 1);
            Jid jid = this.A0E;
            if (jid == null && (jid = r13.A05) == null) {
                Log.e("showNodalDisallowAlert, jid and contactData.jid is null");
            } else {
                A042.putExtra("extra_jid", jid.getRawString());
            }
            int i2 = 3;
            if ("payment_composer_icon".equals(this.A0g)) {
                i2 = 10;
            }
            A042.putExtra("extra_payments_entry_type", i2);
            A042.putExtra("extra_is_first_payment_method", true);
            A042.putExtra("extra_skip_value_props_display", false);
            A042.putExtra("extra_receiver_jid", C16030sJ.A03(this.A0C));
            AnonymousClass22U.A00(A042, "composer");
            A2X(A042, true);
            return true;
        } else {
            C87324Wh r3 = new C87324Wh(this, this, this.A05, this.A0P, C110115dX.A0U(this), (Runnable) null, new AnonymousClass64F(this), true);
            if (TextUtils.isEmpty(this.A0g)) {
                this.A0g = "chat";
            }
            r3.A01(this.A0C, (AnonymousClass5S3) null, this.A0g);
            return true;
        }
    }

    public String AFP() {
        C16010sH r1 = this.A08;
        return r1 == null ? (String) C110105dW.A0d(this.A09) : this.A03.A08(r1);
    }

    public void AOl() {
        A2e("IndiaUpiPinPrimerDialogFragment");
    }

    public void AP7() {
        A3v(AGM().A0B("IndiaUpiPinPrimerDialogFragment"));
        A2e("IndiaUpiPinPrimerDialogFragment");
        Intent A042 = C110105dW.A04(this, IndiaUpiDebitCardVerificationActivity.class);
        C110115dX.A0o(A042, this.A0B);
        A3M(A042);
        A042.putExtra("extra_previous_screen", "setup_pin_prompt");
        startActivityForResult(A042, 1016);
    }

    public void AP9() {
        A3v(AGM().A0B("IndiaUpiForgotPinDialogFragment"));
        A2e("IndiaUpiForgotPinDialogFragment");
        C18300wT r2 = this.A0D;
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(r2.A05());
        A0o2.append(";");
        r2.A0J(AnonymousClass000.A0h(this.A0B.A0A, A0o2));
        this.A0m = true;
        A03();
    }

    public void ARX() {
        A3v(AGM().A0B("IndiaUpiForgotPinDialogFragment"));
        A2e("IndiaUpiForgotPinDialogFragment");
        Intent A022 = IndiaUpiPinPrimerFullSheetActivity.A02(this, (C35521m4) this.A0B, true);
        A3M(A022);
        startActivityForResult(A022, 1017);
    }

    public void ARY() {
        A2e("IndiaUpiForgotPinDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ASh(X.AnonymousClass2HJ r16, java.lang.String r17) {
        /*
            r15 = this;
            r4 = r15
            X.61W r2 = r15.A0E
            X.1cl r1 = r15.A0B
            r0 = 1
            r3 = r16
            r2.A05(r1, r3, r0)
            r7 = r17
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r14 = 0
            if (r0 != 0) goto L_0x006f
            X.1Vo r3 = r15.A0t
            java.lang.String r0 = "starting sendPaymentToVpa for jid: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.0rv r0 = r15.A0E
            r1.append(r0)
            java.lang.String r0 = " vpa: "
            r1.append(r0)
            X.1lh r0 = r15.A09
            r1.append(r0)
            X.C110105dW.A1L(r3, r1)
            X.1cl r0 = r15.A0B
            X.1tF r2 = r0.A08
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            java.lang.String r0 = r3.A02(r0)
            X.AnonymousClass00B.A07(r2, r0)
            X.5hR r2 = (X.C111805hR) r2
            r15.A3s()
            X.4XO r1 = r15.A06
            java.lang.String r0 = "upi-get-credential"
            r1.A03(r0)
            X.1cl r0 = r15.A0B
            java.lang.String r8 = r0.A0B
            X.1lh r6 = r2.A08
            X.5hW r1 = r15.A0H
            X.1Vy r5 = r15.A0A
            X.1lh r0 = r0.A09
            java.lang.Object r12 = X.C110105dW.A0d(r0)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r15.A3n()
            X.0sH r0 = r15.A08
            if (r0 == 0) goto L_0x0065
            java.lang.String r14 = X.C24561Gk.A01(r0)
        L_0x0065:
            java.lang.String r9 = r1.A0L
            java.lang.String r10 = r1.A0J
            java.lang.String r11 = r1.A0N
            r4.A3f(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x006e:
            return
        L_0x006f:
            if (r16 == 0) goto L_0x006e
            int r2 = r3.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.C1200960h.A02(r15, r1, r2, r0)
            if (r0 != 0) goto L_0x006e
            X.4XO r0 = r15.A06
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x0088
            X.C111345g2.A1y(r15)
            return
        L_0x0088:
            X.1Vo r2 = r15.A0t
            java.lang.String r0 = "onListKeys: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            if (r17 == 0) goto L_0x009a
            int r0 = r7.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x009a:
            r1.append(r14)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A06(r0)
            r15.A41(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112825ja.ASh(X.2HJ, java.lang.String):void");
    }

    public void AX5(AnonymousClass2HJ r3) {
        throw new UnsupportedOperationException(this.A0t.A02("onSetPin unsupported"));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 155) {
            if (i2 == 1000) {
                HashMap hashMap = this.A0B.A08;
                if (i3 != -1 || hashMap == null) {
                    this.A0t.A0A("REQUEST_TOS_UPDATED but found null credentialBlobs", (Throwable) null);
                } else {
                    Ac1();
                    Afq(R.string.str13db);
                    A45(A3l(this.A0A, this.A01), false);
                    return;
                }
            } else if (i2 != 1001) {
                switch (i2) {
                    case 1016:
                        if (i3 == -1 && intent != null) {
                            C30671cl r0 = (C30671cl) intent.getParcelableExtra("extra_bank_account");
                            if (r0 != null) {
                                this.A0B = r0;
                            }
                            C18300wT r2 = this.A0D;
                            StringBuilder A0o2 = AnonymousClass000.A0o();
                            A0o2.append(r2.A05());
                            A0o2.append(";");
                            r2.A0J(AnonymousClass000.A0h(this.A0B.A0A, A0o2));
                            C30671cl r22 = this.A0B;
                            Intent A042 = C110105dW.A04(this, IndiaUpiPinSetUpCompletedActivity.class);
                            A042.putExtra("extra_bank_account", r22);
                            A042.putExtra("on_settings_page", false);
                            startActivity(A042);
                            return;
                        }
                        return;
                    case 1017:
                        if (i3 == -1) {
                            C18300wT r23 = this.A0D;
                            StringBuilder A0o3 = AnonymousClass000.A0o();
                            A0o3.append(r23.A05());
                            A0o3.append(";");
                            r23.A0J(AnonymousClass000.A0h(this.A0B.A0A, A0o3));
                            C30671cl r24 = this.A0B;
                            Intent A043 = C110105dW.A04(this, IndiaUpiPinSetUpCompletedActivity.class);
                            C110115dX.A0o(A043, r24);
                            A043.putExtra("on_settings_page", false);
                            startActivityForResult(A043, 1018);
                            return;
                        }
                        return;
                    case 1018:
                        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                        paymentBottomSheet.A01 = A3m(this.A0A, paymentBottomSheet);
                        Afb(paymentBottomSheet, "30");
                        return;
                    default:
                        super.onActivityResult(i2, i3, intent);
                        return;
                }
            } else if (i3 == -1) {
                this.A0G = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
                return;
            } else if (!(i3 == 0 && this.A0G == null)) {
                return;
            }
            A3H();
            finish();
        } else if (i3 == -1) {
            A03();
        }
    }

    public void onBackPressed() {
        PaymentView paymentView = this.A0X;
        if (paymentView != null && paymentView.A0G()) {
            return;
        }
        if (!C16030sJ.A0L(this.A0E) || this.A00 != 0) {
            A3H();
            finish();
            A43(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, this.A0U, (String) null, true), this instanceof IndiaUpiCheckOrderDetailsActivity ? "order_details" : "new_payment", 1);
            return;
        }
        this.A0G = null;
        A39((Bundle) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110105dW.A0m(this);
        this.A0I.A02(this.A0s);
        this.A04 = this.A05.A04(this, "india-upi-payment-activity");
        this.A0q = getIntent().getBooleanExtra("return-after-pay", false);
        this.A09 = this.A02.A01("INR");
        C14710pd r10 = this.A0C;
        C14870pt r6 = this.A05;
        C17190ug r0 = this.A0H;
        C18280wR r2 = this.A0C;
        C119365wy r11 = this.A0B;
        C18310wU r14 = this.A0M;
        C18340wX r13 = this.A0K;
        this.A0N = new C112345iL(this, r6, r10, r0, r11, r13, r14, r2);
        C16440t3 r8 = this.A05;
        C16040sK r7 = this.A01;
        C16320sq r02 = this.A05;
        C18290wS r15 = this.A0P;
        this.A0T = new C118145uD(new C112255iC(this, r6, r7, r8, this.A02, r10, r11, this.A0C, r13, r14, r15, this.A0T, this.A0F, r2, r02), new C116195qy(this), new AnonymousClass64G(this));
        C16080sP r9 = this.A03;
        AnonymousClass013 r102 = this.A01;
        AnonymousClass1Vo r4 = this.A0t;
        C18090w8 r3 = this.A0O;
        AnonymousClass174 r152 = this.A0N;
        C118805vH r22 = this.A08;
        C1204661t r132 = this.A03;
        this.A0S = new AnonymousClass5wW(r9, r102, this.A08, this.A07, r132, r14, r152, r3, r22, r4, this, new C116205qz(this), r02);
        this.A0g = C110115dX.A0a(this);
        C16320sq r42 = this.A05;
        C18290wS r32 = this.A0P;
        CheckFirstTransaction checkFirstTransaction = new CheckFirstTransaction(this.A0I, this.A0D, r32, r42);
        this.A0E = checkFirstTransaction;
        this.A06.A00(checkFirstTransaction);
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r4;
        int i3;
        C32241fu A002;
        int i4;
        int i5;
        if (i2 != 15) {
            if (i2 == 22) {
                r4 = C32241fu.A00(this);
                r4.A06(C13680ns.A0d(this, getString(R.string.str0b6e), new Object[1], 0, R.string.str187e));
                i4 = R.string.str0e87;
                i5 = 24;
            } else if (i2 == 26) {
                BigDecimal bigDecimal = new BigDecimal(this.A06.A02(C15910s6.A1n));
                r4 = C32241fu.A00(this);
                r4.A06(C13680ns.A0d(this, C35481m0.A05.A9I(this.A01, bigDecimal, 0), new Object[1], 0, R.string.str196b));
                i4 = R.string.str0e87;
                i5 = 27;
            } else if (i2 == 33) {
                return A3j((Bundle) null);
            } else {
                if (i2 != 34) {
                    switch (i2) {
                        case 10:
                            A002 = C32241fu.A00(this);
                            A002.A01(R.string.str100c);
                            A002.A0B(new IDxCListenerShape130S0100000_3_I1(this, 26), R.string.str090e);
                            C110105dW.A0v(A002, this, 41, R.string.str0394);
                            C110105dW.A0w(A002, this, 30, R.string.str1161);
                            A002.A07(true);
                            i3 = 7;
                            break;
                        case 11:
                            A002 = C32241fu.A00(this);
                            A002.A01(R.string.str107f);
                            C110105dW.A0w(A002, this, 29, R.string.str090e);
                            C110105dW.A0v(A002, this, 37, R.string.str0394);
                            A002.A07(true);
                            i3 = 4;
                            break;
                        case 12:
                            A002 = C32241fu.A00(this);
                            A002.A01(R.string.str1080);
                            C110105dW.A0w(A002, this, 28, R.string.str1ba6);
                            C110105dW.A0v(A002, this, 32, R.string.str0de3);
                            A002.A07(true);
                            i3 = 3;
                            break;
                        case 13:
                            this.A0C.A0F();
                            A002 = C32241fu.A00(this);
                            A002.A01(R.string.str107e);
                            C110105dW.A0w(A002, this, 33, R.string.str1ba6);
                            C110105dW.A0v(A002, this, 40, R.string.str0de3);
                            A002.A07(true);
                            i3 = 6;
                            break;
                        default:
                            return super.onCreateDialog(i2);
                    }
                } else {
                    r4 = C32241fu.A00(this);
                    r4.A01(R.string.str1005);
                    C110105dW.A0w(r4, this, 34, R.string.str0e87);
                    r4.A07(true);
                    return r4.create();
                }
            }
            C110105dW.A0w(r4, this, i5, i4);
            r4.A07(false);
            return r4.create();
        }
        A002 = C32241fu.A00(this);
        A002.A06(C13680ns.A0d(this, this.A03.A0E(this.A08), new Object[1], 0, R.string.str1072));
        C110105dW.A0w(A002, this, 25, R.string.str0e87);
        A002.A07(false);
        i3 = 5;
        r4.A03(new IDxCListenerShape163S0100000_3_I1(this, i3));
        return r4.create();
    }

    public Dialog onCreateDialog(int i2, Bundle bundle) {
        return i2 == 33 ? A3j(bundle) : super.onCreateDialog(i2, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        C114585o0 r1 = this.A0V;
        if (r1 != null) {
            r1.A06(true);
        }
        this.A04.A00();
        this.A0I.A03(this.A0s);
        AnonymousClass1Vo r2 = this.A0t;
        StringBuilder A0r2 = AnonymousClass000.A0r("onDestroy states: ");
        A0r2.append(this.A06);
        C110105dW.A1L(r2, A0r2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0t.A06("action bar home");
        if (!C16030sJ.A0L(this.A0E) || this.A00 != 0) {
            A3H();
            finish();
            A3t(1, this instanceof IndiaUpiCheckOrderDetailsActivity ? "order_details" : "new_payment");
            return true;
        }
        this.A0G = null;
        A39((Bundle) null);
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0B = (C30671cl) bundle.getParcelable("paymentMethodSavedInst");
        this.A0E = UserJid.getNullable(bundle.getString("extra_jid"));
        this.A0G = UserJid.getNullable(bundle.getString("extra_receiver_jid"));
        this.A0G = bundle.getBoolean("sending_payment");
        this.A0I = bundle.getString("extra_incoming_pay_request_id");
        this.A01 = bundle.getInt("extra_offer_eligibility_state");
        if (this.A0B != null) {
            this.A0B.A08 = (C39901tF) bundle.getParcelable("countryDataSavedInst");
        }
        C111855hW r0 = (C111855hW) bundle.getParcelable("countryTransDataSavedInst");
        if (r0 != null) {
            this.A0H = r0;
        }
        String string = bundle.getString("sendAmountSavedInst");
        if (string != null) {
            this.A0A = C110115dX.A0B(this.A09, string);
        }
        this.A02 = bundle.getLong("quotedMessageRowIdSavedInst");
        this.A0h = bundle.getString("paymentNoteSavedInst");
        this.A0p = C16030sJ.A08(UserJid.class, bundle.getStringArrayList("paymentNoteMentionsSavedInst"));
        this.A09 = (C35301lh) bundle.getParcelable("receiverVpaSavedInst");
        this.A0Q = bundle.getString("receiverVpaIdSavedInst");
        this.A0f = bundle.getString("paymentStickerMediaJobIdSavedInst");
        PaymentView paymentView = this.A0X;
        if (paymentView != null) {
            paymentView.A0B(bundle);
        } else {
            this.A0h = bundle.getString("restoredPaymentAmount");
        }
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1Vo r2 = this.A0t;
        StringBuilder A0r2 = AnonymousClass000.A0r("onResume states: ");
        A0r2.append(this.A06);
        C110105dW.A1L(r2, A0r2);
        isFinishing();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C39901tF r1;
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_jid", C16030sJ.A03(this.A0E));
        bundle.putString("extra_receiver_jid", C16030sJ.A03(this.A0G));
        bundle.putBoolean("sending_payment", this.A0G);
        bundle.putString("extra_incoming_pay_request_id", this.A0I);
        bundle.putString("extra_request_message_key", this.A0l);
        bundle.putInt("extra_offer_eligibility_state", this.A01);
        C30671cl r12 = this.A0B;
        if (r12 != null) {
            bundle.putParcelable("paymentMethodSavedInst", r12);
        }
        C30671cl r0 = this.A0B;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        C111855hW r13 = this.A0H;
        if (r13 != null) {
            bundle.putParcelable("countryTransDataSavedInst", r13);
        }
        C28401Vy r02 = this.A0A;
        if (r02 != null) {
            bundle.putString("sendAmountSavedInst", r02.A00.toString());
        }
        long j2 = this.A02;
        if (j2 != 0) {
            bundle.putLong("quotedMessageRowIdSavedInst", j2);
        }
        C35301lh r14 = this.A09;
        if (!C39841t9.A04(r14)) {
            bundle.putParcelable("receiverVpaSavedInst", r14);
        }
        String str = this.A0Q;
        if (str != null) {
            bundle.putString("receiverVpaIdSavedInst", str);
        }
        String str2 = this.A0f;
        if (str2 != null) {
            bundle.putString("paymentStickerMediaJobIdSavedInst", str2);
        }
        PaymentView paymentView = this.A0X;
        if (paymentView != null) {
            paymentView.A0C(bundle);
            bundle.putString("paymentNoteSavedInst", this.A0X.getPaymentNote());
            bundle.putStringArrayList("paymentNoteMentionsSavedInst", C16030sJ.A06(this.A0X.getMentionedJids()));
            bundle.putString("restoredPaymentAmount", this.A0X.getPaymentAmountString());
        }
    }
}
