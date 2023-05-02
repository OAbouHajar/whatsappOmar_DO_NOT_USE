package com.obwhatsapp.search;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass027;
import X.AnonymousClass02C;
import X.AnonymousClass04o;
import X.AnonymousClass05M;
import X.AnonymousClass071;
import X.AnonymousClass10G;
import X.AnonymousClass10Y;
import X.AnonymousClass119;
import X.AnonymousClass11A;
import X.AnonymousClass11K;
import X.AnonymousClass120;
import X.AnonymousClass127;
import X.AnonymousClass13V;
import X.AnonymousClass15G;
import X.AnonymousClass15V;
import X.AnonymousClass15X;
import X.AnonymousClass15Z;
import X.AnonymousClass16O;
import X.AnonymousClass17R;
import X.AnonymousClass18R;
import X.AnonymousClass195;
import X.AnonymousClass1B5;
import X.AnonymousClass1P7;
import X.AnonymousClass1PD;
import X.AnonymousClass1QZ;
import X.AnonymousClass1VD;
import X.AnonymousClass267;
import X.AnonymousClass2AU;
import X.AnonymousClass2Ao;
import X.AnonymousClass2J7;
import X.AnonymousClass2J8;
import X.AnonymousClass2JF;
import X.AnonymousClass2SR;
import X.AnonymousClass2UX;
import X.AnonymousClass2UZ;
import X.AnonymousClass2Ud;
import X.AnonymousClass3RG;
import X.AnonymousClass47T;
import X.AnonymousClass4D6;
import X.AnonymousClass4F6;
import X.C001000l;
import X.C001300o;
import X.C001500q;
import X.C004601z;
import X.C005502j;
import X.C006602z;
import X.C009604p;
import X.C016007q;
import X.C14660pY;
import X.C14710pd;
import X.C14770pj;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16220sf;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16500tA;
import X.C16620tM;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17190ug;
import X.C17200uh;
import X.C17210ui;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17650vQ;
import X.C17760vb;
import X.C18090w8;
import X.C18290wS;
import X.C18560wt;
import X.C18910xS;
import X.C18930xU;
import X.C19230xz;
import X.C19430yQ;
import X.C19580yf;
import X.C19610yi;
import X.C19740yv;
import X.C19780yz;
import X.C19820z3;
import X.C19980zJ;
import X.C19990zK;
import X.C20260zl;
import X.C216114t;
import X.C218315p;
import X.C23101Am;
import X.C25681Ks;
import X.C25691Kt;
import X.C25721Kw;
import X.C25731Kx;
import X.C25781Lc;
import X.C26081Mg;
import X.C30621cg;
import X.C31131dW;
import X.C32291fz;
import X.C33481ie;
import X.C33501ig;
import X.C34661kf;
import X.C40781ug;
import X.C43331zp;
import X.C434920f;
import X.C439822h;
import X.C447725m;
import X.C45782Ay;
import X.C57582rP;
import X.C57592rQ;
import X.C82284Cf;
import X.C87594Xo;
import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.text.InputFilter;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxBConsumerShape434S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape243S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape0S0200000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape34S0200000_1_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.BidiToolbar;
import com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.IDxPObserverShape57S0100000_2_I0;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.search.views.ProgressView;
import com.obwhatsapp.search.views.TokenizedSearchInput;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import com.obwhatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Hilt_SearchFragment implements C34661kf {
    public ValueAnimator A00;
    public View A01;
    public ViewGroup A02;
    public RecyclerView A03;
    public C32291fz A04;
    public C23101Am A05;
    public C19980zJ A06;
    public BidiToolbar A07;
    public C25731Kx A08;
    public C16300so A09;
    public AnonymousClass2J7 A0A;
    public C82284Cf A0B;
    public C14870pt A0C;
    public C16040sK A0D;
    public C15900s5 A0E;
    public AnonymousClass15Z A0F;
    public C16760tb A0G;
    public C19740yv A0H;
    public C17150uc A0I;
    public AnonymousClass13V A0J;
    public AnonymousClass16O A0K;
    public AnonymousClass01Y A0L;
    public C17210ui A0M;
    public C17650vQ A0N;
    public AnonymousClass127 A0O;
    public C17760vb A0P;
    public C17230uk A0Q;
    public C18930xU A0R;
    public C17160ud A0S;
    public C16000sG A0T;
    public C17140ub A0U;
    public C16080sP A0V;
    public AnonymousClass120 A0W;
    public AnonymousClass2Ao A0X;
    public C17200uh A0Y;
    public C19230xz A0Z;
    public AnonymousClass10Y A0a;
    public C15800rs A0b;
    public AnonymousClass1B5 A0c;
    public C19610yi A0d;
    public AnonymousClass2JF A0e;
    public AnonymousClass01V A0f;
    public C16440t3 A0g;
    public C16980tz A0h;
    public C16260sj A0i;
    public C15860rz A0j;
    public AnonymousClass013 A0k;
    public C19820z3 A0l;
    public C18910xS A0m;
    public C15810rt A0n;
    public C216114t A0o;
    public AnonymousClass11A A0p;
    public C18560wt A0q;
    public AnonymousClass17R A0r;
    public AnonymousClass11K A0s;
    public C16070sO A0t;
    public AnonymousClass195 A0u;
    public C19780yz A0v;
    public C26081Mg A0w;
    public AnonymousClass10G A0x;
    public AnonymousClass119 A0y;
    public AnonymousClass15G A0z;
    public AnonymousClass15X A10;
    public C19580yf A11;
    public C16500tA A12;
    public C17250um A13;
    public C14710pd A14;
    public C20260zl A15;
    public C16490t9 A16;
    public C17240ul A17;
    public AnonymousClass18R A18;
    public C15830rv A19;
    public C19430yQ A1A;
    public AnonymousClass1P7 A1B;
    public C19990zK A1C;
    public C17190ug A1D;
    public C14770pj A1E;
    public C18090w8 A1F;
    public C18290wS A1G;
    public C218315p A1H;
    public C17020u3 A1I;
    public IteratingPlayer A1J;
    public AnonymousClass2AU A1K;
    public SearchViewModel A1L;
    public ProgressView A1M;
    public TokenizedSearchInput A1N;
    public C16220sf A1O;
    public C25781Lc A1P;
    public AnonymousClass47T A1Q;
    public AnonymousClass15V A1R;
    public StatusesViewModel A1S;
    public AnonymousClass1PD A1T;
    public C25681Ks A1U;
    public C25691Kt A1V;
    public C25721Kw A1W;
    public C16320sq A1X;
    public C43331zp A1Y;
    public AnonymousClass1QZ A1Z;
    public AnonymousClass01D A1a;
    public Runnable A1b;
    public boolean A1c;
    public final AnonymousClass071 A1d = new IDxSListenerShape34S0100000_2_I0(this, 15);
    public final C439822h A1e = new IDxPObserverShape57S0100000_2_I0(this, 7);
    public final C40781ug A1f = new IDxSObserverShape63S0100000_2_I0(this, 21);
    public final C33481ie A1g = new IDxCObserverShape68S0100000_2_I0(this, 29);
    public final C33501ig A1h = new IDxCObserverShape72S0100000_2_I0(this, 15);
    public final AnonymousClass1VD A1i = new IDxPObserverShape81S0100000_2_I0(this, 23);

    public static SearchFragment A01(Integer num, Integer num2, int i2, int i3) {
        SearchFragment searchFragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("x", i2);
        bundle.putInt("y", i3);
        bundle.putInt("enter_duration_ms", num.intValue());
        bundle.putInt("exit_duration_ms", num2.intValue());
        searchFragment.A0T(bundle);
        return searchFragment;
    }

    public static /* synthetic */ void A02(C15830rv r4, SearchFragment searchFragment) {
        AnonymousClass2AU r3 = searchFragment.A1K;
        if (r3 != null) {
            int i2 = 0;
            while (true) {
                AnonymousClass2UX r1 = r3.A0t;
                if (i2 < r1.size()) {
                    if (r4.equals(((AnonymousClass2UZ) r1.get(i2)).A01)) {
                        r3.A02(i2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void A03(SearchFragment searchFragment) {
        if (searchFragment.A1L != null && searchFragment.A0u() != null) {
            searchFragment.A1L.A0Q(3);
            searchFragment.A01.setVisibility(8);
            int i2 = Build.VERSION.SDK_INT;
            BidiToolbar bidiToolbar = searchFragment.A07;
            if (i2 >= 21) {
                bidiToolbar.setElevation(searchFragment.A03().getDimension(R.dimen.dimen005d));
            } else {
                AnonymousClass267.A00(bidiToolbar);
            }
        }
    }

    public static /* synthetic */ void A04(SearchFragment searchFragment, Boolean bool) {
        View view;
        if (bool != null && bool.booleanValue() && (view = searchFragment.A0A) != null && (view.getParent() instanceof LinearLayout)) {
            ValueAnimator valueAnimator = searchFragment.A00;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                searchFragment.A00 = null;
            }
            SearchViewModel searchViewModel = searchFragment.A1L;
            if (searchViewModel != null) {
                searchViewModel.A0Q(2);
            }
            ((View) searchFragment.A0A.getParent()).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            searchFragment.A01.setVisibility(0);
            int i2 = Build.VERSION.SDK_INT;
            BidiToolbar bidiToolbar = searchFragment.A07;
            if (i2 >= 21) {
                bidiToolbar.setElevation(0.0f);
            } else {
                bidiToolbar.setBackgroundResource(0);
                searchFragment.A07.setBackgroundColor(AnonymousClass00T.A00(searchFragment.A0u(), R.color.color0580));
            }
            searchFragment.A02.forceLayout();
        }
    }

    public void A0l(Bundle bundle) {
        this.A0V = true;
        SearchViewModel searchViewModel = this.A1L;
        C001000l A0D2 = A0D();
        searchViewModel.A0G.A0A(A0D2, new IDxObserverShape115S0100000_2_I0((Object) searchViewModel, 259));
        searchViewModel.A0E.A0A(A0D2, new IDxObserverShape115S0100000_2_I0((Object) searchViewModel, 270));
        searchViewModel.A0D.A0A(A0D2, new IDxObserverShape115S0100000_2_I0((Object) searchViewModel, 260));
        searchViewModel.A05.A0A(A0D2, new IDxObserverShape115S0100000_2_I0((Object) searchViewModel, 274));
        searchViewModel.A04.A0A(A0D2, new IDxObserverShape115S0100000_2_I0((Object) searchViewModel, 267));
        searchViewModel.A06.A0A(A0D2, new IDxObserverShape115S0100000_2_I0((Object) searchViewModel, 271));
    }

    public boolean A0p(MenuItem menuItem) {
        if (!this.A0e.A03(menuItem, this, A0D())) {
            return false;
        }
        A1A();
        return true;
    }

    public void A0s(Bundle bundle) {
        this.A0r.A01(bundle);
    }

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        this.A0e.A02(i2);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        StringBuilder sb = new StringBuilder("SearchFragment/onCreateView ");
        sb.append(this);
        Log.i(sb.toString());
        try {
            C31131dW.A00(this.A0h.A00);
        } catch (IOException unused) {
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.layout051c, viewGroup, false);
        this.A02 = viewGroup2;
        this.A03 = (RecyclerView) viewGroup2.findViewById(R.id.result_list);
        this.A01 = this.A02.findViewById(R.id.divider);
        SearchViewModel searchViewModel = this.A1L;
        try {
            searchViewModel.A1D.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) searchViewModel.A14, 15));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("SearchViewModel/warmContacts/");
            sb2.append(searchViewModel.A1D);
            sb2.append("/");
            sb2.append(searchViewModel.A14);
            Log.e(sb2.toString(), e2);
        }
        if (!this.A1c) {
            if (this.A02 != null) {
                SearchViewModel searchViewModel2 = this.A1L;
                if (searchViewModel2 != null) {
                    searchViewModel2.A0Q(1);
                }
                this.A1b = this.A1X.Ad4(new RunnableRunnableShape14S0100000_I0_13((Object) this, 12), "SearchFragment/setupAnimation", 50);
                this.A02.addOnLayoutChangeListener(new IDxCListenerShape243S0100000_2_I0(this, 3));
            }
            this.A1c = true;
        }
        IteratingPlayer iteratingPlayer = new IteratingPlayer(this.A03, this.A0C);
        this.A1J = iteratingPlayer;
        this.A0K.A00(iteratingPlayer);
        this.A0K.A00(this.A1L);
        C16980tz r5 = this.A0h;
        AnonymousClass1QZ r4 = this.A1Z;
        C16000sG r3 = this.A0T;
        AnonymousClass013 r2 = this.A0k;
        C43331zp r13 = new C43331zp(r3, this.A0W, r5, r2, r4, C43331zp.A00(this.A1X));
        this.A1Y = r13;
        C16440t3 r35 = this.A0g;
        C14710pd r52 = this.A14;
        C001000l A0C2 = A0C();
        C19990zK r57 = this.A1C;
        C009604p r75 = this.A0K;
        AnonymousClass1PD r66 = this.A1T;
        C14870pt r74 = this.A0C;
        C16300so r73 = this.A09;
        C16320sq r67 = this.A1X;
        C16040sK r72 = this.A0D;
        C16980tz r36 = this.A0h;
        C15810rt r40 = this.A0n;
        C17250um r51 = this.A13;
        C15900s5 r71 = this.A0E;
        C20260zl r53 = this.A15;
        C19980zJ r70 = this.A06;
        AnonymousClass1P7 r56 = this.A1B;
        C218315p r60 = this.A1H;
        C17160ud r30 = this.A0S;
        C16000sG r31 = this.A0T;
        C25731Kx r69 = this.A08;
        C18560wt r42 = this.A0q;
        AnonymousClass01V r34 = this.A0f;
        C16080sP r32 = this.A0V;
        AnonymousClass013 r39 = this.A0k;
        C18290wS r59 = this.A1G;
        C26081Mg r46 = this.A0w;
        AnonymousClass01Y r27 = this.A0L;
        C17240ul r54 = this.A17;
        C19780yz r45 = this.A0v;
        C25781Lc r65 = this.A1P;
        C16220sf r64 = this.A1O;
        C16500tA r24 = this.A12;
        C16260sj r23 = this.A0i;
        AnonymousClass2Ao r22 = this.A0X;
        AnonymousClass15G r21 = this.A0z;
        AnonymousClass15X r20 = this.A10;
        C15860rz r19 = this.A0j;
        C17230uk r18 = this.A0Q;
        C18090w8 r15 = this.A1F;
        C17150uc r14 = this.A0I;
        C16070sO r12 = this.A0t;
        C17020u3 r9 = this.A1I;
        AnonymousClass15Z r8 = this.A0F;
        SearchViewModel searchViewModel3 = this.A1L;
        C19580yf r6 = this.A11;
        C216114t r55 = this.A0o;
        IteratingPlayer iteratingPlayer2 = this.A1J;
        C19430yQ r33 = this.A1A;
        C17210ui r25 = this.A0M;
        AnonymousClass2AU r152 = new AnonymousClass2AU(A0C2, r75, r70, r69, r73, this.A0B, r74, r72, r71, r8, r14, r27, r25, r18, r30, r31, r32, r22, r34, r35, r36, r23, r19, r39, r40, r55, r42, r12, this.A0u, r45, r46, r21, r20, r6, r24, r51, r52, r53, r54, r33, r56, r57, r15, r59, r60, r9, iteratingPlayer2, searchViewModel3, r64, r65, r66, r67, r13);
        this.A1K = r152;
        if (this.A14.A0E(C16620tM.A01, 1533)) {
            StatusesViewModel statusesViewModel = (StatusesViewModel) new C006602z((AnonymousClass04o) new AnonymousClass2J8(this.A0A, true), (C001500q) this).A01(StatusesViewModel.class);
            this.A1S = statusesViewModel;
            statusesViewModel.A00 = this;
            statusesViewModel.A05.A0A(A0H(), new IDxObserverShape34S0200000_1_I0(r152, 5, this));
            this.A0K.A00(this.A1S);
        }
        this.A03.A0m(new C57582rP(this.A1K, AnonymousClass00T.A00(A0u(), R.color.color01db), C87594Xo.A00(A0u(), 0.5f)));
        Context A022 = A02();
        SearchGridLayoutManager searchGridLayoutManager = new SearchGridLayoutManager(A022, this.A1K);
        RecyclerView recyclerView = this.A03;
        recyclerView.A0h = true;
        recyclerView.setLayoutManager(searchGridLayoutManager);
        this.A03.setAdapter(this.A1K);
        RecyclerView recyclerView2 = this.A03;
        IteratingPlayer iteratingPlayer3 = this.A1J;
        List list = recyclerView2.A0a;
        if (list == null) {
            list = new ArrayList();
            recyclerView2.A0a = list;
        }
        list.add(iteratingPlayer3);
        this.A03.A0m(new AnonymousClass3RG(this.A0k, A03().getDimensionPixelSize(R.dimen.dimen06ae)));
        RecyclerView recyclerView3 = this.A03;
        recyclerView3.A0m(new C57592rQ(A022, recyclerView3, this.A1K, (AnonymousClass4D6) null));
        this.A03.setItemAnimator((C005502j) null);
        C16440t3 r322 = this.A0g;
        C14870pt r47 = this.A0C;
        C16320sq r44 = this.A1X;
        C18910xS r332 = this.A0m;
        C18930xU r26 = this.A0R;
        C16000sG r462 = this.A0T;
        C17240ul r352 = this.A17;
        C16220sf r392 = this.A1O;
        AnonymousClass119 r1 = this.A0y;
        C25721Kw r242 = this.A1W;
        C30621cg r262 = new C30621cg(A022, r47, r26, r462, new IDxBConsumerShape434S0100000_2_I0(this, 1), r322, r332, r1, r352, r392, r242, r44);
        AnonymousClass02C r232 = this.A0H;
        C14710pd r222 = this.A14;
        AnonymousClass47T r212 = this.A1Q;
        C16040sK r202 = this.A0D;
        C15810rt r182 = this.A0n;
        AnonymousClass15V r17 = this.A1R;
        AnonymousClass013 r153 = this.A0k;
        C25781Lc r142 = this.A1P;
        C25681Ks r10 = this.A1U;
        C19740yv r92 = this.A0H;
        C25691Kt r82 = this.A1V;
        C19230xz r7 = this.A0Z;
        C14770pj r62 = this.A1E;
        C15860rz r58 = this.A0j;
        C15800rs r43 = this.A0b;
        C17150uc r37 = this.A0I;
        C25721Kw r432 = r242;
        this.A0e = new AnonymousClass2JF(A022, r232, r47, r202, this.A0G, r92, r37, r462, r7, this.A0a, r43, r262, r322, r58, r153, r332, r182, this.A0t, r222, this.A15, r352, r62, r392, r142, r212, r17, r10, r82, r432, r44, 1);
        this.A03.setOnCreateContextMenuListener(this);
        BidiToolbar bidiToolbar = (BidiToolbar) this.A02.findViewById(R.id.toolbar);
        this.A07 = bidiToolbar;
        bidiToolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A02(A022, R.drawable.ic_back, R.color.color06b3), this.A0k));
        this.A07.setNavigationContentDescription((int) R.string.str014a);
        this.A07.setNavigationOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 10));
        this.A07.setContentInsetStartWithNavigation(A03().getDimensionPixelSize(R.dimen.dimen06ba));
        TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A07.findViewById(R.id.search_input_layout);
        this.A1N = tokenizedSearchInput;
        C001300o A0H2 = A0H();
        tokenizedSearchInput.A0C = this.A1L;
        tokenizedSearchInput.A06 = A0H2;
        Chip chip = tokenizedSearchInput.A0R;
        chip.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5(tokenizedSearchInput, 11));
        Chip chip2 = tokenizedSearchInput.A0P;
        chip2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5(tokenizedSearchInput, 14));
        Chip chip3 = tokenizedSearchInput.A0Q;
        chip3.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5(tokenizedSearchInput, 15));
        AnonymousClass05M r0 = tokenizedSearchInput.A05;
        C004601z.A0j(chip, r0);
        C004601z.A0j(chip2, r0);
        C004601z.A0j(chip3, r0);
        SearchViewModel searchViewModel4 = tokenizedSearchInput.A0C;
        searchViewModel4.A05.A0A(A0H2, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 277));
        SearchViewModel searchViewModel5 = tokenizedSearchInput.A0C;
        searchViewModel5.A04.A0A(A0H2, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 279));
        SearchViewModel searchViewModel6 = tokenizedSearchInput.A0C;
        searchViewModel6.A0D.A0A(A0H2, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 278));
        SearchViewModel searchViewModel7 = tokenizedSearchInput.A0C;
        searchViewModel7.A0H.A0A(A0H2, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 275));
        SearchViewModel searchViewModel8 = tokenizedSearchInput.A0C;
        searchViewModel8.A06.A0A(A0H2, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 280));
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0U;
        finalBackspaceAwareEntry.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5(tokenizedSearchInput, 12));
        if (!tokenizedSearchInput.A0A.A0T()) {
            finalBackspaceAwareEntry.setSingleLine(true);
        }
        finalBackspaceAwareEntry.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1024)});
        AnonymousClass4F6 r16 = tokenizedSearchInput.A0E;
        List list2 = finalBackspaceAwareEntry.A01;
        if (list2 == null) {
            list2 = new ArrayList();
            finalBackspaceAwareEntry.A01 = list2;
        }
        list2.add(r16);
        IDxObserverShape115S0100000_2_I0 iDxObserverShape115S0100000_2_I0 = new IDxObserverShape115S0100000_2_I0((Object) finalBackspaceAwareEntry, 291);
        TokenizedSearchInput tokenizedSearchInput2 = r16.A00;
        SearchViewModel searchViewModel9 = tokenizedSearchInput2.A0C;
        if (searchViewModel9 != null) {
            searchViewModel9.A0D.A0A(tokenizedSearchInput2.A06, iDxObserverShape115S0100000_2_I0);
        }
        finalBackspaceAwareEntry.setOnFocusChangeListener(tokenizedSearchInput.A0N);
        finalBackspaceAwareEntry.setInputEnterAction(3);
        finalBackspaceAwareEntry.setOnEditorActionListener(tokenizedSearchInput.A04);
        finalBackspaceAwareEntry.setOnKeyListener(tokenizedSearchInput.A03);
        if (!tokenizedSearchInput.A0M) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(2, (Animator) null);
            layoutTransition.setDuration(100);
            ((ViewGroup) C004601z.A0E(tokenizedSearchInput, R.id.input_layout)).setLayoutTransition(layoutTransition);
        }
        tokenizedSearchInput.A0T.setOnClickListener(tokenizedSearchInput.A02);
        tokenizedSearchInput.A0G = Integer.valueOf(tokenizedSearchInput.A0C.A06());
        tokenizedSearchInput.A0B = tokenizedSearchInput.A0C.A09();
        tokenizedSearchInput.A0J = tokenizedSearchInput.A0C.A0D();
        tokenizedSearchInput.A0D = tokenizedSearchInput.A0C.A0C();
        tokenizedSearchInput.A0F();
        tokenizedSearchInput.A0E();
        UserJid userJid = tokenizedSearchInput.A0B;
        if (userJid != null) {
            chip2.setText(tokenizedSearchInput.A08.A08(tokenizedSearchInput.A07.A0A(userJid)));
        }
        tokenizedSearchInput.A0D();
        tokenizedSearchInput.A0C();
        AnonymousClass00B.A06(tokenizedSearchInput.A0C);
        tokenizedSearchInput.A09();
        tokenizedSearchInput.A0S.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5(tokenizedSearchInput, 13));
        SearchViewModel searchViewModel10 = tokenizedSearchInput.A0C;
        searchViewModel10.A0A.A0A(tokenizedSearchInput.A06, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 276));
        SearchViewModel searchViewModel11 = tokenizedSearchInput.A0C;
        searchViewModel11.A09.A0A(tokenizedSearchInput.A06, new IDxObserverShape115S0100000_2_I0((Object) tokenizedSearchInput, 281));
        this.A1M = (ProgressView) C004601z.A0E(this.A02, R.id.progress);
        this.A03.A0o(this.A1d);
        if (!this.A0N.A00()) {
            C434920f.A04(A0D(), R.color.color06b4);
        }
        return this.A02;
    }

    public void A12() {
        StringBuilder sb = new StringBuilder("SearchFragment/onDestroy ");
        sb.append(this);
        Log.i(sb.toString());
        if (this.A0g) {
            this.A0s.A03((C15830rv) null, getClass().getName());
        }
        this.A0U.A03(this.A1g);
        this.A0O.A03(this.A1f);
        this.A0p.A03(this.A1h);
        this.A0J.A03(this.A1e);
        this.A18.A03(this.A1i);
        super.A12();
    }

    public void A13() {
        StringBuilder sb = new StringBuilder("SearchFragment/onDestroyView ");
        sb.append(this);
        Log.i(sb.toString());
        Runnable runnable = this.A1b;
        if (runnable != null) {
            this.A1X.Ac3(runnable);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        A1A();
        TokenizedSearchInput tokenizedSearchInput = this.A1N;
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0U;
        AnonymousClass4F6 r1 = tokenizedSearchInput.A0E;
        List list = finalBackspaceAwareEntry.A01;
        if (list != null) {
            list.remove(r1);
        }
        finalBackspaceAwareEntry.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        finalBackspaceAwareEntry.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        finalBackspaceAwareEntry.setOnKeyListener((View.OnKeyListener) null);
        RecyclerView recyclerView = this.A03;
        IteratingPlayer iteratingPlayer = this.A1J;
        List list2 = recyclerView.A0a;
        if (list2 != null) {
            list2.remove(iteratingPlayer);
        }
        this.A03.A0p(this.A1d);
        this.A0K.A01(this.A1J);
        this.A0X.A00();
        this.A1Y.A06();
        this.A02 = null;
        super.A13();
    }

    public void A14() {
        StringBuilder sb = new StringBuilder("SearchFragment/onResume ");
        sb.append(this);
        Log.i(sb.toString());
        super.A14();
    }

    public void A15() {
        StringBuilder sb = new StringBuilder("SearchFragment/onStop ");
        sb.append(this);
        Log.i(sb.toString());
        super.A15();
    }

    public void A16(Context context) {
        super.A16(context);
        this.A0X = this.A0Y.A04(context.getApplicationContext(), "search-fragment");
    }

    public void A17(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SearchFragment/onCreate ");
        sb.append(this);
        Log.i(sb.toString());
        super.A17(bundle);
        boolean z2 = false;
        if (bundle != null) {
            z2 = true;
        }
        this.A1c = z2;
        C14660pY r3 = (C14660pY) A0C();
        if (r3 != null && !r3.isFinishing()) {
            this.A0r.A00(bundle);
            this.A0s.A02((C15830rv) null, getClass().getName());
            SearchViewModel AFn = r3.AFn(this.A0X);
            this.A1L = AFn;
            AFn.A0E.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 61));
            SearchViewModel searchViewModel = this.A1L;
            searchViewModel.A08.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 257));
            this.A1L.A0B.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 253));
            this.A0U.A02(this.A1g);
            this.A0O.A02(this.A1f);
            this.A0p.A02(this.A1h);
            this.A0J.A02(this.A1e);
            this.A18.A02(this.A1i);
            this.A1L.A03.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 249));
            this.A1L.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 246));
            SearchViewModel searchViewModel2 = this.A1L;
            searchViewModel2.A0Z.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 59));
            SearchViewModel searchViewModel3 = this.A1L;
            searchViewModel3.A0W.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 60));
            SearchViewModel searchViewModel4 = this.A1L;
            searchViewModel4.A0Q.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 57));
            SearchViewModel searchViewModel5 = this.A1L;
            searchViewModel5.A0S.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 58));
            SearchViewModel searchViewModel6 = this.A1L;
            searchViewModel6.A0R.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, (int) MotionEventCompat.ACTION_MASK));
            SearchViewModel searchViewModel7 = this.A1L;
            searchViewModel7.A0V.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 251));
            SearchViewModel searchViewModel8 = this.A1L;
            searchViewModel8.A05.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 250));
            SearchViewModel searchViewModel9 = this.A1L;
            searchViewModel9.A0D.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 252));
            SearchViewModel searchViewModel10 = this.A1L;
            searchViewModel10.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 256));
            SearchViewModel searchViewModel11 = this.A1L;
            searchViewModel11.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 245));
            SearchViewModel searchViewModel12 = this.A1L;
            searchViewModel12.A0T.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 254));
            SearchViewModel searchViewModel13 = this.A1L;
            searchViewModel13.A0X.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 248));
            SearchViewModel searchViewModel14 = this.A1L;
            searchViewModel14.A0Y.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 247));
        }
    }

    public final void A1A() {
        if (!this.A14.A0E(C16620tM.A02, 931) || !this.A0d.A0C()) {
            this.A0d.A06();
        }
    }

    public final void A1B() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A03.getLayoutManager();
        if (linearLayoutManager != null) {
            SearchViewModel searchViewModel = this.A1L;
            Integer valueOf = Integer.valueOf(linearLayoutManager.A18() + 6);
            AnonymousClass027 r1 = searchViewModel.A0F;
            if (!valueOf.equals(r1.A01())) {
                r1.A09(valueOf);
            }
            SearchViewModel searchViewModel2 = this.A1L;
            Integer valueOf2 = Integer.valueOf(linearLayoutManager.A1A());
            AnonymousClass027 r12 = searchViewModel2.A0G;
            if (!valueOf2.equals(r12.A01())) {
                r12.A09(valueOf2);
            }
        }
    }

    public final void A1C(Bundle bundle, Interpolator interpolator, Runnable runnable, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        if (this.A02 != null) {
            int i7 = bundle.getInt("x", 0);
            int i8 = bundle.getInt("y", 0);
            float hypot = (float) Math.hypot((double) (i4 - i2), (double) (i5 - i3));
            float f2 = 0.0f;
            if (!z2) {
                f2 = hypot;
                hypot = 0.0f;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A02, i7, i8, f2, hypot);
            createCircularReveal.setDuration((long) i6);
            createCircularReveal.setInterpolator(interpolator);
            createCircularReveal.addListener(new IDxLAdapterShape0S0200000_2_I0(runnable, 1, this));
            createCircularReveal.start();
        }
    }

    public final void A1D(Object obj) {
        View view;
        LinearLayout linearLayout;
        ValueAnimator valueAnimator;
        A1A();
        if (obj != null && !obj.equals(0) && !obj.equals("")) {
            Integer num = 2;
            if (num.equals(this.A1L.A03.A01()) && (view = this.A0A) != null && (linearLayout = (LinearLayout) view.getParent()) != null) {
                RunnableRunnableShape14S0100000_I0_13 runnableRunnableShape14S0100000_I0_13 = new RunnableRunnableShape14S0100000_I0_13((Object) this, 13);
                View view2 = (View) linearLayout.getParent();
                if (view2 != null) {
                    valueAnimator = AnonymousClass2Ud.A00(linearLayout, new RunnableRunnableShape0S0201000_I0(linearLayout, (Runnable) runnableRunnableShape14S0100000_I0_13), view2.getHeight());
                } else {
                    valueAnimator = null;
                }
                this.A00 = valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
        }
    }

    public final void A1E(Runnable runnable, int i2, int i3, int i4, int i5, boolean z2) {
        int i6;
        String str;
        Bundle bundle = this.A05;
        if (bundle != null) {
            boolean z3 = z2;
            if (z2) {
                i6 = 500;
                str = "enter_duration_ms";
            } else {
                i6 = 250;
                str = "exit_duration_ms";
            }
            int i7 = bundle.getInt(str, i6);
            C016007q r6 = new C016007q();
            Runnable runnable2 = runnable;
            if (Build.VERSION.SDK_INT >= 21) {
                A1C(bundle, r6, runnable2, i2, i3, i4, i5, i7, z3);
                return;
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                float f2 = -((float) viewGroup.getHeight());
                float f3 = 0.0f;
                if (!z2) {
                    f3 = f2;
                    f2 = 0.0f;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f2, f3);
                translateAnimation.setInterpolator(r6);
                translateAnimation.setDuration((long) i7);
                translateAnimation.setAnimationListener(new IDxLAdapterShape11S0200000_2_I0(runnable, 6, this));
                this.A02.startAnimation(translateAnimation);
            }
        }
    }

    public void AXj(C45782Ay r2) {
        StatusesViewModel statusesViewModel = this.A1S;
        if (statusesViewModel != null) {
            statusesViewModel.A09(r2);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.A0N.A00()) {
            C434920f.A04(A0D(), R.color.color06b4);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.A0e.A00(contextMenu, this.A19, true, true);
    }
}
