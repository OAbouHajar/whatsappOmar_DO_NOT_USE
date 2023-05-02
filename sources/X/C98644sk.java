package X;

import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.LocationPicker2;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.4sk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98644sk implements AnonymousClass5OD {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C98644sk(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    public final void ATH(LatLng latLng) {
        LocationPicker2 locationPicker2 = this.A00;
        PlaceInfo placeInfo = locationPicker2.A0T.A0g;
        if (placeInfo != null) {
            Object obj = placeInfo.A0D;
            if (obj != null) {
                ((C32451gN) obj).A05(locationPicker2.A04);
            }
            AnonymousClass29S r1 = locationPicker2.A0T;
            r1.A0g = null;
            r1.A0B();
        }
        AnonymousClass29S r12 = locationPicker2.A0T;
        if (r12.A0p) {
            r12.A0E.setVisibility(0);
        }
        locationPicker2.A0T.A0B.setVisibility(8);
    }
}
