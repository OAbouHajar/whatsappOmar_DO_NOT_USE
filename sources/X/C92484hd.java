package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hd  reason: invalid class name and case insensitive filesystem */
public final class C92484hd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        String str2 = null;
        C66073Xr r3 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
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
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 4:
                    i4 = C32281fy.A01(parcel, readInt);
                    break;
                case 5:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 6:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 7:
                    i5 = C32281fy.A01(parcel, readInt);
                    break;
                case 8:
                    str2 = C32281fy.A08(parcel, readInt);
                    break;
                case 9:
                    r3 = (C66073Xr) C32281fy.A06(parcel, C66073Xr.CREATOR, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y5(r3, str, str2, i2, i3, i4, i5, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y5[i2];
    }
}
