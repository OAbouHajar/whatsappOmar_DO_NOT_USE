package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hF  reason: invalid class name and case insensitive filesystem */
public final class C92244hF implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        long j2 = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                z2 = C32281fy.A0F(parcel, readInt);
            } else if (c2 != 3) {
                z3 = AnonymousClass3K4.A19(parcel, c2, 4, readInt, z3);
            } else {
                j2 = C32281fy.A03(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XZ(i2, j2, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XZ[i2];
    }
}
