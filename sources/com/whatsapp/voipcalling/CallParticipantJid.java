package com.whatsapp.voipcalling;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public class CallParticipantJid {
    public final DeviceJid[] deviceJids;
    public final byte[] privacyToken;
    public final UserJid userJid;

    public CallParticipantJid(UserJid userJid2, DeviceJid[] deviceJidArr, byte[] bArr) {
        this.userJid = userJid2;
        this.deviceJids = deviceJidArr;
        this.privacyToken = bArr;
    }

    public DeviceJid[] getDeviceJids() {
        return this.deviceJids;
    }

    public byte[] getPrivacyToken() {
        return this.privacyToken;
    }

    public UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantJid userJid=");
        sb.append(this.userJid);
        sb.append(", deviceJids=(");
        sb.append(Arrays.toString(this.deviceJids));
        sb.append(')');
        sb.append(", privacyToken=");
        sb.append(this.privacyToken == null ? "missing" : "present");
        sb.append(')');
        return sb.toString();
    }
}
