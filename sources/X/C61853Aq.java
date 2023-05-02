package X;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Aq  reason: invalid class name and case insensitive filesystem */
public class C61853Aq {
    public static float A00(LatLng latLng, LatLng latLng2) {
        Location location = new Location("origin");
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        Location location2 = new Location("destination");
        location2.setLatitude(latLng2.A00);
        location2.setLongitude(latLng2.A01);
        return location.distanceTo(location2);
    }

    public static String A01(Context context, int i2) {
        int i3 = R.string.str02eb;
        if (i2 != 0) {
            i3 = R.string.str02f6;
            if (i2 != 1) {
                i3 = R.string.str02ec;
                if (i2 != 2) {
                    return null;
                }
            }
        }
        return context.getString(i3);
    }

    public static void A02(AnonymousClass26B r7, List list) {
        if (!r7.A08.equals("country_default")) {
            Double d2 = r7.A03;
            AnonymousClass00B.A06(d2);
            double doubleValue = d2.doubleValue();
            Double d3 = r7.A04;
            AnonymousClass00B.A06(d3);
            double doubleValue2 = d3.doubleValue();
            Location location = new Location("");
            location.setLatitude(doubleValue);
            location.setLongitude(doubleValue2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1US) it.next()).A03(location);
            }
        }
    }
}
