package androidx.car.app;

import X.AnonymousClass000;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;

public interface IAppHost extends IInterface {

    public class Default implements IAppHost {
        public IBinder asBinder() {
            return null;
        }

        public void invalidate() {
        }

        public void sendLocation(Location location) {
        }

        public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
        }

        public void showToast(CharSequence charSequence, int i2) {
        }
    }

    public abstract class Stub extends Binder implements IAppHost {
        public static final String DESCRIPTOR = "androidx.car.app.IAppHost";
        public static final int TRANSACTION_invalidate = 2;
        public static final int TRANSACTION_sendLocation = 5;
        public static final int TRANSACTION_setSurfaceCallback = 4;
        public static final int TRANSACTION_showToast = 3;

        public class Proxy implements IAppHost {
            public static IAppHost sDefaultImpl;
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

            public void invalidate() {
                IAppHost iAppHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || (iAppHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iAppHost.invalidate();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void sendLocation(Location location) {
                IAppHost iAppHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || (iAppHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iAppHost.sendLocation(location);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
                IAppHost iAppHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iSurfaceCallback != null ? iSurfaceCallback.asBinder() : null);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || (iAppHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iAppHost.setSurfaceCallback(iSurfaceCallback);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showToast(CharSequence charSequence, int i2) {
                IAppHost iAppHost;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || (iAppHost = sDefaultImpl) == null) {
                        obtain2.readException();
                    } else {
                        iAppHost.showToast(charSequence, i2);
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

        public static IAppHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppHost)) ? new Proxy(iBinder) : (IAppHost) queryLocalInterface;
        }

        public static IAppHost getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAppHost iAppHost) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iAppHost == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iAppHost;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.location.Location} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r1v7 */
        /* JADX WARNING: type inference failed for: r1v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 2
                r3 = 1
                java.lang.String r2 = "androidx.car.app.IAppHost"
                if (r5 == r0) goto L_0x0046
                r0 = 3
                r1 = 0
                if (r5 == r0) goto L_0x0030
                r0 = 4
                if (r5 == r0) goto L_0x004d
                r0 = 5
                if (r5 == r0) goto L_0x001e
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x001a
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x001a:
                r7.writeString(r2)
                return r3
            L_0x001e:
                int r0 = X.AnonymousClass000.A0B(r6, r2)
                if (r0 == 0) goto L_0x002c
                android.os.Parcelable$Creator r0 = android.location.Location.CREATOR
                java.lang.Object r1 = r0.createFromParcel(r6)
                android.location.Location r1 = (android.location.Location) r1
            L_0x002c:
                r4.sendLocation(r1)
                goto L_0x005b
            L_0x0030:
                int r0 = X.AnonymousClass000.A0B(r6, r2)
                if (r0 == 0) goto L_0x003e
                android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r1 = r0.createFromParcel(r6)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            L_0x003e:
                int r0 = r6.readInt()
                r4.showToast(r1, r0)
                goto L_0x005b
            L_0x0046:
                r6.enforceInterface(r2)
                r4.invalidate()
                goto L_0x005b
            L_0x004d:
                r6.enforceInterface(r2)
                android.os.IBinder r0 = r6.readStrongBinder()
                androidx.car.app.ISurfaceCallback r0 = androidx.car.app.ISurfaceCallback.Stub.asInterface(r0)
                r4.setSurfaceCallback(r0)
            L_0x005b:
                r7.writeNoException()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.IAppHost.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void invalidate();

    void sendLocation(Location location);

    void setSurfaceCallback(ISurfaceCallback iSurfaceCallback);

    void showToast(CharSequence charSequence, int i2);
}
