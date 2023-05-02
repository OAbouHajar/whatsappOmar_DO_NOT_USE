package X;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.WaMapView;

/* renamed from: X.32i  reason: invalid class name and case insensitive filesystem */
public class C604732i extends WaMapView {
    public C86324Se A00;
    public Integer A01;

    public C604732i(Context context) {
        super(context);
    }

    public void A01(LatLng latLng, C58002sK r3, AnonymousClass1P7 r4) {
        this.A01 = null;
        super.A01(latLng, r3, r4);
    }

    public void A02(AnonymousClass1P7 r2, C38841rV r3, boolean z2) {
        this.A01 = null;
        super.A02(r2, r3, z2);
    }

    public void A03(AnonymousClass1P7 r2, C38751rM r3) {
        this.A01 = null;
        super.A03(r2, r3);
    }

    public void A04(LatLng latLng, AnonymousClass1P7 r3, Integer num) {
        this.A01 = num;
        super.A01(latLng, (C58002sK) null, r3);
    }

    public void setupGoogleMap(AnonymousClass2S6 r2, LatLng latLng, C58002sK r4) {
        r2.A06(new AnonymousClass3EO(r2, latLng, r4, this));
    }
}
