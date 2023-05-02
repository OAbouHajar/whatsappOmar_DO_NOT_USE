package com.obwhatsapp.dialogs;

import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C16150sX;
import X.C17050uS;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_FAQLearnMoreDialogFragment extends WaDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (this instanceof Hilt_HFMLearnMoreDialogFragment) {
            Hilt_HFMLearnMoreDialogFragment hilt_HFMLearnMoreDialogFragment = (Hilt_HFMLearnMoreDialogFragment) this;
            if (!hilt_HFMLearnMoreDialogFragment.A02) {
                hilt_HFMLearnMoreDialogFragment.A02 = true;
                C16150sX A0Q = AnonymousClass3K2.A0Q(hilt_HFMLearnMoreDialogFragment);
                AnonymousClass3K2.A18(A0Q, hilt_HFMLearnMoreDialogFragment);
                AnonymousClass3K2.A1A(A0Q, hilt_HFMLearnMoreDialogFragment);
            }
        } else if (this instanceof Hilt_ForwardLimitToGroupsLearnMoreDialogFragment) {
            Hilt_ForwardLimitToGroupsLearnMoreDialogFragment hilt_ForwardLimitToGroupsLearnMoreDialogFragment = (Hilt_ForwardLimitToGroupsLearnMoreDialogFragment) this;
            if (!hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A02) {
                hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A02 = true;
                C16150sX A0Q2 = AnonymousClass3K2.A0Q(hilt_ForwardLimitToGroupsLearnMoreDialogFragment);
                AnonymousClass3K2.A18(A0Q2, hilt_ForwardLimitToGroupsLearnMoreDialogFragment);
                AnonymousClass3K2.A1A(A0Q2, hilt_ForwardLimitToGroupsLearnMoreDialogFragment);
            }
        } else if (!this.A02) {
            this.A02 = true;
            FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment = (FAQLearnMoreDialogFragment) this;
            C16150sX r0 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r0, fAQLearnMoreDialogFragment);
            AnonymousClass3K2.A1A(r0, fAQLearnMoreDialogFragment);
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
