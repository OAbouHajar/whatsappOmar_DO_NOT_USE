package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hk  reason: invalid class name and case insensitive filesystem */
public final class C92554hk implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                C32281fy.A01(parcel, readInt);
            } else if (c2 != 2) {
                i2 = AnonymousClass3K3.A0G(parcel, c2, 3, readInt, i2);
            } else {
                str = C32281fy.A08(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C55212j3(str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C55212j3[i2];
    }
}
