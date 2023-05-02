package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4i5  reason: invalid class name and case insensitive filesystem */
public final class C92754i5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 != 3) {
                i2 = AnonymousClass3K3.A0G(parcel, c2, 4, readInt, i2);
            } else {
                bArr = C32281fy.A0G(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XT(str, bArr, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XT[i2];
    }
}
