package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4it  reason: invalid class name and case insensitive filesystem */
public final class C93254it implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18450wi.A0H(parcel, 0);
        return new C93404j8(parcel.readDouble(), parcel.readDouble(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C93404j8[i2];
    }
}
