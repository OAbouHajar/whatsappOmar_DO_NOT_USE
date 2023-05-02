package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iD  reason: invalid class name and case insensitive filesystem */
public final class C92834iD implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        C15700rh r1 = null;
        C66003Xk r2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                r1 = (C15700rh) C32281fy.A06(parcel, C15700rh.CREATOR, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r2 = (C66003Xk) C32281fy.A06(parcel, C66003Xk.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XU(r1, r2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XU[i2];
    }
}
