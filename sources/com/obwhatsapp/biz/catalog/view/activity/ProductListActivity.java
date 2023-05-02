package com.obwhatsapp.biz.catalog.view.activity;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass0Fd;
import X.AnonymousClass15I;
import X.AnonymousClass15P;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass1TC;
import X.AnonymousClass2JP;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SO;
import X.AnonymousClass2XA;
import X.AnonymousClass3R9;
import X.AnonymousClass4PR;
import X.C001500q;
import X.C005402i;
import X.C005502j;
import X.C005702l;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17170ue;
import X.C17250um;
import X.C18260wP;
import X.C18630x0;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C32241fu;
import X.C32291fz;
import X.C35171lU;
import X.C47802Kp;
import X.C49132Rg;
import X.C49272Sb;
import X.C49992Xb;
import X.C50262Yq;
import X.C57542rL;
import X.C62343De;
import X.C94984ln;
import X.C95314mR;
import android.app.Application;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape34S0200000_1_I0;
import com.facebook.redex.IDxRListenerShape41S0000000_2_I0;
import com.facebook.redex.IDxSListenerShape292S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.cart.IDxCObserverShape59S0100000_2_I0;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

public class ProductListActivity extends C14530pL {
    public View A00;
    public C005702l A01;
    public C005702l A02;
    public RecyclerView A03;
    public C32291fz A04;
    public AnonymousClass2SO A05;
    public AnonymousClass1KT A06;
    public C24511Gf A07;
    public AnonymousClass2XA A08;
    public C47802Kp A09;
    public C17170ue A0A;
    public AnonymousClass1TC A0B;
    public C23081Ak A0C;
    public C57542rL A0D;
    public C49272Sb A0E;
    public Button A0F;
    public AnonymousClass15I A0G;
    public UserJid A0H;
    public AnonymousClass1KS A0I;
    public C18630x0 A0J;
    public C23091Al A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final AnonymousClass4PR A0Q;

    public ProductListActivity() {
        this(0);
        this.A0N = true;
        this.A0Q = new IDxCObserverShape59S0100000_2_I0(this, 1);
    }

    public ProductListActivity(int i2) {
        this.A0M = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 23));
    }

    public void A1q() {
        if (!this.A0M) {
            this.A0M = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A0J = (C18630x0) r1.A1m.get();
            this.A07 = (C24511Gf) r1.A3U.get();
            this.A06 = (AnonymousClass1KT) r1.A3V.get();
            this.A0I = (AnonymousClass1KS) r1.AGl.get();
            this.A0G = (AnonymousClass15I) r1.A3r.get();
            this.A0C = (C23081Ak) r1.A3Z.get();
            this.A0B = (AnonymousClass1TC) r1.AJT.get();
            this.A0A = (C17170ue) r1.A3W.get();
            this.A05 = (AnonymousClass2SO) r2.A0y.get();
            this.A0K = (C23091Al) r1.A3f.get();
        }
    }

    public final void A35() {
        View findViewById;
        int i2;
        if (this.A0N) {
            findViewById = findViewById(R.id.shadow_bottom);
            i2 = 8;
        } else {
            boolean canScrollVertically = this.A03.canScrollVertically(1);
            findViewById = findViewById(R.id.shadow_bottom);
            i2 = 4;
            if (canScrollVertically) {
                i2 = 0;
            }
        }
        findViewById.setVisibility(i2);
    }

    public final void A36() {
        this.A0F.setText(getString(R.string.str130f, new Object[]{this.A0L}));
        if (this.A0N || !this.A0D.AAU()) {
            this.A0F.setVisibility(8);
        } else {
            this.A0F.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0J.A00(774777097, "plm_details_view_tag", "ProductListActivity");
        setContentView((int) R.layout.layout0052);
        String stringExtra = getIntent().getStringExtra("message_title");
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0J(stringExtra);
        }
        C32241fu r3 = new C32241fu(this);
        r3.A07(false);
        r3.A01(R.string.str1664);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 29));
        this.A01 = r3.create();
        C32241fu r32 = new C32241fu(this);
        r32.A07(false);
        r32.A01(R.string.str0bd3);
        r32.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 28));
        this.A02 = r32.create();
        this.A06.A02(this.A0Q);
        C35171lU r10 = (C35171lU) getIntent().getParcelableExtra("message_content");
        this.A0H = r10.A00;
        Application application = getApplication();
        UserJid userJid = this.A0H;
        C49272Sb r1 = (C49272Sb) new C006602z((AnonymousClass04o) new C95314mR(application, this.A0B, new C49992Xb(this.A07, this.A0A, userJid, this.A05), this.A07, userJid, this.A0I, r10), (C001500q) this).A01(C49272Sb.class);
        this.A0E = r1;
        r1.A02.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 10));
        this.A08 = (AnonymousClass2XA) new C006602z((AnonymousClass04o) new C62343De(this.A05, this.A0H), (C001500q) this).A01(AnonymousClass2XA.class);
        this.A00 = findViewById(R.id.no_internet_container);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dimen064a);
        this.A00.setPadding(dimensionPixelOffset, getResources().getDimensionPixelOffset(R.dimen.dimen064b), dimensionPixelOffset, 0);
        findViewById(R.id.no_internet_retry_button).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 43));
        Button button = (Button) findViewById(R.id.view_cart);
        this.A0F = button;
        button.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 44));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.product_list);
        this.A03 = recyclerView;
        C005502j r2 = recyclerView.A0R;
        if (r2 instanceof AnonymousClass0Fd) {
            ((AnonymousClass0Fd) r2).A00 = false;
        }
        recyclerView.A0m(new AnonymousClass3R9());
        UserJid userJid2 = this.A0H;
        C16040sK r5 = this.A01;
        AnonymousClass013 r9 = this.A01;
        C57542rL r4 = new C57542rL(r5, this.A0A, new C50262Yq(this.A0C, this.A0K), new IDxSListenerShape292S0100000_2_I0(this, 1), r9, userJid2);
        this.A0D = r4;
        this.A03.setAdapter(r4);
        this.A03.A0W = new IDxRListenerShape41S0000000_2_I0(1);
        this.A0E.A01.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 9));
        this.A0E.A00.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 8));
        this.A03.A0o(new IDxSListenerShape34S0100000_2_I0(this, 2));
        this.A03.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 0));
        this.A0O = false;
        this.A0G.A07(new C94984ln(0), this.A0H);
        this.A09 = this.A0A.A01();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu0003, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        menu.findItem(R.id.menu_share).setVisible(false);
        findItem.setVisible(false);
        MenuItem findItem2 = menu.findItem(R.id.menu_cart);
        findItem2.setActionView(R.layout.layout03db);
        AnonymousClass2JP.A02(findItem2.getActionView());
        findItem2.getActionView().setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 17));
        TextView textView = (TextView) findItem2.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A0L;
        if (str != null) {
            textView.setText(str);
        }
        this.A08.A00.A0A(this, new IDxObserverShape34S0200000_1_I0(findItem2, 1, this));
        this.A08.A06();
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A03(this.A0Q);
        this.A0J.A05("plm_details_view_tag", false);
    }

    public void onResume() {
        this.A0E.A05();
        this.A0E.A06.A00();
        super.onResume();
    }

    public void onStop() {
        super.onStop();
        this.A0O = false;
    }
}
