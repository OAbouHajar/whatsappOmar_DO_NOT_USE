package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1e1  reason: invalid class name and case insensitive filesystem */
public class C31361e1 implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C31361e1(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public static IObjectWrapper A00(Parcel parcel, C31361e1 r1, int i2) {
        Parcel A02 = r1.A02(i2, parcel);
        IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
        A02.recycle();
        return A002;
    }

    public final Parcel A01() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        return obtain;
    }

    public final Parcel A02(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.A00.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final void A03(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.A00;
    }
}
