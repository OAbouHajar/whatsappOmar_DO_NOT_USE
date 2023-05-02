package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.4wo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101154wo implements AnonymousClass5PA {
    public final /* synthetic */ CallInfo A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public /* synthetic */ C101154wo(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
        this.A00 = callInfo;
    }

    public final void ANw() {
        VoipActivityV2 voipActivityV2 = this.A01;
        UserJid peerJid = this.A00.getPeerJid();
        AnonymousClass00B.A06(peerJid);
        if (voipActivityV2.A1v) {
            C13680ns.A1J(new VoipActivityV2.ReplyWithMessageDialogFragment(peerJid), voipActivityV2);
        }
    }
}
