package com.obwhatsapp.calling.callhistory.view;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass19Y;
import X.AnonymousClass1BJ;
import X.AnonymousClass1D0;
import X.AnonymousClass2TA;
import X.AnonymousClass2Xf;
import X.AnonymousClass4CS;
import X.AnonymousClass4CT;
import X.AnonymousClass4CV;
import X.AnonymousClass4CW;
import X.AnonymousClass4CX;
import X.C14710pd;
import X.C14870pt;
import X.C16000sG;
import X.C16040sK;
import X.C16150sX;
import X.C16440t3;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17200uh;
import X.C17240ul;
import X.C18890xQ;
import X.C19980zJ;
import X.C204310c;
import X.C216014s;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_CallsHistoryFragmentV2 extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A02() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A02();
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
            r3.A02()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callhistory.view.Hilt_CallsHistoryFragmentV2.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A02();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this;
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r3.A0b;
            callsHistoryFragmentV2.A00 = (C17070uU) r2.ABg.get();
            callsHistoryFragmentV2.A01 = (C17080uV) r2.APK.get();
            callsHistoryFragmentV2.A0S = (C14710pd) r2.A05.get();
            callsHistoryFragmentV2.A08 = (C19980zJ) r2.A0P.get();
            callsHistoryFragmentV2.A0F = (C204310c) r2.A3O.get();
            callsHistoryFragmentV2.A0R = (AnonymousClass1D0) r2.A3P.get();
            callsHistoryFragmentV2.A0J = (C16000sG) r2.A4x.get();
            callsHistoryFragmentV2.A0I = (AnonymousClass19Y) r2.A4r.get();
            callsHistoryFragmentV2.A0M = (C17200uh) r2.A52.get();
            callsHistoryFragmentV2.A0N = r3.A0Y.A0E();
            callsHistoryFragmentV2.A09 = (C14870pt) r2.AB3.get();
            callsHistoryFragmentV2.A0T = (C17240ul) r2.ABK.get();
            callsHistoryFragmentV2.A0A = (C16040sK) r2.ADr.get();
            callsHistoryFragmentV2.A0D = new AnonymousClass2Xf((AnonymousClass4CS) r3.A0A.get(), (AnonymousClass4CT) r3.A0B.get(), (AnonymousClass4CV) r3.A0D.get(), (AnonymousClass4CW) r3.A0E.get(), (AnonymousClass4CX) r3.A0F.get());
            callsHistoryFragmentV2.A0U = (C216014s) r2.AMr.get();
            callsHistoryFragmentV2.A0O = (AnonymousClass01V) r2.AOi.get();
            callsHistoryFragmentV2.A0B = (AnonymousClass1BJ) r2.AOm.get();
            callsHistoryFragmentV2.A0P = (C16440t3) r2.AP2.get();
            callsHistoryFragmentV2.A0C = (C18890xQ) r2.APS.get();
            callsHistoryFragmentV2.A0G = C16150sX.A0J(r2);
            callsHistoryFragmentV2.A0Q = (AnonymousClass013) r2.AR8.get();
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
