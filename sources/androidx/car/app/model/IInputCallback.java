package androidx.car.app.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IInputCallback extends IInterface {

    public class Default implements IInputCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IInputCallback {
        public static final String DESCRIPTOR = "androidx.car.app.model.IInputCallback";
        public static final int TRANSACTION_onInputSubmitted = 3;
        public static final int TRANSACTION_onInputTextChanged = 2;

        public class Proxy implements IInputCallback {
            public static IInputCallback sDefaultImpl;
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

            public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
                IInputCallback iInputCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 3) && (iInputCallback = sDefaultImpl) != null) {
                        iInputCallback.onInputSubmitted(str, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
                IInputCallback iInputCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 2) && (iInputCallback = sDefaultImpl) != null) {
                        iInputCallback.onInputTextChanged(str, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IInputCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IInputCallback)) ? new Proxy(iBinder) : (IInputCallback) queryLocalInterface;
        }

        public static IInputCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IInputCallback iInputCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iInputCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iInputCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onInputTextChanged(parcel.readString(), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onInputSubmitted(parcel.readString(), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback);

    void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback);
}
