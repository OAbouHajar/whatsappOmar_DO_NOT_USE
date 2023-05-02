package com.obwhatsapp.calling.service;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass11B;
import X.AnonymousClass1D0;
import X.AnonymousClass1GM;
import X.AnonymousClass1NO;
import X.AnonymousClass1OK;
import X.AnonymousClass1V3;
import X.AnonymousClass1ZF;
import X.AnonymousClass39S;
import X.AnonymousClass4HR;
import X.AnonymousClass4HS;
import X.AnonymousClass4J4;
import X.AnonymousClass4KI;
import X.AnonymousClass4KJ;
import X.C016407u;
import X.C15830rv;
import X.C15880s3;
import X.C15910s6;
import X.C16040sK;
import X.C16300so;
import X.C16490t9;
import X.C16620tM;
import X.C17130ua;
import X.C17690vU;
import X.C19380yL;
import X.C19470yU;
import X.C204210b;
import X.C204710g;
import X.C29541an;
import X.C29551ao;
import X.C29561ap;
import X.C30341cC;
import X.C32001fU;
import X.C32021fW;
import X.C32601gl;
import X.C35011lE;
import X.C37831po;
import X.C38571r0;
import X.C38591r2;
import X.C38601r3;
import X.C40631uR;
import X.C447225g;
import X.C46802Gh;
import X.C46812Gi;
import X.C52122dA;
import X.C62043Bk;
import X.C93494jI;
import X.C93504jJ;
import android.content.Context;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape0S0401000_I0;
import com.facebook.redex.RunnableRunnableShape0S1110000_I0;
import com.facebook.redex.RunnableRunnableShape0S1201000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.mod2.fblibs.Facebook;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallLogInfo;
import com.whatsapp.voipcalling.CallOfferAckError;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.SyncDevicesUserInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipEventCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

public class VoiceService$VoiceServiceEventCallback implements VoipEventCallback {
    public final AnonymousClass4J4 bufferQueue = new AnonymousClass4J4();
    public final C17690vU httpsFormPostFactory;
    public final /* synthetic */ C447225g this$0;

    public VoiceService$VoiceServiceEventCallback(C447225g r2, C17690vU r3) {
        this.this$0 = r2;
        this.httpsFormPostFactory = r3;
    }

    private void handleFatalOfferNack(ArrayList arrayList, int i2, CallInfo callInfo) {
        int i3 = 3;
        ArrayList arrayList2 = arrayList;
        if (i2 != 401) {
            i3 = 10;
            int i4 = 2;
            if (i2 != 460) {
                if (i2 == 411) {
                    this.this$0.A0y(arrayList, 11);
                } else if (i2 == 412) {
                    this.this$0.A0y(arrayList, 10);
                } else if (i2 == 431) {
                    i3 = 15;
                } else if (i2 != 432) {
                    i3 = 0;
                    switch (i2) {
                        case 403:
                            if (callInfo.videoEnabled) {
                                i3 = 7;
                                break;
                            }
                            break;
                        case 404:
                            i3 = 16;
                            break;
                        case 405:
                            i3 = 4;
                            break;
                        case 406:
                            if (callInfo.videoEnabled) {
                                i4 = 11;
                            }
                            i3 = i4;
                            break;
                        default:
                            switch (i2) {
                                case 426:
                                    i3 = 1;
                                    if (callInfo.videoEnabled) {
                                        i3 = 9;
                                        break;
                                    }
                                    break;
                                case 427:
                                    i3 = 12;
                                    break;
                                case 428:
                                    i3 = 14;
                                    break;
                                default:
                                    if (callInfo.videoEnabled) {
                                        i3 = 8;
                                        break;
                                    }
                                    break;
                            }
                    }
                } else {
                    this.this$0.A0y(arrayList, 2);
                }
                i3 = -1;
            } else if (!callInfo.videoEnabled) {
                i3 = 2;
            }
        }
        if (i3 != -1) {
            C447225g r2 = this.this$0;
            r2.A1c.A0K(new RunnableRunnableShape0S1201000_I0(r2, arrayList2, (String) null, i3, 1));
        }
        this.this$0.A0W(25, (String) null);
    }

