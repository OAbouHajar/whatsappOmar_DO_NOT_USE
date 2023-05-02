package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.46B  reason: invalid class name */
public class AnonymousClass46B {
    public static boolean A00(AnonymousClass3AY r2, boolean z2) {
        CallState callState = r2.A06;
        if (callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.CALLING || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING || callState == CallState.ACCEPT_SENT) {
            return true;
        }
        return r2.A0F && !z2 && r2.A0D;
    }
}
