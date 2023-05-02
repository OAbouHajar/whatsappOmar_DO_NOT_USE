package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hm  reason: invalid class name and case insensitive filesystem */
public final class C92574hm implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                bArr = C32281fy.A0G(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C55162iy(str, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C55162iy[i2];
    }
}
