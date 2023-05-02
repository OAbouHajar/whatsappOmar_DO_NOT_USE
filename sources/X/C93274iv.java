package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iv  reason: invalid class name and case insensitive filesystem */
public final class C93274iv implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18450wi.A0H(parcel, 0);
        String readString = parcel.readString();
        String A0i = AnonymousClass3K2.A0i(parcel, readString);
        String readString2 = parcel.readString();
        C18450wi.A0F(readString2);
        C18450wi.A0B(readString2);
        return new C93414j9(readString, A0i, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C93414j9[i2];
    }
}
