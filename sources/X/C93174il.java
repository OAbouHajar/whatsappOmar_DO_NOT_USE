package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4il  reason: invalid class name and case insensitive filesystem */
public final class C93174il implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        C65993Xj r1 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r1 = (C65993Xj) C32281fy.A06(parcel, C65993Xj.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XQ(r1, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XQ[i2];
    }
}
