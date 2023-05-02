package X;

import com.facebook.redex.IDxBCreatorShape47S0000000_I1;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import com.obwhatsapp.location.WaMapView;

/* renamed from: X.4mq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95564mq implements C12830l2 {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C95564mq(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }

    public final void ATJ(AnonymousClass074 r9) {
        C04660Nk A02;
        LatLng latLng = this.A00;
        String str = this.A01;
        if (WaMapView.A02 == null) {
            if (AnonymousClass0Wt.A02 == null) {
                A02 = null;
            } else {
                A02 = AnonymousClass0Wt.A02(new IDxBCreatorShape47S0000000_I1(1), C13680ns.A0c(R.drawable.ic_map_pin, "resource_"));
            }
            WaMapView.A02 = A02;
        }
        AnonymousClass0UE r5 = new AnonymousClass0UE();
        r5.A01 = new AnonymousClass020(latLng.A00, latLng.A01);
        r5.A00 = WaMapView.A02;
        r5.A03 = str;
        r9.A05();
        r9.A03(r5);
    }
}
