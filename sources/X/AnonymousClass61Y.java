package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxNConsumerShape41S0200000_3_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet;
import com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity;
import com.obwhatsapp.payments.ui.BrazilDyiReportActivity;
import com.obwhatsapp.payments.ui.BrazilFbPayHubActivity;
import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentReportPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.obwhatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.obwhatsapp.payments.ui.IncentiveValuePropsActivity;
import com.obwhatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.61Y  reason: invalid class name */
public abstract class AnonymousClass61Y implements C228919r {
    public C16440t3 A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C16980tz A03;
    public final C18290wS A04;
    public final C218315p A05;
    public final String A06;

    public AnonymousClass61Y(C16000sG r1, C16080sP r2, C16980tz r3, C18290wS r4, C218315p r5, String str) {
        this.A06 = str;
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
    }

    public boolean A5y() {
        return this instanceof C112575ii;
    }

    public boolean A5z() {
        return true;
    }

    public void A8Y(AnonymousClass1Vt r3, AnonymousClass1Vt r4) {
        AnonymousClass5xC r0;
        String str;
        if ((this instanceof C112575ii) && r4 != null) {
            AnonymousClass5xC r1 = C110115dX.A0K(r3).A0B;
            C111855hW A0K = C110115dX.A0K(r4);
            if (r1 != null && (r0 = A0K.A0B) != null && (str = r0.A0D) != null) {
                r1.A0H = str;
            }
        }
    }

    public Class A9e() {
        if (this instanceof C112575ii) {
            return IndiaUpiBankAccountDetailsActivity.class;
        }
        if (this instanceof C112565ih) {
            return BrazilPaymentCardDetailsActivity.class;
        }
        return null;
    }

    public Intent A9f(Context context) {
        if (this instanceof C112565ih) {
            return C110105dW.A04(context, BrazilAccountRecoveryPinActivity.class);
        }
        return null;
    }

    public Class A9g() {
        if (this instanceof C112575ii) {
            return IndiaUpiPaymentsAccountSetupActivity.class;
        }
        if (this instanceof C112565ih) {
            return BrazilPayBloksActivity.class;
        }
        return null;
    }

    public Intent A9h(Context context) {
        if (!(this instanceof C112565ih)) {
            return null;
        }
        Intent A042 = C110105dW.A04(context, BrazilPayBloksActivity.class);
        A042.putExtra("screen_name", ((C112565ih) this).A0R.A02(true));
        C111675hA.A03(A042, "referral_screen", "wa_payment_settings");
        return A042;
    }

    public Class AAW() {
        if (this instanceof C112575ii) {
            return IndiaUpiCheckBalanceActivity.class;
        }
        return null;
    }

    public String AAX() {
        return this instanceof C112575ii ? "upi_p2p_check_balance" : "";
    }

    public C42691yG AAi() {
        boolean z2 = this instanceof C112575ii;
        C16980tz r3 = this.A03;
        C16080sP r2 = this.A02;
        C16000sG r1 = this.A01;
        return z2 ? new C112005hn(r1, r2, r3) : new C42691yG(r1, r2, r3);
    }

    public Class AAo() {
        if (this instanceof C112565ih) {
            return BrazilPaymentContactOmbudsmanActivity.class;
        }
        return null;
    }

    public Class AAq() {
        if (this instanceof C112565ih) {
            return BrazilPaymentContactSupportActivity.class;
        }
        return null;
    }

    public Class AAr() {
        if (!(this instanceof C112565ih) || !((C112565ih) this).A0K.A03.A0C(1615)) {
            return null;
        }
        return BrazilPaymentContactSupportP2pActivity.class;
    }

