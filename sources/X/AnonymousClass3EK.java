package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LocationPicker2;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.3EK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EK implements AnonymousClass5OB {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ AnonymousClass3EK(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    public final void AO3(int i2) {
        LocationPicker2 locationPicker2 = this.A00;
        if (i2 == 1) {
            AnonymousClass29S r1 = locationPicker2.A0T;
            if (r1.A0v) {
                r1.A0T.setImageResource(R.drawable.btn_myl);
                locationPicker2.A0T.A0u = false;
            } else {
                PlaceInfo placeInfo = r1.A0g;
                if (placeInfo != null) {
                    Object obj = placeInfo.A0D;
                    if (obj != null) {
                        C32451gN r12 = (C32451gN) obj;
                        r12.A05(locationPicker2.A04);
                        r12.A03();
                    }
                    AnonymousClass29S r13 = locationPicker2.A0T;
                    r13.A0g = null;
                    r13.A0B();
                }
                AnonymousClass29S r14 = locationPicker2.A0T;
                if (r14.A0p) {
                    r14.A0C.setVisibility(0);
                    locationPicker2.A0T.A0D.startAnimation(C13680ns.A0I(locationPicker2.A0T.A0C.getHeight()));
                    locationPicker2.A0T.A0E.setVisibility(0);
                    locationPicker2.A0T.A0B.setVisibility(8);
                }
            }
        }
        AnonymousClass29S r15 = locationPicker2.A0T;
        if (r15.A0u) {
            r15.A0B.setVisibility(8);
        }
        View findViewById = locationPicker2.findViewById(R.id.map_center_address);
        View findViewById2 = locationPicker2.findViewById(R.id.location_description);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (findViewById2 != null && locationPicker2.A0T.A0p) {
            findViewById2.setVisibility(8);
        }
    }
}
