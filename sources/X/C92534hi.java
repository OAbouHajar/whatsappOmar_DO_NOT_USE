package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hi  reason: invalid class name and case insensitive filesystem */
public final class C92534hi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                i3 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 3) {
                str = AnonymousClass3K3.A0l(parcel, str, c2, 4, readInt);
            } else {
                pendingIntent = (PendingIntent) C32281fy.A06(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C15700rh(pendingIntent, str, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C15700rh[i2];
    }
}
