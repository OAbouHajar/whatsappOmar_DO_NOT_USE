package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hj  reason: invalid class name and case insensitive filesystem */
public final class C92544hj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                j2 = C32281fy.A03(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y2(i2, str, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y2[i2];
    }
}
