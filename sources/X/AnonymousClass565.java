package X;

import com.obwhatsapp.calling.service.VoiceService$DefaultSignalingXmppCallback;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.565  reason: invalid class name */
public final /* synthetic */ class AnonymousClass565 implements Runnable {
    public final /* synthetic */ VoiceService$DefaultSignalingXmppCallback A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ VoipStanzaChildNode A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass565(VoiceService$DefaultSignalingXmppCallback voiceService$DefaultSignalingXmppCallback, Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        this.A00 = voiceService$DefaultSignalingXmppCallback;
        this.A01 = jid;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = voipStanzaChildNode;
    }

    public final void run() {
        this.A00.lambda$sendCallStanza$0(this.A01, this.A03, this.A04, this.A02);
    }
}
