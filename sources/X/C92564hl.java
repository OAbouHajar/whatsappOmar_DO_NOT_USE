package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hl  reason: invalid class name and case insensitive filesystem */
public final class C92564hl implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 1) {
                str = AnonymousClass3K3.A0l(parcel, str, c2, 2, readInt);
            } else {
                C32281fy.A01(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65863Ww(str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65863Ww[i2];
    }
}
