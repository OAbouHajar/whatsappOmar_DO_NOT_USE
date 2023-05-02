package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hX  reason: invalid class name and case insensitive filesystem */
public final class C92424hX implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                z2 = C32281fy.A0F(parcel, readInt);
            } else if (c2 == 3) {
                z3 = C32281fy.A0F(parcel, readInt);
            } else if (c2 != 4) {
                i4 = AnonymousClass3K3.A0G(parcel, c2, 5, readInt, i4);
            } else {
                i3 = C32281fy.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65933Xd(i2, i3, i4, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65933Xd[i2];
    }
}
