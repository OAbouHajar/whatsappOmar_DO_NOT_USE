package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iV  reason: invalid class name and case insensitive filesystem */
public final class C93014iV implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                z3 = AnonymousClass3K4.A19(parcel, c2, 4, readInt, z3);
            } else {
                z2 = C32281fy.A0F(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XV(i2, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XV[i2];
    }
}
