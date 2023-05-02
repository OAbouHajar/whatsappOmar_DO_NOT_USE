package androidx.car.app;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IOnRequestPermissionsListener extends IInterface {

    public class Default implements IOnRequestPermissionsListener {
        public IBinder asBinder() {
            return null;
        }

        public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        }
    }

    public abstract class Stub extends Binder implements IOnRequestPermissionsListener {
        public static final String DESCRIPTOR = "androidx.car.app.IOnRequestPermissionsListener";
        public static final int TRANSACTION_onRequestPermissionsResult = 2;

        public class Proxy implements IOnRequestPermissionsListener {
            public static IOnRequestPermissionsListener sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
                IOnRequestPermissionsListener iOnRequestPermissionsListener;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || (iOnRequestPermissionsListener = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iOnRequestPermissionsListener.onRequestPermissionsResult(strArr, strArr2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOnRequestPermissionsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnRequestPermissionsListener)) ? new Proxy(iBinder) : (IOnRequestPermissionsListener) queryLocalInterface;
        }

        public static IOnRequestPermissionsListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnRequestPermissionsListener iOnRequestPermissionsListener) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iOnRequestPermissionsListener == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iOnRequestPermissionsListener;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onRequestPermissionsResult(parcel.createStringArray(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onRequestPermissionsResult(String[] strArr, String[] strArr2);
}
