package com.obwhatsapp.payments.ui.international;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass29T;
import X.AnonymousClass2HJ;
import X.AnonymousClass4IR;
import X.AnonymousClass4W0;
import X.AnonymousClass4W5;
import X.AnonymousClass55M;
import X.AnonymousClass5EV;
import X.C1051058f;
import X.C111805hR;
import X.C112925kg;
import X.C115185pJ;
import X.C119365wy;
import X.C1200960h;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C15220qW;
import X.C17110uY;
import X.C18450wi;
import X.C30531cW;
import X.C32241fu;
import X.C35301lh;
import X.C35521m4;
import X.C39901tF;
import X.C53852gP;
import X.C77593w2;
import X.C89184bj;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.Button;
import java.util.HashMap;

public final class IndiaUpiInternationalActivationActivity extends C112925kg {
    public ProgressBar A00;
    public Button A01;
    public C35521m4 A02;
    public C35301lh A03;
    public C17110uY A04;
    public final C15220qW A05 = new C1051058f(new AnonymousClass5EV(this));

    public static /* synthetic */ void A02(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        AnonymousClass027 r4 = ((IndiaUpiInternationalActivationViewModel) indiaUpiInternationalActivationActivity.A05.getValue()).A00;
        C89184bj r0 = (C89184bj) r4.A01();
        r4.A0B(r0 == null ? null : new C89184bj(r0.A00, r0.A01, true));
        indiaUpiInternationalActivationActivity.A0A.A00();
    }

    public static /* synthetic */ void A03(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity, C89184bj r6) {
        Button button;
        String string;
        boolean z2 = r6.A02;
        ProgressBar progressBar = indiaUpiInternationalActivationActivity.A00;
        if (z2) {
            if (progressBar != null) {
                progressBar.setVisibility(0);
                button = indiaUpiInternationalActivationActivity.A01;
                if (button != null) {
                    string = "";
                }
                throw C18450wi.A03("buttonView");
            }
            throw C18450wi.A03("buttonSpinnerView");
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
            button = indiaUpiInternationalActivationActivity.A01;
            if (button != null) {
                string = indiaUpiInternationalActivationActivity.getString(R.string.str02b1);
            }
            throw C18450wi.A03("buttonView");
        }
        throw C18450wi.A03("buttonSpinnerView");
        button.setText(string);
        AnonymousClass4W5 r1 = r6.A00;
        if (r1 != null) {
            C32241fu A002 = C32241fu.A00(indiaUpiInternationalActivationActivity);
            A002.A07(false);
            A002.setTitle(r1.A02);
            A002.A06(r1.A01);
            C13690nt.A1H(A002, indiaUpiInternationalActivationActivity, 78, R.string.str1c24);
            C13690nt.A1G(A002);
        }
    }

    public void A3Z() {
        AnonymousClass29T.A01(this, 19);
    }

    public void A3b() {
        throw C14530pL.A0S();
    }

    public void A3c() {
        throw C14530pL.A0S();
    }

    public void A3d() {
        throw C14530pL.A0S();
    }

