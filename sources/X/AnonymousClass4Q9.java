package X;

import com.obwhatsapp.calling.callgrid.view.CallGrid;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Q9  reason: invalid class name */
public class AnonymousClass4Q9 {
    public final /* synthetic */ CallGrid A00;

    public AnonymousClass4Q9(CallGrid callGrid) {
        this.A00 = callGrid;
    }

    public void A00(C37921px r4) {
        CallGridViewModel callGridViewModel = this.A00.A05;
        AnonymousClass00B.A06(callGridViewModel);
        if (r4.A0F && !r4.A08) {
            callGridViewModel.A0G(r4.A0U);
        }
        StringBuilder A0r = AnonymousClass000.A0r("voip/CallGridViewModel//showVoiceCallParticipantMenu ");
        UserJid userJid = r4.A0U;
        A0r.append(userJid);
        C13680ns.A1V(A0r);
        callGridViewModel.A0A.A0B(userJid);
    }
}
