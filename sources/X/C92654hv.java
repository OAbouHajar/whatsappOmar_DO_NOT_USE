package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.4hv  reason: invalid class name and case insensitive filesystem */
public final class C92654hv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d2 = 0.0d;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = AnonymousClass3K4.A0R(parcel, readInt);
                    break;
                case 3:
                    C32281fy.A0E(parcel, readInt, 8);
                    d2 = parcel.readDouble();
                    break;
                case 4:
                    f2 = AnonymousClass3K2.A01(parcel, readInt);
                    break;
                case 5:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 6:
                    i3 = C32281fy.A01(parcel, readInt);
                    break;
                case 7:
                    f3 = AnonymousClass3K2.A01(parcel, readInt);
                    break;
                case 8:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 9:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 10:
                    arrayList = C32281fy.A0A(parcel, C66023Xm.CREATOR, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y0(latLng, arrayList, d2, f2, f3, i2, i3, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y0[i2];
    }
}
