package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.1ZF  reason: invalid class name */
public interface AnonymousClass1ZF {
    void AVT(boolean z2);

    void AcY(C32001fU r1);

    void AhO(CallInfo callInfo, int i2, boolean z2);

    void Ahj(CallInfo callInfo);

    void callStateChanged(CallState callState, CallInfo callInfo);

    void finish();

    void videoRenderStarted(UserJid userJid);
}
