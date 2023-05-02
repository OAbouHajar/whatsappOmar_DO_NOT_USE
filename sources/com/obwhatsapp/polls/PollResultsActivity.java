package com.obwhatsapp.polls;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1N9;
import X.AnonymousClass1yL;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.AnonymousClass3QY;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C14530pL;
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
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16620tM;
import X.C16740tZ;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C39171s2;
import X.C49132Rg;
import X.C49972Wz;
import X.C51032ar;
import X.C51042as;
import X.C51052at;
import X.C75453sB;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;

public class PollResultsActivity extends C14530pL {
    public C51032ar A00;
    public C51042as A01;
    public C51052at A02;
    public AnonymousClass2Ao A03;
    public C17200uh A04;
    public C16460t6 A05;
    public AnonymousClass1N9 A06;
    public C49972Wz A07;
    public PollResultsViewModel A08;
    public C39171s2 A09;
    public boolean A0A;

    public PollResultsActivity() {
        this(0);
    }

    public PollResultsActivity(int i2) {
        this.A0A = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 66));
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
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
            this.A00 = (C51032ar) r2.A1C.get();
            this.A01 = (C51042as) r2.A1D.get();
            this.A02 = (C51052at) r2.A1E.get();
            this.A04 = (C17200uh) r1.A52.get();
            this.A05 = (C16460t6) r1.A5k.get();
            this.A06 = (AnonymousClass1N9) r1.AIt.get();
        }
    }

    public void onBackPressed() {
        PollResultsViewModel pollResultsViewModel = this.A08;
        if (pollResultsViewModel.A01 != -1) {
            pollResultsViewModel.A01 = -1;
            pollResultsViewModel.A05();
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1466);
        setContentView((int) R.layout.layout049f);
        Aem((Toolbar) findViewById(R.id.toolbar));
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0B(R.string.str1466);
        C16740tZ A032 = this.A05.A0K.A03(AnonymousClass1yL.A02(getIntent()));
        AnonymousClass00B.A06(A032);
        this.A09 = (C39171s2) A032;
        this.A03 = this.A04.A04(getBaseContext(), "poll-results-activity");
        PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) new C006602z(this).A01(PollResultsViewModel.class);
        this.A08 = pollResultsViewModel;
        pollResultsViewModel.A0D.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 214));
        this.A08.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 213));
        if (this.A0C.A0E(C16620tM.A02, 2661)) {
            PollResultsViewModel pollResultsViewModel2 = this.A08;
            pollResultsViewModel2.A0A.A02(pollResultsViewModel2.A09);
        }
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(this.A00, R.id.poll_results_users_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        AnonymousClass3QY r3 = new AnonymousClass3QY();
        PollResultsViewModel pollResultsViewModel3 = this.A08;
        C49972Wz r2 = new C49972Wz(r3, this.A00, this.A01, this.A02, this.A03, pollResultsViewModel3);
        this.A07 = r2;
        recyclerView.setAdapter(r2);
        AnonymousClass1N9 r32 = this.A06;
        C39171s2 r22 = this.A09;
        C75453sB r1 = new C75453sB();
        r32.A01(r1, r22.A11.A00);
        AnonymousClass1N9.A00(r1, r22);
        r1.A03 = 4;
        r32.A01.A06(r1);
        this.A08.A07(this.A09);
    }

    public void onDestroy() {
        if (this.A0C.A0E(C16620tM.A02, 2661)) {
            PollResultsViewModel pollResultsViewModel = this.A08;
            pollResultsViewModel.A0A.A03(pollResultsViewModel.A09);
        }
        super.onDestroy();
    }
}
