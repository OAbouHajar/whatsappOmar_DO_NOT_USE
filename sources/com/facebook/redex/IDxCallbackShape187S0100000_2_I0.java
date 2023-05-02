package com.facebook.redex;

import X.AnonymousClass29D;
import X.AnonymousClass2B9;
import X.C17650vQ;
import X.C19090xk;
import X.C40991v1;
import X.C447225g;
import X.C46202Cw;
import X.C46212Cy;
import android.os.Handler;
import android.os.Message;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.obwhatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

public class IDxCallbackShape187S0100000_2_I0 implements Handler.Callback {
    public Object A00;
    public final int A01;

    public IDxCallbackShape187S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static boolean A00(IDxCallbackShape187S0100000_2_I0 iDxCallbackShape187S0100000_2_I0) {
        AnonymousClass29D r0;
        C46202Cw r5 = (C46202Cw) iDxCallbackShape187S0100000_2_I0.A00;
        if (r5.A0U) {
            if (!r5.A0L && (r0 = r5.A0I) != null && r0.A0C() && r5.A0I.A04() != 0) {
                int A03 = (int) ((((long) r5.A0I.A03()) * 1000) / ((long) r5.A0I.A04()));
                r5.A0v.setProgress(A03);
                if (!r5.A0V) {
                    r5.A0w.setProgress(A03);
                    r5.A0y.setText(C46212Cy.A00(r5.A17, r5.A18, (long) r5.A0I.A03()));
                }
            }
            r5.A0Y.sendEmptyMessageDelayed(0, 50);
        }
        return true;
    }

    public final boolean handleMessage(Message message) {
        int i2;
        CallState callState;
        switch (this.A01) {
            case 0:
                VoipInCallNotifBanner voipInCallNotifBanner = (VoipInCallNotifBanner) this.A00;
                if (message.what != 0) {
                    return true;
                }
                voipInCallNotifBanner.A01();
                return true;
            case 1:
                C447225g r4 = (C447225g) this.A00;
                CallInfo callInfo = Voip.getCallInfo();
                if (!Voip.A08(callInfo)) {
                    Log.e("voip/callTimeoutHandler we are not in an active call");
                    return false;
                }
                int i3 = message.what;
                if (i3 == 0) {
                    Log.i("voip/call/not-accept-timeout");
                    if (callInfo.isGroupCall && ((callState = callInfo.callState) == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED)) {
                        return true;
                    }
                    i2 = 7;
                } else if (i3 == 1) {
                    Log.i("voip/call/accepted-but-not-active-timeout");
                    i2 = 8;
                } else if (i3 == 2) {
                    Log.i("voip/call/send-call-offer-timeout");
                    if (r4.A26.A04(true) != 0) {
                        return true;
                    }
                    r4.A0n(callInfo, r4.A1X.getString(R.string.str1a80), 9);
                    return true;
                } else if (i3 == 3) {
                    Log.i("voip/call/busy-tone-timeout");
                    i2 = 10;
                } else if (i3 != 4) {
                    return false;
                } else {
                    Log.i("voip/call/ringtone-timeout");
                    r4.A0K();
                    return true;
                }
                r4.A0n(callInfo, (String) null, i2);
                return true;
            case 2:
                C447225g r3 = (C447225g) this.A00;
                int i4 = message.what;
                if (i4 == 0) {
                    C17650vQ r1 = r3.A24;
                    if (r1.A00() || r1.A01()) {
                        return true;
                    }
                    if (C447225g.A2x.get() > 0) {
                        r3.A0M();
                        return true;
                    }
                    Log.i("voip/service/stopSelfHandler stopSelf now");
                    r3.A1R = true;
                    r3.A1u.A00.obtainMessage(2).sendToTarget();
                    return true;
                } else if (i4 != 1) {
                    return false;
                } else {
                    if (r3.A24.A00()) {
                        return true;
                    }
                    r3.A1k.A02();
                    return true;
                }
            case 3:
                return C447225g.A07(message, (C447225g) this.A00);
            case 4:
                C19090xk.A00(message, (C19090xk) this.A00);
                return true;
            case 5:
                SearchViewModel searchViewModel = (SearchViewModel) this.A00;
                if (message.what != 0) {
                    return false;
                }
                searchViewModel.A0U(new AnonymousClass2B9());
                return true;
            case 6:
                ((C40991v1) this.A00).A0E();
                return true;
            default:
                return A00(this);
        }
    }
}
