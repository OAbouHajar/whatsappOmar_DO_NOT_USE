package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iP  reason: invalid class name and case insensitive filesystem */
public final class C92954iP implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 2) {
                i3 = AnonymousClass3K3.A0G(parcel, c2, 3, readInt, i3);
            } else {
                i2 = C32281fy.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3X9(i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3X9[i2];
    }
}
