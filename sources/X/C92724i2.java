package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.4i2  reason: invalid class name and case insensitive filesystem */
public final class C92724i2 implements Parcelable.Creator {
    public static byte A00(Parcel parcel, int i2) {
        C32281fy.A0E(parcel, i2, 4);
        return (byte) parcel.readInt();
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        CameraPosition cameraPosition = null;
        Float f2 = null;
        Float f3 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i2 = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    b2 = A00(parcel2, readInt);
                    break;
                case 3:
                    b3 = A00(parcel2, readInt);
                    break;
                case 4:
                    i2 = C32281fy.A01(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C32281fy.A06(parcel2, CameraPosition.CREATOR, readInt);
                    break;
                case 6:
                    b4 = A00(parcel2, readInt);
                    break;
                case 7:
                    b5 = A00(parcel2, readInt);
                    break;
                case 8:
                    b6 = A00(parcel2, readInt);
                    break;
                case 9:
                    b7 = A00(parcel2, readInt);
                    break;
                case 10:
                    b8 = A00(parcel2, readInt);
                    break;
                case 11:
                    b9 = A00(parcel2, readInt);
                    break;
                case 12:
                    b10 = A00(parcel2, readInt);
                    break;
                case 14:
                    b11 = A00(parcel2, readInt);
                    break;
                case 15:
                    b12 = A00(parcel2, readInt);
                    break;
                case 16:
                    f2 = C32281fy.A07(parcel2, readInt);
                    break;
                case 17:
                    f3 = C32281fy.A07(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C32281fy.A06(parcel2, LatLngBounds.CREATOR, readInt);
                    break;
                case 19:
                    b13 = A00(parcel2, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel2, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new GoogleMapOptions(cameraPosition, latLngBounds, f2, f3, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new GoogleMapOptions[i2];
    }
}
