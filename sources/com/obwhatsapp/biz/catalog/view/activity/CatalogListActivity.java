package com.obwhatsapp.biz.catalog.view.activity;

import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass13V;
import X.AnonymousClass156;
import X.AnonymousClass15I;
import X.AnonymousClass15P;
import X.AnonymousClass1KA;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass1KU;
import X.AnonymousClass1KW;
import X.AnonymousClass1KY;
import X.AnonymousClass1PQ;
import X.AnonymousClass2JP;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SO;
import X.AnonymousClass2XT;
import X.AnonymousClass4DS;
import X.C004601z;
import X.C100364vW;
import X.C100514vl;
import X.C100544vo;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17140ub;
import X.C17150uc;
import X.C17170ue;
import X.C17250um;
import X.C18260wP;
import X.C18450wi;
import X.C18630x0;
import X.C18640x1;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C28011Tz;
import X.C32131fh;
import X.C32151fj;
import X.C32241fu;
import X.C447325i;
import X.C447425j;
import X.C447525k;
import X.C447625l;
import X.C453428a;
import X.C49132Rg;
import X.C50492Zv;
import X.C50502Zw;
import X.C57242qY;
import X.C62733Es;
import X.C71503kX;
import X.C89964dG;
import X.C94984ln;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.util.List;

public class CatalogListActivity extends C32131fh implements C447325i, C447425j, C447525k {
    public C50502Zw A00;
    public WaTextView A01;
    public WaTextView A02;
    public C17150uc A03;
    public AnonymousClass1PQ A04;
    public PostcodeChangeBottomSheet A05;
    public C447625l A06;
    public AnonymousClass01Y A07;
    public AnonymousClass1KU A08;
    public C89964dG A09;
    public Button A0A;
    public C16000sG A0B;
    public C16080sP A0C;
    public AnonymousClass15I A0D;
    public AnonymousClass1KS A0E;
    public boolean A0F;

    public CatalogListActivity() {
        this(0);
    }

