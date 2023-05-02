package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.0A5  reason: invalid class name */
public class AnonymousClass0A5 extends Service implements C001300o {
    public final C05060Pc A00 = new C05060Pc(this);

    public C009704q getLifecycle() {
        return this.A00.A02;
    }

    public IBinder onBind(Intent intent) {
        this.A00.A00(C011405n.ON_START);
        return null;
    }

    public void onCreate() {
        this.A00.A00(C011405n.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C05060Pc r1 = this.A00;
        r1.A00(C011405n.ON_STOP);
        r1.A00(C011405n.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i2) {
        this.A00.A00(C011405n.ON_START);
        super.onStart(intent, i2);
    }
}
