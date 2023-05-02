package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4ih  reason: invalid class name and case insensitive filesystem */
public final class C93134ih implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        AnonymousClass3Y7 r1 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                r1 = (AnonymousClass3Y7) C32281fy.A06(parcel, AnonymousClass3Y7.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XO(r1, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XO[i2];
    }
}
