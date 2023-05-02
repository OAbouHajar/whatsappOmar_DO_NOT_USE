package com.whatsapp.fieldstats.events;

import X.C16470t7;
import X.C29081Zz;

public final class WamJoinableCall extends C16470t7 {
    public Long acceptAckLatencyMs;
    public String callRandomId;
    public String callReplayerId;
    public Boolean groupAcceptNoCriticalGroupUpdate;
    public Long groupAcceptToCriticalGroupUpdateMs;
    public Boolean hasSpamDialog;
    public Boolean isCallFull;
    public Boolean isFromCallLink;
    public Boolean isLinkCreator;
    public Boolean isLinkJoin;
    public Boolean isLinkedGroupCall;
    public Boolean isPendingCall;
    public Boolean isRejoin;
    public Boolean isRering;
    public Long joinAckLatencyMs;
    public Boolean joinableAcceptBeforeLobbyAck;
    public Boolean joinableDuringCall;
    public Boolean joinableEndCallBeforeLobbyAck;
    public Integer legacyCallResult;
    public Long lobbyAckLatencyMs;
    public Integer lobbyEntryPoint;
    public Integer lobbyExit;
    public Long lobbyExitNackCode;
    public Boolean lobbyQueryWhileConnected;
    public Long lobbyVisibleT;
    public Boolean nseEnabled;
    public Long nseOfflineQueueMs;
    public Long numConnectedPeers;
    public Long numInvitedParticipants;
    public Long numOutgoingRingingPeers;
    public Long queryAckLatencyMs;
    public Boolean receivedByNse;
    public Boolean rejoinMissingDbMapping;
    public Long timeSinceAcceptMs;
    public Long timeSinceLastClientPollMinutes;
    public Boolean videoEnabled;

