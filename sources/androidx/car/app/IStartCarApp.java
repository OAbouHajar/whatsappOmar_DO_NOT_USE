package androidx.car.app;

import X.AnonymousClass000;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IStartCarApp extends IInterface {

    public class Default implements IStartCarApp {
        public IBinder asBinder() {
            return null;
        }

        public void startCarApp(Intent intent) {
        }
    }

    public abstract class Stub extends Binder implements IStartCarApp {
        public static final String DESCRIPTOR = "androidx.car.app.IStartCarApp";
        public static final int TRANSACTION_startCarApp = 2;

        public class Proxy implements IStartCarApp {
            public static IStartCarApp sDefaultImpl;
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

            public void startCarApp(Intent intent) {
                IStartCarApp iStartCarApp;
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
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || (iStartCarApp = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iStartCarApp.startCarApp(intent);
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

        public static IStartCarApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStartCarApp)) ? new Proxy(iBinder) : (IStartCarApp) queryLocalInterface;
        }

        public static IStartCarApp getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IStartCarApp iStartCarApp) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iStartCarApp == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iStartCarApp;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                startCarApp(AnonymousClass000.A0B(parcel, DESCRIPTOR) != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
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

    void startCarApp(Intent intent);
}
