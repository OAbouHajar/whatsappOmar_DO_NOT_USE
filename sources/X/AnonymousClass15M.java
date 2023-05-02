package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.15M  reason: invalid class name */
public class AnonymousClass15M extends BroadcastReceiver implements C19400yN {
    public boolean A00;
    public final Context A01;
    public final Set A02 = Collections.newSetFromMap(new ConcurrentHashMap());

    public AnonymousClass15M(Context context) {
        this.A01 = context;
    }

    public String AGT() {
        return "HeadsetPluggedStateMonitor";
    }

    public void AMc() {
        this.A01.registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void onReceive(Context context, Intent intent) {
        boolean z2 = false;
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra >= 1) {
            z2 = true;
        }
        if (z2 != this.A00) {
            this.A00 = z2;
            for (C19620yj AS3 : this.A02) {
                AS3.AS3(z2);
            }
        }
        StringBuilder sb = new StringBuilder("HeadsetPluggedStateMonitor/headset ");
        sb.append(intExtra);
        Log.i(sb.toString());
    }
}
