package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* renamed from: X.0h7  reason: invalid class name and case insensitive filesystem */
public class C10430h7 implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ ConstraintProxyUpdateReceiver A03;

    public C10430h7(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver) {
        this.A03 = constraintProxyUpdateReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    public void run() {
        try {
            Intent intent = this.A02;
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("Updating proxies: (BatteryNotLowProxy (");
            A0o.append(booleanExtra);
            A0o.append("), BatteryChargingProxy (");
            A0o.append(booleanExtra2);
            A0o.append("), StorageNotLowProxy (");
            A0o.append(booleanExtra3);
            A0o.append("), NetworkStateProxy (");
            A0o.append(booleanExtra4);
            C06530Wm.A00().A02(ConstraintProxyUpdateReceiver.A00, AnonymousClass000.A0h("), ", A0o));
            Context context = this.A01;
            AnonymousClass0TB.A00(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            AnonymousClass0TB.A00(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            AnonymousClass0TB.A00(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            AnonymousClass0TB.A00(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.A00.finish();
        }
    }
}
