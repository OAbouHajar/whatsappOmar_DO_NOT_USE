package com.obwhatsapp.status;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass10F;
import X.AnonymousClass11G;
import X.AnonymousClass128;
import X.AnonymousClass12W;
import X.AnonymousClass177;
import X.AnonymousClass184;
import X.AnonymousClass18W;
import X.AnonymousClass19Y;
import X.AnonymousClass1AM;
import X.AnonymousClass1BJ;
import X.AnonymousClass1BM;
import X.AnonymousClass1L1;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16220sf;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16760tb;
import X.C16980tz;
import X.C17010u2;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17140ub;
import X.C17200uh;
import X.C17240ul;
import X.C17270uo;
import X.C19150xq;
import X.C19570ye;
import X.C19980zJ;
import X.C23031Af;
import X.C23171At;
import X.C23611Cq;
import X.C23621Cr;
import X.C23631Ct;
import X.C45752Au;
import X.C49132Rg;
import X.C50442Zm;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaListFragment;
import com.obwhatsapp.yo.yo;

public abstract class Hilt_StatusesFragment extends WaListFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A01();
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
            r3.A01()
            r3.A1B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.Hilt_StatusesFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A1B();
    }

    public void A1B() {
        if (!this.A02) {
            this.A02 = true;
            StatusesFragment statusesFragment = (StatusesFragment) this;
            yo.setStatusesFragment(statusesFragment);
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r3.A0b;
            statusesFragment.A00 = (C17070uU) r2.ABg.get();
            statusesFragment.A01 = (C17080uV) r2.APK.get();
            statusesFragment.A0N = (C16440t3) r2.AP2.get();
            statusesFragment.A0Z = (C14710pd) r2.A05.get();
            statusesFragment.A07 = (C14870pt) r2.AB3.get();
            statusesFragment.A0O = (C16980tz) r2.AQB.get();
            statusesFragment.A08 = (C16040sK) r2.ADr.get();
            statusesFragment.A0v = (C16320sq) r2.ARB.get();
            statusesFragment.A0M = new C17010u2();
            statusesFragment.A0a = (C16490t9) r2.AQz.get();
            statusesFragment.A09 = (C15900s5) r2.ALm.get();
            statusesFragment.A0Y = (AnonymousClass11G) r2.ANN.get();
            statusesFragment.A0A = (AnonymousClass1BJ) r2.AOm.get();
            statusesFragment.A0B = (C16760tb) r2.APV.get();
            statusesFragment.A0S = (C14730pf) r2.ANy.get();
            statusesFragment.A05 = (C19980zJ) r2.A0P.get();
            statusesFragment.A0I = (C17200uh) r2.A52.get();
            statusesFragment.A0w = (C23631Ct) r2.ART.get();
            statusesFragment.A0E = (C16000sG) r2.A4x.get();
            statusesFragment.A0L = (AnonymousClass01V) r2.AOi.get();
            statusesFragment.A0G = (C16080sP) r2.AQ9.get();
            statusesFragment.A0R = (AnonymousClass013) r2.AR8.get();
            statusesFragment.A0c = (AnonymousClass10F) r2.AN4.get();
            statusesFragment.A0U = (C16460t6) r2.A5k.get();
            statusesFragment.A0F = (C17140ub) r2.A4y.get();
            statusesFragment.A0V = (C19150xq) r2.AFC.get();
            C49132Rg r32 = r3.A0Y;
            statusesFragment.A0J = r32.A0E();
            statusesFragment.A0d = (C16220sf) r2.A3y.get();
            statusesFragment.A0K = (AnonymousClass12W) r2.AEM.get();
            C16150sX r5 = r32.A1s;
            C45752Au r4 = new C45752Au((C16760tb) r5.APV.get());
            r4.A00 = (C16320sq) r5.ARB.get();
            r4.A01 = C17270uo.A00(r5.A5z);
            statusesFragment.A0r = r4;
            statusesFragment.A0W = (AnonymousClass128) r2.AND.get();
            statusesFragment.A0f = (AnonymousClass1AM) r2.AQj.get();
            statusesFragment.A0D = (AnonymousClass19Y) r2.A4r.get();
            statusesFragment.A0l = (C23621Cr) r2.AKs.get();
            statusesFragment.A0P = (C16260sj) r2.AQe.get();
            statusesFragment.A0Q = (C15860rz) r2.AQh.get();
            statusesFragment.A0h = (AnonymousClass18W) r2.ANE.get();
            statusesFragment.A0m = (C23611Cq) r2.ANM.get();
            statusesFragment.A0o = (AnonymousClass1L1) r2.ANR.get();
            statusesFragment.A0p = (AnonymousClass1BM) r2.ANB.get();
            statusesFragment.A0X = (AnonymousClass184) r2.ANL.get();
            statusesFragment.A0T = (AnonymousClass177) r2.A0q.get();
            statusesFragment.A0n = C16150sX.A17(r2);
            statusesFragment.A0C = (C23171At) r2.A3T.get();
            statusesFragment.A04 = (C19570ye) r2.A0O.get();
            statusesFragment.A0y = C17270uo.A00(r2.ARN);
            statusesFragment.A0x = C17270uo.A00(r2.A5z);
            statusesFragment.A06 = (C50442Zm) r32.A0R.get();
            statusesFragment.A0q = (C23031Af) r2.ANO.get();
            statusesFragment.A0z = C17270uo.A00(r2.ARU);
            statusesFragment.A0b = (C17240ul) r2.ABK.get();
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
