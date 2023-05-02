package X;

import android.content.IntentFilter;
import android.media.AudioManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.4Wm  reason: invalid class name and case insensitive filesystem */
public abstract class C87364Wm {
    public AnonymousClass4DU A00;
    public boolean A01;

    public void A00() {
        C72843mn r0 = (C72843mn) this;
        r0.A01.registerReceiver(r0.A00, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void A01() {
        C72843mn r0 = (C72843mn) this;
        r0.A01.unregisterReceiver(r0.A00);
    }

    public final void A02() {
        boolean A03 = A03();
        if (this.A01 != A03) {
            this.A01 = A03;
            AnonymousClass26Z r3 = this.A00.A00;
            Log.i(AnonymousClass000.A0g("voip/audio_route/HeadsetMonitor ", r3));
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null || callInfo.callState == CallState.NONE) {
                Log.e("voip/audio_route/headsetPlugReceiver ignored, not in any call");
                return;
            }
            r3.A07(callInfo, (Boolean) null);
            if (A03) {
                r3.A04 = true;
                Log.i("voip/audio_route/headset Plugged");
                if (r3.A00 == 1) {
                    r3.A05(callInfo);
                    r3.A09(callInfo, false);
                    return;
                }
                return;
            }
            Log.i("voip/audio_route/headset Unplugged");
            r3.A06(callInfo, (Boolean) null);
        }
    }

    public boolean A03() {
        AudioManager A0G = ((C72843mn) this).A02.A0G();
        if (A0G == null) {
            return false;
        }
        return A0G.isWiredHeadsetOn();
    }
}
