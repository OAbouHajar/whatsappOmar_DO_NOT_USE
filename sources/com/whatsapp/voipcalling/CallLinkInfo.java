package com.whatsapp.voipcalling;

import X.C32001fU;
import X.C32021fW;
import com.whatsapp.jid.UserJid;

public class CallLinkInfo {
    public static final String DEFAULT_CALL_LINK_CALL_ID = "default";
    public final UserJid creatorJid;
    public final int linkState;
    public C32001fU self;
    public final String token;
    public final boolean videoEnabled;

    public CallLinkInfo(int i2, UserJid userJid, String str, boolean z2) {
        this.linkState = i2;
        this.creatorJid = userJid;
        this.token = str;
        this.videoEnabled = z2;
    }

    private void setSelfParticipantInfo(UserJid userJid, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, int i4, int i5, int i6, boolean z6, boolean z7) {
        this.self = new C32001fU(userJid, i2, i3, i4, i5, i6, 0, 1, true, false, false, false, false, z2, z3, z4, z5, z6, z7, false, false, false);
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    public int getLinkState() {
        return this.linkState;
    }

    public C32001fU getSelfInfo() {
        return this.self;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("token: ");
        sb.append(this.token);
        sb.append(", videoEnabled: ");
        sb.append(this.videoEnabled);
        sb.append(", linkState: ");
        sb.append(C32021fW.A00(this.linkState));
        return sb.toString();
    }
}
