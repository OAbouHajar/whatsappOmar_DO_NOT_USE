package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass1N2;
import X.AnonymousClass35s;
import X.AnonymousClass37T;
import X.AnonymousClass3Q5;
import X.AnonymousClass5xI;
import X.AnonymousClass5xP;
import X.AnonymousClass62C;
import X.C001000l;
import X.C110105dW;
import X.C110115dX;
import X.C111695hD;
import X.C111705hE;
import X.C117745tU;
import X.C1214065j;
import X.C1214165k;
import X.C1222969a;
import X.C14600pS;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C18090w8;
import X.C18290wS;
import X.C221116r;
import X.C227919h;
import X.C28401Vy;
import X.C35511m3;
import X.C47372Ir;
import X.C53322fW;
import X.C87324Wh;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaymentContactPickerFragment extends Hilt_PaymentContactPickerFragment {
    public C221116r A00;
    public AnonymousClass175 A01;
    public C227919h A02;
    public AnonymousClass174 A03;
    public C18090w8 A04;
    public C1222969a A05;
    public C53322fW A06;
    public AnonymousClass3Q5 A07;
    public PaymentIncentiveViewModel A08;
    public C117745tU A09;
    public AnonymousClass1N2 A0A;
    public String A0B;
    public Map A0C = AnonymousClass000.A0x();

    public void A0n(Bundle bundle) {
        super.A0n(bundle);
        this.A0x.A00.x().A0B(R.string.str0ddf);
        this.A0B = A1C().getString("referral_screen");
        this.A07 = C110115dX.A0U(A0D());
        this.A05 = this.A1p.A03().ACC();
        if (C110115dX.A18(this.A1d)) {
            PaymentIncentiveViewModel A0R = C110105dW.A0R(A0D());
            this.A08 = A0R;
            A0R.A01.A09(AnonymousClass5xI.A01(A0R.A06.A00()));
            C110115dX.A0w(A0D(), this.A08.A01, this, 56);
            return;
        }
        A1w();
    }

    public AnonymousClass37T A1E() {
        if (!this.A04.A03.A0C(2026)) {
            return super.A1E();
        }
        String str = this.A2B;
        ArrayList arrayList = this.A2J;
        List list = this.A2M;
        List list2 = this.A2Q;
        Set set = this.A2x;
        HashSet hashSet = this.A2u;
        C16040sK r1 = this.A0Q;
        AnonymousClass013 r6 = this.A1H;
        return new C111695hD(r1, this.A0m, this.A0q, this.A0r, this, r6, this.A00, str, hashSet, arrayList, list, list2, set);
    }

    public AnonymousClass35s A1F() {
        if (!this.A04.A03.A0C(2026)) {
            return super.A1F();
        }
        C16000sG r1 = this.A0m;
        C18290wS r5 = this.A1p;
        return new C111705hE(r1, this, this.A00, this.A04, r5);
    }

    public String A1G(C16010sH r4) {
        if (this.A04.A00(C110115dX.A0I(r4)) != 2) {
            return A0J(R.string.str0547);
        }
        return null;
    }

    public String A1H(C16010sH r5) {
        Jid A082 = r5.A08(UserJid.class);
        if (A082 == null) {
            return null;
        }
        C35511m3 r1 = (C35511m3) this.A0C.get(A082);
        C47372Ir AEf = this.A1p.A03().AEf();
        if (r1 == null || AEf == null || ((int) ((r1.A06().A00 >> 12) & 15)) != 2) {
            return null;
        }
        return A0J(R.string.str106c);
    }

    public void A1h(List list) {
        HashMap A0x = AnonymousClass000.A0x();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C35511m3 r1 = (C35511m3) it.next();
            A0x.put(r1.A05, r1);
        }
        this.A0C = A0x;
    }

    public boolean A1i() {
        return false;
    }

    public boolean A1j() {
        return false;
    }

    public boolean A1k() {
        return false;
    }

    public boolean A1l() {
        return false;
    }

    public boolean A1m() {
        return false;
    }

    public boolean A1n() {
        return false;
    }

    public boolean A1o() {
        C53322fW r3 = this.A06;
        return r3 != null && r3.A00(C110105dW.A03(this.A1E)) == 1;
    }

    public boolean A1q() {
        return this instanceof IndiaUpiContactPickerFragment ? AnonymousClass000.A1V(this.A1p.A05("UPI").AEf()) : this.A1d.A0C(544) && this.A1p.A03().AEf() != null;
    }

    public boolean A1r() {
        return true;
    }

    public boolean A1u(Intent intent, C16010sH r15) {
        UserJid A0I = C110115dX.A0I(r15);
        if (this.A04.A00(A0I) != 2) {
            return true;
        }
        if (intent == null) {
            C001000l A0C2 = A0C();
            intent = A0C2 != null ? A0C2.getIntent() : null;
        }
        C87324Wh r4 = new C87324Wh(A0C(), (C14600pS) A0D(), this.A0P, this.A1p, this.A07, new C1214065j(A0I, this), new C1214165k(A0I, this), true);
        if (r4.A02()) {
            this.A0x.Afr(0, R.string.str13db);
            String str = null;
            if (intent != null) {
                str = intent.getStringExtra("referral_screen");
            }
            r4.A01(A0I, new AnonymousClass62C(this), str);
            return true;
        }
        A1y(A0I);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r0 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1v(X.C16010sH r9) {
        /*
            r8 = this;
            com.whatsapp.jid.UserJid r7 = X.C110115dX.A0I(r9)
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = r8.A08
            if (r6 != 0) goto L_0x000a
            r5 = 0
        L_0x0009:
            return r5
        L_0x000a:
            java.util.Map r1 = r8.A0C
            X.1GO r0 = r6.A06
            X.2fW r4 = r0.A00()
            X.0wS r0 = r6.A05
            X.1yJ r3 = X.C110115dX.A0L(r0)
            r5 = 0
            if (r3 == 0) goto L_0x0009
            X.0pd r2 = r3.A07
            r0 = 979(0x3d3, float:1.372E-42)
            boolean r0 = r2.A0C(r0)
            if (r0 != 0) goto L_0x0009
            boolean r0 = r6.A06(r3, r4)
            if (r0 == 0) goto L_0x0009
            java.lang.Object r1 = r1.get(r7)
            X.1m3 r1 = (X.C35511m3) r1
            boolean r0 = X.C110115dX.A18(r2)
            if (r0 == 0) goto L_0x0009
            X.2fU r0 = r4.A01
            if (r0 == 0) goto L_0x0009
            int r1 = r3.A07(r1, r7, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0009
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentContactPickerFragment.A1v(X.0sH):boolean");
    }

    public final void A1w() {
        if (this.A05 != null) {
            AnonymousClass5xP.A02(AnonymousClass5xP.A00(this.A1E, (C28401Vy) null, this.A06, (String) null, false), this.A05, "payment_contact_picker", this.A0B);
        }
    }

    public void A1x(Intent intent, UserJid userJid) {
        for (C16010sH A072 : this.A2Q) {
            C15830rv A073 = A072.A07();
            if (A073 != null && A073.getRawString().equals(userJid.getRawString())) {
                C1222969a r2 = this.A05;
                if (r2 != null) {
                    C110105dW.A1K(r2, 149, "payment_contact_picker", this.A0B);
                }
                intent.putExtra("referral_screen", "send_again_contact");
                return;
            }
        }
        C1222969a r22 = this.A05;
        if (r22 != null) {
            C110105dW.A1K(r22, 133, "payment_contact_picker", this.A0B);
        }
    }

    public void A1y(UserJid userJid) {
        Intent A022 = this.A02.A02(A0u(), false, false);
        A022.putExtra("referral_screen", "payment_contact_picker");
        A022.putExtra("extra_jid", userJid.getRawString());
        A1x(A022, userJid);
        A0r(A022);
        C110115dX.A0v(this);
    }
}
