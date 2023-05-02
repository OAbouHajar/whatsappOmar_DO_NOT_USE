package X;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LocationPicker2;

/* renamed from: X.3uU  reason: invalid class name and case insensitive filesystem */
public class C76663uU extends C55582jz {
    public final /* synthetic */ LocationPicker2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76663uU(Context context, GoogleMapOptions googleMapOptions, LocationPicker2 locationPicker2) {
        super(context, googleMapOptions);
        this.A00 = locationPicker2;
    }

    public void A0A(int i2) {
        LocationPicker2 locationPicker2;
        ImageView imageView;
        int i3;
        if (i2 != 0) {
            locationPicker2 = this.A00;
            imageView = locationPicker2.A0T.A0T;
            if (i2 != 1) {
                i3 = R.drawable.btn_myl;
            } else {
                imageView.setImageResource(R.drawable.btn_myl_active);
                locationPicker2.A0T.A0u = true;
                return;
            }
        } else {
            locationPicker2 = this.A00;
            imageView = locationPicker2.A0T.A0T;
            i3 = R.drawable.btn_compass_mode_tilt;
        }
        imageView.setImageResource(i3);
        locationPicker2.A0T.A0u = false;
    }
}
