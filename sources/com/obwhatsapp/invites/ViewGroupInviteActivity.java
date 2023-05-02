package com.obwhatsapp.invites;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass11A;
import X.AnonymousClass124;
import X.AnonymousClass15P;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Oo;
import X.AnonymousClass2Rf;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
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
import X.C16460t6;
import X.C17190ug;
import X.C17200uh;
import X.C17240ul;
import X.C17250um;
import X.C17780vd;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C30071bh;
import X.C33501ig;
import X.C48702Op;
import X.C49132Rg;
import X.C76633uR;
import X.C84824Ma;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.jid.UserJid;

public class ViewGroupInviteActivity extends C14530pL implements AnonymousClass2Oo {
    public int A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public C16000sG A08;
    public C16080sP A09;
    public AnonymousClass2Ao A0A;
    public C17200uh A0B;
    public AnonymousClass013 A0C;
    public C15810rt A0D;
    public AnonymousClass11A A0E;
    public C16460t6 A0F;
    public C16070sO A0G;
    public C17240ul A0H;
    public C17780vd A0I;
    public C48702Op A0J;
    public C16050sL A0K;
    public UserJid A0L;
    public C17190ug A0M;
    public AnonymousClass124 A0N;
    public C84824Ma A0O;
    public C30071bh A0P;
    public Runnable A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C33501ig A0T;

    public ViewGroupInviteActivity() {
        this(0);
        this.A0T = new IDxCObserverShape72S0100000_2_I0(this, 13);
    }

