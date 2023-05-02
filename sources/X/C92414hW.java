package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hW  reason: invalid class name and case insensitive filesystem */
public final class C92414hW implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        IBinder iBinder = null;
        C15700rh r5 = null;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                iBinder = C32281fy.A05(parcel, readInt);
            } else if (c2 == 3) {
                r5 = (C15700rh) C32281fy.A06(parcel, C15700rh.CREATOR, readInt);
            } else if (c2 != 4) {
                z3 = AnonymousClass3K4.A19(parcel, c2, 5, readInt, z3);
            } else {
                z2 = C32281fy.A0F(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66003Xk(iBinder, r5, i2, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66003Xk[i2];
    }
}
