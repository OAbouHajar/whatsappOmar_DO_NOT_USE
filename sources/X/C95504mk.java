package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LocationPicker;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.4mk  reason: invalid class name and case insensitive filesystem */
public class C95504mk implements C12770kw {
    public final View A00;
    public final /* synthetic */ LocationPicker A01;

    public C95504mk(LocationPicker locationPicker) {
        this.A01 = locationPicker;
        this.A00 = C13680ns.A0H(locationPicker.getLayoutInflater(), (ViewGroup) null, R.layout.layout0497);
    }

    public View ACl(AnonymousClass0IS r6) {
        View view = this.A00;
        TextView A0M = C13680ns.A0M(view, R.id.place_name);
        TextView A0M2 = C13680ns.A0M(view, R.id.place_address);
        Object obj = r6.A0K;
        if (obj instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) obj;
            A0M.setText(placeInfo.A06);
            A0M2.setText(placeInfo.A0B);
        }
        return view;
    }
}
