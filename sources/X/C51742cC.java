package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.2cC  reason: invalid class name and case insensitive filesystem */
public class C51742cC {
    public final Jid A00;
    public final VoipStanzaChildNode A01;
    public final String A02;
    public final String A03;

    public C51742cC(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        if (C16030sJ.A0J(jid)) {
            this.A03 = str;
            this.A00 = jid;
            this.A02 = str2;
            this.A01 = voipStanzaChildNode;
            return;
        }
        StringBuilder sb = new StringBuilder("CallStanza:Wrong jid type: ");
        sb.append(jid);
        throw new IllegalArgumentException(sb.toString());
    }
}
