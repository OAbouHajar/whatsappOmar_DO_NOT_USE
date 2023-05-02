package X;

import com.obwhatsapp.WaTextView;
import com.obwhatsapp.registration.EULA;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.Locale;

/* renamed from: X.4zE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102604zE implements C108825Pq {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ ViewOnClickCListenerShape0S0200000_I0 A01;

    public /* synthetic */ C102604zE(WaTextView waTextView, ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0) {
        this.A01 = viewOnClickCListenerShape0S0200000_I0;
        this.A00 = waTextView;
    }

    public final void ASZ() {
        ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0 = this.A01;
        WaTextView waTextView = this.A00;
        EULA eula = (EULA) viewOnClickCListenerShape0S0200000_I0.A00;
        waTextView.setText(AnonymousClass3BW.A00(C33601iq.A01(Locale.getDefault())));
        if (eula.A0V) {
            eula.A0V = false;
            eula.A0F.A00();
            if (C15450qv.A0A()) {
                eula.recreate();
                return;
            }
            eula.finish();
            eula.startActivity(eula.getIntent());
            eula.overridePendingTransition(0, 0);
        }
    }
}
