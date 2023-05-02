package androidx.car.app.navigation;

import X.AnonymousClass000;
import X.AnonymousClass0Y7;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface INavigationHost extends IInterface {

    public class Default implements INavigationHost {
        public IBinder asBinder() {
            return null;
        }

        public void navigationEnded() {
        }

        public void navigationStarted() {
        }

        public void updateTrip(AnonymousClass0Y7 r1) {
        }
    }

    public abstract class Stub extends Binder implements INavigationHost {
        public static final String DESCRIPTOR = "androidx.car.app.navigation.INavigationHost";
        public static final int TRANSACTION_navigationEnded = 3;
        public static final int TRANSACTION_navigationStarted = 2;
        public static final int TRANSACTION_updateTrip = 4;

        public class Proxy implements INavigationHost {
            public static INavigationHost sDefaultImpl;
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

            public void navigationEnded() {
                INavigationHost iNavigationHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || (iNavigationHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iNavigationHost.navigationEnded();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void navigationStarted() {
                INavigationHost iNavigationHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || (iNavigationHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iNavigationHost.navigationStarted();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void updateTrip(AnonymousClass0Y7 r6) {
                INavigationHost iNavigationHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    if (this.mRemote.transact(4, obtain, obtain2, AnonymousClass000.A1T(obtain, r6, Stub.DESCRIPTOR) ? 1 : 0) || (iNavigationHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iNavigationHost.updateTrip(r6);
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

        public static INavigationHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INavigationHost)) ? new Proxy(iBinder) : (INavigationHost) queryLocalInterface;
        }

        public static INavigationHost getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(INavigationHost iNavigationHost) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iNavigationHost == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iNavigationHost;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                navigationStarted();
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                navigationEnded();
            } else if (i2 == 4) {
                updateTrip(AnonymousClass000.A0B(parcel, DESCRIPTOR) != 0 ? (AnonymousClass0Y7) AnonymousClass0Y7.CREATOR.createFromParcel(parcel) : null);
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

    void navigationEnded();

    void navigationStarted();

    void updateTrip(AnonymousClass0Y7 r1);
}
