package com.facebook.redex;

import X.AnonymousClass074;
import X.C05140Pl;
import X.C12830l2;
import X.C55562jx;
import X.C62453Dp;
import X.C62463Dq;
import X.C87594Xo;
import X.C95534mn;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity;

public class IDxRCallbackShape295S0100000_2_I0 implements C12830l2 {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape295S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ATJ(AnonymousClass074 r5) {
        switch (this.A01) {
            case 0:
                BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
                businessDirectoryMapViewActivity.A06 = r5;
                r5.A07(C87594Xo.A00(businessDirectoryMapViewActivity, 54.0f), 0, 0);
                r5.A0D(businessDirectoryMapViewActivity.A3C());
                C05140Pl r0 = r5.A0T;
                if (r0 != null) {
                    r0.A01 = false;
                    r0.A00();
                }
                AnonymousClass074 r2 = businessDirectoryMapViewActivity.A06;
                if (r2 != null) {
                    r2.A09 = new C95534mn(r2, businessDirectoryMapViewActivity);
                    C62453Dp r1 = new C62453Dp(r2, businessDirectoryMapViewActivity);
                    r2.A0C = r1;
                    if (r2.A0R.A0V) {
                        r1.ATI();
                        r2.A0C = null;
                    }
                    r2.A0B = new IDxCListenerShape329S0100000_2_I1(businessDirectoryMapViewActivity, 0);
                    r2.A0D = new C62463Dq(businessDirectoryMapViewActivity);
                    return;
                }
                return;
            case 1:
                C55562jx r12 = (C55562jx) this.A00;
                if (r12.A06 == null) {
                    r12.A06 = r5;
                    r12.setLocationMode(r12.A02);
                    return;
                }
                return;
            default:
                GroupChatLiveLocationsActivity.A03(r5, (GroupChatLiveLocationsActivity) this.A00);
                return;
        }
    }
}
