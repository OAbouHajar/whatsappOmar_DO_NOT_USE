package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import com.obwhatsapp.location.WaMapView;

/* renamed from: X.4sp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98694sp implements AnonymousClass5OF {
    public final /* synthetic */ AnonymousClass2S6 A00;
    public final /* synthetic */ LatLng A01;
    public final /* synthetic */ C58002sK A02;
    public final /* synthetic */ WaMapView A03;

    public /* synthetic */ C98694sp(AnonymousClass2S6 r1, LatLng latLng, C58002sK r3, WaMapView waMapView) {
        this.A03 = waMapView;
        this.A02 = r3;
        this.A01 = latLng;
        this.A00 = r1;
    }

    public final void ATK(AnonymousClass2NT r7) {
        WaMapView waMapView = this.A03;
        C58002sK r2 = this.A02;
        LatLng latLng = this.A01;
        AnonymousClass2S6 r4 = this.A00;
        C58002sK A032 = C434920f.A09(waMapView.getContext()) ? C58002sK.A03(waMapView.getContext(), R.raw.night_map_style_json) : null;
        if (r2 == null) {
            r2 = A032;
        }
        r7.A0J(r2);
        int dimensionPixelSize = waMapView.getResources().getDimensionPixelSize(R.dimen.dimen050c);
        r7.A08(0, dimensionPixelSize << 1, dimensionPixelSize, dimensionPixelSize);
        C13710nw.A02(latLng, "location must not be null.");
        r7.A0A(AnonymousClass2R8.A00(new CameraPosition(latLng, 15.0f, 0.0f, 0.0f)));
        AnonymousClass00B.A04(r4);
        r4.setVisibility(0);
    }
}
