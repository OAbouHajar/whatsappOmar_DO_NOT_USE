package X;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.obwhatsapp.R;

/* renamed from: X.463  reason: invalid class name */
public class AnonymousClass463 {
    public static String A00(Context context, Address address, float f2) {
        String thoroughfare = address.getThoroughfare();
        if (((double) f2) <= 200.0d && !TextUtils.isEmpty(thoroughfare)) {
            String subThoroughfare = address.getSubThoroughfare();
            if (TextUtils.isEmpty(subThoroughfare)) {
                return thoroughfare;
            }
            Object[] A1Z = C13690nt.A1Z();
            AnonymousClass000.A1E(thoroughfare, subThoroughfare, A1Z);
            return context.getString(R.string.str1c09, A1Z);
        } else if (!TextUtils.isEmpty(address.getSubLocality())) {
            return address.getSubLocality();
        } else {
            if (!TextUtils.isEmpty(address.getLocality())) {
                return address.getLocality();
            }
            if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                return address.getSubAdminArea();
            }
            return null;
        }
    }
}
