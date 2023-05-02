package X;

import android.content.Intent;
import com.obwhatsapp.companionmode.registration.CompanionBootstrapActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3oJ  reason: invalid class name */
public class AnonymousClass3oJ extends AnonymousClass28A {
    public final /* synthetic */ CompanionBootstrapActivity A00;

    public AnonymousClass3oJ(CompanionBootstrapActivity companionBootstrapActivity) {
        this.A00 = companionBootstrapActivity;
    }

    public void A00() {
        CompanionBootstrapActivity companionBootstrapActivity = this.A00;
        if (companionBootstrapActivity.A03.A01()) {
            Log.w("CompanionBootstrapActivity/onBootstrapSuccessful pre-registration killswitch set");
            return;
        }
        Intent A04 = C14750ph.A04(companionBootstrapActivity);
        A04.addFlags(268468224);
        companionBootstrapActivity.startActivity(A04);
    }

    public void A01() {
    }

    public void A02() {
    }

    public void A03() {
    }

    public void A04(String str) {
    }
}
