package com.facebook.redex;

import X.AnonymousClass291;
import X.AnonymousClass29W;
import X.AnonymousClass4I5;
import X.AnonymousClass5OD;
import X.C32451gN;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;
import java.util.List;

public class IDxCListenerShape368S0100000_2_I0 implements AnonymousClass5OD {
    public Object A00;
    public final int A01;

    public IDxCListenerShape368S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ATH(LatLng latLng) {
        if (this.A01 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            AnonymousClass291 r1 = groupChatLiveLocationsActivity2.A0N;
            if (r1.A0l != null) {
                r1.A0B();
                return;
            }
            AnonymousClass29W A07 = r1.A07(latLng);
            if (A07 != null) {
                List list = A07.A04;
                if (list.size() == 1) {
                    groupChatLiveLocationsActivity2.A0N.A0R(A07, true);
                    ((C32451gN) groupChatLiveLocationsActivity2.A0T.get(A07.A03)).A04();
                } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                    groupChatLiveLocationsActivity2.A0N.A0R(A07, true);
                } else {
                    groupChatLiveLocationsActivity2.A37(list, true);
                    groupChatLiveLocationsActivity2.A0N.A0j = new AnonymousClass4I5(list, groupChatLiveLocationsActivity2.A06.A02().A02);
                }
            }
        } else {
            ((DirectorySetLocationMapActivity) this.A00).A09.A03.setVisibility(0);
        }
    }
}
