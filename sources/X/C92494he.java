package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4he  reason: invalid class name and case insensitive filesystem */
public final class C92494he implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        AnonymousClass3Y5 r1 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r1 = (AnonymousClass3Y5) C32281fy.A06(parcel, AnonymousClass3Y5.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66103Xu(r1, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66103Xu[i2];
    }
}
