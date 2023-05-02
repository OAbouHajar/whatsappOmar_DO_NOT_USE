package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hU  reason: invalid class name and case insensitive filesystem */
public final class C92394hU implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        String str2 = null;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 2:
                    i3 = C32281fy.A01(parcel, readInt);
                    break;
                case 3:
                    i4 = C32281fy.A01(parcel, readInt);
                    break;
                case 4:
                    j2 = C32281fy.A03(parcel, readInt);
                    break;
                case 5:
                    j3 = C32281fy.A03(parcel, readInt);
                    break;
                case 6:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 7:
                    str2 = C32281fy.A08(parcel, readInt);
                    break;
                case 8:
                    i5 = C32281fy.A01(parcel, readInt);
                    break;
                case 9:
                    i6 = C32281fy.A01(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65963Xg(str, str2, i2, i3, i4, i5, i6, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65963Xg[i2];
    }
}
