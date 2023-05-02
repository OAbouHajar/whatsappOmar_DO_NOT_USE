package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass05K;
import X.AnonymousClass11A;
import X.AnonymousClass124;
import X.AnonymousClass127;
import X.AnonymousClass13V;
import X.AnonymousClass15G;
import X.AnonymousClass15P;
import X.AnonymousClass15X;
import X.AnonymousClass15Z;
import X.AnonymousClass18O;
import X.AnonymousClass18R;
import X.AnonymousClass195;
import X.AnonymousClass1DY;
import X.AnonymousClass1L3;
import X.AnonymousClass1L4;
import X.AnonymousClass1VE;
import X.AnonymousClass28S;
import X.AnonymousClass2AG;
import X.AnonymousClass2AH;
import X.AnonymousClass2AM;
import X.AnonymousClass2AS;
import X.AnonymousClass2Ao;
import X.AnonymousClass2EA;
import X.AnonymousClass2O8;
import X.AnonymousClass2Rf;
import X.AnonymousClass2Us;
import X.AnonymousClass32Y;
import X.AnonymousClass3FR;
import X.AnonymousClass4D6;
import X.C001500q;
import X.C004601z;
import X.C005402i;
import X.C005502j;
import X.C006602z;
import X.C101234ww;
import X.C102474z0;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15450qv;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16220sf;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17190ug;
import X.C17200uh;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17270uo;
import X.C17780vd;
import X.C17800vf;
import X.C18050w4;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18550ws;
import X.C18560wt;
import X.C18570wu;
import X.C19490yW;
import X.C19780yz;
import X.C19950zG;
import X.C19980zJ;
import X.C19990zK;
import X.C20260zl;
import X.C217415g;
import X.C217915l;
import X.C218115n;
import X.C218315p;
import X.C23061Ai;
import X.C23071Aj;
import X.C25731Kx;
import X.C31091dS;
import X.C32241fu;
import X.C33501ig;
import X.C434920f;
import X.C45882Bm;
import X.C49132Rg;
import X.C50162Yf;
import X.C50172Yg;
import X.C50662aF;
import X.C50682aH;
import X.C50712aK;
import X.C50722aL;
import X.C54602hp;
import X.C57592rQ;
import X.C86224Rt;
import X.C95264mM;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.facebook.redex.IDxFactoryShape54S0200000_1_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxRListenerShape303S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.google.android.material.appbar.AppBarLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.util.Log;

public class CommunityHomeActivity extends C14530pL {
    public int A00;
    public long A01;
    public Menu A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public SearchView A08;
    public RecyclerView A09;
    public C25731Kx A0A;
    public C50662aF A0B;
    public C50162Yf A0C;
    public C50682aH A0D;
    public C50712aK A0E;
    public C50722aL A0F;
    public AnonymousClass15Z A0G;
    public TextEmojiLabel A0H;
    public C17150uc A0I;
    public AnonymousClass13V A0J;
    public AnonymousClass01Y A0K;
    public AnonymousClass127 A0L;
    public C17230uk A0M;
    public AnonymousClass1L3 A0N;
    public AnonymousClass2AS A0O;
    public AnonymousClass1L4 A0P;
    public C17160ud A0Q;
    public C16000sG A0R;
    public C17140ub A0S;
    public C16080sP A0T;
    public AnonymousClass2Ao A0U;
    public C17200uh A0V;
    public AnonymousClass2AG A0W;
    public C16980tz A0X;
    public C15810rt A0Y;
    public AnonymousClass11A A0Z;
    public C18560wt A0a;
    public C16070sO A0b;
    public AnonymousClass195 A0c;
    public C18550ws A0d;
    public C19780yz A0e;
    public C16010sH A0f;
    public AnonymousClass15G A0g;
    public AnonymousClass15X A0h;
    public C218115n A0i;
    public C20260zl A0j;
    public AnonymousClass2O8 A0k;
    public C17240ul A0l;
    public AnonymousClass18O A0m;
    public AnonymousClass18R A0n;
    public C17780vd A0o;
    public C217415g A0p;
    public AnonymousClass2AH A0q;
    public C217915l A0r;
    public C16050sL A0s;
    public C19990zK A0t;
    public C17190ug A0u;
    public AnonymousClass124 A0v;
    public C17800vf A0w;
    public C18090w8 A0x;
    public C18290wS A0y;
    public C218315p A0z;
    public AnonymousClass1DY A10;
    public C16220sf A11;
    public C18570wu A12;
    public C18050w4 A13;
    public AnonymousClass01D A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public final C33501ig A19;
    public final AnonymousClass28S A1A;
    public final C45882Bm A1B;

