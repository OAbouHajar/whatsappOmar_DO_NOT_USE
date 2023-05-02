package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.4GZ  reason: invalid class name */
public final class AnonymousClass4GZ {
    public final Messenger A00;
    public final C14450pC A01;

    public AnonymousClass4GZ(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.A01 = new C14450pC(iBinder);
        } else {
            Log.w("MessengerIpcClient", C13680ns.A0g(String.valueOf(interfaceDescriptor), "Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
