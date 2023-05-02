package X;

import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.4wD  reason: invalid class name and case insensitive filesystem */
public final class C100794wD implements AnonymousClass5ST {
    public final /* synthetic */ BusinessDirectoryMapViewActivity A00;

    public C100794wD(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        this.A00 = businessDirectoryMapViewActivity;
    }

    public void AT6() {
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.A00;
        AnonymousClass269 r0 = businessDirectoryMapViewActivity.A0M;
        if (r0 == null) {
            throw C18450wi.A03("viewModel");
        }
        r0.A0U.A00(3);
        businessDirectoryMapViewActivity.A35().A03(true);
        businessDirectoryMapViewActivity.A35().A01();
        businessDirectoryMapViewActivity.A38();
    }

    public void AT7() {
    }

    public void AT8() {
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.A00;
        AnonymousClass269 r0 = businessDirectoryMapViewActivity.A0M;
        if (r0 != null) {
            r0.A0U.A00(4);
            AnonymousClass269 r02 = businessDirectoryMapViewActivity.A0M;
            if (r02 != null) {
                r02.A08();
                return;
            }
        }
        throw C18450wi.A03("viewModel");
    }
}
