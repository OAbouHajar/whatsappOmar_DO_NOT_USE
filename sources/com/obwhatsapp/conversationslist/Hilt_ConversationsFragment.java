package com.obwhatsapp.conversationslist;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass10F;
import X.AnonymousClass10G;
import X.AnonymousClass10Y;
import X.AnonymousClass113;
import X.AnonymousClass119;
import X.AnonymousClass11A;
import X.AnonymousClass120;
import X.AnonymousClass127;
import X.AnonymousClass12N;
import X.AnonymousClass12Q;
import X.AnonymousClass13V;
import X.AnonymousClass15G;
import X.AnonymousClass15O;
import X.AnonymousClass15V;
import X.AnonymousClass15X;
import X.AnonymousClass15Y;
import X.AnonymousClass15Z;
import X.AnonymousClass16O;
import X.AnonymousClass16S;
import X.AnonymousClass17F;
import X.AnonymousClass18R;
import X.AnonymousClass195;
import X.AnonymousClass19Y;
import X.AnonymousClass1BI;
import X.AnonymousClass1BJ;
import X.AnonymousClass1DY;
import X.AnonymousClass1H9;
import X.AnonymousClass1L3;
import X.AnonymousClass1ME;
import X.AnonymousClass1PL;
import X.AnonymousClass1PN;
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
import X.C16760tb;
import X.C16900tq;
import X.C16980tz;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17180uf;
import X.C17190ug;
import X.C17200uh;
import X.C17210ui;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17270uo;
import X.C17760vb;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18550ws;
import X.C18560wt;
import X.C18910xS;
import X.C18930xU;
import X.C19220xx;
import X.C19230xz;
import X.C19240y6;
import X.C19410yO;
import X.C19580yf;
import X.C19590yg;
import X.C19610yi;
import X.C19670yo;
import X.C19740yv;
import X.C19780yz;
import X.C19980zJ;
import X.C19990zK;
import X.C206210w;
import X.C216014s;
import X.C216114t;
import X.C218315p;
import X.C218415q;
import X.C23061Ai;
import X.C23101Am;
import X.C24671Gv;
import X.C25681Ks;
import X.C25691Kt;
import X.C25721Kw;
import X.C25731Kx;
import X.C25781Lc;
import X.C26901Pr;
import X.C49132Rg;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaListFragment;

