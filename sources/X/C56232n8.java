package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.util.Log;

/* renamed from: X.2n8  reason: invalid class name and case insensitive filesystem */
public final class C56232n8 extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass1DQ A00;

    public C56232n8(AnonymousClass1DQ r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        String A06;
        C18450wi.A0H(intent, 1);
        AnonymousClass1DQ r2 = this.A00;
        if (!C15450qv.A05()) {
            A06 = "BackgroundRestrictionManager; received event on unsupported OS version.";
        } else if (!"android.net.conn.RESTRICT_BACKGROUND_CHANGED".equals(intent.getAction())) {
            A06 = C18450wi.A06("BackgroundRestrictionManager; received unsupported intent: ", intent);
        } else {
            Object obj = r2.A02.get();
            C18450wi.A0B(obj);
            for (AnonymousClass1C0 r3 : (Iterable) obj) {
                if (r3.A02.A03()) {
                    r3.A03.execute(new RunnableRunnableShape4S0100000_I0_3(r3, 38));
                }
            }
            return;
        }
        Log.w(A06);
    }
}
