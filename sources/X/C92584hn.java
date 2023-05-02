package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hn  reason: invalid class name and case insensitive filesystem */
public final class C92584hn implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 3:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 4:
                    i3 = C32281fy.A01(parcel, readInt);
                    break;
                case 5:
                    str2 = C32281fy.A08(parcel, readInt);
                    break;
                case 6:
                    str3 = C32281fy.A08(parcel, readInt);
                    break;
                case 7:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 8:
                    str4 = C32281fy.A08(parcel, readInt);
                    break;
                case 9:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 10:
                    i4 = C32281fy.A01(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y4(str, str2, str3, str4, i2, i3, i4, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y4[i2];
    }
}
