package com.obwhatsapp.backup.google;

import X.AnonymousClass01V;
import X.AnonymousClass124;
import X.AnonymousClass12N;
import X.AnonymousClass12P;
import X.AnonymousClass12Q;
import X.AnonymousClass12U;
import X.AnonymousClass12W;
import X.AnonymousClass15P;
import X.AnonymousClass19Y;
import X.AnonymousClass2Rf;
import X.AnonymousClass2YL;
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
import X.C16200sd;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16980tz;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19670yo;
import X.C19950zG;
import X.C19980zJ;
import X.C210912t;
import X.C23061Ai;
import X.C23071Aj;
import X.C447725m;
import X.C49132Rg;
import android.content.ActivityNotFoundException;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatSpinner;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public final class GoogleDriveNewUserSetupActivity extends AnonymousClass2YL {
    public int A00;
    public View A01;
    public Button A02;
    public RadioGroup A03;
    public AppCompatSpinner A04;
    public List A05;
    public boolean A06;
    public RadioButton[] A07;
    public final ViewTreeObserver.OnGlobalLayoutListener A08;

    public GoogleDriveNewUserSetupActivity() {
        this(0);
        this.A00 = -1;
        this.A08 = new IDxLListenerShape144S0100000_2_I0(this, 2);
    }

    public GoogleDriveNewUserSetupActivity(int i2) {
        this.A06 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 18));
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
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
            this.A0L = (C16980tz) r1.AQB.get();
            this.A0O = (C16490t9) r1.AQz.get();
            this.A0P = (AnonymousClass124) r1.ALe.get();
            this.A0Q = (AnonymousClass12P) r1.ARD.get();
            this.A0D = (C16200sd) r1.A7h.get();
            this.A0K = (AnonymousClass12W) r1.AEM.get();
            this.A0N = (C210912t) r1.ADW.get();
            this.A0J = (AnonymousClass19Y) r1.A4r.get();
            this.A0F = (AnonymousClass12U) r1.AB5.get();
            this.A0M = (C16260sj) r1.AQe.get();
            this.A0E = (C19670yo) r1.AB4.get();
            this.A0H = (AnonymousClass12Q) r1.AB8.get();
            this.A0G = (AnonymousClass12N) r1.AB7.get();
        }
    }

    public void A35() {
        super.A35();
        if (this.A00 != 0) {
            A3G(false);
            A3E();
            this.A00 = -1;
        }
    }

    public final void A3D() {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        int dimensionPixelSize = point.x - getResources().getDimensionPixelSize(R.dimen.dimen0405);
        for (RadioButton width : this.A07) {
            width.setWidth(dimensionPixelSize);
        }
    }

    public final void A3E() {
        this.A03.clearCheck();
        this.A04.setSelection(this.A05.size() - 1, true);
    }

    public final void A3F(RadioButton radioButton, String str) {
        int i2 = 2;
        String.format("gdrive-new-user-setup/freq-option-changed item:%s radioBtn:%s", new Object[]{str, radioButton});
        if (getString(R.string.str1556).equals(str)) {
            i2 = 1;
        } else if (!getString(R.string.str155a).equals(str)) {
            if (getString(R.string.str1558).equals(str)) {
                i2 = 3;
            } else if (getString(R.string.str1559).equals(str)) {
                i2 = 0;
            } else {
                StringBuilder sb = new StringBuilder("gdrive-new-user-setup/create/unexpected-backup-frequency/");
                sb.append(str);
                Log.i(sb.toString());
                i2 = -1;
            }
        }
        int i3 = this.A00;
        this.A00 = i2;
        if (radioButton != null) {
            A3E();
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A05.indexOf(radioButton.getText().toString()));
        }
        A3G(true);
        if ((i3 == -1 || i3 == 0 || this.A09.A0M() == null) && i2 != 0 && i2 != -1) {
            this.A01.performClick();
        }
    }

    public final void A3G(boolean z2) {
        int i2;
        if (this.A02 == null) {
            Log.e("gdrive-new-user-setup/update-setup-btn/setup-btn-is-null");
            return;
        }
        C447725m r3 = new C447725m(getResources().getDrawable(R.drawable.chevron), this.A01);
        if (z2) {
            this.A02.setTextColor(getResources().getColor(R.color.color0659));
            r3.setColorFilter(getResources().getColor(R.color.color0659), PorterDuff.Mode.SRC_ATOP);
            i2 = MotionEventCompat.ACTION_MASK;
        } else {
            int color = getResources().getColor(R.color.color070b);
            this.A02.setTextColor(color);
            r3.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            i2 = color >>> 24;
        }
        r3.setAlpha(i2);
        boolean z3 = !this.A01.A0T();
        Button button = this.A02;
        if (z3) {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, r3, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds(r3, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void APm(int i2) {
        if (i2 == 14) {
            this.A00 = 0;
            this.A02.performClick();
            return;
        }
        super.APm(i2);
    }

    public void onBackPressed() {
        try {
            C19980zJ.A03(this);
        } catch (ActivityNotFoundException e2) {
            Log.e("gdrive-new-user-setup/back-pressed", e2);
            this.A05.A09(R.string.str0996, 1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        List list;
        int i2;
        super.onConfigurationChanged(configuration);
        A3D();
        int i3 = this.A00;
        if (i3 == 0) {
            list = this.A05;
            i2 = R.string.str1559;
        } else if (i3 == 1) {
            list = this.A05;
            i2 = R.string.str1556;
        } else if (i3 != 2) {
            if (i3 == 3) {
                list = this.A05;
                i2 = R.string.str1558;
            }
            A3E();
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A08);
        } else {
            list = this.A05;
            i2 = R.string.str155a;
        }
        int indexOf = list.indexOf(getString(i2));
        if (indexOf >= 0) {
            RadioButton radioButton = this.A07[indexOf];
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A05.indexOf(radioButton.getText().toString()));
            this.A04.setSelection(indexOf);
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A08);
        }
        A3E();
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A08);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
        jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:2:0x00ec
        	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
        	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
        	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
        	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
        */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            X.0yo r0 = r9.A0E
            boolean r0 = r0.A0B()
            java.lang.String r0 = "gdrive-new-user-setup/create no need to display GoogleDriveNewUserSetupActivity, exiting."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            r9.setResult(r0)
            r9.finish()
            return
            r0 = 2131888542(0x7f12099e, float:1.9411722E38)
            r9.setTitle(r0)
            X.02i r0 = r9.x()
            r6 = 0
            r0.A0N(r6)
            r0 = 2131366163(0x7f0a1113, float:1.8352212E38)
            android.view.View r0 = r9.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131366169(0x7f0a1119, float:1.8352224E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131366168(0x7f0a1118, float:1.8352222E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131366170(0x7f0a111a, float:1.8352226E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131364114(0x7f0a0912, float:1.8348056E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131363833(0x7f0a07f9, float:1.8347486E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r6)
            r0 = 2131363834(0x7f0a07fa, float:1.8347488E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r6)
            r0 = 2131363830(0x7f0a07f6, float:1.834748E38)
            android.view.View r4 = r9.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = 2131888536(0x7f120998, float:1.941171E38)
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 2131893652(0x7f121d94, float:1.9422087E38)
            java.lang.String r0 = r9.getString(r0)
            r2[r6] = r0
            r0 = 2131891508(0x7f121534, float:1.9417738E38)
            java.lang.String r0 = r9.getString(r0)
            r7 = 1
            r2[r7] = r0
            r1 = 2
            r0 = 2131891497(0x7f121529, float:1.9417716E38)
            java.lang.String r0 = r9.getString(r0)
            r2[r1] = r0
            java.lang.String r0 = r9.getString(r3, r2)
            r4.setText(r0)
            r4.setVisibility(r6)
            r0 = 2131362156(0x7f0a016c, float:1.8344085E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r6)
            r0 = 2131366164(0x7f0a1114, float:1.8352214E38)
            android.view.View r1 = r9.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r6)
            r0 = 2131888535(0x7f120997, float:1.9411708E38)
            r1.setText(r0)
            r0 = 2131366166(0x7f0a1116, float:1.8352218E38)
            android.view.View r1 = r9.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131888533(0x7f120995, float:1.9411704E38)
            r1.setText(r0)
            r0 = 2131366167(0x7f0a1117, float:1.835222E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.A01 = r0
            r0 = 2131363831(0x7f0a07f7, float:1.8347482E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r9.A03 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.A05 = r0
            int[] r5 = com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel.A0f
            int r4 = r5.length
            r3 = 0
        L_0x00ec:
            if (r3 >= r4) goto L_0x0106
            r2 = r5[r3]
            r0 = 2131891543(0x7f121557, float:1.941781E38)
            if (r2 == r0) goto L_0x0103
            r0 = 2131891545(0x7f121559, float:1.9417813E38)
            if (r2 == r0) goto L_0x0103
            java.util.List r1 = r9.A05
            java.lang.String r0 = r9.getString(r2)
            r1.add(r0)
        L_0x0103:
            int r3 = r3 + 1
            goto L_0x00ec
        L_0x0106:
            java.util.List r1 = r9.A05
            r0 = 2131891545(0x7f121559, float:1.9417813E38)
            java.lang.String r0 = r9.getString(r0)
            r1.add(r0)
            java.util.List r1 = r9.A05
            r0 = 2131888541(0x7f12099d, float:1.941172E38)
            java.lang.String r0 = r9.getString(r0)
            r1.add(r0)
            android.widget.RadioGroup r0 = r9.A03
            r0.setVisibility(r6)
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            java.util.List r0 = r9.A05
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r9, r2, r0)
            r0 = 17367049(0x1090009, float:2.516295E-38)
            r1.setDropDownViewResource(r0)
            r0 = 2131363832(0x7f0a07f8, float:1.8347484E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.appcompat.widget.AppCompatSpinner r0 = (androidx.appcompat.widget.AppCompatSpinner) r0
            r9.A04 = r0
            r0.setAdapter(r1)
            androidx.appcompat.widget.AppCompatSpinner r1 = r9.A04
            java.util.List r0 = r9.A05
            int r0 = r0.size()
            int r0 = r0 - r7
            r1.setSelection(r0)
            androidx.appcompat.widget.AppCompatSpinner r1 = r9.A04
            X.4lL r0 = new X.4lL
            r0.<init>(r9)
            r1.setOnItemSelectedListener(r0)
            android.view.LayoutInflater r8 = X.AnonymousClass01V.A01(r9)
            X.AnonymousClass00B.A06(r8)
            java.util.List r0 = r9.A05
            int r0 = r0.size()
            int r0 = r0 - r7
            android.widget.RadioButton[] r0 = new android.widget.RadioButton[r0]
            r9.A07 = r0
            android.widget.RadioGroup r1 = r9.A03
            r0 = 2131559104(0x7f0d02c0, float:1.8743543E38)
            r7 = 2131559104(0x7f0d02c0, float:1.8743543E38)
            r5 = 0
            android.view.View r0 = r8.inflate(r0, r5)
            r1.addView(r0)
            r4 = 0
        L_0x017a:
            android.widget.RadioButton[] r0 = r9.A07
            int r0 = r0.length
            if (r4 >= r0) goto L_0x01b0
            java.util.List r0 = r9.A05
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 2131559105(0x7f0d02c1, float:1.8743545E38)
            android.view.View r2 = r8.inflate(r0, r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r3)
            android.widget.RadioGroup r0 = r9.A03
            r0.addView(r2)
            android.widget.RadioGroup r1 = r9.A03
            android.view.View r0 = r8.inflate(r7, r5)
            r1.addView(r0)
            android.widget.RadioButton[] r0 = r9.A07
            r0[r4] = r2
            com.facebook.redex.ViewOnClickCListenerShape1S1200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S1200000_I0
            r0.<init>(r9, r3, r2, r6)
            r2.setOnClickListener(r0)
            int r4 = r4 + 1
            goto L_0x017a
        L_0x01b0:
            r9.A3D()
            r0 = 2131363829(0x7f0a07f5, float:1.8347478E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r9.A02 = r0
            r0.setVisibility(r6)
            r9.A3G(r6)
            android.widget.Button r2 = r9.A02
            r1 = 19
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r0.<init>((java.lang.Object) r9, (int) r1)
            r2.setOnClickListener(r0)
            android.widget.RadioGroup r0 = r9.A03
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r9.A08
            r1.addOnGlobalLayoutListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity.onCreate(android.os.Bundle):void");
    }
}
