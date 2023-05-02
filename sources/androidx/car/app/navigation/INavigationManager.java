package androidx.car.app.navigation;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface INavigationManager extends IInterface {

    public class Default implements INavigationManager {
        public IBinder asBinder() {
            return null;
        }

        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements INavigationManager {
        public static final String DESCRIPTOR = "androidx.car.app.navigation.INavigationManager";
        public static final int TRANSACTION_onStopNavigation = 2;

        public class Proxy implements INavigationManager {
            public static INavigationManager sDefaultImpl;
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

            public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
                INavigationManager iNavigationManager;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 2) && (iNavigationManager = sDefaultImpl) != null) {
                        iNavigationManager.onStopNavigation(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INavigationManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INavigationManager)) ? new Proxy(iBinder) : (INavigationManager) queryLocalInterface;
        }

        public static INavigationManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(INavigationManager iNavigationManager) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iNavigationManager == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iNavigationManager;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onStopNavigation(AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onStopNavigation(IOnDoneCallback iOnDoneCallback);
}
