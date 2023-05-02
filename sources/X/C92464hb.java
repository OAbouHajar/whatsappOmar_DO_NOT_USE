package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4hb  reason: invalid class name and case insensitive filesystem */
public final class C92464hb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 2) {
                C32281fy.A0C(parcel, readInt);
            } else {
                arrayList = C32281fy.A0A(parcel, C66083Xs.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3YI(arrayList, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3YI[i2];
    }
}