    public WamJoinableCall() {
        super(2572, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(23, this.acceptAckLatencyMs);
        r3.AdT(1, this.callRandomId);
        r3.AdT(31, this.callReplayerId);
        r3.AdT(37, this.groupAcceptNoCriticalGroupUpdate);
        r3.AdT(38, this.groupAcceptToCriticalGroupUpdateMs);
        r3.AdT(26, this.hasSpamDialog);
        r3.AdT(30, this.isCallFull);
        r3.AdT(32, this.isFromCallLink);
        r3.AdT(39, this.isLinkCreator);
        r3.AdT(33, this.isLinkJoin);
        r3.AdT(24, this.isLinkedGroupCall);
        r3.AdT(14, this.isPendingCall);
        r3.AdT(3, this.isRejoin);
        r3.AdT(8, this.isRering);
        r3.AdT(34, this.joinAckLatencyMs);
        r3.AdT(16, this.joinableAcceptBeforeLobbyAck);
        r3.AdT(9, this.joinableDuringCall);
        r3.AdT(17, this.joinableEndCallBeforeLobbyAck);
        r3.AdT(6, this.legacyCallResult);
        r3.AdT(19, this.lobbyAckLatencyMs);
        r3.AdT(2, this.lobbyEntryPoint);
        r3.AdT(4, this.lobbyExit);
        r3.AdT(5, this.lobbyExitNackCode);
        r3.AdT(18, this.lobbyQueryWhileConnected);
        r3.AdT(7, this.lobbyVisibleT);
        r3.AdT(27, this.nseEnabled);
        r3.AdT(28, this.nseOfflineQueueMs);
        r3.AdT(13, this.numConnectedPeers);
        r3.AdT(12, this.numInvitedParticipants);
        r3.AdT(20, this.numOutgoingRingingPeers);
        r3.AdT(35, this.queryAckLatencyMs);
        r3.AdT(29, this.receivedByNse);
        r3.AdT(22, this.rejoinMissingDbMapping);
        r3.AdT(36, this.timeSinceAcceptMs);
        r3.AdT(21, this.timeSinceLastClientPollMinutes);
        r3.AdT(10, this.videoEnabled);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamJoinableCall {");
        C16470t7.appendFieldToStringBuilder(sb, "acceptAckLatencyMs", this.acceptAckLatencyMs);
        C16470t7.appendFieldToStringBuilder(sb, "callRandomId", this.callRandomId);
        C16470t7.appendFieldToStringBuilder(sb, "callReplayerId", this.callReplayerId);
        C16470t7.appendFieldToStringBuilder(sb, "groupAcceptNoCriticalGroupUpdate", this.groupAcceptNoCriticalGroupUpdate);
        C16470t7.appendFieldToStringBuilder(sb, "groupAcceptToCriticalGroupUpdateMs", this.groupAcceptToCriticalGroupUpdateMs);
        C16470t7.appendFieldToStringBuilder(sb, "hasSpamDialog", this.hasSpamDialog);
        C16470t7.appendFieldToStringBuilder(sb, "isCallFull", this.isCallFull);
        C16470t7.appendFieldToStringBuilder(sb, "isFromCallLink", this.isFromCallLink);
        C16470t7.appendFieldToStringBuilder(sb, "isLinkCreator", this.isLinkCreator);
        C16470t7.appendFieldToStringBuilder(sb, "isLinkJoin", this.isLinkJoin);
        C16470t7.appendFieldToStringBuilder(sb, "isLinkedGroupCall", this.isLinkedGroupCall);
        C16470t7.appendFieldToStringBuilder(sb, "isPendingCall", this.isPendingCall);
        C16470t7.appendFieldToStringBuilder(sb, "isRejoin", this.isRejoin);
        C16470t7.appendFieldToStringBuilder(sb, "isRering", this.isRering);
        C16470t7.appendFieldToStringBuilder(sb, "joinAckLatencyMs", this.joinAckLatencyMs);
        C16470t7.appendFieldToStringBuilder(sb, "joinableAcceptBeforeLobbyAck", this.joinableAcceptBeforeLobbyAck);
        C16470t7.appendFieldToStringBuilder(sb, "joinableDuringCall", this.joinableDuringCall);
        C16470t7.appendFieldToStringBuilder(sb, "joinableEndCallBeforeLobbyAck", this.joinableEndCallBeforeLobbyAck);
        Integer num = this.legacyCallResult;
        C16470t7.appendFieldToStringBuilder(sb, "legacyCallResult", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "lobbyAckLatencyMs", this.lobbyAckLatencyMs);
        Integer num2 = this.lobbyEntryPoint;
        C16470t7.appendFieldToStringBuilder(sb, "lobbyEntryPoint", num2 == null ? null : num2.toString());
        Integer num3 = this.lobbyExit;
        C16470t7.appendFieldToStringBuilder(sb, "lobbyExit", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "lobbyExitNackCode", this.lobbyExitNackCode);
        C16470t7.appendFieldToStringBuilder(sb, "lobbyQueryWhileConnected", this.lobbyQueryWhileConnected);
        C16470t7.appendFieldToStringBuilder(sb, "lobbyVisibleT", this.lobbyVisibleT);
        C16470t7.appendFieldToStringBuilder(sb, "nseEnabled", this.nseEnabled);
        C16470t7.appendFieldToStringBuilder(sb, "nseOfflineQueueMs", this.nseOfflineQueueMs);
        C16470t7.appendFieldToStringBuilder(sb, "numConnectedPeers", this.numConnectedPeers);
        C16470t7.appendFieldToStringBuilder(sb, "numInvitedParticipants", this.numInvitedParticipants);
        C16470t7.appendFieldToStringBuilder(sb, "numOutgoingRingingPeers", this.numOutgoingRingingPeers);
        C16470t7.appendFieldToStringBuilder(sb, "queryAckLatencyMs", this.queryAckLatencyMs);
        C16470t7.appendFieldToStringBuilder(sb, "receivedByNse", this.receivedByNse);
        C16470t7.appendFieldToStringBuilder(sb, "rejoinMissingDbMapping", this.rejoinMissingDbMapping);
        C16470t7.appendFieldToStringBuilder(sb, "timeSinceAcceptMs", this.timeSinceAcceptMs);
        C16470t7.appendFieldToStringBuilder(sb, "timeSinceLastClientPollMinutes", this.timeSinceLastClientPollMinutes);
        C16470t7.appendFieldToStringBuilder(sb, "videoEnabled", this.videoEnabled);
        sb.append("}");
        return sb.toString();
    }
}
