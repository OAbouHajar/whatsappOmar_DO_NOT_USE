package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.3Lc  reason: invalid class name and case insensitive filesystem */
public abstract class C63683Lc extends Binder implements IInterface {
    public static AnonymousClass5L1 globalInterceptor;

    public C63683Lc(String str) {
        attachInterface(this, str);
    }

    public static synchronized void installTransactionInterceptorPackagePrivate(AnonymousClass5L1 r2) {
        synchronized (C63683Lc.class) {
            if (r2 != null) {
                globalInterceptor = r2;
            } else {
                throw AnonymousClass000.A0T("null interceptor");
            }
        }
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        return false;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (routeToSuperOrEnforceInterface(i2, parcel, parcel2, i3)) {
            return true;
        }
        return dispatchTransaction(i2, parcel, parcel2, i3);
    }

    public boolean routeToSuperOrEnforceInterface(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 16777215) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        AnonymousClass3K4.A0l(this, parcel);
        return false;
    }
}
