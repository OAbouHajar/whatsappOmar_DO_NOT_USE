package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass0Y7;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IOnDoneCallback extends IInterface {

    public class Default implements IOnDoneCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onFailure(AnonymousClass0Y7 r1) {
        }

        public void onSuccess(AnonymousClass0Y7 r1) {
        }
    }

    public abstract class Stub extends Binder implements IOnDoneCallback {
        public static final String DESCRIPTOR = "androidx.car.app.IOnDoneCallback";
        public static final int TRANSACTION_onFailure = 3;
        public static final int TRANSACTION_onSuccess = 2;

        public class Proxy implements IOnDoneCallback {
            public static IOnDoneCallback sDefaultImpl;
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

            public void onFailure(AnonymousClass0Y7 r6) {
                IOnDoneCallback iOnDoneCallback;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    if (this.mRemote.transact(3, obtain, obtain2, AnonymousClass000.A1T(obtain, r6, Stub.DESCRIPTOR) ? 1 : 0) || (iOnDoneCallback = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iOnDoneCallback.onFailure(r6);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSuccess(AnonymousClass0Y7 r6) {
                IOnDoneCallback iOnDoneCallback;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    if (this.mRemote.transact(2, obtain, obtain2, AnonymousClass000.A1T(obtain, r6, Stub.DESCRIPTOR) ? 1 : 0) || (iOnDoneCallback = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iOnDoneCallback.onSuccess(r6);
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

        public static IOnDoneCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnDoneCallback)) ? new Proxy(iBinder) : (IOnDoneCallback) queryLocalInterface;
        }

        public static IOnDoneCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnDoneCallback iOnDoneCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iOnDoneCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iOnDoneCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                onSuccess(AnonymousClass000.A0Q(parcel, DESCRIPTOR));
            } else if (i2 == 3) {
                onFailure(AnonymousClass000.A0Q(parcel, DESCRIPTOR));
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

    void onFailure(AnonymousClass0Y7 r1);

    void onSuccess(AnonymousClass0Y7 r1);
}
