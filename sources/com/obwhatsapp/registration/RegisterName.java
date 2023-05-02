package com.obwhatsapp.registration;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass0y3;
import X.AnonymousClass10J;
import X.AnonymousClass10K;
import X.AnonymousClass11G;
import X.AnonymousClass120;
import X.AnonymousClass121;
import X.AnonymousClass12B;
import X.AnonymousClass12D;
import X.AnonymousClass12L;
import X.AnonymousClass130;
import X.AnonymousClass138;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass15W;
import X.AnonymousClass16U;
import X.AnonymousClass19Y;
import X.AnonymousClass1A8;
import X.AnonymousClass1BN;
import X.AnonymousClass1BQ;
import X.AnonymousClass1CS;
import X.AnonymousClass1DP;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass1KQ;
import X.AnonymousClass1NM;
import X.AnonymousClass1Sh;
import X.AnonymousClass1ZA;
import X.AnonymousClass29I;
import X.AnonymousClass29T;
import X.AnonymousClass2JH;
import X.AnonymousClass2JN;
import X.AnonymousClass2RZ;
import X.AnonymousClass2Rf;
import X.AnonymousClass2S5;
import X.AnonymousClass2v0;
import X.AnonymousClass39H;
import X.AnonymousClass468;
import X.AnonymousClass5RN;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14770pj;
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
import X.C16250si;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16340ss;
import X.C16440t3;
import X.C16490t9;
import X.C16900tq;
import X.C16980tz;
import X.C17020u3;
import X.C17130ua;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17190ug;
import X.C17220uj;
import X.C17240ul;
import X.C17250um;
import X.C17270uo;
import X.C17380uz;
import X.C17770vc;
import X.C18260wP;
import X.C18320wV;
import X.C18390wc;
import X.C18500wn;
import X.C18590ww;
import X.C18900xR;
import X.C18910xS;
import X.C18990xa;
import X.C19000xb;
import X.C19060xh;
import X.C19090xk;
import X.C19230xz;
import X.C19450yS;
import X.C19490yW;
import X.C19640yl;
import X.C19650ym;
import X.C19670yo;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C210912t;
import X.C211112v;
import X.C216114t;
import X.C220616m;
import X.C222417e;
import X.C226318r;
import X.C23061Ai;
import X.C23071Aj;
import X.C27841Ti;
import X.C27851Tj;
import X.C28961Zl;
import X.C32241fu;
import X.C33481ie;
import X.C40651uT;
import X.C41651wK;
import X.C49132Rg;
import X.C51332bS;
import X.C609436s;
import X.C612238b;
import X.C63833Lr;
import X.C63843Ls;
import X.C81954Al;
import X.C82964Ev;
import X.C83004Ez;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.PushnameEmojiBlacklistDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape102S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.HashSet;

public class RegisterName extends AnonymousClass1ZA {
    public static C51332bS A1c;
    public long A00;
    public Bitmap A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public AnonymousClass138 A05;
    public C18900xR A06;
    public AnonymousClass1KO A07;
    public AnonymousClass1CS A08;
    public C17130ua A09;
    public WaEditText A0A;
    public C19000xb A0B;
    public C19670yo A0C;
    public C17150uc A0D;
    public AnonymousClass468 A0E;
    public AnonymousClass1DP A0F;
    public AnonymousClass19Y A0G;
    public C17160ud A0H;
    public C16000sG A0I;
    public C33481ie A0J;
    public C17140ub A0K;
    public C16080sP A0L;
    public AnonymousClass120 A0M;
    public AnonymousClass152 A0N;
    public C19230xz A0O;
    public AnonymousClass12D A0P;
    public AnonymousClass16U A0Q;
    public C222417e A0R;
    public C16980tz A0S;
    public C16260sj A0T;
    public C18910xS A0U;
    public C216114t A0V;
    public C210912t A0W;
    public C16250si A0X;
    public C18590ww A0Y;
    public C19650ym A0Z;
    public C16900tq A0a;
    public AnonymousClass11G A0b;
    public AnonymousClass10K A0c;
    public C16010sH A0d;
    public C220616m A0e;
    public AnonymousClass2JH A0f;
    public C206711d A0g;
    public AnonymousClass29I A0h;
    public AnonymousClass1BQ A0i;
    public AnonymousClass1KQ A0j;
    public AnonymousClass10J A0k;
    public C226318r A0l;
    public C16490t9 A0m;
    public C19060xh A0n;
    public C17240ul A0o;
    public AnonymousClass15W A0p;
    public C17190ug A0q;
    public C19090xk A0r;
    public AnonymousClass0y3 A0s;
    public C18500wn A0t;
    public C14770pj A0u;
    public C18320wV A0v;
    public C17020u3 A0w;
    public AnonymousClass12B A0x;
    public AnonymousClass121 A0y;
    public C609436s A0z;
    public C18990xa A10;
    public AnonymousClass1A8 A11;
    public C612238b A12;
    public AnonymousClass2S5 A13;
    public AnonymousClass2v0 A14;
    public AnonymousClass39H A15;
    public AnonymousClass1KP A16;
    public C19760yx A17;
    public RegistrationScrollView A18;
    public AnonymousClass12L A19;
    public C27851Tj A1A;
    public C19640yl A1B;
    public C27841Ti A1C;
    public AnonymousClass1BN A1D;
    public C83004Ez A1E;
    public AnonymousClass1NM A1F;
    public AnonymousClass1Sh A1G;
    public C211112v A1H;
    public C19450yS A1I;
    public AnonymousClass130 A1J;
    public C17220uj A1K;
    public C17770vc A1L;
    public AnonymousClass01D A1M;
    public AnonymousClass01D A1N;
    public AnonymousClass01D A1O;
    public Integer A1P;
    public Integer A1Q;
    public Integer A1R;
    public Integer A1S;
    public boolean A1T;
    public boolean A1U = false;
    public boolean A1V;
    public boolean A1W;
    public final Handler A1X;
    public final Handler A1Y;
    public final AnonymousClass5RN A1Z;
    public final C82964Ev A1a;
    public final C41651wK A1b;

