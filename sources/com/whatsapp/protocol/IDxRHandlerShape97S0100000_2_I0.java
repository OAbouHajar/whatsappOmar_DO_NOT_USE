package com.whatsapp.protocol;

import X.AnonymousClass000;
import X.AnonymousClass2H7;
import X.AnonymousClass2H8;
import X.AnonymousClass2Qh;
import X.C13680ns;
import X.C28371Vv;
import X.C51542bq;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

public class IDxRHandlerShape97S0100000_2_I0 extends AnonymousClass2Qh {
    public Object A00;
    public final int A01;

    public IDxRHandlerShape97S0100000_2_I0(C51542bq r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void A01(int i2) {
        AnonymousClass2H8 r3;
        Handler handler;
        int i3;
        int i4;
        switch (this.A01) {
            case 3:
                Log.e(C13680ns.A0c(i2, "Connection/sendClearFbnsToken/failed to clear code="));
                return;
            case 4:
                AnonymousClass2H7 r1 = ((C51542bq) this.A00).A09;
                Log.i(C13680ns.A0c(i2, "xmpp/reader/on-number-normalization-error = "));
                r3 = r1.A01;
                handler = null;
                i3 = 0;
                i4 = 199;
                break;
            case 5:
                Log.w(C13680ns.A0c(i2, "change number failed; code="));
                AnonymousClass2H7 r12 = ((C51542bq) this.A00).A09;
                Log.i(C13680ns.A0c(i2, "xmpp/reader/on-change-number-error = "));
                r3 = r12.A01;
                handler = null;
                i3 = 0;
                i4 = 201;
                break;
            default:
                super.A01(i2);
                return;
        }
        r3.AZq(Message.obtain(handler, i3, i4, i2));
    }

    public void A02(C28371Vv r6) {
        AnonymousClass2H8 r4;
        Message obtain;
        switch (this.A01) {
            case 0:
                C28371Vv.A06(r6.A0I(0), "remove");
                AnonymousClass2H7 r1 = ((C51542bq) this.A00).A09;
                Log.i("xmpp/reader/read/removeaccount");
                r4 = r1.A01;
                obtain = Message.obtain((Handler) null, 0, 12, 0);
                break;
            case 1:
                return;
            case 2:
                C28371Vv A0J = r6.A0J("props");
                if (A0J != null) {
                    AnonymousClass2H7 r12 = ((C51542bq) this.A00).A09;
                    Log.i("xmpp/reader/read/server-props");
                    r4 = r12.A01;
                    obtain = Message.obtain((Handler) null, 0, 174, 0, A0J);
                    break;
                } else {
                    return;
                }
            case 3:
                Log.i("Connection/sendClearFbnsToken/successfully cleared");
                return;
            case 4:
                C28371Vv A0I = r6.A0I(0);
                C28371Vv.A06(A0I, "normalize");
                String A0N = A0I.A0N("result", (String) null);
                AnonymousClass2H7 r13 = ((C51542bq) this.A00).A09;
                Log.i(AnonymousClass000.A0h(A0N, AnonymousClass000.A0r("xmpp/reader/on-number-normalized = ")));
                r4 = r13.A01;
                obtain = Message.obtain((Handler) null, 0, 198, 0, A0N);
                break;
            default:
                Log.i("change number succeeded");
                C28371Vv.A06(r6.A0I(0), "modify");
                AnonymousClass2H7 r14 = ((C51542bq) this.A00).A09;
                Log.i("xmpp/reader/on-change-number-success");
                r4 = r14.A01;
                obtain = Message.obtain((Handler) null, 0, 200, 0);
                break;
        }
        r4.AZq(obtain);
    }
}
