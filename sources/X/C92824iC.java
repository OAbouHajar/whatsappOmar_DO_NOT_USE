package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iC  reason: invalid class name and case insensitive filesystem */
public final class C92824iC implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        C65903Xa r1 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 2) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r1 = (C65903Xa) C32281fy.A06(parcel, C65903Xa.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3X7(r1, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3X7[i2];
    }
}
