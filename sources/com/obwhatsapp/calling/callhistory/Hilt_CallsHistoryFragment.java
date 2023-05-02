package com.obwhatsapp.calling.callhistory;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass127;
import X.AnonymousClass15A;
import X.AnonymousClass18R;
import X.AnonymousClass195;
import X.AnonymousClass19Y;
import X.AnonymousClass1BJ;
import X.AnonymousClass1D0;
import X.AnonymousClass1OL;
import X.AnonymousClass1SN;
import X.AnonymousClass1SP;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C14870pt;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16320sq;
import X.C16440t3;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17140ub;
import X.C17200uh;
import X.C17240ul;
import X.C18260wP;
import X.C18890xQ;
import X.C19980zJ;
import X.C204310c;
import X.C216014s;
import X.C25781Lc;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaListFragment;

public abstract class Hilt_CallsHistoryFragment extends WaListFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A03();
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
            r3.A03()
            r3.A1B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callhistory.Hilt_CallsHistoryFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A03();
        A1B();
    }

    public void A1B() {
        if (!this.A02) {
            this.A02 = true;
            CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this;
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r3.A0b;
            callsHistoryFragment.A00 = (C17070uU) r2.ABg.get();
            callsHistoryFragment.A01 = (C17080uV) r2.APK.get();
            callsHistoryFragment.A0R = (C16440t3) r2.AP2.get();
            callsHistoryFragment.A0W = (C14710pd) r2.A05.get();
            callsHistoryFragment.A09 = (C18890xQ) r2.APS.get();
            callsHistoryFragment.A05 = (C14870pt) r2.AB3.get();
            callsHistoryFragment.A06 = (C16040sK) r2.ADr.get();
            callsHistoryFragment.A0b = (C16320sq) r2.ARB.get();
            callsHistoryFragment.A07 = (C15900s5) r2.ALm.get();
            callsHistoryFragment.A0a = (C216014s) r2.AMr.get();
            callsHistoryFragment.A08 = (AnonymousClass1BJ) r2.AOm.get();
            callsHistoryFragment.A0D = (C204310c) r2.A3O.get();
            callsHistoryFragment.A04 = (C19980zJ) r2.A0P.get();
            callsHistoryFragment.A0O = (C17200uh) r2.A52.get();
            callsHistoryFragment.A0F = C16150sX.A0J(r2);
            callsHistoryFragment.A0J = (C16000sG) r2.A4x.get();
            callsHistoryFragment.A0Q = (AnonymousClass01V) r2.AOi.get();
            callsHistoryFragment.A0L = (C16080sP) r2.AQ9.get();
            callsHistoryFragment.A0S = (AnonymousClass013) r2.AR8.get();
            callsHistoryFragment.A0c = (AnonymousClass1SP) r2.A3G.get();
            callsHistoryFragment.A0K = (C17140ub) r2.A4y.get();
            callsHistoryFragment.A0X = (C17240ul) r2.ABK.get();
            callsHistoryFragment.A0Z = new C25781Lc();
            callsHistoryFragment.A0P = r3.A0Y.A0E();
            callsHistoryFragment.A0T = (AnonymousClass1D0) r2.A3P.get();
            callsHistoryFragment.A0I = (AnonymousClass19Y) r2.A4r.get();
            callsHistoryFragment.A0V = (AnonymousClass195) r2.ACz.get();
            callsHistoryFragment.A0A = (AnonymousClass1OL) r2.AQ4.get();
            callsHistoryFragment.A0U = (C16070sO) r2.ABY.get();
            callsHistoryFragment.A0H = (C18260wP) r2.A4p.get();
            callsHistoryFragment.A0Y = (AnonymousClass18R) r2.ABZ.get();
            callsHistoryFragment.A0E = (AnonymousClass1SN) r2.AD0.get();
            callsHistoryFragment.A0G = (AnonymousClass127) r2.A3z.get();
            callsHistoryFragment.A0d = (AnonymousClass15A) r2.A3J.get();
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
