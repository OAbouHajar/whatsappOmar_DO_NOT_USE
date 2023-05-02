package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4in  reason: invalid class name and case insensitive filesystem */
public final class C93194in implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        byte[] bArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                i3 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                bArr = C32281fy.A0G(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XX(bArr, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XX[i2];
    }
}
