package com.obwhatsapp.wabloks.commerce.ui.view;

import X.AnonymousClass006;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.AnonymousClass5wM;
import X.C13690nt;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C17270uo;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.wabloks.base.BkFragment;

public abstract class Hilt_WaBkExtensionsScreenFragment extends BkFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C13690nt.A0Y();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1H();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        return C54452hX.A00(super.A0v(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.C54442hW.A00(r1) == r4) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r2 = 1
            r3.A0V = r2
            android.content.ContextWrapper r1 = r3.A00
            if (r1 == 0) goto L_0x000e
            android.content.Context r1 = X.C54442hW.A00(r1)
            r0 = 0
            if (r1 != r4) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C52772eQ.A01(r0)
            r3.A1H()
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x003a
            r3.A02 = r2
            java.lang.Object r0 = r3.generatedComponent()
            X.0uT r0 = (X.C17060uT) r0
            r2 = r3
            com.obwhatsapp.wabloks.commerce.ui.view.WaBkExtensionsScreenFragment r2 = (com.obwhatsapp.wabloks.commerce.ui.view.WaBkExtensionsScreenFragment) r2
            X.0uS r0 = (X.C17050uS) r0
            X.0sX r1 = r0.A0b
            X.01J r0 = r1.AJv
            X.01D r0 = X.C17270uo.A00(r0)
            r2.A06 = r0
            X.01J r0 = r1.A2B
            java.lang.Object r0 = r0.get()
            X.5wM r0 = (X.AnonymousClass5wM) r0
            r2.A06 = r0
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wabloks.commerce.ui.view.Hilt_WaBkExtensionsScreenFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1H();
        if (!this.A02) {
            this.A02 = true;
            WaBkExtensionsScreenFragment waBkExtensionsScreenFragment = (WaBkExtensionsScreenFragment) this;
            C16150sX r1 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            waBkExtensionsScreenFragment.A06 = C17270uo.A00(r1.AJv);
            waBkExtensionsScreenFragment.A06 = (AnonymousClass5wM) r1.A2B.get();
        }
    }

    public final void A1H() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
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
                    this.A04 = C54442hW.A01(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
