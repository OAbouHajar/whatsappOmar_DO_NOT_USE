package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.2Hw  reason: invalid class name and case insensitive filesystem */
public class C47172Hw implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C19010xc A01;
    public final /* synthetic */ AnonymousClass12R A02;

    public C47172Hw(ConditionVariable conditionVariable, C19010xc r2, AnonymousClass12R r3) {
        this.A01 = r2;
        this.A00 = conditionVariable;
        this.A02 = r3;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
        C19010xc r2 = this.A01;
        r2.A08.A02(this.A02);
        r2.A07.A03();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
