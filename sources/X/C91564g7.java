package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* renamed from: X.4g7  reason: invalid class name and case insensitive filesystem */
public final class C91564g7 implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ C15770rp A01;

    public C91564g7(C15770rp r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2;
        int i3;
        C15770rp r5 = this.A01;
        if (iBinder == null) {
            synchronized (r5.A0M) {
                i2 = r5.A02;
            }
            if (i2 == 3) {
                r5.A0D = true;
                i3 = 5;
            } else {
                i3 = 4;
            }
            Handler handler = r5.A0G;
            handler.sendMessage(handler.obtainMessage(i3, r5.A0C.get(), 16));
            return;
        }
        synchronized (r5.A0N) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            r5.A09 = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new C98034qz(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }
        int i4 = this.A00;
        Handler handler2 = r5.A0G;
        handler2.sendMessage(handler2.obtainMessage(7, i4, -1, new AnonymousClass3YM(r5, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C15770rp r2 = this.A01;
        synchronized (r2.A0N) {
            r2.A09 = null;
        }
        Handler handler = r2.A0G;
        handler.sendMessage(handler.obtainMessage(6, this.A00, 1));
    }
}
