package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4i6  reason: invalid class name and case insensitive filesystem */
public final class C92764i6 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        AnonymousClass3XT[] r4 = null;
        long j2 = 0;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                j2 = C32281fy.A03(parcel, readInt);
            } else if (c2 == 3) {
                r4 = (AnonymousClass3XT[]) C32281fy.A0I(parcel, AnonymousClass3XT.CREATOR, readInt);
            } else if (c2 != 4) {
                z2 = AnonymousClass3K4.A19(parcel, c2, 5, readInt, z2);
            } else {
                i2 = C32281fy.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65913Xb(r4, i2, j2, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C65913Xb[i2];
    }
}
