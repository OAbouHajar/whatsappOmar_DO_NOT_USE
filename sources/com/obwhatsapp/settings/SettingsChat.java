package com.obwhatsapp.settings;

import X.AnonymousClass01V;
import X.AnonymousClass12W;
import X.AnonymousClass15P;
import X.AnonymousClass29R;
import X.AnonymousClass2Rf;
import X.AnonymousClass2UF;
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
import X.C16210se;
import X.C16220sf;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17250um;
import X.C18260wP;
import X.C18800xH;
import X.C19490yW;
import X.C19670yo;
import X.C19950zG;
import X.C19980zJ;
import X.C210912t;
import X.C222417e;
import X.C23061Ai;
import X.C23071Aj;
import X.C29501aj;
import X.C32301g2;
import X.C45842Bi;
import X.C49132Rg;
import X.C49282Sg;
import X.C89234bo;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape415S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.obwhatsapp.R;
import java.util.HashSet;
import java.util.Set;

public class SettingsChat extends C45842Bi implements C49282Sg {
    public TextView A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public C18800xH A03;
    public C19670yo A04;
    public C222417e A05;
    public AnonymousClass12W A06;
    public C16260sj A07;
    public C210912t A08;
    public C16490t9 A09;
    public C89234bo A0A;
    public SettingsChatViewModel A0B;
    public SettingsRowIconText A0C;
    public SettingsRowIconText A0D;
    public C16220sf A0E;
    public C16210se A0F;
    public boolean A0G;
    public boolean A0H;
    public String[] A0I;
    public String[] A0J;
    public final C32301g2 A0K;
    public final AnonymousClass29R A0L;
    public final Set A0M;

    public SettingsChat() {
        this(0);
        this.A0L = new IDxSListenerShape415S0100000_2_I0(this, 1);
        this.A0M = new HashSet();
        this.A0K = new IDxSCallbackShape221S0100000_2_I0(this, 4);
    }

