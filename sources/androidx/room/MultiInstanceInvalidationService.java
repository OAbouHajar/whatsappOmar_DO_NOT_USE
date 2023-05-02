package androidx.room;

import X.AnonymousClass0BM;
import X.C02320Av;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final RemoteCallbackList A01 = new AnonymousClass0BM(this);
    public final C02320Av A02 = new C02320Av(this);
    public final Map A03 = new LinkedHashMap();

    public IBinder onBind(Intent intent) {
        return this.A02;
    }
}
