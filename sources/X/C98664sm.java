package X;

import com.obwhatsapp.location.LocationPicker2;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.4sm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98664sm implements AnonymousClass5OE {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C98664sm(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    public final boolean ATM(C32451gN r4) {
        Object obj;
        LocationPicker2 locationPicker2 = this.A00;
        if (locationPicker2.A0T.A0v) {
            return true;
        }
        if (r4.A02() == null) {
            return false;
        }
        PlaceInfo placeInfo = locationPicker2.A0T.A0g;
        if (!(placeInfo == null || (obj = placeInfo.A0D) == null)) {
            C32451gN r1 = (C32451gN) obj;
            r1.A05(locationPicker2.A04);
            r1.A03();
        }
        r4.A05(locationPicker2.A05);
        locationPicker2.A0T.A0T(r4);
        locationPicker2.A0T.A0B.setVisibility(8);
        locationPicker2.A0T.A0E.setVisibility(8);
        if (!locationPicker2.A0T.A0p && locationPicker2.A0K.A05()) {
            return true;
        }
        r4.A04();
        return true;
    }
}