    public ViewGroupInviteActivity(int i2) {
        this.A0S = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 57));
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
            this.A0D = (C15810rt) r1.A43.get();
            this.A0N = (AnonymousClass124) r1.ALe.get();
            this.A0B = (C17200uh) r1.A52.get();
            this.A0M = (C17190ug) r1.AEu.get();
            this.A08 = (C16000sG) r1.A4x.get();
            this.A09 = (C16080sP) r1.AQ9.get();
            this.A0C = (AnonymousClass013) r1.AR8.get();
            this.A0F = (C16460t6) r1.A5k.get();
            this.A0H = (C17240ul) r1.ABK.get();
            this.A0I = C16150sX.A0p(r1);
            this.A0E = (AnonymousClass11A) r1.A5U.get();
            this.A0G = (C16070sO) r1.ABY.get();
        }
    }

    public final void A35(int i2) {
        this.A06.setText(i2);
        this.A04.setVisibility(4);
        this.A02.setVisibility(0);
        this.A03.setVisibility(4);
        this.A01.setVisibility(8);
    }

    public void AWc(UserJid userJid) {
        this.A07.setText(R.string.str1477);
        this.A04.setVisibility(0);
        this.A03.setVisibility(4);
        C16320sq r1 = this.A05;
        C16440t3 r5 = this.A05;
        C14870pt r4 = this.A05;
        C17780vd r6 = this.A0I;
        C16050sL r8 = this.A0K;
        AnonymousClass00B.A06(r8);
        r1.Ack(new C76633uR(r4, r5, r6, this, r8, userJid), new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        if (r1 == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r12 = r21
            r0 = r22
            super.onCreate(r0)
            android.content.Intent r6 = r12.getIntent()
            java.lang.String r4 = "from_me"
            boolean r1 = r6.hasExtra(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0077
            java.lang.String r3 = "key_remote_jid"
            boolean r1 = r6.hasExtra(r3)
            if (r1 == 0) goto L_0x0077
            java.lang.String r2 = "key_id"
            boolean r1 = r6.hasExtra(r2)
            if (r1 == 0) goto L_0x0077
            boolean r1 = r6.getBooleanExtra(r4, r0)
            r12.A0R = r1
            java.lang.String r1 = r6.getStringExtra(r3)
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r1)
            r12.A0L = r1
            java.lang.String r1 = "group_type"
            int r1 = r6.getIntExtra(r1, r0)
            r12.A00 = r1
            com.whatsapp.jid.UserJid r5 = r12.A0L
            if (r5 == 0) goto L_0x0077
            X.0t6 r4 = r12.A0F
            boolean r3 = r12.A0R
            java.lang.String r1 = r6.getStringExtra(r2)
            X.1Vw r2 = new X.1Vw
            r2.<init>(r5, r1, r3)
            X.0th r1 = r4.A0K
            X.0tZ r4 = r1.A03(r2)
            boolean r1 = r4 instanceof X.C30071bh
            if (r1 == 0) goto L_0x0077
            X.1bh r4 = (X.C30071bh) r4
            r12.A0P = r4
            X.0sL r14 = r4.A02
            r12.A0K = r14
            r6 = 1
            if (r14 != 0) goto L_0x007b
            X.0pt r2 = r12.A05
            X.0ul r1 = r12.A0H
            int r0 = r4.A00
            boolean r1 = r1.A0d(r0)
            r0 = 2131888307(0x7f1208b3, float:1.9411246E38)
            if (r1 != 0) goto L_0x0074
        L_0x0071:
            r0 = 2131888306(0x7f1208b2, float:1.9411244E38)
        L_0x0074:
            r2.A09(r0, r6)
        L_0x0077:
            r12.finish()
            return
        L_0x007b:
            X.1Vw r1 = r4.A11
            X.0rv r1 = r1.A00
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.of(r1)
            java.lang.String r3 = r4.A06
            if (r3 == 0) goto L_0x009b
            if (r15 == 0) goto L_0x009b
            long r1 = r4.A01
            X.4Ma r13 = new X.4Ma
            r16 = r3
            r17 = r1
            r13.<init>(r14, r15, r16, r17)
        L_0x0094:
            r12.A0O = r13
            if (r13 != 0) goto L_0x009d
            X.0pt r2 = r12.A05
            goto L_0x0071
        L_0x009b:
            r13 = 0
            goto L_0x0094
        L_0x009d:
            r1 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r12.setTitle(r1)
            r1 = 2131559888(0x7f0d05d0, float:1.8745133E38)
            r12.setContentView((int) r1)
            r1 = 2131364166(0x7f0a0946, float:1.8348161E38)
            android.view.View r5 = r12.findViewById(r1)
            r2 = 2131362144(0x7f0a0160, float:1.834406E38)
            android.view.View r4 = r12.findViewById(r2)
            android.view.ViewTreeObserver r3 = r5.getViewTreeObserver()
            com.facebook.redex.IDxLListenerShape25S0300000_2_I0 r2 = new com.facebook.redex.IDxLListenerShape25S0300000_2_I0
            r2.<init>(r5, r4, r12, r6)
            r3.addOnGlobalLayoutListener(r2)
            X.0uh r3 = r12.A0B
            java.lang.String r2 = "view-group-invite-activity"
            X.2Ao r2 = r3.A04(r12, r2)
            r12.A0A = r2
            r2 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r2 = r12.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r12.A04 = r2
            r2 = 2131363961(0x7f0a0879, float:1.8347746E38)
            android.view.View r2 = r12.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r12.A03 = r2
            r2 = 2131363527(0x7f0a06c7, float:1.8346865E38)
            android.view.View r2 = r12.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r12.A02 = r2
            r2 = 2131365566(0x7f0a0ebe, float:1.8351E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r12.A07 = r2
            r2 = 2131363537(0x7f0a06d1, float:1.8346886E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r12.A06 = r2
            r2 = 2131363973(0x7f0a0885, float:1.834777E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r12.A05 = r2
            r2 = 2131363974(0x7f0a0886, float:1.8347772E38)
            android.view.View r2 = r12.findViewById(r2)
            r12.A01 = r2
            X.0t3 r7 = r12.A05
            X.0rt r6 = r12.A0D
            X.0sG r14 = r12.A08
            X.0sP r15 = r12.A09
            X.013 r5 = r12.A0C
            X.0ul r4 = r12.A0H
            X.2Ao r3 = r12.A0A
            r2 = 2131364176(0x7f0a0950, float:1.8348182E38)
            android.view.View r13 = r12.findViewById(r2)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            X.2Op r11 = new X.2Op
            r16 = r3
            r17 = r7
            r18 = r5
            r19 = r6
            r20 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r12.A0J = r11
            r11.A0G = r0
            r2 = 2131364171(0x7f0a094b, float:1.8348172E38)
            android.view.View r4 = r12.findViewById(r2)
            r3 = 31
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r2 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r2.<init>((java.lang.Object) r12, (int) r3)
            r4.setOnClickListener(r2)
            r2 = 2131364161(0x7f0a0941, float:1.8348151E38)
            android.view.View r4 = r12.findViewById(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = 13
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r2 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r2.<init>(r12, r3)
            r4.setOnClickListener(r2)
            boolean r2 = r12.A0R
            if (r2 == 0) goto L_0x01f3
            r3 = 2131891312(0x7f121470, float:1.941734E38)
        L_0x016e:
            r4.setText(r3)
            r2 = 2131364897(0x7f0a0c21, float:1.8349644E38)
            android.view.View r4 = r12.findViewById(r2)
            r3 = 32
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r2 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r2.<init>((java.lang.Object) r12, (int) r3)
            r4.setOnClickListener(r2)
            X.11A r3 = r12.A0E
            X.1ig r2 = r12.A0T
            r3.A02(r2)
            r2 = 2131363690(0x7f0a076a, float:1.8347196E38)
            android.view.View r4 = r12.findViewById(r2)
            r3 = 30
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r2 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r2.<init>((java.lang.Object) r12, (int) r3)
            r4.setOnClickListener(r2)
            X.0sq r3 = r12.A05
            X.0t3 r8 = r12.A05
            X.0sK r5 = r12.A01
            X.0rt r9 = r12.A0D
            X.0ug r13 = r12.A0M
            X.0sG r6 = r12.A08
            X.0sP r7 = r12.A09
            X.0vd r11 = r12.A0I
            X.0sO r10 = r12.A0G
            X.1bh r15 = r12.A0P
            X.4Ma r14 = r12.A0O
            X.AnonymousClass00B.A06(r14)
            X.378 r4 = new X.378
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Void[] r2 = new java.lang.Void[r0]
            r3.Ack(r4, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r3 < r2) goto L_0x01de
            android.view.Window r3 = r12.getWindow()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r2)
            android.view.Window r2 = r12.getWindow()
            android.view.Window r2 = r12.getWindow()
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = X.AnonymousClass00T.A00(r12, r0)
            r2.setNavigationBarColor(r0)
        L_0x01de:
            r2 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation
            r4.<init>(r2, r0)
            r2 = 150(0x96, double:7.4E-322)
            r4.setDuration(r2)
            android.view.View r0 = r12.findViewById(r1)
            r0.startAnimation(r4)
            return
        L_0x01f3:
            X.0ul r3 = r12.A0H
            X.1bh r2 = r12.A0P
            int r2 = r2.A00
            boolean r2 = r3.A0d(r2)
            r3 = 2131889111(0x7f120bd7, float:1.9412876E38)
            if (r2 == 0) goto L_0x016e
            r3 = 2131889115(0x7f120bdb, float:1.9412884E38)
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.invites.ViewGroupInviteActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0Q;
        if (runnable != null) {
            this.A05.A0J(runnable);
            this.A0Q = null;
        }
        this.A0E.A03(this.A0T);
        this.A0A.A00();
    }
}
