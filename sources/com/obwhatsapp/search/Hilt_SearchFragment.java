package com.obwhatsapp.search;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass10G;
import X.AnonymousClass10Y;
import X.AnonymousClass119;
import X.AnonymousClass11A;
import X.AnonymousClass11K;
import X.AnonymousClass120;
import X.AnonymousClass127;
import X.AnonymousClass13V;
import X.AnonymousClass15G;
import X.AnonymousClass15V;
import X.AnonymousClass15X;
import X.AnonymousClass15Z;
import X.AnonymousClass16O;
import X.AnonymousClass17R;
import X.AnonymousClass18R;
import X.AnonymousClass195;
import X.AnonymousClass1B5;
import X.AnonymousClass1P7;
import X.AnonymousClass1PD;
import X.AnonymousClass1QZ;
import X.AnonymousClass2J7;
import X.AnonymousClass2TA;
import X.AnonymousClass47T;
import X.C14710pd;
import X.C14770pj;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16220sf;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16500tA;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17190ug;
import X.C17200uh;
import X.C17210ui;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17270uo;
import X.C17760vb;
import X.C18090w8;
import X.C18290wS;
import X.C18560wt;
import X.C18910xS;
import X.C18930xU;
import X.C19230xz;
import X.C19430yQ;
import X.C19580yf;
import X.C19610yi;
import X.C19740yv;
import X.C19780yz;
import X.C19820z3;
import X.C19980zJ;
import X.C19990zK;
import X.C216114t;
import X.C218315p;
import X.C23101Am;
import X.C25681Ks;
import X.C25691Kt;
import X.C25721Kw;
import X.C25731Kx;
import X.C25781Lc;
import X.C26081Mg;
import X.C49132Rg;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import X.C82284Cf;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_SearchFragment extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A05();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A05()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.Hilt_SearchFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A05();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            SearchFragment searchFragment = (SearchFragment) this;
            C17050uS r4 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r4.A0b;
            searchFragment.A00 = (C17070uU) r2.ABg.get();
            searchFragment.A01 = (C17080uV) r2.APK.get();
            searchFragment.A0g = (C16440t3) r2.AP2.get();
            searchFragment.A14 = (C14710pd) r2.A05.get();
            searchFragment.A1T = (AnonymousClass1PD) r2.AEP.get();
            searchFragment.A1Q = new AnonymousClass47T();
            searchFragment.A0C = (C14870pt) r2.AB3.get();
            searchFragment.A1C = (C19990zK) r2.AEZ.get();
            searchFragment.A09 = (C16300so) r2.A5p.get();
            searchFragment.A0D = (C16040sK) r2.ADr.get();
            searchFragment.A0h = (C16980tz) r2.AQB.get();
            searchFragment.A1X = (C16320sq) r2.ARB.get();
            searchFragment.A05 = (C23101Am) r2.A0N.get();
            searchFragment.A0n = (C15810rt) r2.A43.get();
            searchFragment.A1R = new AnonymousClass15V();
            searchFragment.A16 = (C16490t9) r2.AQz.get();
            searchFragment.A0m = (C18910xS) r2.A3q.get();
            searchFragment.A13 = (C17250um) r2.A7e.get();
            searchFragment.A0E = (C15900s5) r2.ALm.get();
            searchFragment.A0R = (C18930xU) r2.AOL.get();
            searchFragment.A0G = (C16760tb) r2.APV.get();
            searchFragment.A1Z = (AnonymousClass1QZ) r2.APn.get();
            C49132Rg r3 = r4.A0Y;
            searchFragment.A15 = r3.A0I();
            searchFragment.A06 = (C19980zJ) r2.A0P.get();
            searchFragment.A0Y = (C17200uh) r2.A52.get();
            searchFragment.A1B = (AnonymousClass1P7) r2.ADc.get();
            searchFragment.A1D = (C17190ug) r2.AEu.get();
            searchFragment.A1H = (C218315p) r2.AIL.get();
            searchFragment.A0N = C16150sX.A0J(r2);
            searchFragment.A0S = (C17160ud) r2.A4t.get();
            searchFragment.A0T = (C16000sG) r2.A4x.get();
            searchFragment.A08 = (C25731Kx) r2.A54.get();
            searchFragment.A0q = (C18560wt) r2.A5j.get();
            searchFragment.A0f = (AnonymousClass01V) r2.AOi.get();
            searchFragment.A0V = (C16080sP) r2.AQ9.get();
            searchFragment.A0k = (AnonymousClass013) r2.AR8.get();
            searchFragment.A1G = (C18290wS) r2.AIB.get();
            searchFragment.A0w = (C26081Mg) r2.AIY.get();
            searchFragment.A0L = (AnonymousClass01Y) r2.A1w.get();
            searchFragment.A0P = (C17760vb) r2.A3m.get();
            searchFragment.A17 = (C17240ul) r2.ABK.get();
            searchFragment.A0v = (C19780yz) r2.ADI.get();
            searchFragment.A1P = new C25781Lc();
            searchFragment.A1U = (C25681Ks) r2.A0Q.get();
            searchFragment.A1O = (C16220sf) r2.A3y.get();
            searchFragment.A0H = (C19740yv) r2.AQi.get();
            searchFragment.A1V = (C25691Kt) r2.A0R.get();
            searchFragment.A0O = (AnonymousClass127) r2.A3z.get();
            searchFragment.A0W = (AnonymousClass120) r2.A4z.get();
            searchFragment.A0Z = (C19230xz) r2.A5B.get();
            searchFragment.A0y = (AnonymousClass119) r2.APO.get();
            searchFragment.A12 = (C16500tA) r2.AMF.get();
            searchFragment.A0x = (AnonymousClass10G) r2.AN1.get();
            searchFragment.A0z = (AnonymousClass15G) r2.AEe.get();
            searchFragment.A10 = (AnonymousClass15X) r2.AMk.get();
            searchFragment.A1E = (C14770pj) r2.AF9.get();
            searchFragment.A0j = (C15860rz) r2.AQh.get();
            searchFragment.A0K = (AnonymousClass16O) r2.A36.get();
            searchFragment.A0Q = (C17230uk) r2.A4I.get();
            searchFragment.A0b = (C15800rs) r2.A5c.get();
            searchFragment.A0u = (AnonymousClass195) r2.ACz.get();
            searchFragment.A1F = (C18090w8) r2.AI6.get();
            searchFragment.A0I = (C17150uc) r2.A34.get();
            searchFragment.A0a = (AnonymousClass10Y) r2.A5X.get();
            searchFragment.A0J = (AnonymousClass13V) r2.A35.get();
            searchFragment.A1W = (C25721Kw) r2.A6Z.get();
            searchFragment.A0t = (C16070sO) r2.ABY.get();
            searchFragment.A1I = (C17020u3) r2.AMG.get();
            searchFragment.A11 = new C19580yf();
            searchFragment.A18 = (AnonymousClass18R) r2.ABZ.get();
            searchFragment.A0i = (C16260sj) r2.AQe.get();
            searchFragment.A1A = (C19430yQ) r2.ADa.get();
            searchFragment.A0F = (AnonymousClass15Z) r2.AOg.get();
            searchFragment.A0o = (C216114t) r2.A5O.get();
            searchFragment.A0r = (AnonymousClass17R) r2.A7v.get();
            searchFragment.A0s = (AnonymousClass11K) r2.A7x.get();
            searchFragment.A0c = (AnonymousClass1B5) r2.AEp.get();
            searchFragment.A0d = (C19610yi) r2.AEq.get();
            searchFragment.A0U = (C17140ub) r2.A4y.get();
            searchFragment.A0p = (AnonymousClass11A) r2.A5U.get();
            searchFragment.A0M = (C17210ui) r2.A73.get();
            searchFragment.A0B = (C82284Cf) r4.A0O.get();
            searchFragment.A1a = C17270uo.A00(r2.AGp);
            searchFragment.A0A = (AnonymousClass2J7) r3.A00.get();
            searchFragment.A0l = (C19820z3) r2.A7p.get();
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
