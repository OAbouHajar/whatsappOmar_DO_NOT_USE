package X;

import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity;

/* renamed from: X.28A  reason: invalid class name */
public abstract class AnonymousClass28A {
    public void A00() {
    }

    public void A01() {
        AnonymousClass28E r3 = (AnonymousClass28E) this;
        r3.A00.runOnUiThread(new RunnableRunnableShape6S0100000_I0_5(r3, 44));
    }

    public void A02() {
        AnonymousClass28E r3 = (AnonymousClass28E) this;
        r3.A00.runOnUiThread(new RunnableRunnableShape6S0100000_I0_5(r3, 43));
    }

    public void A03() {
        RegisterAsCompanionActivity registerAsCompanionActivity = ((AnonymousClass28E) this).A00;
        Intent intent = new Intent();
        intent.setClassName(registerAsCompanionActivity.getPackageName(), "com.obwhatsapp.companionmode.registration.CompanionBootstrapActivity");
        intent.addFlags(268468224);
        registerAsCompanionActivity.startActivity(intent);
    }

    public void A04(String str) {
        AnonymousClass28E r3 = (AnonymousClass28E) this;
        r3.A00.runOnUiThread(new RunnableRunnableShape0S1100000_I0(27, str, r3));
    }
}
