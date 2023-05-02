package androidx.car.app;

import X.AnonymousClass000;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICarHost extends IInterface {

    public class Default implements ICarHost {
        public IBinder asBinder() {
            return null;
        }

        public void finish() {
        }

        public IBinder getHost(String str) {
            return null;
        }

        public void startCarApp(Intent intent) {
        }
    }

    public abstract class Stub extends Binder implements ICarHost {
        public static final String DESCRIPTOR = "androidx.car.app.ICarHost";
        public static final int TRANSACTION_finish = 4;
        public static final int TRANSACTION_getHost = 3;
        public static final int TRANSACTION_startCarApp = 2;

        public class Proxy implements ICarHost {
            public static ICarHost sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void finish() {
                ICarHost iCarHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || (iCarHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iCarHost.finish();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder getHost(String str) {
                IBinder iBinder;
                ICarHost iCarHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || (iCarHost = sDefaultImpl) == null) {
                        obtain2.readException();
                        iBinder = obtain2.readStrongBinder();
                    } else {
                        iBinder = iCarHost.getHost(str);
                    }
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void startCarApp(Intent intent) {
                ICarHost iCarHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || (iCarHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iCarHost.startCarApp(intent);
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

        public static ICarHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHost)) ? new Proxy(iBinder) : (ICarHost) queryLocalInterface;
        }

        public static ICarHost getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICarHost iCarHost) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iCarHost == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iCarHost;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                startCarApp(AnonymousClass000.A0B(parcel, DESCRIPTOR) != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                IBinder host = getHost(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(host);
                return true;
            } else if (i2 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                finish();
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void finish();

    IBinder getHost(String str);

    void startCarApp(Intent intent);
}
