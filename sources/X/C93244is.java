package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4is  reason: invalid class name and case insensitive filesystem */
public final class C93244is implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C32281fy.A0C(parcel, readInt);
            } else {
                bundle = C32281fy.A04(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C57982sI(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C57982sI[i2];
    }
}
