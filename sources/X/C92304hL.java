package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hL  reason: invalid class name and case insensitive filesystem */
public final class C92304hL implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        byte[] bArr = null;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 1) {
                z2 = AnonymousClass3K4.A19(parcel, c2, 2, readInt, z2);
            } else {
                bArr = C32281fy.A0G(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3X4(bArr, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3X4[i2];
    }
}
