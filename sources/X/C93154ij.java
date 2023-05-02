package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4ij  reason: invalid class name and case insensitive filesystem */
public final class C93154ij implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        long j2 = 0;
        String str2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 == 3) {
                str2 = C32281fy.A08(parcel, readInt);
            } else if (c2 != 4) {
                C32281fy.A0C(parcel, readInt);
            } else {
                j2 = C32281fy.A03(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XW(str, str2, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XW[i2];
    }
}
