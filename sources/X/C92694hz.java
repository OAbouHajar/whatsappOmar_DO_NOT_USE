package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4hz  reason: invalid class name and case insensitive filesystem */
public final class C92694hz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        float f4 = 0.0f;
        float f5 = 0.5f;
        float f6 = 0.0f;
        float f7 = 1.0f;
        float f8 = 0.0f;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = AnonymousClass3K4.A0R(parcel2, readInt);
                    break;
                case 3:
                    str = C32281fy.A08(parcel2, readInt);
                    break;
                case 4:
                    str2 = C32281fy.A08(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C32281fy.A05(parcel2, readInt);
                    break;
                case 6:
                    f2 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 7:
                    f3 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 8:
                    z2 = C32281fy.A0F(parcel2, readInt);
                    break;
                case 9:
                    z3 = C32281fy.A0F(parcel2, readInt);
                    break;
                case 10:
                    z4 = C32281fy.A0F(parcel2, readInt);
                    break;
                case 11:
                    f4 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 12:
                    f5 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 13:
                    f6 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 14:
                    f7 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 15:
                    f8 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel2, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new C58012sL(iBinder, latLng, str, str2, f2, f3, f4, f5, f6, f7, f8, z2, z3, z4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C58012sL[i2];
    }
}
