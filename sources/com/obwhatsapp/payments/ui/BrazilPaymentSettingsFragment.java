package com.obwhatsapp.payments.ui;

import X.AnonymousClass173;
import X.AnonymousClass1N0;
import X.AnonymousClass1N3;
import X.AnonymousClass22U;
import X.AnonymousClass2KI;
import X.AnonymousClass2St;
import X.AnonymousClass2T3;
import X.AnonymousClass5vR;
import X.AnonymousClass5xE;
import X.AnonymousClass60H;
import X.AnonymousClass60U;
import X.AnonymousClass69C;
import X.C003101j;
import X.C004601z;
import X.C110105dW;
import X.C110475eC;
import X.C111675hA;
import X.C111865hX;
import X.C114095n7;
import X.C114845oh;
import X.C115205pL;
import X.C115275pU;
import X.C117755tV;
import X.C118255uO;
import X.C118955vg;
import X.C119345ww;
import X.C1200560d;
import X.C1222969a;
import X.C13680ns;
import X.C18300wT;
import X.C30671cl;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape24S0000000_3_I1;
import com.facebook.redex.IDxNObserverShape453S0100000_3_I1;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public class BrazilPaymentSettingsFragment extends Hilt_BrazilPaymentSettingsFragment implements AnonymousClass69C {
    public AnonymousClass1N0 A00;
    public AnonymousClass173 A01;
    public AnonymousClass60U A02;
    public C111865hX A03;
    public AnonymousClass5xE A04;
    public C118255uO A05;
    public C1222969a A06;
    public AnonymousClass1N3 A07;
    public C1200560d A08;
    public C118955vg A09;
    public C114095n7 A0A;
    public C117755tV A0B;

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 2 && i3 == -1) {
            A0r(C110105dW.A04(A0u(), BrazilFbPayHubActivity.class));
        }
    }

    public void A14() {
        super.A14();
        C119345ww r0 = this.A0s;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void A18(Bundle bundle, View view) {
        String str;
        super.A18(bundle, view);
        super.A17(bundle);
        this.A00.A0D("payment_settings");
        if (this.A04.A0C(698)) {
            this.A03.A0A();
        }
        Bundle bundle2 = this.A05;
        String str2 = null;
        if (bundle2 != null) {
            Uri uri = (Uri) bundle2.getParcelable("extra_deep_link_url");
            if (uri != null && C115205pL.A00(uri, this.A08)) {
                AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str023f);
                A012.A01(new IDxCListenerShape24S0000000_3_I1(0), R.string.str0e87);
                A012.A00().A1G(A0F(), (String) null);
            }
            String string = bundle2.getString("notification-type", (String) null);
            str = bundle2.getString("step-up-id", (String) null);
            str2 = string;
        } else {
            str = null;
        }
        C119345ww r0 = this.A0s;
        if (r0 != null) {
            r0.A07(str2, str);
        }
        this.A0X = new IDxNObserverShape453S0100000_3_I1(this, 0);
        if (!this.A09.A06.A03()) {
            C18300wT r2 = this.A0c;
            if ((!r2.A01().contains("payment_account_recoverable") || !r2.A01().contains("payment_account_recoverable_time_ms")) && this.A04.A0C(2000)) {
                this.A05.A00(A0u());
            }
        }
    }

    public void A1R() {
        if (this.A0g.A03.A0C(1359)) {
            AnonymousClass2St A0N = C110105dW.A0N();
            A0N.A01("hc_entrypoint", "wa_payment_hub_support");
            A0N.A01("app_type", "consumer");
            this.A06.AKU(A0N, C13680ns.A0Y(), 39, "payment_home", (String) null);
            A0r(C110105dW.A04(A02(), BrazilPaymentCareTransactionSelectorActivity.class));
            return;
        }
        super.A1R();
    }

    public void A1T(int i2) {
        if (i2 == 2) {
            C114095n7 r0 = this.A0A;
            if (r0 != null) {
                String str = r0.A01;
                C114845oh r4 = r0.A00;
                String A022 = this.A09.A02(true);
                Intent A042 = C110105dW.A04(A0u(), BrazilPayBloksActivity.class);
                if (A022 == null) {
                    A022 = "brpay_p_add_credential_router";
                }
                A042.putExtra("screen_name", A022);
                C111675hA.A03(A042, "referral_screen", "push_provisioning");
                C111675hA.A03(A042, "credential_push_data", str);
                C111675hA.A03(A042, "credential_card_network", r4.toString());
                A0r(A042);
                return;
            }
            Log.e("BrazilPaymentSettingsViewModel instance is null and cannot continue to push prov");
            return;
        }
        super.A1T(i2);
    }

    public final void A1d(String str) {
        Intent A042 = C110105dW.A04(A0u(), BrazilPayBloksActivity.class);
        A042.putExtra("screen_name", str);
        this.A09.A04(A042, "generic_context");
        C111675hA.A03(A042, "referral_screen", "wa_payment_settings");
        AnonymousClass22U.A00(A042, "payment_settings");
        startActivityForResult(A042, 2);
    }

    public String ADf(C30671cl r2) {
        return null;
    }

    public String ADi(C30671cl r2) {
        return null;
    }

    public void AMA(boolean z2) {
        A1V((String) null);
    }

    public void AUY(C30671cl r1) {
    }

    public void AZz() {
        Intent A042 = C110105dW.A04(A0D(), BrazilPayBloksActivity.class);
        A042.putExtra("screen_name", "brpay_p_doc_upload_intro");
        startActivityForResult(A042, 1);
    }

    public void AdV(boolean z2) {
        View view = this.A0A;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) C004601z.A0E(view, R.id.action_required_container);
            C119345ww r0 = this.A0s;
            int i2 = 0;
            if (r0 != null) {
                if (r0.A0D.A02() != null) {
                    this.A0S.A04(C115275pU.A00(this.A0Q, this.A0s.A0D.A02()));
                }
                List A022 = this.A0S.A02();
                if (!A022.isEmpty()) {
                    frameLayout.removeAllViews();
                    C110475eC r4 = new C110475eC(A02());
                    r4.A00(new AnonymousClass5vR(new AnonymousClass60H(frameLayout, this), (AnonymousClass2KI) C003101j.A09(A022).get(0), A022.size()));
                    frameLayout.addView(r4);
                }
            }
            if (!z2) {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
        }
    }

    public boolean AfI() {
        return true;
    }
}