    public CatalogListActivity(int i2) {
        this.A0F = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 21));
    }

    public void A1q() {
        if (!this.A0F) {
            this.A0F = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r3 = r2.A1s;
            this.A05 = (C16320sq) r3.ARB.get();
            AnonymousClass01J r1 = r3.A05;
            this.A0C = (C14710pd) r1.get();
            this.A05 = (C14870pt) r3.AB3.get();
            this.A03 = (C16300so) r3.A5p.get();
            this.A04 = (C16180sb) r3.A8b.get();
            this.A0B = (C17250um) r3.A7e.get();
            this.A06 = (C15900s5) r3.ALm.get();
            this.A08 = (AnonymousClass01V) r3.AOi.get();
            this.A0D = (C19950zG) r3.AQV.get();
            this.A09 = (C15860rz) r3.AQh.get();
            this.A07 = (C18260wP) r3.A4p.get();
            this.A0A = (C16290sm) r3.AQk.get();
            this.A05 = (C16440t3) r3.AP2.get();
            this.A0B = (C23061Ai) r3.AC0.get();
            this.A01 = (C16040sK) r3.ADr.get();
            this.A04 = (C16190sc) r3.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r3.ANy.get();
            this.A00 = (C19980zJ) r3.A0P.get();
            this.A02 = (C23071Aj) r3.AQb.get();
            this.A03 = (AnonymousClass15P) r3.A0b.get();
            this.A0A = (C19490yW) r3.ALQ.get();
            this.A09 = (C15960sC) r3.AKz.get();
            this.A07 = C16150sX.A0d(r3);
            this.A0L = (C18630x0) r3.A1m.get();
            this.A05 = (C24511Gf) r3.A3U.get();
            this.A04 = (AnonymousClass1KT) r3.A3V.get();
            this.A0C = (AnonymousClass1KA) r3.A3a.get();
            this.A0D = (C23081Ak) r3.A3Z.get();
            this.A07 = (AnonymousClass1KY) r3.A3d.get();
            this.A0I = (C17140ub) r3.A4y.get();
            this.A08 = (C28011Tz) r3.AJV.get();
            this.A09 = (C18640x1) r3.A3X.get();
            this.A02 = (C50492Zv) r2.A19.get();
            this.A01 = (AnonymousClass2SO) r2.A0y.get();
            this.A03 = (AnonymousClass13V) r3.A35.get();
            this.A0J = (AnonymousClass156) r3.ADH.get();
            this.A0M = (AnonymousClass1KW) r3.A3e.get();
            this.A0N = (C23091Al) r3.A3f.get();
            this.A0B = (C17170ue) r3.A3W.get();
            this.A0B = (C16000sG) r3.A4x.get();
            this.A0E = (AnonymousClass1KS) r3.AGl.get();
            this.A0C = (C16080sP) r3.AQ9.get();
            this.A07 = (AnonymousClass01Y) r3.A1w.get();
            this.A00 = (C50502Zw) r2.A1K.get();
            this.A0D = (AnonymousClass15I) r3.A3r.get();
            this.A03 = (C17150uc) r3.A34.get();
            this.A08 = (AnonymousClass1KU) r3.A3i.get();
            this.A04 = r2.A05();
            this.A09 = new C89964dG(new AnonymousClass4DS((C14710pd) r1.get()));
        }
    }

    public void A36(List list) {
        super.A36(list);
        A39();
        A38();
    }

    public final void A37() {
        if (this.A09.A0H(this.A0K)) {
            this.A09.A0D(this.A0K);
        }
        AnonymousClass1KU r2 = this.A08;
        UserJid userJid = this.A0K;
        C18450wi.A0H(userJid, 0);
        synchronized (r2) {
            r2.A02.remove(userJid);
        }
        if (this.A0F.A00.size() > 0) {
            this.A0F.A00.clear();
            this.A0F.A01();
            this.A0F.A0K();
        }
        C32151fj r3 = this.A0F;
        int i2 = 0;
        do {
            List list = r3.A00;
            list.add(new C71503kX());
            r3.A03(list.size() - 1);
            i2++;
        } while (i2 < 3);
        this.A0G.A07(this.A0K);
        this.A0G.A06(this.A0K);
        this.A0G.A0H.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A00.canScrollVertically(1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A38() {
        /*
            r3 = this;
            r0 = 2131366199(0x7f0a1137, float:1.8352285E38)
            android.view.View r2 = r3.findViewById(r0)
            X.1fj r0 = r3.A0F
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r0 = 8
        L_0x001d:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity.A38():void");
    }

    public final void A39() {
        this.A0A.setText(getString(R.string.str130f, new Object[]{this.A0O}));
        if (this.A0F.A06.isEmpty() || !this.A0F.AAU()) {
            this.A0A.setVisibility(8);
        } else {
            this.A0A.setVisibility(0);
        }
    }

    public final void A3A(boolean z2) {
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(this, z2);
        this.A05 = postcodeChangeBottomSheet;
        String str = (String) this.A0G.A0A.A01();
        postcodeChangeBottomSheet.A08 = str;
        WaEditText waEditText = postcodeChangeBottomSheet.A04;
        if (waEditText != null) {
            waEditText.setText(str);
        }
        C453428a.A01(this.A05, AGM());
    }

    public void AOD() {
        this.A0G.A0H.A00();
    }

    public void AV1() {
        this.A05 = null;
    }

    public void AV2(String str) {
        Afq(R.string.str12a6);
        C57242qY r0 = this.A0G;
        AnonymousClass1KA r4 = r0.A0G;
        r4.A05.A00(new C100514vl(new C100364vW(r0, str), r4), r0.A0M, str).A06();
    }

    public void onBackPressed() {
        AnonymousClass01A A0B2 = AGM().A0B("CatalogSearchFragmentTag");
        if (A0B2 == null || !(A0B2 instanceof AnonymousClass2XT) || !((AnonymousClass2XT) A0B2).AHL()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C447625l r0;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 && (r0 = this.A06) != null) {
            r0.A00();
            this.A06 = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(R.id.view_cart);
        this.A0A = button;
        button.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 42));
        this.A0D.A07(new C94984ln(0), this.A0K);
        if (this.A03.A09()) {
            this.A0G.A0A.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 44));
            this.A0G.A09.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 45));
            this.A03.A03(new C62733Es(this), this.A0K);
        }
        this.A00.A0o(new IDxSListenerShape34S0100000_2_I0(this, 1));
        this.A0G.A0Q.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 43));
        this.A0G.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 41));
        this.A06.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 42));
        this.A04.A00(new C100544vo(this), this.A0K);
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 106) {
            return super.onCreateDialog(i2);
        }
        C16010sH A0A2 = this.A0B.A0A(this.A0K);
        C32241fu r4 = new C32241fu(this);
        r4.A06(getString(R.string.str03a5, new Object[]{this.A0C.A08(A0A2)}));
        r4.setPositiveButton(R.string.str1872, new IDxCListenerShape28S0200000_2_I0(this, 3, A0A2));
        r4.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 27));
        return r4.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu0006, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        MenuItem findItem2 = menu.findItem(R.id.menu_share);
        findItem2.setActionView(R.layout.layout03dc);
        findItem2.getActionView().setContentDescription(getString(R.string.str1c20));
        findItem2.setVisible(this.A0P);
        AnonymousClass2JP.A02(findItem2.getActionView());
        findItem2.getActionView().setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 15));
        findItem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A0A.A04(this);
        this.A0G.A09.A04(this);
        this.A0G.A0Q.A04(this);
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = this.A05;
        if (postcodeChangeBottomSheet != null) {
            postcodeChangeBottomSheet.A1C();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        String str = (String) this.A0G.A0A.A01();
        String A0R = this.A09.A0R(this.A0K.getRawString());
        if (str != null && A0R != null && !str.equals(A0R)) {
            this.A0G.A0A.A09(A0R);
            C15860rz r1 = this.A09;
            String rawString = this.A0K.getRawString();
            StringBuilder sb = new StringBuilder("dc_location_name_");
            sb.append(rawString);
            String string = ((SharedPreferences) r1.A01.get()).getString(sb.toString(), (String) null);
            if (string != null) {
                this.A0G.A09.A09(string);
            }
            A37();
        }
    }

    public void setPostcodeAndLocationViews(View view) {
        this.A02 = (WaTextView) C004601z.A0E(view, R.id.postcode_item_text);
        this.A01 = (WaTextView) C004601z.A0E(view, R.id.postcode_item_location_name);
    }
}
