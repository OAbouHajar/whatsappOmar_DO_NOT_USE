package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import com.whatsapp.jid.UserJid;

public class CallOfferAckError {
    public final int errorCode;
    public final UserJid errorJid;

    public CallOfferAckError(String str, int i2) {
        UserJid nullable = UserJid.getNullable(str);
        AnonymousClass00B.A06(nullable);
        this.errorJid = nullable;
        this.errorCode = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallOfferAckError {errorJid=");
        sb.append(this.errorJid);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append('}');
        return sb.toString();
    }
}
