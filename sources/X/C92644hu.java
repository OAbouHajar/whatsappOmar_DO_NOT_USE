package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4hu  reason: invalid class name and case insensitive filesystem */
public final class C92644hu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        float f2 = 0.0f;
        LatLng latLng = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                latLng = AnonymousClass3K4.A0R(parcel, readInt);
            } else if (c2 == 3) {
                f2 = AnonymousClass3K2.A01(parcel, readInt);
            } else if (c2 == 4) {
                C32281fy.A0E(parcel, readInt, 4);
                f3 = parcel.readFloat();
            } else if (c2 != 5) {
                C32281fy.A0C(parcel, readInt);
            } else {
                f4 = AnonymousClass3K2.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new CameraPosition(latLng, f2, f3, f4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new CameraPosition[i2];
    }
}