    public C227219a AB3() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0E;
        }
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0A;
        }
        return null;
    }

    public C227519d AB4() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0C;
        }
        return null;
    }

    public C227319b AB6() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0S;
        }
        if (!(this instanceof C112565ih)) {
            return null;
        }
        C112565ih r0 = (C112565ih) this;
        C16980tz r1 = r0.A03;
        C14710pd r3 = r0.A09;
        AnonymousClass013 r2 = r0.A08;
        C18090w8 r7 = r0.A0K;
        return new C1200860g(r1, r2, r3, r0.A0C, r0.A0G, r0.A0J, r7);
    }

    public C109285Rl AB7() {
        if (this instanceof C112575ii) {
            C112575ii r0 = (C112575ii) this;
            C16980tz r2 = r0.A03;
            C17130ua r1 = r0.A03;
            C18290wS r6 = r0.A04;
            return new AnonymousClass60A(r1, r2, r0.A0E, r0.A0G, r0.A0I, r6);
        } else if (!(this instanceof C112565ih)) {
            return null;
        } else {
            C112565ih r02 = (C112565ih) this;
            C16440t3 r3 = r02.A06;
            C14870pt r12 = r02.A01;
            C17130ua r22 = r02.A04;
            C18290wS r8 = r02.A04;
            C18300wT r7 = r02.A0I;
            return new AnonymousClass60B(r12, r22, r3, r02.A0E, r02.A0F, r02.A0G, r7, r8, r02.A0P);
        }
    }

    public C227619e ABC() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0F;
        }
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0D;
        }
        return null;
    }

    public int ABG(String str) {
        return 1000;
    }

    public AnonymousClass1yN ABY() {
        if (!(this instanceof C112575ii)) {
            return null;
        }
        C112575ii r0 = (C112575ii) this;
        C16440t3 r20 = r0.A06;
        C14710pd r18 = r0.A0A;
        C14870pt r17 = r0.A01;
        C16320sq r15 = r0.A0X;
        C16980tz r14 = r0.A03;
        C15900s5 r13 = r0.A02;
        C218315p r12 = r0.A05;
        AnonymousClass013 r11 = r0.A07;
        C18280wR r10 = r0.A0W;
        C18290wS r9 = r0.A04;
        AnonymousClass5xN r8 = r0.A0V;
        AnonymousClass175 r7 = r0.A0G;
        C18310wU r6 = r0.A0N;
        AnonymousClass61W r5 = r0.A0P;
        C18260wP r4 = r0.A05;
        C18340wX r3 = r0.A0H;
        C228019i r2 = r0.A0J;
        AnonymousClass60V r1 = r0.A0E;
        C14710pd r23 = r18;
        return new C112015ho(r17, r13, r4, r20, r14, r11, r23, r1, r7, r3, r2, r0.A0M, r6, r9, r5, r8, r10, r12, r15);
    }

    public /* synthetic */ String ABZ() {
        return null;
    }

    public Intent ABg(Context context, Uri uri, boolean z2) {
        if (!(this instanceof C112575ii)) {
            return C110105dW.A04(context, AEt());
        }
        StringBuilder A0r = AnonymousClass000.A0r("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP ");
        Class<IndiaUpiPaymentSettingsActivity> cls = IndiaUpiPaymentSettingsActivity.class;
        A0r.append(cls);
        C13680ns.A1V(A0r);
        Intent A042 = C110105dW.A04(context, cls);
        A042.putExtra("extra_is_invalid_deep_link_url", z2);
        A042.putExtra("referral_screen", "deeplink");
        A042.putExtra("extra_deep_link_url", uri);
        return A042;
    }

    public Intent ABh(Context context, Uri uri) {
        int length;
        if (this instanceof C112575ii) {
            C112575ii r2 = (C112575ii) this;
            boolean A002 = C115205pL.A00(uri, r2.A0R);
            if (r2.A0G.A0C() || A002) {
                return r2.ABg(context, uri, A002);
            }
            Log.i(AnonymousClass000.A0g("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user", r2.A04.A05("UPI").A9g()));
            Intent A042 = C110105dW.A04(context, IndiaUpiPaymentsAccountSetupActivity.class);
            A042.putExtra("extra_skip_value_props_display", false);
            A042.putExtra("extra_payments_entry_type", 9);
            A042.putExtra("extra_deep_link_url", uri);
            AnonymousClass22U.A00(A042, "deepLink");
            return A042;
        } else if (this instanceof C112565ih) {
            C112565ih r3 = (C112565ih) this;
            if (C115205pL.A00(uri, r3.A0Q)) {
                Intent A043 = C110105dW.A04(context, BrazilPaymentSettingsActivity.class);
                C110115dX.A0r(A043, "deeplink");
                return A043;
            }
            Intent AEx = r3.AEx(context, "deeplink", true);
            AEx.putExtra("extra_deep_link_url", uri);
            C118955vg r22 = r3.A0R;
            String A022 = r22.A02(true);
            if ("brpay_p_pin_nux_create".equals(A022) || "brpay_p_compliance_kyc_next_screen_router".equals(A022)) {
                C111675hA.A03(AEx, "deep_link_continue_setup", "1");
            }
            if (r22.A02.A0G("tos_no_wallet")) {
                return AEx;
            }
            String queryParameter = uri.getQueryParameter("c");
            if (queryParameter != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA"))) {
                return AEx;
            }
            C111675hA.A03(AEx, "campaign_id", uri.getQueryParameter("c"));
            return AEx;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Class A9g = A9g();
            A0r.append(A9g);
            C13680ns.A1V(A0r);
            Intent A044 = C110105dW.A04(context, A9g);
            AnonymousClass22U.A00(A044, "deepLink");
            return A044;
        }
    }

    public int ABm() {
        if (this instanceof C112565ih) {
            return R.style.style0174;
        }
        return 0;
    }

    public Intent ABs(Context context, String str, String str2) {
        if (!(this instanceof C112565ih)) {
            return null;
        }
        Intent A042 = C110105dW.A04(context, BrazilDyiReportActivity.class);
        A042.putExtra("extra_paymentProvider", str2);
        A042.putExtra("extra_paymentAccountType", str);
        return A042;
    }

    public C1222969a ACC() {
        return this instanceof C112575ii ? ((C112575ii) this).A0P : ((C112565ih) this).A0L;
    }

    public Intent ACk(Context context) {
        Intent A042;
        if (this instanceof C112575ii) {
            A042 = C110105dW.A04(context, IndiaUpiIncentivesValuePropsActivity.class);
            A042.putExtra("extra_payments_entry_type", 1);
            A042.putExtra("extra_banner_type", 20);
        } else if (!(this instanceof C112565ih)) {
            return null;
        } else {
            A042 = C110105dW.A04(context, IncentiveValuePropsActivity.class);
        }
        A042.putExtra("referral_screen", "in_app_banner");
        return A042;
    }

    public AnonymousClass1GQ ADT() {
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0B;
        }
        return null;
    }

    public AnonymousClass2X2 ADU() {
        if (!(this instanceof C112565ih)) {
            return null;
        }
        C112565ih r0 = (C112565ih) this;
        C16440t3 r1 = r0.A06;
        C18300wT r5 = r0.A0I;
        return new C112145i1(r1, r0.A07, r0.A0G, r0.A0B, r5, r0.A0L);
    }

    public C28371Vv ADq(C35431lv r5) {
        C35081lL[] r3 = new C35081lL[3];
        r3[0] = new C35081lL("value", r5.A00());
        r3[1] = new C35081lL("offset", r5.A00);
        C35081lL.A01("currency", ((C35491m1) r5.A01).A04, r3);
        return new C28371Vv("money", r3);
    }

    public Class ADt(Bundle bundle) {
        if (this instanceof C112565ih) {
            return C119085vt.A00(bundle);
        }
        return null;
    }

    public C46042Cc AEJ() {
        if (this instanceof C112575ii) {
            return new C1202060s(((C112575ii) this).A0L);
        }
        if (this instanceof C112565ih) {
            return new C1201960r();
        }
        return null;
    }

    public List AEL(AnonymousClass1Vt r6, C28381Vw r7) {
        C35431lv r1;
        AnonymousClass1W2 r12 = r6.A0A;
        if (r6.A0E() || r12 == null || (r1 = r12.A01) == null) {
            return null;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new C28371Vv(ADq(r1), "amount", new C35081lL[0]));
        return A0u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0127, code lost:
        if (r0 != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AEM(X.AnonymousClass1Vt r6, X.C28381Vw r7) {
        /*
            r5 = this;
            boolean r0 = r6.A0E()
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "type"
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "request"
            X.C110105dW.A1P(r1, r0, r2)
            X.0rv r0 = r7.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0028
            com.whatsapp.jid.UserJid r3 = r6.A0E
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "sender"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r2.add(r0)
        L_0x0028:
            java.lang.String r1 = r6.A0K
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "request-id"
            X.C110105dW.A1P(r0, r1, r2)
        L_0x0031:
            X.1W2 r0 = r6.A0A
            if (r0 == 0) goto L_0x0045
            long r3 = r0.A09()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            java.lang.String r1 = java.lang.Long.toString(r3)
            java.lang.String r0 = "expiry-ts"
            X.C110105dW.A1P(r0, r1, r2)
        L_0x0045:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0060
            java.lang.String r1 = r6.A0G
            java.lang.String r0 = "country"
            X.C110105dW.A1P(r0, r1, r2)
            int r3 = r6.A04
            java.lang.String r1 = "version"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (int) r3)
        L_0x005d:
            r2.add(r0)
        L_0x0060:
            return r2
        L_0x0061:
            java.lang.String r0 = "send"
            X.C110105dW.A1P(r1, r0, r2)
            int r1 = r6.A03
            r0 = 100
            if (r1 != r0) goto L_0x012b
            java.lang.String r1 = "p2m"
        L_0x006e:
            java.lang.String r0 = "transaction-type"
            X.C110105dW.A1P(r0, r1, r2)
            X.0rv r0 = r7.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x008a
            com.whatsapp.jid.UserJid r3 = r6.A0D
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "receiver"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r2.add(r0)
        L_0x008a:
            java.util.ArrayList r1 = r6.A0N
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x00a5
            int r0 = r1.size()
            if (r0 != r4) goto L_0x00a5
            java.lang.Object r0 = r1.get(r3)
            X.1ls r0 = (X.C35401ls) r0
            X.1cl r0 = r0.A01
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential-id"
            X.C110105dW.A1P(r0, r1, r2)
        L_0x00a5:
            X.1W2 r0 = r6.A0A
            if (r0 == 0) goto L_0x00ac
            r0.A02(r2, r3)
        L_0x00ac:
            java.lang.String r0 = r6.A0K
            boolean r0 = X.AnonymousClass1W1.A09(r0)
            if (r0 == 0) goto L_0x00be
            java.lang.String r1 = r6.A0K
            X.AnonymousClass00B.A06(r1)
            java.lang.String r0 = "id"
            X.C110105dW.A1P(r0, r1, r2)
        L_0x00be:
            java.lang.String r0 = r6.A0M
            if (r0 == 0) goto L_0x00db
            X.0wS r0 = r5.A04
            r0.A06()
            X.16r r3 = r0.A08
            java.lang.String r1 = r6.A0M
            r0 = 0
            X.1Vt r0 = r3.A0M(r1, r0)
            if (r0 == 0) goto L_0x00db
            java.lang.String r1 = r0.A0K
            if (r1 == 0) goto L_0x00db
            java.lang.String r0 = "request-id"
            X.C110105dW.A1P(r0, r1, r2)
        L_0x00db:
            int r3 = r6.A00
            if (r3 != r4) goto L_0x00e9
            java.lang.String r1 = "payment_initiator"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (int) r3)
            r2.add(r0)
        L_0x00e9:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r1 = r6.A0G
            java.lang.String r0 = "country"
            X.C110105dW.A1P(r0, r1, r2)
            int r0 = r6.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "version"
            X.C110105dW.A1P(r0, r1, r2)
        L_0x0103:
            X.0wS r1 = r5.A04
            java.lang.String r0 = r6.A0G
            X.1Vx r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = r6.A0I
            X.19r r0 = r1.AEp(r0)
            if (r0 == 0) goto L_0x0060
            X.19e r1 = r0.ABC()
            if (r1 == 0) goto L_0x0060
            boolean r0 = r1.AJk()
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.A0H
            X.1lL r0 = r1.A9Q(r0)
            if (r0 == 0) goto L_0x0060
            goto L_0x005d
        L_0x012b:
            java.lang.String r1 = "p2p"
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61Y.AEM(X.1Vt, X.1Vw):java.util.List");
    }

    public C227719f AEO() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0T;
        }
        return null;
    }

    public C85604Pc AEP() {
        return new C85604Pc();
    }

    public AnonymousClass5Si AEQ(AnonymousClass013 r2, C14710pd r3, C209712h r4, C85604Pc r5) {
        return new AnonymousClass3H8(r2, r3, r4, r5);
    }

    public Class AER() {
        return this instanceof C112575ii ? IndiaUpiCheckOrderDetailsActivity.class : BrazilOrderDetailsActivity.class;
    }

    public AnonymousClass2H6 AES() {
        if (this instanceof C112575ii) {
            C112575ii r0 = (C112575ii) this;
            C14710pd r5 = r0.A0A;
            C14870pt r1 = r0.A01;
            C16980tz r2 = r0.A03;
            C16320sq r14 = r0.A0X;
            C17190ug r6 = r0.A0B;
            C18280wR r13 = r0.A0W;
            C18290wS r11 = r0.A04;
            C119365wy r8 = r0.A0D;
            C18310wU r10 = r0.A0N;
            return new C1200260a(r1, r2, r0.A08, r0.A09, r5, r6, r0.A0C, r8, r0.A0H, r10, r11, r0.A0U, r13, r14);
        } else if (this instanceof C112565ih) {
            return new AnonymousClass60Z();
        } else {
            return null;
        }
    }

    public String AET() {
        return null;
    }

    public C227419c AEU() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0R;
        }
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0Q;
        }
        return null;
    }

    public AnonymousClass2H5 AEV(C16980tz r2, C18300wT r3) {
        return this instanceof C112575ii ? new C112595ik(r2, r3) : this instanceof C112565ih ? new C112585ij(r2, r3) : new C1200760f(r2, r3);
    }

    public int AEW() {
        return this instanceof C112575ii ? R.string.str0b71 : R.string.str028d;
    }

    public Class AEX() {
        if (this instanceof C112565ih) {
            return BrazilFbPayHubActivity.class;
        }
        return null;
    }

    public AnonymousClass1YB AEY() {
        if (this instanceof C112575ii) {
            return new C112615im();
        }
        if (this instanceof C112565ih) {
            return new C112605il();
        }
        return null;
    }

    public Class AEZ() {
        if (this instanceof C112575ii) {
            return IndiaPaymentTransactionHistoryActivity.class;
        }
        if (this instanceof C112565ih) {
            return PaymentTransactionHistoryActivity.class;
        }
        return null;
    }

    public int AEb() {
        if (this instanceof C112575ii) {
            return R.string.str0b6e;
        }
        return 0;
    }

    public Pattern AEc() {
        if (this instanceof C112575ii) {
            return AnonymousClass5x5.A02;
        }
        return null;
    }

    public C42711yJ AEd() {
        if (this instanceof C112575ii) {
            C112575ii r0 = (C112575ii) this;
            C16440t3 r5 = r0.A06;
            C14710pd r7 = r0.A0A;
            C18890xQ r2 = r0.A04;
            C218315p r9 = r0.A05;
            return new C112035hq(r0.A00, r2, r0.A01, r0.A02, r5, r0.A07, r7, r0.A0G, r9);
        } else if (!(this instanceof C112565ih)) {
            return null;
        } else {
            C112565ih r02 = (C112565ih) this;
            C16440t3 r52 = r02.A06;
            C14710pd r72 = r02.A09;
            C18890xQ r22 = r02.A05;
            C218315p r92 = r02.A0T;
            return new C112025hp(r02.A00, r22, r02.A01, r02.A02, r52, r02.A08, r72, r02.A0R, r92);
        }
    }

    public C47372Ir AEf() {
        if (!(this instanceof C112575ii)) {
            return null;
        }
        C112575ii r0 = (C112575ii) this;
        C16440t3 r1 = r0.A06;
        C14710pd r3 = r0.A0A;
        return new C1201360l(r1, r0.A03, r3, r0.A0G, r0.A05);
    }

    public /* synthetic */ Pattern AEg() {
        if (this instanceof C112575ii) {
            return AnonymousClass5x5.A03;
        }
        return null;
    }

    public String AEh(C227319b r2, C16740tZ r3) {
        return this.A05.A0U(r2, r3);
    }

    public AnonymousClass2KG AEj() {
        if (!(this instanceof C112565ih)) {
            return null;
        }
        C112565ih r1 = (C112565ih) this;
        return new C112095hw(r1.A03.A00, r1.A02, r1.A04, r1.A0V);
    }

    public Class AEk() {
        if (this instanceof C112575ii) {
            return IndiaUpiVpaContactInfoActivity.class;
        }
        return null;
    }

    public int AEl() {
        if (this instanceof C112575ii) {
            return R.string.str0b70;
        }
        return 0;
    }

    public Class AEm() {
        if (this instanceof C112575ii) {
            return IndiaUpiProfileDetailsActivity.class;
        }
        return null;
    }

    public C54722i6 AEn() {
        if (!(this instanceof C112575ii)) {
            return null;
        }
        C112575ii r0 = (C112575ii) this;
        AnonymousClass60V r3 = r0.A0E;
        return new C1201560n(r0.A02, r0.A0A, r3, r0.A0P, r0.A0V);
    }

    public Class AEo() {
        return this instanceof C112575ii ? IndiaUpiQuickBuyActivity.class : BrazilOrderDetailsActivity.class;
    }

    public Class AEt() {
        return this instanceof C112575ii ? IndiaUpiPaymentSettingsActivity.class : BrazilPaymentSettingsActivity.class;
    }

    public C42701yH AEu() {
        if (!(this instanceof C112565ih)) {
            return null;
        }
        C112565ih r0 = (C112565ih) this;
        return new C1201760p(r0.A01, r0.A02, r0.A06, r0.A0I, r0.A0T, r0.A0U);
    }

    public Class AEv() {
        return this instanceof C112575ii ? IndiaUpiPaymentTransactionDetailsActivity.class : BrazilPaymentTransactionDetailActivity.class;
    }

    public Class AEw() {
        if (this instanceof C112565ih) {
            return BrazilViralityLinkVerifierActivity.class;
        }
        return null;
    }

    public Intent AEx(Context context, String str, boolean z2) {
        boolean A1Y;
        C14710pd r1;
        int i2;
        Intent A042;
        if (this instanceof C112575ii) {
            Intent A043 = C110105dW.A04(context, IndiaUpiPaymentsAccountSetupActivity.class);
            A043.putExtra("extra_payments_entry_type", 1);
            A043.putExtra("extra_skip_value_props_display", false);
            AnonymousClass22U.A00(A043, "inAppBanner");
            return A043;
        } else if (!(this instanceof C112565ih)) {
            return null;
        } else {
            C112565ih r3 = (C112565ih) this;
            if (str == "in_app_banner") {
                r1 = r3.A09;
                i2 = 567;
            } else if (str == "alt_virality") {
                r1 = r3.A09;
                i2 = 570;
            } else {
                A1Y = AnonymousClass000.A1Y(str, "deeplink");
                C118955vg r32 = r3.A0R;
                String A022 = r32.A02(true);
                if (A1Y || A022 == null) {
                    A042 = C110105dW.A04(context, BrazilPaymentSettingsActivity.class);
                    C110115dX.A0r(A042, str);
                } else {
                    A042 = C110105dW.A04(context, BrazilPayBloksActivity.class);
                    A042.putExtra("screen_name", A022);
                    if (str != null) {
                        C111675hA.A03(A042, "referral_screen", str);
                    }
                }
                r32.A04(A042, "generic_context");
                return A042;
            }
            A1Y = r1.A0C(i2);
            C118955vg r322 = r3.A0R;
            String A0222 = r322.A02(true);
            if (A1Y) {
            }
            A042 = C110105dW.A04(context, BrazilPaymentSettingsActivity.class);
            C110115dX.A0r(A042, str);
            r322.A04(A042, "generic_context");
            return A042;
        }
    }

    public Class AF0() {
        if (this instanceof C112575ii) {
            return IndiaUpiPinPrimerFullSheetActivity.class;
        }
        return null;
    }

    public Class AFS() {
        if (this instanceof C112565ih) {
            return BrazilPaymentReportPaymentActivity.class;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1 != 6) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AFi(X.AnonymousClass1Vt r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C112575ii
            if (r0 == 0) goto L_0x001c
            X.5hW r0 = X.C110115dX.A0K(r3)
            X.5xC r0 = r0.A0B
            if (r0 == 0) goto L_0x001c
            int r1 = r0.A00()
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 2
            if (r1 == r0) goto L_0x0028
            r0 = 4
            if (r1 == r0) goto L_0x0030
            r0 = 6
            if (r1 == r0) goto L_0x0028
        L_0x001c:
            X.0tz r0 = r2.A03
            android.content.Context r1 = r0.A00
            r0 = 2131890361(0x7f1210b9, float:1.9415412E38)
        L_0x0023:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0028:
            X.0tz r0 = r2.A03
            android.content.Context r1 = r0.A00
            r0 = 2131890348(0x7f1210ac, float:1.9415385E38)
            goto L_0x0023
        L_0x0030:
            X.0tz r0 = r2.A03
            android.content.Context r1 = r0.A00
            r0 = 2131890474(0x7f12112a, float:1.941564E38)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61Y.AFi(X.1Vt):java.lang.String");
    }

    public Class AFu() {
        if (this instanceof C112575ii) {
            return IndiaUpiSendPaymentActivity.class;
        }
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0K.A05() ? BrazilSmbPaymentActivity.class : BrazilPaymentActivity.class;
        }
        return null;
    }

    public String AGQ(String str) {
        return null;
    }

    public Intent AGc(Context context, String str) {
        return null;
    }

    public int AGf(AnonymousClass1Vt r2) {
        return ((this instanceof C112575ii) || (this instanceof C112565ih)) ? C218315p.A01(r2) : R.color.color0616;
    }

    public String AGh(AnonymousClass1Vt r2) {
        C218315p r0;
        if (this instanceof C112575ii) {
            r0 = this.A05;
        } else if (!(this instanceof C112565ih)) {
            return "";
        } else {
            r0 = ((C112565ih) this).A0T;
        }
        return r0.A0K(r2);
    }

    public boolean AHc() {
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0R.A06.A03();
        }
        return false;
    }

    public C39911tG AI3() {
        if (this instanceof C112575ii) {
            return new C111805hR();
        }
        if (this instanceof C112565ih) {
            return new C111795hQ();
        }
        return null;
    }

    public C39891tE AI4() {
        if (this instanceof C112565ih) {
            return new C111815hS();
        }
        return null;
    }

    public C35511m3 AI5() {
        if (this instanceof C112575ii) {
            return new C111765hN();
        }
        if (this instanceof C112565ih) {
            return new C111755hM();
        }
        return null;
    }

    public C39931tI AI6() {
        if (this instanceof C112565ih) {
            return new C111825hT();
        }
        return null;
    }

    public AnonymousClass1W2 AI7() {
        return this instanceof C112575ii ? new C111855hW() : new C111845hV();
    }

    public C39921tH AI8() {
        return null;
    }

    public boolean AIf() {
        if (this instanceof C112575ii) {
            return ((C112575ii) this).A0A.A0C(1969);
        }
        return false;
    }

    public boolean AIh() {
        return (this instanceof C112575ii) || (this instanceof C112565ih);
    }

    public boolean AJR(Uri uri) {
        if (this instanceof C112575ii) {
            return C115205pL.A00(uri, ((C112575ii) this).A0R);
        }
        if (this instanceof C112565ih) {
            return C115205pL.A00(uri, ((C112565ih) this).A0Q);
        }
        return false;
    }

    public boolean AJt(AnonymousClass478 r2) {
        return (this instanceof C112575ii) || (this instanceof C112565ih);
    }

    public void AKO(Uri uri) {
        String queryParameter;
        int length;
        String str;
        if (this instanceof C112575ii) {
            C1200660e r5 = ((C112575ii) this).A0R;
            if (!uri.getQueryParameterNames().isEmpty()) {
                String queryParameter2 = uri.getQueryParameter("campaignID");
                String str2 = null;
                if (queryParameter2 == null) {
                    str = "Unknown signup url";
                } else {
                    str = C115205pL.A00(uri, r5) ? "Blocked signup url" : null;
                    try {
                        JSONObject A0J = C13700nu.A0J();
                        A0J.put("campaign_id", queryParameter2);
                        str2 = A0J.toString();
                    } catch (Exception e2) {
                        Log.e("IN PAY: error logging campaign id", e2);
                    }
                }
                C53842gO r1 = new C53842gO();
                r1.A0a = "deeplink";
                r1.A08 = C13680ns.A0X();
                r1.A0Y = str2;
                r1.A0T = str;
                r5.A01.AKR(r1);
            }
        } else if (this instanceof C112565ih) {
            C112565ih r0 = (C112565ih) this;
            C1200560d r4 = r0.A0Q;
            boolean A0G = r0.A0R.A02.A0G("tos_no_wallet");
            String queryParameter3 = uri.getQueryParameter("c");
            if ("br".equals(r4.A00.A0C(uri)) && queryParameter3 != null) {
                if (A0G || ((queryParameter = uri.getQueryParameter("c")) != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA")))) {
                    AnonymousClass2St r52 = new AnonymousClass2St(new AnonymousClass2St[0]);
                    r52.A01("campaign_id", queryParameter3);
                    r4.A02.AKU(r52, 0, (Integer) null, "deeplink", (String) null);
                }
            }
        }
    }

    public void ALy(Context context, C14600pS r7, AnonymousClass1Vt r8) {
        if (this instanceof C112565ih) {
            C112565ih r3 = (C112565ih) this;
            C118955vg r4 = r3.A0R;
            String A022 = r4.A02(true);
            if (A022 == null) {
                r3.A04.A01().A00().A00(new IDxNConsumerShape41S0200000_3_I0(r7, 1, r3));
            } else if ("brpay_p_account_recovery_eligibility_screen".equals(A022)) {
                AnonymousClass5xF r42 = r3.A0S;
                C14530pL r32 = (C14530pL) C19980zJ.A00(context);
                BrazilAccountRecoveryEligibilityBottomSheet A012 = BrazilAccountRecoveryEligibilityBottomSheet.A01("receive_flow");
                A012.A04 = new C117125sU(r32, r42, "receive_flow");
                r32.Afc(A012);
            } else {
                Intent A042 = C110105dW.A04(context, BrazilPayBloksActivity.class);
                A042.putExtra("screen_name", A022);
                A042.putExtra("hide_send_payment_cta", true);
                r4.A04(A042, "p2p_context");
                C111675hA.A03(A042, "referral_screen", "get_started");
                C117265si r2 = new C117265si(A042, (String) null, context.getString(R.string.str000d), (String) null);
                AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
                addPaymentMethodBottomSheet.A0T(C13690nt.A0D());
                addPaymentMethodBottomSheet.A04 = r2;
                addPaymentMethodBottomSheet.A05 = new C1209363o(addPaymentMethodBottomSheet);
                r7.Afc(addPaymentMethodBottomSheet);
            }
        } else {
            AnonymousClass00B.A06(r8);
            Intent A043 = C110105dW.A04(context, A9g());
            A043.putExtra("extra_setup_mode", 2);
            A043.putExtra("extra_receive_nux", true);
            if (r8.A0A != null && !TextUtils.isEmpty((CharSequence) null)) {
                A043.putExtra("extra_onboarding_provider", (String) null);
            }
            AnonymousClass22U.A00(A043, "acceptPayment");
            context.startActivity(A043);
        }
    }

    public void Aag(C47382Is r6, List list) {
        if (this instanceof C112575ii) {
            r6.A02 = 0;
            r6.A03 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass5xC r0 = C110115dX.A0K((AnonymousClass1Vt) it.next()).A0B;
                if (r0 != null) {
                    if (AnonymousClass5xN.A02(r0.A0E)) {
                        r6.A03++;
                    } else {
                        r6.A02++;
                    }
                }
            }
        }
    }

    public void Af6(AnonymousClass174 r5) {
        C28411Vz r2;
        C15900s5 r1;
        C16520tC r0;
        if (this instanceof C112575ii) {
            C112575ii r3 = (C112575ii) this;
            C30681cm A012 = r5.A01();
            if (A012 == C30681cm.A0E) {
                r2 = A012.A02;
                r1 = r3.A02;
                r0 = C15910s6.A1q;
            } else {
                return;
            }
        } else if (this instanceof C112565ih) {
            C112565ih r32 = (C112565ih) this;
            C30681cm A013 = r5.A01();
            if (A013 == C30681cm.A0D) {
                r2 = A013.A02;
                r1 = r32.A03;
                r0 = C15910s6.A1m;
            } else {
                return;
            }
        } else {
            return;
        }
        ((C35481m0) r2).A00 = C110115dX.A0C(r2, new BigDecimal(r1.A02(r0)));
    }

    public boolean AfD() {
        return this instanceof C112565ih;
    }

    public boolean AfJ() {
        if (this instanceof C112565ih) {
            return ((C112565ih) this).A0R.A05();
        }
        return false;
    }
}
