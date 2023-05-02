package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass1N8;
import X.AnonymousClass2SR;
import X.AnonymousClass2St;
import X.AnonymousClass4QO;
import X.AnonymousClass5vZ;
import X.C001000l;
import X.C004601z;
import X.C103074zz;
import X.C110695eg;
import X.C119345ww;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14710pd;
import X.C14870pt;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16620tM;
import X.C18280wR;
import X.C18290wS;
import X.C18300wT;
import X.C18310wU;
import X.C18320wV;
import X.C18450wi;
import X.C228719p;
import X.C228919r;
import X.C28411Vz;
import X.C30671cl;
import X.C32241fu;
import X.C77703wK;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import java.util.List;

public final class P2mLitePaymentSettingsFragment extends Hilt_P2mLitePaymentSettingsFragment {
    public View A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public C16460t6 A03;
    public C18320wV A04;
    public C228719p A05;
    public AnonymousClass4QO A06;
    public C77703wK A07;
    public AnonymousClass1N8 A08;
    public C18280wR A09;

    public static /* synthetic */ void A02(DialogInterface dialogInterface, P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        C228719p r2 = p2mLitePaymentSettingsFragment.A05;
        if (r2 != null) {
            Integer A0a = C13680ns.A0a();
            AnonymousClass2St r3 = new AnonymousClass2St((String) null, new AnonymousClass2St[0]);
            r3.A01("p2m_type", "p2m_lite");
            r2.A00(r3, A0a, "remove_payments_info_dialogue", "payment_home", 1);
            dialogInterface.cancel();
            return;
        }
        throw C18450wi.A03("p2mLiteEventLogger");
    }

    public static /* synthetic */ void A03(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        String str;
        C228719p r2 = p2mLitePaymentSettingsFragment.A05;
        if (r2 != null) {
            Integer A0T = C13690nt.A0T();
            AnonymousClass2St r3 = new AnonymousClass2St((String) null, new AnonymousClass2St[0]);
            r3.A01("p2m_type", "p2m_lite");
            r2.A00(r3, A0T, "remove_payments_info_dialogue", "payment_home", 1);
            p2mLitePaymentSettingsFragment.A0F.A08(0, R.string.str13db);
            Context A0u = p2mLitePaymentSettingsFragment.A0u();
            C14870pt r32 = p2mLitePaymentSettingsFragment.A0F;
            C16320sq r12 = p2mLitePaymentSettingsFragment.A12;
            C18280wR r11 = p2mLitePaymentSettingsFragment.A09;
            if (r11 != null) {
                C18290wS r10 = p2mLitePaymentSettingsFragment.A0h;
                C16460t6 r5 = p2mLitePaymentSettingsFragment.A03;
                if (r5 != null) {
                    C18300wT r7 = p2mLitePaymentSettingsFragment.A0c;
                    C18310wU r8 = p2mLitePaymentSettingsFragment.A0e;
                    C18320wV r9 = p2mLitePaymentSettingsFragment.A04;
                    if (r9 != null) {
                        new AnonymousClass5vZ(A0u, r32, p2mLitePaymentSettingsFragment.A0K, r5, p2mLitePaymentSettingsFragment.A0Z, r7, r8, r9, r10, r11, r12).A00(new C103074zz(p2mLitePaymentSettingsFragment));
                        return;
                    }
                    str = "paymentsLifecycleManager";
                } else {
                    str = "coreMessageStore";
                }
            } else {
                str = "paymentDeviceId";
            }
        } else {
            str = "p2mLiteEventLogger";
        }
        throw C18450wi.A03(str);
    }

    public static /* synthetic */ void A04(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        C228719p r4 = p2mLitePaymentSettingsFragment.A05;
        if (r4 != null) {
            AnonymousClass2St r5 = new AnonymousClass2St((String) null, new AnonymousClass2St[0]);
            r5.A01("p2m_type", "p2m_lite");
            r4.A00(r5, 157, "payment_home", "chat", 1);
            C32241fu A002 = C32241fu.A00(p2mLitePaymentSettingsFragment.A0C());
            A002.A02(R.string.str0fb2);
            A002.A01(R.string.str0fb1);
            A002.A07(true);
            C13690nt.A1H(A002, p2mLitePaymentSettingsFragment, 77, R.string.str0394);
            C13680ns.A1H(A002, p2mLitePaymentSettingsFragment, 76, R.string.str0fb0);
            C228719p r8 = p2mLitePaymentSettingsFragment.A05;
            if (r8 != null) {
                AnonymousClass2St r9 = new AnonymousClass2St((String) null, new AnonymousClass2St[0]);
                r9.A01("p2m_type", "p2m_lite");
                r8.A00(r9, (Integer) null, "remove_payments_info_dialogue", "payment_home", 0);
                A002.A00();
                return;
            }
        }
        throw C18450wi.A03("p2mLiteEventLogger");
    }

