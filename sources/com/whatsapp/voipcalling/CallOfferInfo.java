package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import X.C14710pd;
import X.C16040sK;
import X.C32601gl;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

public class CallOfferInfo {
    public final CallGroupInfo callGroupInfo;
    public final String callId;
    public final String callLinkToken;
    public final long epochTimeMillis;
    public final UserJid fromJid;
    public final GroupJid groupJid;
    public final boolean isJoinableCall;
    public final boolean isVideoCall;
    public final boolean uploadFieldStat;

    public CallOfferInfo(UserJid userJid, GroupJid groupJid2, String str, long j2, boolean z2, CallGroupInfo callGroupInfo2, boolean z3, boolean z4, String str2) {
        this.fromJid = userJid;
        this.groupJid = groupJid2;
        this.callId = str;
        this.epochTimeMillis = j2;
        this.isVideoCall = z2;
        this.callGroupInfo = callGroupInfo2;
        this.uploadFieldStat = z3;
        this.isJoinableCall = z4;
        this.callLinkToken = str2;
    }

    public static CallOfferInfo create(UserJid userJid, GroupJid groupJid2, String str, long j2, boolean z2, CallGroupInfo callGroupInfo2, boolean z3, boolean z4, String str2) {
        if (str != null) {
            return new CallOfferInfo(userJid, groupJid2, str, j2, z2, callGroupInfo2, z3, z4, str2);
        }
        AnonymousClass00B.A08("callId shouldn't be null");
        return null;
    }

    public GroupJid getGroupJid(CallInfo callInfo) {
        GroupJid groupJid2 = this.groupJid;
        if (groupJid2 == null || callInfo == null || callInfo.callState == CallState.CALLING || !groupJid2.equals(callInfo.groupJid)) {
            return this.groupJid;
        }
        return null;
    }

    public String getLinkToken(C14710pd r2, C16040sK r3) {
        if (C32601gl.A04(r3, r2)) {
            return this.callLinkToken;
        }
        return null;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableCall && this.callGroupInfo != null;
    }
}
