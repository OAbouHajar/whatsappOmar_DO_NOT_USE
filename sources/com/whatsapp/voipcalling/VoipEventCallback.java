package com.whatsapp.voipcalling;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;

public interface VoipEventCallback {
    void NoSamplingRatesForAudioRecord();

    void audioDriverRestart();

    void audioInitError();

    void audioRouteChangeRequest(int i2);

    void audioStreamStarted();

    void audioTestReplayFinished();

    void batteryLevelLow();

    void callAcceptFailed();

    void callAcceptReceived();

    void callAutoConnected(String str, String str2);

    void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i2, Voip.RecordingInfo[] recordingInfoArr);

    void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr);

    void callEnding(CallLogInfo callLogInfo, int i2, String str);

    void callGridRankingChanged();

    void callLinkStateChanged(int i2, CallLinkInfo callLinkInfo);

    void callMissed(String str, UserJid userJid, String str2, String str3, int i2, long j2, boolean z2, CallGroupInfo callGroupInfo, boolean z3, boolean z4, boolean z5, GroupJid groupJid);

    void callOfferAcked();

    void callOfferNacked(CallOfferAckError[] callOfferAckErrorArr);

    void callOfferReceiptReceived();

    void callOfferReceived();

    void callOfferSent();

    void callPreAcceptReceived();

    void callRejectReceived(UserJid userJid, String str);

    void callStateChanged(CallState callState, CallInfo callInfo);

    void callTerminateReceived();

    void callWaitingStateChanged(int i2);

    void errorGatheringHostCandidates();

    void fieldstatsReady(WamCall wamCall, String str, boolean z2, boolean z3);

    void groupCallBufferHandleMessages();

    void groupInfoChanged();

    void groupParticipantLeft(UserJid userJid, String str, int i2);

    void handleAcceptAckFailed(String str, int i2);

    void handleAcceptFailed();

    void handleCallFatal(int i2);

    void handleFDLeakDetected();

    void handleOfferAckFailed();

    void handleOfferFailed();

    void handlePreAcceptFailed();

    void handleVoipAssert(String str, int i2);

    void heartbeatNacked(int i2, String str);

    void interruptionStateChanged();

    void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z2);

    void linkCreateAcked(String str, boolean z2);

    void linkCreateNacked(int i2);

    void linkJoinNacked(int i2);

    void linkQueryNacked(int i2);

    void lobbyNacked(int i2, String str);

    void lobbyTimeout();

    void lonelyStateTimeout(int i2);

    void mediaStreamError();

    void mediaStreamStartError();

    void missingRelayInfo();

    void muteRequestFailed(UserJid userJid);

    void muteStateChanged();

    void mutedByOthers(UserJid userJid);

    void p2pNegotaitionFailed();

    void p2pNegotiationSuccess();

    void p2pTransportCreateFailed();

    void p2pTransportMediaCreateFailed();

    void p2pTransportRestartSuccess();

    void p2pTransportStartFailed();

    void peerBatteryLevelLow(UserJid userJid);

    void peerVideoStateChanged(int i2);

    void playCallTone(int i2);

    void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i2);

    void relayBindsFailed(boolean z2);

    void relayCreateSuccess();

    void relayElectionSendFailed();

    void relayLatencySendFailed();

    void removeUserFailed(UserJid userJid);

    void restartCamera();

    void rtcpByeReceived();

    void rxTimeout();

    void rxTrafficStarted();

    void rxTrafficStateForPeerChanged();

    void rxTrafficStopped();

    void selfVideoStateChanged(int i2);

    void sendAcceptFailed();

    void sendJoinableClientPollCriticalEvent(int i2);

    void sendLinkedGroupCallDowngradedCriticalEvent(boolean z2);

    void sendOfferFailed();

    void soundPortCreateFailed();

    void soundPortCreated(int i2);

    void speakerStatusChanged(UserJid[] userJidArr, int[] iArr);

    void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr);

    void transportCandSendFailed();

    void txTimeout();

    void updateJoinableCallLog(int i2, String str, UserJid[] userJidArr);

    void updateVoipSettings(boolean z2);

    void userRemoved(UserJid userJid, UserJid userJid2);

    void videoCaptureStarted();

    void videoCodecMismatch();

    void videoCodecStateChanged();

    void videoDecodeFatalError();

    void videoDecodePaused();

    void videoDecodeResumed();

    void videoDecodeStarted();

    void videoEncodeFatalError();

    void videoPortCreateFailed();

    void videoPortCreated(UserJid userJid);

    void videoPreviewError();

    void videoPreviewReady();

    void videoRenderFormatChanged(UserJid userJid);

    void videoRenderStarted(UserJid userJid);

    void videoStreamCreateError();

    void weakWifiSwitchedToCellular();

    void willCreateSoundPort();
}
