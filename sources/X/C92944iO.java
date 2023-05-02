package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iO  reason: invalid class name and case insensitive filesystem */
public final class C92944iO implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                uri = (Uri) C32281fy.A06(parcel, Uri.CREATOR, readInt);
            } else if (c2 == 4) {
                bundle = C32281fy.A04(parcel, readInt);
            } else if (c2 != 5) {
                C32281fy.A0C(parcel, readInt);
            } else {
                bArr = C32281fy.A0G(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65993Xj(uri, bundle, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C65993Xj[i2];
    }
}
