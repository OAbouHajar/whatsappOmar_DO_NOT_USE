package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4gy  reason: invalid class name and case insensitive filesystem */
public class C92074gy implements IInterface {
    public final IBinder A00;

    public C92074gy(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final void A00(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(this.A00, parcel, obtain, i2);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.A00;
    }
}
