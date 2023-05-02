package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: X.0Gz  reason: invalid class name and case insensitive filesystem */
public final class C03040Gz extends AnonymousClass0H2 {
    public C03040Gz(Context context, AnonymousClass04d r2) {
        super(context, r2);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C06530Wm.A00();
            Log.e(C04490Mt.A00, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z2 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public IntentFilter A07() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void A08(Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C06530Wm.A00().A02(C04490Mt.A00, AnonymousClass000.A0h(intent.getAction(), AnonymousClass000.A0r("Received ")));
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        bool = Boolean.FALSE;
                    } else {
                        return;
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    bool = Boolean.TRUE;
                } else {
                    return;
                }
                A06(bool);
            }
        }
    }
}
