package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import X.C16180sb;
import android.graphics.Bitmap;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import com.obwhatsapp.calling.MultiNetworkCallback;
import com.obwhatsapp.calling.crypto.CryptoCallback;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

public final class Voip {
    public static CryptoCallback A00;
    public static final SimpleDateFormat A01 = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
    public static volatile SignalingXmppCallback A02;

    public enum DebugTapType {
        RECEIVED_AND_DECODED,
        CAPTURED_AND_POST_PROCESSED,
        OUTGOING_ENCODED,
        RAW_CAPTURED,
        RAW_PLAYBACK
    }

    public class JidHelper {
        public static UserJid convertToUserJid(Jid jid) {
            if (jid instanceof UserJid) {
                return (UserJid) jid;
            }
            if (jid instanceof DeviceJid) {
                return ((DeviceJid) jid).getUserJid();
            }
            return null;
        }

        public static int getAgent(Jid jid) {
            return jid.getAgent();
        }

        public static int getDevice(Jid jid) {
            return jid.getDevice();
        }

        public static String getDomain(Jid jid) {
            return jid.getServer();
        }

        public static String getIdentifier(Jid jid) {
            return jid.user;
        }

        public static Jid getNullable(String str) {
            return Jid.getNullable(str);
        }

        public static int getType(Jid jid) {
            return jid.getType();
        }
    }

    public class RecordingInfo {
        public File outputFile;
        public OutputStream outputStream;

        public RecordingInfo(C16180sb r7, DebugTapType debugTapType) {
            String str;
            switch (debugTapType.ordinal()) {
                case 0:
                    str = "received.decoded";
                    break;
                case 1:
                    str = "record.processed";
                    break;
                case 2:
                    str = "record.encoded";
                    break;
                case 3:
                    str = "record.raw";
                    break;
                case 4:
                    str = "playback.raw";
                    break;
                default:
                    StringBuilder sb = new StringBuilder("unknown debug tap type: ");
                    sb.append(debugTapType);
                    throw new IllegalStateException(sb.toString());
            }
            String format = Voip.A01.format(new Date(System.currentTimeMillis()));
            r7.A05();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(".");
            sb2.append(str);
            sb2.append(".wav.gz");
            File file = new File((File) null, sb2.toString());
            this.outputFile = file;
            try {
                this.outputStream = new GZIPOutputStream(new FileOutputStream(file, true));
            } catch (IOException e2) {
                Log.e((Throwable) e2);
                this.outputStream = null;
            }
        }

        public File getOutputFile() {
            return this.outputFile;
        }

        public OutputStream getOutputStream() {
            return this.outputStream;
        }
    }

