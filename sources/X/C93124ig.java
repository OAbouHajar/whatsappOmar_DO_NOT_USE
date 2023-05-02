package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4ig  reason: invalid class name and case insensitive filesystem */
public final class C93124ig implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 == 3) {
                str2 = C32281fy.A08(parcel, readInt);
            } else if (c2 != 4) {
                z2 = AnonymousClass3K4.A19(parcel, c2, 5, readInt, z2);
            } else {
                i2 = C32281fy.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66053Xp(str, str2, i2, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C66053Xp[i2];
    }
}
