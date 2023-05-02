package androidx.work.impl.diagnostics;

import X.AnonymousClass022;
import X.C006903e;
import X.C06530Wm;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = C06530Wm.A01("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C06530Wm A002 = C06530Wm.A00();
            String str = A00;
            A002.A02(str, "Requesting diagnostics");
            try {
                AnonymousClass022.A01(context).A07(new C006903e(DiagnosticsWorker.class).A00());
            } catch (IllegalStateException e2) {
                C06530Wm.A00();
                Log.e(str, "WorkManager is not initialized", e2);
            }
        }
    }
}
