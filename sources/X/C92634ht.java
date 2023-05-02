package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: X.4ht  reason: invalid class name and case insensitive filesystem */
public final class C92634ht implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        long j2 = 3600000;
        long j3 = 600000;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        int i2 = 102;
        boolean z2 = false;
        int i3 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        boolean z3 = false;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel2, readInt);
                    break;
                case 2:
                    j2 = C32281fy.A03(parcel2, readInt);
                    break;
                case 3:
                    j3 = C32281fy.A03(parcel2, readInt);
                    break;
                case 4:
                    z2 = C32281fy.A0F(parcel2, readInt);
                    break;
                case 5:
                    j4 = C32281fy.A03(parcel2, readInt);
                    break;
                case 6:
                    i3 = C32281fy.A01(parcel2, readInt);
                    break;
                case 7:
                    f2 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 8:
                    j5 = C32281fy.A03(parcel2, readInt);
                    break;
                case 9:
                    z3 = C32281fy.A0F(parcel2, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel2, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new LocationRequest(f2, i2, i3, j2, j3, j4, j5, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
