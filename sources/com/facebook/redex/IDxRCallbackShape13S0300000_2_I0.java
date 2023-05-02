package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1W9;
import X.AnonymousClass22J;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass4HV;
import X.AnonymousClass4WK;
import X.AnonymousClass5SY;
import X.C109055Qn;
import X.C13680ns;
import X.C13700nu;
import X.C16300so;
import X.C18450wi;
import X.C19550yc;
import X.C28371Vv;
import X.C29961bW;
import X.C32261fw;
import X.C32271fx;
import X.C34451kH;
import X.C40841um;
import X.C48802Pe;
import X.C73503oE;
import X.C73513oF;
import X.C73533oH;
import X.C802543d;
import X.C82694Du;
import X.C83054Fe;
import X.C85914Qm;
import X.C86664Tr;
import X.C87964Zj;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class IDxRCallbackShape13S0300000_2_I0 implements C19550yc {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRCallbackShape13S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void APb(String str) {
        String str2;
        switch (this.A03) {
            case 0:
                C18450wi.A0H(str, 0);
                ((AnonymousClass22J) this.A00).AIU(new C73513oF(this.A01, new C802543d(str)));
                return;
            case 3:
                str2 = "LocationSubscriptionSendMethods/unsubscribe/onDeliveryFailure; iqId=";
                break;
            case 4:
                str2 = "BroadcastXmppMethods/sendDeleteBroadcastList/onDeliveryFailure; iq=";
                break;
            case 5:
                Log.e("AvatarUserRequestHelper/onDeliveryFailure: Network Failure");
                ((AnonymousClass5SY) this.A00).APY();
                return;
            case 6:
                ((C19550yc) this.A01).APb(str);
                ((C29961bW) this.A02).A05(AnonymousClass000.A0a(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Failed to deliver request: iq="))));
                return;
            default:
                return;
        }
        Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r(str2)));
    }

    public void AQe(C28371Vv r7, String str) {
        switch (this.A03) {
            case 0:
                C18450wi.A0H(r7, 1);
                AnonymousClass4WK r2 = (AnonymousClass4WK) this.A01;
                ((AnonymousClass22J) this.A00).AIU(new C73503oE(r2, ((C85914Qm) this.A02).A00(r2, r7)));
                return;
            case 1:
                C18450wi.A0H(r7, 1);
                try {
                    C16300so r4 = ((C87964Zj) this.A02).A00;
                    AnonymousClass3K3.A1G(r7);
                    C32271fx.A03(r7, new IDxNFunctionShape43S0200000_2_I1(r4, ((C83054Fe) this.A01).A00, 7), new String[0]);
                    C32261fw[] r22 = new C32261fw[4];
                    r22[0] = AnonymousClass3K3.A0X(r4, 58);
                    r22[1] = AnonymousClass3K3.A0X(r4, 57);
                    r22[2] = AnonymousClass3K3.A0X(r4, 59);
                    ((C109055Qn) C32271fx.A04(r7, "UnsupportedOperation|GroupDoesNotExist|UserDoesNotHaveAdminPermission|RateLimited", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r4, 56), r22, 3), new String[0])).A4P(new C82694Du((AnonymousClass4HV) this.A00));
                    return;
                } catch (AnonymousClass1W9 e2) {
                    Log.e((Throwable) e2);
                    return;
                }
            case 2:
                ((C40841um) this.A01).Ach(C34451kH.A00(r7));
                return;
            case 3:
                int A002 = C34451kH.A00(r7);
                StringBuilder A0r = AnonymousClass000.A0r("LocationSubscriptionSendMethods/unsubscribe/onError; iqId=");
                A0r.append(str);
                Log.i(C13680ns.A0i(", error=", A0r, A002));
                ((C40841um) this.A01).Ach(A002);
                return;
            case 4:
                Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("BroadcastXmppMethods/sendDeleteBroadcastList/onError; iq=")));
                ((C40841um) this.A01).Ach(C34451kH.A00(r7));
                return;
            case 5:
                AnonymousClass3K2.A1H(str, r7);
                Log.e(C18450wi.A06("AvatarUserRequestHelper/onError: ", new C48802Pe(r7, str)));
                ((AnonymousClass22J) this.A01).AIU(new C48802Pe(r7, str));
                return;
            default:
                ((C19550yc) this.A01).AYG(r7, str);
                ((C29961bW) this.A02).A04((Object) null);
                return;
        }
    }

    public void AYG(C28371Vv r13, String str) {
        String str2;
        C28371Vv r5 = r13;
        switch (this.A03) {
            case 0:
                C18450wi.A0H(r13, 1);
                AnonymousClass4WK r2 = (AnonymousClass4WK) this.A01;
                ((AnonymousClass22J) this.A00).AIU(new C73533oH(r2, ((C85914Qm) this.A02).A00(r2, r13)));
                return;
            case 1:
                C18450wi.A0H(r13, 1);
                C16300so r3 = ((C87964Zj) this.A02).A00;
                AnonymousClass3K3.A1G(r13);
                C32271fx.A03(r13, new IDxNFunctionShape43S0200000_2_I1(r3, ((C83054Fe) this.A01).A00, 8), new String[0]);
                List<C86664Tr> A07 = C32271fx.A07(r5, AnonymousClass3K3.A0X(r3, 60), new String[]{"linked_groups_participants", "participant"}, 1, 19999);
                ArrayList A0u = AnonymousClass000.A0u();
                for (C86664Tr r0 : A07) {
                    UserJid userJid = r0.A01.A00;
                    C18450wi.A0B(userJid);
                    A0u.add(userJid);
                }
                AnonymousClass4HV r32 = (AnonymousClass4HV) this.A00;
                C13700nu.A0X(r32.A00.A09, r32, r32.A01, A0u, 17);
                return;
            case 2:
                ((Runnable) this.A02).run();
            case 3:
                str2 = "LocationSubscriptionSendMethods/unsubscribe/onSuccess; iqId=";
                break;
            case 4:
                str2 = "BroadcastXmppMethods/sendDeleteBroadcastList/onSuccess; iq=";
                break;
            case 5:
                C18450wi.A0H(r13, 1);
                ((AnonymousClass22J) this.A02).AIU(r13);
                return;
            default:
                ((C19550yc) this.A01).AYG(r13, str);
                ((C29961bW) this.A02).A04((Object) null);
                return;
        }
        Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r(str2)));
        ((Runnable) this.A02).run();
    }
}
