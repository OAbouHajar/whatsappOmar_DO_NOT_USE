package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.0H0  reason: invalid class name */
public final class AnonymousClass0H0 extends AnonymousClass0H2 {
    public AnonymousClass0H0(Context context, AnonymousClass04d r2) {
        super(context, r2);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        String action;
        int hashCode;
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, A07());
        boolean z2 = false;
        if (registerReceiver == null || registerReceiver.getAction() == null || ((action = registerReceiver.getAction()) != null && (hashCode = action.hashCode()) != -1181163412 && hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK"))) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public IntentFilter A07() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public void A08(Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C06530Wm.A00().A02(C04520Mw.A00, AnonymousClass000.A0h(intent.getAction(), AnonymousClass000.A0r("Received ")));
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        bool = Boolean.TRUE;
                    } else {
                        return;
                    }
                } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    bool = Boolean.FALSE;
                } else {
                    return;
                }
                A06(bool);
            }
        }
    }
}
