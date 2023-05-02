package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.4iY  reason: invalid class name and case insensitive filesystem */
public final class C93044iY implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                C32281fy.A0C(parcel, readInt);
            } else {
                connectionConfiguration = (ConnectionConfiguration) C32281fy.A06(parcel, ConnectionConfiguration.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3XH(connectionConfiguration, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3XH[i2];
    }
}
