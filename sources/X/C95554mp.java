package X;

import com.obwhatsapp.location.LocationPicker;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.4mp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95554mp implements C12820l1 {
    public final /* synthetic */ LocationPicker A00;

    public /* synthetic */ C95554mp(LocationPicker locationPicker) {
        this.A00 = locationPicker;
    }

    public final boolean ATL(AnonymousClass0IS r4) {
        Object obj;
        LocationPicker locationPicker = this.A00;
        AnonymousClass29S r1 = locationPicker.A0N;
        if (r1.A0v) {
            return true;
        }
        PlaceInfo placeInfo = r1.A0g;
        if (!(placeInfo == null || (obj = placeInfo.A0D) == null)) {
            AnonymousClass0IS r12 = (AnonymousClass0IS) obj;
            r12.A0I(locationPicker.A05);
            r12.A0E();
        }
        r4.A0I(locationPicker.A06);
        locationPicker.A0N.A0T(r4);
        locationPicker.A0N.A0B.setVisibility(8);
        locationPicker.A0N.A0E.setVisibility(8);
        if (!locationPicker.A0N.A0p && locationPicker.A0F.A05()) {
            return true;
        }
        r4.A0F();
        return true;
    }
}
