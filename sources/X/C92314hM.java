package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: X.4hM  reason: invalid class name and case insensitive filesystem */
public final class C92314hM implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        Long l2 = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 2:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 3:
                    int A02 = C32281fy.A02(parcel, readInt);
                    if (A02 != 0) {
                        C32281fy.A0D(parcel, A02, 8);
                        l2 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l2 = null;
                        break;
                    }
                case 4:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 5:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 6:
                    arrayList = C32281fy.A09(parcel, readInt);
                    break;
                case 7:
                    str2 = C32281fy.A08(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new TokenData(l2, str, str2, arrayList, i2, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new TokenData[i2];
    }
}
