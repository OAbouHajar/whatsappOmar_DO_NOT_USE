package androidx.car.app.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnItemVisibilityChangedListener extends IInterface {

    public class Default implements IOnItemVisibilityChangedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onItemVisibilityChanged(int i2, int i3, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnItemVisibilityChangedListener {
        public static final String DESCRIPTOR = "androidx.car.app.model.IOnItemVisibilityChangedListener";
        public static final int TRANSACTION_onItemVisibilityChanged = 2;

        public class Proxy implements IOnItemVisibilityChangedListener {
            public static IOnItemVisibilityChangedListener sDefaultImpl;
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

            public void onItemVisibilityChanged(int i2, int i3, IOnDoneCallback iOnDoneCallback) {
                IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 2) && (iOnItemVisibilityChangedListener = sDefaultImpl) != null) {
                        iOnItemVisibilityChangedListener.onItemVisibilityChanged(i2, i3, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOnItemVisibilityChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnItemVisibilityChangedListener)) ? new Proxy(iBinder) : (IOnItemVisibilityChangedListener) queryLocalInterface;
        }

        public static IOnItemVisibilityChangedListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iOnItemVisibilityChangedListener == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iOnItemVisibilityChangedListener;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                onItemVisibilityChanged(AnonymousClass000.A0B(parcel, DESCRIPTOR), parcel.readInt(), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onItemVisibilityChanged(int i2, int i3, IOnDoneCallback iOnDoneCallback);
}
