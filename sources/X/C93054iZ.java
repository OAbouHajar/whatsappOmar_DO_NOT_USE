package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iZ  reason: invalid class name and case insensitive filesystem */
public final class C93054iZ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                iBinder = C32281fy.A05(parcel, readInt);
            } else if (c2 == 3) {
                intentFilterArr = (IntentFilter[]) C32281fy.A0I(parcel, IntentFilter.CREATOR, readInt);
            } else if (c2 != 4) {
                str2 = AnonymousClass3K3.A0l(parcel, str2, c2, 5, readInt);
            } else {
                str = C32281fy.A08(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66123Xw(iBinder, str, str2, intentFilterArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C66123Xw[i2];
    }
}
