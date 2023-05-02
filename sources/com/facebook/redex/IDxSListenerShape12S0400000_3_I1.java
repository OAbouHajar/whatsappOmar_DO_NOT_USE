package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass175;
import X.AnonymousClass1Z7;
import X.AnonymousClass2HF;
import X.AnonymousClass2HJ;
import X.AnonymousClass5x7;
import X.AnonymousClass638;
import X.AnonymousClass68T;
import X.AnonymousClass68Y;
import X.C110115dX;
import X.C111805hR;
import X.C112275iE;
import X.C112855jo;
import X.C35391lr;
import X.C35521m4;
import X.C39841t9;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class IDxSListenerShape12S0400000_3_I1 implements AnonymousClass2HF {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxSListenerShape12S0400000_3_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
    }

    public final void AMM(List list) {
        switch (this.A04) {
            case 0:
                IDxNCallbackShape21S0200000_3_I1 iDxNCallbackShape21S0200000_3_I1 = (IDxNCallbackShape21S0200000_3_I1) this.A00;
                C111805hR r0 = (C111805hR) this.A01;
                C35521m4 r4 = (C35521m4) this.A02;
                AnonymousClass68Y r3 = (AnonymousClass68Y) this.A03;
                if (r0 != null && !C39841t9.A03(r0.A09)) {
                    AnonymousClass175 r1 = ((C112275iE) iDxNCallbackShape21S0200000_3_I1.A00).A08;
                    r1.A08(r1.A01("add_bank"));
                }
                C112275iE r2 = (C112275iE) iDxNCallbackShape21S0200000_3_I1.A00;
                AnonymousClass68T r12 = r2.A01;
                if (r12 != null && r4 != null) {
                    r12.AVw(r4, (AnonymousClass2HJ) null);
                    C111805hR r02 = (C111805hR) r4.A08;
                    if (r02 != null && AnonymousClass000.A1X(r02.A05.A00)) {
                        AnonymousClass175 r13 = r2.A08;
                        r13.A08(r13.A01("2fa"));
                        IDxECallbackShape391S0100000_3_I1 iDxECallbackShape391S0100000_3_I1 = (IDxECallbackShape391S0100000_3_I1) r3;
                        int i2 = iDxECallbackShape391S0100000_3_I1.A01;
                        Object obj = iDxECallbackShape391S0100000_3_I1.A00;
                        if (2 - i2 != 0) {
                            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) obj;
                            indiaUpiBankAccountPickerActivity.A0N.A00(indiaUpiBankAccountPickerActivity);
                            return;
                        }
                        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) obj;
                        indiaUpiDeviceBindStepActivity.A0N.A00(indiaUpiDeviceBindStepActivity);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Map map = (Map) this.A02;
                ((BrazilPayBloksActivity) this.A00).A3F((C35391lr) this.A01, (String) null, map);
                ((AnonymousClass1Z7) this.A03).A01("on_success", map);
                return;
            default:
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
                AbstractList abstractList = (AbstractList) this.A01;
                AnonymousClass1Z7 r42 = (AnonymousClass1Z7) this.A02;
                Map map2 = (Map) this.A03;
                int A002 = C110115dX.A00(brazilPayBloksActivity, abstractList);
                JSONArray A022 = brazilPayBloksActivity.A07.A02(abstractList);
                if (AnonymousClass5x7.A01(abstractList)) {
                    C112855jo.A09(r42, (Map) null, -233);
                    return;
                }
                if (A022 != null) {
                    int A0A = BrazilPayBloksActivity.A0A(abstractList);
                    map2.put("default_selected_position", String.valueOf(A0A));
                    if (brazilPayBloksActivity.A0C.A0C(A002) && A0A != -1) {
                        BrazilPayBloksActivity.A0T((AnonymousClass638) abstractList.get(A0A), map2);
                    }
                    map2.put("verify_methods", A022.toString());
                }
                r42.A01("on_success", map2);
                return;
        }
    }
}
