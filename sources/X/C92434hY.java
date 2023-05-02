package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hY  reason: invalid class name and case insensitive filesystem */
public final class C92434hY implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        Bundle bundle = null;
        AnonymousClass3Y2[] r1 = null;
        C65943Xe r2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                bundle = C32281fy.A04(parcel, readInt);
            } else if (c2 == 2) {
                r1 = (AnonymousClass3Y2[]) C32281fy.A0I(parcel, AnonymousClass3Y2.CREATOR, readInt);
            } else if (c2 == 3) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 4) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r2 = (C65943Xe) C32281fy.A06(parcel, C65943Xe.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66113Xv(bundle, r2, r1, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66113Xv[i2];
    }
}
