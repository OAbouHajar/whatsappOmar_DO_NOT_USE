package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape0S0300100_I0;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.0tX  reason: invalid class name and case insensitive filesystem */
public final class C16720tX extends BroadcastReceiver {
    public RunnableRunnableShape0S0300100_I0 A00;

    public C16720tX(RunnableRunnableShape0S0300100_I0 runnableRunnableShape0S0300100_I0) {
        this.A00 = runnableRunnableShape0S0300100_I0;
    }

    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        RunnableRunnableShape0S0300100_I0 runnableRunnableShape0S0300100_I0 = this.A00;
        if (runnableRunnableShape0S0300100_I0 != null && (connectivityManager = (ConnectivityManager) runnableRunnableShape0S0300100_I0.A00().getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (FirebaseInstanceId.A03()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.A02(this.A00, 0);
            this.A00.A00().unregisterReceiver(this);
            this.A00 = null;
        }
    }
}
