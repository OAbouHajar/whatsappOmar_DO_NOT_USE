package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4ip  reason: invalid class name and case insensitive filesystem */
public final class C93214ip implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        long j2 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 3) {
                j2 = C32281fy.A03(parcel, readInt);
            } else if (c2 != 4) {
                C32281fy.A0C(parcel, readInt);
            } else {
                arrayList = C32281fy.A0A(parcel, AnonymousClass3XW.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XY(arrayList, i2, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XY[i2];
    }
}
