package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1TZ;
import X.C13680ns;
import X.C18450wi;
import X.C19550yc;
import X.C220616m;
import X.C28371Vv;
import X.C34451kH;
import com.obwhatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

public class IDxRCallbackShape231S0100000_2_I0 implements C19550yc {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape231S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void APb(String str) {
        String str2;
        switch (this.A01) {
            case 1:
                str2 = AnonymousClass000.A0h(str, AnonymousClass000.A0r("LocationXmppMethods/sendAckLocationReporting/onDeliveryFailure; iq="));
                break;
            case 3:
                str2 = "PushXmppMethod/SetClientConfig delivery fail";
                break;
            default:
                return;
        }
        Log.i(str2);
    }

    public void AQe(C28371Vv r4, String str) {
        switch (this.A01) {
            case 1:
                Log.i(C13680ns.A0c(C34451kH.A00(r4), "LocationXmppMethods/sendAckLocationReporting/onError; error="));
                return;
            case 3:
                C18450wi.A0H(r4, 1);
                int A002 = C34451kH.A00(r4);
                Log.e(C18450wi.A06("PushXmppMethod/clientConfigSetError/", Integer.valueOf(A002)));
                if (A002 == 409) {
                    RegistrationIntentService.A01(((AnonymousClass1TZ) this.A00).A00.A00);
                    return;
                }
                return;
            case 4:
                JniBridge.jvidispatchIOO(2, str, r4);
                return;
            default:
                return;
        }
    }

    public void AYG(C28371Vv r7, String str) {
        String str2;
        switch (this.A01) {
            case 0:
                C28371Vv A0H = r7.A0H();
                C28371Vv.A06(A0H, "disappearing_mode");
                ((C220616m) this.A00).A04.A05(A0H.A09("duration"), A0H.A0C("t") * 1000);
                return;
            case 1:
                str2 = AnonymousClass000.A0h(str, AnonymousClass000.A0r("LocationXmppMethods/sendAckLocationReporting/onSuccess; iq="));
                break;
            case 2:
                return;
            case 3:
                str2 = "PushXmppMethod/read/client_config_set";
                break;
            default:
                JniBridge.jvidispatchIOO(2, str, r7);
                return;
        }
        Log.i(str2);
    }
}
