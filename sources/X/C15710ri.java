package X;

import android.location.Location;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.AbstractList;

/* renamed from: X.0ri  reason: invalid class name and case insensitive filesystem */
public abstract class C15710ri implements SafeParcelable {
    public static LatLng A00(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static LatLng A01(AnonymousClass26B r5) {
        Double d2 = r5.A03;
        AnonymousClass00B.A06(d2);
        double doubleValue = d2.doubleValue();
        Double d3 = r5.A04;
        AnonymousClass00B.A06(d3);
        return new LatLng(doubleValue, d3.doubleValue());
    }

    public static LatLng A02(AbstractList abstractList) {
        return new LatLng(((Number) abstractList.get(0)).doubleValue(), ((Number) abstractList.get(1)).doubleValue());
    }

    public final int describeContents() {
        return 0;
    }
}
