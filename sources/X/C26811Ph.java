package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxCallbackShape186S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ph  reason: invalid class name and case insensitive filesystem */
public class C26811Ph implements C26821Pi {
    public int A00 = 0;
    public Handler A01;
    public CallGridViewModel A02;
    public final C16040sK A03;
    public final C23441Bz A04;
    public final C26801Pf A05;
    public final C16260sj A06;
    public final VoipCameraManager A07;
    public final Map A08 = new HashMap();

    public C26811Ph(C16040sK r2, C23441Bz r3, C26801Pf r4, C16260sj r5, VoipCameraManager voipCameraManager) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = voipCameraManager;
        this.A06 = r5;
    }

    public void A00() {
        StringBuilder sb = new StringBuilder("voip/VideoPortManager/releaseAllVideoPorts releasing ");
        Map map = this.A08;
        sb.append(map.size());
        sb.append(" remaining ports");
        Log.i(sb.toString());
        for (Map.Entry value : map.entrySet()) {
            ((AnonymousClass2Qx) value.getValue()).release();
        }
        map.clear();
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.A01 = null;
        }
    }

    public final void A01(AnonymousClass2Qx r5) {
        C447225g r2;
        int i2;
        UserJid userJid = r5.A0B;
        if (this.A03.A0I(userJid)) {
            if (this.A06.A03("android.permission.CAMERA") != 0) {
                Log.w("voip/VideoPortManager/ camera permissions not granted, unable to set video preview port");
                return;
            }
            if (this.A01 == null) {
                this.A01 = new Handler(Looper.getMainLooper(), new IDxCallbackShape186S0100000_1_I0(this, 2));
            }
            int videoPreviewPort = Voip.setVideoPreviewPort(r5);
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (videoPreviewPort == 0) {
                this.A07.addCameraErrorListener(this);
                this.A00 = 0;
                return;
            } else if (i3 >= 10) {
                Log.e("voip/VideoPortManager/setVideoPort failed to setup self port");
                CallGridViewModel callGridViewModel = this.A02;
                if (callGridViewModel != null && (r2 = callGridViewModel.A0D.A03) != null) {
                    i2 = 15;
                } else {
                    return;
                }
            } else {
                Log.i("voip/VideoPortManager/setVideoPort failed for self, retrying");
                this.A01.postDelayed(new RunnableRunnableShape3S0200000_I0_1(this, 49, r5), 500);
                return;
            }
        } else if (Voip.setVideoDisplayPort(userJid, r5) == 0) {
            Voip.startVideoRenderStream(userJid);
            return;
        } else {
            StringBuilder sb = new StringBuilder("voip/VideoPortManager/setVideoPort failed to setup port for ");
            sb.append(userJid);
            Log.e(sb.toString());
            CallGridViewModel callGridViewModel2 = this.A02;
            if (callGridViewModel2 != null && (r2 = callGridViewModel2.A0D.A03) != null) {
                i2 = 22;
            } else {
                return;
            }
        }
        r2.A0n((CallInfo) null, (String) null, i2);
    }

    public void A02(UserJid userJid) {
        Map map = this.A08;
        if (map.containsKey(userJid)) {
            StringBuilder sb = new StringBuilder("voip/VideoPortManager/releaseVideoPort releasing port for ");
            sb.append(userJid);
            Log.i(sb.toString());
            Object obj = map.get(userJid);
            AnonymousClass00B.A06(obj);
            ((AnonymousClass2Qx) obj).release();
            map.remove(userJid);
        }
    }

    public final void A03(UserJid userJid) {
        if (this.A08.get(userJid) == null) {
            return;
        }
        if (this.A03.A0I(userJid)) {
            Voip.setVideoPreviewPort((VideoPort) null);
            Voip.setVideoPreviewSize(0, 0);
            this.A07.removeCameraErrorListener(this);
            Handler handler = this.A01;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.A01 = null;
                return;
            }
            return;
        }
        Voip.stopVideoRenderStream(userJid);
        Voip.setVideoDisplayPort(userJid, (VideoPort) null);
    }

    public void AO2(VoipPhysicalCamera voipPhysicalCamera, int i2) {
    }

    public void AOi(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public void AQl(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public void AX4(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    public void AZM(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }
}
