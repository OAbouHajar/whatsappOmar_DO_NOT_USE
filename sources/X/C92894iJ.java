package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iJ  reason: invalid class name and case insensitive filesystem */
public final class C92894iJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 != 3) {
                str3 = AnonymousClass3K3.A0l(parcel, str3, c2, 4, readInt);
            } else {
                str2 = C32281fy.A08(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y7(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y7[i2];
    }
}
