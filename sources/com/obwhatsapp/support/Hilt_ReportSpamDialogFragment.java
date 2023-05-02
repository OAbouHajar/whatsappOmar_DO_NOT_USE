package com.obwhatsapp.support;

import X.AnonymousClass006;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass10R;
import X.AnonymousClass2TA;
import X.C14870pt;
import X.C15810rt;
import X.C15900s5;
import X.C16000sG;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16300so;
import X.C16320sq;
import X.C16490t9;
import X.C16980tz;
import X.C17050uS;
import X.C17060uT;
import X.C17230uk;
import X.C25931Lr;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;

public abstract class Hilt_ReportSpamDialogFragment extends DialogFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1K();
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
            r3.A1K()
            r3.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.support.Hilt_ReportSpamDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1K();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            ReportSpamDialogFragment reportSpamDialogFragment = (ReportSpamDialogFragment) this;
            C16150sX r2 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            reportSpamDialogFragment.A01 = (C14870pt) r2.AB3.get();
            reportSpamDialogFragment.A00 = (C16300so) r2.A5p.get();
            reportSpamDialogFragment.A07 = (C16980tz) r2.AQB.get();
            reportSpamDialogFragment.A0E = (C16320sq) r2.ARB.get();
            reportSpamDialogFragment.A09 = (C15810rt) r2.A43.get();
            reportSpamDialogFragment.A0B = (C16490t9) r2.AQz.get();
            reportSpamDialogFragment.A02 = (C15900s5) r2.ALm.get();
            reportSpamDialogFragment.A04 = (C16000sG) r2.A4x.get();
            reportSpamDialogFragment.A05 = (C16080sP) r2.AQ9.get();
            reportSpamDialogFragment.A08 = (AnonymousClass10R) r2.A3t.get();
            reportSpamDialogFragment.A06 = (C25931Lr) r2.AMs.get();
            reportSpamDialogFragment.A03 = (C17230uk) r2.A4I.get();
            reportSpamDialogFragment.A0A = (C16070sO) r2.ABY.get();
        }
    }

    public final void A1K() {
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
