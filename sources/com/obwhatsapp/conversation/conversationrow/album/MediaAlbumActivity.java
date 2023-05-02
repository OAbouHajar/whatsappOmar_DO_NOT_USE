package com.obwhatsapp.conversation.conversationrow.album;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass04A;
import X.AnonymousClass0Bo;
import X.AnonymousClass0SB;
import X.AnonymousClass10C;
import X.AnonymousClass10X;
import X.AnonymousClass127;
import X.AnonymousClass15P;
import X.AnonymousClass18R;
import X.AnonymousClass1BU;
import X.AnonymousClass1LD;
import X.AnonymousClass1VD;
import X.AnonymousClass1YG;
import X.AnonymousClass1yR;
import X.AnonymousClass29I;
import X.AnonymousClass2Aa;
import X.AnonymousClass2DF;
import X.AnonymousClass2JH;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SQ;
import X.AnonymousClass2SX;
import X.AnonymousClass31X;
import X.AnonymousClass3B1;
import X.AnonymousClass3DB;
import X.AnonymousClass3DP;
import X.AnonymousClass3L2;
import X.AnonymousClass3QD;
import X.AnonymousClass47T;
import X.AnonymousClass5PQ;
import X.C004601z;
import X.C005402i;
import X.C102204yZ;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16030sJ;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16740tZ;
import X.C17020u3;
import X.C17030uP;
import X.C17140ub;
import X.C17250um;
import X.C17270uo;
import X.C18260wP;
import X.C18940xV;
import X.C19410yO;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C20260zl;
import X.C20270zm;
import X.C206711d;
import X.C23061Ai;
import X.C23071Aj;
import X.C23631Ct;
import X.C25761La;
import X.C31091dS;
import X.C33481ie;
import X.C35541m6;
import X.C40781ug;
import X.C434920f;
import X.C455529g;
import X.C49132Rg;
import X.C50212Yk;
import X.C50782aR;
import X.C57052q1;
import X.C95034ls;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape307S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.conversation.conversationrow.message.selection.IDxMCallbackShape71S0100000_1_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.gesture.VerticalSwipeDismissBehavior;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaAlbumActivity extends AnonymousClass1yR implements AnonymousClass1YG, AnonymousClass04A {
    public Bundle A00;
    public C50782aR A01;
    public AnonymousClass10X A02;
    public AnonymousClass127 A03;
    public C17140ub A04;
    public C17030uP A05;
    public AnonymousClass1LD A06;
    public AnonymousClass3L2 A07;
    public AnonymousClass2Aa A08;
    public AnonymousClass3DP A09;
    public C20270zm A0A;
    public AnonymousClass10C A0B;
    public C25761La A0C;
    public C19410yO A0D;
    public AnonymousClass2JH A0E;
    public C206711d A0F;
    public AnonymousClass29I A0G;
    public C20260zl A0H;
    public AnonymousClass18R A0I;
    public C17020u3 A0J;
    public AnonymousClass1BU A0K;
    public C23631Ct A0L;
    public AnonymousClass01D A0M;
    public boolean A0N;
    public final C40781ug A0O;
    public final C33481ie A0P;
    public final AnonymousClass5PQ A0Q;
    public final C18940xV A0R;
    public final AnonymousClass1VD A0S;
    public final HashSet A0T;
    public final HashSet A0U;

    public MediaAlbumActivity() {
        this(0);
        this.A0T = new HashSet();
        this.A0U = new HashSet();
        this.A0R = new IDxMObserverShape73S0100000_1_I0(this, 0);
        this.A0P = new IDxCObserverShape68S0100000_2_I0(this, 14);
        this.A0O = new IDxSObserverShape63S0100000_2_I0(this, 10);
        this.A0S = new IDxPObserverShape81S0100000_2_I0(this, 12);
        this.A0Q = new IDxRCallbackShape307S0100000_2_I0(this, 0);
    }

    public MediaAlbumActivity(int i2) {
        this.A0N = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 47));
    }

    public void A1q() {
        if (!this.A0N) {
            this.A0N = true;
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
            this.A00 = new AnonymousClass2SX();
            this.A02 = (AnonymousClass10X) r2.ALc.get();
            this.A0H = r1.A0I();
            this.A0F = (C206711d) r2.AKp.get();
            this.A0L = (C23631Ct) r2.ART.get();
            this.A04 = (C17140ub) r2.A4y.get();
            this.A03 = (AnonymousClass127) r2.A3z.get();
            this.A05 = (C17030uP) r2.APp.get();
            this.A0D = (C19410yO) r2.A4T.get();
            this.A0B = (AnonymousClass10C) r2.AN0.get();
            this.A0K = (AnonymousClass1BU) r2.ANA.get();
            this.A0J = (C17020u3) r2.AMG.get();
            this.A0I = (AnonymousClass18R) r2.ABZ.get();
            this.A0M = C17270uo.A00(r2.A5z);
            this.A0A = (C20270zm) r2.A5v.get();
            this.A06 = (AnonymousClass1LD) r2.A5V.get();
            this.A0C = (C25761La) r2.A5S.get();
            this.A01 = (C50782aR) r1.A0m.get();
        }
    }

    public int A1r() {
        return 78318969;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = false;
        return A1s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A36() {
        /*
            r12 = this;
            X.2Aa r0 = r12.A08
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d2
            X.2Aa r0 = r12.A08
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
            r10 = 0
            r11 = 0
            r2 = 0
        L_0x0017:
            boolean r0 = r3.hasNext()
            r9 = 1
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r3.next()
            X.0tZ r0 = (X.C16740tZ) r0
            byte r1 = r0.A10
            if (r1 != r9) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x0017
        L_0x002b:
            r0 = 3
            if (r1 != r0) goto L_0x0017
            int r11 = r11 + 1
            goto L_0x0017
        L_0x0031:
            X.2Aa r0 = r12.A08
            java.util.List r0 = r0.A00
            java.lang.Object r8 = r0.get(r10)
            X.0tZ r8 = (X.C16740tZ) r8
            if (r11 != 0) goto L_0x008f
            X.013 r5 = r12.A01
            r4 = 2131755250(0x7f1000f2, float:1.9141374E38)
            long r0 = (long) r2
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0049:
            r3[r10] = r2
            java.lang.String r4 = r5.A0J(r3, r4, r0)
        L_0x004f:
            long r2 = r8.A0I
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C42681yF.A00(r0, r2)
            if (r0 == 0) goto L_0x0084
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r1 = "  "
            r3.append(r1)
            r0 = 2131893310(0x7f121c3e, float:1.9421393E38)
            java.lang.String r0 = r12.getString(r0)
            r3.append(r0)
            r3.append(r1)
            X.013 r2 = r12.A01
            long r0 = r8.A0I
            java.lang.String r0 = X.C28961Zl.A09(r2, r0)
            r3.append(r0)
            java.lang.String r4 = r3.toString()
        L_0x0084:
            X.02i r0 = r12.x()
            X.AnonymousClass00B.A06(r0)
            r0.A0I(r4)
            return
        L_0x008f:
            if (r2 != 0) goto L_0x009e
            X.013 r5 = r12.A01
            r4 = 2131755253(0x7f1000f5, float:1.914138E38)
            long r0 = (long) r11
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x0049
        L_0x009e:
            r7 = 2131889775(0x7f120e6f, float:1.9414223E38)
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            X.013 r5 = r12.A01
            r4 = 2131755250(0x7f1000f2, float:1.9141374E38)
            long r0 = (long) r2
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r10] = r2
            java.lang.String r0 = r5.A0J(r3, r4, r0)
            r6[r10] = r0
            X.013 r5 = r12.A01
            r4 = 2131755253(0x7f1000f5, float:1.914138E38)
            long r2 = (long) r11
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r10] = r0
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            r6[r9] = r0
            java.lang.String r4 = r12.getString(r7, r6)
            goto L_0x004f
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity.A36():void");
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public AnonymousClass0SB APC(Bundle bundle, int i2) {
        return new AnonymousClass3QD(this, this.A00.A0N, getIntent().getLongArrayExtra("message_ids"));
    }

    public /* bridge */ /* synthetic */ void ASs(AnonymousClass0SB r4, Object obj) {
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            this.A08.A00(list);
            A36();
            ADA().getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 2));
            return;
        }
        finish();
    }

    public void ASy(AnonymousClass0SB r1) {
    }

    public void AVf(int i2) {
        AnonymousClass29I r1;
        super.AVf(i2);
        if (i2 == 0 && (r1 = this.A0G) != null) {
            r1.A00(false);
        }
    }

    public boolean AWw() {
        if (this.A00.A01 != null) {
            return false;
        }
        Log.i("starred/selectionrequested");
        this.A08.notifyDataSetChanged();
        this.A00.A01 = AgA(this.A09);
        return true;
    }

    public void finishAfterTransition() {
        if (getIntent().hasExtra("start_index")) {
            A0i(new C57052q1(this));
        }
        super.finishAfterTransition();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 2 && i3 == -1 && intent != null) {
            Collection ACQ = ACQ();
            if (!ACQ.isEmpty()) {
                List A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                C35541m6 r7 = null;
                if (AnonymousClass3B1.A01(this.A0C, A082)) {
                    AnonymousClass00B.A06(intent);
                    r7 = this.A0K.A00(intent.getExtras());
                }
                ArrayList arrayList = new ArrayList(ACQ);
                Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(36));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A00.A03.A08(this.A02, r7, (C16740tZ) it.next(), A082, booleanExtra);
                }
                if (A082.size() != 1 || C16030sJ.A0Q((Jid) A082.get(0))) {
                    Agv(A082);
                } else {
                    this.A00.A07(this, new C14750ph().A0v(this, this.A00.A07.A0A((C15830rv) A082.get(0))));
                }
            } else {
                Log.w("mediaalbum/forward/failed");
                this.A05.A09(R.string.str0d39, 0);
            }
            A96();
        }
    }

    public void onCreate(Bundle bundle) {
        int length;
        if (C455529g.A00) {
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(220);
            autoTransition.setInterpolator(new AccelerateDecelerateInterpolator());
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        Bundle bundle2 = bundle;
        this.A00 = bundle2;
        super.onCreate(bundle2);
        A0b();
        setContentView((int) R.layout.layout03c1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A04.A02(this.A0P);
        this.A00.A0S.A02(this.A0R);
        this.A03.A02(this.A0O);
        this.A0I.A02(this.A0S);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            C434920f.A03(this, R.color.color064b);
            getWindow().addFlags(134217728);
        }
        C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
        if (A022 == null) {
            x2.A0B(R.string.str1ba8);
        } else {
            AnonymousClass2DF r0 = this.A00;
            x2.A0J(r0.A09.A08(r0.A07.A0A(A022)));
        }
        this.A08 = new AnonymousClass2Aa(this);
        ListView ADA = ADA();
        ADA.setFastScrollEnabled(false);
        ADA.setScrollbarFadingEnabled(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dimen005e));
        ADA.addHeaderView(frameLayout, (Object) null, false);
        FrameLayout frameLayout2 = new FrameLayout(this);
        ADA.addFooterView(frameLayout2, (Object) null, false);
        View findViewById = findViewById(R.id.title_background);
        C004601z.A0k(ADA, new C95034ls(frameLayout, frameLayout2, findViewById, this));
        AnonymousClass3L2 r02 = new AnonymousClass3L2(AnonymousClass00T.A00(this, R.color.color064b));
        this.A07 = r02;
        x2.A0D(r02);
        int A002 = AnonymousClass00T.A00(this, R.color.color064b);
        ADA.setOnScrollListener(new AnonymousClass3DB(frameLayout, ADA, this, AnonymousClass00T.A00(this, R.color.color0547), AnonymousClass00T.A00(this, R.color.color064b), A002));
        A35(this.A08);
        if (i2 >= 21) {
            View findViewById2 = findViewById(R.id.background);
            VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this);
            verticalSwipeDismissBehavior.A05 = new C102204yZ(findViewById2, findViewById, toolbar, this);
            ((AnonymousClass0Bo) ADA.getLayoutParams()).A01(verticalSwipeDismissBehavior);
        }
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        if (longArrayExtra == null || (length = longArrayExtra.length) == 0) {
            finish();
            return;
        }
        Object[] objArr = {Integer.valueOf(length)};
        x2.A0I(this.A01.A0J(objArr, R.plurals.plurals00ec, (long) length));
        A0W().A02(this);
        A20(this.A00, this.A05);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A04.A03(this.A0P);
        this.A00.A0S.A03(this.A0R);
        this.A03.A03(this.A0O);
        this.A0I.A03(this.A0S);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A0Z();
        }
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView ADA = ADA();
        bundle.putInt("top_index", ADA.getFirstVisiblePosition());
        int i2 = 0;
        View childAt = ADA.getChildAt(0);
        if (childAt != null) {
            i2 = childAt.getTop() - ADA.getPaddingTop();
        }
        bundle.putInt("top_offset", i2);
    }

    public void onStart() {
        super.onStart();
        AnonymousClass2DF r0 = this.A00;
        AnonymousClass47T r9 = r0.A0m;
        C16000sG r4 = r0.A07;
        C16080sP r5 = r0.A09;
        AnonymousClass013 r8 = this.A01;
        C50212Yk r2 = this.A01.A00;
        this.A09 = new IDxMCallbackShape71S0100000_1_I0(this, r4, r5, new AnonymousClass31X((AnonymousClass2SQ) r2.A01.A0l.get(), this, (C25761La) r2.A03.A5S.get()), this.A0C, r8, r9, this, 0);
    }
}
