package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.4hp  reason: invalid class name and case insensitive filesystem */
public final class C92594hp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        Status status = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C32281fy.A0C(parcel, readInt);
            } else {
                status = (Status) C32281fy.A06(parcel, Status.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y9(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y9[i2];
    }
}
