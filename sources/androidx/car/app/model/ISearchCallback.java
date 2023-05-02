package androidx.car.app.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface ISearchCallback extends IInterface {

    public class Default implements ISearchCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ISearchCallback {
        public static final String DESCRIPTOR = "androidx.car.app.model.ISearchCallback";
        public static final int TRANSACTION_onSearchSubmitted = 3;
        public static final int TRANSACTION_onSearchTextChanged = 2;

        public class Proxy implements ISearchCallback {
            public static ISearchCallback sDefaultImpl;
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

            public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
                ISearchCallback iSearchCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 3) && (iSearchCallback = sDefaultImpl) != null) {
                        iSearchCallback.onSearchSubmitted(str, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
                ISearchCallback iSearchCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 2) && (iSearchCallback = sDefaultImpl) != null) {
                        iSearchCallback.onSearchTextChanged(str, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISearchCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISearchCallback)) ? new Proxy(iBinder) : (ISearchCallback) queryLocalInterface;
        }

        public static ISearchCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISearchCallback iSearchCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iSearchCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iSearchCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onSearchTextChanged(parcel.readString(), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onSearchSubmitted(parcel.readString(), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback);

    void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback);
}
