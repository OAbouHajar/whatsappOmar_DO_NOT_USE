package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4i0  reason: invalid class name and case insensitive filesystem */
public final class C92704i0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        Float f2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                f2 = C32281fy.A07(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66023Xm(f2, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C66023Xm[i2];
    }
}
