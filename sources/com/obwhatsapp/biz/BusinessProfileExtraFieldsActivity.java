package com.obwhatsapp.biz;

import X.AnonymousClass013;
import X.AnonymousClass127;
import X.AnonymousClass13V;
import X.AnonymousClass16O;
import X.AnonymousClass18R;
import X.AnonymousClass1KR;
import X.AnonymousClass1P7;
import X.AnonymousClass1VD;
import X.AnonymousClass3BG;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C17140ub;
import X.C17150uc;
import X.C17180uf;
import X.C19980zJ;
import X.C216114t;
import X.C33481ie;
import X.C35661mI;
import X.C40781ug;
import X.C439822h;
import X.C49132Rg;
import X.C73393no;
import android.os.Bundle;
import com.facebook.redex.IDxPCallbackShape291S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape69S0100000_2_I1;
import com.obwhatsapp.group.IDxPObserverShape82S0100000_2_I1;
import com.whatsapp.jid.UserJid;

public class BusinessProfileExtraFieldsActivity extends C14530pL {
    public AnonymousClass3BG A00;
    public C17150uc A01;
    public AnonymousClass13V A02;
    public AnonymousClass16O A03;
    public AnonymousClass1KR A04;
    public C17180uf A05;
    public AnonymousClass127 A06;
    public C17140ub A07;
    public C16080sP A08;
    public AnonymousClass013 A09;
    public C216114t A0A;
    public C16010sH A0B;
    public AnonymousClass18R A0C;
    public UserJid A0D;
    public AnonymousClass1P7 A0E;
    public Integer A0F;
    public boolean A0G;
    public final C439822h A0H;
    public final C40781ug A0I;
    public final C33481ie A0J;
    public final AnonymousClass1VD A0K;

    public BusinessProfileExtraFieldsActivity() {
        this(0);
        this.A0J = new IDxCObserverShape69S0100000_2_I1(this, 0);
        this.A0I = new C73393no(this);
        this.A0K = new IDxPObserverShape82S0100000_2_I1(this, 0);
        this.A0H = new IDxPObserverShape58S0100000_2_I1(this, 0);
    }

    public BusinessProfileExtraFieldsActivity(int i2) {
        this.A0G = false;
        C13680ns.A1G(this, 16);
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0E = (AnonymousClass1P7) r1.ADc.get();
            this.A08 = C16150sX.A0Q(r1);
            this.A09 = C16150sX.A0Z(r1);
            this.A07 = C16150sX.A0N(r1);
            this.A06 = (AnonymousClass127) r1.A3z.get();
            this.A03 = (AnonymousClass16O) r1.A36.get();
            this.A01 = C16150sX.A09(r1);
            this.A05 = C16150sX.A0D(r1);
            this.A02 = (AnonymousClass13V) r1.A35.get();
            this.A0A = (C216114t) r1.A5O.get();
            this.A0C = (AnonymousClass18R) r1.ABZ.get();
            this.A04 = (AnonymousClass1KR) r1.A31.get();
        }
    }

    public void A35() {
        C16010sH A012 = this.A0A.A01(this.A0D);
        this.A0B = A012;
        setTitle(this.A08.A08(A012));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0D = C14530pL.A0O(getIntent(), "jid");
        int intExtra = getIntent().getIntExtra("profile_entry_point", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        this.A0F = valueOf;
        if (intExtra == -1) {
            valueOf = null;
        }
        this.A0F = valueOf;
        A35();
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        setContentView((int) R.layout.layout0560);
        C16040sK r4 = this.A01;
        C19980zJ r2 = this.A00;
        AnonymousClass1P7 r12 = this.A0E;
        C16080sP r9 = this.A08;
        AnonymousClass013 r10 = this.A09;
        AnonymousClass16O r5 = this.A03;
        C17180uf r8 = this.A05;
        this.A00 = new AnonymousClass3BG(this.A00, r2, this, r4, r5, this.A04, (C35661mI) null, r8, r9, r10, this.A0B, r12, this.A0F, true, false);
        this.A01.A03(new IDxPCallbackShape291S0100000_2_I1(this, 0), this.A0D);
        this.A07.A02(this.A0J);
        this.A06.A02(this.A0I);
        this.A02.A02(this.A0H);
        this.A0C.A02(this.A0K);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A03(this.A0J);
        this.A06.A03(this.A0I);
        this.A02.A03(this.A0H);
        this.A0C.A03(this.A0K);
    }
}
