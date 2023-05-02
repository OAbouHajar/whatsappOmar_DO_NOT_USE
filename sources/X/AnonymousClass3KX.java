package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.phoneid.PhoneIdRequestReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.3KX  reason: invalid class name */
public abstract class AnonymousClass3KX extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C46982Ha A00 = ((PhoneIdRequestReceiver) this).A00.A00();
        if ("com.facebook.GET_PHONE_ID".equals(intent.getAction())) {
            Bundle resultExtras = getResultExtras(true);
            PendingIntent pendingIntent = (PendingIntent) resultExtras.getParcelable("auth");
            if (pendingIntent == null) {
                Log.e(AnonymousClass000.A0g("phoneid-request-receiver/on-receive invalid auth intent; data=", resultExtras));
            } else if (C46772Ge.A02(pendingIntent, context)) {
                Bundle A0D = C13690nt.A0D();
                A0D.putLong("timestamp", A00.A00);
                setResult(-1, A00.A01, A0D);
            }
        }
    }
}
