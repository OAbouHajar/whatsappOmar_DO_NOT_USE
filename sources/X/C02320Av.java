package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* renamed from: X.0Av  reason: invalid class name and case insensitive filesystem */
public final class C02320Av extends Binder implements IInterface {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public C02320Av(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public int A00(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        C18450wi.A0H(iMultiInstanceInvalidationCallback, 0);
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            int i3 = multiInstanceInvalidationService.A00 + 1;
            multiInstanceInvalidationService.A00 = i3;
            Integer valueOf = Integer.valueOf(i3);
            if (remoteCallbackList.register(iMultiInstanceInvalidationCallback, valueOf)) {
                multiInstanceInvalidationService.A03.put(valueOf, str);
                i2 = i3;
            } else {
                multiInstanceInvalidationService.A00--;
            }
        }
        return i2;
    }

    public void A01(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
        C18450wi.A0H(iMultiInstanceInvalidationCallback, 0);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            remoteCallbackList.unregister(iMultiInstanceInvalidationCallback);
            multiInstanceInvalidationService.A03.remove(Integer.valueOf(i2));
        }
    }

    public void A02(String[] strArr, int i2) {
        Parcel obtain;
        C18450wi.A0H(strArr, 1);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            Map map = multiInstanceInvalidationService.A03;
            String str = (String) AnonymousClass000.A0Y(map, i2);
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                int i3 = 0;
                while (i3 < beginBroadcast) {
                    try {
                        Object broadcastCookie = remoteCallbackList.getBroadcastCookie(i3);
                        C18450wi.A0M(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) AnonymousClass000.A0Y(map, intValue);
                        if (i2 != intValue && str.equals(str2)) {
                            try {
                                C07690cJ r1 = (C07690cJ) ((IMultiInstanceInvalidationCallback) remoteCallbackList.getBroadcastItem(i3));
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                obtain.writeStringArray(strArr);
                                r1.A00.transact(1, obtain, (Parcel) null, 1);
                                obtain.recycle();
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            } catch (Throwable th) {
                                obtain.recycle();
                                throw th;
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        remoteCallbackList.finishBroadcast();
                        throw th2;
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        }
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IMultiInstanceInvalidationCallback r1;
        IMultiInstanceInvalidationCallback r12;
        if (i2 >= 1) {
            if (i2 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                if (i2 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        r1 = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        r1 = (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) ? new C07690cJ(readStrongBinder) : (IMultiInstanceInvalidationCallback) queryLocalInterface;
                    }
                    int A002 = A00(r1, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(A002);
                    return true;
                } else if (i2 == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        r12 = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        r12 = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) ? new C07690cJ(readStrongBinder2) : (IMultiInstanceInvalidationCallback) queryLocalInterface2;
                    }
                    A01(r12, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                } else if (i2 == 3) {
                    A02(parcel.createStringArray(), parcel.readInt());
                    return true;
                }
            } else if (i2 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
        return super.onTransact(i2, parcel, parcel2, i3);
    }
}
