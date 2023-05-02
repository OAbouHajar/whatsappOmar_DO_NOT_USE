package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IPanModeListener extends IInterface {

    public class Default implements IPanModeListener {
        public IBinder asBinder() {
            return null;
        }

        public void onPanModeChanged(boolean z2, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IPanModeListener {
        public static final String DESCRIPTOR = "androidx.car.app.navigation.model.IPanModeListener";
        public static final int TRANSACTION_onPanModeChanged = 2;

        public class Proxy implements IPanModeListener {
            public static IPanModeListener sDefaultImpl;
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

            public void onPanModeChanged(boolean z2, IOnDoneCallback iOnDoneCallback) {
                IPanModeListener iPanModeListener;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(AnonymousClass000.A1O(z2 ? 1 : 0) ? 1 : 0);
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(2, obtain, (Parcel) null, 1) && (iPanModeListener = sDefaultImpl) != null) {
                        iPanModeListener.onPanModeChanged(z2, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPanModeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPanModeListener)) ? new Proxy(iBinder) : (IPanModeListener) queryLocalInterface;
        }

        public static IPanModeListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPanModeListener iPanModeListener) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iPanModeListener == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iPanModeListener;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                onPanModeChanged(AnonymousClass000.A1O(AnonymousClass000.A0B(parcel, DESCRIPTOR)), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onPanModeChanged(boolean z2, IOnDoneCallback iOnDoneCallback);
}
