package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hr  reason: invalid class name and case insensitive filesystem */
public final class C92614hr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        C57992sJ r7 = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i2 = 1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 2:
                    r7 = (C57992sJ) C32281fy.A06(parcel, C57992sJ.CREATOR, readInt);
                    break;
                case 3:
                    iBinder = C32281fy.A05(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C32281fy.A06(parcel, PendingIntent.CREATOR, readInt);
                    break;
                case 5:
                    iBinder2 = C32281fy.A05(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = C32281fy.A05(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65953Xf(pendingIntent, iBinder, iBinder2, iBinder3, r7, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C65953Xf[i2];
    }
}
