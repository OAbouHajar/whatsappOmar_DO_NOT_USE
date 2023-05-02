package androidx.car.app.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnCheckedChangeListener extends IInterface {

    public class Default implements IOnCheckedChangeListener {
        public IBinder asBinder() {
            return null;
        }

        public void onCheckedChange(boolean z2, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnCheckedChangeListener {
        public static final String DESCRIPTOR = "androidx.car.app.model.IOnCheckedChangeListener";
        public static final int TRANSACTION_onCheckedChange = 2;

        public class Proxy implements IOnCheckedChangeListener {
            public static IOnCheckedChangeListener sDefaultImpl;
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

            public void onCheckedChange(boolean z2, IOnDoneCallback iOnDoneCallback) {
                IOnCheckedChangeListener iOnCheckedChangeListener;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(AnonymousClass000.A1O(z2 ? 1 : 0) ? 1 : 0);
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(2, obtain, (Parcel) null, 1) && (iOnCheckedChangeListener = sDefaultImpl) != null) {
                        iOnCheckedChangeListener.onCheckedChange(z2, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOnCheckedChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnCheckedChangeListener)) ? new Proxy(iBinder) : (IOnCheckedChangeListener) queryLocalInterface;
        }

        public static IOnCheckedChangeListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnCheckedChangeListener iOnCheckedChangeListener) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iOnCheckedChangeListener == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iOnCheckedChangeListener;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                onCheckedChange(AnonymousClass000.A1O(AnonymousClass000.A0B(parcel, DESCRIPTOR)), AnonymousClass000.A0P(parcel));
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onCheckedChange(boolean z2, IOnDoneCallback iOnDoneCallback);
}
