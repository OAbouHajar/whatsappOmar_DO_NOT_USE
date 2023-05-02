package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2CA  reason: invalid class name */
public class AnonymousClass2CA extends BroadcastReceiver {
    public final Object A00 = new Object();
    public volatile boolean A01 = false;
    public final /* synthetic */ AnonymousClass1HJ A02;

    public AnonymousClass2CA(AnonymousClass1HJ r2) {
        this.A02 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2IF.A01(context);
                    this.A01 = true;
                }
            }
        }
        if (!"com.obwhatsapp.alarm.CLIENT_PING_TIMEOUT".equals(intent.getAction())) {
            StringBuilder sb = new StringBuilder("xmpp/client-ping/timeout/receiver; unexpected intent: ");
            sb.append(intent);
            Log.w(sb.toString());
            return;
        }
        Log.i("xmpp/client-ping/timeout/receiver");
        this.A02.A04();
    }
}
