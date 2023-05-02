package com.obwhatsapp.quickcontact;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass152;
import X.AnonymousClass15A;
import X.AnonymousClass15P;
import X.AnonymousClass174;
import X.AnonymousClass18O;
import X.AnonymousClass195;
import X.AnonymousClass1BJ;
import X.AnonymousClass1D0;
import X.AnonymousClass1M5;
import X.AnonymousClass1P7;
import X.AnonymousClass1SP;
import X.AnonymousClass1VN;
import X.AnonymousClass28S;
import X.AnonymousClass2AR;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Aq;
import X.AnonymousClass2J7;
import X.AnonymousClass2Rf;
import X.AnonymousClass2TP;
import X.AnonymousClass2XQ;
import X.C004601z;
import X.C109505Sk;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15810rt;
import X.C15830rv;
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
import X.C16490t9;
import X.C16620tM;
import X.C17140ub;
import X.C17160ud;
import X.C17200uh;
import X.C17240ul;
import X.C17250um;
import X.C17650vQ;
import X.C18190wI;
import X.C18260wP;
import X.C19230xz;
import X.C19270y9;
import X.C19430yQ;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C20260zl;
import X.C204310c;
import X.C218115n;
import X.C218315p;
import X.C23061Ai;
import X.C23071Aj;
import X.C25681Ks;
import X.C25691Kt;
import X.C25781Lc;
import X.C30521cU;
import X.C32241fu;
import X.C33481ie;
import X.C34661kf;
import X.C37831po;
import X.C38571r0;
import X.C455529g;
import X.C45782Ay;
import X.C49132Rg;
import X.C78793yh;
import X.C78803yi;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape373S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape57S0200000_2_I0;
import com.facebook.redex.IDxLObserverShape301S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.FloatingChildLayout;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import java.util.List;

public class QuickContactActivity extends C14530pL implements C34661kf, AnonymousClass2AR {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ImageView A07;
    public AnonymousClass2J7 A08;
    public AnonymousClass1BJ A09;
    public C78793yh A0A;
    public C78803yi A0B;
    public C204310c A0C;
    public C17650vQ A0D;
    public C17160ud A0E;
    public C16000sG A0F;
    public C17140ub A0G;
    public C18190wI A0H;
    public C16080sP A0I;
    public AnonymousClass2Ao A0J;
    public C17200uh A0K;
    public AnonymousClass152 A0L;
    public C19230xz A0M;
    public AnonymousClass1D0 A0N;
    public C15810rt A0O;
    public C16070sO A0P;
    public AnonymousClass195 A0Q;
    public C16010sH A0R;
    public C218115n A0S;
    public C20260zl A0T;
    public C16490t9 A0U;
    public C17240ul A0V;
    public AnonymousClass18O A0W;
    public C16050sL A0X;
    public C19430yQ A0Y;
    public AnonymousClass1P7 A0Z;
    public AnonymousClass174 A0a;
    public AnonymousClass1VN A0b;
    public AnonymousClass1M5 A0c;
    public C218315p A0d;
    public AnonymousClass2Aq A0e;
    public C25781Lc A0f;
    public StatusesViewModel A0g;
    public C25681Ks A0h;
    public C25691Kt A0i;
    public FloatingChildLayout A0j;
    public C37831po A0k;
    public AnonymousClass1SP A0l;
    public AnonymousClass15A A0m;
    public C38571r0 A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final C33481ie A0r;
    public final AnonymousClass28S A0s;
    public final C109505Sk A0t;
    public final C19270y9 A0u;

    public QuickContactActivity() {
        this(0);
        this.A0r = new IDxCObserverShape68S0100000_2_I0(this, 27);
        this.A0s = new IDxCListenerShape227S0100000_2_I0(this, 8);
        this.A0t = new IDxLObserverShape301S0100000_2_I0(this, 3);
        this.A0u = new IDxCObserverShape111S0100000_2_I0(this, 9);
    }

