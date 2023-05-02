package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import X.C16030sJ;
import X.C32001fU;
import X.C32011fV;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public UserJid callLinkCreatorJid;
    public int callLinkState;
    public String callLinkToken;
    public int callResult;
    public int callSetupErrorType;
    public final CallState callState;
    public C32011fV callWaitingInfo;
    public int connectedLimit;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public final Map participants = new LinkedHashMap();
    public final UserJid peerJid;
    public C32001fU self;
    public final String tsLogCallId;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    public CallInfo(CallState callState2, String str, String str2, UserJid userJid, UserJid userJid2, UserJid userJid3, GroupJid groupJid2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, int i3, boolean z8, boolean z9, boolean z10, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i4, int i5, boolean z11, String str3) {
        this.callState = callState2;
        this.callId = str;
        this.tsLogCallId = str2;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.groupJid = groupJid2;
        this.isCaller = z2;
        this.isGroupCall = z3;
        this.isGroupCallEnabled = z4;
        this.isGroupCallCreatedOnServer = z5;
        this.videoEnabled = z6;
        this.isEndedByMe = z7;
        this.callResult = i2;
        this.callSetupErrorType = i3;
        this.callEnding = z8;
        this.videoPreviewReady = z9;
        this.videoCaptureStarted = z10;
        this.callActiveTime = j2;
        this.callDuration = j3;
        this.audioDuration = j4;
        this.videoDuration = j5;
        this.bytesSent = j6;
        this.bytesReceived = j7;
        this.ECMode = j8;
        this.initialGroupTransactionId = i4;
        this.connectedLimit = i5;
        this.isJoinableGroupCall = z11;
        this.callLinkToken = str3;
    }

    private void addParticipantInfo(C32001fU r3) {
        this.participants.put(r3.A07, r3);
        if (r3.A0G) {
            this.self = r3;
        }
    }

    private void addParticipantInfo(UserJid userJid, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9, boolean z10, int i4, int i5, int i6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i7, int i8) {
        boolean z17 = true;
        int i9 = i2;
        if (i9 < 1 || (i9 > 7 && i9 != 11)) {
            z17 = false;
        }
        StringBuilder sb = new StringBuilder("invalid participant state ");
        sb.append(i9);
        AnonymousClass00B.A0B(sb.toString(), z17);
        boolean z18 = z8;
        boolean z19 = z7;
        int i10 = i3;
        boolean z20 = z6;
        boolean z21 = z5;
        boolean z22 = z4;
        int i11 = i8;
        int i12 = i7;
        boolean z23 = z13;
        boolean z24 = z12;
        boolean z25 = z3;
        boolean z26 = z11;
        boolean z27 = z2;
        int i13 = i6;
        int i14 = i5;
        UserJid userJid2 = userJid;
        C32001fU r2 = new C32001fU(userJid2, i9, i10, i4, i14, i13, i12, i11, z27, z25, z22, z21, z20, z19, z18, z9, z10, z26, z24, z23, z14, z16);
        this.participants.put(userJid2, r2);
        if (r2.A0G) {
            this.self = r2;
        }
    }

    public static CallInfo convertCallLinkInfoToCallInfo(CallLinkInfo callLinkInfo) {
        CallLinkInfo callLinkInfo2 = callLinkInfo;
        C32001fU r1 = callLinkInfo2.self;
        CallState callState2 = CallState.LINK;
        boolean z2 = callLinkInfo2.videoEnabled;
        boolean z3 = z2;
        CallInfo callInfo = new CallInfo(callState2, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, (String) null, (UserJid) null, (UserJid) null, (UserJid) null, (GroupJid) null, false, true, false, false, z3, false, 0, 0, false, r1.A0L, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, callLinkInfo2.token);
        callInfo.addParticipantInfo(r1);
        callInfo.callLinkCreatorJid = callLinkInfo2.creatorJid;
        callInfo.callLinkState = callLinkInfo2.linkState;
        return callInfo;
    }

    public static CallInfo convertCallWaitingInfoToCallInfo(CallInfo callInfo) {
        CallInfo callInfo2 = callInfo;
        C32011fV r9 = callInfo2.callWaitingInfo;
        boolean z2 = true;
        CallState callState2 = r9.A01 == 1 ? CallState.RECEIVED_CALL : CallState.ACTIVE;
        UserJid userJid = r9.A03.initialPeerJid;
        AnonymousClass00B.A06(userJid);
        String str = r9.A04;
        List<UserJid> list = r9.A06;
        UserJid userJid2 = (UserJid) list.get(0);
        GroupJid groupJid2 = r9.A02;
        if (r9.A00 <= 1) {
            z2 = false;
        }
        boolean z3 = callInfo2.isGroupCallEnabled;
        boolean z4 = r9.A08;
        CallInfo callInfo3 = new CallInfo(callState2, str, (String) null, userJid, userJid, userJid2, groupJid2, false, z2, z3, false, z4, false, 0, 0, false, false, false, 0, 0, 0, 0, 0, 0, 0, -1, 0, r9.A07, r9.A05);
        C32001fU r0 = callInfo2.self;
        CallInfo callInfo4 = callInfo3;
        callInfo4.addParticipantInfo(r0.A07, r0.A01, true, false, r0.A0A, r0.A0E, r0.A0B, 1, r0.A0L, r0.A0K, r0.A0J, r0.A0I, r0.A06, r0.A03, r0.A04 * 90, r0.A08, r0.A09, r0.A0H, false, false, false, 0, r0.A02);
        for (UserJid addParticipantInfo : list) {
            callInfo4.addParticipantInfo(addParticipantInfo, 2, false, false, false, false, false, z4 ? 1 : 0, false, false, false, false, 0, 0, 0, false, false, false, false, false, false, 0, 1);
        }
        callInfo3.setCallWaitingInfo(0, "", 0, new String[0], (String) null, false, false, 0, false, (CallLogInfo) null, false, (String) null);
        return callInfo3;
    }

    private void setCallLinkCreatorJid(UserJid userJid) {
        this.callLinkCreatorJid = userJid;
    }

    private void setCallLinkState(int i2) {
        this.callLinkState = i2;
    }

    private void setCallWaitingInfo(int i2, String str, int i3, String[] strArr, String str2, boolean z2, boolean z3, int i4, boolean z4, CallLogInfo callLogInfo, boolean z5, String str3) {
        String str4 = str;
        String str5 = str2;
        CallLogInfo callLogInfo2 = callLogInfo;
        String str6 = str3;
        this.callWaitingInfo = new C32011fV(callLogInfo2, str4, str5, str6, C16030sJ.A08(UserJid.class, Arrays.asList(strArr)), i2, i3, z2, z5);
    }

    public boolean enableAudioVideoSwitch() {
        return this.self.A08;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public UserJid getCallLinkCreatorJid() {
        return this.callLinkCreatorJid;
    }

    public int getCallLinkState() {
        return this.callLinkState;
    }

    public String getCallLinkToken() {
        return this.callLinkToken;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public CallState getCallState() {
        return this.callState;
    }

    public C32011fV getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedParticipantsCount() {
        int i2 = 0;
        for (Map.Entry value : this.participants.entrySet()) {
            if (((C32001fU) value.getValue()).A01 == 1) {
                i2++;
            }
        }
        return i2;
    }

    public UserJid getCreatorJid() {
        boolean isCallLinkLobbyOrJoiningState = isCallLinkLobbyOrJoiningState();
        UserJid userJid = this.creatorJid;
        if (!isCallLinkLobbyOrJoiningState) {
            AnonymousClass00B.A06(userJid);
        }
        return userJid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C32001fU getDefaultPeerInfo() {
        /*
            r5 = this;
            boolean r0 = r5.isGroupCall
            r4 = 0
            if (r0 != 0) goto L_0x002a
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r2 = r3.next()
            X.1fU r2 = (X.C32001fU) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r1 = r2.A07
            com.whatsapp.jid.UserJid r0 = r5.peerJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
        L_0x0029:
            return r2
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.1fU");
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public C32001fU getInfoByJid(UserJid userJid) {
        return (C32001fU) this.participants.get(userJid);
    }

    public UserJid getInitialPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.initialPeerJid;
        AnonymousClass00B.A06(userJid);
        return userJid;
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public Map getParticipants() {
        return this.participants;
    }

    public UserJid getPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.peerJid;
        AnonymousClass00B.A06(userJid);
        return userJid;
    }

    public List getPeerJids() {
        ArrayList arrayList = new ArrayList();
        for (C32001fU r1 : this.participants.values()) {
            if (!r1.A0G) {
                arrayList.add(r1.A07);
            }
        }
        return arrayList;
    }

    public C32001fU getSelfInfo() {
        return this.self;
    }

    public String getTSLogCallId() {
        return this.tsLogCallId;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        if (this.callState != CallState.ACTIVE || getDefaultPeerInfo() == null) {
            return false;
        }
        int i2 = getDefaultPeerInfo().A01;
        return i2 == 2 || i2 == 3;
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallFull() {
        return this.connectedLimit > 0 && getConnectedParticipantsCount() >= this.connectedLimit;
    }

    public boolean isCallLinkLobbyOrJoiningState() {
        int i2 = this.callLinkState;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public boolean isCallOnHold() {
        if (!isCallLinkLobbyOrJoiningState() && !isInLonelyState()) {
            if (!this.self.A0A) {
                for (C32001fU r1 : this.participants.values()) {
                    if (r1.A0G || r1.A0A) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEitherSideRequestingUpgrade() {
        C32001fU r0;
        if (this.isGroupCall || this.callState == CallState.NONE || (r0 = this.self) == null) {
            return false;
        }
        return r0.A05 == 3 || isPeerRequestingUpgrade();
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isInLonelyState() {
        CallState callState2 = this.callState;
        if (callState2 != CallState.CONNECTED_LONELY) {
            if (callState2 == CallState.ACTIVE) {
                for (C32001fU r1 : this.participants.values()) {
                    if (r1.A01 != 1 || r1.A0G) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPeerRequestingUpgrade() {
        C32001fU defaultPeerInfo = getDefaultPeerInfo();
        return defaultPeerInfo != null && defaultPeerInfo.A05 == 3;
    }

    public boolean isSelfCallOnHold() {
        return this.self.A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r3.self;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isSelfRequestingUpgrade() {
        /*
            r3 = this;
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x0014
            X.1fU r2 = r3.self
            if (r2 == 0) goto L_0x0014
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0014
            int r1 = r2.A05
            r0 = 3
            r2 = 1
            if (r1 == r0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.isSelfRequestingUpgrade():boolean");
    }

    public boolean isStartedFromCallLink() {
        return this.callLinkToken != null;
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallId: ");
        sb.append(this.callId);
        sb.append(", peerJid: ");
        sb.append(this.peerJid);
        sb.append(", callState: ");
        sb.append(this.callState);
        return sb.toString();
    }
}
