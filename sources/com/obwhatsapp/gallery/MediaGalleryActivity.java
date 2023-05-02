package com.obwhatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01Q;
import X.AnonymousClass01V;
import X.AnonymousClass05J;
import X.AnonymousClass071;
import X.AnonymousClass10B;
import X.AnonymousClass10C;
import X.AnonymousClass10G;
import X.AnonymousClass10X;
import X.AnonymousClass15W;
import X.AnonymousClass17F;
import X.AnonymousClass17N;
import X.AnonymousClass1BQ;
import X.AnonymousClass1BU;
import X.AnonymousClass1H9;
import X.AnonymousClass1HE;
import X.AnonymousClass1L8;
import X.AnonymousClass1L9;
import X.AnonymousClass1MF;
import X.AnonymousClass1PD;
import X.AnonymousClass1YG;
import X.AnonymousClass1yL;
import X.AnonymousClass2DW;
import X.AnonymousClass2JP;
import X.AnonymousClass2SQ;
import X.AnonymousClass2SR;
import X.AnonymousClass2ZD;
import X.AnonymousClass3B1;
import X.AnonymousClass3BP;
import X.AnonymousClass3EU;
import X.AnonymousClass3OK;
import X.AnonymousClass3PQ;
import X.AnonymousClass47T;
import X.AnonymousClass4E3;
import X.AnonymousClass5PQ;
import X.C004601z;
import X.C009804r;
import X.C101554xV;
import X.C101564xW;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C15450qv;
import X.C15830rv;
import X.C15860rz;
import X.C16000sG;
import X.C16030sJ;
import X.C16070sO;
import X.C16080sP;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16620tM;
import X.C16740tZ;
import X.C16760tb;
import X.C17020u3;
import X.C17030uP;
import X.C17220uj;
import X.C17240ul;
import X.C17250um;
import X.C18030w2;
import X.C18040w3;
import X.C18930xU;
import X.C19150xq;
import X.C19410yO;
import X.C19990zK;
import X.C20260zl;
import X.C20270zm;
import X.C206711d;
import X.C209212c;
import X.C23631Ct;
import X.C28381Vw;
import X.C31091dS;
import X.C35541m6;
import X.C40641uS;
import X.C42391xi;
import X.C434920f;
import X.C49132Rg;
import X.C50952aj;
import X.C59222vY;
import X.C603431a;
import X.C616339r;
import X.C73743oz;
import X.C807745l;
import X.C86144Rj;
import X.C99824ue;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxAListenerShape2S0201000_2_I0;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.IDxDListenerShape341S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape270S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.google.android.material.tabs.TabLayout;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaGalleryActivity extends C59222vY implements AnonymousClass1YG {
    public int A00;
    public int A01 = 1;
    public int A02 = 2;
    public int A03 = 0;
    public MenuItem A04;
    public C009804r A05;
    public AnonymousClass05J A06;
    public C50952aj A07;
    public AnonymousClass10X A08;
    public C16760tb A09;
    public C18930xU A0A;
    public C16000sG A0B;
    public C17030uP A0C;
    public C16080sP A0D;
    public AnonymousClass1L8 A0E;
    public C86144Rj A0F;
    public C20270zm A0G;
    public AnonymousClass10C A0H;
    public AnonymousClass1H9 A0I;
    public C16260sj A0J;
    public C16460t6 A0K;
    public AnonymousClass17F A0L;
    public C42391xi A0M = new C42391xi(this.A01);
    public C16070sO A0N;
    public AnonymousClass10B A0O;
    public AnonymousClass17N A0P;
    public C19150xq A0Q;
    public AnonymousClass10G A0R;
    public C19410yO A0S;
    public C18030w2 A0T;
    public C206711d A0U;
    public AnonymousClass1BQ A0V;
    public C20260zl A0W;
    public C16490t9 A0X;
    public C18040w3 A0Y;
    public AnonymousClass2ZD A0Z;
    public C17240ul A0a;
    public AnonymousClass15W A0b;
    public C15830rv A0c;
    public AnonymousClass1HE A0d;
    public C209212c A0e;
    public C19990zK A0f;
    public AnonymousClass1L9 A0g;
    public C17020u3 A0h;
    public AnonymousClass47T A0i;
    public AnonymousClass1BU A0j;
    public AnonymousClass1MF A0k;
    public C17220uj A0l;
    public AnonymousClass1PD A0m;
    public C23631Ct A0n;
    public AnonymousClass01D A0o;
    public String A0p = "";
    public ArrayList A0q;
    public final AnonymousClass071 A0r = new IDxSListenerShape35S0100000_2_I1(this, 4);
    public final AnonymousClass5PQ A0s = new C101564xW(this);

    public static /* synthetic */ AnonymousClass2DW A02(MediaGalleryActivity mediaGalleryActivity) {
        int i2 = mediaGalleryActivity.A00;
        for (AnonymousClass01A r1 : mediaGalleryActivity.A2E()) {
            if ((i2 == mediaGalleryActivity.A03 && (r1 instanceof MediaGalleryFragment)) || ((i2 == mediaGalleryActivity.A01 && (r1 instanceof DocumentsGalleryFragment)) || (i2 == mediaGalleryActivity.A02 && (r1 instanceof LinksGalleryFragment)))) {
                return (AnonymousClass2DW) r1;
            }
        }
        return null;
    }

    public int A1r() {
        return 78318969;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = false;
        return A1s;
    }

    public final void A35() {
        C86144Rj r1;
        AnonymousClass05J r2 = this.A06;
        if (r2 != null && (r1 = this.A0F) != null) {
            if (r1.A04.isEmpty()) {
                r2.A05();
                return;
            }
            AnonymousClass01V r8 = this.A08;
            AnonymousClass013 r7 = this.A01;
            HashMap hashMap = r1.A04;
            long size = (long) hashMap.size();
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, hashMap.size(), 0);
            AnonymousClass2JP.A00(this, r8, r7.A0J(A1b, R.plurals.plurals00dc, size));
            this.A06.A06();
        }
    }

    public void A4o(Drawable drawable, View view) {
    }

    public void A96() {
        AnonymousClass05J r0 = this.A06;
        if (r0 != null) {
            r0.A05();
        }
    }

    public /* synthetic */ void A9J(C16740tZ r1) {
    }

    public /* synthetic */ int AAs() {
        return 0;
    }

    public Object AAy(Class cls) {
        if (cls == AnonymousClass5PQ.class) {
            return this.A0s;
        }
        return null;
    }

    public C616339r AAz() {
        return this.A0E.A02;
    }

    public ArrayList AFm() {
        return this.A0q;
    }

    public /* synthetic */ int AGW(C16740tZ r2) {
        return 0;
    }

    public boolean AHi() {
        return AnonymousClass000.A1V(this.A0F);
    }

    public /* synthetic */ boolean AJH() {
        return false;
    }

    public boolean AJI(C16740tZ r3) {
        C86144Rj r0 = this.A0F;
        if (r0 != null) {
            return r0.A04.containsKey(r3.A11);
        }
    }

    public /* synthetic */ boolean AJU() {
        return false;
    }

    public /* synthetic */ boolean AJn(C16740tZ r2) {
        return false;
    }

    public /* synthetic */ void AW7(C16740tZ r1, boolean z2) {
    }

    public void AYX(AnonymousClass05J r2) {
        super.AYX(r2);
        if (C15450qv.A04()) {
            C434920f.A04(this, R.color.color04f1);
        } else {
            C434920f.A03(this, R.color.color0581);
        }
    }

    public void AYY(AnonymousClass05J r3) {
        super.AYY(r3);
        C434920f.A08(getWindow(), false);
        C434920f.A03(this, R.color.right_side);
    }

    public /* synthetic */ void Ad8(C16740tZ r1) {
    }

    public /* synthetic */ void AeT(C16740tZ r1) {
    }

    public void Aec(List list, boolean z2) {
        if (this.A0F != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C16740tZ A0V2 = C13680ns.A0V(it);
                C86144Rj r0 = this.A0F;
                C28381Vw r1 = A0V2.A11;
                HashMap hashMap = r0.A04;
                if (z2) {
                    hashMap.put(r1, A0V2);
                } else {
                    hashMap.remove(r1);
                }
            }
            A35();
        }
    }

    public /* synthetic */ void Aeq(C16740tZ r1, int i2) {
    }

    public /* synthetic */ boolean AfN() {
        return false;
    }

    public /* synthetic */ boolean Afe() {
        return false;
    }

    public void Afs(View view, C16740tZ r2, int i2, boolean z2) {
    }

    public void Ag8(C16740tZ r9) {
        C14870pt r4 = this.A05;
        C19150xq r3 = this.A0Q;
        C86144Rj r0 = new C86144Rj(r4, new C101554xV(this), this.A0F, r3);
        this.A0F = r0;
        r0.A04.put(r9.A11, r9);
        this.A06 = AgA(this.A05);
        AnonymousClass01V r7 = this.A08;
        AnonymousClass013 r6 = this.A01;
        C86144Rj r42 = this.A0F;
        long size = (long) r42.A04.size();
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1K(A1b, r42.A04.size());
        AnonymousClass2JP.A00(this, r7, r6.A0J(A1b, R.plurals.plurals00dc, size));
    }

    public boolean Agy(C16740tZ r4) {
        C86144Rj r0 = this.A0F;
        if (r0 == null) {
            return false;
        }
        C28381Vw r2 = r4.A11;
        boolean containsKey = r0.A04.containsKey(r2);
        HashMap hashMap = this.A0F.A04;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r4);
        }
        A35();
        return !containsKey;
    }

    public /* synthetic */ void Ahb(C16740tZ r1) {
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 2) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1 && intent != null) {
            if (this.A0F != null) {
                List A072 = C16030sJ.A07(intent, C15830rv.class);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                C35541m6 r7 = null;
                if (AnonymousClass3B1.A01(this.A0C, A072)) {
                    AnonymousClass00B.A06(intent);
                    r7 = this.A0j.A00(intent.getExtras());
                }
                ArrayList A0n2 = C13680ns.A0n(this.A0F.A04.values());
                Collections.sort(A0n2, new IDxComparatorShape19S0000000_2_I0(36));
                Iterator it = A0n2.iterator();
                while (it.hasNext()) {
                    this.A09.A08(this.A08, r7, C13680ns.A0V(it), A072, booleanExtra);
                }
                if (A072.size() != 1 || C16030sJ.A0Q((Jid) A072.get(0))) {
                    Agv(A072);
                } else {
                    this.A00.A07(this, C14750ph.A0q().A0v(this, this.A0B.A0A((C15830rv) A072.get(0))));
                }
            } else {
                Log.w("mediagallery/forward/failed");
                this.A05.A09(R.string.str0d39, 0);
            }
            AnonymousClass05J r0 = this.A06;
            if (r0 != null) {
                r0.A05();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0E.A00(this);
    }

    public void onCreate(Bundle bundle) {
        List<C28381Vw> A042;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass47T r6 = this.A0i;
        C16000sG r5 = this.A0B;
        C16080sP r4 = this.A0D;
        AnonymousClass013 r3 = this.A01;
        C49132Rg r2 = this.A07.A00.A01;
        this.A05 = new C603431a(this, r5, r4, new C73743oz((AnonymousClass2SQ) r2.A0l.get(), this, r2.A0J()), this.A0Z, r3, this, r6);
        this.A05.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A0I, 1));
        setTitle(R.string.str00d9);
        setContentView((int) R.layout.layout03c9);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C13690nt.A0N(this).A0N(true);
        if (C15450qv.A03()) {
            C13680ns.A1I(this, R.id.separator, 8);
        }
        A20(this.A00, this.A05);
        C434920f.A04(this, R.color.color04f1);
        C15830rv A0M2 = C14530pL.A0M(this);
        AnonymousClass00B.A06(A0M2);
        this.A0c = A0M2;
        String A082 = (!this.A01.A0I(A0M2) || !this.A0C.A0E(C16620tM.A02, 1967)) ? this.A0D.A08(this.A0B.A0A(this.A0c)) : C40641uS.A00(this, this.A0D, this.A01, this.A0B.A0A(this.A0c));
        if (A082 == null) {
            A082 = "";
        }
        A2g(A082);
        if (getIntent().getBooleanExtra("alert", false)) {
            this.A0m.A01(this);
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        this.A02 = -1;
        AnonymousClass3PQ r11 = new AnonymousClass3PQ(AGM());
        ArrayList A0u = AnonymousClass000.A0u();
        C13680ns.A1W(Integer.valueOf(R.string.str0934), new MediaGalleryFragment(), A0u);
        C13680ns.A1W(Integer.valueOf(R.string.str0932), new DocumentsGalleryFragment(), A0u);
        if (this.A0P.A04.A01("links_ready", 0) != 0) {
            C13680ns.A1W(Integer.valueOf(R.string.str0933), new LinksGalleryFragment(), A0u);
        }
        if (this.A01.A0T()) {
            Collections.reverse(A0u);
        }
        for (int i2 = 0; i2 < A0u.size(); i2++) {
            AnonymousClass01Q r0 = (AnonymousClass01Q) A0u.get(i2);
            Number number = (Number) r0.A00;
            Object obj = r0.A01;
            int intValue = number.intValue();
            String string = getString(intValue);
            r11.A01.add(obj);
            r11.A00.add(string);
            if (intValue == R.string.str0934) {
                this.A03 = i2;
            } else if (number.intValue() == R.string.str0932) {
                this.A01 = i2;
            } else if (number.intValue() == R.string.str0933) {
                this.A02 = i2;
            }
        }
        viewPager.setAdapter(r11);
        List list = r11.A01;
        viewPager.setOffscreenPageLimit(list.size());
        viewPager.A0F(this.A03, false);
        this.A00 = this.A03;
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        C004601z.A0f(tabLayout, 0);
        if (list.size() > 1) {
            tabLayout.A0A(AnonymousClass00T.A00(this, R.color.color053c), AnonymousClass00T.A00(this, R.color.color053b));
            tabLayout.setupWithViewPager(viewPager);
            tabLayout.setOnTabSelectedListener(new AnonymousClass3EU(viewPager, this));
        } else {
            ((AnonymousClass3OK) toolbar.getLayoutParams()).A00 = 0;
            tabLayout.setVisibility(8);
        }
        if (bundle != null && (A042 = AnonymousClass1yL.A04(bundle2)) != null) {
            for (C28381Vw r62 : A042) {
                C16740tZ A002 = C16460t6.A00(this.A0K, r62);
                if (A002 != null) {
                    C86144Rj r42 = this.A0F;
                    if (r42 == null) {
                        r42 = new C86144Rj(this.A05, new C101554xV(this), (C86144Rj) null, this.A0Q);
                        this.A0F = r42;
                    }
                    r42.A04.put(r62, A002);
                }
            }
            if (this.A0F != null) {
                this.A06 = AgA(this.A05);
            }
        }
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        this.A0E.A00(this);
    }

    public Dialog onCreateDialog(int i2) {
        int i3 = i2;
        if (i3 == 13) {
            C86144Rj r2 = this.A0F;
            if (r2 == null || r2.A04.isEmpty()) {
                Log.e("mediagallery/dialog/delete no messages");
                return super.onCreateDialog(i3);
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("mediagallery/dialog/delete/");
            A0r2.append(r2.A04.size());
            C13680ns.A1V(A0r2);
            HashSet hashSet = new HashSet(this.A0F.A04.values());
            C16440t3 r35 = this.A05;
            C14710pd r25 = this.A0C;
            C14870pt r20 = this.A05;
            C16320sq r19 = this.A05;
            C16490t9 r17 = this.A0X;
            C17250um r16 = this.A0B;
            C16760tb r15 = this.A09;
            C16000sG r10 = this.A0B;
            C18030w2 r14 = this.A0T;
            C16080sP r9 = this.A0D;
            AnonymousClass013 r8 = this.A01;
            C17240ul r7 = this.A0a;
            AnonymousClass15W r6 = this.A0b;
            C18040w3 r5 = this.A0Y;
            C15860rz r4 = this.A09;
            C16070sO r3 = this.A0N;
            AnonymousClass1L9 r22 = this.A0g;
            C15830rv r13 = this.A0c;
            IDxDListenerShape341S0100000_2_I1 iDxDListenerShape341S0100000_2_I1 = new IDxDListenerShape341S0100000_2_I1(this, 0);
            C99824ue r0 = new C99824ue(this);
            String A012 = AnonymousClass3BP.A01(this, r10, r9, r13, hashSet);
            C16320sq r31 = r19;
            HashSet hashSet2 = hashSet;
            return AnonymousClass3BP.A00(this, r0, iDxDListenerShape341S0100000_2_I1, r20, r15, r10, r9, (AnonymousClass4E3) null, r35, r4, r8, r3, r14, r16, r25, r17, r5, r7, r6, r22, r31, A012, hashSet2, true);
        } else if (i3 != 19) {
            switch (i2) {
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    return C807745l.A00(this, this.A00, new IDxAListenerShape2S0201000_2_I0(this, this.A09, i3, 1), this.A0l, true);
                case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                    return C807745l.A00(this, this.A00, new IDxAListenerShape2S0201000_2_I0(this, this.A09, i3, 1), this.A0l, false);
                case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                    return C807745l.A00(this, this.A00, new IDxAListenerShape2S0201000_2_I0(this, this.A09, i3, 0), this.A0l, true);
                default:
                    return super.onCreateDialog(i3);
            }
        } else {
            return C807745l.A00(this, this.A00, new IDxAListenerShape2S0201000_2_I0(this, this.A09, 19, 0), this.A0l, false);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A0M = this.A0L.A09(this.A0c);
        if (this.A0L.A0P()) {
            SearchView searchView = new SearchView(this);
            C13680ns.A0v(this, C13680ns.A0M(searchView, R.id.search_src_text), R.color.color06bd);
            searchView.setQueryHint(getString(R.string.str14a4));
            searchView.A0B = new IDxTListenerShape171S0100000_2_I1(this, 5);
            boolean z2 = false;
            MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(AnonymousClass2SR.A02(this, R.drawable.ic_action_search_teal, R.color.color04ef));
            this.A04 = icon;
            icon.setActionView(searchView);
            this.A04.setShowAsAction(10);
            this.A04.setOnActionExpandListener(new IDxEListenerShape270S0100000_2_I1(this, 2));
            MenuItem menuItem = this.A04;
            if (this.A00 != this.A03) {
                z2 = true;
            }
            menuItem.setVisible(z2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1MF r0 = this.A0k;
        if (r0 != null) {
            r0.A03();
        }
        C86144Rj r02 = this.A0F;
        if (r02 != null) {
            r02.A00();
            this.A0F = null;
        }
        this.A05.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A0I, 1));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C86144Rj r0 = this.A0F;
        if (r0 != null) {
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator it = r0.A04.values().iterator();
            while (it.hasNext()) {
                A0u.add(C13680ns.A0V(it).A11);
            }
            AnonymousClass1yL.A0A(bundle, A0u);
        }
    }
}
