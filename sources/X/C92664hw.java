package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.4hw  reason: invalid class name and case insensitive filesystem */
public final class C92664hw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                latLng = AnonymousClass3K4.A0R(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                latLng2 = AnonymousClass3K4.A0R(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new LatLngBounds[i2];
    }
}
