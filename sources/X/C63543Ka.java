package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;

/* renamed from: X.3Ka  reason: invalid class name and case insensitive filesystem */
public final class C63543Ka extends BroadcastReceiver {
    public final /* synthetic */ C55082io A00;

    public C63543Ka(C55082io r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        C55082io r3 = this.A00;
        r3.A06.post(new RunnableRunnableShape17S0100000_I1((Object) r3, 0));
    }
}
