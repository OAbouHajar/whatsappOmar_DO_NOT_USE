package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass0Y7;
import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISurfaceCallback extends IInterface {

    public class Default implements ISurfaceCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onFling(float f2, float f3) {
        }

        public void onScale(float f2, float f3, float f4) {
        }

        public void onScroll(float f2, float f3) {
        }

        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSurfaceAvailable(AnonymousClass0Y7 r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSurfaceDestroyed(AnonymousClass0Y7 r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ISurfaceCallback {
        public static final String DESCRIPTOR = "androidx.car.app.ISurfaceCallback";
        public static final int TRANSACTION_onFling = 7;
        public static final int TRANSACTION_onScale = 8;
        public static final int TRANSACTION_onScroll = 6;
        public static final int TRANSACTION_onStableAreaChanged = 4;
        public static final int TRANSACTION_onSurfaceAvailable = 2;
        public static final int TRANSACTION_onSurfaceDestroyed = 5;
        public static final int TRANSACTION_onVisibleAreaChanged = 3;

        public class Proxy implements ISurfaceCallback {
            public static ISurfaceCallback sDefaultImpl;
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

            public void onFling(float f2, float f3) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 7) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onFling(f2, f3);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onScale(float f2, float f3, float f4) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    obtain.writeFloat(f4);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 8) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onScale(f2, f3, f4);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onScroll(float f2, float f3) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 6) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onScroll(f2, f3);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (rect != null) {
                        obtain.writeInt(1);
                        rect.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(4, obtain, (Parcel) null, 1) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onStableAreaChanged(rect, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onSurfaceAvailable(AnonymousClass0Y7 r6, IOnDoneCallback iOnDoneCallback) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    boolean A1U = AnonymousClass000.A1U(obtain, r6, Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(2, obtain, (Parcel) null, A1U ? 1 : 0) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onSurfaceAvailable(r6, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onSurfaceDestroyed(AnonymousClass0Y7 r6, IOnDoneCallback iOnDoneCallback) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    boolean A1U = AnonymousClass000.A1U(obtain, r6, Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(5, obtain, (Parcel) null, A1U ? 1 : 0) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onSurfaceDestroyed(r6, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                ISurfaceCallback iSurfaceCallback;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (rect != null) {
                        obtain.writeInt(1);
                        rect.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(3, obtain, (Parcel) null, 1) && (iSurfaceCallback = sDefaultImpl) != null) {
                        iSurfaceCallback.onVisibleAreaChanged(rect, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISurfaceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISurfaceCallback)) ? new Proxy(iBinder) : (ISurfaceCallback) queryLocalInterface;
        }

        public static ISurfaceCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISurfaceCallback iSurfaceCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iSurfaceCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iSurfaceCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1598968902) {
                Rect rect = null;
                switch (i2) {
                    case 2:
                        onSurfaceAvailable(AnonymousClass000.A0Q(parcel, DESCRIPTOR), AnonymousClass000.A0P(parcel));
                        return true;
                    case 3:
                        if (AnonymousClass000.A0B(parcel, DESCRIPTOR) != 0) {
                            rect = (Rect) Rect.CREATOR.createFromParcel(parcel);
                        }
                        onVisibleAreaChanged(rect, AnonymousClass000.A0P(parcel));
                        return true;
                    case 4:
                        if (AnonymousClass000.A0B(parcel, DESCRIPTOR) != 0) {
                            rect = (Rect) Rect.CREATOR.createFromParcel(parcel);
                        }
                        onStableAreaChanged(rect, AnonymousClass000.A0P(parcel));
                        return true;
                    case 5:
                        onSurfaceDestroyed(AnonymousClass000.A0Q(parcel, DESCRIPTOR), AnonymousClass000.A0P(parcel));
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        onScroll(parcel.readFloat(), parcel.readFloat());
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        onFling(parcel.readFloat(), parcel.readFloat());
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        onScale(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onFling(float f2, float f3);

    void onScale(float f2, float f3, float f4);

    void onScroll(float f2, float f3);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(AnonymousClass0Y7 r1, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(AnonymousClass0Y7 r1, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);
}
