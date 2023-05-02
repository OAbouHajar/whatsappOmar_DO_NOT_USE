package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.4h5  reason: invalid class name and case insensitive filesystem */
public class C92144h5 implements IInterface, IGetInstallReferrerService {
    public final IBinder A00;

    public C92144h5(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Bundle A5m(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.A00.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) AnonymousClass3K2.A0N(obtain, Bundle.CREATOR);
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.A00;
    }
}
