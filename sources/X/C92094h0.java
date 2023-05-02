package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4h0  reason: invalid class name and case insensitive filesystem */
public class C92094h0 implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C92094h0(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
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
