package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iH  reason: invalid class name and case insensitive filesystem */
public final class C92874iH implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                f2 = AnonymousClass3K2.A01(parcel, readInt);
            } else if (c2 != 3) {
                i3 = AnonymousClass3K3.A0G(parcel, c2, 4, readInt, i3);
            } else {
                f3 = AnonymousClass3K2.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65923Xc(f2, f3, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65923Xc[i2];
    }
}
