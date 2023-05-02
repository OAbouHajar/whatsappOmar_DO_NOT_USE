package com.obwhatsapp.registration;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass12L;
import X.AnonymousClass15P;
import X.AnonymousClass1BN;
import X.AnonymousClass1D2;
import X.AnonymousClass1KQ;
import X.AnonymousClass1NF;
import X.AnonymousClass1RE;
import X.AnonymousClass1ST;
import X.AnonymousClass29T;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.AnonymousClass39H;
import X.AnonymousClass3BW;
import X.C004101u;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14770pj;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16340ss;
import X.C16440t3;
import X.C17130ua;
import X.C17220uj;
import X.C17250um;
import X.C17380uz;
import X.C18260wP;
import X.C18390wc;
import X.C18450wi;
import X.C18900xR;
import X.C19060xh;
import X.C19090xk;
import X.C19220xx;
import X.C19490yW;
import X.C19590yg;
import X.C19640yl;
import X.C19740yv;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C26861Pn;
import X.C27821Tg;
import X.C27851Tj;
import X.C33601iq;
import X.C437421i;
import X.C45922Bq;
import X.C46052Cd;
import X.C47412Iw;
import X.C49132Rg;
import X.C50362Ze;
import X.C50372Zf;
import X.C55152ix;
import X.C78703yY;
import X.C83004Ez;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape322S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape383S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class EULA extends C14530pL {
    public int A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public C18900xR A03;
    public C17130ua A04;
    public C19740yv A05;
    public C19590yg A06;
    public AnonymousClass1RE A07;
    public C16260sj A08;
    public AnonymousClass013 A09;
    public C50372Zf A0A;
    public C50362Ze A0B;
    public AnonymousClass1KQ A0C;
    public C19060xh A0D;
    public AnonymousClass1ST A0E;
    public C26861Pn A0F;
    public C19090xk A0G;
    public C14770pj A0H;
    public C19220xx A0I;
    public AnonymousClass1NF A0J;
    public AnonymousClass39H A0K;
    public C19760yx A0L;
    public AnonymousClass12L A0M;
    public C27851Tj A0N;
    public C19640yl A0O;
    public AnonymousClass1BN A0P;
    public C83004Ez A0Q;
    public C17220uj A0R;
    public C47412Iw A0S;
    public C27821Tg A0T;
    public boolean A0U;
    public boolean A0V;
    public final AnonymousClass1D2 A0W;

    public EULA() {
        this(0);
        this.A00 = 0;
        this.A01 = null;
        this.A02 = new IDxLListenerShape144S0100000_2_I0(this, 25);
        this.A0W = new IDxCListenerShape322S0100000_2_I0(this, 2);
    }

    public EULA(int i2) {
        this.A0U = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 76));
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
            C49132Rg r3 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r3.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            AnonymousClass01J r1 = r2.AQh;
            this.A09 = (C15860rz) r1.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r3.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A0P = (AnonymousClass1BN) r2.AAp.get();
            this.A0J = (AnonymousClass1NF) r2.ABx.get();
            this.A03 = (C18900xR) r2.ALD.get();
            this.A04 = (C17130ua) r2.AN9.get();
            this.A0T = (C27821Tg) r2.AOl.get();
            this.A0D = (C19060xh) r2.A01.get();
            this.A0R = (C17220uj) r2.A9x.get();
            this.A0G = (C19090xk) r2.AF1.get();
            this.A09 = (AnonymousClass013) r2.AR8.get();
            C18390wc builderWithExpectedSize = C17380uz.builderWithExpectedSize(2);
            builderWithExpectedSize.addAll(new HashSet());
            Object obj = r2.ABA.get();
            C16340ss.A01(obj);
            builderWithExpectedSize.add(obj);
            this.A0Q = new C83004Ez(builderWithExpectedSize.build());
            this.A05 = (C19740yv) r2.AQi.get();
            this.A0I = (C19220xx) r2.APi.get();
            this.A0C = (AnonymousClass1KQ) r2.AAL.get();
            this.A0H = (C14770pj) r2.AF9.get();
            this.A0L = (C19760yx) r2.AKx.get();
            this.A08 = (C16260sj) r2.AQe.get();
            this.A07 = (AnonymousClass1RE) r2.A4h.get();
            this.A0E = (AnonymousClass1ST) r2.A7L.get();
            this.A0B = new C50362Ze();
            this.A0M = (AnonymousClass12L) r2.APo.get();
            this.A0N = (C27851Tj) r2.A6u.get();
            this.A0A = new C50372Zf((C15860rz) r1.get());
            this.A06 = (C19590yg) r2.A4Y.get();
            this.A0O = (C19640yl) r2.ACo.get();
            this.A0F = (C26861Pn) r2.ADF.get();
        }
    }

    public final void A35() {
        View findViewById = findViewById(R.id.eula_layout);
        this.A09.A0W();
        if (this.A06.A02() < 10000000) {
            startActivity(C14750ph.A0C(this, 10000000).setFlags(268435456));
        }
        if (this.A09.A00() != 0) {
            Log.e("eula/create/wrong-state bounce to main");
            startActivity(C14750ph.A04(this));
            finish();
            return;
        }
        this.A05.Ack(new C78703yY(this), new Void[0]);
        TelephonyManager A0N2 = this.A08.A0N();
        boolean contains = AnonymousClass1NF.A00.contains(A0N2 != null ? A0N2.getSimCountryIso() : null);
        String string = getString(R.string.str0874);
        int i2 = R.string.str0877;
        if (contains) {
            i2 = R.string.str0878;
        }
        String string2 = getString(i2, new Object[]{string});
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.eula_view);
        HashMap hashMap = new HashMap();
        hashMap.put("privacy-policy", this.A02.A00("https://www.whatsapp.com/legal/privacy-policy"));
        hashMap.put("terms-and-privacy-policy", this.A02.A00("https://www.whatsapp.com/legal/terms-of-service"));
        if (contains) {
            hashMap.put("learn-more", this.A02.A00("https://www.whatsapp.com/legal/information-for-people-who-dont-use-whatsapp"));
        }
        C45922Bq.A09(this, this.A00, this.A05, textEmojiLabel, this.A08, string2, hashMap);
        textEmojiLabel.setHighlightColor(0);
        if (contains) {
            textEmojiLabel.setTextSize(0, getResources().getDimension(R.dimen.dimen068e));
        }
        AnonymousClass00T.A05(this, R.id.eula_accept).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 42));
        if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
            AnonymousClass29T.A01(this, 1);
        }
        this.A0L.A0A(0);
        if (this.A03.A03()) {
            Log.w("eula/clock-wrong");
            C46052Cd.A02(this, this.A0G, this.A0H);
        }
        this.A09.A0K().putBoolean("input_enter_send", false).apply();
        this.A01 = findViewById(R.id.eula_logo);
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
        }
        this.A05.A01();
        if (((SharedPreferences) this.A09.A01.get()).getBoolean("is_eula_loaded_once", false)) {
            Log.i("EULA/retrieveBackupToken/EULA was already loaded before, skip retrieving token");
            return;
        }
        this.A05.Acl(new RunnableRunnableShape10S0200000_I0_8(this, 12, (Build.VERSION.SDK_INT < 26 || !C437421i.A01(this)) ? null : new C55152ix((Activity) this)));
        this.A09.A0K().putBoolean("is_eula_loaded_once", true).apply();
    }

    public final void A36() {
        TextView textView = (TextView) findViewById(R.id.language_picker);
        textView.setText(AnonymousClass3BW.A00(C33601iq.A01(Locale.getDefault())));
        textView.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(textView, 23, this));
        AnonymousClass2SR.A09(textView, getResources().getColor(R.color.color04d1));
        int height = getWindowManager().getDefaultDisplay().getHeight();
        if (getResources().getConfiguration().orientation == 1) {
            View findViewById = findViewById(R.id.eula_logo);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, height / 10, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            findViewById.setLayoutParams(marginLayoutParams);
            ((NestedScrollView) findViewById(R.id.eula_scroll_view)).A0E = new IDxCListenerShape383S0100000_2_I0(this, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r0 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 0
            r9.A0V = r0
            X.0sq r2 = r9.A05
            r1 = 14
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r9, (int) r1)
            r2.Aco(r0)
            X.0xh r3 = r9.A0D
            X.01V r0 = r9.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = r0.getSimCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String[] r0 = X.AnonymousClass3BW.A00
            boolean r0 = X.C43041zF.A03(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x004e
        L_0x0033:
            monitor-enter(r3)
            r3.A00()     // Catch:{ all -> 0x0042 }
            X.0pd r2 = r3.A02     // Catch:{ all -> 0x0042 }
            r1 = 1362(0x552, float:1.909E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0042 }
            boolean r1 = r2.A0E(r0, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0045
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0045:
            monitor-exit(r3)
            if (r1 != 0) goto L_0x004e
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r9, r0)
        L_0x004e:
            X.0yl r0 = r9.A0O
            r0.A01()
            X.0sq r8 = r9.A05
            X.0ua r3 = r9.A04
            X.0uj r7 = r9.A0R
            X.013 r4 = r9.A09
            X.1KQ r5 = r9.A0C
            X.0zG r6 = r9.A0D
            X.39H r2 = new X.39H
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.A0K = r2
            if (r1 == 0) goto L_0x0140
            X.1D2 r1 = r9.A0W
            java.util.Set r0 = r4.A0B
            r0.add(r1)
            X.0rz r0 = r9.A09
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "is_ls_shown_during_reg"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x00aa
            r0 = 2131559018(0x7f0d026a, float:1.8743368E38)
            r9.setContentView((int) r0)
            com.obwhatsapp.yo.yo.showStoragePermissionRequest(r9)
            com.AssemMods.accounts.WAclass.EULA._onCreate(r9)
            r0 = 2131363540(0x7f0a06d4, float:1.8346892E38)
            android.view.View r2 = r9.findViewById(r0)
            android.content.Context r1 = r9.getBaseContext()
            r0 = 2130772022(0x7f010036, float:1.714715E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r2.startAnimation(r0)
            r9.A35()
            r9.A36()
            return
        L_0x00aa:
            r0 = 2131559596(0x7f0d04ac, float:1.874454E38)
            r9.setContentView((int) r0)
            com.obwhatsapp.yo.yo.showStoragePermissionRequest(r9)
            com.AssemMods.accounts.WAclass.EULA._onCreate(r9)
            X.1Pn r2 = r9.A0F
            r0 = 1
            r2.A03 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            r0 = 2131364835(0x7f0a0be3, float:1.8349518E38)
            android.view.View r3 = r9.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            X.013 r2 = r9.A09
            r0 = 2131231641(0x7f080399, float:1.8079369E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r9, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r2)
            r3.setImageDrawable(r0)
            r1 = 28
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r9, r1)
            r3.setOnClickListener(r0)
            r0 = 2131364259(0x7f0a09a3, float:1.834835E38)
            android.view.View r4 = r9.findViewById(r0)
            com.obwhatsapp.BottomSheetListView r4 = (com.obwhatsapp.BottomSheetListView) r4
            X.013 r3 = r9.A09
            X.0sK r1 = r9.A01
            X.01V r0 = r9.A08
            java.util.List r2 = X.AnonymousClass3BW.A01(r1, r0, r3)
            boolean r1 = X.AnonymousClass3BW.A02()
            X.2oI r0 = new X.2oI
            r0.<init>(r9, r3, r2, r1)
            r4.setAdapter(r0)
            X.3DF r0 = new X.3DF
            r0.<init>(r4, r9)
            r4.setOnItemClickListener(r0)
            X.4lE r0 = new X.4lE
            r0.<init>(r4, r9)
            r4.setOnScrollListener(r0)
            r0 = 2131363541(0x7f0a06d5, float:1.8346894E38)
            android.view.View r5 = r9.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4
            r3 = 2131364417(0x7f0a0a41, float:1.834867E38)
            android.graphics.drawable.Drawable r2 = r4.findDrawableByLayerId(r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131100173(0x7f06020d, float:1.781272E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r2, r0)
            r4.setDrawableByLayerId(r3, r0)
            r5.setImageDrawable(r4)
            return
        L_0x0140:
            r0 = 2131559017(0x7f0d0269, float:1.8743366E38)
            r9.setContentView((int) r0)
            com.obwhatsapp.yo.yo.showStoragePermissionRequest(r9)
            com.AssemMods.accounts.WAclass.EULA._onCreate(r9)
            r9.A35()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.EULA.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0096, code lost:
        r3.setNegativeButton(r2, new com.facebook.redex.IDxCListenerShape127S0100000_2_I0(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x012b, code lost:
        r3.A03(new com.facebook.redex.IDxCListenerShape161S0100000_2_I0(r6, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r5) goto L_0x00da
            r0 = 2
            if (r7 == r0) goto L_0x00eb
            r4 = 0
            switch(r7) {
                case 5: goto L_0x00a0;
                case 6: goto L_0x006e;
                case 7: goto L_0x0027;
                case 8: goto L_0x0045;
                case 9: goto L_0x000f;
                default: goto L_0x000a;
            }
        L_0x000a:
            android.app.Dialog r0 = super.onCreateDialog(r7)
            return r0
        L_0x000f:
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3.A02(r0)
            r0 = 2131887215(0x7f12046f, float:1.940903E38)
            r3.A01(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 92
            goto L_0x0101
        L_0x0027:
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r2 = 2131887667(0x7f120633, float:1.9409948E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131893495(0x7f121cf7, float:1.9421768E38)
            java.lang.String r0 = r6.getString(r0)
            r1[r4] = r0
            java.lang.String r0 = r6.getString(r2, r1)
            r3.A06(r0)
            r1 = 10
            goto L_0x012b
        L_0x0045:
            r6.A00 = r0
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3.A02(r0)
            r0 = 2131887666(0x7f120632, float:1.9409946E38)
            r3.A01(r0)
            r3.A07(r4)
            r2 = 2131887849(0x7f1206e9, float:1.9410317E38)
            r1 = 87
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r6, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 86
            goto L_0x0096
        L_0x006e:
            r6.A00 = r5
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3.A02(r0)
            r0 = 2131892110(0x7f12178e, float:1.941896E38)
            r3.A01(r0)
            r3.A07(r4)
            r2 = 2131887849(0x7f1206e9, float:1.9410317E38)
            r1 = 91
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r6, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 89
        L_0x0096:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r6, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x0133
        L_0x00a0:
            X.2Iw r0 = r6.A0S
            if (r0 == 0) goto L_0x00d7
            java.util.Set r0 = r0.A00
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            X.2Iw r0 = r6.A0S
            java.util.Set r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00bb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r2.next()
            X.2Iy r1 = (X.C47432Iy) r1
            r0 = 9
            r3.append(r0)
            java.lang.CharSequence r0 = r1.A00
            r3.append(r0)
            r0 = 10
            r3.append(r0)
            goto L_0x00bb
        L_0x00d7:
            java.lang.String r2 = ""
            goto L_0x0116
        L_0x00da:
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r0 = 2131891067(0x7f12137b, float:1.9416844E38)
            r3.A01(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 88
            goto L_0x0101
        L_0x00eb:
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3.A02(r0)
            r0 = 2131891166(0x7f1213de, float:1.9417044E38)
            r3.A01(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 90
        L_0x0101:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r6, r1)
            r3.setPositiveButton(r2, r0)
            goto L_0x0133
        L_0x010a:
            int r0 = r3.length()
            int r0 = r0 - r5
            r3.setLength(r0)
            java.lang.String r2 = r3.toString()
        L_0x0116:
            X.1fu r3 = new X.1fu
            r3.<init>(r6)
            r1 = 2131892111(0x7f12178f, float:1.9418961E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
            java.lang.String r0 = r6.getString(r1, r0)
            r3.A06(r0)
            r1 = 11
        L_0x012b:
            com.facebook.redex.IDxCListenerShape161S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape161S0100000_2_I0
            r0.<init>(r6, r1)
            r3.A03(r0)
        L_0x0133:
            X.02l r0 = r3.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.EULA.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str13df);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A0K.A00();
        AnonymousClass013 r0 = this.A09;
        r0.A0B.remove(this.A0W);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0M.A02("eula");
            this.A0K.A01(this, this.A0M, "eula");
            return true;
        } else if (itemId == 1) {
            C004101u.A08(this);
            return true;
        } else if (itemId != 2) {
            return false;
        } else {
            this.A09.A0K().putBoolean("is_ls_shown_during_reg", false).commit();
            recreate();
            return true;
        }
    }

    public void onPause() {
        C50362Ze r2 = this.A0B;
        C50372Zf r1 = this.A0A;
        C18450wi.A0H(r1, 0);
        r2.A01.remove(r1);
        this.A0B.A00();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        int i2 = this.A00;
        int i3 = 6;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 8;
            }
            this.A0B.A02(this.A0A);
            this.A0B.A01(this);
        }
        AnonymousClass29T.A01(this, i3);
        this.A0B.A02(this.A0A);
        this.A0B.A01(this);
    }
}
