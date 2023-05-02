package com.obwhatsapp.community;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass11A;
import X.AnonymousClass124;
import X.AnonymousClass2AF;
import X.AnonymousClass2Ao;
import X.AnonymousClass3R6;
import X.AnonymousClass4SD;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14870pt;
import X.C16000sG;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C17110uY;
import X.C17160ud;
import X.C17200uh;
import X.C17220uj;
import X.C17240ul;
import X.C19230xz;
import X.C211212w;
import X.C25681Ks;
import X.C25691Kt;
import X.C25781Lc;
import X.C31091dS;
import X.C49132Rg;
import X.C50722aL;
import X.C50752aO;
import X.C62353Df;
import X.C86224Rt;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxConsumerShape210S0100000_2_I1;
import com.facebook.redex.IDxObserverShape35S0200000_1_I1;
import com.obwhatsapp.R;

public class CommunityMembersActivity extends C14530pL {
    public C005402i A00;
    public C50722aL A01;
    public C50752aO A02;
    public C211212w A03;
    public C86224Rt A04;
    public AnonymousClass2AF A05;
    public C17160ud A06;
    public C16000sG A07;
    public C16080sP A08;
    public C17200uh A09;
    public C19230xz A0A;
    public AnonymousClass11A A0B;
    public C16070sO A0C;
    public C17240ul A0D;
    public AnonymousClass124 A0E;
    public C25781Lc A0F;
    public C17220uj A0G;
    public C25681Ks A0H;
    public C25691Kt A0I;
    public C17110uY A0J;
    public Runnable A0K;
    public boolean A0L;

    public CommunityMembersActivity() {
        this(0);
    }

    public CommunityMembersActivity(int i2) {
        this.A0L = false;
        C13680ns.A1G(this, 37);
    }

    public void A1q() {
        if (!this.A0L) {
            this.A0L = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A1T, r2, this, C14550pN.A0v(r2));
            this.A02 = (C50752aO) A1T.A0i.get();
            this.A03 = (C211212w) r2.AG4.get();
            this.A0J = C16150sX.A1A(r2);
            this.A09 = C16150sX.A0R(r2);
            this.A06 = C16150sX.A0L(r2);
            this.A0G = C16150sX.A18(r2);
            this.A08 = C16150sX.A0Q(r2);
            this.A0F = new C25781Lc();
            this.A0I = (C25691Kt) r2.A0R.get();
            this.A0H = (C25681Ks) r2.A0Q.get();
            this.A0A = (C19230xz) r2.A5B.get();
            this.A0C = C16150sX.A0e(r2);
            this.A0D = C16150sX.A0o(r2);
            this.A0B = (AnonymousClass11A) r2.A5U.get();
            this.A0E = (AnonymousClass124) r2.ALe.get();
            this.A07 = C16150sX.A0M(r2);
            this.A01 = (C50722aL) A1T.A0h.get();
        }
    }

    public int A1r() {
        return 579545668;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = true;
        return A1s;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 10) {
            this.A0A.A07();
            this.A0H.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AKw("load_community_member");
        setContentView((int) R.layout.layout0040);
        C005402i A0s = C14550pN.A0s(this, R.id.toolbar);
        this.A00 = A0s;
        A0s.A0Q(true);
        this.A00.A0N(true);
        this.A00.A0B(R.string.str0cf5);
        AnonymousClass2Ao A042 = this.A09.A04(this, "community-view-members");
        RecyclerView recyclerView = (RecyclerView) AnonymousClass00T.A05(this, R.id.community_members_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.A1P(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C16050sL A0N = C14530pL.A0N(getIntent(), "extra_community_jid");
        this.A04 = this.A01.A00(this, A0N, 2);
        AnonymousClass2AF r12 = (AnonymousClass2AF) new C006602z((AnonymousClass04o) new C62353Df(this.A02, A0N), (C001500q) this).A01(AnonymousClass2AF.class);
        this.A05 = r12;
        C211212w r6 = this.A03;
        C16040sK r9 = this.A01;
        C17160ud r2 = this.A06;
        AnonymousClass013 r1 = this.A01;
        C16080sP r14 = this.A08;
        C25781Lc r0 = this.A0F;
        C14870pt r8 = this.A05;
        C16000sG r13 = this.A07;
        C25691Kt r5 = this.A0I;
        C211212w r142 = r6;
        AnonymousClass3R6 r122 = new AnonymousClass3R6(r9, r142, new AnonymousClass4SD(r8, r9, this.A04, this, r12, r13, r14, this.A0H, r5), r2, r14, A042, r1, A0N, r0);
        r122.A0B(true);
        r122.A00 = new IDxConsumerShape210S0100000_2_I1(this, 1);
        recyclerView.setAdapter(r122);
        C13680ns.A1L(this, this.A05.A00, 62);
        this.A05.A0I.A0A(this, new IDxObserverShape35S0200000_1_I1(this, 0, r122));
        C13680ns.A1N(this, this.A05.A01, r122, 63);
        this.A05.A0J.A0A(this, new IDxObserverShape35S0200000_1_I1(this, 1, A0N));
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0K;
        if (runnable != null) {
            this.A05.A0J(runnable);
        }
    }
}
