package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4h4  reason: invalid class name and case insensitive filesystem */
public abstract class C92134h4 implements IInterface {
    public final String mDescriptor;
    public final IBinder mRemote;

    public C92134h4(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.mDescriptor = str;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    public Parcel transactAndReadException(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(this.mRemote, parcel, parcel, i2);
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public void transactAndReadExceptionReturnVoid(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(this.mRemote, parcel, obtain, i2);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void transactOneway(int i2, Parcel parcel) {
        try {
            this.mRemote.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
