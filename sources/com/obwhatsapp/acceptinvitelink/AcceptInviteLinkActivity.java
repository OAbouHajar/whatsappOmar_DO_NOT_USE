package com.obwhatsapp.acceptinvitelink;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass11A;
import X.AnonymousClass124;
import X.AnonymousClass15P;
import X.AnonymousClass1BX;
import X.AnonymousClass1BZ;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.AnonymousClass36W;
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
import X.C16490t9;
import X.C17190ug;
import X.C17200uh;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17780vd;
import X.C18260wP;
import X.C19490yW;
import X.C19810z2;
import X.C19950zG;
import X.C19980zJ;
import X.C218115n;
import X.C23061Ai;
import X.C23071Aj;
import X.C33501ig;
import X.C48702Op;
import X.C49132Rg;
import X.C62993Fs;
import X.C86264Rx;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape25S0300000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

public class AcceptInviteLinkActivity extends C14530pL {
    public int A00;
    public C17230uk A01;
    public C16000sG A02;
    public C16080sP A03;
    public AnonymousClass2Ao A04;
    public C17200uh A05;
    public AnonymousClass1BZ A06;
    public AnonymousClass013 A07;
    public C15810rt A08;
    public AnonymousClass11A A09;
    public C16070sO A0A;
    public AnonymousClass1BX A0B;
    public C19810z2 A0C;
    public C218115n A0D;
    public C16490t9 A0E;
    public C17240ul A0F;
    public C17780vd A0G;
    public C48702Op A0H;
    public C16050sL A0I;
    public C17190ug A0J;
    public AnonymousClass124 A0K;
    public Runnable A0L;
    public boolean A0M;
    public final C33501ig A0N;

    public AcceptInviteLinkActivity() {
        this(0);
        this.A0N = new IDxCObserverShape72S0100000_2_I0(this, 1);
    }

    public AcceptInviteLinkActivity(int i2) {
        this.A0M = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 14));
    }

    public void A1q() {
        if (!this.A0M) {
            this.A0M = true;
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
            this.A08 = (C15810rt) r1.A43.get();
            this.A0E = (C16490t9) r1.AQz.get();
            this.A0K = (AnonymousClass124) r1.ALe.get();
            this.A05 = (C17200uh) r1.A52.get();
            this.A0J = (C17190ug) r1.AEu.get();
            this.A02 = (C16000sG) r1.A4x.get();
            this.A03 = (C16080sP) r1.AQ9.get();
            this.A07 = (AnonymousClass013) r1.AR8.get();
            this.A0F = (C17240ul) r1.ABK.get();
            this.A0G = C16150sX.A0p(r1);
            this.A0C = (C19810z2) r1.APZ.get();
            this.A0D = (C218115n) r1.AH2.get();
            this.A0B = (AnonymousClass1BX) r1.AO2.get();
            this.A01 = (C17230uk) r1.A4I.get();
            this.A06 = (AnonymousClass1BZ) r1.A5N.get();
            this.A09 = (AnonymousClass11A) r1.A5U.get();
            this.A0A = (C16070sO) r1.ABY.get();
        }
    }

    public final void A35() {
        findViewById(R.id.invite_ignore).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 8));
        findViewById(R.id.progress).setVisibility(8);
        findViewById(R.id.group_info).setVisibility(0);
    }

    public final void A36(int i2) {
        findViewById(R.id.progress).setVisibility(4);
        findViewById(R.id.group_info).setVisibility(4);
        findViewById(R.id.error).setVisibility(0);
        findViewById(R.id.learn_more).setVisibility(4);
        ((TextView) findViewById(R.id.error_text)).setText(i2);
        findViewById(R.id.ok).setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 3));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1bd4);
        setContentView((int) R.layout.layout05d0);
        View findViewById = findViewById(R.id.invite_container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape25S0300000_2_I0(findViewById, findViewById(R.id.background), this, 0));
        this.A04 = this.A05.A04(this, "accept-invite-link-activity");
        findViewById(R.id.filler).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 9));
        this.A00 = getIntent().getIntExtra("display_type", 0);
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.progress_text);
        int i2 = this.A00;
        if (i2 == 0) {
            textView.setText(R.string.str19af);
            String stringExtra = getIntent().getStringExtra("code");
            if (TextUtils.isEmpty(stringExtra)) {
                this.A05.A09(R.string.str08b2, 1);
                finish();
            } else {
                StringBuilder sb = new StringBuilder("acceptlink/processcode/");
                sb.append(stringExtra);
                Log.i(sb.toString());
                this.A05.Ack(new AnonymousClass36W(this, this.A05, this.A0F, this.A0G, this.A0J, stringExtra), new Void[0]);
            }
        } else if (i2 == 1) {
            textView.setText(R.string.str0c8d);
            String stringExtra2 = getIntent().getStringExtra("subgroup_jid");
            String stringExtra3 = getIntent().getStringExtra("parent_group_jid");
            C16050sL A052 = C16050sL.A05(stringExtra2);
            C16050sL A053 = C16050sL.A05(stringExtra3);
            if (A052 == null || A053 == null) {
                C16300so r5 = this.A03;
                StringBuilder sb2 = new StringBuilder("subgroup jid is null = ");
                boolean z2 = true;
                boolean z3 = false;
                if (A052 == null) {
                    z3 = true;
                }
                sb2.append(z3);
                sb2.append("parent group jid is null = ");
                if (A053 != null) {
                    z2 = false;
                }
                sb2.append(z2);
                r5.AcB("parent-group-error", sb2.toString(), false);
            } else {
                this.A0I = A052;
                C16300so r9 = this.A03;
                C16320sq r14 = this.A05;
                new C86264Rx(r9, this.A01, new C62993Fs(this, stringExtra3), A053, this.A0J, r14).A00(A052);
            }
        }
        C16440t3 r12 = this.A05;
        C15810rt r142 = this.A08;
        C16000sG r92 = this.A02;
        C16080sP r10 = this.A03;
        AnonymousClass013 r13 = this.A07;
        C17240ul r15 = this.A0F;
        C48702Op r6 = new C48702Op(this, (ViewGroup) findViewById(R.id.invite_root), r92, r10, this.A04, r12, r13, r142, r15);
        this.A0H = r6;
        r6.A0G = true;
        this.A09.A02(this.A0N);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            Window window = getWindow();
            getWindow().setNavigationBarColor(AnonymousClass00T.A00(this, R.color.color0092));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.A03(this.A0N);
        Runnable runnable = this.A0L;
        if (runnable != null) {
            this.A05.A0J(runnable);
        }
        this.A04.A00();
    }
}
