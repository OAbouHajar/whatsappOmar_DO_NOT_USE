package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.3KZ  reason: invalid class name */
public final class AnonymousClass3KZ extends BroadcastReceiver {
    public final AnonymousClass1SB A00;

    public AnonymousClass3KZ(AnonymousClass1SB r1) {
        AnonymousClass00B.A06(r1);
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (getResultCode() == -1) {
            C46982Ha r8 = new C46982Ha(getResultData(), getResultExtras(true).getLong("timestamp", Long.MAX_VALUE));
            intent.getPackage();
            String str = intent.getPackage();
            AnonymousClass1SB r6 = this.A00;
            C46982Ha A002 = r6.A00();
            if (r8.A01 != null && r8.A00 < A002.A00) {
                r6.A01(r8);
                StringBuilder A0r = AnonymousClass000.A0r("updated phone id from ");
                A0r.append(A002);
                A0r.append(" to ");
                A0r.append(r8);
                A0r.append(" based on package ");
                Log.i(AnonymousClass000.A0h(str, A0r));
                return;
            }
            return;
        }
        intent.getPackage();
    }
}
