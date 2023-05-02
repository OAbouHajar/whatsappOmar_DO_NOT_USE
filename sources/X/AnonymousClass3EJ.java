package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.LocationPicker2;

/* renamed from: X.3EJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EJ implements AnonymousClass5OA {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ AnonymousClass3EJ(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    public final void AO1() {
        LatLng latLng;
        LocationPicker2 locationPicker2 = this.A00;
        if (locationPicker2.A0T.A0C.getVisibility() == 0) {
            locationPicker2.A0T.A0C.setVisibility(8);
            locationPicker2.A0T.A0D.startAnimation(C13680ns.A0I(-locationPicker2.A0T.A0C.getHeight()));
        }
        AnonymousClass2NT r0 = locationPicker2.A02;
        AnonymousClass00B.A06(r0);
        CameraPosition A02 = r0.A02();
        if (A02 != null && (latLng = A02.A03) != null) {
            locationPicker2.A0T.A0G(latLng.A00, latLng.A01);
        }
    }
}
