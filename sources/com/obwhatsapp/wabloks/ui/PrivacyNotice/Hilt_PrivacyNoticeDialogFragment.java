package com.obwhatsapp.wabloks.ui.PrivacyNotice;

import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass2ZU;
import X.C14710pd;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17270uo;
import X.C49132Rg;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.wabloks.base.BkDialogFragment;

public abstract class Hilt_PrivacyNoticeDialogFragment extends BkDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A04() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A04();
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
            super.A0y(r4)
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
            r3.A04()
            r3.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wabloks.ui.PrivacyNotice.Hilt_PrivacyNoticeDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A04();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            PrivacyNoticeDialogFragment privacyNoticeDialogFragment = (PrivacyNoticeDialogFragment) this;
            C17050uS r4 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r3 = r4.A0b;
            privacyNoticeDialogFragment.A01 = (C17070uU) r3.ABg.get();
            privacyNoticeDialogFragment.A03 = (C17080uV) r3.APK.get();
            privacyNoticeDialogFragment.A04 = (C14710pd) r3.A05.get();
            privacyNoticeDialogFragment.A02 = (AnonymousClass013) r3.AR8.get();
            C49132Rg r1 = r4.A0Y;
            privacyNoticeDialogFragment.A00 = (AnonymousClass2ZU) r1.A1m.get();
            privacyNoticeDialogFragment.A05 = C16150sX.A1C(r3);
            privacyNoticeDialogFragment.A01 = r1.A06();
            privacyNoticeDialogFragment.A03 = C17270uo.A00(r4.A00);
            privacyNoticeDialogFragment.A04 = C17270uo.A00(r3.APJ);
        }
    }
}
