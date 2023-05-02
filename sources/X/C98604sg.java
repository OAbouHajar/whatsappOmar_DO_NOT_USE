package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LocationPicker2;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.4sg  reason: invalid class name and case insensitive filesystem */
public class C98604sg implements AnonymousClass5O9 {
    public final View A00;
    public final /* synthetic */ LocationPicker2 A01;

    public C98604sg(LocationPicker2 locationPicker2) {
        this.A01 = locationPicker2;
        this.A00 = C13680ns.A0H(locationPicker2.getLayoutInflater(), (ViewGroup) null, R.layout.layout0497);
    }

    public View ACm(C32451gN r6) {
        View view = this.A00;
        TextView A0M = C13680ns.A0M(view, R.id.place_name);
        TextView A0M2 = C13680ns.A0M(view, R.id.place_address);
        if (r6.A01() instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) r6.A01();
            A0M.setText(placeInfo.A06);
            A0M2.setText(placeInfo.A0B);
        }
        return view;
    }
}
