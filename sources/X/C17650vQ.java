package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.0vQ  reason: invalid class name and case insensitive filesystem */
public class C17650vQ {
    public boolean A00() {
        try {
            CallState currentCallState = Voip.getCurrentCallState();
            return (currentCallState == null || currentCallState == CallState.NONE || currentCallState == CallState.LINK) ? false : true;
        } catch (UnsatisfiedLinkError e2) {
            Log.e("unable to query for current call state", e2);
            return false;
        }
    }

    public boolean A01() {
        try {
            return Voip.getCurrentCallState() == CallState.LINK;
        } catch (UnsatisfiedLinkError e2) {
            Log.e("unable to query for current call state", e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r2 = this;
            boolean r0 = r2.A00()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.videoEnabled
            if (r0 == 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17650vQ.A02():boolean");
    }
}
