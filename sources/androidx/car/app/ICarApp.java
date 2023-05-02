package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass0Y7;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICarApp extends IInterface {

    public class Default implements ICarApp {
        public IBinder asBinder() {
            return null;
        }

        public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        }

        public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        }

        public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }

        public void onHandshakeCompleted(AnonymousClass0Y7 r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ICarApp {
        public static final String DESCRIPTOR = "androidx.car.app.ICarApp";
        public static final int TRANSACTION_getAppInfo = 10;
        public static final int TRANSACTION_getManager = 9;
        public static final int TRANSACTION_onAppCreate = 2;
        public static final int TRANSACTION_onAppPause = 5;
        public static final int TRANSACTION_onAppResume = 4;
        public static final int TRANSACTION_onAppStart = 3;
        public static final int TRANSACTION_onAppStop = 6;
        public static final int TRANSACTION_onConfigurationChanged = 8;
        public static final int TRANSACTION_onHandshakeCompleted = 11;
        public static final int TRANSACTION_onNewIntent = 7;

        public class Proxy implements ICarApp {
            public static ICarApp sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 10) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.getAppInfo(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 9) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.getManager(str, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCarHost != null ? iCarHost.asBinder() : null);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(2, obtain, (Parcel) null, 1) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onAppCreate(iCarHost, intent, configuration, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppPause(IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 5) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onAppPause(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppResume(IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 4) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onAppResume(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppStart(IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 3) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onAppStart(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppStop(IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    IBinder iBinder = null;
                    if (iOnDoneCallback != null) {
                        iBinder = iOnDoneCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!AnonymousClass000.A1S(this.mRemote, obtain, 6) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onAppStop(iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(8, obtain, (Parcel) null, 1) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onConfigurationChanged(configuration, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onHandshakeCompleted(AnonymousClass0Y7 r6, IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    boolean A1U = AnonymousClass000.A1U(obtain, r6, Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(11, obtain, (Parcel) null, A1U ? 1 : 0) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onHandshakeCompleted(r6, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
                ICarApp iCarApp;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iOnDoneCallback != null ? iOnDoneCallback.asBinder() : null);
                    if (!this.mRemote.transact(7, obtain, (Parcel) null, 1) && (iCarApp = sDefaultImpl) != null) {
                        iCarApp.onNewIntent(intent, iOnDoneCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICarApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarApp)) ? new Proxy(iBinder) : (ICarApp) queryLocalInterface;
        }

        public static ICarApp getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICarApp iCarApp) {
            if (Proxy.sDefaultImpl != null) {
                throw AnonymousClass000.A0V("setDefaultImpl() called twice");
            } else if (iCarApp == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iCarApp;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.res.Configuration} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.content.res.Configuration} */
        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v5, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r1v13 */
        /* JADX WARNING: type inference failed for: r1v14 */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            /*
                r5 = this;
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r4 = 1
                java.lang.String r0 = "androidx.car.app.ICarApp"
                if (r6 == r1) goto L_0x00c0
                r1 = 0
                switch(r6) {
                    case 2: goto L_0x008f;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x0079;
                    case 5: goto L_0x006e;
                    case 6: goto L_0x0063;
                    case 7: goto L_0x004d;
                    case 8: goto L_0x0037;
                    case 9: goto L_0x0028;
                    case 10: goto L_0x001d;
                    case 11: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x0011:
                X.0Y7 r1 = X.AnonymousClass000.A0Q(r7, r0)
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onHandshakeCompleted(r1, r0)
                return r4
            L_0x001d:
                r7.enforceInterface(r0)
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.getAppInfo(r0)
                return r4
            L_0x0028:
                r7.enforceInterface(r0)
                java.lang.String r1 = r7.readString()
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.getManager(r1, r0)
                return r4
            L_0x0037:
                int r0 = X.AnonymousClass000.A0B(r7, r0)
                if (r0 == 0) goto L_0x0045
                android.os.Parcelable$Creator r0 = android.content.res.Configuration.CREATOR
                java.lang.Object r1 = r0.createFromParcel(r7)
                android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            L_0x0045:
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onConfigurationChanged(r1, r0)
                return r4
            L_0x004d:
                int r0 = X.AnonymousClass000.A0B(r7, r0)
                if (r0 == 0) goto L_0x005b
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r1 = r0.createFromParcel(r7)
                android.content.Intent r1 = (android.content.Intent) r1
            L_0x005b:
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onNewIntent(r1, r0)
                return r4
            L_0x0063:
                r7.enforceInterface(r0)
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onAppStop(r0)
                return r4
            L_0x006e:
                r7.enforceInterface(r0)
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onAppPause(r0)
                return r4
            L_0x0079:
                r7.enforceInterface(r0)
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onAppResume(r0)
                return r4
            L_0x0084:
                r7.enforceInterface(r0)
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onAppStart(r0)
                return r4
            L_0x008f:
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                androidx.car.app.ICarHost r3 = androidx.car.app.ICarHost.Stub.asInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00be
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r7)
                android.content.Intent r2 = (android.content.Intent) r2
            L_0x00a8:
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00b6
                android.os.Parcelable$Creator r0 = android.content.res.Configuration.CREATOR
                java.lang.Object r1 = r0.createFromParcel(r7)
                android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            L_0x00b6:
                androidx.car.app.IOnDoneCallback r0 = X.AnonymousClass000.A0P(r7)
                r5.onAppCreate(r3, r2, r1, r0)
                return r4
            L_0x00be:
                r2 = r1
                goto L_0x00a8
            L_0x00c0:
                r8.writeString(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.ICarApp.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void getAppInfo(IOnDoneCallback iOnDoneCallback);

    void getManager(String str, IOnDoneCallback iOnDoneCallback);

    void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onAppPause(IOnDoneCallback iOnDoneCallback);

    void onAppResume(IOnDoneCallback iOnDoneCallback);

    void onAppStart(IOnDoneCallback iOnDoneCallback);

    void onAppStop(IOnDoneCallback iOnDoneCallback);

    void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onHandshakeCompleted(AnonymousClass0Y7 r1, IOnDoneCallback iOnDoneCallback);

    void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback);
}
