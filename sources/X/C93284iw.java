package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iw  reason: invalid class name and case insensitive filesystem */
public final class C93284iw implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18450wi.A0H(parcel, 0);
        C74103pk r1 = new C74103pk();
        r1.A0S(parcel);
        r1.A04 = parcel.readString();
        r1.A03 = parcel.readString();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C74103pk[i2];
    }
}
