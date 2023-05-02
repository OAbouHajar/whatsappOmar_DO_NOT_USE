package com.obwhatsapp.community;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1L4;
import X.AnonymousClass2Rf;
import X.AnonymousClass3MF;
import X.C004601z;
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
import X.C16620tM;
import X.C17110uY;
import X.C17220uj;
import X.C17250um;
import X.C17750va;
import X.C17790ve;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import X.C57102q8;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;

public class CommunityNUXActivity extends C14530pL {
    public TextView A00;
    public AnonymousClass1L4 A01;
    public C17750va A02;
    public AnonymousClass013 A03;
    public C17790ve A04;
    public C17220uj A05;
    public C17110uY A06;
    public boolean A07;

    public CommunityNUXActivity() {
        this(0);
    }

    public CommunityNUXActivity(int i2) {
        this.A07 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 38));
    }

    public static /* synthetic */ void A02(CommunityNUXActivity communityNUXActivity) {
        communityNUXActivity.A02.A01(3, 3, (Long) null, communityNUXActivity.A01.A00());
        super.onBackPressed();
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
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
            this.A06 = (C17110uY) r1.ADT.get();
            this.A04 = (C17790ve) r1.AGX.get();
            this.A05 = (C17220uj) r1.A9x.get();
            this.A03 = (AnonymousClass013) r1.AR8.get();
            this.A02 = C16150sX.A0K(r1);
            this.A01 = (AnonymousClass1L4) r1.A4K.get();
        }
    }

    public void onBackPressed() {
        this.A02.A01(8, 3, (Long) null, this.A01.A00());
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout003f);
        this.A04.A00("community", (Object) null);
        AnonymousClass00T.A05(this, R.id.community_nux_next_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 5));
        AnonymousClass00T.A05(this, R.id.community_nux_close).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 6));
        this.A00 = (TextView) AnonymousClass00T.A05(this, R.id.cag_description);
        C14710pd r1 = this.A0C;
        C16620tM r9 = C16620tM.A02;
        int A032 = r1.A03(r9, 2774);
        TextView textView = this.A00;
        AnonymousClass013 r7 = this.A03;
        long j2 = (long) A032;
        textView.setText(r7.A0J(new Object[]{r7.A0K().format(j2)}, R.plurals.plurals0019, j2));
        if (this.A0C.A0E(r9, 2356)) {
            TextView textView2 = (TextView) AnonymousClass00T.A05(this, R.id.community_nux_disclaimer_pp);
            textView2.setText(this.A06.A06(new RunnableRunnableShape5S0100000_I0_4((Object) this, 36), getString(R.string.str04fd, new Object[]{"625069579217642"}), "625069579217642"));
            textView2.setMovementMethod(new AnonymousClass3MF());
            C004601z.A0j(textView2, new C57102q8(textView2, this.A08));
            textView2.setVisibility(0);
        }
    }
}
