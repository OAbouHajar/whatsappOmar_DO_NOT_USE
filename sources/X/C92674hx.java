package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4hx  reason: invalid class name and case insensitive filesystem */
public final class C92674hx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                C32281fy.A0E(parcel, readInt, 8);
                d2 = parcel.readDouble();
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                C32281fy.A0E(parcel, readInt, 8);
                d3 = parcel.readDouble();
            }
        }
        C32281fy.A0B(parcel, A00);
        return new LatLng(d2, d3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new LatLng[i2];
    }
}
