package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass10F;
import X.AnonymousClass2T8;
import X.C14580pQ;
import X.C14810pn;
import X.C37861pr;
import com.obwhatsapp.HomeActivity;
import java.util.List;

public class IDxDListenerShape358S0100000_2_I0 implements C14810pn {
    public Object A00;
    public final int A01;

    public IDxDListenerShape358S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean AMG() {
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                AnonymousClass10F r2 = homeActivity.A02;
                int i2 = homeActivity.A03;
                String str = i2 != 100 ? i2 != 300 ? i2 != 400 ? i2 != 500 ? i2 != 600 ? i2 != 700 ? "chat" : "biz_tools" : "community" : "business_home" : "calls" : "status" : "camera";
                if (r2.A03 != null && r2.A0G.A0C(1807)) {
                    r2.A03.A0A("tabs", str, true);
                }
                homeActivity.A02.A00();
                return false;
            case 1:
                ((C14580pQ) this.A00).A1x();
                return true;
            default:
                AnonymousClass2T8 r5 = (AnonymousClass2T8) this.A00;
                AnonymousClass00B.A01();
                if (r5.A01) {
                    return true;
                }
                r5.A01 = true;
                List<C37861pr> list = r5.A03;
                for (C37861pr AMH : list) {
                    AMH.AMH(r5.A00);
                }
                list.clear();
                return true;
        }
    }
}
