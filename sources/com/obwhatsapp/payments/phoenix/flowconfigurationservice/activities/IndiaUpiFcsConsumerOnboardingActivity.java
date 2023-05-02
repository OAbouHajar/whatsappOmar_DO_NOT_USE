package com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass000;
import X.AnonymousClass07M;
import X.AnonymousClass09N;
import X.AnonymousClass1IC;
import X.AnonymousClass1IE;
import X.AnonymousClass1VZ;
import X.AnonymousClass2BO;
import X.AnonymousClass4QN;
import X.AnonymousClass5kG;
import X.C011105i;
import X.C109405Rz;
import X.C13680ns;
import X.C13690nt;
import X.C17850vk;
import X.C17950vu;
import X.C18450wi;
import X.C20180zd;
import X.C25401Jq;
import X.C25411Jr;
import X.C50992an;
import X.C51002ao;
import X.C86074Rc;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxECallbackShape390S0100000_2_I1;
import com.facebook.redex.IDxRCallbackShape215S0100000_2_I1;
import com.whatsapp.util.Log;
import java.util.Map;

public final class IndiaUpiFcsConsumerOnboardingActivity extends AnonymousClass5kG {
    public C50992an A00;
    public C51002ao A01;
    public AnonymousClass4QN A02;
    public C86074Rc A03;
    public C17850vk A04;
    public String A05;
    public final C109405Rz A06 = new IDxECallbackShape390S0100000_2_I1(this, 1);

    public static /* synthetic */ void A02(IndiaUpiFcsConsumerOnboardingActivity indiaUpiFcsConsumerOnboardingActivity) {
        String str;
        AnonymousClass1IE r2;
        AnonymousClass1VZ r1;
        String str2 = indiaUpiFcsConsumerOnboardingActivity.A0I.A0C() ? "success" : "cancelled";
        String str3 = (indiaUpiFcsConsumerOnboardingActivity.A0N.A01() == null || (!indiaUpiFcsConsumerOnboardingActivity.A0I.A0G("tos_no_wallet") && !indiaUpiFcsConsumerOnboardingActivity.A0I.A0G("tos_with_wallet"))) ? "NOT ACCEPTED" : "ACCEPTED";
        C25401Jq[] r22 = new C25401Jq[2];
        C25401Jq.A00("onboarding_status", str2, r22, 0);
        C25401Jq.A00("tos_status", str3, r22, 1);
        Map A052 = C25411Jr.A05(r22);
        C17850vk r12 = indiaUpiFcsConsumerOnboardingActivity.A04;
        if (r12 != null) {
            String str4 = indiaUpiFcsConsumerOnboardingActivity.A05;
            AnonymousClass1IC r23 = null;
            if (str4 == null) {
                str = "fdsManagerId";
            } else {
                C17950vu A002 = r12.A00(str4);
                if (!(A002 == null || (r1 = A002.A00) == null)) {
                    r23 = r1.A02("native_upi_consumer_onboarding");
                }
                if ((r23 instanceof AnonymousClass1IE) && (r2 = (AnonymousClass1IE) r23) != null) {
                    r2.A93(A052);
                }
                indiaUpiFcsConsumerOnboardingActivity.finish();
                return;
            }
        } else {
            str = "fdsManagerRegistry";
        }
        throw C18450wi.A03(str);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String AG5;
        String str2;
        Class<IndiaUpiFcsConsumerOnboardingActivity> cls = IndiaUpiFcsConsumerOnboardingActivity.class;
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass4QN r0 = new AnonymousClass4QN(this);
            this.A02 = r0;
            if (!r0.A00(bundle)) {
                Log.e(C18450wi.A06(new AnonymousClass2BO(cls).AG5(), ": Activity cannot be launch because it is no longer safe to create this activity"));
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
            if (stringExtra == null) {
                AG5 = new AnonymousClass2BO(cls).AG5();
                str2 = ": FDS Manager ID is null";
            } else {
                this.A05 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_fcs_observer_id");
                if (stringExtra2 != null) {
                    boolean booleanExtra = getIntent().getBooleanExtra("extra_onboarding_skip_2fa", true);
                    boolean booleanExtra2 = getIntent().getBooleanExtra("extra_is_full_screen", true);
                    boolean booleanExtra3 = getIntent().getBooleanExtra("extra_skip_value_props_screen", false);
                    C51002ao r02 = this.A01;
                    if (r02 != null) {
                        C86074Rc r03 = new C86074Rc(this.A06, (C20180zd) r02.A00.A03.APJ.get(), stringExtra2, "native_upi_consumer_onboarding");
                        this.A03 = r03;
                        r03.A00();
                        C011105i A0O = A0O(new IDxRCallbackShape215S0100000_2_I1(this, 8), new AnonymousClass07M());
                        int i2 = 11;
                        if (booleanExtra2) {
                            i2 = 9;
                        }
                        int A002 = C13690nt.A00(booleanExtra ? 1 : 0);
                        Intent A09 = C13680ns.A09();
                        A09.setClassName(getPackageName(), "com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
                        A09.putExtra("extra_payments_entry_type", i2);
                        A09.putExtra("extra_setup_mode", A002);
                        A09.putExtra("extra_is_first_payment_method", !this.A0I.A0C());
                        A09.putExtra("extra_skip_value_props_display", booleanExtra3);
                        A0O.A00((AnonymousClass09N) null, A09);
                        return;
                    }
                    str = "fcsResourceExecutionCallbackHandlerFactory";
                } else {
                    AG5 = new AnonymousClass2BO(cls).AG5();
                    str2 = ": Observer ID is null";
                }
            }
            throw AnonymousClass000.A0W(C18450wi.A06(AG5, str2));
        }
        str = "fcsActivityLifecycleManagerFactory";
        throw C18450wi.A03(str);
    }
}