public abstract class Hilt_ConversationsFragment extends WaListFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A06() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A06();
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
            r3.A06()
            r3.A1B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversationslist.Hilt_ConversationsFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A06();
        A1B();
    }

    public void A1B() {
        if (!this.A02) {
            this.A02 = true;
            ConversationsFragment conversationsFragment = (ConversationsFragment) this;
            C17050uS r4 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r4.A0b;
            conversationsFragment.A00 = (C17070uU) r2.ABg.get();
            conversationsFragment.A01 = (C17080uV) r2.APK.get();
            conversationsFragment.A1d = (C17250um) r2.A7e.get();
            conversationsFragment.A1K = (AnonymousClass013) r2.AR8.get();
            conversationsFragment.A1J = (C15860rz) r2.AQh.get();
            conversationsFragment.A1G = (C16440t3) r2.AP2.get();
            conversationsFragment.A1e = (C14710pd) r2.A05.get();
            conversationsFragment.A0O = (C14870pt) r2.AB3.get();
            conversationsFragment.A2L = (C23061Ai) r2.AC0.get();
            conversationsFragment.A1q = (C19990zK) r2.AEZ.get();
            conversationsFragment.A2A = new AnonymousClass47T();
            conversationsFragment.A0P = (C16040sK) r2.ADr.get();
            conversationsFragment.A1H = (C16980tz) r2.AQB.get();
            conversationsFragment.A2M = (C16320sq) r2.ARB.get();
            conversationsFragment.A0K = (C16300so) r2.A5p.get();
            conversationsFragment.A1M = (C15810rt) r2.A43.get();
            conversationsFragment.A2B = new AnonymousClass15V();
            conversationsFragment.A1g = (C16490t9) r2.AQz.get();
            conversationsFragment.A0H = (C23101Am) r2.A0N.get();
            conversationsFragment.A1L = (C18910xS) r2.A3q.get();
            conversationsFragment.A0Q = (C15900s5) r2.ALm.get();
            conversationsFragment.A2F = (C216014s) r2.AMr.get();
            conversationsFragment.A0l = (C18930xU) r2.AOL.get();
            conversationsFragment.A0S = (AnonymousClass1BJ) r2.AOm.get();
            conversationsFragment.A0T = (C16760tb) r2.APV.get();
            C49132Rg r3 = r4.A0Y;
            conversationsFragment.A1f = r3.A0I();
            conversationsFragment.A0I = (C19980zJ) r2.A0P.get();
            conversationsFragment.A0u = (C17200uh) r2.A52.get();
            conversationsFragment.A1U = (C18550ws) r2.ADB.get();
            conversationsFragment.A1r = (C17190ug) r2.AEu.get();
            conversationsFragment.A20 = (C218315p) r2.AIL.get();
            conversationsFragment.A0o = (C17160ud) r2.A4t.get();
            conversationsFragment.A0p = (C16000sG) r2.A4x.get();
            conversationsFragment.A0J = (C25731Kx) r2.A54.get();
            conversationsFragment.A1P = (C18560wt) r2.A5j.get();
            conversationsFragment.A22 = (AnonymousClass10F) r2.AN4.get();
            conversationsFragment.A1E = (AnonymousClass01V) r2.AOi.get();
            conversationsFragment.A0r = (C16080sP) r2.AQ9.get();
            conversationsFragment.A1y = (C18290wS) r2.AIB.get();
            conversationsFragment.A21 = (AnonymousClass1DY) r2.A3w.get();
            conversationsFragment.A1Q = (AnonymousClass17F) r2.AAo.get();
            conversationsFragment.A2J = (AnonymousClass15O) r2.A0k.get();
            conversationsFragment.A0d = (AnonymousClass01Y) r2.A1w.get();
            conversationsFragment.A0h = (C17760vb) r2.A3m.get();
            conversationsFragment.A0q = (C17140ub) r2.A4y.get();
            conversationsFragment.A1h = (C17240ul) r2.ABK.get();
            conversationsFragment.A0v = (AnonymousClass1BI) r2.ACt.get();
            conversationsFragment.A1V = (C19780yz) r2.ADI.get();
            conversationsFragment.A1v = C16150sX.A0x(r2);
            conversationsFragment.A29 = new C25781Lc();
            conversationsFragment.A2G = C16150sX.A19(r2);
            conversationsFragment.A2H = (C25681Ks) r2.A0Q.get();
            conversationsFragment.A1C = r3.A0E();
            conversationsFragment.A27 = (C16220sf) r2.A3y.get();
            conversationsFragment.A28 = r2.A1d();
            conversationsFragment.A1s = (AnonymousClass16S) r2.AFt.get();
            conversationsFragment.A1u = (C218415q) r2.AGN.get();
            conversationsFragment.A1F = (AnonymousClass1H9) r2.AOj.get();
            conversationsFragment.A26 = (C19220xx) r2.APi.get();
            conversationsFragment.A0U = (C19740yv) r2.AQi.get();
            conversationsFragment.A2I = (C25691Kt) r2.A0R.get();
            conversationsFragment.A0c = (AnonymousClass1ME) r2.AGk.get();
            conversationsFragment.A0g = (AnonymousClass127) r2.A3z.get();
            conversationsFragment.A0j = (AnonymousClass1L3) r2.A4N.get();
            conversationsFragment.A0s = (AnonymousClass120) r2.A4z.get();
            conversationsFragment.A0x = (C19230xz) r2.A5B.get();
            conversationsFragment.A1Y = (AnonymousClass119) r2.APO.get();
            conversationsFragment.A1l = (C19240y6) r2.AMu.get();
            conversationsFragment.A1j = C49132Rg.A01(r3);
            conversationsFragment.A0n = (AnonymousClass19Y) r2.A4r.get();
            conversationsFragment.A0e = (C17180uf) r2.A2n.get();
            conversationsFragment.A1t = (C14770pj) r2.AF9.get();
            conversationsFragment.A1W = (C16900tq) r2.AFT.get();
            conversationsFragment.A1b = (AnonymousClass15X) r2.AMk.get();
            conversationsFragment.A1X = (AnonymousClass10G) r2.AN1.get();
            conversationsFragment.A1I = (C16260sj) r2.AQe.get();
            conversationsFragment.A1Z = (AnonymousClass15G) r2.AEe.get();
            conversationsFragment.A0b = (AnonymousClass16O) r2.A36.get();
            conversationsFragment.A0i = (C17230uk) r2.A4I.get();
            conversationsFragment.A0z = (C15800rs) r2.A5c.get();
            conversationsFragment.A1T = (AnonymousClass195) r2.ACz.get();
            conversationsFragment.A1O = (AnonymousClass11A) r2.A5U.get();
            conversationsFragment.A1S = (C26901Pr) r2.AC2.get();
            conversationsFragment.A1w = (AnonymousClass15Y) r2.AHo.get();
            conversationsFragment.A1x = (C18090w8) r2.AI6.get();
            conversationsFragment.A0Y = r4.A00();
            conversationsFragment.A0Z = (C17150uc) r2.A34.get();
            conversationsFragment.A1a = (C19410yO) r2.A4T.get();
            conversationsFragment.A0y = (AnonymousClass10Y) r2.A5X.get();
            conversationsFragment.A23 = (C24671Gv) r2.ALR.get();
            conversationsFragment.A25 = (AnonymousClass1PN) r2.APc.get();
            conversationsFragment.A0a = (AnonymousClass13V) r2.A35.get();
            conversationsFragment.A2K = (C25721Kw) r2.A6Z.get();
            conversationsFragment.A1R = (C16070sO) r2.ABY.get();
            conversationsFragment.A0m = (C18260wP) r2.A4p.get();
            conversationsFragment.A0R = (AnonymousClass15Z) r2.AOg.get();
            conversationsFragment.A0k = (C19590yg) r2.A4Y.get();
            conversationsFragment.A0w = (C206210w) r2.A4v.get();
            conversationsFragment.A1N = (C216114t) r2.A5O.get();
            conversationsFragment.A1i = (AnonymousClass18R) r2.ABZ.get();
            conversationsFragment.A1c = new C19580yf();
            conversationsFragment.A10 = (C19610yi) r2.AEq.get();
            conversationsFragment.A1A = (AnonymousClass1PL) r2.A5b.get();
            conversationsFragment.A0L = (AnonymousClass2J7) r3.A00.get();
            conversationsFragment.A0V = (C19670yo) r2.AB4.get();
            conversationsFragment.A0X = (AnonymousClass12Q) r2.AB8.get();
            conversationsFragment.A1z = r3.A0Y();
            conversationsFragment.A0f = (C17210ui) r2.A73.get();
            conversationsFragment.A2N = C17270uo.A00(r2.AGp);
            conversationsFragment.A2O = C17270uo.A00(r2.ALh);
            conversationsFragment.A0W = (AnonymousClass12N) r2.AB7.get();
            conversationsFragment.A1m = (AnonymousClass113) r2.AJt.get();
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
