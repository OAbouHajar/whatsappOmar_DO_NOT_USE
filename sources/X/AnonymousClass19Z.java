package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.whatsapp.util.Log;

/* renamed from: X.19Z  reason: invalid class name */
public class AnonymousClass19Z extends C16590tJ implements ComponentCallbacks2 {
    public long A00;
    public long A01;
    public final C19870z8 A02;
    public final C17010u2 A03;
    public final C16320sq A04;

    public AnonymousClass19Z(C19870z8 r2, C17010u2 r3, C16980tz r4, C16320sq r5) {
        this.A04 = r5;
        this.A03 = r3;
        this.A02 = r2;
        r4.A00.registerComponentCallbacks(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i2) {
        boolean z2;
        if (i2 >= 60) {
            if (SystemClock.uptimeMillis() > this.A00 + 60000) {
                this.A00 = SystemClock.uptimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append("OnTrimMemory/level: ");
                sb.append(i2);
                sb.append(", trimming memory, app in background");
                Log.i(sb.toString());
                z2 = false;
            } else {
                return;
            }
        } else if (i2 >= 15 && i2 < 20 && SystemClock.uptimeMillis() > this.A01 + AnonymousClass1NO.A0L) {
            this.A01 = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OnTrimMemory/level: ");
            sb2.append(i2);
            sb2.append(", trimming memory, app in foreground");
            Log.i(sb2.toString());
            z2 = true;
        } else {
            return;
        }
        this.A04.Acl(new RunnableRunnableShape0S0110000_I0(this, 19, z2));
    }
}
