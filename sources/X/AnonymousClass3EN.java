package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import com.obwhatsapp.location.WaMapView;

/* renamed from: X.3EN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EN implements AnonymousClass5OF {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3EN(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }

    public final void ATK(AnonymousClass2NT r6) {
        LatLng latLng = this.A00;
        String str = this.A01;
        AnonymousClass4C4 r1 = WaMapView.A03;
        if (r1 == null) {
            try {
                C109875Tz r2 = AnonymousClass491.A00;
                C13710nw.A02(r2, "IBitmapDescriptorFactory is not initialized");
                C31361e1 r22 = (C31361e1) r2;
                Parcel A012 = r22.A01();
                A012.writeInt(R.drawable.ic_map_pin);
                r1 = new AnonymousClass4C4(C31361e1.A00(A012, r22, 1));
                WaMapView.A03 = r1;
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            }
        }
        C58012sL r0 = new C58012sL();
        r0.A08 = latLng;
        r0.A07 = r1;
        r0.A09 = str;
        r6.A06();
        r6.A03(r0);
    }
}