    public CommunityHomeActivity() {
        this(0);
        this.A1A = new IDxCListenerShape227S0100000_2_I0(this, 0);
        this.A1B = new AnonymousClass32Y(this);
        this.A19 = new IDxCObserverShape72S0100000_2_I0(this, 4);
    }

    public CommunityHomeActivity(int i2) {
        this.A16 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 37));
    }

    public static /* synthetic */ void A02(Bundle bundle, CommunityHomeActivity communityHomeActivity) {
        if (bundle.getInt("dialogAction") == 1) {
            C16050sL r1 = (C16050sL) bundle.getParcelable("parentGroupJid");
            AnonymousClass00B.A06(r1);
            C86224Rt A002 = communityHomeActivity.A0F.A00(communityHomeActivity, r1, 1);
            C16040sK r0 = communityHomeActivity.A01;
            r0.A0B();
            A002.A00(r0.A05);
        }
    }

    public void A1q() {
        if (!this.A16) {
            this.A16 = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A0t = (C19990zK) r2.AEZ.get();
            this.A0X = (C16980tz) r2.AQB.get();
            this.A0Y = (C15810rt) r2.A43.get();
            this.A0v = (AnonymousClass124) r2.ALe.get();
            this.A0j = r1.A0I();
            this.A0V = (C17200uh) r2.A52.get();
            this.A0d = (C18550ws) r2.ADB.get();
            this.A0u = (C17190ug) r2.AEu.get();
            this.A0z = (C218315p) r2.AIL.get();
            this.A0R = (C16000sG) r2.A4x.get();
            this.A0Q = (C17160ud) r2.A4t.get();
            this.A0A = (C25731Kx) r2.A54.get();
            this.A0a = (C18560wt) r2.A5j.get();
            this.A0T = (C16080sP) r2.AQ9.get();
            this.A10 = (AnonymousClass1DY) r2.A3w.get();
            this.A0y = (C18290wS) r2.AIB.get();
            this.A0K = (AnonymousClass01Y) r2.A1w.get();
            this.A0S = (C17140ub) r2.A4y.get();
            this.A0l = (C17240ul) r2.ABK.get();
            this.A0o = C16150sX.A0p(r2);
            this.A0e = (C19780yz) r2.ADI.get();
            this.A0w = C16150sX.A0x(r2);
            this.A0r = (C217915l) r2.AOG.get();
            this.A12 = r2.A1d();
            this.A11 = (C16220sf) r2.A3y.get();
            this.A0L = (AnonymousClass127) r2.A3z.get();
            this.A0N = (AnonymousClass1L3) r2.A4N.get();
            this.A0i = (C218115n) r2.AH2.get();
            this.A0g = (AnonymousClass15G) r2.AEe.get();
            this.A0h = (AnonymousClass15X) r2.AMk.get();
            this.A13 = C16150sX.A19(r2);
            this.A0M = (C17230uk) r2.A4I.get();
            this.A0P = (AnonymousClass1L4) r2.A4K.get();
            this.A0c = (AnonymousClass195) r2.ACz.get();
            this.A0p = (C217415g) r2.AGv.get();
            this.A0Z = (AnonymousClass11A) r2.A5U.get();
            this.A0x = (C18090w8) r2.AI6.get();
            this.A0I = (C17150uc) r2.A34.get();
            this.A0J = (AnonymousClass13V) r2.A35.get();
            this.A0m = (AnonymousClass18O) r2.ABN.get();
            this.A0b = (C16070sO) r2.ABY.get();
            this.A0G = (AnonymousClass15Z) r2.AOg.get();
            this.A0B = (C50662aF) r1.A0X.get();
            this.A0n = (AnonymousClass18R) r2.ABZ.get();
            this.A14 = C17270uo.A00(r1.A0E);
            this.A0C = (C50162Yf) r1.A0Z.get();
            this.A0D = (C50682aH) r1.A0d.get();
            this.A0E = (C50712aK) r1.A0e.get();
            this.A0F = (C50722aL) r1.A0h.get();
        }
    }

    public int A1r() {
        return 579544921;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = true;
        A1s.A00 = 9;
        A1s.A04 = true;
        return A1s;
    }

    public final void A35(int i2) {
        this.A00 = i2;
        if (this.A17) {
            this.A06.setText(R.string.str04f3);
            return;
        }
        this.A06.setText(getResources().getQuantityString(R.plurals.plurals00fe, i2, new Object[]{Integer.valueOf(i2)}));
    }

    public final void A36(Runnable runnable, int i2, int i3) {
        C32241fu r2 = new C32241fu(this);
        if (i2 != -1) {
            r2.A02(i2);
        }
        r2.A01(i3);
        r2.setPositiveButton(R.string.str03fd, new IDxCListenerShape127S0100000_2_I0(runnable, 43));
        r2.setNegativeButton(R.string.str03fc, (DialogInterface.OnClickListener) null);
        r2.A00();
    }

    public final void A37(String str) {
        if (!(!this.A0E) && !this.A18) {
            Intent A022 = C14750ph.A02(this);
            A022.putExtra("snackbar_message", str);
            A022.setFlags(67108864);
            startActivity(A022);
            this.A18 = true;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 123) {
            super.onActivityResult(i2, i3, intent);
        } else if (intent != null && i3 == -1 && this.A0k.A01(true) && this.A0f != null) {
            String stringExtra = intent.getStringExtra("extra_community_name");
            if (stringExtra != null && this.A0k.A00(stringExtra)) {
                AnonymousClass2AS r2 = this.A0O;
                C16050sL r5 = this.A0s;
                r2.A07 = stringExtra;
                r2.A0q.A09(Boolean.TRUE);
                r2.A0e.A06(new AnonymousClass2Us(r2, r2.A0W, r2.A0Z, r5, r2.A07));
            }
            String stringExtra2 = intent.getStringExtra("extra_community_description");
            if (stringExtra2 != null) {
                AnonymousClass2AS r4 = this.A0O;
                C16010sH r3 = this.A0f;
                r4.A06 = stringExtra2;
                r4.A0p.A09(Boolean.TRUE);
                r4.A0z.Acl(new RunnableRunnableShape4S0200000_I0_2(r4, 12, r3));
            }
        }
    }

    public void onBackPressed() {
        if (((Boolean) this.A0O.A02.A03.A01()).booleanValue()) {
            C101234ww r2 = this.A0O.A02;
            r2.A03.A0B(false);
            r2.A01.accept(Integer.valueOf(r2.A00));
            r2.A04.run();
        } else if (this.A15) {
            Intent A022 = C14750ph.A02(this);
            A022.setFlags(67108864);
            startActivity(A022);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Drawable navigationIcon;
        this.A01 = SystemClock.uptimeMillis();
        super.onCreate(bundle);
        AKw("render_community_home");
        this.A0U = this.A0V.A04(this, "community-home");
        setContentView((int) R.layout.layout003d);
        C16050sL A052 = C16050sL.A05(getIntent().getStringExtra("parent_group_jid"));
        AnonymousClass00B.A06(A052);
        this.A0s = A052;
        this.A05.Acl(new RunnableRunnableShape5S0100000_I0_4((Object) this, 34));
        C16010sH A082 = this.A0R.A08(this.A0s);
        this.A0f = A082;
        if (A082 == null || this.A0Y.A0I(this.A0s)) {
            A37(getString(R.string.str04fa));
            return;
        }
        this.A0p.A02(this.A1B);
        this.A05 = (ImageView) AnonymousClass00T.A05(this, R.id.communityPhoto);
        this.A0H = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.communityName);
        this.A06 = (TextView) AnonymousClass00T.A05(this, R.id.communityStatus);
        this.A04 = AnonymousClass00T.A05(this, R.id.change_subject_and_desription_progress);
        this.A03 = AnonymousClass00T.A05(this, R.id.headerView);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        Aem(toolbar);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0Q(false);
        if (!C434920f.A09(this) && (navigationIcon = toolbar.getNavigationIcon()) != null) {
            navigationIcon.setColorFilter(getResources().getColor(R.color.color01bd), PorterDuff.Mode.SRC_ATOP);
            toolbar.setNavigationIcon(navigationIcon);
        }
        AppBarLayout appBarLayout = (AppBarLayout) AnonymousClass00T.A05(this, R.id.app_bar);
        C005402i x3 = x();
        AnonymousClass013 r12 = this.A01;
        ImageView imageView = this.A05;
        TextEmojiLabel textEmojiLabel = this.A0H;
        TextView textView = this.A06;
        View view = new View(this);
        if (x3.A03() == null) {
            x3.A0H(view, new AnonymousClass05K(-1, -1));
        }
        x3.A0O(true);
        View A032 = x3.A03();
        AnonymousClass00B.A04(A032);
        AnonymousClass1VE r7 = new AnonymousClass1VE(A032, imageView, textEmojiLabel, textView, r12);
        appBarLayout.setExpanded(true);
        appBarLayout.A01(r7);
        SearchView searchView = (SearchView) AnonymousClass00T.A05(this, R.id.search_view);
        this.A08 = searchView;
        TextView textView2 = (TextView) C004601z.A0E(searchView, R.id.search_src_text);
        this.A07 = textView2;
        textView2.setTextColor(AnonymousClass00T.A00(this, R.color.color06bd));
        View findViewById = findViewById(R.id.search_edit_frame);
        if (findViewById != null) {
            removeSearchEditFrameExtraMargin(findViewById);
        }
        this.A08.setQueryHint(getString(R.string.str14a4));
        this.A08.setIconifiedByDefault(false);
        this.A08.A0B = new IDxTListenerShape170S0100000_2_I0(this, 4);
        C50172Yg r4 = new C50172Yg();
        r4.A00 = 10;
        r4.A01 = true;
        AnonymousClass2AS r0 = (AnonymousClass2AS) new C006602z((AnonymousClass04o) new C95264mM(this.A0C, r4, this.A0s), (C001500q) this).A01(AnonymousClass2AS.class);
        this.A0O = r0;
        r0.A0D.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 116));
        this.A0O.A0B.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 114));
        this.A0O.A0n.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 111));
        AGM().A0f(new IDxRListenerShape303S0100000_2_I0(this, 0), this, "NewCommunityAdminBottomSheetFragment");
        AnonymousClass2AM r3 = (AnonymousClass2AM) new C006602z((AnonymousClass04o) new IDxFactoryShape54S0200000_1_I0(this.A0f, 1, this.A0B), (C001500q) this).A01(AnonymousClass2AM.class);
        if (bundle != null) {
            this.A17 = Boolean.TRUE.equals(r3.A05.A01());
        }
        r3.A05.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 107));
        AnonymousClass18O r02 = this.A0m;
        r02.A00.add(this.A1A);
        C16050sL r5 = this.A0s;
        AnonymousClass3FR A002 = this.A0E.A00(this, (Runnable) null, (Runnable) null);
        C50682aH r72 = this.A0D;
        C54602hp r32 = new C54602hp(this);
        AnonymousClass2Ao r1 = this.A0U;
        C54602hp r11 = r32;
        AnonymousClass2Ao r122 = r1;
        this.A0q = r72.A00(new ViewOnClickCListenerShape9S0100000_I0_2(this, 2), this, this, r11, r122, A002, new C102474z0(), this.A0O, r5, 3);
        this.A09 = (RecyclerView) AnonymousClass00T.A05(this, R.id.subgroup_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.A1P(1);
        this.A09.setLayoutManager(linearLayoutManager);
        this.A09.setAdapter(this.A0q);
        this.A09.setItemAnimator((C005502j) null);
        RecyclerView recyclerView = this.A09;
        recyclerView.A0m(new C57592rQ(this, recyclerView, this.A0q, (AnonymousClass4D6) null));
        this.A0O.A0r.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 115));
        AnonymousClass2AH r13 = this.A0q;
        C17140ub r10 = this.A0S;
        AnonymousClass2AG r73 = new AnonymousClass2AG(this.A0J, this.A0L, r10, this.A0Z, this.A0n, r13);
        this.A0W = r73;
        r73.A00();
        this.A0Z.A02(this.A19);
        this.A0O.A0y.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 118));
        this.A0O.A0x.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 117));
        this.A0O.A0v.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 112));
        this.A0O.A0A.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 34));
        this.A0O.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 113));
        this.A0O.A09.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 110));
        this.A0O.A0L.A0A.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 109));
        this.A0O.A02.A03.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, (int) AnonymousClass2EA.A03));
        this.A05.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 4));
        C16050sL r2 = this.A0s;
        C14870pt r74 = this.A05;
        AnonymousClass124 r14 = this.A0v;
        C15900s5 r8 = this.A06;
        AnonymousClass013 r123 = this.A01;
        C16080sP r112 = this.A0T;
        this.A0k = new AnonymousClass2O8((View) null, this, r74, r8, this.A07, this.A0R, r112, r123, this.A0Z, this.A0b, this.A0l, this.A0o, r2, r14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3.A0b.A0A(r3.A0s) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r3.A02 = r4
            boolean r0 = r3.A17
            if (r0 != 0) goto L_0x0029
            X.0uk r0 = r3.A0M
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0019
            X.0sO r1 = r3.A0b
            X.0sL r0 = r3.A0s
            boolean r0 = r1.A0A(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131623945(0x7f0e0009, float:1.8875056E38)
            if (r2 == 0) goto L_0x0026
            r0 = 2131623944(0x7f0e0008, float:1.8875054E38)
        L_0x0026:
            r1.inflate(r0, r4)
        L_0x0029:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.community.CommunityHomeActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        AnonymousClass2AG r0 = this.A0W;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass2Ao r02 = this.A0U;
        if (r02 != null) {
            r02.A00();
        }
        AnonymousClass18O r03 = this.A0m;
        if (r03 != null) {
            r03.A00.remove(this.A1A);
        }
        C217415g r1 = this.A0p;
        if (r1 != null) {
            r1.A03(this.A1B);
        }
        AnonymousClass11A r12 = this.A0Z;
        if (r12 != null) {
            r12.A03(this.A19);
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_manage_groups) {
            startActivity(C14750ph.A0O(this, this.A0s));
            return true;
        } else if (menuItem.getItemId() == R.id.menu_edit_community) {
            C16050sL r3 = this.A0s;
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.community.EditCommunityActivity");
            intent.putExtra("extra_community_jid", C16030sJ.A03(r3));
            startActivityForResult(intent, 123);
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == R.id.menu_view_members) {
            C16050sL r32 = this.A0s;
            Intent intent2 = new Intent();
            intent2.setClassName(getPackageName(), "com.obwhatsapp.community.CommunityMembersActivity");
            intent2.putExtra("extra_community_jid", C16030sJ.A03(r32));
            this.A00.A08(this, intent2, "communityHome");
            return true;
        } else {
            super.onOptionsItemSelected(menuItem);
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0Y.A0I(this.A0s)) {
            A37(getString(R.string.str04fa));
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A01 > 0) {
            AKv("render_community_home");
            AL0(2);
            this.A13.A00(9, SystemClock.uptimeMillis() - this.A01);
            this.A01 = 0;
        }
    }

    public void onStop() {
        this.A15 = true;
        AnonymousClass2AS r3 = this.A0O;
        StringBuilder sb = new StringBuilder("CommunitySubgroupsViewModel/updateActivitySeen: ");
        sb.append(r3);
        Log.i(sb.toString());
        r3.A0s.execute(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 46));
        super.onStop();
    }

    public final void removeSearchEditFrameExtraMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = 0;
            if (C15450qv.A00()) {
                marginLayoutParams.setMarginStart(0);
            }
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        AnonymousClass00B.A08("Unexpected LayoutParams for search edit frame. Margins not updated.");
    }
}
