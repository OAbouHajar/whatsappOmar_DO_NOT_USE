package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2CK  reason: invalid class name */
public class AnonymousClass2CK extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass1S3 A00;

    public AnonymousClass2CK(AnonymousClass1S3 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.obwhatsapp.MessageHandler.LOGOUT_ACTION".equals(intent.getAction())) {
            Log.i("xmpp/handler/logout-timer/timeout");
            AnonymousClass1S3 r1 = this.A00;
            AnonymousClass00B.A06(r1.A00);
            if (!r1.A0A.A00()) {
                r1.A00();
                r1.A00.A07();
            } else if (r1.A00.A0L.A00() || r1.A02.A00) {
                r1.A01();
                r1.A09.A00();
            } else {
                C34511kO r12 = r1.A00.A08;
                if (r12 != null) {
                    r12.AdP(false);
                } else {
                    Log.i("xmpp/handler/logout-timer ignoring due to null sending channel");
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("unknown intent received in logout receiver ");
            sb.append(intent);
            Log.w(sb.toString());
        }
    }
}
