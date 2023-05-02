package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hy  reason: invalid class name and case insensitive filesystem */
public final class C92684hy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            str = AnonymousClass3K3.A0l(parcel, str, (char) readInt, 2, readInt);
        }
        C32281fy.A0B(parcel, A00);
        return new C58002sK(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C58002sK[i2];
    }
}
