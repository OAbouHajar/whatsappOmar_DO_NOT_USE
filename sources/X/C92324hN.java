package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hN  reason: invalid class name and case insensitive filesystem */
public final class C92324hN implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        long j2 = 0;
        long j3 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                z2 = C32281fy.A0F(parcel, readInt);
            } else if (c2 == 2) {
                j3 = C32281fy.A03(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                j2 = C32281fy.A03(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66043Xo(j2, j3, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66043Xo[i2];
    }
}
