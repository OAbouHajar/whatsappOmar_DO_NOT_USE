package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hh  reason: invalid class name and case insensitive filesystem */
public final class C92524hh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        Parcel parcel2 = null;
        C65983Xi r2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                int A02 = C32281fy.A02(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (A02 == 0) {
                    parcel2 = null;
                } else {
                    parcel2 = Parcel.obtain();
                    parcel2.appendFrom(parcel, dataPosition, A02);
                    parcel.setDataPosition(dataPosition + A02);
                }
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r2 = (C65983Xi) C32281fy.A06(parcel, C65983Xi.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3YP(parcel2, r2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3YP[i2];
    }
}
