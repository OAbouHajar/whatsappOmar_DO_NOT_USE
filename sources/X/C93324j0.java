package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4j0  reason: invalid class name and case insensitive filesystem */
public final class C93324j0 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18450wi.A0H(parcel, 0);
        String readString = parcel.readString();
        String A0i = AnonymousClass3K2.A0i(parcel, readString);
        String readString2 = parcel.readString();
        String A0i2 = AnonymousClass3K2.A0i(parcel, readString2);
        String readString3 = parcel.readString();
        String A0i3 = AnonymousClass3K2.A0i(parcel, readString3);
        String readString4 = parcel.readString();
        String A0i4 = AnonymousClass3K2.A0i(parcel, readString4);
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C93434jB.CREATOR);
        C18450wi.A0F(createTypedArrayList);
        C18450wi.A0B(createTypedArrayList);
        return new C93444jC(readString, A0i, readString2, A0i2, readString3, A0i3, readString4, A0i4, createTypedArrayList);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C93444jC[i2];
    }
}
