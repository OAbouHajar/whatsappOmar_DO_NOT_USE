package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4Pz  reason: invalid class name and case insensitive filesystem */
public final class C85794Pz {
    public final Map A00 = AnonymousClass000.A0x();

    public final void A00(IBinder iBinder) {
        Map map = this.A00;
        synchronized (map) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new C67423bX();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                A0z.getValue();
                try {
                    new C66123Xw();
                    throw AnonymousClass000.A0Z();
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(A0z.getKey());
                    String valueOf2 = String.valueOf((Object) null);
                    StringBuilder A0g = C13690nt.A0g(valueOf.length() + 32 + valueOf2.length());
                    A0g.append("onPostInitHandler: Didn't add: ");
                    A0g.append(valueOf);
                    A0g.append("/");
                    Log.w("WearableClient", AnonymousClass000.A0h(valueOf2, A0g));
                }
            }
        }
    }
}
