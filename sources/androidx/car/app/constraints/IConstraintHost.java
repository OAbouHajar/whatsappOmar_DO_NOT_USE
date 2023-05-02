package androidx.car.app.constraints;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IConstraintHost extends IInterface {

    public class Default implements IConstraintHost {
        public IBinder asBinder() {
            return null;
        }

        public int getContentLimit(int i2) {
            return 0;
        }
    }

    public abstract class Stub extends Binder implements IConstraintHost {
        public static final String DESCRIPTOR = "androidx.car.app.constraints.IConstraintHost";
        public static final int TRANSACTION_getContentLimit = 2;

        public class Proxy implements IConstraintHost {
            public static IConstraintHost sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public int getContentLimit(int i2) {
                int i3;
                IConstraintHost iConstraintHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || (iConstraintHost = sDefaultImpl) == null) {
                        obtain2.readException();
                        i3 = obtain2.readInt();
                    } else {
                        i3 = iConstraintHost.getContentLimit(i2);
                    }
                    return i3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IConstraintHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IConstraintHost)) ? new Proxy(iBinder) : (IConstraintHost) queryLocalInterface;
        }

        public static IConstraintHost getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IConstraintHost iConstraintHost) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iConstraintHost == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iConstraintHost;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                int contentLimit = getContentLimit(AnonymousClass000.A0B(parcel, DESCRIPTOR));
                parcel2.writeNoException();
                parcel2.writeInt(contentLimit);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    int getContentLimit(int i2);
}