    public QuickContactActivity(int i2) {
        this.A0p = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 73));
    }

    public static /* synthetic */ void A02(QuickContactActivity quickContactActivity) {
        QuickContactActivity quickContactActivity2 = quickContactActivity;
        C30521cU r3 = new C30521cU((Context) quickContactActivity2, (TextEmojiLabel) quickContactActivity.findViewById(R.id.name), quickContactActivity.A0I, quickContactActivity.A01, quickContactActivity.A0f);
        if (quickContactActivity2.A0q) {
            r3.A0C(quickContactActivity2.A0R, (AnonymousClass2TP) null, (List) null, 1.0f);
        } else {
            r3.A0A(quickContactActivity2.A0R);
        }
    }

    public static /* synthetic */ void A03(QuickContactActivity quickContactActivity) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = quickContactActivity.getWindow();
        }
        quickContactActivity.finish();
        quickContactActivity.overridePendingTransition(0, 0);
    }

    public static /* synthetic */ void A09(QuickContactActivity quickContactActivity) {
        quickContactActivity.A0j.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = quickContactActivity.getWindow();
            int intExtra = quickContactActivity.getIntent().getIntExtra("status_bar_color", AnonymousClass00T.A00(quickContactActivity, R.color.color064b));
        }
        FloatingChildLayout floatingChildLayout = quickContactActivity.A0j;
        floatingChildLayout.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape57S0200000_2_I0(floatingChildLayout, 4, new RunnableRunnableShape13S0100000_I0_12((Object) quickContactActivity, 1)));
    }

    public static /* synthetic */ void A0A(QuickContactActivity quickContactActivity) {
        C15830rv r4;
        AnonymousClass2XQ A052;
        QuickContactActivity quickContactActivity2 = quickContactActivity;
        if (quickContactActivity2.A0o) {
            return;
        }
        if (quickContactActivity2.A0g == null || !quickContactActivity2.A0C.A0E(C16620tM.A01, 1533) || !quickContactActivity2.A0H.A01.A0E(C16620tM.A02, 604) || (r4 = (C15830rv) quickContactActivity2.A0R.A08(C15830rv.class)) == null || (A052 = quickContactActivity2.A0g.A05(UserJid.of(r4))) == null || !A052.A00()) {
            C16010sH r2 = quickContactActivity2.A0R;
            if (r2.A0Z && r2.A0J()) {
                C16070sO r22 = quickContactActivity2.A0P;
                C16050sL r1 = quickContactActivity2.A0X;
                AnonymousClass00B.A06(r1);
                if (!r22.A09(r1)) {
                    quickContactActivity2.Afg(R.string.str08d6);
                    return;
                }
            }
            C15830rv r5 = quickContactActivity2.A0R.A0E;
            AnonymousClass00B.A06(r5);
            if (!C455529g.A00) {
                quickContactActivity2.startActivity(C14750ph.A0U(quickContactActivity2.getApplicationContext(), r5, (String) null, 0.0f, 0, 0, 0, 0, false));
            } else {
                String stringExtra = quickContactActivity2.getIntent().getStringExtra("transition_name");
                if (stringExtra == null) {
                    stringExtra = quickContactActivity2.getApplicationContext().getResources().getString(R.string.str1dd7);
                }
                boolean z2 = false;
                if (Build.VERSION.SDK_INT >= 24) {
                    z2 = true;
                }
                int intExtra = quickContactActivity2.getIntent().getIntExtra("status_bar_color", AnonymousClass00T.A00(quickContactActivity2, R.color.color064b));
                int intExtra2 = quickContactActivity2.getIntent().getIntExtra("navigation_bar_color", AnonymousClass00T.A00(quickContactActivity2, R.color.color04f0));
                C004601z.A0n(quickContactActivity2.A07, stringExtra);
                Context applicationContext = quickContactActivity2.getApplicationContext();
                float f2 = 0.0f;
                if (z2) {
                    f2 = 0.5f;
                }
                quickContactActivity2.startActivity(C14750ph.A0U(applicationContext, r5, stringExtra, f2, quickContactActivity2.getWindow().getStatusBarColor(), intExtra, quickContactActivity2.getWindow().getNavigationBarColor(), intExtra2, false), C455529g.A05(quickContactActivity2, quickContactActivity2.A07, stringExtra));
                if (!z2) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableRunnableShape13S0100000_I0_12((Object) quickContactActivity2, 0), (long) quickContactActivity2.getResources().getInteger(17694721));
                    return;
                }
            }
            quickContactActivity2.A37(false);
            return;
        }
        quickContactActivity2.A0g.A08(r4, 7, (Integer) null);
        quickContactActivity2.startActivity(C14750ph.A0K(quickContactActivity2, r4, Boolean.TRUE));
        quickContactActivity2.A37(false);
    }

    public void A1q() {
        if (!this.A0p) {
            this.A0p = true;
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
            this.A0O = (C15810rt) r1.A43.get();
            this.A0U = (C16490t9) r1.AQz.get();
            this.A0T = r2.A0I();
            this.A09 = (AnonymousClass1BJ) r1.AOm.get();
            this.A0C = (C204310c) r1.A3O.get();
            this.A0m = (AnonymousClass15A) r1.A3J.get();
            this.A0K = (C17200uh) r1.A52.get();
            this.A0Z = (AnonymousClass1P7) r1.ADc.get();
            this.A0d = (C218315p) r1.AIL.get();
            this.A0D = C16150sX.A0J(r1);
            this.A0E = (C17160ud) r1.A4t.get();
            this.A0F = (C16000sG) r1.A4x.get();
            this.A0I = (C16080sP) r1.AQ9.get();
            this.A0l = (AnonymousClass1SP) r1.A3G.get();
            this.A0G = (C17140ub) r1.A4y.get();
            this.A0V = (C17240ul) r1.ABK.get();
            this.A0f = new C25781Lc();
            this.A0h = (C25681Ks) r1.A0Q.get();
            this.A0N = (AnonymousClass1D0) r1.A3P.get();
            this.A0i = (C25691Kt) r1.A0R.get();
            this.A0M = (C19230xz) r1.A5B.get();
            this.A0S = (C218115n) r1.AH2.get();
            this.A0Q = (AnonymousClass195) r1.ACz.get();
            this.A0Y = (C19430yQ) r1.ADa.get();
            this.A0a = (AnonymousClass174) r1.AI3.get();
            this.A0H = C16150sX.A0O(r1);
            this.A0P = (C16070sO) r1.ABY.get();
            this.A0W = (AnonymousClass18O) r1.ABN.get();
            this.A0L = (AnonymousClass152) r1.A51.get();
            this.A08 = (AnonymousClass2J7) r2.A00.get();
            this.A0c = (AnonymousClass1M5) r1.AHS.get();
        }
    }

    public final void A35() {
        C38571r0 r0 = this.A0n;
        if (r0 != null) {
            C37831po A012 = this.A0N.A01(r0.A00);
            if (A012 != null) {
                this.A0k = A012;
                return;
            }
            C78793yh r2 = new C78793yh(new IDxCallbackShape373S0100000_2_I0(this, 2), this.A0N, this.A0n.A00);
            this.A0A = r2;
            this.A05.Acn(r2, new Void[0]);
        }
    }

    public final void A36() {
        C16000sG r2 = this.A0F;
        C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        C16010sH A0A2 = r2.A0A(A022);
        this.A0R = A0A2;
        this.A0X = (C16050sL) A0A2.A08(C16050sL.class);
    }

    public final void A37(boolean z2) {
        if (z2) {
            FloatingChildLayout floatingChildLayout = this.A0j;
            if (floatingChildLayout.A02 == 1) {
                floatingChildLayout.A02 = 3;
                if (floatingChildLayout.A06.isRunning()) {
                    floatingChildLayout.A06.reverse();
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{127, 0});
                    floatingChildLayout.A06 = ofInt;
                    ofInt.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(floatingChildLayout, 29));
                    floatingChildLayout.A06.setDuration((long) floatingChildLayout.A01).start();
                }
            }
            FloatingChildLayout floatingChildLayout2 = this.A0j;
            RunnableRunnableShape13S0100000_I0_12 runnableRunnableShape13S0100000_I0_12 = new RunnableRunnableShape13S0100000_I0_12((Object) this, 6);
            int i2 = floatingChildLayout2.A03;
            if (i2 == 1 || i2 == 2) {
                floatingChildLayout2.A03 = 3;
                floatingChildLayout2.A09.invalidate();
                floatingChildLayout2.A00(runnableRunnableShape13S0100000_I0_12, true);
                return;
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AXj(C45782Ay r2) {
        this.A0g.A09(r2);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1) {
            this.A0M.A07();
            this.A0h.A00();
        }
    }

    public void onBackPressed() {
        A37(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c4, code lost:
        if (r12.A0C.A0E(X.C16620tM.A02, 1967) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03a1, code lost:
        if (r7.A0d.A0a(r7, (com.whatsapp.jid.UserJid) r7.A0R.A08(com.whatsapp.jid.UserJid.class), r9) == false) goto L_0x03a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x04f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            boolean r0 = X.C455529g.A00
            r12 = r23
            if (r0 == 0) goto L_0x000f
            android.view.Window r1 = r12.getWindow()
            r0 = 12
            r1.requestFeature(r0)
        L_0x000f:
            r0 = r24
            super.onCreate(r0)
            X.1M5 r7 = r12.A0c
            r2 = 0
            r0 = 4
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r6 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r6.<init>((java.lang.Object) r12, (int) r0)
            X.02z r1 = new X.02z
            r1.<init>(r12)
            java.lang.Class<X.3Q5> r0 = X.AnonymousClass3Q5.class
            X.01n r5 = r1.A01(r0)
            X.3Q5 r5 = (X.AnonymousClass3Q5) r5
            r1 = 0
            X.0pt r14 = r7.A00
            X.0sK r15 = r7.A01
            X.0wS r4 = r7.A04
            X.0w8 r3 = r7.A03
            X.19h r0 = r7.A02
            r22 = 0
            X.1VN r11 = new X.1VN
            r13 = r12
            r16 = r0
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r2
            r21 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A0b = r11
            X.0uh r3 = r12.A0K
            java.lang.String r0 = "quick-contact-activity"
            X.2Ao r0 = r3.A04(r12, r0)
            r12.A0J = r0
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r12.setTitle(r0)
            android.content.Intent r6 = r12.getIntent()
            boolean r0 = X.C15450qv.A03()
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r0 == 0) goto L_0x0088
            android.view.Window r3 = r12.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r0)
            r0 = 2131101259(0x7f06064b, float:1.7814923E38)
            int r3 = X.AnonymousClass00T.A00(r12, r0)
            java.lang.String r0 = "status_bar_color"
            int r0 = r6.getIntExtra(r0, r3)
            android.view.Window r3 = r12.getWindow()
            int r0 = X.AnonymousClass090.A03(r5, r0, r4)
        L_0x0088:
            boolean r0 = X.C15450qv.A07()
            if (r0 == 0) goto L_0x00a0
            r0 = 2131100912(0x7f0604f0, float:1.7814219E38)
            int r0 = X.AnonymousClass00T.A00(r12, r0)
            android.view.Window r3 = r12.getWindow()
            int r0 = X.AnonymousClass090.A03(r5, r0, r4)
            r3.setNavigationBarColor(r0)
        L_0x00a0:
            android.view.Window r3 = r12.getWindow()
            r0 = 131072(0x20000, float:1.83671E-40)
            r3.setFlags(r0, r0)
            r12.A36()
            X.0sK r3 = r12.A01
            X.0sH r0 = r12.A0R
            X.0rv r0 = r0.A0E
            boolean r0 = r3.A0I(r0)
            r5 = 1
            if (r0 == 0) goto L_0x00c6
            X.0pd r4 = r12.A0C
            r3 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r3 = r4.A0E(r0, r3)
            r0 = 1
            if (r3 != 0) goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            r12.A0q = r0
            X.0wI r0 = r12.A0H
            X.0pd r3 = r0.A01
            r0 = 604(0x25c, float:8.46E-43)
            X.0tM r4 = X.C16620tM.A02
            boolean r0 = r3.A0E(r4, r0)
            if (r0 == 0) goto L_0x0557
            X.2jZ r3 = new X.2jZ
            r3.<init>(r12)
            r12.A0e = r3
        L_0x00de:
            boolean r0 = r3 instanceof X.AnonymousClass345
            if (r0 == 0) goto L_0x0523
            X.345 r3 = (X.AnonymousClass345) r3
            com.obwhatsapp.quickcontact.QuickContactActivity r3 = r3.A00
            r0 = 2131559652(0x7f0d04e4, float:1.8744654E38)
            r3.setContentView((int) r0)
        L_0x00ec:
            r0 = 2131364162(0x7f0a0942, float:1.8348153E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A02 = r0
            r0 = 2131365325(0x7f0a0dcd, float:1.8350512E38)
            android.view.View r9 = r12.findViewById(r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            X.0wI r0 = r12.A0H
            X.0pd r3 = r0.A01
            r0 = 604(0x25c, float:8.46E-43)
            boolean r0 = r3.A0E(r4, r0)
            if (r0 == 0) goto L_0x0128
            r0 = 2131367096(0x7f0a14b8, float:1.8354104E38)
            android.view.View r8 = r12.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            X.0pd r7 = r12.A0C
            X.0tM r3 = X.C16620tM.A01
            r0 = 1533(0x5fd, float:2.148E-42)
            boolean r3 = r7.A0E(r3, r0)
            r0 = 8
            if (r3 == 0) goto L_0x051b
            r9.setVisibility(r0)
            r8.setVisibility(r1)
            r9 = r8
        L_0x0128:
            r12.A07 = r9
            r0 = 2131364699(0x7f0a0b5b, float:1.8349242E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A04 = r0
            r0 = 2131362067(0x7f0a0113, float:1.8343904E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A00 = r0
            r0 = 2131366907(0x7f0a13fb, float:1.835372E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A06 = r0
            r0 = 2131362518(0x7f0a02d6, float:1.8344819E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A01 = r0
            r0 = 2131364206(0x7f0a096e, float:1.8348243E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A03 = r0
            r0 = 2131361920(0x7f0a0080, float:1.8343606E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A05 = r0
            X.0sL r0 = r12.A0X
            if (r0 == 0) goto L_0x0183
            X.2Aq r0 = r12.A0e
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0183
            X.195 r3 = r12.A0Q
            X.0sL r0 = r12.A0X
            boolean r0 = r3.A07(r0)
            if (r0 == 0) goto L_0x0501
            X.195 r3 = r12.A0Q
            X.0sL r0 = r12.A0X
            X.1r0 r0 = r3.A02(r0)
            r12.A0n = r0
            r12.A35()
        L_0x0183:
            X.2Aq r8 = r12.A0e
            boolean r0 = r8 instanceof X.AnonymousClass345
            if (r0 == 0) goto L_0x0363
            X.345 r8 = (X.AnonymousClass345) r8
            r8.A02()
            r8.A00()
            r8.A03()
            com.obwhatsapp.quickcontact.QuickContactActivity r2 = r8.A00
            r0 = 2131364121(0x7f0a0919, float:1.834807E38)
            android.view.View r7 = r2.findViewById(r0)
            r3 = 23
            com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4
            r0.<init>(r8, r3)
            r7.setOnClickListener(r0)
            X.0sH r7 = r2.A0R
            boolean r0 = r7.A0i
            r3 = 8
            if (r0 != 0) goto L_0x0352
            boolean r0 = r7.A0J()
            if (r0 != 0) goto L_0x0352
            X.0sH r0 = r2.A0R
            X.0rv r0 = r0.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x0352
            r0 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r3)
            X.0sH r0 = r2.A0R
            X.1ko r0 = r0.A0D
            if (r0 == 0) goto L_0x035c
            android.view.View r0 = r2.A02
            r0.setVisibility(r1)
        L_0x01d4:
            android.view.View r3 = r2.A02
            r2 = 24
            com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4
            r0.<init>(r8, r2)
            r3.setOnClickListener(r0)
            r8.A04()
        L_0x01e3:
            r0 = 2131363725(0x7f0a078d, float:1.8347267E38)
            android.view.View r7 = r12.findViewById(r0)
            com.whatsapp.util.FloatingChildLayout r7 = (com.whatsapp.util.FloatingChildLayout) r7
            r12.A0j = r7
            r2 = 12
            com.facebook.redex.IDxTListenerShape167S0100000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape167S0100000_2_I0
            r0.<init>(r12, r2)
            r7.A08 = r0
            r3 = 2
            X.C004601z.A0d(r7, r3)
            X.0wI r0 = r12.A0H
            X.0pd r2 = r0.A01
            r0 = 604(0x25c, float:8.46E-43)
            boolean r0 = r2.A0E(r4, r0)
            if (r0 == 0) goto L_0x0345
            r4 = -2
        L_0x0208:
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r0 = "position_top"
            int r2 = r2.getIntExtra(r0, r4)
            android.graphics.Rect r6 = r6.getSourceBounds()
            com.whatsapp.util.FloatingChildLayout r0 = r12.A0j
            r0.A05 = r2
            if (r6 == 0) goto L_0x0260
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r0 = "animation_style"
            int r2 = r2.getIntExtra(r0, r3)
            if (r2 != r5) goto L_0x0334
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            android.view.WindowManager r0 = r12.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r2)
            int r4 = r2.heightPixels
            int r3 = r2.widthPixels
            int r2 = r3 >> 2
            int r0 = r4 >> 2
            int r2 = java.lang.Math.min(r2, r0)
            int r4 = r4 - r2
            int r0 = r4 >> 1
            r6.top = r0
            int r0 = r0 + r2
            r6.bottom = r0
            int r3 = r3 - r2
            int r0 = r3 >> 1
            r6.left = r0
            int r0 = r0 + r2
            r6.right = r0
            com.whatsapp.util.FloatingChildLayout r0 = r12.A0j
            r0.setChildTargetScreen(r6)
            com.whatsapp.util.FloatingChildLayout r2 = r12.A0j
            r2.A04 = r1
            r0 = 0
            r2.A00 = r0
        L_0x0260:
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r0 = "show_get_direction"
            boolean r3 = r2.getBooleanExtra(r0, r1)
            r2 = 2131363201(0x7f0a0581, float:1.8346204E38)
            android.view.View r1 = r12.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 8
            if (r3 == 0) goto L_0x0279
            r0 = 0
        L_0x0279:
            r1.setVisibility(r0)
            if (r3 == 0) goto L_0x028f
            X.AnonymousClass1UP.A06(r1)
            android.view.View r2 = r12.findViewById(r2)
            r1 = 33
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r12, r1)
            r2.setOnClickListener(r0)
        L_0x028f:
            android.widget.ImageView r2 = r12.A07
            r1 = 34
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r12, r1)
            r2.setOnClickListener(r0)
            android.widget.ImageView r1 = r12.A07
            r0 = 2131892119(0x7f121797, float:1.9418977E38)
            X.AnonymousClass2JP.A03(r1, r0)
            boolean r0 = X.C15450qv.A03()
            if (r0 == 0) goto L_0x02ab
            r12.A0o = r5
        L_0x02ab:
            com.whatsapp.util.FloatingChildLayout r3 = r12.A0j
            r2 = 2
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r12, (int) r2)
            com.facebook.redex.IDxLListenerShape59S0200000_2_I0 r1 = new com.facebook.redex.IDxLListenerShape59S0200000_2_I0
            r1.<init>(r0, r2, r3)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r1)
            X.0ub r1 = r12.A0G
            X.1ie r0 = r12.A0r
            r1.A02(r0)
            X.0sH r0 = r12.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x02d7
            X.18O r0 = r12.A0W
            X.28S r1 = r12.A0s
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
        L_0x02d7:
            X.1SP r1 = r12.A0l
            X.5Sk r0 = r12.A0t
            r1.A02(r0)
            X.15A r1 = r12.A0m
            X.0y9 r0 = r12.A0u
            r1.A02(r0)
            X.0sH r1 = r12.A0R
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r1.A08(r0)
            if (r4 == 0) goto L_0x0333
            X.0pd r2 = r12.A0C
            X.0tM r1 = X.C16620tM.A01
            r0 = 1533(0x5fd, float:2.148E-42)
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0333
            X.2J7 r1 = r12.A08
            X.2J8 r0 = new X.2J8
            r0.<init>(r1, r5)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r12)
            java.lang.Class<com.obwhatsapp.status.viewmodels.StatusesViewModel> r0 = com.obwhatsapp.status.viewmodels.StatusesViewModel.class
            X.01n r1 = r1.A01(r0)
            com.obwhatsapp.status.viewmodels.StatusesViewModel r1 = (com.obwhatsapp.status.viewmodels.StatusesViewModel) r1
            r12.A0g = r1
            r1.A00 = r12
            X.04p r0 = r12.A06
            r0.A00(r1)
            com.obwhatsapp.status.viewmodels.StatusesViewModel r3 = r12.A0g
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r4)
            X.028 r1 = r3.A05
            X.4lk r0 = new X.4lk
            r0.<init>(r2, r3)
            X.028 r2 = X.C05730St.A00(r0, r1)
            r1 = 53
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r12, r1)
            r2.A0A(r12, r0)
        L_0x0333:
            return
        L_0x0334:
            com.whatsapp.util.FloatingChildLayout r0 = r12.A0j
            r0.setChildTargetScreen(r6)
            com.whatsapp.util.FloatingChildLayout r0 = r12.A0j
            if (r2 != r3) goto L_0x0341
            r0.A04 = r5
            goto L_0x0260
        L_0x0341:
            r0.A04 = r3
            goto L_0x0260
        L_0x0345:
            android.content.res.Resources r2 = r12.getResources()
            r0 = 2131166824(0x7f070668, float:1.7947904E38)
            int r4 = r2.getDimensionPixelOffset(r0)
            goto L_0x0208
        L_0x0352:
            r0 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
        L_0x035c:
            android.view.View r0 = r2.A02
            r0.setVisibility(r3)
            goto L_0x01d4
        L_0x0363:
            X.2jZ r8 = (X.C55412jZ) r8
            r8.A02()
            r8.A00()
            com.obwhatsapp.quickcontact.QuickContactActivity r7 = r8.A04
            X.0sH r0 = r7.A0R
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x04a8
            android.view.View r2 = r7.A02
            r0 = 8
            r2.setVisibility(r0)
        L_0x037c:
            X.15p r3 = r7.A0d
            X.0sH r2 = r7.A0R
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            int r9 = r3.A0B(r0)
            r10 = 0
            r0 = 2
            if (r9 != r0) goto L_0x03a3
            X.15p r3 = r7.A0d
            X.0sH r2 = r7.A0R
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r3.A0a(r7, r0, r9)
            r2 = 1
            if (r0 != 0) goto L_0x03a4
        L_0x03a3:
            r2 = 0
        L_0x03a4:
            com.obwhatsapp.WaImageButton r0 = r8.A03
            if (r2 != 0) goto L_0x03aa
            r10 = 8
        L_0x03aa:
            r0.setVisibility(r10)
            if (r2 == 0) goto L_0x03d2
            X.15p r2 = r7.A0d
            X.174 r0 = r7.A0a
            X.1cm r0 = r0.A01()
            int r0 = r2.A0A(r0)
            if (r0 == 0) goto L_0x04a5
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00T.A04(r7, r0)
        L_0x03c1:
            com.obwhatsapp.WaImageButton r0 = r8.A03
            r0.setImageDrawable(r2)
            com.obwhatsapp.WaImageButton r3 = r8.A03
            r2 = 10
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r8, r9, r2)
            r3.setOnClickListener(r0)
        L_0x03d2:
            r8.A03()
            X.0sH r0 = r7.A0R
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x047d
            X.0sH r0 = r7.A0R
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x047d
            X.0sH r0 = r7.A0R
            X.0rv r0 = r0.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x047d
            X.0sK r0 = r7.A01
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x047d
            X.0zl r2 = r7.A0T
            X.0sH r0 = r7.A0R
            boolean r0 = X.C40561uK.A00(r0, r2)
            if (r0 != 0) goto L_0x047d
            android.view.View r0 = r7.A02
            r0.setVisibility(r1)
            android.view.View r11 = r8.A00
            int r10 = r11.getPaddingLeft()
            android.view.View r0 = r8.A00
            int r9 = r0.getPaddingTop()
            android.view.View r0 = r8.A00
            int r3 = r0.getPaddingRight()
            android.content.res.Resources r2 = r7.getResources()
            r0 = 2131167074(0x7f070762, float:1.7948411E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r11.setPadding(r10, r9, r3, r0)
            android.view.View r0 = r8.A01
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0442
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.content.res.Resources r2 = r7.getResources()
            r0 = 2131167077(0x7f070765, float:1.7948417E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r3.setMargins(r1, r0, r1, r1)
        L_0x0442:
            android.view.View r3 = r7.A02
            r2 = 36
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r8, r2)
            r3.setOnClickListener(r0)
            android.view.View r3 = r8.A00
            r2 = 35
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r8, r2)
            r3.setOnClickListener(r0)
            r8.A04()
            r0 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r8 = r7.findViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r3 = 0
            r2 = 0
        L_0x0468:
            int r0 = r8.getChildCount()
            if (r3 >= r0) goto L_0x04ee
            android.view.View r0 = r8.getChildAt(r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x047a
            int r2 = r2 + 1
        L_0x047a:
            int r3 = r3 + 1
            goto L_0x0468
        L_0x047d:
            android.view.View r2 = r7.A02
            r0 = 8
            r2.setVisibility(r0)
            android.view.View r11 = r8.A00
            int r10 = r11.getPaddingLeft()
            android.view.View r0 = r8.A00
            int r9 = r0.getPaddingTop()
            android.view.View r0 = r8.A00
            int r3 = r0.getPaddingRight()
            android.content.res.Resources r2 = r7.getResources()
            r0 = 2131167077(0x7f070765, float:1.7948417E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r11.setPadding(r10, r9, r3, r0)
            goto L_0x0442
        L_0x04a5:
            r2 = 0
            goto L_0x03c1
        L_0x04a8:
            android.content.res.Resources r3 = r7.getResources()
            r0 = 2131231394(0x7f0802a2, float:1.8078868E38)
            android.graphics.drawable.Drawable r9 = r3.getDrawable(r0)
            android.graphics.drawable.Drawable r10 = X.C018208n.A03(r9)
            android.content.res.Resources r3 = r7.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            int r0 = r3.getColor(r0)
            X.C018208n.A0A(r10, r0)
            android.content.res.Resources r3 = r7.getResources()
            r0 = 2131166821(0x7f070665, float:1.7947898E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r10.setBounds(r1, r1, r0, r0)
            android.view.View r0 = r7.A02
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawables(r9, r2, r2, r2)
            android.view.View r3 = r7.A02
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.res.Resources r2 = r7.getResources()
            r0 = 2131166820(0x7f070664, float:1.7947896E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r3.setCompoundDrawablePadding(r0)
            goto L_0x037c
        L_0x04ee:
            r0 = 4
            if (r2 >= r0) goto L_0x01e3
            android.content.res.Resources r2 = r7.getResources()
            r0 = 2131166819(0x7f070663, float:1.7947894E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r8.setPadding(r0, r1, r0, r1)
            goto L_0x01e3
        L_0x0501:
            X.195 r8 = r12.A0Q
            r0 = 2
            com.facebook.redex.IDxCallbackShape374S0100000_2_I0 r3 = new com.facebook.redex.IDxCallbackShape374S0100000_2_I0
            r3.<init>(r12, r0)
            X.0sL r0 = r12.A0X
            X.3yi r7 = new X.3yi
            r7.<init>(r3, r8, r0)
            r12.A0B = r7
            X.0sq r3 = r12.A05
            java.lang.Void[] r0 = new java.lang.Void[r1]
            r3.Acn(r7, r0)
            goto L_0x0183
        L_0x051b:
            r9.setVisibility(r1)
            r8.setVisibility(r0)
            goto L_0x0128
        L_0x0523:
            X.2jZ r3 = (X.C55412jZ) r3
            com.obwhatsapp.quickcontact.QuickContactActivity r7 = r3.A04
            r0 = 2131558989(0x7f0d024d, float:1.874331E38)
            r7.setContentView((int) r0)
            r0 = 2131364796(0x7f0a0bbc, float:1.834944E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A02 = r0
            r0 = 2131365055(0x7f0a0cbf, float:1.8349964E38)
            android.view.View r0 = r7.findViewById(r0)
            com.obwhatsapp.WaImageButton r0 = (com.obwhatsapp.WaImageButton) r0
            r3.A03 = r0
            r0 = 2131362587(0x7f0a031b, float:1.8344959E38)
            android.view.View r0 = r7.findViewById(r0)
            r3.A00 = r0
            r0 = 2131365604(0x7f0a0ee4, float:1.8351078E38)
            android.view.View r0 = r7.findViewById(r0)
            r3.A01 = r0
            goto L_0x00ec
        L_0x0557:
            X.345 r3 = new X.345
            r3.<init>(r12)
            r12.A0e = r3
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.quickcontact.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 1) {
            return super.onCreateDialog(i2);
        }
        C32241fu r3 = new C32241fu(this);
        r3.A01(R.string.str00a0);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 84));
        return r3.create();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A03(this.A0r);
        this.A0J.A00();
        if (this.A0R.A0J()) {
            AnonymousClass18O r0 = this.A0W;
            r0.A00.remove(this.A0s);
        }
        this.A0l.A03(this.A0t);
        this.A0m.A03(this.A0u);
        C78803yi r02 = this.A0B;
        if (r02 != null) {
            r02.A06(true);
            this.A0B = null;
        }
        C78793yh r03 = this.A0A;
        if (r03 != null) {
            r03.A06(true);
            this.A0A = null;
        }
    }
}
