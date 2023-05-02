package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2cx  reason: invalid class name and case insensitive filesystem */
public class C52052cx extends BroadcastReceiver {
    public final /* synthetic */ HomeActivity A00;
    public final /* synthetic */ Runnable A01;

    public C52052cx(HomeActivity homeActivity, Runnable runnable) {
        this.A00 = homeActivity;
        this.A01 = runnable;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("home/resume/unlocked received ACTION_USER_PRESENT");
        try {
            HomeActivity homeActivity = this.A00;
            homeActivity.unregisterReceiver(this);
            C14870pt r0 = homeActivity.A05;
            Runnable runnable = this.A01;
            r0.A0J(runnable);
            homeActivity.A05.A0L(runnable, 500);
            homeActivity.A08 = null;
        } catch (Exception e2) {
            Log.e("home/resume/unlocked received ACTION_USER_PRESENT ", e2);
        }
    }
}
