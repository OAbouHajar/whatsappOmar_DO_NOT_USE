package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hc  reason: invalid class name and case insensitive filesystem */
public final class C92474hc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 2) {
                i3 = AnonymousClass3K3.A0G(parcel, c2, 3, readInt, i3);
            } else {
                str = C32281fy.A08(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66083Xs(i2, str, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66083Xs[i2];
    }
}
