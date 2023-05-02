package com.facebook.redex;

import X.AnonymousClass074;
import X.AnonymousClass077;
import X.AnonymousClass0YG;
import X.AnonymousClass269;
import X.C06540Wn;
import X.C18450wi;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

public class IDxCCallbackShape282S0100000_2_I1 implements AnonymousClass077 {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape282S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AO4() {
        if (this.A01 == 0) {
            BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
            AnonymousClass269 r2 = businessDirectoryMapViewActivity.A0M;
            if (r2 == null) {
                throw C18450wi.A03("viewModel");
            }
            AnonymousClass074 r0 = businessDirectoryMapViewActivity.A06;
            C18450wi.A0F(r0);
            AnonymousClass0YG A02 = r0.A02();
            AnonymousClass074 r02 = businessDirectoryMapViewActivity.A06;
            C18450wi.A0F(r02);
            C06540Wn r03 = r02.A0S;
            C18450wi.A0B(r03);
            r2.A0B(r03, A02);
        }
    }

    public void ARM() {
        if (this.A01 == 0) {
            BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
            AnonymousClass269 r2 = businessDirectoryMapViewActivity.A0M;
            if (r2 == null) {
                throw C18450wi.A03("viewModel");
            }
            AnonymousClass074 r0 = businessDirectoryMapViewActivity.A06;
            C18450wi.A0F(r0);
            AnonymousClass0YG A02 = r0.A02();
            AnonymousClass074 r02 = businessDirectoryMapViewActivity.A06;
            C18450wi.A0F(r02);
            C06540Wn r03 = r02.A0S;
            C18450wi.A0B(r03);
            r2.A0B(r03, A02);
        }
    }
}