    public RegisterName() {
        super(true, true);
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 78));
        this.A1b = new IDxWAdapterShape102S0100000_2_I0(this, 3);
        this.A0J = null;
        this.A1X = new C63833Lr(Looper.getMainLooper(), this);
        this.A1Y = new C63843Ls(Looper.getMainLooper(), this);
        this.A1Z = new IDxCListenerShape203S0100000_2_I0(this, 10);
        this.A1a = new C82964Ev(this);
    }

    public void A1q() {
        if (!this.A1U) {
            this.A1U = true;
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
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            AnonymousClass01J r1 = r2.AP2;
            this.A05 = (C16440t3) r1.get();
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
            this.A01 = r3.A0F();
            this.A1H = new C211112v();
            this.A0S = (C16980tz) r2.AQB.get();
            this.A06 = (C18900xR) r2.ALD.get();
            this.A09 = (C17130ua) r2.AN9.get();
            this.A0m = (C16490t9) r2.AQz.get();
            this.A0R = (C222417e) r2.A0g.get();
            this.A0U = (C18910xS) r2.A3q.get();
            this.A0b = (AnonymousClass11G) r2.ANN.get();
            this.A0B = (C19000xb) r2.AQX.get();
            this.A1D = (AnonymousClass1BN) r2.AAp.get();
            this.A0g = (C206711d) r2.AKp.get();
            this.A10 = (C18990xa) r2.ADh.get();
            this.A07 = (AnonymousClass1KO) r2.ALY.get();
            this.A0q = (C17190ug) r2.AEu.get();
            this.A0n = (C19060xh) r2.A01.get();
            this.A0k = (AnonymousClass10J) r2.A02.get();
            this.A0H = (C17160ud) r2.A4t.get();
            this.A0I = (C16000sG) r2.A4x.get();
            this.A1K = (C17220uj) r2.A9x.get();
            this.A0r = (C19090xk) r2.AF1.get();
            this.A0L = (C16080sP) r2.AQ9.get();
            this.A11 = (AnonymousClass1A8) r2.AKL.get();
            this.A0E = new AnonymousClass468();
            this.A0K = (C17140ub) r2.A4y.get();
            this.A1L = (C17770vc) r2.A80.get();
            this.A0o = (C17240ul) r2.ABK.get();
            this.A0Q = (AnonymousClass16U) r2.A6q.get();
            this.A0l = (C226318r) r2.AQs.get();
            this.A0M = (AnonymousClass120) r2.A4z.get();
            this.A0O = (C19230xz) r2.A5B.get();
            this.A0W = (C210912t) r2.ADW.get();
            this.A1C = (C27841Ti) r2.AEH.get();
            this.A0X = (C16250si) r2.AFP.get();
            this.A0s = (AnonymousClass0y3) r2.ALd.get();
            this.A0p = (AnonymousClass15W) r2.AOC.get();
            this.A0G = (AnonymousClass19Y) r2.A4r.get();
            this.A0i = (AnonymousClass1BQ) r2.A7f.get();
            this.A0j = (AnonymousClass1KQ) r2.AAL.get();
            this.A0u = (C14770pj) r2.AF9.get();
            this.A0a = (C16900tq) r2.AFT.get();
            this.A0x = (AnonymousClass12B) r2.AJX.get();
            this.A0y = (AnonymousClass121) r2.AJY.get();
            this.A17 = (C19760yx) r2.AKx.get();
            this.A0T = (C16260sj) r2.AQe.get();
            this.A0t = C16150sX.A0u(r2);
            this.A08 = (AnonymousClass1CS) r2.ALl.get();
            this.A05 = (AnonymousClass138) r2.AJG.get();
            this.A19 = (AnonymousClass12L) r2.APo.get();
            this.A0D = (C17150uc) r2.A34.get();
            this.A1A = (C27851Tj) r2.A6u.get();
            this.A1I = (C19450yS) r2.AMl.get();
            this.A1J = (AnonymousClass130) r2.AMn.get();
            this.A0e = (C220616m) r2.A76.get();
            C18390wc builderWithExpectedSize = C17380uz.builderWithExpectedSize(2);
            builderWithExpectedSize.addAll(new HashSet());
            Object obj = r2.ABA.get();
            C16340ss.A01(obj);
            builderWithExpectedSize.add(obj);
            this.A1E = new C83004Ez(builderWithExpectedSize.build());
            this.A16 = (AnonymousClass1KP) r2.AKw.get();
            this.A0v = (C18320wV) r2.AIA.get();
            this.A0w = (C17020u3) r2.AMG.get();
            this.A1G = new AnonymousClass1Sh();
            this.A0Y = (C18590ww) r2.AFQ.get();
            this.A1O = C17270uo.A00(r3.A1n);
            this.A0N = (AnonymousClass152) r2.A51.get();
            this.A0V = (C216114t) r2.A5O.get();
            this.A0F = (AnonymousClass1DP) r2.AFu.get();
            this.A1M = C17270uo.A00(r2.A0Z);
            this.A0P = (AnonymousClass12D) r2.A5H.get();
            this.A1B = (C19640yl) r2.ACo.get();
            this.A0Z = (C19650ym) r2.AFS.get();
            this.A0C = (C19670yo) r2.AB4.get();
            this.A1F = (AnonymousClass1NM) r2.ABE.get();
            this.A1N = C17270uo.A00(r3.A0D);
            this.A0c = r2.A1V();
            this.A12 = new C612238b((C16440t3) r1.get());
        }
    }

    public void A38(boolean z2) {
        super.A38(z2);
        AnonymousClass2S5 r1 = this.A13;
        if (r1 != null && z2) {
            r1.A00(1);
        }
    }

    public void A39() {
        this.A0U.A07(false);
        this.A0Z.A01();
        this.A0O.A04();
        A36();
    }

    public void A3A() {
        Log.i("RegisterName/start");
        Editable text = this.A0A.getText();
        AnonymousClass00B.A06(text);
        String A052 = C40651uT.A05(text.toString().trim());
        for (String contains : C81954Al.A01) {
            if (A052.contains(contains)) {
                Log.w("RegisterName/checkmarks in pushname");
                Afc(PushnameEmojiBlacklistDialogFragment.A01(A052));
                return;
            }
        }
        if (A052.length() == 0) {
            Log.w("RegisterName/no-pushname");
            this.A05.A09(R.string.str137a, 0);
            return;
        }
        C51332bS r5 = A1c;
        if (r5 == null || r5.A03) {
            StringBuilder sb = new StringBuilder("RegisterName/check-sinitializer, null?");
            boolean z2 = false;
            if (r5 == null) {
                z2 = true;
            }
            sb.append(z2);
            Log.i(sb.toString());
            C211112v r37 = this.A1H;
            C16040sK r45 = this.A01;
            C16490t9 r28 = this.A0m;
            C222417e r20 = this.A0R;
            AnonymousClass11G r26 = this.A0b;
            C19000xb r44 = this.A0B;
            C16000sG r43 = this.A0I;
            C16080sP r42 = this.A0L;
            AnonymousClass013 r23 = this.A01;
            AnonymousClass468 r41 = this.A0E;
            C17770vc r39 = this.A1L;
            C17240ul r29 = this.A0o;
            AnonymousClass16U r19 = this.A0Q;
            C19230xz r40 = this.A0O;
            AnonymousClass0y3 r30 = this.A0s;
            AnonymousClass12B r33 = this.A0x;
            C19760yx r18 = this.A17;
            C15860rz r17 = this.A09;
            AnonymousClass138 r15 = this.A05;
            C19450yS r14 = this.A1I;
            C220616m r13 = this.A0e;
            C18320wV r12 = this.A0v;
            AnonymousClass1Sh r11 = this.A1G;
            C18590ww r10 = this.A0Y;
            C216114t r9 = this.A0V;
            C16290sm r8 = this.A0A;
            C51332bS r82 = new C51332bS(this.A1X, r45, r15, r44, r41, this.A0F, r43, r42, r40, this.A0P, r19, r20, r17, r8, r23, r9, r10, r26, r13, r28, r29, r30, this.A0t, r12, r33, this.A1a, r18, r11, r37, r14, r39);
            A1c = r82;
            r82.A01 = this.A00;
            this.A05.Acl(new RunnableRunnableShape0S1100000_I0(41, A052, this));
            AnonymousClass29T.A01(this, 0);
            if (((CompoundButton) findViewById(R.id.cbx_app_shortcut)).isChecked()) {
                AnonymousClass2RZ.A00(this, getString(R.string.str1cf5));
            }
            View view = this.A03;
            if (view != null) {
                view.setVisibility(4);
            }
            this.A09.A0K().putLong("com.obwhatsapp.registername.initializer_start_time", System.currentTimeMillis()).apply();
            this.A1Y.sendEmptyMessageDelayed(0, 600000);
            this.A1D.A01("home");
        }
    }

    public final void A3B() {
        Log.i("restore>RegisterName/checking for google and local backups");
        Intent className = new Intent().setClassName(getPackageName(), "com.obwhatsapp.backup.google.RestoreFromBackupActivity");
        className.setAction("action_show_restore_one_time_setup");
        startActivityForResult(className, 14);
    }

    public final void A3C() {
        View view;
        long j2 = ((SharedPreferences) this.A09.A01.get()).getLong("com.obwhatsapp.registername.initializer_start_time", -1);
        if (j2 > 0 && System.currentTimeMillis() - j2 > 600000 && (view = this.A03) != null) {
            view.setVisibility(0);
        }
    }

    public final void A3D() {
        C14870pt r3 = this.A05;
        C83004Ez r7 = this.A1E;
        C19640yl r6 = this.A1B;
        C609436s r2 = new C609436s(r3, this.A0Z, this, r6, r7);
        this.A0z = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3E() {
        /*
            r5 = this;
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166868(0x7f070694, float:1.7947994E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166866(0x7f070692, float:1.794799E38)
            float r4 = r1.getDimension(r0)
            r3 = 0
            r5.A1V = r3
            X.0sH r0 = r5.A0d
            if (r0 == 0) goto L_0x0064
            X.0sK r0 = r5.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = X.AnonymousClass27A.A00(r0)
            if (r0 != 0) goto L_0x0064
            android.widget.ImageView r1 = r5.A04
            r0 = 1
            r1.setEnabled(r0)
            android.view.View r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            X.120 r1 = r5.A0M
            X.0sH r0 = r5.A0d
            java.io.File r0 = r1.A01(r0)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0057
            X.152 r1 = r5.A0N
            X.0sH r0 = r5.A0d
            android.graphics.Bitmap r1 = r1.A00(r5, r0, r4, r2)
            if (r1 == 0) goto L_0x0053
            r3 = 1
        L_0x0053:
            r5.A1V = r3
            if (r1 != 0) goto L_0x005e
        L_0x0057:
            r0 = 2131231823(0x7f08044f, float:1.8079738E38)
            android.graphics.Bitmap r1 = X.C17160ud.A00(r5, r4, r0, r2)
        L_0x005e:
            android.widget.ImageView r0 = r5.A04
            r0.setImageBitmap(r1)
            return
        L_0x0064:
            android.widget.ImageView r0 = r5.A04
            r0.setEnabled(r3)
            android.view.View r0 = r5.A02
            r0.setVisibility(r3)
            android.graphics.Bitmap r1 = r5.A01
            if (r1 != 0) goto L_0x005e
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r2, r0)
            r5.A01 = r1
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.RegisterName.A3E():void");
    }

    public final void A3F(Integer num, Integer num2) {
        if (!this.A0T.A0E() && this.A1S.intValue() == 1) {
            this.A1S = num;
        }
        if (this.A0G.A00() && this.A1R.intValue() == 1) {
            this.A1R = num2;
        }
    }

    public final boolean A3G() {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char c2 = 0;
        if (this.A0T.A07()) {
            int i5 = ((SharedPreferences) this.A0T.A01.A01.get()).getInt("reg_skip_storage_perm", 0);
            i2 = R.string.str05a4;
            if (i5 == 2) {
                i2 = R.string.str11c4;
            }
            i3 = R.string.str11c3;
            iArr = new int[1];
            i4 = R.drawable.permission_contacts_small;
        } else {
            i2 = R.string.str11c6;
            i3 = R.string.str11c5;
            iArr = new int[3];
            iArr[0] = R.drawable.permission_contacts_small;
            iArr[1] = R.drawable.permission_plus;
            c2 = 2;
            i4 = R.drawable.permission_storage;
        }
        iArr[c2] = i4;
        return RequestPermissionActivity.A0V(this, "connect_with_friends", iArr, 17, i2, i3, R.string.str11b0, this.A0T.A0E(), !this.A0G.A00());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            java.lang.String r0 = "RegisterName/activity-result request:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " result:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = -1
            r8 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1 = 0
            r7 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 1
            r6 = 2
            switch(r11) {
                case 12: goto L_0x00fe;
                case 13: goto L_0x011b;
                case 14: goto L_0x01bb;
                case 15: goto L_0x01b5;
                case 16: goto L_0x015d;
                case 17: goto L_0x00de;
                case 18: goto L_0x003a;
                case 19: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            super.onActivityResult(r11, r12, r13)
        L_0x002d:
            return
        L_0x002e:
            if (r12 == r5) goto L_0x002d
            boolean r0 = r10.A3G()
            if (r0 == 0) goto L_0x002d
            r10.A3D()
            return
        L_0x003a:
            long r8 = java.lang.System.currentTimeMillis()
            X.0rz r0 = r10.A09
            X.01D r0 = r0.A01
            java.lang.Object r5 = r0.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r0 = "google_migrate_import_start_time"
            r2 = 0
            long r2 = r5.getLong(r0, r2)
            long r8 = r8 - r2
            if (r12 != r6) goto L_0x008c
            X.1NM r0 = r10.A1F
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)
            java.lang.String r2 = "google_migrate_ios_export_duration"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            r0.apply()
            X.1NM r0 = r10.A1F
            android.content.SharedPreferences r0 = r0.A00()
            r5 = 0
            java.lang.String r6 = r0.getString(r3, r5)
            X.1NM r0 = r10.A1F
            android.content.SharedPreferences r0 = r0.A00()
            java.lang.String r7 = r0.getString(r2, r5)
            X.1BN r3 = r10.A1D
            java.lang.String r4 = "profile_photo"
            r3.A05(r4, r5, r6, r7, r8)
            r10.A38(r1)
            return
        L_0x008c:
            if (r12 != r4) goto L_0x00c7
            X.1NM r0 = r10.A1F
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            java.lang.String r1 = "google_migrate_ios_export_duration"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            X.1NM r0 = r10.A1F
            android.content.SharedPreferences r0 = r0.A00()
            r5 = 0
            java.lang.String r6 = r0.getString(r2, r5)
            X.1NM r0 = r10.A1F
            android.content.SharedPreferences r0 = r0.A00()
            java.lang.String r7 = r0.getString(r1, r5)
            X.1BN r3 = r10.A1D
            java.lang.String r4 = "profile_photo"
            r3.A05(r4, r5, r6, r7, r8)
            r10.A39()
            return
        L_0x00c7:
            if (r12 != r7) goto L_0x002d
            X.0yx r0 = r10.A17
            r0.A08()
            android.content.Intent r1 = X.C14750ph.A06(r10)
            java.lang.String r0 = "com.obwhatsapp.registration.RegisterPhone.clear_phone_number"
            r1.putExtra(r0, r4)
            r10.startActivity(r1)
            r10.finish()
            return
        L_0x00de:
            r10.A3F(r3, r3)
            r10.A3D()
            com.obwhatsapp.WaEditText r0 = r10.A0A
            r0.A04(r1)
            X.19Y r0 = r10.A0G
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x002d
            X.0sq r2 = r10.A05
            r1 = 23
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.Acl(r0)
            return
        L_0x00fe:
            if (r12 != r5) goto L_0x002d
            java.lang.String r2 = "profile_photo"
            if (r13 == 0) goto L_0x0274
            java.lang.String r0 = "is_reset"
            boolean r0 = r13.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0138
            X.1BN r1 = r10.A1D
            java.lang.String r0 = "did_not_set"
            r1.A04(r2, r0)
            X.121 r1 = r10.A0y
            X.0sH r0 = r10.A0d
            r1.A08(r0)
            goto L_0x0159
        L_0x011b:
            X.121 r0 = r10.A0y
            X.0sb r1 = r0.A01
            java.lang.String r0 = "tmpi"
            java.io.File r0 = r1.A0N(r0)
            r0.delete()
            if (r12 == r5) goto L_0x014f
            if (r12 != 0) goto L_0x002d
            if (r13 == 0) goto L_0x0134
            X.121 r0 = r10.A0y
            r0.A03(r13, r10)
        L_0x0134:
            r0 = 0
            r10.A1Q = r0
            return
        L_0x0138:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r13.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x025b
            X.121 r0 = r10.A0y
            X.0sb r1 = r0.A01
            java.lang.String r0 = "tmpi"
            java.io.File r0 = r1.A0N(r0)
            r0.delete()
        L_0x014f:
            X.121 r1 = r10.A0y
            X.0sH r0 = r10.A0d
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x002d
        L_0x0159:
            r10.A3E()
            return
        L_0x015d:
            if (r12 != r4) goto L_0x01af
            java.lang.String r0 = "RegisterName/activity-result/successfully-restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sm r0 = r10.A0A
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "push_name"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x018a
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L_0x018a
            com.obwhatsapp.WaEditText r0 = r10.A0A
            r0.setText(r1)
            com.obwhatsapp.WaEditText r1 = r10.A0A
            int r0 = r1.length()
            r1.setSelection(r0)
        L_0x018a:
            r10.A39()
        L_0x018d:
            X.1Tj r6 = r10.A1A
            long r4 = android.os.SystemClock.elapsedRealtime()
            X.0rz r0 = r10.A09
            X.01D r0 = r0.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "direct_migration_start_time"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r4 = r4 - r0
            X.2Ep r1 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A09 = r0
            return
        L_0x01af:
            if (r12 != r6) goto L_0x018d
            r10.A3B()
            goto L_0x018d
        L_0x01b5:
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass29T.A00(r10, r0)
            return
        L_0x01bb:
            com.obwhatsapp.WaEditText r0 = r10.A0A
            r0.A04(r1)
            if (r12 != r7) goto L_0x01f4
            java.lang.String r0 = "restore>RegisterName/activity-result backup found and is being restored."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A39()
            r10.A1P = r3
            X.2S5 r0 = r10.A13
            if (r0 == 0) goto L_0x01d3
            r0.hide()
        L_0x01d3:
            X.10K r0 = r10.A0c
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01e7
            X.0sq r3 = r10.A05
            r1 = 23
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r10, (int) r1)
            r3.Acl(r0)
        L_0x01e7:
            X.1BN r3 = r10.A1D
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "no_tap"
            r3.A03(r1, r0)
            r10.A3F(r2, r2)
            return
        L_0x01f4:
            if (r12 != 0) goto L_0x0201
            java.lang.String r0 = "restore>RegisterName/activity-result restore canceled because Google Play Services were not available on the device"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2RY r0 = r10.A00
            r0.A02()
            goto L_0x01e7
        L_0x0201:
            java.lang.String r5 = "skip"
            if (r12 != r6) goto L_0x021c
            java.lang.String r0 = "restore>RegisterName/activity-result backup found but not restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A38(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r10.A1P = r0
            X.1BN r0 = r10.A1D
            java.lang.String r3 = "backup_found"
        L_0x0218:
            r0.A03(r3, r5)
            goto L_0x01e7
        L_0x021c:
            java.lang.String r3 = "no_backup_found"
            if (r12 != r4) goto L_0x0236
            java.lang.String r0 = "restore>RegisterName/activity-result no google backup found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A38(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r10.A1P = r0
            X.1BN r1 = r10.A1D
            java.lang.String r0 = "next"
            r1.A03(r3, r0)
            goto L_0x01e7
        L_0x0236:
            if (r12 != r8) goto L_0x0244
            r10.A38(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r10.A1P = r0
            X.1BN r0 = r10.A1D
            goto L_0x0218
        L_0x0244:
            java.lang.String r0 = "restore>RegisterName/activity-result unknown result code "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " from RestoreFromBackupActivity."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01e7
        L_0x025b:
            java.lang.String r1 = "photo_source"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x0274
            android.os.Bundle r0 = r13.getExtras()
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A1Q = r0
        L_0x0274:
            X.1BN r1 = r10.A1D
            java.lang.String r0 = "set_photo"
            r1.A04(r2, r0)
            X.121 r1 = r10.A0y
            r0 = 13
            r1.A04(r13, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.RegisterName.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        AnonymousClass2JH r0 = this.A0f;
        if (r0 == null || !r0.isShowing()) {
            C19980zJ.A03(this);
        } else {
            this.A0f.dismiss();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass2v0 r1 = this.A14;
        if (r1 != null) {
            r1.onCreate(r1.onSaveInstanceState());
            AnonymousClass2v0 r2 = this.A14;
            r2.A01.A03 = r2.findViewById(R.id.pay_ed_contact_support);
            A3C();
        }
        AnonymousClass2S5 r12 = this.A13;
        if (r12 != null) {
            r12.onCreate(r12.onSaveInstanceState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r4.getBoolean("started_gdrive_new_user_activity", false) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r3 = r27
            r4 = r28
            super.onCreate(r4)
            r1 = 2131891074(0x7f121382, float:1.9416858E38)
            r3.setTitle(r1)
            X.0sq r2 = r3.A05
            X.0ua r6 = r3.A09
            X.0uj r0 = r3.A1K
            X.013 r7 = r3.A01
            X.1KQ r8 = r3.A0j
            X.0zG r9 = r3.A0D
            X.39H r5 = new X.39H
            r11 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.A15 = r5
            r6 = 1
            r5 = 0
            if (r28 == 0) goto L_0x0030
            java.lang.String r0 = "started_gdrive_new_user_activity"
            boolean r2 = r4.getBoolean(r0, r5)
            r0 = 1
            if (r2 != 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r3.A1W = r0
            java.lang.String r0 = "RegisterName/create/setting up old reg flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131559671(0x7f0d04f7, float:1.8744693E38)
            r3.setContentView((int) r0)
            X.013 r2 = r3.A01
            android.view.View r0 = r3.A00
            X.AnonymousClass2JN.A0H(r0, r3, r2, r5, r5)
            X.0sC r0 = r3.A09
            int r2 = r0.A00()
            r0 = 2
            if (r2 == r0) goto L_0x0067
            r0 = 3
            if (r2 != r0) goto L_0x0061
            java.lang.String r0 = "RegisterName/create/registration already verified bounce to main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0056:
            android.content.Intent r0 = X.C14750ph.A04(r3)
        L_0x005a:
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x0061:
            java.lang.String r0 = "RegisterName/create/bad-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0056
        L_0x0067:
            X.0rz r0 = r3.A09
            java.lang.String r8 = r0.A0P()
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r3, r0)
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r4 = r3.findViewById(r0)
            com.obwhatsapp.WaTextView r4 = (com.obwhatsapp.WaTextView) r4
            r0 = 2131362210(0x7f0a01a2, float:1.8344194E38)
            android.view.View r7 = r3.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131365712(0x7f0a0f50, float:1.8351297E38)
            android.view.View r0 = r3.findViewById(r0)
            com.obwhatsapp.WaEditText r0 = (com.obwhatsapp.WaEditText) r0
            r3.A0A = r0
            r0 = 2131365704(0x7f0a0f48, float:1.835128E38)
            android.view.View r2 = r3.findViewById(r0)
            r0 = 2131362707(0x7f0a0393, float:1.8345202E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A04 = r0
            r4.setText(r1)
            r0 = 2131891073(0x7f121381, float:1.9416856E38)
            r7.setText(r0)
            r1 = 44
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r3, r1)
            r2.setOnClickListener(r0)
            if (r8 != 0) goto L_0x00c6
            java.lang.String r0 = "RegisterName/create/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0yx r0 = r3.A17
            r0.A0A(r6)
            android.content.Intent r0 = X.C14750ph.A06(r3)
            goto L_0x005a
        L_0x00c6:
            r1 = 8
            r0 = 2131366251(0x7f0a116b, float:1.835239E38)
            android.view.View r0 = r3.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131362661(0x7f0a0365, float:1.8345109E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r5)
            r0 = 2131363376(0x7f0a0630, float:1.834656E38)
            android.view.View r14 = r3.findViewById(r0)
            android.widget.ImageButton r14 = (android.widget.ImageButton) r14
            if (r14 == 0) goto L_0x0165
            X.0pd r0 = r3.A0C
            r16 = r0
            X.1Ai r15 = r3.A0B
            X.0so r13 = r3.A03
            X.0um r12 = r3.A0B
            X.11d r11 = r3.A0g
            X.01V r10 = r3.A08
            X.013 r9 = r3.A01
            X.1BQ r8 = r3.A0i
            X.0rz r7 = r3.A09
            X.0u3 r6 = r3.A0w
            r0 = 2131364431(0x7f0a0a4f, float:1.8348699E38)
            android.view.View r2 = r3.findViewById(r0)
            X.0qs r2 = (X.C15430qs) r2
            com.obwhatsapp.WaEditText r0 = r3.A0A
            X.2JH r1 = new X.2JH
            r21 = r11
            r22 = r12
            r23 = r8
            r24 = r16
            r25 = r6
            r26 = r15
            r20 = r9
            r19 = r7
            r18 = r10
            r17 = r0
            r16 = r2
            r15 = r13
            r13 = r3
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3.A0f = r1
            X.5RN r0 = r3.A1Z
            r1.A0C(r0)
            r0 = 2131363408(0x7f0a0650, float:1.8346624E38)
            android.view.View r9 = r3.findViewById(r0)
            com.obwhatsapp.emoji.search.EmojiSearchContainer r9 = (com.obwhatsapp.emoji.search.EmojiSearchContainer) r9
            X.2JH r8 = r3.A0f
            X.0um r7 = r3.A0B
            X.11d r6 = r3.A0g
            X.013 r1 = r3.A01
            X.0u3 r0 = r3.A0w
            X.29I r2 = new X.29I
            r13 = r0
            r12 = r9
            r11 = r7
            r10 = r6
            r9 = r8
            r8 = r1
            r6 = r2
            r7 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3.A0h = r2
            r1 = 8
            com.facebook.redex.IDxEListenerShape200S0100000_2_I0 r0 = new com.facebook.redex.IDxEListenerShape200S0100000_2_I0
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.2JH r2 = r3.A0f
            r1 = 25
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0E = r0
        L_0x0165:
            android.widget.ImageView r1 = r3.A04
            r0 = 2131893610(0x7f121d6a, float:1.9422001E38)
            java.lang.String r0 = r3.getString(r0)
            r1.setContentDescription(r0)
            android.widget.ImageView r2 = r3.A04
            r1 = 43
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r3, r1)
            r2.setOnClickListener(r0)
            r0 = 2131362708(0x7f0a0394, float:1.8345204E38)
            android.view.View r0 = r3.findViewById(r0)
            r3.A02 = r0
            X.0sj r0 = r3.A0T
            boolean r1 = r0.A0E()
            r0 = 1
            if (r1 != 0) goto L_0x0190
            r0 = 2
        L_0x0190:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A1S = r0
            X.19Y r0 = r3.A0G
            boolean r1 = r0.A00()
            r0 = 1
            if (r1 == 0) goto L_0x01a0
            r0 = 2
        L_0x01a0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A1R = r0
            X.2bS r0 = A1c
            if (r0 == 0) goto L_0x0274
            X.0sK r0 = r3.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            r3.A0d = r0
            r3.A3E()
            X.AnonymousClass29T.A01(r3, r5)
        L_0x01b9:
            X.013 r1 = r3.A01
            com.obwhatsapp.WaEditText r0 = r3.A0A
            X.C45902Bo.A0C(r0, r1)
            r0 = 2131364793(0x7f0a0bb9, float:1.8349433E38)
            android.view.View r10 = r3.findViewById(r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            com.obwhatsapp.WaEditText r9 = r3.A0A
            X.0um r8 = r3.A0B
            X.01V r7 = r3.A08
            X.013 r2 = r3.A01
            X.0u3 r1 = r3.A0w
            r6 = 25
            X.35O r0 = new X.35O
            r16 = 0
            r17 = 0
            r15 = 25
            r14 = r1
            r13 = r8
            r12 = r2
            r11 = r7
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9.addTextChangedListener(r0)
            com.obwhatsapp.WaEditText r2 = r3.A0A
            r0 = 1
            android.text.InputFilter[] r1 = new android.text.InputFilter[r0]
            X.4jh r0 = new X.4jh
            r0.<init>(r6)
            r1[r5] = r0
            r2.setFilters(r1)
            r0 = 2131361815(0x7f0a0017, float:1.8343393E38)
            android.view.View r6 = r3.findViewById(r0)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 2131366647(0x7f0a12f7, float:1.8353193E38)
            android.view.View r2 = r3.findViewById(r0)
            r0 = 2131361816(0x7f0a0018, float:1.8343395E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2131365703(0x7f0a0f47, float:1.8351279E38)
            android.view.View r0 = r3.findViewById(r0)
            com.obwhatsapp.registration.RegistrationScrollView r0 = (com.obwhatsapp.registration.RegistrationScrollView) r0
            r3.A18 = r0
            if (r0 == 0) goto L_0x021e
            r0.setTopAndBottomScrollingElevation(r6, r4, r2, r1)
        L_0x021e:
            X.0sq r2 = r3.A05
            r1 = 23
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            com.obwhatsapp.WaEditText r0 = r3.A0A
            r0.A04(r5)
            X.0xR r0 = r3.A06
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x025f
            java.lang.String r0 = "RegisterName/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xk r1 = r3.A0r
            X.0pj r0 = r3.A0u
            X.C46052Cd.A02(r3, r1, r0)
        L_0x0243:
            X.0yx r1 = r3.A17
            r0 = 2
            r1.A0A(r0)
            r0 = 28
            com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0 r1 = new com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0
            r1.<init>(r3, r0)
            r3.A0J = r1
            X.0ub r0 = r3.A0K
            r0.A02(r1)
            X.0rz r1 = r3.A09
            byte[] r0 = new byte[r5]
            r1.A1V(r0)
            return
        L_0x025f:
            X.0xR r0 = r3.A06
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0243
            java.lang.String r0 = "RegisterName/sw-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xk r1 = r3.A0r
            X.0pj r0 = r3.A0u
            X.C46052Cd.A03(r3, r1, r0)
            goto L_0x0243
        L_0x0274:
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L_0x028a
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "google_migrate_import_canceled"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x028a
            r3.A38(r5)
            return
        L_0x028a:
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L_0x02a0
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "google_migrate_import_success"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x02a0
            r3.A39()
            return
        L_0x02a0:
            X.10J r2 = r3.A0k
            r1 = 2989(0xbad, float:4.188E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x02d8
            X.0rz r0 = r3.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "first_party_migration_initiated"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x02d8
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "is_donor"
            r2.putExtra(r0, r5)
            r0 = 19
            r3.startActivityForResult(r2, r0)
            goto L_0x01b9
        L_0x02d8:
            boolean r0 = r3.A3G()
            if (r0 == 0) goto L_0x01b9
            r3.A3D()
            goto L_0x01b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.RegisterName.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == 0) {
            Log.i("RegisterName/dialog/initprogress");
            if (A1c == null) {
                Log.w("RegisterName/dialog/initprogress/init-null/remove");
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableRunnableShape13S0100000_I0_12((Object) this, 24), 3);
            }
            AnonymousClass2v0 r1 = new AnonymousClass2v0(this.A08, this.A05, this.A01, this);
            this.A14 = r1;
            r1.setCancelable(false);
            return this.A14;
        } else if (i2 == 1) {
            Log.w("RegisterName/dialog/failed-net");
            C32241fu r4 = new C32241fu(this);
            r4.A02(R.string.str0b80);
            r4.A06(getString(R.string.str0b7e, new Object[]{getString(R.string.str053b)}));
            r4.setPositiveButton(R.string.str0b7f, new IDxCListenerShape127S0100000_2_I0(this, 94));
            return r4.create();
        } else if (i2 == 103) {
            Log.i("RegisterName/dialog/restore");
            AnonymousClass2S5 r42 = new AnonymousClass2S5(this, this.A08, this.A05, this.A01, this.A0X, this.A0a, this, this.A17);
            this.A13 = r42;
            r42.setCancelable(false);
            this.A05.Acl(new RunnableRunnableShape0S1100000_I0(40, C28961Zl.A01(this.A01, this.A0X.A07()).toString(), this));
            return this.A13;
        } else if (i2 != 109) {
            return super.onCreateDialog(i2);
        } else {
            Log.w("RegisterName/dialog/cant-connect");
            C16320sq r12 = this.A05;
            return AnonymousClass2JN.A03(this, this.A07, this.A07, this.A08, this.A0T, this.A0p, this.A16, r12);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str13df);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (isFinishing()) {
            this.A0u.A08();
        }
        C33481ie r1 = this.A0J;
        if (r1 != null) {
            this.A0K.A03(r1);
            this.A0J = null;
        }
        C609436s r12 = this.A0z;
        if (r12 != null) {
            r12.A00 = null;
            r12.A06(true);
            this.A0z = null;
        }
        this.A15.A00();
        RegistrationScrollView registrationScrollView = this.A18;
        if (registrationScrollView != null) {
            registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A09);
            if (registrationScrollView.A02 != null) {
                registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A02);
            }
            this.A18 = null;
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A19.A02("register-name");
            this.A15.A01(this, this.A19, "register-name");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A17.A08();
            startActivity(C14750ph.A01(this));
            finishAffinity();
            return true;
        }
    }

    public void onPause() {
        Handler handler;
        super.onPause();
        C51332bS r2 = A1c;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            handler.removeMessages(0);
            r2.A02 = null;
        }
        Integer num = this.A1P;
        if (num != null) {
            C15860rz r0 = this.A09;
            r0.A0K().putInt("reg_backup_status_key", num.intValue()).apply();
        }
        Integer num2 = this.A1Q;
        if (num2 != null) {
            C15860rz r02 = this.A09;
            r02.A0K().putInt("reg_profile_pic_source_key", num2.intValue()).apply();
        }
        if (this.A1T) {
            this.A09.A0K().putBoolean("reg_profile_pic_tapped_key", true).apply();
        }
    }

    public void onResume() {
        super.onResume();
        if (A1c != null) {
            AnonymousClass29T.A01(this, 0);
            C51332bS r2 = A1c;
            Handler handler = this.A1X;
            if (r2.A03) {
                handler.sendEmptyMessage(0);
            }
            r2.A02 = handler;
            A3C();
        }
        if (this.A09.A01() && this.A14 == null) {
            AnonymousClass29T.A01(this, 0);
            Log.i("RegisterName/resume reg verified; explicitly display continue screen");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A1W);
    }
}
