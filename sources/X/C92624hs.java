package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hs  reason: invalid class name and case insensitive filesystem */
public final class C92624hs implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 3) {
                i3 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 4) {
                i4 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 5) {
                i5 = AnonymousClass3K3.A0G(parcel, c2, 6, readInt, i5);
            } else {
                j2 = C32281fy.A03(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66133Xx(i2, i3, i4, j2, i5);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66133Xx[i2];
    }
}
