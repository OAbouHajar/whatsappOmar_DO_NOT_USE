package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iz  reason: invalid class name and case insensitive filesystem */
public final class C93314iz implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18450wi.A0H(parcel, 0);
        String readString = parcel.readString();
        C18450wi.A0F(readString);
        C18450wi.A0B(readString);
        String readString2 = parcel.readString();
        C18450wi.A0F(readString2);
        return new C93394j7(readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C93394j7[i2];
    }
}