    private void handleNonFatalOfferNack(List list, int i2) {
        Context context;
        int i3;
        String string;
        AnonymousClass013 r6;
        int i4;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.A28.A0C(this.this$0.A27.A0A((C15830rv) it.next())));
        }
        String A00 = C40631uR.A00(this.this$0.A28.A07, arrayList, true);
        int i5 = 1;
        if (i2 == 427) {
            CallInfo callInfo = Voip.getCallInfo();
            C32001fU r2 = null;
            if (callInfo != null) {
                if (list.size() == 1) {
                    r2 = callInfo.getInfoByJid((UserJid) list.get(0));
                }
                if (callInfo.isGroupCall && callInfo.participants.size() > 4) {
                    C447225g r1 = this.this$0;
                    if (r2 != null && r2.A0F) {
                        i5 = 6;
                    }
                    r1.A0y(list, i5);
                    return;
                } else if (r2 != null && r2.A01 == 1) {
                    context = this.this$0.A1X;
                    i3 = R.string.str1aff;
                    string = context.getString(i3, new Object[]{arrayList.get(0)});
                    Message.obtain(this.this$0.A0L, 26, string).sendToTarget();
                }
            }
            r6 = this.this$0.A2H;
            i4 = R.plurals.plurals018d;
        } else if (i2 != 428) {
            if (i2 == 431) {
                string = this.this$0.A1X.getString(R.string.str185f, new Object[]{A00});
            } else if (i2 != 435) {
                AnonymousClass00B.A0B("Unknown error code", false);
                r6 = this.this$0.A2H;
                i4 = R.plurals.plurals0193;
            } else {
                string = this.this$0.A1X.getString(R.string.str1860);
            }
            Message.obtain(this.this$0.A0L, 26, string).sendToTarget();
        } else {
            context = this.this$0.A1X;
            i3 = R.string.str1a9b;
            string = context.getString(i3, new Object[]{arrayList.get(0)});
            Message.obtain(this.this$0.A0L, 26, string).sendToTarget();
        }
        Object[] objArr = {A00};
        string = r6.A0J(objArr, i4, (long) list.size());
        Message.obtain(this.this$0.A0L, 26, string).sendToTarget();
    }

    private boolean isFatalErrorCode(int i2) {
        return i2 == 432;
    }

    private boolean isSelfNacked(CallOfferAckError[] callOfferAckErrorArr) {
        for (CallOfferAckError callOfferAckError : callOfferAckErrorArr) {
            if (this.this$0.A1d.A0I(callOfferAckError.errorJid)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callCaptureBufferFilled$3(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i2) {
        int ordinal = debugTapType.ordinal();
        Voip.RecordingInfo recordingInfo = recordingInfoArr[ordinal];
        if (recordingInfo == null) {
            recordingInfoArr[ordinal] = new Voip.RecordingInfo(this.this$0.A1b, debugTapType);
            recordingInfo = recordingInfoArr[ordinal];
        }
        OutputStream outputStream = recordingInfo.outputStream;
        if (outputStream == null) {
            Log.e("voip/callCaptureBufferFilled/OutputStream/null");
        } else {
            try {
                outputStream.write(bArr, 0, i2);
            } catch (IOException e2) {
                Log.e((Throwable) e2);
            }
            AnonymousClass4J4 r1 = this.bufferQueue;
            synchronized (r1) {
                if (bArr != null) {
                    r1.A01.addFirst(bArr);
                }
            }
            if (recordingInfo.outputFile.length() >= 52428800) {
                Log.i("callCaptureBufferFilled stop recording due to exceeds file size limit");
            } else {
                return;
            }
        }
        Voip.stopCallRecording();
    }

    public static /* synthetic */ void lambda$callCaptureEnded$4(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType) {
        OutputStream outputStream;
        Voip.RecordingInfo recordingInfo = recordingInfoArr[debugTapType.ordinal()];
        if (recordingInfo != null && (outputStream = recordingInfo.outputStream) != null) {
            try {
                outputStream.close();
                StringBuilder sb = new StringBuilder();
                sb.append("VoiceService EVENT:callCaptureEnded ");
                sb.append(recordingInfo.outputFile);
                sb.append(" size ");
                sb.append(recordingInfo.outputFile.length());
                Log.i(sb.toString());
            } catch (IOException e2) {
                Log.e((Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callStateChanged$0(CallInfo callInfo) {
        AnonymousClass39S r4 = this.this$0.A1y;
        UserJid initialPeerJid = callInfo.getInitialPeerJid();
        AnonymousClass00B.A06(initialPeerJid);
        if (r4.A0H.A0E(C16620tM.A02, 520)) {
            r4.A0J.A01(initialPeerJid);
            r4.A0D.A01().A00(initialPeerJid);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkCreateAcked$1(String str, boolean z2) {
        for (AnonymousClass4KI r0 : this.this$0.A1n.A01()) {
            for (CallLinkViewModel callLinkViewModel : r0.A02) {
                C016407u r4 = callLinkViewModel.A02;
                boolean z3 = z2;
                r4.A06("saved_state_is_video", Boolean.valueOf(z3));
                int i2 = R.string.str0360;
                if (z2) {
                    i2 = R.string.str035f;
                }
                String str2 = str;
                r4.A06("saved_state_link", new C93504jJ(str2, C62043Bk.A02(str2, z3), 1, i2, R.color.color0507, 0, z3));
                boolean A06 = callLinkViewModel.A06();
                int i3 = R.drawable.ic_btn_call_audio;
                int i4 = R.string.str1de2;
                if (A06) {
                    i3 = R.drawable.ic_btn_call_video;
                    i4 = R.string.str1de0;
                }
                r4.A06("saved_state_link_type", new C93494jI(i3, i4, callLinkViewModel.A06() ^ true ? 1 : 0));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkCreateNacked$2() {
        for (AnonymousClass4KI r0 : this.this$0.A1n.A01()) {
            for (CallLinkViewModel callLinkViewModel : r0.A02) {
                callLinkViewModel.A02.A06("saved_state_link", new C93504jJ("", "", 2, 0, R.color.color0507, 0, false));
            }
        }
    }

    private void validateCallState(CallState callState) {
        boolean z2 = false;
        if (callState != CallState.RECEIVED_CALL_WITHOUT_OFFER) {
            z2 = true;
        }
        AnonymousClass00B.A0C("This call state is not supported in Android", z2);
    }

    public void NoSamplingRatesForAudioRecord() {
        Log.i("VoiceService EVENT:NoSamplingRatesForAudioRecord");
        C447225g r2 = this.this$0;
        r2.A0W(23, r2.A1X.getString(R.string.str1a7d));
    }

    public void audioDriverRestart() {
        Log.i("VoiceService EVENT:audioDriverRestart");
    }

    public void audioInitError() {
        Log.i("VoiceService EVENT:audioInitError");
        this.this$0.A1j.A01().edit().remove("audio_sampling_hash").remove("audio_sampling_rates").apply();
        C447225g r2 = this.this$0;
        r2.A0W(23, r2.A1X.getString(R.string.str1a7d));
    }

    public void audioRouteChangeRequest(int i2) {
        Log.i("VoiceService EVENT:audioRouteChangeRequest");
        this.this$0.A0L.removeMessages(27);
        this.this$0.A0L.obtainMessage(27, i2, 0).sendToTarget();
    }

    public void audioStreamStarted() {
        Log.i("VoiceService EVENT:audioStreamStarted");
    }

    public void audioTestReplayFinished() {
        throw new AssertionError("audioTestReplayFinished is a debug only method");
    }

    public void batteryLevelLow() {
        Log.i("VoiceService EVENT:batteryLevelLow");
        this.this$0.A0L.sendEmptyMessage(18);
    }

    public void callAcceptFailed() {
        Log.i("VoiceService EVENT:callAcceptFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void callAcceptReceived() {
        Log.i("VoiceService EVENT:callAcceptReceived");
    }

    public void callAutoConnected(String str, String str2) {
        Log.i("VoiceService EVENT:callAutoConnected");
        Message.obtain(this.this$0.A0L, 31, new AnonymousClass4HR(str, str2)).sendToTarget();
    }

    public void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i2, Voip.RecordingInfo[] recordingInfoArr) {
        AnonymousClass00B.A0F(false);
        byte[] bArr2 = bArr;
        if (bArr != null && bArr.length > 0) {
            int i3 = i2;
            if (i2 > 0) {
                Voip.RecordingInfo[] recordingInfoArr2 = recordingInfoArr;
                if (recordingInfoArr != null) {
                    C447225g.A2w.execute(new RunnableRunnableShape0S0401000_I0(this, recordingInfoArr2, debugTapType, bArr2, i3, 1));
                }
            }
        }
    }

    public void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr) {
        AnonymousClass00B.A0F(false);
        C447225g.A2w.execute(new RunnableRunnableShape3S0200000_I0_1(recordingInfoArr, 46, debugTapType));
    }

    public void callEnding(CallLogInfo callLogInfo, int i2, String str) {
        C447225g r2;
        AnonymousClass1ZF r4;
        Boolean A00;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:callEnding result=");
        CallLogInfo callLogInfo2 = callLogInfo;
        sb.append(callLogInfo == null ? "null" : Integer.valueOf(callLogInfo2.callLogResultType));
        sb.append(" rating interval=");
        int i3 = i2;
        sb.append(i3);
        sb.append(" time series dir= ");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        if (this.this$0.A2s == null) {
            this.this$0.A2s = Integer.valueOf(i3);
        }
        this.this$0.A2t = str2;
        AnonymousClass1OK r22 = this.this$0.A21;
        Integer A01 = Voip.A01("options.call_replayer_file_max_size");
        if (A01 != null) {
            r22.A00 = (A01.intValue() << 10) << 10;
        }
        if (this.this$0.A2r == null) {
            this.this$0.A2r = Voip.A00("options.show_voip_app_update_prompt_dialog");
        }
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        if (callInfo.callResult == 1 && (A00 = Voip.A00("options.wa_log_dummy_time_series")) != null && A00.booleanValue()) {
            AnonymousClass1OK r5 = this.this$0.A21;
            r5.A07.Acl(new RunnableRunnableShape5S0100000_I0_4((Object) r5, 10));
        }
        Boolean A002 = Voip.A00("options.wa_log_time_series");
        if (A002 != null && A002.booleanValue()) {
            this.this$0.A1b.A05();
            File file = new File(this.this$0.A1X.getFilesDir(), "wa_call_time_series.mtar.gz");
            if (file.exists()) {
                String A003 = this.this$0.A1a.A00();
                try {
                    C29551ao A004 = this.httpsFormPostFactory.A00((C29541an) null, "https://crashlogs.whatsapp.net/wa_clb_data", 16);
                    A004.A06(Facebook.TOKEN, "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                    A004.A05(new FileInputStream(file), "attachment", file.getName(), 0, file.length());
                    A004.A07("from_jid", A003);
                    A004.A07("tags", "voip_time_series");
                    A004.A07("android_hprof_extras", this.this$0.A1a.A01((String) null));
                    A004.A02((C29561ap) null);
                } catch (IOException e2) {
                    Log.w("app/VoiceService: could not open time series log data", e2);
                } catch (Throwable th) {
                    if (!file.delete()) {
                        Log.i("app/VoiceService: time series log could not be deleted");
                    }
                    throw th;
                }
                if (!file.delete()) {
                    Log.i("app/VoiceService: time series log could not be deleted");
                }
            }
        }
        this.this$0.A0S();
        int i4 = callInfo.callSetupErrorType;
        if (i4 == 17 && (callInfo.isCaller || callInfo.callState == CallState.ACCEPT_SENT)) {
            C447225g r52 = this.this$0;
            UserJid peerJid = callInfo.getPeerJid();
            AnonymousClass00B.A06(peerJid);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(peerJid);
            r52.A1c.A0K(new RunnableRunnableShape0S1201000_I0(r52, arrayList, (String) null, 6, 1));
        } else if (callInfo.callResult == 6 && ((i4 == 18 || i4 == 19) && (r4 = r2.A0a) != null)) {
            ((VoipActivityV2) r4).A1f = (r2 = this.this$0).A1X.getString(R.string.str1a73);
        }
        C37831po A0D = this.this$0.A0D(callInfo.callId);
        if (A0D == null) {
            AnonymousClass00B.A06(callInfo.getInitialPeerJid());
            StringBuilder sb2 = new StringBuilder("VoiceService:callEnding getCallLog with key[jid=");
            sb2.append(callInfo.getInitialPeerJid());
            sb2.append("; fromMe=");
            sb2.append(callInfo.isCaller);
            sb2.append("; callId=");
            sb2.append(callInfo.callId);
            sb2.append("; transactionId=");
            sb2.append(callInfo.initialGroupTransactionId);
            sb2.append("]");
            Log.i(sb2.toString());
            A0D = this.this$0.A2L.A03(new C35011lE(callInfo.initialGroupTransactionId, callInfo.getInitialPeerJid(), C30341cC.A0B(callInfo.callId), callInfo.isCaller));
            if (A0D == null) {
                StringBuilder sb3 = new StringBuilder("can not find message for call ");
                sb3.append(callInfo.callId);
                AnonymousClass00B.A08(sb3.toString());
                return;
            }
        }
        int i5 = 0;
        if (callLogInfo != null) {
            if (!(callInfo.isJoinableGroupCall && callInfo.callState == CallState.REJOINING && A0D.A00 == 5)) {
                int i6 = callLogInfo2.callLogResultType;
                synchronized (A0D) {
                    if (A0D.A00 != i6) {
                        A0D.A0J = true;
                    }
                    A0D.A00 = i6;
                }
            }
            Map map = callLogInfo2.groupCallLogs;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    UserJid nullable = UserJid.getNullable((String) entry.getKey());
                    if (nullable != null) {
                        A0D.A07(nullable, ((Number) entry.getValue()).intValue());
                    } else {
                        StringBuilder sb4 = new StringBuilder("VoiceService:callEnding got a bad group participant jid: ");
                        sb4.append((String) entry.getKey());
                        Log.e(sb4.toString());
                    }
                }
            }
            long j2 = callLogInfo2.txTotalBytes;
            if (j2 < 0 || j2 > FileUtils.ONE_GB) {
                StringBuilder sb5 = new StringBuilder("Not recording too big value for txTotalBytes ");
                sb5.append(j2);
                Log.e(sb5.toString());
            } else {
                i5 = (int) (((long) 0) + j2);
                C17130ua r3 = this.this$0.A1e;
                r3.A04(j2, 2);
                r3.A05.A01(j2);
            }
            long j3 = callLogInfo2.rxTotalBytes;
            if (j3 < 0 || j3 > FileUtils.ONE_GB) {
                StringBuilder sb6 = new StringBuilder("Not recording too big value for rxTotalBytes ");
                sb6.append(j3);
                Log.e(sb6.toString());
            } else {
                i5 = (int) (((long) i5) + j3);
                C17130ua r23 = this.this$0.A1e;
                r23.A03(j3, 2);
                r23.A05.A02(j3, 2);
            }
        }
        int max = A0D.A01 + ((int) ((Math.max(0, callInfo.callDuration) + 999) / 1000));
        synchronized (A0D) {
            if (A0D.A01 != max) {
                A0D.A0J = true;
            }
            A0D.A01 = max;
        }
        boolean z2 = this.this$0.A1K;
        synchronized (A0D) {
            if (A0D.A09 != z2) {
                A0D.A0J = true;
            }
            A0D.A09 = z2;
        }
        long j4 = A0D.A02 + ((long) i5);
        synchronized (A0D) {
            if (A0D.A02 != j4) {
                A0D.A0J = true;
            }
            A0D.A02 = j4;
        }
        A0D.A09(callInfo.videoEnabled);
        this.this$0.A0f(callInfo.groupJid, A0D);
        StringBuilder sb7 = new StringBuilder("VoiceService:callEnding update call log db, call result = ");
        sb7.append(A0D.A00);
        sb7.append(", video=");
        sb7.append(A0D.A0I);
        sb7.append(", duration=");
        sb7.append(A0D.A01);
        sb7.append(", total data usage: ");
        sb7.append(i5);
        sb7.append("B");
        Log.i(sb7.toString());
        this.this$0.A2L.A08(A0D);
    }

    public void callGridRankingChanged() {
        this.this$0.A0L.sendEmptyMessage(45);
    }

    public void callLinkStateChanged(int i2, CallLinkInfo callLinkInfo) {
        CallLinkInfo callLinkInfo2 = callLinkInfo;
        if (callLinkInfo != null) {
            int i3 = callLinkInfo2.linkState;
            StringBuilder sb = new StringBuilder("VoiceService EVENT:callLinkStateChanged(");
            int i4 = i2;
            sb.append(C32021fW.A00(i4));
            sb.append(", ");
            sb.append(C32021fW.A00(i3));
            sb.append(')');
            Log.i(sb.toString());
            if (i4 == 3 && i3 == 4) {
                C447225g r4 = this.this$0;
                r4.A1I = true;
                C447225g.A05(r4, callLinkInfo2.videoEnabled);
                CallInfo callInfo = Voip.getCallInfo();
                AnonymousClass00B.A06(callInfo);
                if (this.this$0.A0D(callInfo.callId) == null) {
                    C38591r2 A09 = this.this$0.A09(callLinkInfo2.creatorJid, callLinkInfo2.token);
                    UserJid peerJid = callInfo.getPeerJid();
                    AnonymousClass00B.A06(peerJid);
                    int i5 = callInfo.initialGroupTransactionId;
                    UserJid creatorJid = callInfo.getCreatorJid();
                    AnonymousClass00B.A06(creatorJid);
                    DeviceJid primaryDevice = creatorJid.getPrimaryDevice();
                    C447225g r11 = this.this$0;
                    AnonymousClass1D0 r42 = r11.A2L;
                    String A0B = C30341cC.A0B(callInfo.callId);
                    long A00 = r11.A2D.A00();
                    boolean z2 = callLinkInfo2.videoEnabled;
                    AnonymousClass00B.A06(primaryDevice);
                    C35011lE r15 = new C35011lE(i5, peerJid, A0B, true);
                    r42.A07(r15);
                    C37831po r10 = new C37831po((C38591r2) null, primaryDevice, (GroupJid) null, (C38601r3) null, r15, (C38571r0) null, (String) null, Collections.emptyList(), 0, 0, -1, A00, 0, z2, false, false, false, false);
                    r42.A0A(r10);
                    for (C32001fU r43 : callInfo.participants.values()) {
                        C16040sK r2 = this.this$0.A1d;
                        UserJid userJid = r43.A07;
                        if (!r2.A0I(userJid)) {
                            r10.A07(userJid, 2);
                        }
                    }
                    this.this$0.A0q(r10, true);
                    synchronized (r10) {
                        r10.A0G = A09;
                        r10.A0J = true;
                    }
                    this.this$0.A2L.A09(r10);
                }
            }
            Message obtain = Message.obtain(this.this$0.A0L, 42, callLinkInfo2);
            obtain.arg1 = i4;
            obtain.sendToTarget();
        }
    }

    public void callMissed(String str, UserJid userJid, String str2, String str3, int i2, long j2, boolean z2, CallGroupInfo callGroupInfo, boolean z3, boolean z4, boolean z5, GroupJid groupJid) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:callMissed ");
        UserJid userJid2 = userJid;
        sb.append(userJid2);
        Log.i(sb.toString());
        CallGroupInfo callGroupInfo2 = callGroupInfo;
        String str4 = str;
        C37831po A03 = this.this$0.A2L.A03(new C35011lE((callGroupInfo == null || callGroupInfo2.participants.length <= 0) ? -1 : callGroupInfo2.transactionId, userJid2, C30341cC.A0B(str4), false));
        CallInfo callInfo = Voip.getCallInfo();
        boolean equals = callInfo != null ? str4.equals(callInfo.callWaitingInfo.A04) : false;
        if (A03 != null) {
            this.this$0.A0f(groupJid, A03);
            this.this$0.A0j(callGroupInfo2, A03, Integer.valueOf(i2), str4, str2, str3, 4, j2, z2, equals, z3, z4, z5);
        }
    }

    public void callOfferAcked() {
        Log.i("VoiceService EVENT:callOfferAcked");
        this.this$0.A0K.removeMessages(2);
        this.this$0.A17 = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (callInfo.isJoinableGroupCall) {
                C447225g r1 = this.this$0;
                UserJid initialPeerJid = callInfo.getInitialPeerJid();
                AnonymousClass00B.A06(initialPeerJid);
                boolean z2 = callInfo.isCaller;
                String str = callInfo.callId;
                C37831po A03 = r1.A2L.A03(new C35011lE(callInfo.initialGroupTransactionId, initialPeerJid, C30341cC.A0B(str), z2));
                if (A03 != null) {
                    for (UserJid userJid : callInfo.participants.keySet()) {
                        C32001fU r0 = (C32001fU) callInfo.participants.get(userJid);
                        if (r0 != null && !r0.A0G) {
                            A03.A07(userJid, 2);
                        }
                    }
                    A03.A09(callInfo.videoEnabled);
                    this.this$0.A0f(callInfo.groupJid, A03);
                    if (A03.A06 == null) {
                        this.this$0.A0q(A03, true);
                    }
                    this.this$0.A2L.A08(A03);
                }
            }
            C447225g.A05(this.this$0, callInfo.videoEnabled);
            if (Voip.A00("options.caller_end_call_threshold") != null) {
                this.this$0.A0o = Voip.A01("options.caller_end_call_threshold");
            }
            CallState callState = callInfo.callState;
            if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
                Integer A01 = Voip.A01("options.caller_timeout");
                if (A01 != null) {
                    long intValue = ((long) (A01.intValue() * 1000)) - (SystemClock.elapsedRealtime() - this.this$0.A09);
                    if (intValue > 0) {
                        int i2 = (intValue > 120000 ? 1 : (intValue == 120000 ? 0 : -1));
                    }
                }
                this.this$0.A0s(callInfo.callState, callInfo.callId);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (isSelfNacked(r13) != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r3.errorCode == 432) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[] r13) {
        /*
            r12 = this;
            com.whatsapp.voipcalling.CallInfo r8 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r8 != 0) goto L_0x000d
            java.lang.String r0 = "we are not in a active call"
        L_0x0009:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000d:
            if (r13 == 0) goto L_0x0028
            int r10 = r13.length
            if (r10 == 0) goto L_0x0028
            r11 = 0
            r7 = 1
            if (r10 != r7) goto L_0x002b
            r0 = r13[r11]
            int r1 = r0.errorCode
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0022
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x002b
        L_0x0022:
            java.lang.String r0 = "Server received duplicate offers. Just return"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0028:
            java.lang.String r0 = "Received offer nack without any errors"
            goto L_0x0009
        L_0x002b:
            java.lang.String r1 = "VoiceService EVENT:callOfferNacked error: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r10)
            java.util.Map r0 = r8.participants
            int r1 = r0.size()
            int r1 = r1 - r7
            r0 = r13[r11]
            int r5 = r0.errorCode
            if (r1 == r10) goto L_0x0055
            boolean r0 = r12.isSelfNacked(r13)
            r9 = 0
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            r9 = 1
        L_0x0056:
            r4 = 0
        L_0x0057:
            r3 = r13[r4]
            int r2 = r3.errorCode
            r1 = 432(0x1b0, float:6.05E-43)
            r0 = 0
            if (r2 != r1) goto L_0x0061
            r0 = 1
        L_0x0061:
            if (r9 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x0067
            int r5 = r3.errorCode
        L_0x0067:
            int r0 = r3.errorCode
            r9 = 0
            if (r0 != r1) goto L_0x006d
        L_0x006c:
            r9 = 1
        L_0x006d:
            com.whatsapp.jid.UserJid r0 = r3.errorJid
            r6.add(r0)
            int r4 = r4 + 1
            if (r4 < r10) goto L_0x0057
            com.whatsapp.voipcalling.CallState r1 = r8.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 != r0) goto L_0x007f
            if (r9 == 0) goto L_0x007f
            r11 = 1
        L_0x007f:
            X.25g r0 = r12.this$0
            r0.A17 = r7
            if (r11 == 0) goto L_0x0089
            r12.handleFatalOfferNack(r6, r5, r8)
            return
        L_0x0089:
            r12.handleNonFatalOfferNack(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback.callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[]):void");
    }

    public void callOfferReceiptReceived() {
        Log.i("VoiceService EVENT:callOfferReceiptReceived");
    }

    public void callOfferReceived() {
        Log.i("VoiceService EVENT:callOfferReceived");
    }

    public void callOfferSent() {
        Log.i("VoiceService EVENT:callOfferSent");
    }

    public void callPreAcceptReceived() {
        Log.i("VoiceService EVENT:callPreAcceptReceived");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callRejectReceived(com.whatsapp.jid.UserJid r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "VoiceService EVENT:callRejectReceived("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r2 == 0) goto L_0x005c
            boolean r0 = r2.isGroupCall
            r4 = 3
            java.lang.String r6 = "uncallable"
            java.lang.String r3 = "tos"
            java.lang.String r7 = "busy"
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L_0x00a2
            X.25g r0 = r10.this$0
            X.0sP r1 = r0.A28
            X.0sG r0 = r0.A27
            X.0sH r0 = r0.A0A(r11)
            java.lang.String r5 = r1.A0C(r0)
            int r0 = r12.hashCode()
            switch(r0) {
                case 0: goto L_0x005d;
                case 115032: goto L_0x006d;
                case 3035641: goto L_0x0072;
                case 1353979473: goto L_0x0080;
                default: goto L_0x0040;
            }
        L_0x0040:
            X.25g r0 = r10.this$0
            android.content.Context r2 = r0.A1X
            r1 = 2131892319(0x7f12185f, float:1.9419383E38)
        L_0x0047:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r5
            java.lang.String r2 = r2.getString(r1, r0)
        L_0x004f:
            X.25g r0 = r10.this$0
            android.os.Handler r1 = r0.A0L
            r0 = 26
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r2)
            r0.sendToTarget()
        L_0x005c:
            return
        L_0x005d:
            java.lang.String r0 = ""
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0040
            X.25g r0 = r10.this$0
            android.content.Context r2 = r0.A1X
            r1 = 2131892889(0x7f121a99, float:1.942054E38)
            goto L_0x0047
        L_0x006d:
            boolean r0 = r12.equals(r3)
            goto L_0x0084
        L_0x0072:
            boolean r0 = r12.equals(r7)
            if (r0 == 0) goto L_0x0040
            X.25g r0 = r10.this$0
            android.content.Context r2 = r0.A1X
            r1 = 2131890582(0x7f121196, float:1.941586E38)
            goto L_0x0047
        L_0x0080:
            boolean r0 = r12.equals(r6)
        L_0x0084:
            if (r0 == 0) goto L_0x0040
            boolean r1 = r2.videoEnabled
            X.25g r0 = r10.this$0
            if (r1 == 0) goto L_0x0092
            android.content.Context r2 = r0.A1X
            r1 = 2131893015(0x7f121b17, float:1.9420795E38)
            goto L_0x0047
        L_0x0092:
            X.013 r4 = r0.A2H
            r3 = 2131755411(0x7f100193, float:1.91417E38)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r5
            java.lang.String r2 = r4.A0J(r0, r3, r1)
            goto L_0x004f
        L_0x00a2:
            boolean r0 = r7.equals(r12)
            r7 = 0
            if (r0 == 0) goto L_0x00bc
            X.25g r0 = r10.this$0
            r0.A1N = r9
            android.os.Handler r0 = r0.A0K
            r0.removeCallbacksAndMessages(r7)
            X.25g r0 = r10.this$0
            android.os.Handler r2 = r0.A0K
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.sendEmptyMessageDelayed(r4, r0)
            return
        L_0x00bc:
            boolean r0 = r6.equals(r12)
            r1 = 12
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r3.equals(r12)
            if (r0 != 0) goto L_0x00d0
            X.25g r0 = r10.this$0
            r0.A0W(r1, r7)
            return
        L_0x00d0:
            X.25g r0 = r10.this$0
            r0.A0W(r1, r7)
            X.25g r5 = r10.this$0
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x00dd
            r8 = 11
        L_0x00dd:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r9)
            r6.add(r11)
            X.0pt r0 = r5.A1c
            com.facebook.redex.RunnableRunnableShape0S1201000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S1201000_I0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A0K(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback.callRejectReceived(com.whatsapp.jid.UserJid, java.lang.String):void");
    }

    public void callStateChanged(CallState callState, CallInfo callInfo) {
        C46812Gi r0;
        Handler handler;
        int i2;
        long j2;
        CallInfo callInfo2 = callInfo;
        if (callInfo != null) {
            CallState callState2 = callInfo2.callState;
            validateCallState(callState2);
            StringBuilder sb = new StringBuilder("VoiceService EVENT:callStateChanged(");
            sb.append(callState);
            sb.append(", ");
            sb.append(callState2);
            sb.append(')');
            Log.i(sb.toString());
            if (callState2 != callState) {
                CallState callState3 = CallState.RECEIVED_CALL;
                if (callState2 == callState3 || (callState2 == CallState.ACTIVE && callState == CallState.REJOINING)) {
                    C447225g.A05(this.this$0, callInfo2.videoEnabled);
                }
                CallState callState4 = CallState.CALLING;
                if (callState2 != callState4) {
                    this.this$0.A0s(callState2, callInfo2.callId);
                }
                if (callState2 == CallState.REJOINING || callState2 == CallState.ACTIVE || callState2 == CallState.CONNECTED_LONELY || callState2 == CallState.NONE) {
                    this.this$0.A0K.removeCallbacksAndMessages((Object) null);
                } else {
                    if (callState2 == CallState.ACCEPT_RECEIVED || callState2 == CallState.ACCEPT_SENT) {
                        this.this$0.A0K.removeCallbacksAndMessages((Object) null);
                        handler = this.this$0.A0K;
                        i2 = 1;
                        j2 = AnonymousClass1NO.A0L;
                    } else if (callState2 == callState3) {
                        this.this$0.A0K.removeCallbacksAndMessages((Object) null);
                        this.this$0.A0K.sendEmptyMessageDelayed(4, callInfo2.isGroupCall ? 23000 : 45000);
                        this.this$0.A0K.sendEmptyMessageDelayed(0, callInfo2.isGroupCall ? 23000 : 45000);
                    } else if (callState2 == callState4 || callState2 == CallState.PRE_ACCEPT_RECEIVED) {
                        this.this$0.A0K.removeCallbacksAndMessages((Object) null);
                        this.this$0.A0K.sendEmptyMessageDelayed(0, 90000);
                        handler = this.this$0.A0K;
                        i2 = 2;
                        j2 = 15000;
                    } else {
                        StringBuilder sb2 = new StringBuilder("UNKNOWN call state ");
                        sb2.append(callState2);
                        AnonymousClass00B.A08(sb2.toString());
                    }
                    handler.sendEmptyMessageDelayed(i2, j2);
                }
                int ordinal = callState2.ordinal();
                switch (ordinal) {
                    case 0:
                    case 3:
                    case 7:
                        break;
                    case 2:
                        this.this$0.A2c.Acl(new RunnableRunnableShape3S0200000_I0_1(this, 45, callInfo2));
                        break;
                    case 6:
                    case 11:
                        C447225g r2 = this.this$0;
                        r2.A01 = Double.NaN;
                        r2.A0L.removeMessages(3);
                        this.this$0.A0L.sendEmptyMessage(3);
                        this.this$0.A1k.A03();
                        break;
                }
                this.this$0.A0L.removeCallbacksAndMessages((Object) null);
                if (callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) {
                    C447225g r22 = this.this$0;
                    r22.A00 = Double.NaN;
                    r22.A0L.sendEmptyMessage(17);
                }
                Message.obtain(this.this$0.A0L, 4, callState.ordinal(), ordinal, callInfo2).sendToTarget();
                C19470yU r23 = this.this$0.A2Q;
                if (r23 instanceof AnonymousClass11B) {
                    AnonymousClass11B r24 = (AnonymousClass11B) r23;
                    if (r24.A04.A00.A05(C15910s6.A11)) {
                        for (AnonymousClass1V3 r4 : r24.A05.A00()) {
                            if (r4 instanceof C46802Gh) {
                                C46802Gh r42 = (C46802Gh) r4;
                                if (!C204210b.A02(callState).equals(C204210b.A02(callInfo2.callState))) {
                                    try {
                                        C15880s3 A02 = r42.A07.A02("com.facebook.stella");
                                        AnonymousClass1GM r02 = r42.A04;
                                        try {
                                            r0 = new C46812Gi("call_state_changed", C204210b.A03(r02.A00, r02.A01, r02.A02, r02.A03, r02.A04, A02, callInfo2, callInfo2.callState));
                                        } catch (JSONException unused) {
                                            r0 = null;
                                        }
                                        r42.A01(r0);
                                    } catch (SecurityException e2) {
                                        Log.e("StellaEventHandler/cannot create event for untrusted package", e2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void callTerminateReceived() {
        Log.i("VoiceService EVENT:callTerminateReceived");
    }

    public void callWaitingStateChanged(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:callWaitingStateChanged ");
        sb.append(i2);
        Log.i(sb.toString());
        CallInfo callInfo = Voip.getCallInfo();
        String str = callInfo != null ? callInfo.callWaitingInfo.A04 : null;
        this.this$0.A0L.removeMessages(34);
        this.this$0.A0L.obtainMessage(34, i2, 0, str).sendToTarget();
    }

    public void errorGatheringHostCandidates() {
        Log.i("VoiceService EVENT:errorGatheringHostCandidates");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fieldstatsReady(com.whatsapp.fieldstats.events.WamCall r25, java.lang.String r26, boolean r27, boolean r28) {
        /*
            r24 = this;
            r13 = r28
            java.lang.String r0 = "VoiceService EVENT:fieldstatsReady lastReport: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r14 = r27
            r1.append(r14)
            java.lang.String r0 = ", realtime="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            r8 = r24
            X.25g r0 = r8.this$0
            java.lang.Long r0 = r0.A0t
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r7 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r7 != 0) goto L_0x0038
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0038:
            X.25g r1 = r8.this$0
            java.lang.String r0 = r7.callId
            X.4HS r5 = r1.A0A(r0)
            X.25g r0 = r8.this$0
            java.util.Set r0 = r0.A2o
            r0.clear()
            X.25g r0 = r8.this$0
            X.01V r0 = r0.A2C
            android.media.AudioManager r6 = r0.A0G()
            r1 = 0
            if (r6 != 0) goto L_0x0151
            r19 = r1
        L_0x0054:
            X.25g r11 = r8.this$0
            com.whatsapp.jid.UserJid r17 = com.whatsapp.jid.UserJid.getNullable(r26)
            X.25g r0 = r8.this$0
            java.lang.Long r10 = r0.A0t
            java.lang.Integer r4 = r0.A0l
            java.lang.Integer r3 = r0.A0n
            java.lang.String r2 = r0.A12
            java.lang.String r0 = r0.A11
            r9 = r25
            r15 = r11
            r16 = r9
            r18 = r4
            r20 = r3
            r21 = r10
            r22 = r2
            r23 = r0
            r15.A0d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Integer r0 = r5.A00
            if (r0 == 0) goto L_0x007e
            r9.incomingCallUiAction = r0
        L_0x007e:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0086
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.isRering = r0
        L_0x0086:
            X.25g r2 = r8.this$0
            java.lang.Long r0 = r2.A0u
            if (r0 == 0) goto L_0x008e
            r9.telecomFrameworkCallStartDelayT = r0
        L_0x008e:
            java.lang.Long r0 = r2.A0v
            if (r0 == 0) goto L_0x0094
            r9.androidTelecomTimeSpentBeforeReject = r0
        L_0x0094:
            r9.callHistEchoLikelihood = r1
            java.lang.Integer r0 = r9.callAecMode
            if (r0 == 0) goto L_0x0118
            java.lang.Double r0 = r9.callEchoLikelihoodBeforeEc
            if (r0 == 0) goto L_0x0118
            java.lang.Long r0 = r9.callT
            if (r0 == 0) goto L_0x0118
            int r1 = r0.intValue()
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 < r0) goto L_0x0118
            X.1OL r10 = r2.A1j
            android.content.SharedPreferences r1 = r10.A01()
            java.lang.String r2 = "pref_hist_echo"
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getFloat(r2, r0)
            java.lang.Double r0 = r9.callEchoLikelihoodBeforeEc
            float r3 = r0.floatValue()
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x013e
            r11 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            java.lang.Integer r0 = r9.callAecMode
            int r1 = r0.intValue()
            r5 = 1
            if (r1 == r5) goto L_0x00d5
            r0 = 2
            if (r1 != r0) goto L_0x0118
        L_0x00d5:
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0137
            r0 = r3
        L_0x00da:
            int r1 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r1 < 0) goto L_0x0135
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0135
        L_0x00e2:
            java.lang.String r1 = "echo should be in the range of 0 to 100"
            X.AnonymousClass00B.A0B(r1, r5)
            android.content.SharedPreferences r1 = r10.A01()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putFloat(r2, r0)
            r1.apply()
            java.lang.String r1 = "voip/updateHistoricalEcho histEcho: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r1 = ", newEcho: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ", updated: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0118:
            X.25g r2 = r8.this$0
            java.lang.Integer r0 = r2.A0p
            r9.endCallAfterConfirmation = r0
            java.lang.Integer r0 = r2.A0r
            r9.presentEndCallConfirmation = r0
            java.lang.Integer r0 = r9.callAecMode
            r19 = 0
            r11 = 1
            if (r0 == 0) goto L_0x0164
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0175
            java.lang.Object r0 = r2.A0x
            if (r0 == 0) goto L_0x0173
            goto L_0x015b
        L_0x0135:
            r5 = 0
            goto L_0x00e2
        L_0x0137:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r4 * r1
            float r1 = r1 * r3
            float r0 = r0 + r1
            goto L_0x00da
        L_0x013e:
            java.lang.String r1 = "voip/updateHistoricalEcho wrong new Echo: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0118
        L_0x0151:
            int r0 = r6.getMode()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            goto L_0x0054
        L_0x015b:
            android.media.audiofx.AcousticEchoCanceler r0 = (android.media.audiofx.AcousticEchoCanceler) r0     // Catch:{ all -> 0x016f }
            boolean r0 = r0.getEnabled()     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0164:
            java.lang.Object r0 = r2.A0x
            if (r0 == 0) goto L_0x017c
            android.media.audiofx.AcousticEchoCanceler r0 = (android.media.audiofx.AcousticEchoCanceler) r0     // Catch:{ all -> 0x016f }
            boolean r0 = r0.getEnabled()     // Catch:{ all -> 0x016f }
            goto L_0x0176
        L_0x016f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0173:
            r0 = 0
            goto L_0x0176
        L_0x0175:
            r0 = 1
        L_0x0176:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.builtinAecEnabled = r0
        L_0x017c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x01b2
            if (r6 == 0) goto L_0x01b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ae }
            r1.<init>()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "voip/AudioManager PROPERTY_OUTPUT_SAMPLE_RATE = "
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r0 = r6.getProperty(r0)     // Catch:{ all -> 0x01ae }
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = ", PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r0 = r6.getProperty(r0)     // Catch:{ all -> 0x01ae }
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ae }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
            goto L_0x01b2
        L_0x01ae:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x01b2:
            X.25g r4 = r8.this$0
            java.lang.Integer r0 = r4.A0n
            if (r0 == 0) goto L_0x01cc
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L_0x01cc
            boolean r0 = r4.A1Q
            if (r0 == 0) goto L_0x01cc
            long r0 = r4.A0A
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r9.pushToCallOfferDelay = r0
        L_0x01cc:
            boolean r0 = r7.isCaller
            r18 = 18
            if (r0 == 0) goto L_0x0209
            X.0rz r0 = r4.A2G
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "call_offer_ack_timeout"
            r0 = 20000(0x4e20, float:2.8026E-41)
            int r0 = r2.getInt(r1, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.callOfferAckTimout = r0
            X.25g r0 = r8.this$0
            int r2 = r0.A2p
            r0 = 13
            r1 = 14
            if (r2 != r0) goto L_0x03fc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r9.callResult = r0
            r13 = 1
        L_0x01fc:
            X.25g r4 = r8.this$0
            int r0 = r4.A02
            if (r0 <= 0) goto L_0x0209
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.callOfferDelayT = r0
        L_0x0209:
            boolean r0 = r7.videoEnabled
            if (r0 == 0) goto L_0x0264
            java.lang.String r0 = android.os.Build.HARDWARE
            r9.deviceHardware = r0
            java.lang.String r0 = android.os.Build.BOARD
            r9.deviceBoard = r0
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r4.A2f
            int r0 = r0.getCameraStartMode()
            r2 = 2
            if (r0 == 0) goto L_0x03f4
            if (r0 == r11) goto L_0x03ec
            if (r0 == r2) goto L_0x03e4
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.cameraStartMode = r0
        L_0x022a:
            X.25g r0 = r8.this$0
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A2f
            boolean r1 = r0.isCameraTextureApiFailed()
            r0 = 1
            if (r1 == 0) goto L_0x0236
            r0 = 2
        L_0x0236:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.cameraPreviewMode = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0264
            X.25g r0 = r8.this$0
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A2f
            int r0 = r0.getCurrentApiVersion()
            if (r0 != r2) goto L_0x0252
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r9.androidCameraApi = r0
        L_0x0252:
            if (r27 == 0) goto L_0x0264
            X.25g r0 = r8.this$0
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A2f
            int r0 = r0.getCachedCam2HardwareLevel()
            if (r0 < 0) goto L_0x0264
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.androidCamera2MinHardwareSupportLevel = r0
        L_0x0264:
            r12 = 10
            if (r27 == 0) goto L_0x039e
            X.25g r2 = r8.this$0
            int r0 = r2.A03
            if (r0 <= 0) goto L_0x0275
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.groupCallVideoMaximizedCount = r0
        L_0x0275:
            r2.A0I()
            X.25g r10 = r8.this$0
            long r0 = r10.A0E
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0288
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.androidSystemPictureInPictureT = r0
        L_0x0288:
            X.4KJ r1 = r10.A0Z
            if (r1 == 0) goto L_0x029e
            boolean r0 = r7.isCaller
            if (r0 == 0) goto L_0x029e
            long r2 = r1.A00
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x03df
            r2 = -1
        L_0x0298:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r9.offerAckLatencyMs = r0
        L_0x029e:
            X.4KJ r3 = r10.A0V
            if (r3 == 0) goto L_0x02b0
            long r0 = r3.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x03da
            r0 = -1
        L_0x02aa:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.acceptAckLatencyMs = r0
        L_0x02b0:
            java.lang.Integer r0 = r9.callResult
            if (r0 == 0) goto L_0x039e
            int r0 = r0.intValue()
            if (r0 == r11) goto L_0x02bc
            if (r0 != r12) goto L_0x039e
        L_0x02bc:
            X.0t3 r0 = r10.A2D
            long r0 = r0.A00()
            X.25g r2 = r8.this$0
            X.1OL r2 = r2.A1j
            android.content.SharedPreferences r10 = r2.A01()
            java.lang.String r3 = "previous_call_peer_id"
            r2 = 0
            java.lang.String r2 = r10.getString(r3, r2)
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.getNullable(r2)
            X.25g r2 = r8.this$0
            X.1OL r2 = r2.A1j
            android.content.SharedPreferences r2 = r2.A01()
            java.lang.String r10 = "previous_call_end_time"
            long r16 = r2.getLong(r10, r4)
            if (r15 == 0) goto L_0x0340
            int r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0340
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0340
            X.25g r2 = r8.this$0
            X.1OL r2 = r2.A1j
            android.content.SharedPreferences r5 = r2.A01()
            java.lang.String r4 = "previous_call_video_enabled"
            r2 = 0
            boolean r2 = r5.getBoolean(r4, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r9.previousCallVideoEnabled = r2
            com.whatsapp.jid.UserJid r2 = r7.getPeerJid()
            X.AnonymousClass00B.A06(r2)
            boolean r2 = r15.equals(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r9.previousCallWithSamePeer = r2
            long r4 = r0 - r16
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            r9.previousCallInterval = r5
            java.lang.String r2 = "VoiceService:fieldstatsReady previous call callInfo: interval "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r5)
            java.lang.String r2 = ", video enabled "
            r4.append(r2)
            java.lang.Boolean r2 = r9.previousCallVideoEnabled
            r4.append(r2)
            java.lang.String r2 = ", with same peer "
            r4.append(r2)
            java.lang.Boolean r2 = r9.previousCallWithSamePeer
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0340:
            java.lang.Integer r2 = r9.callResult
            int r2 = r2.intValue()
            if (r2 != r11) goto L_0x039e
            X.25g r2 = r8.this$0
            X.1OL r2 = r2.A1j
            r16 = r2
            boolean r5 = r7.videoEnabled
            com.whatsapp.jid.UserJid r4 = r7.getPeerJid()
            X.AnonymousClass00B.A06(r4)
            java.lang.String r2 = r7.tsLogCallId
            java.lang.String r11 = "setPreviousCallInfo callEndTime "
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r11)
            r15.append(r0)
            java.lang.String r11 = ", video enabled "
            r15.append(r11)
            r15.append(r5)
            java.lang.String r11 = ", peerId "
            r15.append(r11)
            r15.append(r4)
            java.lang.String r11 = r15.toString()
            com.whatsapp.util.Log.i((java.lang.String) r11)
            android.content.SharedPreferences r11 = r16.A01()
            android.content.SharedPreferences$Editor r11 = r11.edit()
            android.content.SharedPreferences$Editor r1 = r11.putLong(r10, r0)
            java.lang.String r0 = "previous_call_video_enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r5)
            java.lang.String r0 = r4.getRawString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r0)
            java.lang.String r0 = "previous_call_tslog_call_id"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x039e:
            java.lang.Integer r0 = r9.callTermReason
            if (r0 == 0) goto L_0x03ad
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x03ad
            java.lang.String r0 = "VoiceService: call end because detect some peer's identity is changed!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x03ad:
            X.25g r2 = r8.this$0
            java.lang.Long r0 = r2.A0w
            if (r0 == 0) goto L_0x03b5
            r9.wifiRssiAtCallStart = r0
        L_0x03b5:
            java.lang.String r1 = r7.callId
            java.lang.String r0 = r9.callRandomId
            java.lang.String r2 = r2.A0E(r1, r0)
            r9.callRandomId = r2
            java.lang.String r1 = "VoiceService:fieldstatsReady callRandomId: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r27 != 0) goto L_0x040a
            X.25g r0 = r8.this$0
            X.0w0 r0 = r0.A1x
            r0.A02(r9, r13)
            return
        L_0x03da:
            long r2 = r3.A01
            long r0 = r0 - r2
            goto L_0x02aa
        L_0x03df:
            long r0 = r1.A01
            long r2 = r2 - r0
            goto L_0x0298
        L_0x03e4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r9.cameraStartMode = r0
            goto L_0x022a
        L_0x03ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r9.cameraStartMode = r0
            goto L_0x022a
        L_0x03f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r9.cameraStartMode = r0
            goto L_0x022a
        L_0x03fc:
            X.25g r0 = r8.this$0
            int r0 = r0.A2p
            if (r0 != r1) goto L_0x01fc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r9.callResult = r0
            goto L_0x01fc
        L_0x040a:
            X.25g r2 = r8.this$0
            java.lang.Boolean r1 = r2.A0g
            if (r1 == 0) goto L_0x0416
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0474
        L_0x0416:
            if (r6 == 0) goto L_0x0474
            boolean r0 = r2.A0z(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0g = r0
        L_0x0422:
            X.25g r0 = r8.this$0
            boolean r0 = r0.A1J
            if (r0 == 0) goto L_0x042e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r9.callTermReason = r0
        L_0x042e:
            if (r6 == 0) goto L_0x0440
            X.1fU r0 = r7.self
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0440
            boolean r0 = r6.isMicrophoneMute()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.isOsMicrophoneMute = r0
        L_0x0440:
            X.25g r1 = r8.this$0
            int r0 = r1.A07
            if (r0 != 0) goto L_0x044a
            boolean r0 = r1.A1D
            if (r0 == 0) goto L_0x044c
        L_0x044a:
            r19 = 1
        L_0x044c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r9.pstnCallExists = r0
            X.4Ly r0 = r1.A1l
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.connectedToCar = r0
            r1.A0d = r9
            r1.A1T = r13
            java.lang.String r0 = "VoiceService:fieldstatsReady call ending. callFieldStat will be posted when call/link state change to None. callOfferElapsedTimeInMillisOnServer: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Long r0 = r9.callOfferElapsedT
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0474:
            r9.androidAudioRouteMismatch = r1
            goto L_0x0422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback.fieldstatsReady(com.whatsapp.fieldstats.events.WamCall, java.lang.String, boolean, boolean):void");
    }

    public byte[] getByteBuffer(int i2) {
        byte[] bArr;
        AnonymousClass4J4 r3 = this.bufferQueue;
        synchronized (r3) {
            Iterator it = r3.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r3.A00 += i2;
                    bArr = new byte[i2];
                    break;
                }
                bArr = (byte[]) it.next();
                if (bArr.length >= i2) {
                    it.remove();
                    break;
                }
            }
        }
        return bArr;
    }

    public void groupCallBufferHandleMessages() {
        Log.i("VoiceService EVENT:groupCallBufferProcessMessages");
        this.this$0.A14.execute(new RunnableRunnableShape0S0000000_I0(8));
    }

    public void groupInfoChanged() {
        C37831po A0D;
        Log.i("VoiceService EVENT:groupInfoChanged");
        CallInfo callInfo = Voip.getCallInfo();
        boolean z2 = true;
        if (callInfo == null) {
            z2 = false;
        } else if (callInfo.callState != CallState.NONE) {
            C447225g r0 = this.this$0;
            if (C32601gl.A04(r0.A1d, r0.A2O) && (A0D = this.this$0.A0D(callInfo.callId)) != null) {
                C35011lE r5 = A0D.A0C;
                UserJid userJid = r5.A01;
                C16040sK r02 = this.this$0.A1d;
                r02.A0B();
                if (userJid.equals(r02.A05)) {
                    AnonymousClass1D0 r4 = this.this$0.A2L;
                    UserJid peerJid = callInfo.getPeerJid();
                    AnonymousClass00B.A06(peerJid);
                    C37831po A04 = r4.A04(new C35011lE(r5.A00, peerJid, r5.A02, true), A0D);
                    A04.A07(callInfo.getPeerJid(), 2);
                    this.this$0.A2L.A09(A04);
                }
            }
            this.this$0.A0L.removeMessages(25);
            this.this$0.A0L.sendEmptyMessage(25);
            return;
        }
        AnonymousClass00B.A0B(" CallInfo should not be null in groupInfoChanged callback", z2);
    }

    public void groupParticipantLeft(UserJid userJid, String str, int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:groupParticipantLeft ");
        sb.append(userJid);
        sb.append(" (");
        sb.append(i2);
        sb.append(")");
        Log.i(sb.toString());
        if (i2 == 4) {
            if (str == null) {
                str = "";
            }
            callRejectReceived(userJid, str);
        }
    }

    public void handleAcceptAckFailed(String str, int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:handleAcceptAckFailed, error_code = ");
        sb.append(i2);
        sb.append("error_raw_device_jid: ");
        sb.append(str);
        Log.i(sb.toString());
        C447225g r2 = this.this$0;
        int i3 = 26;
        if (i2 != 434) {
            i3 = 25;
        }
        r2.A0W(i3, (String) null);
    }

    public void handleAcceptFailed() {
        Log.i("VoiceService EVENT:handleAcceptFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void handleCallFatal(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:handleCallFatal Reason: ");
        sb.append(i2);
        Log.i(sb.toString());
        C16300so r3 = this.this$0.A1a;
        StringBuilder sb2 = new StringBuilder("voip/callFatal Reason:");
        sb2.append(i2);
        r3.AcB("VoiceServiceEventCallback/handleCallFatal", sb2.toString(), true);
        this.this$0.A0W(30, (String) null);
    }

    public void handleFDLeakDetected() {
        Log.i("VoiceService EVENT:handleFDLeakDetected");
    }

    public void handleOfferAckFailed() {
        Log.i("VoiceService EVENT:handleOfferAckFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void handleOfferFailed() {
        Log.i("VoiceService EVENT:handleOfferFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void handlePreAcceptFailed() {
        Log.i("VoiceService EVENT:handlePreAcceptFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void handleVoipAssert(String str, int i2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(i2);
        String obj = sb.toString();
        if (this.this$0.A2o.add(obj)) {
            C16300so r2 = this.this$0.A1a;
            StringBuilder sb2 = new StringBuilder("voip-assert:");
            sb2.append(str);
            r2.AcB(sb2.toString(), obj, false);
            str2 = " (first occurence)";
        } else {
            str2 = "";
        }
        StringBuilder sb3 = new StringBuilder("VoipAssert at ");
        sb3.append(obj);
        sb3.append(str2);
        Log.e(sb3.toString());
    }

    public void heartbeatNacked(int i2, String str) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:heartbeatNacked callId: ");
        sb.append(str);
        sb.append(" errorCode:");
        sb.append(i2);
        Log.i(sb.toString());
        if (str.equals(Voip.getCurrentCallId())) {
            this.this$0.A0W(25, (String) null);
        }
    }

    public void interruptionStateChanged() {
        Log.i("VoiceService EVENT:interruptionStateChanged");
        this.this$0.A0L.removeMessages(30);
        this.this$0.A0L.obtainMessage(30).sendToTarget();
        this.this$0.A1u.A00(new C204710g("refresh_notification"));
    }

    public void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z2) {
        CallInfo A06 = C30341cC.A06();
        if (A06 == null) {
            Log.e("VoiceService:joinableFieldstatsReady not in an active call");
            return;
        }
        AnonymousClass4HS A0A = this.this$0.A0A(A06.callId);
        String A0E = this.this$0.A0E(A06.callId, wamJoinableCall.callRandomId);
        wamJoinableCall.callRandomId = A0E;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:joinableFieldstatsReady callId:");
        sb.append(A06.callId);
        sb.append(" callRandomId:");
        sb.append(A0E);
        sb.append(" realtime:");
        sb.append(z2);
        Log.i(sb.toString());
        C447225g r7 = this.this$0;
        int i2 = r7.A0q;
        if (i2 == null) {
            if (r7.A0B == 0) {
                i2 = 5;
            } else {
                AnonymousClass00B.A0B("Bug with tracking call lobby", false);
                r7 = this.this$0;
                i2 = 0;
            }
            r7.A0q = i2;
        }
        wamJoinableCall.lobbyEntryPoint = i2;
        long j2 = r7.A0B;
        if (j2 > 0) {
            wamJoinableCall.lobbyVisibleT = Long.valueOf(System.currentTimeMillis() - j2);
        }
        if (r7.A1C) {
            wamJoinableCall.hasSpamDialog = Boolean.TRUE;
        }
        if (A0A.A01) {
            wamJoinableCall.isRering = Boolean.TRUE;
        }
        Boolean bool = wamJoinableCall.isRejoin;
        if (bool != null && bool.booleanValue()) {
            AnonymousClass4KJ r3 = r7.A0Y;
            if (r3 != null) {
                long j3 = r3.A00;
                wamJoinableCall.lobbyAckLatencyMs = Long.valueOf(j3 == 0 ? -1 : j3 - r3.A01);
            }
            AnonymousClass4KJ r32 = r7.A0V;
            if (r32 != null) {
                long j4 = r32.A00;
                wamJoinableCall.acceptAckLatencyMs = Long.valueOf(j4 == 0 ? -1 : j4 - r32.A01);
            }
            long j5 = r7.A1j.A01().getLong("zombie_cleanup", 0);
            if (!(wamJoinableCall.lobbyExitNackCode == null || j5 == 0)) {
                wamJoinableCall.timeSinceLastClientPollMinutes = Long.valueOf(((System.currentTimeMillis() - j5) / 1000) / 60);
            }
        }
        Boolean bool2 = wamJoinableCall.isLinkJoin;
        if (bool2 != null && bool2.booleanValue()) {
            C447225g r6 = this.this$0;
            AnonymousClass4KJ r1 = r6.A0X;
            if (r1 != null) {
                long j6 = r1.A00;
                wamJoinableCall.queryAckLatencyMs = Long.valueOf(j6 == 0 ? -1 : j6 - r1.A01);
            }
            AnonymousClass4KJ r12 = r6.A0W;
            if (r12 != null) {
                long j7 = r12.A00;
                wamJoinableCall.joinAckLatencyMs = Long.valueOf(j7 == 0 ? -1 : j7 - r12.A01);
            }
        }
        C16490t9 r0 = this.this$0.A1x.A01;
        r0.A05(wamJoinableCall);
        if (z2) {
            r0.A01();
        }
    }

    public void linkCreateAcked(String str, boolean z2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:linkCreateAcked token: ");
        sb.append(str);
        sb.append(" media: ");
        sb.append(z2 ? "video" : "audio");
        Log.i(sb.toString());
        this.this$0.A1c.A0K(new RunnableRunnableShape0S1110000_I0(this, str, 1, z2));
    }

    public void linkCreateNacked(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:linkCreateNacked errorCode:");
        sb.append(i2);
        Log.i(sb.toString());
        this.this$0.A1c.A0K(new RunnableRunnableShape5S0100000_I0_4((Object) this, 8));
    }

    public void linkJoinNacked(int i2) {
        int i3;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:linkJoinNacked errorCode:");
        sb.append(i2);
        Log.i(sb.toString());
        C447225g r1 = this.this$0;
        if (i2 == 400) {
            i3 = 26;
        } else if (i2 != 404) {
            i3 = 24;
            if (i2 != 428) {
                i3 = 23;
            }
        } else {
            i3 = 22;
        }
        Message obtainMessage = r1.A0L.obtainMessage(44);
        obtainMessage.arg1 = i3;
        obtainMessage.sendToTarget();
    }

    public void linkQueryNacked(int i2) {
        int i3;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:linkQueryNacked errorCode:");
        sb.append(i2);
        Log.i(sb.toString());
        C447225g r1 = this.this$0;
        if (i2 == 400) {
            i3 = 26;
        } else if (i2 != 404) {
            i3 = 24;
            if (i2 != 428) {
                i3 = 23;
            }
        } else {
            i3 = 22;
        }
        Message obtainMessage = r1.A0L.obtainMessage(44);
        obtainMessage.arg1 = i3;
        obtainMessage.sendToTarget();
    }

    public void lobbyNacked(int i2, String str) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:lobbyNacked callId: ");
        sb.append(str);
        sb.append(" errorCode:");
        sb.append(i2);
        Log.i(sb.toString());
        if (str.equals(Voip.getCurrentCallId())) {
            this.this$0.A0W(25, (String) null);
        }
    }

    public void lobbyTimeout() {
        Log.i("VoiceService EVENT:lobbyTimeout");
        CallState currentCallState = Voip.getCurrentCallState();
        CallState callState = CallState.REJOINING;
        C447225g r2 = this.this$0;
        if (currentCallState == callState) {
            r2.A0W(28, (String) null);
        } else if (r2.A24.A01()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            AnonymousClass00B.A06(callLinkInfo);
            int i2 = callLinkInfo.linkState;
            if (i2 == 1 || i2 == 2) {
                Message obtainMessage = this.this$0.A0L.obtainMessage(44);
                obtainMessage.arg1 = 21;
                obtainMessage.sendToTarget();
            }
        }
    }

    public void lonelyStateTimeout(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:lonelyStateTimeout remainingDurationMs: ");
        sb.append(i2);
        Log.i(sb.toString());
        CallInfo A06 = C30341cC.A06();
        AnonymousClass00B.A06(A06);
        if (i2 == 0) {
            C447225g r0 = this.this$0;
            Message obtainMessage = r0.A0L.obtainMessage(49, r0.A1X.getString(R.string.str0340));
            obtainMessage.arg1 = 27;
            obtainMessage.sendToTarget();
            return;
        }
        C447225g r4 = this.this$0;
        C19380yL r3 = r4.A2E;
        String str = A06.callId;
        r3.A04(r4.A1p.A00(r4.A1X, C52122dA.A00(A06, (int) (((long) i2) / 60000), r4.A1N), r4.A1u, 1, false), str, 51, true);
    }

    public void mediaStreamError() {
        Log.i("VoiceService EVENT:mediaStreamError");
        this.this$0.A0W(30, (String) null);
    }

    public void mediaStreamStartError() {
        Log.i("VoiceService EVENT:mediaStreamStartError");
        this.this$0.A0W(30, (String) null);
    }

    public void missingRelayInfo() {
        Log.i("VoiceService EVENT:missingRelayInfo");
    }

    public void muteRequestFailed(UserJid userJid) {
        Log.i("VoiceService EVENT:muteRequestFailed");
        this.this$0.A0L.removeMessages(43);
        Message message = new Message();
        message.what = 43;
        message.obj = userJid;
        this.this$0.A0L.sendMessage(message);
    }

    public void muteStateChanged() {
        Log.i("VoiceService EVENT:muteStateChanged");
        this.this$0.A0L.removeMessages(32);
        this.this$0.A0L.sendEmptyMessage(32);
    }

    public void mutedByOthers(UserJid userJid) {
        Log.i("VoiceService EVENT:mutedByOthers");
        this.this$0.A0L.removeMessages(41);
        Message message = new Message();
        message.what = 41;
        message.obj = userJid;
        this.this$0.A0L.sendMessage(message);
    }

    public void p2pNegotaitionFailed() {
        Log.i("VoiceService EVENT:p2pNegotaitionFailed");
    }

    public void p2pNegotiationSuccess() {
        Log.i("VoiceService EVENT:p2pNegotiationSuccess");
    }

    public void p2pTransportCreateFailed() {
        Log.i("VoiceService EVENT:p2pTransportCreateFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void p2pTransportMediaCreateFailed() {
        Log.i("VoiceService EVENT:p2pTransportMediaCreateFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void p2pTransportRestartSuccess() {
        Log.i("VoiceService EVENT:p2pTransportRestartSuccess");
    }

    public void p2pTransportStartFailed() {
        Log.i("VoiceService EVENT:p2pTransportStartFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void peerBatteryLevelLow(UserJid userJid) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:peerBatteryLevelLow, Jid:");
        sb.append(userJid);
        Log.i(sb.toString());
        C447225g r1 = this.this$0;
        Message message = new Message();
        message.what = 19;
        message.obj = userJid;
        r1.A0L.sendMessageDelayed(message, 3000);
    }

    public void peerVideoStateChanged(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:peerVideoStateChanged ");
        sb.append(i2);
        Log.i(sb.toString());
        this.this$0.A0L.removeMessages(12);
        this.this$0.A0L.obtainMessage(12, i2, 0).sendToTarget();
    }

    public void playCallTone(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:playCallTone type:");
        sb.append(i2);
        Log.i(sb.toString());
        Number number = (Number) this.this$0.A2m.get(Integer.valueOf(i2));
        C447225g r3 = this.this$0;
        if (r3.A0I == null) {
            r3.A0I = new SoundPool(1, 0, 0);
        }
        if (number != null) {
            this.this$0.A0I.play(number.intValue(), 1.0f, 1.0f, 0, 0, 1.0f);
        } else {
            Log.e("VoiceService:playCallTone sound pool has not been loaded successfully");
        }
    }

    public void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i2) {
        DeviceJid nullable = DeviceJid.getNullable(str);
        AnonymousClass00B.A06(nullable);
        StringBuilder sb = new StringBuilder("VoiceService EVENT:rejectedDecryptionFailure, Jid:");
        sb.append(nullable);
        sb.append(", callId:");
        sb.append(str2);
        sb.append(", retryCount:");
        sb.append(i2);
        Log.i(sb.toString());
        this.this$0.A2k.put(nullable, str2);
        if (!this.this$0.A1y.A01(nullable, C30341cC.A0B(str2), bArr, i2)) {
            this.this$0.A0W(30, (String) null);
        }
    }

    public void relayBindsFailed(boolean z2) {
        String str;
        int i2;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:relayBindsFailed self bad asn=");
        sb.append(z2);
        Log.i(sb.toString());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        C447225g r5 = this.this$0;
        r5.A1F = z2;
        int A04 = r5.A26.A04(true);
        if (A04 == 0) {
            str = r5.A1X.getString(R.string.str1a80);
        } else {
            if (callInfo.isCaller || callInfo.callState == CallState.ACCEPT_SENT) {
                boolean z3 = r5.A1F;
                Context context = r5.A1X;
                if (z3) {
                    i2 = R.string.str1af4;
                    if (A04 == 1) {
                        i2 = R.string.str1af7;
                    }
                } else {
                    i2 = R.string.str1a7e;
                    if (A04 == 1) {
                        i2 = R.string.str1a7f;
                    }
                }
                String string = context.getString(i2);
                UserJid peerJid = callInfo.getPeerJid();
                AnonymousClass00B.A06(peerJid);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(peerJid);
                r5.A1c.A0K(new RunnableRunnableShape0S1201000_I0(r5, arrayList, string, 5, 1));
            }
            str = null;
        }
        r5.A0W(3, str);
    }

    public void relayCreateSuccess() {
        Log.i("VoiceService EVENT:relayCreateSuccess");
    }

    public void relayElectionSendFailed() {
        Log.i("VoiceService EVENT:relayElectionSendFailed");
    }

    public void relayLatencySendFailed() {
        Log.i("VoiceService EVENT:relayLatencySendFailed");
    }

    public void removeUserFailed(UserJid userJid) {
        Log.i("VoiceService EVENT:removeUserAckedOrNacked");
        this.this$0.A13.remove(userJid);
        Message.obtain(this.this$0.A0L, 47, userJid).sendToTarget();
    }

    public void restartCamera() {
        AnonymousClass1ZF r1;
        Log.i("VoiceService EVENT:restartCamera");
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && (r1 = this.this$0.A0a) != null) {
            r1.AcY(callInfo.self);
        }
    }

    public void rtcpByeReceived() {
        Log.i("VoiceService EVENT:rtcpByeReceived");
        this.this$0.A0W(18, (String) null);
    }

    public void rxTimeout() {
        Log.i("VoiceService EVENT:rxTimeout");
        this.this$0.A0W(5, (String) null);
    }

    public void rxTrafficStarted() {
        Log.i("VoiceService EVENT:rxTrafficStarted");
    }

    public void rxTrafficStateForPeerChanged() {
        Log.i("VoiceService EVENT:rxTrafficStateForPeerChanged");
        this.this$0.A0L.removeMessages(33);
        this.this$0.A0L.sendEmptyMessage(33);
    }

    public void rxTrafficStopped() {
        boolean z2 = this.this$0.A1Z.A00;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:rxTrafficStopped.  powerSavingMode: ");
        sb.append(C447225g.A08(this.this$0));
        sb.append(", isAppInForeground: ");
        sb.append(z2);
        sb.append(", screenLocked: ");
        sb.append(this.this$0.A1O);
        Log.i(sb.toString());
    }

    public void selfVideoStateChanged(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:selfVideoStateChanged ");
        sb.append(i2);
        Log.i(sb.toString());
        this.this$0.A0L.removeMessages(11);
        this.this$0.A0L.obtainMessage(11, i2, 0).sendToTarget();
    }

    public void sendAcceptFailed() {
        Log.i("VoiceService EVENT:sendAcceptFailed");
        this.this$0.A0K();
    }

    public void sendJoinableClientPollCriticalEvent(int i2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:sendJoinableClientPollCriticalEvent errorCode:");
        sb.append(i2);
        Log.i(sb.toString());
        this.this$0.A1a.AcB("linked-group-call/client-poll-nack", String.valueOf(i2), false);
    }

    public void sendLinkedGroupCallDowngradedCriticalEvent(boolean z2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:sendLinkedGroupCallDowngradedCriticalEvent isPendingCall:");
        sb.append(z2);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("linked-group-call/downgrade-");
        sb2.append(z2 ? "pending-call" : "ongoing-call");
        this.this$0.A1a.AcB(sb2.toString(), (String) null, false);
    }

    public void sendOfferFailed() {
        Log.i("VoiceService EVENT:sendOfferFailed");
    }

    public void soundPortCreateFailed() {
        Log.i("VoiceService EVENT:soundPortCreateFailed");
        this.this$0.A0W(30, (String) null);
    }

    public void soundPortCreated(int i2) {
        Object A04;
        Object A03;
        StringBuilder sb = new StringBuilder("VoiceService EVENT:soundPortCreated with engine type ");
        sb.append(i2);
        Log.i(sb.toString());
        Integer A01 = Voip.A01("aec.builtin");
        C447225g r1 = this.this$0;
        if (r1.A0x == null && A01 != null) {
            int intValue = A01.intValue();
            if (intValue == 2) {
                r1.A0x = Voip.A02(r1.A2e.previousAudioSessionId, true);
            } else if (intValue == 3) {
                r1.A0x = Voip.A02(r1.A2e.previousAudioSessionId, false);
            }
        }
        Integer A012 = Voip.A01("agc.builtin");
        C447225g r12 = this.this$0;
        if (r12.A0y == null && A012 != null) {
            int intValue2 = A012.intValue();
            if (intValue2 == 2) {
                A03 = Voip.A03(r12.A2e.previousAudioSessionId, true);
            } else if (intValue2 == 3) {
                A03 = Voip.A03(r12.A2e.previousAudioSessionId, false);
            }
            r12.A0y = A03;
        }
        Integer A013 = Voip.A01("ns.builtin");
        C447225g r13 = this.this$0;
        if (r13.A0z == null && A013 != null) {
            int intValue3 = A013.intValue();
            if (intValue3 == 2) {
                A04 = Voip.A04(r13.A2e.previousAudioSessionId, true);
            } else if (intValue3 == 3) {
                A04 = Voip.A04(r13.A2e.previousAudioSessionId, false);
            } else {
                return;
            }
            r13.A0z = A04;
        }
    }

    public void speakerStatusChanged(UserJid[] userJidArr, int[] iArr) {
        boolean z2 = false;
        if (userJidArr.length == iArr.length) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Participant jid list and audio level list should be one-to-one mapped", z2);
        Message obtainMessage = this.this$0.A0L.obtainMessage(39);
        obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        obtainMessage.getData().putIntArray("audio_levels", iArr);
        obtainMessage.sendToTarget();
    }

    public void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr) {
        Log.i("VoiceService EVENT:syncDevices");
        ArrayList arrayList = new ArrayList();
        for (SyncDevicesUserInfo syncDevicesUserInfo : syncDevicesUserInfoArr) {
            if (!this.this$0.A2N.A0J(syncDevicesUserInfo.jid, syncDevicesUserInfo.phash)) {
                arrayList.add(syncDevicesUserInfo.jid);
            }
        }
        if (!arrayList.isEmpty()) {
            this.this$0.A29.A01((UserJid[]) arrayList.toArray(new UserJid[0]), 4);
        }
    }

    public void transportCandSendFailed() {
        Log.i("VoiceService EVENT:transportCandSendFailed");
    }

    public void txTimeout() {
        Log.i("VoiceService EVENT:txTimeout");
        this.this$0.A0W(6, (String) null);
    }

    public void updateJoinableCallLog(int i2, String str, UserJid[] userJidArr) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:updateJoinableCallLog callId:");
        sb.append(str);
        Log.i(sb.toString());
        Message obtainMessage = this.this$0.A0L.obtainMessage(36, i2, 0, str);
        if (i2 == 2) {
            obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        }
        obtainMessage.sendToTarget();
    }

    public void updateVoipSettings(boolean z2) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:updateVoipSettings isVideoCall: ");
        sb.append(z2);
        Log.i(sb.toString());
        C447225g.A05(this.this$0, z2);
    }

    public void userRemoved(UserJid userJid, UserJid userJid2) {
        Log.i("VoiceService EVENT:userRemoved");
        C16040sK r0 = this.this$0.A1d;
        r0.A0B();
        if (r0.A05 == userJid2) {
            AnonymousClass00B.A06(userJid);
            C447225g r02 = this.this$0;
            r02.A1L = true;
            String A0C = this.this$0.A28.A0C(r02.A27.A0A(userJid));
            C447225g r03 = this.this$0;
            Message obtainMessage = r03.A0L.obtainMessage(49, r03.A1X.getString(R.string.str0367, new Object[]{A0C}));
            obtainMessage.arg1 = 29;
            obtainMessage.sendToTarget();
            return;
        }
        Message obtain = Message.obtain(this.this$0.A0L, 51, userJid2);
        if (this.this$0.A13.contains(userJid2)) {
            obtain.arg1 = 1;
            this.this$0.A13.remove(userJid2);
        }
        this.this$0.A0L.sendMessage(obtain);
    }

    public void videoCaptureStarted() {
        Log.i("VoiceService EVENT:videoCaptureStarted");
        this.this$0.A0L.sendEmptyMessage(13);
    }

    public void videoCodecMismatch() {
        Log.i("VoiceService EVENT:videoCodecMismatch");
        this.this$0.A1c.A06(R.string.str19ba);
    }

    public void videoCodecStateChanged() {
        Log.i("VoiceService EVENT:videoCodecStateChanged");
        this.this$0.A0L.removeMessages(15);
        this.this$0.A0L.sendEmptyMessage(15);
    }

    public void videoDecodeFatalError() {
        Log.i("VoiceService EVENT:videoDecodeFatalError");
    }

    public void videoDecodePaused() {
        Log.i("VoiceService EVENT:videoDecodePaused");
        this.this$0.A0L.removeMessages(15);
        this.this$0.A0L.sendEmptyMessage(15);
    }

    public void videoDecodeResumed() {
        Log.i("VoiceService EVENT:videoDecodeResumed");
        this.this$0.A0L.removeMessages(15);
        this.this$0.A0L.sendEmptyMessage(15);
    }

    public void videoDecodeStarted() {
        Log.i("VoiceService EVENT:videoDecodeStarted");
    }

    public void videoEncodeFatalError() {
        Log.i("VoiceService EVENT:videoEncodeFatalError");
    }

    public void videoPortCreateFailed() {
        Log.i("VoiceService EVENT:videoPortCreateFailed");
        this.this$0.A0W(17, (String) null);
    }

    public void videoPortCreated(UserJid userJid) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:videoPortCreated ");
        sb.append(userJid);
        Log.i(sb.toString());
        this.this$0.A0L.obtainMessage(7).sendToTarget();
    }

    public void videoPreviewError() {
        Log.i("VoiceService EVENT:videoPreviewError");
    }

    public void videoPreviewReady() {
        Log.i("VoiceService EVENT:videoPreviewReady");
        this.this$0.A0L.sendEmptyMessage(9);
    }

    public void videoRenderFormatChanged(UserJid userJid) {
        this.this$0.A0L.obtainMessage(10, userJid).sendToTarget();
    }

    public void videoRenderStarted(UserJid userJid) {
        StringBuilder sb = new StringBuilder("VoiceService EVENT:videoRenderStarted ");
        sb.append(userJid);
        Log.i(sb.toString());
        this.this$0.A0L.obtainMessage(8, userJid).sendToTarget();
    }

    public void videoStreamCreateError() {
        Log.i("VoiceService EVENT:videoStreamCreateError");
        this.this$0.A0W(16, (String) null);
    }

    public void weakWifiSwitchedToCellular() {
        Log.i("VoiceService EVENT:weakWifiSwitchedToCellular");
        this.this$0.A0L.sendEmptyMessage(35);
    }

    public void willCreateSoundPort() {
        Log.i("VoiceService EVENT:willCreateSoundPort");
    }
}
