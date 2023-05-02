package X;

import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.WaMapView;

/* renamed from: X.4so  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98684so implements AnonymousClass5OF {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ C58002sK A01;
    public final /* synthetic */ WaMapView A02;

    public /* synthetic */ C98684so(LatLng latLng, C58002sK r2, WaMapView waMapView) {
        this.A02 = waMapView;
        this.A00 = latLng;
        this.A01 = r2;
    }

    public final void ATK(AnonymousClass2NT r5) {
        WaMapView waMapView = this.A02;
        waMapView.setupGoogleMap(waMapView.A01, this.A00, this.A01);
    }
}
