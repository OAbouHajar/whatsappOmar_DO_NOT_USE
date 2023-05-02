package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2KH  reason: invalid class name */
public class AnonymousClass2KH extends BroadcastReceiver {
    public AnonymousClass108 A00;
    public final Object A01 = new Object();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (AnonymousClass108) ((C16150sX) ((AnonymousClass01F) AnonymousClass2IF.A01(context))).AHh.get();
                    this.A02 = true;
                }
            }
        }
        Log.i("PaymentMethodUpdateNotification/dismiss");
        this.A00.A00();
    }
}
