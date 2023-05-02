package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iK  reason: invalid class name and case insensitive filesystem */
public final class C92904iK implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            i2 = AnonymousClass3K2.A05(parcel, i2);
        }
        C32281fy.A0B(parcel, A00);
        return new C65893Wz(i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C65893Wz[i2];
    }
}
