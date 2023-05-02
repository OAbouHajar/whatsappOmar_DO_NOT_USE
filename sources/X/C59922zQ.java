package X;

import android.telecom.CallAudioState;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.2zQ  reason: invalid class name and case insensitive filesystem */
public class C59922zQ extends C52242dN {
    public final /* synthetic */ AnonymousClass26Z A00;
    public final /* synthetic */ C14710pd A01;

    public C59922zQ(AnonymousClass26Z r1, C14710pd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(CallAudioState callAudioState, String str) {
        AnonymousClass00B.A01();
        StringBuilder A0r = AnonymousClass000.A0r("voip/audio_route/selfManagedConnectionListener/onCallAudioStateChanged ");
        A0r.append(str);
        A0r.append(", ");
        AnonymousClass26Z r3 = this.A00;
        A0r.append(Voip.A05(r3.A00));
        A0r.append(" -> ");
        A0r.append(callAudioState);
        C13680ns.A1V(A0r);
        CallInfo callInfo = Voip.getCallInfo();
        if (Voip.A08(callInfo) && TextUtils.equals(str, callInfo.callId)) {
            AnonymousClass00B.A06(callInfo);
            if (!this.A01.A0E(C16620tM.A02, 2657) && callAudioState.isMuted() && callInfo.callState == CallState.ACTIVE && !callInfo.self.A0A) {
                r3.A03();
            }
            r3.A03 = false;
            int i2 = r3.A00;
            if (i2 == 3 || i2 == 4 || (callInfo.videoEnabled && callInfo.callState == CallState.ACTIVE)) {
                r3.A06(callInfo, (Boolean) null);
                return;
            }
            r3.A05(callInfo);
            r3.A07(callInfo, (Boolean) null);
        }
    }
}