    public static /* synthetic */ void A05(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        Context A0u = p2mLitePaymentSettingsFragment.A0u();
        if (A0u != null) {
            C228919r A042 = p2mLitePaymentSettingsFragment.A0h.A04("P2M_LITE");
            Intent intent = null;
            if (A042 != null) {
                intent = A042.ABs(A0u, "personal", (String) null);
            }
            p2mLitePaymentSettingsFragment.A0r(intent);
        }
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        super.A18(bundle, view);
        C004601z.A0E(view, R.id.payment_methods_container).setVisibility(8);
        C004601z.A0E(view, R.id.payment_history_separator).setVisibility(8);
        this.A00 = view.findViewById(R.id.payment_settings_row_separator);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.payment_settings_row_remove_method);
        this.A01 = linearLayout;
        if (linearLayout != null) {
            C13690nt.A19(linearLayout, this, 6);
        }
        Context A0u = A0u();
        if (A0u != null) {
            AnonymousClass2SR.A08(C13680ns.A0K(view, R.id.delete_payments_account_icon), AnonymousClass00T.A00(A0u, R.color.color05f0));
        }
        C13680ns.A1F(C13680ns.A0M(view, R.id.delete_payments_account_label), this, R.string.str0faf);
        Context A0u2 = A0u();
        if (A0u2 != null) {
            AnonymousClass2SR.A08(C13680ns.A0K(view, R.id.request_dyi_report_icon), AnonymousClass00T.A00(A0u2, R.color.color05f0));
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.request_dyi_report_button);
        this.A02 = linearLayout2;
        if (linearLayout2 != null) {
            C13690nt.A19(linearLayout2, this, 7);
        }
        this.A0z.setSizeLimit(3);
        C001000l A0C = A0C();
        if (A0C != null) {
            this.A06 = new AnonymousClass4QO((C14530pL) A0C);
            return;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.WaBaseActivity");
    }

    public C119345ww A1M() {
        return null;
    }

    public C110695eg A1N() {
        C77703wK r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1N8 r02 = this.A08;
        if (r02 != null) {
            C16440t3 r1 = r02.A07;
            C14710pd r4 = r02.A0G;
            C77703wK r03 = new C77703wK(r1, r02.A09, r02.A0F, r4, r02.A0K, r02.A0N, r02.A0P);
            this.A07 = r03;
            return r03;
        }
        throw C18450wi.A03("viewModelCreationDelegate");
    }

    public CharSequence A1O() {
        C28411Vz A002 = this.A0f.A00();
        return A002 != null ? A002.ABE(A02()) : "";
    }

    public String A1Q() {
        return "P2M_LITE";
    }

    public boolean A1Z() {
        return false;
    }

    public boolean A1a() {
        return true;
    }

    public boolean A1b() {
        return true;
    }

    public final void A1e() {
        boolean z2 = this.A0c.A01().getBoolean("has_p2mlite_account", false);
        int i2 = 8;
        LinearLayout linearLayout = this.A01;
        if (z2) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.A04.A0E(C16620tM.A02, 2727)) {
                i2 = 0;
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            View view2 = this.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        LinearLayout linearLayout2 = this.A02;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i2);
        }
    }

    public String ADf(C30671cl r2) {
        return null;
    }

    public String ADi(C30671cl r2) {
        return null;
    }

    public void AMA(boolean z2) {
    }

    public void AUY(C30671cl r1) {
    }

    public boolean AfI() {
        return false;
    }

    public void Ahd(List list) {
        super.Ahd(list);
        C77703wK r0 = this.A07;
        if (r0 != null) {
            r0.A0F(list);
        }
        A1S();
        A1e();
    }
}
