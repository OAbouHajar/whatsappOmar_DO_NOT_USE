package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4j1  reason: invalid class name and case insensitive filesystem */
public final class C93334j1 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18450wi.A0H(parcel, 0);
        String readString = parcel.readString();
        String A0i = AnonymousClass3K2.A0i(parcel, readString);
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        C18450wi.A0F(readString2);
        C18450wi.A0B(readString2);
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        String readString3 = parcel.readString();
        return new C93434jB(readString, A0i, readString2, readString3, AnonymousClass3K2.A0i(parcel, readString3), readInt, readInt2, readInt3);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C93434jB[i2];
    }
}
