package X;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxCallbackShape186S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.calling.camera.IDxEListenerShape62S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.26b  reason: invalid class name and case insensitive filesystem */
public class C448926b extends C16580tI {
    public int A00;
    public long A01 = 0;
    public Handler A02;
    public C447225g A03;
    public CallInfo A04;
    public VideoPort A05;
    public String A06;
    public boolean A07 = false;
    public final C23441Bz A08;
    public final C51932cX A09 = new IDxEListenerShape62S0100000_2_I0(this, 0);
    public final C16440t3 A0A;
    public final C16260sj A0B;
    public final AnonymousClass1WA A0C;
    public final VoipCameraManager A0D;
    public final List A0E = new ArrayList();
    public final Map A0F = new HashMap();
    public final Set A0G = new HashSet();

    public C448926b(C23441Bz r5, C16440t3 r6, C16260sj r7, C16320sq r8, VoipCameraManager voipCameraManager) {
        this.A0A = r6;
        this.A08 = r5;
        this.A0D = voipCameraManager;
        this.A0B = r7;
        this.A02 = new Handler(Looper.getMainLooper(), new IDxCallbackShape186S0100000_1_I0(this, 0));
        this.A0C = new AnonymousClass1WA(r8, true);
    }

    public AnonymousClass3AY A04() {
        CallInfo A052 = A05((CallInfo) null);
        if (A052 != null) {
            return new AnonymousClass3AY(A052);
        }
        Map emptyMap = Collections.emptyMap();
        return new AnonymousClass3AY(C17930vs.copyOf(emptyMap), (C32001fU) null, (C16050sL) null, (UserJid) null, (UserJid) null, CallState.NONE, "", (String) null, 0, false, false, false, false, false, false, false);
    }

    public final CallInfo A05(CallInfo callInfo) {
        String str;
        if (callInfo == null) {
            if (Voip.A07()) {
                CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
                AnonymousClass00B.A06(callLinkInfo);
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                return null;
            }
        }
        if (callInfo.isCallLinkLobbyOrJoiningState() || (str = this.A06) == null) {
            return callInfo;
        }
        if (str.equals(callInfo.callWaitingInfo.A04)) {
            return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
        }
        String str2 = callInfo.callId;
        if (str.equals(str2) || this.A07) {
            return callInfo;
        }
        StringBuilder sb = new StringBuilder("CallDatasource/getCallInfoForDisplay CallId ");
        sb.append(str);
        sb.append(" does not match current call's id ");
        sb.append(str2);
        Log.e(sb.toString());
        this.A07 = true;
        return callInfo;
    }

    /* renamed from: A06 */
    public void A03(C49562Tu r3) {
        super.A03(r3);
        if (!A01().iterator().hasNext()) {
            this.A02.removeCallbacksAndMessages((Object) null);
            this.A0C.A00();
        }
    }

    public void A07(CallInfo callInfo) {
        Handler handler = this.A02;
        handler.removeMessages(4);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.A01;
        if (j2 != 0) {
            long j3 = j2 + 250;
            if (currentTimeMillis < j3) {
                handler.sendEmptyMessageDelayed(4, j3 - currentTimeMillis);
                return;
            }
        }
        A08(callInfo, false);
    }

    public final void A08(CallInfo callInfo, boolean z2) {
        CallInfo A052 = A05(callInfo);
        this.A04 = A052;
        if (A052 != null) {
            AnonymousClass3AY r4 = new AnonymousClass3AY(A052);
            Iterable<C49562Tu> A012 = A01();
            if (z2) {
                for (C49562Tu r2 : A012) {
                    if (r2 instanceof CallGridViewModel) {
                        CallGridViewModel callGridViewModel = (CallGridViewModel) r2;
                        if (CallGridViewModel.A02(r4).size() > 8) {
                            callGridViewModel.A0E(r4, true);
                        }
                    }
                }
            } else {
                for (C49562Tu A062 : A012) {
                    A062.A06(r4);
                }
                long j2 = A052.callDuration;
                for (C49562Tu r1 : A01()) {
                    if (r1 instanceof CallGridViewModel) {
                        ((CallGridViewModel) r1).A05.A0B(Long.valueOf(j2));
                    }
                }
            }
            this.A01 = System.currentTimeMillis();
        }
    }

    public final void A09(VideoPort videoPort) {
        if (this.A06 == null) {
            return;
        }
        if (this.A0B.A03("android.permission.CAMERA") != 0) {
            Log.w("voip/CallDatasource/ camera permissions not granted, unable to set video preview port");
            return;
        }
        int videoPreviewPort = Voip.setVideoPreviewPort(videoPort);
        if (videoPort == null) {
            Voip.setVideoPreviewSize(0, 0);
        } else if (videoPreviewPort == 0) {
            this.A00 = 0;
            Point windowSize = videoPort.getWindowSize();
            Voip.setVideoPreviewSize(windowSize.x, windowSize.y);
            this.A0D.addCameraErrorListener(this.A09);
        } else {
            int i2 = this.A00;
            this.A00 = i2 + 1;
            if (i2 >= 10) {
                C447225g r2 = this.A03;
                if (r2 != null) {
                    r2.A0n((CallInfo) null, (String) null, 15);
                    return;
                }
                return;
            }
            CallInfo A052 = A05((CallInfo) null);
            if (A052 != null && A052.videoEnabled) {
                this.A02.postDelayed(new RunnableRunnableShape3S0200000_I0_1(this, 36, videoPort), 500);
            }
        }
    }

    public void A0A(String str) {
        String str2 = this.A06;
        if (!str.equals(str2)) {
            if (str2 != null) {
                for (C49562Tu r1 : A01()) {
                    if (r1 instanceof CallGridViewModel) {
                        CallGridViewModel callGridViewModel = (CallGridViewModel) r1;
                        callGridViewModel.A02 = null;
                        AnonymousClass027 r12 = callGridViewModel.A08;
                        if (r12.A01() != null) {
                            r12.A0B((Object) null);
                        }
                    }
                }
            }
            this.A06 = str;
            this.A07 = false;
            CallInfo A052 = A05((CallInfo) null);
            if (A052 != null) {
                A07(A052);
            }
        }
    }
}