    public static Boolean A00(String str) {
        Integer A012 = A01(str);
        if (A012 == null) {
            return null;
        }
        int intValue = A012.intValue();
        boolean z2 = false;
        if (intValue != 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public static Integer A01(String str) {
        String A06 = A06(str);
        if (A06 == null || A06.isEmpty()) {
            StringBuilder sb = new StringBuilder("No value found for param ");
            sb.append(str);
            Log.i(sb.toString());
            return null;
        }
        try {
            return Integer.valueOf(A06);
        } catch (NumberFormatException e2) {
            StringBuilder sb2 = new StringBuilder("Wrong format for param ");
            sb2.append(str);
            sb2.append(", value ");
            sb2.append(A06);
            Log.e(sb2.toString(), e2);
            return null;
        }
    }

    public static Object A02(int i2, boolean z2) {
        boolean z3;
        try {
            z3 = AcousticEchoCanceler.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z3 = false;
        }
        if (!z3) {
            return null;
        }
        int i3 = 0;
        if (i2 < 0) {
            return null;
        }
        while (i3 <= 50) {
            int i4 = i2 + i3;
            if (i3 == 0) {
                i4 = i2 + 3;
            }
            try {
                AcousticEchoCanceler create = AcousticEchoCanceler.create(i4);
                if (create != null) {
                    create.setEnabled(z2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/hackBuiltInAec/enabled ");
                    sb.append(create.getEnabled());
                    sb.append(" on session id ");
                    sb.append(i4);
                    sb.append(" with previous session id ");
                    sb.append(i2);
                    Log.i(sb.toString());
                    return create;
                }
                i3++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder sb2 = new StringBuilder("voip/hackBuiltInAec/failed previousAudioSessionId = ");
        sb2.append(i2);
        sb2.append(", range = ");
        sb2.append(50);
        Log.i(sb2.toString());
        return null;
    }

    public static Object A03(int i2, boolean z2) {
        boolean z3;
        try {
            z3 = AutomaticGainControl.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z3 = false;
        }
        if (!z3) {
            return null;
        }
        int i3 = 0;
        if (i2 < 0) {
            return null;
        }
        while (i3 <= 50) {
            int i4 = i2 + i3;
            if (i3 == 0) {
                i4 = i2 + 3;
            }
            try {
                AutomaticGainControl create = AutomaticGainControl.create(i4);
                if (create != null) {
                    create.setEnabled(z2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/hackBuiltInAgc/enabled ");
                    sb.append(create.getEnabled());
                    sb.append(" on session id ");
                    sb.append(i4);
                    sb.append(" with previous session id ");
                    sb.append(i2);
                    Log.i(sb.toString());
                    return create;
                }
                i3++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder sb2 = new StringBuilder("voip/hackBuiltInAgc/failed previousAudioSessionId = ");
        sb2.append(i2);
        sb2.append(", range = ");
        sb2.append(50);
        Log.i(sb2.toString());
        return null;
    }

    public static Object A04(int i2, boolean z2) {
        boolean z3;
        try {
            z3 = NoiseSuppressor.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z3 = false;
        }
        if (!z3) {
            return null;
        }
        int i3 = 0;
        if (i2 < 0) {
            return null;
        }
        while (i3 <= 50) {
            int i4 = i2 + i3;
            if (i3 == 0) {
                i4 = i2 + 3;
            }
            try {
                NoiseSuppressor create = NoiseSuppressor.create(i4);
                if (create != null) {
                    create.setEnabled(z2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/hackBuiltInNs/enabled ");
                    sb.append(create.getEnabled());
                    sb.append(" on session id ");
                    sb.append(i4);
                    sb.append(" with previous session id ");
                    sb.append(i2);
                    Log.i(sb.toString());
                    return create;
                }
                i3++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder sb2 = new StringBuilder("voip/hackBuiltInNs/failed previousAudioSessionId = ");
        sb2.append(i2);
        sb2.append(", range = ");
        sb2.append(50);
        Log.i(sb2.toString());
        return null;
    }

    public static String A05(int i2) {
        if (i2 == 0) {
            return "kAudOutputDefault";
        }
        if (i2 == 1) {
            return "kAudOutputSpeaker";
        }
        if (i2 == 2) {
            return "kAudOutputEarpiece";
        }
        if (i2 == 3) {
            return "kAudOutputBluetooth";
        }
        if (i2 == 4) {
            return "kAudOutputHeadset";
        }
        AnonymousClass00B.A08("UNKNOWN AudioRoute");
        return "UNKNOWN AudioRoute";
    }

    public static String A06(String str) {
        String voipParam = getVoipParam(str);
        if (voipParam == null || voipParam.isEmpty()) {
            return null;
        }
        return voipParam;
    }

    public static boolean A07() {
        return getCurrentCallState() == CallState.LINK && getCurrentCallLinkState() != 4;
    }

    public static boolean A08(CallInfo callInfo) {
        return (callInfo == null || callInfo.callState == CallState.NONE) ? false : true;
    }

    public static boolean A09(CallState callState) {
        return callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING;
    }

    public static native void acceptCall();

    public static native void acceptCallWithVideoStopped();

    public static native int acceptVideoUpgrade();

    public static native void adjustAudioLevel(int i2);

    public static native int cancelInviteToGroupCall(UserJid userJid);

    public static native int cancelVideoUpgrade(int i2);

    public static native void checkOngoingCalls(String[] strArr, DeviceJid[] deviceJidArr);

    public static native void clearVoipParam(String str);

    public static native int createCallLink(boolean z2);

    public static native void debugAdjustAECMParams(short s2, short s3);

    public static native boolean dumpLastVideoFrame(UserJid userJid, Bitmap bitmap);

    public static native void endCall(boolean z2);

    public static native void endCallAndAcceptPendingCall(String str);

    public static native void endCallAndAcceptPendingCallWithVideoStopped(String str);

    public static native CallInfo getCallInfo();

    public static native CallLinkInfo getCallLinkInfo();

    public static native int getCameraCount();

    public static native String getCurrentCallId();

    public static native int getCurrentCallLinkState();

    public static native CallState getCurrentCallState();

    public static native String getCurrentRxNetworkConditionerParameters();

    public static native String getCurrentTxNetworkConditionerParameters();

    public static native UserJid getPeerJid();

    public static native String getStreamStatistics();

    public static native String getStreamStatisticsShort();

    public static native String getVoipParam(String str);

    public static native int getVoipParamElemCount(String str);

    public static native String getVoipParamForCall(String str, String str2);

    public static native int groupCallBufferProcessMessages();

    public static native int inviteToGroupCall(CallParticipantJid callParticipantJid);

    public static native boolean isRxNetworkConditionerOn();

    public static native boolean isTxNetworkConditionerOn();

    public static native int joinCallLink();

    public static native int joinOngoingCall(String str, UserJid userJid, DeviceJid deviceJid, boolean z2, CallParticipantJid[] callParticipantJidArr, boolean z3, GroupJid groupJid, int i2, String str2);

    public static native void muteCall(boolean z2);

    public static native int nativeHandleIncomingSignalingXmpp(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j2, long j3, boolean z2);

    public static native int nativeHandleIncomingSignalingXmppAck(Jid jid, String str, int i2, VoipStanzaChildNode[] voipStanzaChildNodeArr);

    public static native int nativeHandleIncomingSignalingXmppReceipt(Jid jid, VoipStanzaChildNode voipStanzaChildNode);

    public static native int nativeHandleIncomingXmppOffer(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j2, long j3, boolean z2, boolean z3, int i2, boolean z4, String str3);

    public static native int nativeParseXmppOffer(CallOfferInfo[] callOfferInfoArr, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j2, long j3, boolean z2);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptoCallback);

    public static native void nativeRegisterEventCallback(VoipEventCallback voipEventCallback);

    public static native int nativeRegisterJNIUtils(JNIUtils jNIUtils);

    public static native void nativeRegisterMultiNetworkCallback(MultiNetworkCallback multiNetworkCallback);

    public static native void nativeRegisterSignalingXmppCallback(SignalingXmppCallback signalingXmppCallback);

    public static native void nativeUnregisterCryptoCallback();

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterJNIUtils();

    public static native void nativeUnregisterMultiNetworkCallback();

    public static native void nativeUnregisterSignalingXmppCallback();

    public static native void notifyAudioRouteChange(int i2);

    public static native void notifyDeviceIdentityChanged(DeviceJid deviceJid);

    public static native void notifyDeviceIdentityDeleted(DeviceJid deviceJid);

    public static native int notifyFailureToCreateAlternativeSocket(boolean z2);

    public static native int notifyLostOfAlternativeNetwork();

    public static native void onCallInterrupted(boolean z2, boolean z3);

    public static native int previewCallLink(String str, boolean z2);

    public static native void processPipModeChange(boolean z2);

    public static native int refreshVideoDevice();

    public static native void rejectCall(String str, String str2);

    public static native void rejectCallWithoutCallContext(String str, boolean z2, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, int i2, int i3);

    public static native void rejectPendingCall(String str);

    public static native int rejectVideoUpgrade(int i2);

    public static native int requestVideoUpgrade();

    public static native void resendOfferOnDecryptionFailure(DeviceJid deviceJid, String str);

    public static native void saveCallMetrics(String str);

    public static native int sendMutePeerRequestInGroupCall(UserJid userJid);

    public static native void sendRekeyRequest(DeviceJid deviceJid, int i2);

    public static native int sendRemoveUserRequest(UserJid userJid);

    public static native int setBatteryState(float f2, float f3, boolean z2);

    public static native int setScreenSize(int i2, int i3);

    public static native int setVideoDisplayPort(UserJid userJid, VideoPort videoPort);

    public static native int setVideoPreviewPort(VideoPort videoPort);

    public static native int setVideoPreviewSize(int i2, int i3);

    public static native int startCall(String str, CallParticipantJid[] callParticipantJidArr, boolean z2, GroupJid groupJid);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native int startTestNetworkConditionWithAlternativeSocket(int i2, String str, int i3);

    public static native void startVideoCaptureStream();

    public static native void startVideoRenderStream(UserJid userJid);

    public static native boolean stopCallRecording();

    public static native void stopVideoCaptureStream();

    public static native void stopVideoRenderStream(UserJid userJid);

    public static native int switchCamera();

    public static native int switchNetworkWithAlternativeSocket(int i2, String str, int i3);

    public static native void timeoutPendingCall(String str);

    public static native void transitionToRejoining();

    public static native int turnCameraOff();

    public static native int turnCameraOn();

    public static native void updateNetworkMedium(int i2, int i3);

    public static native void updateNetworkRestrictions(boolean z2);

    public static native int updateParticipantsRxSubscription(UserJid[] userJidArr);

    public static native void videoOrientationChanged(int i2);
}
