package X;

import android.graphics.Point;
import com.obwhatsapp.calling.callgrid.view.CallGrid;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3FK  reason: invalid class name */
public class AnonymousClass3FK implements AnonymousClass5SU {
    public final /* synthetic */ CallGrid A00;

    public AnonymousClass3FK(CallGrid callGrid) {
        this.A00 = callGrid;
    }

    public void AXW(C37921px r6, VideoPort videoPort) {
        CallInfo A05;
        CallGridViewModel callGridViewModel = this.A00.A05;
        if (!callGridViewModel.A0f) {
            C448926b r4 = callGridViewModel.A0D;
            UserJid userJid = r6.A0U;
            boolean z2 = r6.A0E;
            CallInfo callInfo = r4.A04;
            if (callInfo != null && !callInfo.isGroupCall && callInfo.videoEnabled && (A05 = r4.A05((CallInfo) null)) != null && !A05.videoEnabled) {
                Log.w("voip/CallDatasource/setVideoPort: we are not in the video call");
            } else if (z2) {
                r4.A09(videoPort);
                r4.A05 = videoPort;
            } else {
                if (Voip.setVideoDisplayPort(userJid, videoPort) == 0) {
                    Voip.startVideoRenderStream(userJid);
                } else {
                    C447225g r2 = r4.A03;
                    if (r2 != null) {
                        r2.A0n((CallInfo) null, (String) null, 22);
                    }
                }
                r4.A0F.put(userJid, Integer.valueOf(videoPort.hashCode()));
            }
        }
    }

    public void AXy(C37921px r6, VideoPort videoPort) {
        CallGridViewModel callGridViewModel = this.A00.A05;
        if (!callGridViewModel.A0f) {
            C448926b r4 = callGridViewModel.A0D;
            UserJid userJid = r6.A0U;
            if (r6.A0E) {
                r4.A0D.removeCameraErrorListener(r4.A09);
                r4.A09((VideoPort) null);
                r4.A05 = null;
            } else if (C34901l3.A00(Integer.valueOf(videoPort.hashCode()), r4.A0F.get(userJid))) {
                Voip.stopVideoRenderStream(userJid);
                Voip.setVideoDisplayPort(userJid, (VideoPort) null);
            }
        }
    }

    public void AZp(C37921px r4, VideoPort videoPort) {
        C32001fU infoByJid;
        CallGridViewModel callGridViewModel = this.A00.A05;
        if (!callGridViewModel.A0f) {
            C448926b r2 = callGridViewModel.A0D;
            UserJid userJid = r4.A0U;
            CallInfo A05 = r2.A05((CallInfo) null);
            if (A05 != null && (infoByJid = A05.getInfoByJid(userJid)) != null) {
                if (infoByJid.A0G) {
                    Point windowSize = videoPort.getWindowSize();
                    Voip.setVideoPreviewSize(windowSize.x, windowSize.y);
                    return;
                }
                Voip.setVideoDisplayPort(userJid, videoPort);
            }
        }
    }
}
