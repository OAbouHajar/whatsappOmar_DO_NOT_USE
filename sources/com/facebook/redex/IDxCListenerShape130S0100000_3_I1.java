package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass01R;
import X.AnonymousClass1XP;
import X.AnonymousClass1Y3;
import X.AnonymousClass1Z7;
import X.AnonymousClass29T;
import X.AnonymousClass2EA;
import X.AnonymousClass2HJ;
import X.AnonymousClass3K4;
import X.AnonymousClass5kl;
import X.AnonymousClass5ko;
import X.AnonymousClass5vZ;
import X.AnonymousClass60N;
import X.C001000l;
import X.C110105dW;
import X.C110115dX;
import X.C110615eX;
import X.C110705eh;
import X.C111345g2;
import X.C111805hR;
import X.C111855hW;
import X.C112215i8;
import X.C112775jP;
import X.C112825ja;
import X.C112835jb;
import X.C112935km;
import X.C114115n9;
import X.C114195nH;
import X.C115285pV;
import X.C116635rh;
import X.C117425sy;
import X.C119795zd;
import X.C119805ze;
import X.C1211564k;
import X.C1221068h;
import X.C1222168s;
import X.C1223869j;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16010sH;
import X.C16320sq;
import X.C18280wR;
import X.C18310wU;
import X.C24561Gk;
import X.C28371Vv;
import X.C28401Vy;
import X.C30671cl;
import X.C35081lL;
import X.C35301lh;
import X.C35521m4;
import X.C53872gR;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;
import com.obwhatsapp.payments.actions.IDxNCallbackShape9S0300000_3_I1;
import com.obwhatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.obwhatsapp.payments.ui.PaymentDeleteAccountActivity;
import com.obwhatsapp.payments.ui.PaymentSettingsFragment;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.obwhatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.whatsapp.util.IDxCListenerShape107S0100000_3_I1;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;

