package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: X.4hq  reason: invalid class name and case insensitive filesystem */
public final class C92604hq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        List list = C57992sJ.A0B;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = Long.MAX_VALUE;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            char c2 = (char) readInt;
            if (c2 != 1) {
                switch (c2) {
                    case 5:
                        list = C32281fy.A0A(parcel2, C66013Xl.CREATOR, readInt);
                        break;
                    case 6:
                        str = C32281fy.A08(parcel2, readInt);
                        break;
                    case 7:
                        z2 = C32281fy.A0F(parcel2, readInt);
                        break;
                    case 8:
                        z3 = C32281fy.A0F(parcel2, readInt);
                        break;
                    case 9:
                        z4 = C32281fy.A0F(parcel2, readInt);
                        break;
                    case 10:
                        str2 = C32281fy.A08(parcel2, readInt);
                        break;
                    case 11:
                        z5 = C32281fy.A0F(parcel2, readInt);
                        break;
                    case 12:
                        z6 = C32281fy.A0F(parcel2, readInt);
                        break;
                    case 13:
                        str3 = C32281fy.A08(parcel2, readInt);
                        break;
                    case 14:
                        j2 = C32281fy.A03(parcel2, readInt);
                        break;
                    default:
                        C32281fy.A0C(parcel2, readInt);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C32281fy.A06(parcel2, LocationRequest.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new C57992sJ(locationRequest, str, str2, str3, list, j2, z2, z3, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C57992sJ[i2];
    }
}
