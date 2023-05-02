package com.obwhatsapp.payments.ui.invites;

import X.AnonymousClass1HS;
import X.AnonymousClass1Nx;
import X.AnonymousClass3Q5;
import X.AnonymousClass5vV;
import X.C110105dW;
import X.C110115dX;
import X.C117745tU;
import X.C1205662d;
import X.C13680ns;
import X.C13690nt;
import X.C15830rv;
import X.C16000sG;
import X.C16080sP;
import X.C16490t9;
import X.C17200uh;
import X.C18300wT;
import X.C18310wU;
import X.C26481Nw;
import X.C39061rr;
import X.C47382Is;
import X.C53842gO;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class PaymentInviteFragment extends Hilt_PaymentInviteFragment {
    public C16000sG A00;
    public C16080sP A01;
    public C17200uh A02;
    public C16490t9 A03;
    public AnonymousClass1HS A04;
    public AnonymousClass5vV A05;
    public C1205662d A06;
    public AnonymousClass3Q5 A07;
    public PaymentIncentiveViewModel A08;
    public C117745tU A09;
    public String A0A;
    public List A0B;

    public static Bundle A02(String str, ArrayList arrayList, boolean z2, boolean z3) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("payment_service", 3);
        A0D.putParcelableArrayList("user_jids", arrayList);
        A0D.putBoolean("requires_sync", z2);
        A0D.putString("referral_screen", str);
        A0D.putBoolean("show_incentive_blurb", z3);
        return A0D;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0455);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006b, code lost:
        if (r6.A06(X.C110115dX.A0L(r6.A05), r6.A06.A00()) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            r3 = r11
            boolean r2 = r11 instanceof com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment
            if (r2 == 0) goto L_0x0029
            com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r3 = (com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r3
            X.2gO r1 = new X.2gO
            r1.<init>()
            java.lang.String r0 = "payment_invite_prompt"
            r1.A0a = r0
            java.lang.String r0 = r3.A0A
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "chat"
        L_0x0016:
            r1.A0Z = r0
            r3.A1D(r1)
            java.lang.Integer r0 = X.C13680ns.A0X()
            r1.A08 = r0
            r3.A1D(r1)
            X.61W r0 = r3.A0J
            r0.AKR(r1)
        L_0x0029:
            android.os.Bundle r1 = r11.A04()
            android.os.Bundle r3 = r11.A04()
            java.lang.String r0 = "user_jids"
            java.util.ArrayList r0 = r3.getParcelableArrayList(r0)
            X.AnonymousClass00B.A06(r0)
            r11.A0B = r0
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r3.getString(r0)
            r11.A0A = r0
            X.00l r0 = r11.A0D()
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = X.C110105dW.A0R(r0)
            r11.A08 = r0
            java.lang.String r0 = "show_incentive_blurb"
            boolean r0 = r1.getBoolean(r0)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x006d
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = r11.A08
            X.1GO r0 = r6.A06
            X.2fW r5 = r0.A00()
            X.0wS r0 = r6.A05
            X.1yJ r0 = X.C110115dX.A0L(r0)
            boolean r0 = r6.A06(r0, r5)
            r10 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r10 = 0
        L_0x006e:
            X.0uh r8 = r11.A02
            X.0sG r6 = r11.A00
            X.0sP r7 = r11.A01
            java.lang.String r9 = r11.A0A
            X.5lO r5 = new X.5lO
            r5.<init>(r6, r7, r8, r9, r10)
            r11.A06 = r5
            X.00l r0 = r11.A0D()
            X.3Q5 r0 = X.C110115dX.A0U(r0)
            r11.A07 = r0
            java.lang.String r0 = "payment_service"
            r1.getInt(r0)
            X.62d r6 = r11.A06
            r0 = 2131365108(0x7f0a0cf4, float:1.8350072E38)
            r5 = 2131365107(0x7f0a0cf3, float:1.835007E38)
            if (r6 == 0) goto L_0x00a1
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x00f2
            X.C811947f.A00(r0, r6)
        L_0x00a1:
            java.util.List r0 = r11.A0B
            int r0 = r0.size()
            if (r0 != r4) goto L_0x00e4
            java.lang.String r0 = "requires_sync"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x00e4
            X.62d r1 = r11.A06
            r5 = 0
            X.4J0 r0 = new X.4J0
            r0.<init>(r4, r5)
            r1.A5O(r0)
            java.util.List r0 = r11.A0B
            java.lang.Object r4 = r0.get(r3)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = r11
            if (r2 == 0) goto L_0x00df
            com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r0 = (com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r0
            X.5eR r1 = r0.A0L
            android.content.Context r3 = r0.A0u()
            X.5vH r2 = r0.A0I
            X.0wT r0 = r1.A02
            java.lang.Boolean r7 = r0.A03()
            X.614 r6 = new X.614
            r6.<init>(r4, r1)
            r2.A00(r3, r4, r5, r6, r7)
        L_0x00df:
            X.62d r0 = r11.A06
            r0.A0A = r11
            return
        L_0x00e4:
            X.62d r3 = r11.A06
            r2 = 2
            java.util.List r1 = r11.A0B
            X.4J0 r0 = new X.4J0
            r0.<init>(r2, r1)
            r3.A5O(r0)
            goto L_0x00df
        L_0x00f2:
            android.view.View r0 = r13.findViewById(r5)
            r6.AZf(r0)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.invites.PaymentInviteFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public void A1B() {
        AnonymousClass1HS r9 = this.A04;
        List<C15830rv> list = this.A0B;
        int i2 = A04().getInt("payment_service");
        for (C15830rv r6 : list) {
            long A002 = r9.A01.A00() + 7776000000L;
            C18300wT r10 = r9.A03;
            Map A072 = r10.A07(r10.A01().getString("payments_invitee_jids_with_expiry", ""));
            Number number = (Number) A072.get(r6);
            if (number == null || number.longValue() < A002) {
                A072.put(r6, Long.valueOf(A002));
                C13680ns.A0y(C110105dW.A06(r10), "payments_invitee_jids_with_expiry", C18300wT.A00(A072));
            }
            C18310wU r7 = r9.A04;
            r7.A0I.A06("userActionSendPaymentInvite");
            C39061rr r1 = new C39061rr(r7.A0N.A05.A02(r6, true), r7.A04.A00());
            r1.A00 = i2;
            r1.A01 = A002;
            r1.A0S(8192);
            r7.A06.A0W(r1);
            C26481Nw r72 = r7.A0H.A01;
            String rawString = r6.getRawString();
            synchronized (r72) {
                AnonymousClass1Nx r5 = r72.A01;
                C47382Is A003 = r5.A00();
                A003.A01++;
                A003.A0C.add(rawString);
                r5.A01(A003);
            }
        }
        this.A07.A05(2);
        A1C(this.A0B.size(), true);
    }

    public void A1C(int i2, boolean z2) {
        if (this instanceof IndiaUpiPaymentInviteFragment) {
            IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
            C53842gO r2 = new C53842gO();
            r2.A0a = "payment_invite_prompt";
            String str = indiaUpiPaymentInviteFragment.A0A;
            if (str == null) {
                str = "chat";
            }
            r2.A0Z = str;
            indiaUpiPaymentInviteFragment.A1D(r2);
            int i3 = 1;
            C110115dX.A10(r2, 1);
            if (z2) {
                i3 = 54;
            }
            r2.A07 = Integer.valueOf(i3);
            r2.A0I = Long.valueOf((long) i2);
            indiaUpiPaymentInviteFragment.A0J.AKR(r2);
        }
    }
}
