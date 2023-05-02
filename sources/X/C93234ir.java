package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4ir  reason: invalid class name and case insensitive filesystem */
public final class C93234ir implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new C14450pC(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C14450pC[i2];
    }
}
