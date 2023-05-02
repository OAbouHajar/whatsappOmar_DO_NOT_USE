package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4id  reason: invalid class name and case insensitive filesystem */
public final class C93094id implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 2) {
                str = AnonymousClass3K3.A0l(parcel, str, c2, 3, readInt);
            } else {
                i2 = C32281fy.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XL(i2, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XL[i2];
    }
}
