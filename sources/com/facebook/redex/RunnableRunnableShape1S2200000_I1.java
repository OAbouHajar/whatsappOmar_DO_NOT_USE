package com.facebook.redex;

import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C15830rv;
import X.C16460t6;
import X.C16740tZ;
import X.C28381Vw;
import X.C30011bb;
import X.C38621r6;
import X.C39731sy;
import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.notification.MessageOTPNotificationBroadcastReceiver;

public class RunnableRunnableShape1S2200000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape1S2200000_I1(Object obj, Object obj2, String str, String str2, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void run() {
        if (this.A04 != 0) {
            MessageOTPNotificationBroadcastReceiver messageOTPNotificationBroadcastReceiver = (MessageOTPNotificationBroadcastReceiver) this.A00;
            String str = this.A02;
            String str2 = this.A03;
            Object obj = this.A01;
            C16740tZ A002 = C16460t6.A00(messageOTPNotificationBroadcastReceiver.A03, new C28381Vw(C15830rv.A02(str), str2, false));
            if (A002 != null && C38621r6.A0Z(messageOTPNotificationBroadcastReceiver.A02.A03, A002)) {
                C39731sy A012 = messageOTPNotificationBroadcastReceiver.A02.A01(A002);
                if (messageOTPNotificationBroadcastReceiver.A02.A07(A012)) {
                    C14870pt.A03(messageOTPNotificationBroadcastReceiver.A00, messageOTPNotificationBroadcastReceiver, A002, 35);
                } else if (messageOTPNotificationBroadcastReceiver.A02.A08(A012)) {
                    messageOTPNotificationBroadcastReceiver.A00.A0K(new RunnableRunnableShape3S0300000_I1(messageOTPNotificationBroadcastReceiver, A002, obj, 35));
                }
                messageOTPNotificationBroadcastReceiver.A01.A00(A002.A0C(), 2, true, true);
                return;
            }
            return;
        }
        String str3 = this.A02;
        String str4 = this.A03;
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = str3;
        ((C30011bb) this.A00).A0J.A0N(C13680ns.A0d((Context) this.A01, str4, A1Z, 1, R.string.str010c), 0);
    }
}
