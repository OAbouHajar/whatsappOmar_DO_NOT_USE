package com.obwhatsapp.bloks.ui;

import X.AnonymousClass2ZU;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C110285do;
import X.C16040sK;
import X.C16150sX;
import X.C17050uS;
import X.C23061Ai;
import X.C26251Mz;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_BloksDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1M();
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
            r2.A1M()
            r2.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.bloks.ui.Hilt_BloksDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            BloksDialogFragment bloksDialogFragment = (BloksDialogFragment) this;
            C17050uS r1 = (C17050uS) AnonymousClass3K3.A0b(this);
            C16150sX r3 = r1.A0b;
            AnonymousClass3K2.A18(r3, bloksDialogFragment);
            bloksDialogFragment.A03 = C16150sX.A02(r3);
            bloksDialogFragment.A06 = r1.A02();
            bloksDialogFragment.A04 = (C16040sK) r3.ADr.get();
            bloksDialogFragment.A0A = (C23061Ai) r3.AC0.get();
            bloksDialogFragment.A02 = (AnonymousClass2ZU) r1.A0Y.A1m.get();
            C110285do r12 = new C110285do();
            r12.A05 = (C26251Mz) r3.A28.get();
            r12.A0A = C16150sX.A1C(r3);
            bloksDialogFragment.A09 = r12;
            bloksDialogFragment.A0C = C16150sX.A1C(r3);
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
