package com.obwhatsapp.biz.linkedaccounts;

import X.AnonymousClass006;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.C13690nt;
import X.C16150sX;
import X.C17060uT;
import X.C19980zJ;
import X.C26781Pd;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;

public abstract class Hilt_LinkedAccountMediaViewFragment extends MediaViewBaseFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C13690nt.A0Y();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1T();
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
            r0 = 1
            r2.A0V = r0
            android.content.ContextWrapper r1 = r2.A00
            if (r1 == 0) goto L_0x000e
            android.content.Context r1 = X.C54442hW.A00(r1)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C52772eQ.A01(r0)
            r2.A1T()
            r2.A1S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.biz.linkedaccounts.Hilt_LinkedAccountMediaViewFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1T();
        A1S();
    }

    public void A1S() {
        if (!this.A02) {
            this.A02 = true;
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            C16150sX A012 = C16150sX.A01(linkedAccountMediaViewFragment, (C17060uT) generatedComponent());
            linkedAccountMediaViewFragment.A06 = C16150sX.A0U(A012);
            linkedAccountMediaViewFragment.A02 = (C19980zJ) A012.A0P.get();
            linkedAccountMediaViewFragment.A08 = C16150sX.A0Z(A012);
            linkedAccountMediaViewFragment.A05 = C16150sX.A0P(A012);
            linkedAccountMediaViewFragment.A07 = C16150sX.A0X(A012);
            linkedAccountMediaViewFragment.A04 = (C26781Pd) A012.ADO.get();
        }
    }

    public final void A1T() {
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
