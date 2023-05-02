package com.whatsapp.voipcalling;

import com.whatsapp.jid.UserJid;

public final class CallParticipant {
    public final UserJid jid;
    public final String state;

    public CallParticipant(UserJid userJid, String str) {
        this.jid = userJid;
        this.state = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallParticipant{jid=");
        sb.append(this.jid);
        sb.append(", state=");
        sb.append(this.state);
        sb.append('}');
        return sb.toString();
    }
}
