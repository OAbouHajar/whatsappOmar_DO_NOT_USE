package com.facebook.redex;

import X.AnonymousClass020;
import X.AnonymousClass0IS;
import X.AnonymousClass269;
import X.AnonymousClass29S;
import X.C12800kz;
import X.C18450wi;
import X.C59862z9;
import X.C72223ll;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.obwhatsapp.location.LocationPicker;
import com.obwhatsapp.location.PlaceInfo;

public class IDxCListenerShape329S0100000_2_I1 implements C12800kz {
    public Object A00;
    public final int A01;

    public IDxCListenerShape329S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ATG(AnonymousClass020 r4) {
        switch (this.A01) {
            case 0:
                AnonymousClass269 r1 = ((BusinessDirectoryMapViewActivity) this.A00).A0M;
                if (r1 == null) {
                    throw C18450wi.A03("viewModel");
                }
                r1.A0D(r1.A07);
                r1.A0F(r1.A08);
                return;
            case 1:
                C72223ll r0 = ((C59862z9) this.A00).A01;
                if (r0 != null) {
                    r0.A02.AIT();
                    return;
                }
                return;
            default:
                LocationPicker locationPicker = (LocationPicker) this.A00;
                PlaceInfo placeInfo = locationPicker.A0N.A0g;
                if (placeInfo != null) {
                    Object obj = placeInfo.A0D;
                    if (obj != null) {
                        ((AnonymousClass0IS) obj).A0I(locationPicker.A05);
                    }
                    AnonymousClass29S r12 = locationPicker.A0N;
                    r12.A0g = null;
                    r12.A0B();
                }
                AnonymousClass29S r13 = locationPicker.A0N;
                if (r13.A0p) {
                    r13.A0E.setVisibility(0);
                }
                locationPicker.A0N.A0B.setVisibility(8);
                return;
        }
    }
}
