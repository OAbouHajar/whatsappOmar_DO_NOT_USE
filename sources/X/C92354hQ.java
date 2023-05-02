package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.4hQ  reason: invalid class name and case insensitive filesystem */
public final class C92354hQ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C15700rh r5 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i3 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 == 3) {
                pendingIntent = (PendingIntent) C32281fy.A06(parcel, PendingIntent.CREATOR, readInt);
            } else if (c2 != 4) {
                i2 = AnonymousClass3K3.A0G(parcel, c2, 1000, readInt, i2);
            } else {
                r5 = (C15700rh) C32281fy.A06(parcel, C15700rh.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new Status(pendingIntent, r5, str, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
