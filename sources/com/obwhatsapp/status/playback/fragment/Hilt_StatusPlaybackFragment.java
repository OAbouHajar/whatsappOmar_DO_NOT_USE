package com.obwhatsapp.status.playback.fragment;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass10X;
import X.AnonymousClass11G;
import X.AnonymousClass127;
import X.AnonymousClass128;
import X.AnonymousClass15I;
import X.AnonymousClass184;
import X.AnonymousClass18R;
import X.AnonymousClass1AF;
import X.AnonymousClass1AM;
import X.AnonymousClass1BU;
import X.AnonymousClass1L1;
import X.AnonymousClass1PA;
import X.AnonymousClass1PE;
import X.AnonymousClass1RV;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C14870pt;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16220sf;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16760tb;
import X.C16980tz;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17090uW;
import X.C17140ub;
import X.C17200uh;
import X.C17270uo;
import X.C19150xq;
import X.C19980zJ;
import X.C204310c;
import X.C23631Ct;
import X.C25781Lc;
import X.C26941Pv;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;
import com.whatsapp.Mp4Ops;

public abstract class Hilt_StatusPlaybackFragment extends WaFragment implements AnonymousClass006 {
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
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.fragment.Hilt_StatusPlaybackFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A06();
        A19();
    }

    public void A19() {
        if (this instanceof Hilt_StatusPlaybackBaseFragment) {
            Hilt_StatusPlaybackBaseFragment hilt_StatusPlaybackBaseFragment = (Hilt_StatusPlaybackBaseFragment) this;
            if (hilt_StatusPlaybackBaseFragment instanceof Hilt_StatusPlaybackContactFragment) {
                Hilt_StatusPlaybackContactFragment hilt_StatusPlaybackContactFragment = (Hilt_StatusPlaybackContactFragment) hilt_StatusPlaybackBaseFragment;
                if (!hilt_StatusPlaybackContactFragment.A02) {
                    hilt_StatusPlaybackContactFragment.A02 = true;
                    StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) hilt_StatusPlaybackContactFragment;
                    C16150sX r1 = ((C17050uS) ((C17060uT) hilt_StatusPlaybackContactFragment.generatedComponent())).A0b;
                    statusPlaybackContactFragment.A00 = (C17070uU) r1.ABg.get();
                    statusPlaybackContactFragment.A01 = (C17080uV) r1.APK.get();
                    statusPlaybackContactFragment.A00 = (C14870pt) r1.AB3.get();
                    statusPlaybackContactFragment.A01 = (AnonymousClass01V) r1.AOi.get();
                    statusPlaybackContactFragment.A02 = (AnonymousClass013) r1.AR8.get();
                    statusPlaybackContactFragment.A05 = (AnonymousClass1PA) r1.ANH.get();
                    statusPlaybackContactFragment.A0I = (C16440t3) r1.AP2.get();
                    statusPlaybackContactFragment.A06 = (Mp4Ops) r1.AFs.get();
                    statusPlaybackContactFragment.A0P = (C14710pd) r1.A05.get();
                    statusPlaybackContactFragment.A05 = (C16040sK) r1.ADr.get();
                    statusPlaybackContactFragment.A07 = (AnonymousClass10X) r1.ALc.get();
                    statusPlaybackContactFragment.A0e = (C16320sq) r1.ARB.get();
                    statusPlaybackContactFragment.A0J = (C16980tz) r1.AQB.get();
                    statusPlaybackContactFragment.A03 = (C16300so) r1.A5p.get();
                    statusPlaybackContactFragment.A0Q = (C16490t9) r1.AQz.get();
                    statusPlaybackContactFragment.A08 = (C15900s5) r1.ALm.get();
                    statusPlaybackContactFragment.A0O = (AnonymousClass11G) r1.ANN.get();
                    statusPlaybackContactFragment.A09 = (C16760tb) r1.APV.get();
                    statusPlaybackContactFragment.A0A = (C204310c) r1.A3O.get();
                    statusPlaybackContactFragment.A04 = (C17090uW) r1.ADM.get();
                    statusPlaybackContactFragment.A0G = (C17200uh) r1.A52.get();
                    statusPlaybackContactFragment.A0a = (C26941Pv) r1.ANC.get();
                    statusPlaybackContactFragment.A02 = (C19980zJ) r1.A0P.get();
                    statusPlaybackContactFragment.A0g = (C23631Ct) r1.ART.get();
                    statusPlaybackContactFragment.A0C = (C16000sG) r1.A4x.get();
                    statusPlaybackContactFragment.A0E = (C16080sP) r1.AQ9.get();
                    statusPlaybackContactFragment.A0D = (C17140ub) r1.A4y.get();
                    statusPlaybackContactFragment.A0K = (C16460t6) r1.A5k.get();
                    statusPlaybackContactFragment.A0L = (C19150xq) r1.AFC.get();
                    statusPlaybackContactFragment.A0W = new C25781Lc();
                    statusPlaybackContactFragment.A0V = (C16220sf) r1.A3y.get();
                    statusPlaybackContactFragment.A0H = (AnonymousClass15I) r1.A3r.get();
                    statusPlaybackContactFragment.A0B = (AnonymousClass127) r1.A3z.get();
                    statusPlaybackContactFragment.A0M = (AnonymousClass128) r1.AND.get();
                    statusPlaybackContactFragment.A0Y = (AnonymousClass1AM) r1.AQj.get();
                    statusPlaybackContactFragment.A0b = (AnonymousClass1L1) r1.ANR.get();
                    statusPlaybackContactFragment.A0N = (AnonymousClass184) r1.ANL.get();
                    statusPlaybackContactFragment.A0f = (AnonymousClass1AF) r1.ARN.get();
                    statusPlaybackContactFragment.A0Z = (AnonymousClass1BU) r1.ANA.get();
                    statusPlaybackContactFragment.A0d = (AnonymousClass1PE) r1.ANJ.get();
                    statusPlaybackContactFragment.A0R = (AnonymousClass18R) r1.ABZ.get();
                    statusPlaybackContactFragment.A0h = C17270uo.A00(r1.A5z);
                    statusPlaybackContactFragment.A0i = C17270uo.A00(r1.ARU);
                    statusPlaybackContactFragment.A0U = (AnonymousClass1RV) r1.AF6.get();
                }
            } else if (!hilt_StatusPlaybackBaseFragment.A02) {
                hilt_StatusPlaybackBaseFragment.A02 = true;
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) hilt_StatusPlaybackBaseFragment;
                C16150sX r12 = ((C17050uS) ((C17060uT) hilt_StatusPlaybackBaseFragment.generatedComponent())).A0b;
                statusPlaybackBaseFragment.A00 = (C17070uU) r12.ABg.get();
                statusPlaybackBaseFragment.A01 = (C17080uV) r12.APK.get();
                statusPlaybackBaseFragment.A00 = (C14870pt) r12.AB3.get();
                statusPlaybackBaseFragment.A01 = (AnonymousClass01V) r12.AOi.get();
                statusPlaybackBaseFragment.A02 = (AnonymousClass013) r12.AR8.get();
                statusPlaybackBaseFragment.A05 = (AnonymousClass1PA) r12.ANH.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            C16150sX r13 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            this.A00 = (C17070uU) r13.ABg.get();
            this.A01 = (C17080uV) r13.APK.get();
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
