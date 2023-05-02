package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass1KS;
import X.AnonymousClass1TC;
import X.C001500q;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C110105dW;
import X.C110865ex;
import X.C110915f2;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17170ue;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C35141lR;
import X.C35151lS;
import X.C35161lT;
import X.C35171lU;
import X.C35251lc;
import X.C49132Rg;
import X.C49272Sb;
import X.C49992Xb;
import X.C50262Yq;
import X.C93554jO;
import X.C95314mR;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape38S0200000_3_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCheckoutOrderDetailsItemListActivity extends C14530pL {
    public RecyclerView A00;
    public C24511Gf A01;
    public C17170ue A02;
    public AnonymousClass1TC A03;
    public C23081Ak A04;
    public C49272Sb A05;
    public AnonymousClass013 A06;
    public AnonymousClass1KS A07;
    public C23091Al A08;
    public boolean A09;

    public PaymentCheckoutOrderDetailsItemListActivity() {
        this(0);
    }

    public PaymentCheckoutOrderDetailsItemListActivity(int i2) {
        this.A09 = false;
        C110105dW.A0t(this, 87);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A01 = (C24511Gf) r1.A3U.get();
            this.A07 = (AnonymousClass1KS) r1.AGl.get();
            this.A06 = C16150sX.A0Z(r1);
            this.A04 = (C23081Ak) r1.A3Z.get();
            this.A03 = (AnonymousClass1TC) r1.AJT.get();
            this.A02 = (C17170ue) r1.A3W.get();
            this.A08 = (C23091Al) r1.A3f.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout043a);
        String stringExtra = getIntent().getStringExtra("message_title");
        C35251lc r5 = (C35251lc) getIntent().getParcelableExtra("message_content");
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("business_owner_jid"));
        AnonymousClass00B.A06(r5);
        List<C93554jO> list = r5.A05.A08;
        AnonymousClass00B.A0F(!list.isEmpty());
        AnonymousClass00B.A06(nullable);
        ArrayList A0u = AnonymousClass000.A0u();
        for (C93554jO A002 : list) {
            String A003 = A002.A00();
            if (!TextUtils.isEmpty(A003)) {
                A0u.add(new C35161lT(A003));
            }
        }
        C35141lR r4 = new C35141lR((String) null, A0u);
        String A004 = ((C93554jO) list.get(0)).A00();
        if (A004 == null) {
            A004 = "";
        }
        C35171lU r11 = new C35171lU(nullable, new C35151lS(A004, r5.A0E, false), Collections.singletonList(r4));
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0J(stringExtra);
        }
        this.A00 = (RecyclerView) C004601z.A0E(this.A00, R.id.item_list);
        C110865ex r3 = new C110865ex(new C50262Yq(this.A04, this.A08), this.A06, r5);
        this.A00.A0m(new C110915f2());
        this.A00.setAdapter(r3);
        C49272Sb r0 = (C49272Sb) new C006602z((AnonymousClass04o) new C95314mR(getApplication(), this.A03, new C49992Xb(this.A01, this.A02, nullable, this.A05), this.A07, nullable, this.A07, r11), (C001500q) this).A01(C49272Sb.class);
        this.A05 = r0;
        r0.A01.A0A(this, new IDxObserverShape38S0200000_3_I1(this, 0, r3));
    }

    public void onResume() {
        super.onResume();
        this.A05.A05();
    }
}