    public void A3i(HashMap hashMap) {
        Class<String> cls = String.class;
        HashMap hashMap2 = hashMap;
        C18450wi.A0H(hashMap2, 0);
        IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = (IndiaUpiInternationalActivationViewModel) this.A05.getValue();
        C35521m4 r9 = this.A02;
        String str = "paymentBankAccount";
        if (r9 != null) {
            C35301lh r10 = this.A03;
            if (r10 == null) {
                str = "seqNumber";
            } else {
                String str2 = r9.A0A;
                C18450wi.A0B(str2);
                AnonymousClass4W0 r12 = new AnonymousClass4W0(new C35301lh(new C53852gP(), cls, "11/21/2022", "cardExpiryDate"), new C35301lh(new C53852gP(), cls, "12/04/2022", "cardExpiryDate"), str2);
                C39901tF r5 = r9.A08;
                if (r5 != null) {
                    C111805hR r52 = (C111805hR) r5;
                    String A002 = C119365wy.A00("MPIN", hashMap2);
                    if (r52.A09 != null) {
                        AnonymousClass027 r8 = indiaUpiInternationalActivationViewModel.A00;
                        C89184bj r0 = (C89184bj) r8.A01();
                        r8.A0B(r0 == null ? null : new C89184bj(r0.A00, r0.A01, true));
                        C77593w2 r7 = indiaUpiInternationalActivationViewModel.A01;
                        C35301lh r82 = r52.A09;
                        C18450wi.A0F(r82);
                        C18450wi.A0A(r82);
                        String str3 = r52.A0F;
                        if (str3 == null) {
                            str3 = "";
                        }
                        C35301lh r92 = new C35301lh(new C53852gP(), cls, A002, "pin");
                        C35301lh r11 = r52.A06;
                        C18450wi.A0A(r11);
                        r7.A00(r82, r92, r10, r11, r12, new AnonymousClass4IR(r12, indiaUpiInternationalActivationViewModel), str3);
                        return;
                    }
                    return;
                }
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.payments.IndiaUpiMethodData");
            }
        }
        throw C18450wi.A03(str);
    }

    public void ASh(AnonymousClass2HJ r11, String str) {
        String str2 = str;
        C18450wi.A0H(str, 0);
        if (str.length() > 0) {
            C35521m4 r1 = this.A02;
            if (r1 == null) {
                throw C18450wi.A03("paymentBankAccount");
            }
            String str3 = r1.A0B;
            C35301lh r0 = this.A03;
            if (r0 == null) {
                throw C18450wi.A03("seqNumber");
            }
            String str4 = (String) r0.A00;
            C39901tF r4 = r1.A08;
            if (r4 != null) {
                C111805hR r42 = (C111805hR) r4;
                C35301lh r02 = r1.A09;
                A3g(r42, str2, str3, str4, (String) (r02 == null ? null : r02.A00), 3);
                return;
            }
            throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.payments.IndiaUpiMethodData");
        } else if (r11 != null && !C1200960h.A02(this, "upi-list-keys", r11.A00, false)) {
            if (this.A06.A07("upi-list-keys")) {
                this.A0C.A0E();
                Ac1();
                Afq(R.string.str1102);
                this.A0A.A00();
                return;
            }
            A3b();
            throw AnonymousClass000.A0Z();
        }
    }

    public void AX5(AnonymousClass2HJ r2) {
        throw C14530pL.A0S();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C35521m4 r0 = (C35521m4) getIntent().getParcelableExtra("extra_bank_account");
        if (r0 != null) {
            this.A02 = r0;
        }
        this.A03 = new C35301lh(new C53852gP(), String.class, A3F(this.A0C.A07()), "upiSequenceNumber");
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        setContentView((int) R.layout.layout0316);
        C17110uY r6 = this.A04;
        if (r6 != null) {
            Runnable[] runnableArr = {new AnonymousClass55M(this)};
            C30531cW.A04((TextEmojiLabel) findViewById(R.id.activate_international_payment_description), this.A08, r6.A05(getString(R.string.str18ba), runnableArr, new String[]{"supported-countries"}, new String[]{"https://www.whatsapp.com/security"}));
            this.A00 = (ProgressBar) C18450wi.A01(this, R.id.turn_on_button_spinner);
            this.A01 = (Button) C18450wi.A01(this, R.id.continue_button);
            C115185pJ.A00(this, R.drawable.onboarding_actionbar_home_close);
            C15220qW r2 = this.A05;
            C13680ns.A1L(this, ((IndiaUpiInternationalActivationViewModel) r2.getValue()).A00, 107);
            C13680ns.A1L(this, ((IndiaUpiInternationalActivationViewModel) r2.getValue()).A03, 106);
            Button button = this.A01;
            if (button == null) {
                str = "buttonView";
            } else {
                C13690nt.A19(button, this, 9);
                return;
            }
        } else {
            str = "linkifier";
        }
        throw C18450wi.A03(str);
    }
}
