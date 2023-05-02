package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.4i1  reason: invalid class name and case insensitive filesystem */
public final class C92714i1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        LatLngBounds latLngBounds = null;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                latLng = AnonymousClass3K4.A0R(parcel, readInt);
            } else if (c2 == 3) {
                latLng2 = AnonymousClass3K4.A0R(parcel, readInt);
            } else if (c2 == 4) {
                latLng3 = AnonymousClass3K4.A0R(parcel, readInt);
            } else if (c2 == 5) {
                latLng4 = AnonymousClass3K4.A0R(parcel, readInt);
            } else if (c2 != 6) {
                C32281fy.A0C(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) C32281fy.A06(parcel, LatLngBounds.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66063Xq(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C66063Xq[i2];
    }
}
