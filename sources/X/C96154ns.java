package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;

/* renamed from: X.4ns  reason: invalid class name and case insensitive filesystem */
public class C96154ns implements IAppDataReaderService {
    public IBinder A00;

    public C96154ns(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public ParcelFileDescriptor ACI() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
            AnonymousClass3K2.A0w(this.A00, obtain, obtain2, 1);
            return (ParcelFileDescriptor) (obtain2.readInt() != 0 ? ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