public class IDxCListenerShape130S0100000_3_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape130S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5ko r2;
        String str;
        switch (this.A01) {
            case 0:
                C1222168s r0 = (C1222168s) this.A00;
                if (r0 != null) {
                    r0.AWg();
                    return;
                }
                return;
            case 1:
                C119805ze.A00((C119805ze) this.A00);
                return;
            case 2:
                ((C119795zd) this.A00).A01.A05.AXD();
                return;
            case 3:
                Activity activity = (Activity) this.A00;
                AnonymousClass29T.A00(activity, 10001);
                AnonymousClass01R.A01(activity, IndiaUpiPayIntentReceiverActivity.class, false);
                Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
                activity.setResult(0);
                activity.finish();
                return;
            case 4:
                Activity activity2 = (Activity) this.A00;
                AnonymousClass29T.A00(activity2, SearchActionVerificationClientService.NOTIFICATION_ID);
                AnonymousClass01R.A01(activity2, IndiaUpiPayIntentReceiverActivity.class, false);
                Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
                activity2.setResult(0);
                activity2.finish();
                return;
            case 6:
                ((AnonymousClass1Z7) this.A00).A00("on_failure");
                return;
            case 7:
                C14550pN r3 = (C14550pN) this.A00;
                AbstractMap abstractMap = (AbstractMap) r3.getIntent().getSerializableExtra("screen_params");
                if (abstractMap != null) {
                    str = C110115dX.A0g("credential_push_data", abstractMap);
                    Uri A002 = C115285pV.A00(str);
                    if (A002 != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(A002);
                        r3.A2X(intent, true);
                        return;
                    }
                } else {
                    str = null;
                }
                r3.finish();
                Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Credential Push data is invalid. ")));
                return;
            case 8:
                C112775jP r22 = (C112775jP) ((IDxCListenerShape107S0100000_3_I1) this.A00).A00;
                String A0f = C110105dW.A0f(r22.A01, r22.A05);
                C114195nH r1 = r22.A0U;
                Log.i("DyiViewModel/delete-report");
                r1.A08(1);
                AnonymousClass5vZ r8 = r1.A05;
                IDxCallbackShape250S0100000_3_I1 iDxCallbackShape250S0100000_3_I1 = new IDxCallbackShape250S0100000_3_I1(r1, 7);
                String str2 = r1.A09;
                C18310wU r23 = r8.A06;
                C35081lL[] r4 = new C35081lL[4];
                C110115dX.A14("action", "delete-payments-dyi-report", r4);
                r4[1] = new C35081lL("version", "1");
                C35081lL.A01("nonce", A0f, r4);
                r4[3] = new C35081lL("type", str2);
                r23.A0F(new IDxRCallbackShape20S0200000_3_I1(r8.A00, r8.A04, r8.A01, iDxCallbackShape250S0100000_3_I1, r8, 10), new C28371Vv("account", r4), "set");
                return;
            case 9:
                C114195nH r24 = ((C112775jP) ((IDxCListenerShape107S0100000_3_I1) this.A00).A00).A0U;
                Log.i("DyiViewModel/export-report");
                r24.A08.Acl(new C1211564k(r24));
                return;
            case 10:
                AnonymousClass29T.A00((Activity) this.A00, 103);
                return;
            case 11:
                C110105dW.A1D((C14530pL) this.A00, 101);
                return;
            case 12:
                AnonymousClass29T.A00((Activity) this.A00, 101);
                return;
            case 13:
                AnonymousClass29T.A00((Activity) this.A00, 104);
                return;
            case 14:
                AnonymousClass29T.A00((Activity) this.A00, 100);
                return;
            case 15:
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this.A00;
                AnonymousClass29T.A00(indiaUpiBankAccountDetailsActivity, 100);
                indiaUpiBankAccountDetailsActivity.A0J.A06("unlinking the payment account.");
                Intent A04 = C110105dW.A04(indiaUpiBankAccountDetailsActivity, PaymentDeleteAccountActivity.class);
                A04.putExtra("extra_remove_payment_account", 1);
                indiaUpiBankAccountDetailsActivity.startActivityForResult(A04, 0);
                return;
            case 16:
                r2 = (AnonymousClass5ko) this.A00;
                if (r2 instanceof C112835jb) {
                    C112835jb r25 = (C112835jb) r2;
                    r25.A0T = false;
                    AnonymousClass2HJ r12 = r25.A01;
                    if (r12 != null) {
                        r25.A3T(r12, r25.A06);
                        return;
                    } else {
                        r25.A3S();
                        return;
                    }
                } else if (r2 instanceof IndiaUpiDeviceBindStepActivity) {
                    IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) r2;
                    indiaUpiDeviceBindStepActivity.A0T = false;
                    indiaUpiDeviceBindStepActivity.A3S();
                    return;
                }
                break;
            case 17:
                r2 = (AnonymousClass5ko) this.A00;
                if (r2 instanceof IndiaUpiDeviceBindStepActivity) {
                    IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity2 = (IndiaUpiDeviceBindStepActivity) r2;
                    indiaUpiDeviceBindStepActivity2.A3c(C13680ns.A0Y(), C13680ns.A0a());
                    C111345g2.A1z(indiaUpiDeviceBindStepActivity2.A0M, 4);
                    C111345g2.A1z(indiaUpiDeviceBindStepActivity2.A0L, 4);
                    indiaUpiDeviceBindStepActivity2.A0T = false;
                    indiaUpiDeviceBindStepActivity2.finish();
                    return;
                } else if (r2 instanceof IndiaUpiBankPickerActivity) {
                    IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r2;
                    indiaUpiBankPickerActivity.A0T = false;
                    indiaUpiBankPickerActivity.A3H();
                    indiaUpiBankPickerActivity.finish();
                    indiaUpiBankPickerActivity.A3W(C13680ns.A0a());
                    C111345g2.A1z(indiaUpiBankPickerActivity.A05, 4);
                    return;
                } else if (r2 instanceof IndiaUpiBankAccountPickerActivity) {
                    IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) r2;
                    indiaUpiBankAccountPickerActivity.A0T = false;
                    indiaUpiBankAccountPickerActivity.A3W(C13680ns.A0a());
                    C111345g2.A1z(indiaUpiBankAccountPickerActivity.A0M, 4);
                    indiaUpiBankAccountPickerActivity.finish();
                    return;
                }
                break;
            case 18:
                AnonymousClass5kl r32 = (AnonymousClass5kl) this.A00;
                r32.Afq(R.string.str13db);
                C14870pt r42 = r32.A05;
                C16320sq r13 = r32.A05;
                C18280wR r122 = r32.A0C;
                new AnonymousClass5vZ(r32, r42, r32.A07, r32.A09, r32.A0K, r32.A0D, r32.A0M, r32.A07, r32.A0P, r122, r13).A00(new IDxCallbackShape250S0100000_3_I1(r32, 1));
                return;
            case 20:
                C14530pL r26 = (C14530pL) this.A00;
                r26.A00.Act(r26, Uri.parse("https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"));
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 27);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                C112935km r14 = (C112935km) this.A00;
                dialogInterface.dismiss();
                r14.Afq(R.string.str13db);
                r14.A0A.A00();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 22);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                AnonymousClass5ko r02 = (AnonymousClass5ko) this.A00;
                dialogInterface.dismiss();
                r02.A3H();
                r02.finish();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                C112825ja r27 = (C112825ja) this.A00;
                AnonymousClass29T.A00(r27, 10);
                C111345g2.A1r((C35521m4) r27.A0B, r27, true);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                Activity activity3 = (Activity) this.A00;
                AnonymousClass29T.A00(activity3, 26);
                activity3.finish();
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                C112825ja r28 = (C112825ja) this.A00;
                AnonymousClass29T.A00(r28, 12);
                C111345g2.A1r((C35521m4) r28.A0B, r28, true);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                C112825ja r29 = (C112825ja) this.A00;
                AnonymousClass29T.A00(r29, 11);
                C111345g2.A1r((C35521m4) r29.A0B, r29, true);
                return;
            case 30:
                C112825ja r33 = (C112825ja) this.A00;
                AnonymousClass29T.A00(r33, 10);
                r33.Afq(R.string.str13db);
                String A0C = r33.A0C.A0C();
                boolean isEmpty = TextUtils.isEmpty(A0C);
                C111855hW r15 = r33.A0H;
                boolean A1W = AnonymousClass000.A1W(r15);
                if (isEmpty) {
                    r33.A0A.A00();
                    return;
                } else if (!A1W) {
                    r15.A0N = r33.A3o();
                    r33.A06.A03("upi-get-credential");
                    C30671cl r03 = r33.A0B;
                    String str3 = r03.A0B;
                    C35301lh r5 = ((C111805hR) r33.A0B.A08).A08;
                    C111855hW r16 = r33.A0H;
                    C28401Vy r43 = r33.A0A;
                    String str4 = (String) C110105dW.A0d(r03.A09);
                    String A3n = r33.A3n();
                    C16010sH r04 = r33.A08;
                    r33.A3f(r43, r5, A0C, str3, r16.A0L, r16.A0J, r16.A0N, str4, A3n, r04 == null ? null : C24561Gk.A01(r04));
                    return;
                } else {
                    r33.A3b();
                    return;
                }
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                C112825ja r34 = (C112825ja) this.A00;
                r34.Afq(R.string.str13db);
                C14870pt r44 = r34.A05;
                C16320sq r132 = r34.A05;
                C18280wR r123 = r34.A0C;
                new AnonymousClass5vZ(r34, r44, r34.A07, r34.A09, r34.A0K, r34.A0D, r34.A0M, r34.A0M, r34.A0P, r123, r132).A00(new IDxCallbackShape250S0100000_3_I1(r34, 3));
                return;
            case 32:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 12);
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                C112935km r17 = (C112935km) this.A00;
                AnonymousClass29T.A00(r17, 13);
                r17.A3Y();
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                AnonymousClass5ko r18 = (AnonymousClass5ko) this.A00;
                AnonymousClass29T.A00(r18, 34);
                r18.A3H();
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 33);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 11);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                C112825ja r210 = (C112825ja) this.A00;
                dialogInterface.dismiss();
                r210.Afq(R.string.str13db);
                r210.ASh((AnonymousClass2HJ) null, r210.A0C.A0C());
                return;
            case 40:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 13);
                return;
            case 41:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 10);
                return;
            case 42:
                AnonymousClass29T.A00((Activity) this.A00, 29);
                return;
            case 43:
            case 66:
                C110105dW.A1D((C14530pL) this.A00, 29);
                return;
            case 44:
                ((PaymentSettingsFragment) this.A00).A0r.A00(true);
                return;
            case 45:
                AnonymousClass29T.A00(((AnonymousClass01A) this.A00).A0D(), 101);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                ((IndiaUpiPaymentTransactionDetailsActivity) this.A00).A01.A0G(new C114115n9());
                return;
            case 47:
                dialogInterface.dismiss();
                ((Activity) this.A00).finish();
                return;
            case 48:
                ((C112935km) this.A00).A3a();
                return;
            case 49:
                C112935km r19 = (C112935km) this.A00;
                AnonymousClass29T.A00(r19, 19);
                r19.A0H = false;
                r19.A3H();
                r19.finish();
                return;
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 28);
                return;
            case 51:
                AnonymousClass5ko r110 = (AnonymousClass5ko) this.A00;
                AnonymousClass29T.A00(r110, 28);
                r110.A3H();
                return;
            case 52:
                IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity = (IndiaUpiProfileDetailsActivity) this.A00;
                indiaUpiProfileDetailsActivity.A0E.AKS(C13680ns.A0Y(), C13690nt.A0U(), "alias_remove_confirm_dialog", "payments_profile");
                AnonymousClass29T.A00(indiaUpiProfileDetailsActivity, 38);
                indiaUpiProfileDetailsActivity.A3H();
                if (indiaUpiProfileDetailsActivity.A0D.A00().size() > 0) {
                    C110615eX r9 = indiaUpiProfileDetailsActivity.A0C;
                    C112215i8 r82 = indiaUpiProfileDetailsActivity.A0B;
                    C53872gR r52 = (C53872gR) indiaUpiProfileDetailsActivity.A0D.A00().iterator().next();
                    C35301lh A05 = indiaUpiProfileDetailsActivity.A0C.A05();
                    String A0D = indiaUpiProfileDetailsActivity.A0C.A0D();
                    r9.A02.A0B(Boolean.TRUE);
                    Log.i("PAY: deregisterAlias called");
                    ArrayList A0u = AnonymousClass000.A0u();
                    C110105dW.A1P("alias_id", r52.A01, A0u);
                    C110105dW.A1P("alias_value", (String) r52.A00.A00, A0u);
                    C110105dW.A1P("alias_type", r52.A03, A0u);
                    if (!TextUtils.isEmpty(A0D)) {
                        C110105dW.A1P("vpa_id", A0D, A0u);
                    }
                    C110105dW.A1P("vpa", (String) A05.A00, A0u);
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    C110105dW.A1P("action", "deregister-alias", A0u2);
                    C110105dW.A1P("device_id", r82.A05.A01(), A0u2);
                    r82.A01.A0H(new IDxNCallbackShape9S0300000_3_I1(r82.A00, r82.A01, r52, r82.A02, C116635rh.A02(r82, "deregister-alias"), r82, r9), new C28371Vv(new C28371Vv("alias", C110115dX.A1F(A0u, 0)), "account", C110115dX.A1F(A0u2, 0)), "set", 0);
                    return;
                }
                indiaUpiProfileDetailsActivity.A3S(false);
                return;
            case 53:
                AnonymousClass5ko r6 = (AnonymousClass5ko) this.A00;
                r6.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), "alias_remove_confirm_dialog", "payments_profile");
                AnonymousClass29T.A00(r6, 38);
                r6.A3H();
                return;
            case 55:
                C110705eh r111 = ((IndiaUpiQrCodeUrlValidationActivity) this.A00).A06;
                r111.A03 = true;
                C117425sy.A00(r111.A01, 6);
                return;
            case 56:
                ((IndiaUpiQrCodeUrlValidationActivity) this.A00).A06.A07();
                return;
            case 57:
                ((IndiaUpiQrCodeUrlValidationActivity) this.A00).A06.A06();
                return;
            case 63:
            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                AnonymousClass29T.A00((Activity) this.A00, 35);
                return;
            case 65:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                AnonymousClass29T.A00(indiaUpiSendPaymentActivity, 29);
                indiaUpiSendPaymentActivity.A0B.AUV();
                return;
            case 67:
                AnonymousClass29T.A00((Activity) this.A00, 39);
                return;
            case 68:
                AnonymousClass29T.A00((Activity) this.A00, 41);
                return;
            case 69:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity2 = (IndiaUpiSendPaymentActivity) this.A00;
                indiaUpiSendPaymentActivity2.A08 = false;
                AnonymousClass29T.A00(indiaUpiSendPaymentActivity2, 37);
                return;
            case 70:
                AnonymousClass29T.A00((Activity) this.A00, 40);
                return;
            case 71:
                C111345g2.A1v((AnonymousClass5ko) this.A00, 32);
                return;
            case AnonymousClass2EA.A02 /*72*/:
                IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity = (IndiaUpiVpaContactInfoActivity) this.A00;
                indiaUpiVpaContactInfoActivity.A05.Ahg(indiaUpiVpaContactInfoActivity, new AnonymousClass60N(indiaUpiVpaContactInfoActivity, true), indiaUpiVpaContactInfoActivity.A07, (String) C110105dW.A0d(indiaUpiVpaContactInfoActivity.A03), true);
                return;
            case 74:
                ((PaymentTransactionHistoryActivity) this.A00).A36();
                return;
            case 75:
                PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = (PaymentsUnavailableDialogFragment) this.A00;
                C001000l A0C2 = paymentsUnavailableDialogFragment.A0C();
                if (A0C2 != null) {
                    A0C2.startActivity(paymentsUnavailableDialogFragment.A00.A00(A0C2, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, "payments-blocked", (String) null, (ArrayList) null, (ArrayList) null, paymentsUnavailableDialogFragment.A01.A00()));
                    return;
                }
                return;
            case 76:
                C1223869j r112 = (C1223869j) this.A00;
                r112.Ac5();
                r112.ATa((AnonymousClass1XP) null);
                return;
            case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                C1223869j r113 = (C1223869j) this.A00;
                r113.Abv();
                r113.ATa((AnonymousClass1XP) null);
                return;
            case 78:
                C1223869j r05 = (C1223869j) this.A00;
                r05.Ac5();
                r05.A83();
                return;
            case 79:
                C1223869j r06 = (C1223869j) this.A00;
                r06.Abv();
                r06.A83();
                return;
            case 80:
                C1223869j r07 = (C1223869j) this.A00;
                r07.Ac5();
                r07.Abv();
                r07.A83();
                return;
            case 81:
                C1223869j r114 = (C1223869j) this.A00;
                r114.Ac5();
                r114.Abv();
                r114.ATa((AnonymousClass1XP) null);
                return;
            case 82:
                ((C1221068h) this.A00).ARM();
                return;
            default:
                AnonymousClass3K4.A0y(this.A00);
                return;
        }
        r2.A0T = false;
    }
}
