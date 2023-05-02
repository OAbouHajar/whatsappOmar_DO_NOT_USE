package com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass07M;
import X.AnonymousClass09N;
import X.AnonymousClass1IC;
import X.AnonymousClass1IE;
import X.AnonymousClass1VZ;
import X.AnonymousClass1Z8;
import X.AnonymousClass4QN;
import X.AnonymousClass5kF;
import X.C011105i;
import X.C109405Rz;
import X.C13680ns;
import X.C17850vk;
import X.C17950vu;
import X.C18450wi;
import X.C20180zd;
import X.C50992an;
import X.C51002ao;
import X.C86074Rc;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxECallbackShape390S0100000_2_I1;
import com.facebook.redex.IDxRCallbackShape215S0100000_2_I1;

public final class IndiaUpiFcsAddPaymentMethodActivity extends AnonymousClass5kF {
    public C50992an A00;
    public C51002ao A01;
    public AnonymousClass4QN A02;
    public C86074Rc A03;
    public C17850vk A04;
    public String A05;
    public final C109405Rz A06 = new IDxECallbackShape390S0100000_2_I1(this, 0);

    public static /* synthetic */ void A02(IndiaUpiFcsAddPaymentMethodActivity indiaUpiFcsAddPaymentMethodActivity) {
        String str;
        AnonymousClass1IE r2;
        AnonymousClass1VZ r1;
        C17850vk r12 = indiaUpiFcsAddPaymentMethodActivity.A04;
        if (r12 != null) {
            String str2 = indiaUpiFcsAddPaymentMethodActivity.A05;
            AnonymousClass1IC r22 = null;
            if (str2 == null) {
                str = "fdsManagerId";
            } else {
                C17950vu A002 = r12.A00(str2);
                if (!(A002 == null || (r1 = A002.A00) == null)) {
                    r22 = r1.A02("native_upi_add_payment_method");
                }
                if ((r22 instanceof AnonymousClass1IE) && (r2 = (AnonymousClass1IE) r22) != null) {
                    r2.A93(AnonymousClass1Z8.A00);
                }
                indiaUpiFcsAddPaymentMethodActivity.finish();
                return;
            }
        } else {
            str = "fdsManagerRegistry";
        }
        throw C18450wi.A03(str);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass4QN r0 = new AnonymousClass4QN(this);
            this.A02 = r0;
            if (r0.A00(bundle)) {
                String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
                C18450wi.A0F(stringExtra);
                C18450wi.A0B(stringExtra);
                this.A05 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_fcs_observer_id");
                C18450wi.A0F(stringExtra2);
                C18450wi.A0B(stringExtra2);
                C51002ao r02 = this.A01;
                if (r02 != null) {
                    C86074Rc r03 = new C86074Rc(this.A06, (C20180zd) r02.A00.A03.APJ.get(), stringExtra2, "native_upi_add_payment_method");
                    this.A03 = r03;
                    r03.A00();
                    C011105i A0O = A0O(new IDxRCallbackShape215S0100000_2_I1(this, 7), new AnonymousClass07M());
                    boolean z2 = !this.A0I.A0C();
                    boolean A0C = this.A0I.A0C();
                    Intent A09 = C13680ns.A09();
                    A09.setClassName(getPackageName(), "com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity");
                    A09.putExtra("extra_payments_entry_type", 6);
                    A09.putExtra("extra_is_first_payment_method", z2);
                    A09.putExtra("extra_skip_value_props_display", A0C);
                    A0O.A00((AnonymousClass09N) null, A09);
                    return;
                }
                str = "fcsResourceExecutionCallbackHandlerFactory";
            } else {
                return;
            }
        } else {
            str = "fcsActivityLifecycleManagerFactory";
        }
        throw C18450wi.A03(str);
    }
}
