package com.facebook.redex;

import X.AnonymousClass2BO;
import X.AnonymousClass39U;
import X.AnonymousClass3BM;
import X.AnonymousClass3GJ;
import X.AnonymousClass3K4;
import X.C1036752h;
import X.C1036852i;
import X.C1036952j;
import X.C109405Rz;
import X.C18450wi;
import X.C52412dl;
import X.C86074Rc;
import com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.util.Log;
import java.util.Map;

public class IDxCEventShape180S0100000_2_I1 implements C52412dl {
    public Object A00;
    public final int A01;

    public IDxCEventShape180S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQk(Object obj) {
        Object obj2;
        switch (this.A01) {
            case 0:
                C86074Rc r2 = (C86074Rc) this.A00;
                C1036852i r5 = (C1036852i) obj;
                C18450wi.A0H(r5, 1);
                if (C18450wi.A0R(r2.A02, r5.A01)) {
                    switch (r5.A00.ordinal()) {
                        case 0:
                            return;
                        case 1:
                            C109405Rz r22 = r2.A00;
                            String str = r5.A02;
                            IDxECallbackShape390S0100000_2_I1 iDxECallbackShape390S0100000_2_I1 = (IDxECallbackShape390S0100000_2_I1) r22;
                            switch (iDxECallbackShape390S0100000_2_I1.A01) {
                                case 0:
                                case 1:
                                    obj2 = iDxECallbackShape390S0100000_2_I1.A00;
                                    break;
                                default:
                                    if (C18450wi.A0R(str, "send_fds_iq")) {
                                        IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) iDxECallbackShape390S0100000_2_I1.A00;
                                        indiaUpiFcsPinHandlerActivity.Ac1();
                                        IndiaUpiFcsPinHandlerActivity.A0A(indiaUpiFcsPinHandlerActivity);
                                        return;
                                    }
                                    return;
                            }
                        default:
                            C109405Rz r3 = r2.A00;
                            String str2 = r5.A02;
                            Map map = r5.A03;
                            IDxECallbackShape390S0100000_2_I1 iDxECallbackShape390S0100000_2_I12 = (IDxECallbackShape390S0100000_2_I1) r3;
                            switch (iDxECallbackShape390S0100000_2_I12.A01) {
                                case 0:
                                    break;
                                case 1:
                                    Log.e(C18450wi.A06(new AnonymousClass2BO(IDxECallbackShape390S0100000_2_I1.class).AG5(), ": native_upi_consumer_onboarding resource failed."));
                                    break;
                                default:
                                    if (C18450wi.A0R(str2, "send_fds_iq")) {
                                        IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity2 = (IndiaUpiFcsPinHandlerActivity) iDxECallbackShape390S0100000_2_I12.A00;
                                        indiaUpiFcsPinHandlerActivity2.Ac1();
                                        IndiaUpiFcsPinHandlerActivity.A0T(indiaUpiFcsPinHandlerActivity2, map);
                                        return;
                                    }
                                    return;
                            }
                            obj2 = iDxECallbackShape390S0100000_2_I12.A00;
                            break;
                    }
                    AnonymousClass3K4.A0y(obj2);
                    return;
                }
                return;
            case 1:
                C18450wi.A0H(obj, 1);
                ((AnonymousClass3BM) this.A00).A02 = true;
                return;
            case 2:
                ((AnonymousClass39U) this.A00).A00.A5f();
                return;
            case 3:
                AnonymousClass3GJ.A00((C1036852i) obj, (P2mLiteOrderDetailsActivity) this.A00);
                return;
            case 4:
                AnonymousClass3GJ.A01((C1036752h) obj, (P2mLiteOrderDetailsActivity) this.A00);
                return;
            default:
                AnonymousClass3GJ.A02((C1036952j) obj, (P2mLiteOrderDetailsActivity) this.A00);
                return;
        }
    }
}
