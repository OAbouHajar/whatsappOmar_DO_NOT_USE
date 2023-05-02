package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;

/* renamed from: X.4iN  reason: invalid class name and case insensitive filesystem */
public final class C92934iN implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 2) {
                str2 = AnonymousClass3K3.A0l(parcel, str2, c2, 3, readInt);
            } else {
                str = C32281fy.A08(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new DataItemAssetParcelable(str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new DataItemAssetParcelable[i2];
    }
}
