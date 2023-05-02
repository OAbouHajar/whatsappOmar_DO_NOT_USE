package X;

import android.content.Context;
import android.content.IntentFilter;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.util.Log;

/* renamed from: X.1DQ  reason: invalid class name */
public final class AnonymousClass1DQ implements C19400yN {
    public final Context A00;
    public final C56232n8 A01 = new C56232n8(this);
    public final AnonymousClass01D A02;

    public AnonymousClass1DQ(Context context, AnonymousClass01D r3) {
        C18450wi.A0H(r3, 2);
        this.A00 = context;
        this.A02 = r3;
    }

    public String AGT() {
        return "BackgroundRestrictionManager";
    }

    public void AMc() {
        if (!C15450qv.A05()) {
            Log.w("BackgroundRestrictionManager; init on unsupported OS version.");
            return;
        }
        this.A00.registerReceiver(this.A01, new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"));
        Object obj = this.A02.get();
        C18450wi.A0B(obj);
        for (AnonymousClass1C0 r3 : (Iterable) obj) {
            if (r3.A02.A03()) {
                r3.A03.execute(new RunnableRunnableShape4S0100000_I0_3(r3, 38));
            }
        }
    }
}
