package com.obwhatsapp.conversationslist;

import X.AnonymousClass01Y;
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
import X.AnonymousClass47T;
import X.C14770pj;
import X.C15800rs;
import X.C15900s5;
import X.C16150sX;
import X.C16220sf;
import X.C16760tb;
import X.C16900tq;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17230uk;
import X.C17270uo;
import X.C17760vb;
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
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.yo.yo;

public abstract class Hilt_ArchivedConversationsFragment extends ConversationsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public Hilt_ArchivedConversationsFragment() {
        yo.setConversationsFragment(this);
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1Y();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        return C54452hX.A00(super.A0v(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.C54442hW.A00(r1) == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r3) {
        /*
            r2 = this;
            super.A0y(r3)
            android.content.ContextWrapper r1 = r2.A00
            if (r1 == 0) goto L_0x000e
            android.content.Context r1 = X.C54442hW.A00(r1)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C52772eQ.A01(r0)
            r2.A1Y()
            r2.A1B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversationslist.Hilt_ArchivedConversationsFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1Y();
        A1B();
    }

    public void A1B() {
        if (!this.A02) {
            this.A02 = true;
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r1 = r3.A0b;
            this.A00 = (C17070uU) r1.ABg.get();
            this.A01 = (C17080uV) r1.APK.get();
            this.A1d = C16150sX.A0i(r1);
            this.A1K = C16150sX.A0Z(r1);
            this.A1J = C16150sX.A0Y(r1);
            this.A1G = C16150sX.A0U(r1);
            this.A1e = C16150sX.A0k(r1);
            this.A0O = C16150sX.A02(r1);
            this.A2L = (C23061Ai) r1.AC0.get();
            this.A1q = (C19990zK) r1.AEZ.get();
            this.A2A = new AnonymousClass47T();
            this.A0P = C16150sX.A04(r1);
            this.A1H = C16150sX.A0V(r1);
            this.A2M = C16150sX.A1B(r1);
            this.A0K = C16150sX.A00(r1);
            this.A1M = C16150sX.A0c(r1);
            this.A2B = new AnonymousClass15V();
            this.A1g = C16150sX.A0m(r1);
            this.A0H = (C23101Am) r1.A0N.get();
            this.A1L = (C18910xS) r1.A3q.get();
            this.A0Q = (C15900s5) r1.ALm.get();
            this.A2F = (C216014s) r1.AMr.get();
            this.A0l = (C18930xU) r1.AOL.get();
            this.A0S = (AnonymousClass1BJ) r1.AOm.get();
            this.A0T = (C16760tb) r1.APV.get();
            C49132Rg r2 = r3.A0Y;
            this.A1f = r2.A0I();
            this.A0I = (C19980zJ) r1.A0P.get();
            this.A0u = C16150sX.A0R(r1);
            this.A1U = (C18550ws) r1.ADB.get();
            this.A1r = C16150sX.A0t(r1);
            this.A20 = (C218315p) r1.AIL.get();
            this.A0o = C16150sX.A0L(r1);
            this.A0p = C16150sX.A0M(r1);
            this.A0J = (C25731Kx) r1.A54.get();
            this.A1P = (C18560wt) r1.A5j.get();
            this.A22 = (AnonymousClass10F) r1.AN4.get();
            this.A1E = C16150sX.A0T(r1);
            this.A0r = C16150sX.A0Q(r1);
            this.A1y = (C18290wS) r1.AIB.get();
            this.A21 = (AnonymousClass1DY) r1.A3w.get();
            this.A1Q = (AnonymousClass17F) r1.AAo.get();
            this.A2J = (AnonymousClass15O) r1.A0k.get();
            this.A0d = (AnonymousClass01Y) r1.A1w.get();
            this.A0h = (C17760vb) r1.A3m.get();
            this.A0q = C16150sX.A0N(r1);
            this.A1h = C16150sX.A0o(r1);
            this.A0v = (AnonymousClass1BI) r1.ACt.get();
            this.A1V = (C19780yz) r1.ADI.get();
            this.A1v = C16150sX.A0x(r1);
            this.A29 = new C25781Lc();
            this.A2G = C16150sX.A19(r1);
            this.A2H = (C25681Ks) r1.A0Q.get();
            this.A1C = r2.A0E();
            this.A27 = (C16220sf) r1.A3y.get();
            this.A28 = r1.A1d();
            this.A1s = (AnonymousClass16S) r1.AFt.get();
            this.A1u = (C218415q) r1.AGN.get();
            this.A1F = (AnonymousClass1H9) r1.AOj.get();
            this.A26 = (C19220xx) r1.APi.get();
            this.A0U = (C19740yv) r1.AQi.get();
            this.A2I = (C25691Kt) r1.A0R.get();
            this.A0c = (AnonymousClass1ME) r1.AGk.get();
            this.A0g = (AnonymousClass127) r1.A3z.get();
            this.A0j = (AnonymousClass1L3) r1.A4N.get();
            this.A0s = (AnonymousClass120) r1.A4z.get();
            this.A0x = (C19230xz) r1.A5B.get();
            this.A1Y = (AnonymousClass119) r1.APO.get();
            this.A1l = (C19240y6) r1.AMu.get();
            this.A1j = C49132Rg.A01(r2);
            this.A0n = (AnonymousClass19Y) r1.A4r.get();
            this.A0e = C16150sX.A0D(r1);
            this.A1t = (C14770pj) r1.AF9.get();
            this.A1W = (C16900tq) r1.AFT.get();
            this.A1b = (AnonymousClass15X) r1.AMk.get();
            this.A1X = (AnonymousClass10G) r1.AN1.get();
            this.A1I = C16150sX.A0X(r1);
            this.A1Z = (AnonymousClass15G) r1.AEe.get();
            this.A0b = (AnonymousClass16O) r1.A36.get();
            this.A0i = (C17230uk) r1.A4I.get();
            this.A0z = (C15800rs) r1.A5c.get();
            this.A1T = (AnonymousClass195) r1.ACz.get();
            this.A1O = (AnonymousClass11A) r1.A5U.get();
            this.A1S = (C26901Pr) r1.AC2.get();
            this.A1w = (AnonymousClass15Y) r1.AHo.get();
            this.A1x = C16150sX.A10(r1);
            this.A0Y = r3.A00();
            this.A0Z = C16150sX.A09(r1);
            this.A1a = (C19410yO) r1.A4T.get();
            this.A0y = (AnonymousClass10Y) r1.A5X.get();
            this.A23 = (C24671Gv) r1.ALR.get();
            this.A25 = (AnonymousClass1PN) r1.APc.get();
            this.A0a = (AnonymousClass13V) r1.A35.get();
            this.A2K = (C25721Kw) r1.A6Z.get();
            this.A1R = C16150sX.A0e(r1);
            this.A0m = (C18260wP) r1.A4p.get();
            this.A0R = (AnonymousClass15Z) r1.AOg.get();
            this.A0k = (C19590yg) r1.A4Y.get();
            this.A0w = (C206210w) r1.A4v.get();
            this.A1N = (C216114t) r1.A5O.get();
            this.A1i = (AnonymousClass18R) r1.ABZ.get();
            this.A1c = new C19580yf();
            this.A10 = (C19610yi) r1.AEq.get();
            this.A1A = (AnonymousClass1PL) r1.A5b.get();
            this.A0L = (AnonymousClass2J7) r2.A00.get();
            this.A0V = (C19670yo) r1.AB4.get();
            this.A0X = (AnonymousClass12Q) r1.AB8.get();
            this.A1z = r2.A0Y();
            this.A0f = C16150sX.A0E(r1);
            this.A2N = C17270uo.A00(r1.AGp);
            this.A2O = C17270uo.A00(r1.ALh);
            this.A0W = (AnonymousClass12N) r1.AB7.get();
            this.A1m = (AnonymousClass113) r1.AJt.get();
        }
    }

    public final void A1Y() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
