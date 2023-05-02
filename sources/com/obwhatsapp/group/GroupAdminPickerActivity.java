package com.obwhatsapp.group;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.AnonymousClass11J;
import X.AnonymousClass127;
import X.AnonymousClass15P;
import X.AnonymousClass18O;
import X.AnonymousClass18R;
import X.AnonymousClass1BX;
import X.AnonymousClass1VD;
import X.AnonymousClass267;
import X.AnonymousClass28S;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.AnonymousClass2r5;
import X.AnonymousClass36L;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17140ub;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C25781Lc;
import X.C30361cE;
import X.C30661ck;
import X.C33481ie;
import X.C40661uU;
import X.C40781ug;
import X.C447725m;
import X.C49132Rg;
import X.C67473bf;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.facebook.redex.IDxIDrawableShape11S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupAdminPickerActivity extends C14530pL {
    public ColorDrawable A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public SearchView A05;
    public BottomSheetBehavior A06;
    public AnonymousClass127 A07;
    public C16000sG A08;
    public C17140ub A09;
    public C16080sP A0A;
    public AnonymousClass2Ao A0B;
    public C17200uh A0C;
    public AnonymousClass013 A0D;
    public AnonymousClass11J A0E;
    public C16070sO A0F;
    public AnonymousClass1BX A0G;
    public AnonymousClass36L A0H;
    public AnonymousClass2r5 A0I;
    public AnonymousClass18O A0J;
    public AnonymousClass18R A0K;
    public C16050sL A0L;
    public C25781Lc A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public List A0R;
    public boolean A0S;
    public final View.OnClickListener A0T;
    public final C40781ug A0U;
    public final C33481ie A0V;
    public final AnonymousClass28S A0W;
    public final AnonymousClass1VD A0X;

    public GroupAdminPickerActivity() {
        this(0);
        this.A0V = new IDxCObserverShape66S0100000_1_I0(this, 5);
        this.A0U = new IDxSObserverShape63S0100000_2_I0(this, 16);
        this.A0X = new IDxPObserverShape81S0100000_2_I0(this, 18);
        this.A0W = new IDxCListenerShape227S0100000_2_I0(this, 5);
        this.A0T = new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 7);
    }

    public GroupAdminPickerActivity(int i2) {
        this.A0S = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 51));
    }

    public static /* synthetic */ boolean A02(GroupAdminPickerActivity groupAdminPickerActivity, UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        for (C16010sH A082 : groupAdminPickerActivity.A0R) {
            if (userJid.equals(A082.A08(UserJid.class))) {
                return true;
            }
        }
        return false;
    }

    public void A1q() {
        if (!this.A0S) {
            this.A0S = true;
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
            this.A0C = (C17200uh) r1.A52.get();
            this.A08 = (C16000sG) r1.A4x.get();
            this.A0A = (C16080sP) r1.AQ9.get();
            this.A0D = (AnonymousClass013) r1.AR8.get();
            this.A09 = (C17140ub) r1.A4y.get();
            this.A0M = new C25781Lc();
            this.A07 = (AnonymousClass127) r1.A3z.get();
            this.A0G = (AnonymousClass1BX) r1.AO2.get();
            this.A0J = (AnonymousClass18O) r1.ABN.get();
            this.A0F = (C16070sO) r1.ABY.get();
            this.A0E = (AnonymousClass11J) r1.ABX.get();
            this.A0K = (AnonymousClass18R) r1.ABZ.get();
        }
    }

    public final void A35() {
        this.A02.setPadding(0, getResources().getDimensionPixelSize(R.dimen.dimen0065), 0, 0);
        ((AnonymousClass0Bo) this.A02.getLayoutParams()).A01(this.A06);
        this.A00.setColor(2130706432);
        this.A04.setVisibility(0);
        this.A03.setVisibility(8);
        A38((String) null);
    }

    public final void A36() {
        this.A02.setPadding(0, 0, 0, 0);
        ((AnonymousClass0Bo) this.A02.getLayoutParams()).A01((AnonymousClass06y) null);
        this.A00.setColor(AnonymousClass00T.A00(this, R.color.color0477));
        this.A05.setIconified(false);
        this.A04.setVisibility(8);
        this.A03.setVisibility(0);
    }

    public final void A37() {
        C30361cE A042;
        if (this.A0Q == null || this.A0O == null) {
            C16070sO r0 = this.A0F;
            C16050sL r1 = this.A0L;
            AnonymousClass00B.A06(r1);
            A042 = r0.A07.A04(r1);
        } else {
            AnonymousClass1BX r02 = this.A0G;
            A042 = (C30361cE) r02.A03.get(this.A0L);
        }
        this.A0R = new ArrayList(A042.A04.size());
        Iterator it = A042.A0C().iterator();
        while (it.hasNext()) {
            C16040sK r03 = this.A01;
            UserJid userJid = ((C30661ck) it.next()).A03;
            if (!r03.A0I(userJid)) {
                this.A0R.add(this.A08.A0A(userJid));
            }
        }
    }

    public final void A38(String str) {
        String str2 = str;
        this.A0N = str;
        AnonymousClass36L r1 = this.A0H;
        if (r1 != null) {
            r1.A06(true);
        }
        AnonymousClass36L r2 = new AnonymousClass36L(this.A0A, this.A0D, this, str2, this.A0R);
        this.A0H = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    public void onBackPressed() {
        if (this.A03.getVisibility() == 0) {
            A35();
        } else {
            this.A06.A0M(4);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02c7);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
        }
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A02 = findViewById;
        this.A06 = BottomSheetBehavior.A00(findViewById);
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 15));
        this.A01 = findViewById(R.id.background);
        PointF pointF = new PointF();
        this.A01.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 28, pointF));
        this.A01.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(pointF, 7));
        ColorDrawable colorDrawable = new ColorDrawable(2130706432);
        this.A00 = colorDrawable;
        this.A01.setBackground(colorDrawable);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) getResources().getInteger(17694720));
        this.A01.startAnimation(alphaAnimation);
        int A002 = AnonymousClass00T.A00(this, R.color.color064b);
        this.A06.A0E = new C67473bf(this, A002);
        this.A04 = findViewById(R.id.title_holder);
        View findViewById2 = findViewById(R.id.search_holder);
        this.A03 = findViewById2;
        AnonymousClass267.A00(findViewById2);
        SearchView searchView = (SearchView) this.A03.findViewById(R.id.search_view);
        this.A05 = searchView;
        ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(AnonymousClass00T.A00(this, R.color.color06bd));
        this.A05.setIconifiedByDefault(false);
        this.A05.setQueryHint(getString(R.string.str14c7));
        ((ImageView) this.A05.findViewById(R.id.search_mag_icon)).setImageDrawable(new IDxIDrawableShape11S0100000_2_I0(AnonymousClass00T.A04(this, R.drawable.ic_back), this, 2));
        this.A05.A0B = new IDxTListenerShape170S0100000_2_I0(this, 8);
        ImageView imageView = (ImageView) this.A03.findViewById(R.id.search_back);
        imageView.setImageDrawable(new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_back, R.color.color04ef), this.A0D));
        imageView.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 44));
        findViewById(R.id.search_btn).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 8));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.A0B = this.A0C.A04(this, "group-admin-picker-activity");
        C16050sL A052 = C16050sL.A05(getIntent().getStringExtra("gid"));
        AnonymousClass00B.A06(A052);
        this.A0L = A052;
        this.A0Q = getIntent().getStringExtra("subgroup_subject");
        this.A0P = getIntent().getStringExtra("subgroup_request_message");
        this.A0O = getIntent().getStringExtra("parent_group_jid");
        A37();
        AnonymousClass2r5 r1 = new AnonymousClass2r5(this);
        this.A0I = r1;
        r1.A01 = this.A0R;
        r1.A00 = C40661uU.A02(r1.A02.A0D, (String) null);
        r1.A01();
        recyclerView.setAdapter(this.A0I);
        this.A09.A02(this.A0V);
        this.A07.A02(this.A0U);
        AnonymousClass18O r0 = this.A0J;
        r0.A00.add(this.A0W);
        this.A0K.A02(this.A0X);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.A03(this.A0V);
        this.A07.A03(this.A0U);
        AnonymousClass18O r0 = this.A0J;
        r0.A00.remove(this.A0W);
        this.A0K.A03(this.A0X);
        this.A0B.A00();
        AnonymousClass1BX r02 = this.A0G;
        r02.A03.remove(this.A0L);
        AnonymousClass36L r1 = this.A0H;
        if (r1 != null) {
            r1.A06(true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A36();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean z2 = false;
        if (this.A03.getVisibility() == 0) {
            z2 = true;
        }
        bundle.putBoolean("search", z2);
    }
}
