package androidx.car.app;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IAppManager extends IInterface {

    public class Default implements IAppManager {
        public IBinder asBinder() {
            return null;
        }

        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        }

        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        }

        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }

        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IAppManager {
        public static final String DESCRIPTOR = "androidx.car.app.IAppManager";
        public static final int TRANSACTION_getTemplate = 2;
        public static final int TRANSACTION_onBackPressed = 3;
        public static final int TRANSACTION_startLocationUpdates = 4;
        public static final int TRANSACTION_stopLocationUpdates = 5;

        public class Proxy implements IAppManager {
            public static IAppManager sDefaultImpl;
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

            public void getTemplate(IOnDoneCallback iOnDoneCallback) {
                IAppManager iAppManager;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 2) && (iAppManager = sDefaultImpl) != null) {
                        iAppManager.getTemplate(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
                IAppManager iAppManager;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 3) && (iAppManager = sDefaultImpl) != null) {
                        iAppManager.onBackPressed(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                IAppManager iAppManager;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 4) && (iAppManager = sDefaultImpl) != null) {
                        iAppManager.startLocationUpdates(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                IAppManager iAppManager;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 5) && (iAppManager = sDefaultImpl) != null) {
                        iAppManager.stopLocationUpdates(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAppManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppManager)) ? new Proxy(iBinder) : (IAppManager) queryLocalInterface;
        }

        public static IAppManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAppManager iAppManager) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iAppManager == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iAppManager;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                getTemplate(AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onBackPressed(AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                startLocationUpdates(AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                stopLocationUpdates(AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void getTemplate(IOnDoneCallback iOnDoneCallback);

    void onBackPressed(IOnDoneCallback iOnDoneCallback);

    void startLocationUpdates(IOnDoneCallback iOnDoneCallback);

    void stopLocationUpdates(IOnDoneCallback iOnDoneCallback);
}
