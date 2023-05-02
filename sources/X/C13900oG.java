package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0oG  reason: invalid class name and case insensitive filesystem */
public class C13900oG extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public C13900oG(Context context) {
        this.A00 = context;
    }

    public static /* synthetic */ void A00(Context context) {
        AtomicReference atomicReference = A01;
        if (atomicReference.get() == null) {
            C13900oG r2 = new C13900oG(context);
            if (atomicReference.compareAndSet((Object) null, r2)) {
                context.registerReceiver(r2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (C13720nx.A09) {
            for (C13720nx A03 : C13720nx.A0A.values()) {
                A03.A03();
            }
        }
        this.A00.unregisterReceiver(this);
    }
}
