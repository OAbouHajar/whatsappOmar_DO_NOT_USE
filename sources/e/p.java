package e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: XFMFile */
public final class p extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final q f1702a;

    public p(q qVar) {
        this.f1702a = qVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            boolean equals = "android.intent.action.AIRPLANE_MODE".equals(action);
            q qVar = this.f1702a;
            if (equals) {
                if (intent.hasExtra("state")) {
                    boolean booleanExtra = intent.getBooleanExtra("state", false);
                    n nVar = qVar.f1711i;
                    nVar.sendMessage(nVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb = o0.f1699a;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                n nVar2 = qVar.f1711i;
                nVar2.sendMessage(nVar2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }
}
