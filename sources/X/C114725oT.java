package X;

import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5oT  reason: invalid class name and case insensitive filesystem */
public class C114725oT extends C111545gY {
    public C114725oT(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }

    public void A03(Intent intent, Bundle bundle) {
        A01().A0J(this.A01);
    }

    public void A04(C108615Or r3) {
        try {
            this.A01 = r3.A9T().A0J(48);
            A01().A0J(this.A01);
        } catch (ClassCastException e2) {
            Log.e(AnonymousClass000.A0g("Bloks: Invalid navigation bar type", e2));
        }
    }
}
