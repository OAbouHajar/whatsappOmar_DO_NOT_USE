package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;

/* renamed from: X.1FQ  reason: invalid class name */
public final class AnonymousClass1FQ implements C19400yN {
    public final AnonymousClass01V A00;

    public AnonymousClass1FQ(AnonymousClass01V r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public String AGT() {
        return "CoreAsyncInit";
    }

    public void AMc() {
        PowerManager A0I = this.A00.A0I();
        if (A0I == null) {
            Log.w("app-init/main pm=null");
        } else {
            Log.i(C18450wi.A06("app-init/async/screen/", A0I.isScreenOn() ? "on" : "off"));
        }
    }
}
