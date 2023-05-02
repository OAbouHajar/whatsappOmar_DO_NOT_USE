package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.4NT  reason: invalid class name */
public class AnonymousClass4NT {
    public final int A00;
    public final Jid A01;
    public final String A02;
    public final String A03;
    public final VoipStanzaChildNode[] A04;

    public AnonymousClass4NT(Jid jid, String str, String str2, VoipStanzaChildNode[] voipStanzaChildNodeArr, int i2) {
        if (C16030sJ.A0J(jid)) {
            this.A02 = str;
            this.A01 = jid;
            this.A03 = str2;
            this.A00 = i2;
            this.A04 = voipStanzaChildNodeArr;
            return;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0g("CallIncomingAck:Wrong jid type: ", jid));
    }
}