    public SettingsChat(int i2) {
        this.A0G = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 87));
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
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
            this.A09 = (C16490t9) r1.AQz.get();
            this.A05 = (C222417e) r1.A0g.get();
            this.A0F = (C16210se) r1.AQr.get();
            this.A03 = (C18800xH) r1.A1Z.get();
            this.A0E = (C16220sf) r1.A3y.get();
            this.A06 = (AnonymousClass12W) r1.AEM.get();
            this.A08 = (C210912t) r1.ADW.get();
            this.A07 = (C16260sj) r1.AQe.get();
            this.A04 = (C19670yo) r1.AB4.get();
        }
    }

    public void A2Y(Configuration configuration) {
        if (!this.A0H) {
            super.A2Y(configuration);
        }
    }

    public final int A35(String[] strArr) {
        int A002 = C29501aj.A00(((SharedPreferences) this.A09.A01.get()).getString("interface_font_size", "0"), 0);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (A002 == Integer.valueOf(strArr[i2]).intValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final void A36() {
        SettingsRowIconText settingsRowIconText;
        String string;
        if (this.A0C != null) {
            if (this.A04.A0A()) {
                settingsRowIconText = this.A0C;
                string = null;
            } else if (this.A07.A0B()) {
                SettingsChatViewModel settingsChatViewModel = this.A0B;
                settingsChatViewModel.A02.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) settingsChatViewModel, 28));
                return;
            } else {
                settingsRowIconText = this.A0C;
                string = getString(R.string.str1593);
            }
            settingsRowIconText.setSubText(string);
        }
    }

    public void AXH(int i2, int i3) {
        if (i2 == 1) {
            this.A09.A0K().putString("interface_font_size", String.valueOf(Integer.valueOf(this.A0J[i3]).intValue())).apply();
            this.A00.setText(this.A0I[i3]);
        } else if (i2 == 2 && this.A0A.A02(i3)) {
            this.A0D.setSubText(this.A0A.A00());
            finish();
            Settings.reset = true;
            overridePendingTransition(0, R.anim.anim0030);
            this.A0H = true;
            startActivity(getIntent());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047 A[LOOP:0: B:12:0x0047->B:15:0x0057, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x003e
            if (r5 == 0) goto L_0x003e
            java.lang.String r0 = "oom"
            r1 = 0
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131888213(0x7f120855, float:1.9411055E38)
            r2.Afg(r0)
        L_0x0018:
            java.lang.String r0 = "no-space"
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            r2.Afg(r0)
        L_0x002b:
            java.lang.String r0 = "io-error"
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            r2.Afg(r0)
        L_0x003e:
            super.onActivityResult(r3, r4, r5)
            java.util.Set r0 = r2.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x0047:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()
            X.2Su r0 = (X.AnonymousClass2Su) r0
            boolean r0 = r0.AM4(r5, r3, r4)
            if (r0 == 0) goto L_0x0047
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.A0H) {
            super.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0172, code lost:
        if (r2 == 2) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r10 = r17
            r0 = r18
            super.onCreate(r0)
            X.02z r1 = new X.02z
            r1.<init>(r10)
            java.lang.Class<com.obwhatsapp.settings.SettingsChatViewModel> r0 = com.obwhatsapp.settings.SettingsChatViewModel.class
            X.01n r0 = r1.A01(r0)
            com.obwhatsapp.settings.SettingsChatViewModel r0 = (com.obwhatsapp.settings.SettingsChatViewModel) r0
            r10.A0B = r0
            r0 = 2131891508(0x7f121534, float:1.9417738E38)
            r10.setTitle(r0)
            r0 = 2131559618(0x7f0d04c2, float:1.8744585E38)
            r10.setContentView((int) r0)
            X.013 r2 = r10.A01
            X.0rz r1 = r10.A09
            X.4bo r0 = new X.4bo
            r0.<init>(r10, r1, r2)
            r10.A0A = r0
            X.02i r1 = r10.x()
            X.AnonymousClass00B.A06(r1)
            r0 = 1
            r1.A0N(r0)
            android.view.View r1 = r10.A00
            r0 = 2131363496(0x7f0a06a8, float:1.8346802E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A01 = r0
            android.view.View r1 = r10.A00
            r0 = 2131364549(0x7f0a0ac5, float:1.8348938E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A02 = r0
            android.view.View r1 = r10.A00
            r0 = 2131363737(0x7f0a0799, float:1.8347291E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A00 = r0
            android.view.View r1 = r10.A00
            r0 = 2131366192(0x7f0a1130, float:1.835227E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.settings.SettingsRowIconText r0 = (com.obwhatsapp.settings.SettingsRowIconText) r0
            r10.A0D = r0
            android.view.View r1 = r10.A00
            r0 = 2131367067(0x7f0a149b, float:1.8354045E38)
            android.view.View r7 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131363495(0x7f0a06a7, float:1.83468E38)
            android.view.View r6 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131363736(0x7f0a0798, float:1.834729E38)
            android.view.View r4 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131364548(0x7f0a0ac4, float:1.8348936E38)
            android.view.View r8 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131362722(0x7f0a03a2, float:1.8345233E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.settings.SettingsRowIconText r0 = (com.obwhatsapp.settings.SettingsRowIconText) r0
            r10.A0C = r0
            android.view.View r1 = r10.A00
            r0 = 2131362725(0x7f0a03a5, float:1.8345239E38)
            android.view.View r5 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131362729(0x7f0a03a9, float:1.8345247E38)
            android.view.View r3 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.settings.SettingsRowIconText r2 = r10.A0D
            r1 = 32
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.setOnClickListener(r0)
            com.obwhatsapp.settings.SettingsRowIconText r1 = r10.A0D
            X.4bo r0 = r10.A0A
            java.lang.String r0 = r0.A00()
            r1.setSubText(r0)
            r1 = 29
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r6.setOnClickListener(r0)
            androidx.appcompat.widget.SwitchCompat r1 = r10.A01
            X.0rz r0 = r10.A09
            boolean r0 = r0.A1W()
            r1.setChecked(r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903054(0x7f03000e, float:1.7412915E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r10.A0I = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903055(0x7f03000f, float:1.7412917E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r10.A0J = r0
            int r2 = r10.A35(r0)
            if (r2 < 0) goto L_0x0104
            android.widget.TextView r1 = r10.A00
            java.lang.String[] r0 = r10.A0I
            r0 = r0[r2]
            r1.setText(r0)
        L_0x0104:
            r1 = 34
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r4.setOnClickListener(r0)
            r0 = 2131362726(0x7f0a03a6, float:1.834524E38)
            android.view.View r6 = X.AnonymousClass00T.A05(r10, r0)
            com.obwhatsapp.components.WaSwitchView r6 = (com.obwhatsapp.components.WaSwitchView) r6
            r0 = 2131365665(0x7f0a0f21, float:1.8351202E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r10, r0)
            r0 = 2131362054(0x7f0a0106, float:1.8343878E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r10, r0)
            X.0rz r0 = r10.A09
            boolean r0 = r0.A1b()
            if (r0 == 0) goto L_0x024e
            X.0sK r0 = r10.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x024e
            r9 = 0
            r6.setVisibility(r9)
            X.0rz r0 = r10.A09
            boolean r0 = r0.A1c()
            r0 = r0 ^ 1
            r6.setChecked(r0)
            r1 = 4
            com.facebook.redex.IDxCListenerShape219S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape219S0100000_2_I0
            r0.<init>(r10, r1)
            r6.setOnCheckedChangeListener(r0)
            r1 = 26
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r6, (int) r1)
            r6.setOnClickListener(r0)
            r4.setVisibility(r9)
            r2.setVisibility(r9)
            r10.scrollToArchiveSettingIfNeeded(r6)
        L_0x0160:
            r4 = 0
            r8.setVisibility(r4)
            androidx.appcompat.widget.SwitchCompat r6 = r10.A02
            X.0sf r0 = r10.A0E
            X.1WS r0 = r0.A03()
            int r2 = r0.A01
            if (r2 == 0) goto L_0x0174
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0175
        L_0x0174:
            r0 = 1
        L_0x0175:
            r6.setChecked(r0)
            r1 = 27
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r8.setOnClickListener(r0)
            r1 = 31
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r7.setOnClickListener(r0)
            X.0sK r0 = r10.A01
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0238
            com.obwhatsapp.settings.SettingsRowIconText r1 = r10.A0C
            r0 = 8
            r1.setVisibility(r0)
        L_0x019b:
            r1 = 28
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r5.setOnClickListener(r0)
            X.0pd r2 = r10.A0C
            r1 = 2870(0xb36, float:4.022E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x01be
            r3.setVisibility(r4)
            r1 = 33
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r3.setOnClickListener(r0)
        L_0x01be:
            X.0pt r12 = r10.A05
            X.4xZ r13 = new X.4xZ
            r13.<init>(r12)
            X.46b r14 = new X.46b
            r14.<init>()
            X.01V r15 = r10.A08
            X.0se r0 = r10.A0F
            X.3Ek r9 = new X.3Ek
            r11 = r10
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.util.Set r0 = r10.A0M
            r0.add(r9)
            com.obwhatsapp.settings.SettingsChatViewModel r0 = r10.A0B
            X.027 r2 = r0.A00
            r1 = 282(0x11a, float:3.95E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.A0A(r10, r0)
            android.content.Intent r5 = r10.getIntent()
            if (r5 == 0) goto L_0x021c
            java.lang.String r4 = "page"
            java.lang.String r2 = r5.getStringExtra(r4)
            if (r2 == 0) goto L_0x021c
            java.lang.String r0 = "font"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0223
            java.lang.String r0 = "theme"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x021d
            java.lang.String r1 = "SettingChat/Deeplink entry point: Entrypoint unsupported: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0219:
            r5.removeExtra(r4)
        L_0x021c:
            return
        L_0x021d:
            X.4bo r0 = r10.A0A
            r0.A01(r10)
            goto L_0x0219
        L_0x0223:
            java.lang.String[] r0 = r10.A0J
            int r3 = r10.A35(r0)
            r2 = 1
            r1 = 2131891527(0x7f121547, float:1.9417777E38)
            r0 = 2130903054(0x7f03000e, float:1.7412915E38)
            com.obwhatsapp.SingleSelectionDialogFragment r0 = com.obwhatsapp.SingleSelectionDialogFragment.A02(r2, r1, r3, r0)
            r10.Afc(r0)
            goto L_0x0219
        L_0x0238:
            X.0yo r0 = r10.A04
            boolean r0 = r0.A0A()
            com.obwhatsapp.settings.SettingsRowIconText r2 = r10.A0C
            r1 = 35
            r1 = 30
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r0 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.setOnClickListener(r0)
            goto L_0x019b
        L_0x024e:
            r0 = 8
            r6.setVisibility(r0)
            r4.setVisibility(r0)
            r2.setVisibility(r0)
            goto L_0x0160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsChat.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        return i2 != 600 ? i2 != 602 ? super.onCreateDialog(i2) : AnonymousClass2UF.A01(this) : AnonymousClass2UF.A00(this);
    }

    public void onPause() {
        AnonymousClass12W r0 = this.A06;
        AnonymousClass29R r1 = this.A0L;
        if (r1 != null) {
            r0.A07.remove(r1);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        AnonymousClass12W r0 = this.A06;
        AnonymousClass29R r1 = this.A0L;
        if (r1 != null) {
            r0.A07.add(r1);
        }
        A36();
    }

    public final void scrollToArchiveSettingIfNeeded(View view) {
        Intent intent = getIntent();
        if (intent != null && "archived_chats".equals(intent.getStringExtra("scroll_to_setting"))) {
            view.getParent().requestChildFocus(view, view);
        }
    }
}
