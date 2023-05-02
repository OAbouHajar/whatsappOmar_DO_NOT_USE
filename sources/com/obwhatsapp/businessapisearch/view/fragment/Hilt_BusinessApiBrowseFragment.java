package com.obwhatsapp.businessapisearch.view.fragment;

import X.AnonymousClass006;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.AnonymousClass2Xo;
import X.AnonymousClass4QK;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C18890xQ;
import X.C25501Ka;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import X.C82324Cj;
import X.C82334Ck;
import X.C82344Cl;
import X.C82354Cm;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BusinessApiBrowseFragment extends AnonymousClass01A implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1A();
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
            r3.A1A()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessapisearch.view.fragment.Hilt_BusinessApiBrowseFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            BusinessApiBrowseFragment businessApiBrowseFragment = (BusinessApiBrowseFragment) this;
            C17050uS r5 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r5.A0b;
            businessApiBrowseFragment.A04 = new AnonymousClass4QK((C18890xQ) r2.APS.get());
            businessApiBrowseFragment.A01 = (C82324Cj) r5.A0R.get();
            businessApiBrowseFragment.A02 = (C25501Ka) r2.A2i.get();
            businessApiBrowseFragment.A03 = new AnonymousClass2Xo((C82334Ck) r5.A0S.get(), (C82344Cl) r5.A0T.get(), (C82354Cm) r5.A0U.get());
        }
    }

    public final void A1A() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
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
