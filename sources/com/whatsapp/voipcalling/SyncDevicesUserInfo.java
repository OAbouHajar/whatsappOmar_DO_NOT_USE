package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import com.whatsapp.jid.UserJid;

public class SyncDevicesUserInfo {
    public final UserJid jid;
    public final String phash;

    public SyncDevicesUserInfo(String str, String str2) {
        UserJid nullable = UserJid.getNullable(str);
        AnonymousClass00B.A06(nullable);
        this.jid = nullable;
        this.phash = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncDevicesUserInfo {jid=");
        sb.append(this.jid);
        sb.append(", phash=");
        sb.append(this.phash);
        sb.append('}');
        return sb.toString();
    }
}
