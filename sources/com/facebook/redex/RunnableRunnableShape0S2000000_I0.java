package com.facebook.redex;

import X.C32011fV;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

public class RunnableRunnableShape0S2000000_I0 implements Runnable {
    public String A00;
    public String A01;
    public final int A02;

    public RunnableRunnableShape0S2000000_I0(String str, String str2, int i2) {
        this.A02 = i2;
        if (i2 != 0) {
            this.A00 = str;
            this.A01 = str2;
            return;
        }
        this.A00 = str;
        this.A01 = "";
    }

    public final void run() {
        if (this.A02 != 0) {
            String str = this.A00;
            String str2 = this.A01;
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null) {
                C32011fV r1 = callInfo.callWaitingInfo;
                if (r1.A01 != 0 && r1.A04.equals(str)) {
                    Voip.rejectPendingCall(str);
                    return;
                }
            }
            Voip.rejectCall(str, str2);
            return;
        }
        Voip.rejectCall(this.A00, "");
    }
}
