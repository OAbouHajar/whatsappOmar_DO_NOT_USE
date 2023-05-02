package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.4hE  reason: invalid class name and case insensitive filesystem */
public final class C92234hE implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2;
        int A00 = C32281fy.A00(parcel);
        HashSet A0o = C13680ns.A0o();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        AnonymousClass3XZ r4 = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i3 = C32281fy.A01(parcel, readInt);
                    i2 = 1;
                    break;
                case 2:
                    str = C32281fy.A08(parcel, readInt);
                    i2 = 2;
                    break;
                case 3:
                    i4 = C32281fy.A01(parcel, readInt);
                    i2 = 3;
                    break;
                case 4:
                    bArr = C32281fy.A0G(parcel, readInt);
                    i2 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C32281fy.A06(parcel, PendingIntent.CREATOR, readInt);
                    i2 = 5;
                    break;
                case 6:
                    r4 = (AnonymousClass3XZ) C32281fy.A06(parcel, AnonymousClass3XZ.CREATOR, readInt);
                    i2 = 6;
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    continue;
            }
            C13690nt.A1O(A0o, i2);
        }
        if (parcel.dataPosition() == A00) {
            return new C66193Yk(pendingIntent, r4, str, A0o, bArr, i3, i4);
        }
        throw new C105545Aa(parcel, C13680ns.A0i("Overread allowed size end=", C13690nt.A0g(37), A00));
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66193Yk[i2];
    }
}
