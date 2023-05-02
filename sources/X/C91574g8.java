package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.4g8  reason: invalid class name and case insensitive filesystem */
public class C91574g8 implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C19760yx A01;

    public C91574g8(ConditionVariable conditionVariable, C19760yx r2) {
        this.A01 = r2;
        this.A00 = conditionVariable;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
