package androidx.car.app.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnSelectedListener extends IInterface {

    public class Default implements IOnSelectedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onSelected(int i2, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnSelectedListener {
        public static final String DESCRIPTOR = "androidx.car.app.model.IOnSelectedListener";
        public static final int TRANSACTION_onSelected = 2;

        public class Proxy implements IOnSelectedListener {
            public static IOnSelectedListener sDefaultImpl;
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

            public void onSelected(int i2, IOnDoneCallback iOnDoneCallback) {
                IOnSelectedListener iOnSelectedListener;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i2);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 2) && (iOnSelectedListener = sDefaultImpl) != null) {
                        iOnSelectedListener.onSelected(i2, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOnSelectedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnSelectedListener)) ? new Proxy(iBinder) : (IOnSelectedListener) queryLocalInterface;
        }

        public static IOnSelectedListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnSelectedListener iOnSelectedListener) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iOnSelectedListener == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iOnSelectedListener;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                onSelected(AnonymousClass000.A0B(parcel, DESCRIPTOR), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onSelected(int i2, IOnDoneCallback iOnDoneCallback);
}
