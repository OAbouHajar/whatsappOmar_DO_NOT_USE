package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.116  reason: invalid class name */
public class AnonymousClass116 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();

    public final void A00() {
        this.A00.post(new RunnableRunnableShape14S0100000_I0_13((Object) this, 22));
    }

    public void A01(Context context, Class cls) {
        StringBuilder sb = new StringBuilder("FgServiceManager/stopService ");
        sb.append(cls);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.add(cls);
            }
            A00();
            return;
        }
        context.stopService(new Intent(context, cls));
    }

    public void A02(C28291Vi r4) {
        synchronized (this) {
            Class<?> cls = r4.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("FgServiceManager register:");
            sb.append(cls);
            Log.i(sb.toString());
            this.A01.put(cls, r4);
        }
        A00();
    }

    public boolean A03(Context context, Intent intent, Class cls) {
        StringBuilder sb = new StringBuilder("FgServiceManager/startService ");
        sb.append(cls);
        Log.i(sb.toString());
        intent.setClass(context, cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.remove(cls);
            }
        }
        return C446524y.A00(context, intent);
    }
}
