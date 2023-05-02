package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.3a4  reason: invalid class name and case insensitive filesystem */
public final class C66533a4 extends C92044gv implements AnonymousClass5UF {
    public C66533a4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void AjO(C65953Xf r6) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeInt(1);
        r6.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
