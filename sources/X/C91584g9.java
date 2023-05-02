package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.whatsapp.util.Log;

/* renamed from: X.4g9  reason: invalid class name and case insensitive filesystem */
public class C91584g9 implements ServiceConnection {
    public final String A00;
    public final boolean A01;
    public final /* synthetic */ AnonymousClass115 A02;

    public C91584g9(AnonymousClass115 r1, String str, boolean z2) {
        this.A02 = r1;
        this.A00 = str;
        this.A01 = z2;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AnonymousClass115 r2 = this.A02;
        try {
            if (r2.A02.A01(componentName.getPackageName()).A03 && "com.facebook.stella".equals(componentName.getPackageName())) {
                r2.A05.execute(new RunnableRunnableShape14S0200000_I1_2(this, 31, iBinder));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("CallbackServiceProxy/service component mismatch.");
        r2.A00.A00.unbindService(this);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
