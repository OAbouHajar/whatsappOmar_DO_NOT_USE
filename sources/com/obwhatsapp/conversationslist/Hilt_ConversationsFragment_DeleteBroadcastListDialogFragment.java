package com.obwhatsapp.conversationslist;

import X.AnonymousClass11A;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C16150sX;
import X.C16760tb;
import X.C17050uS;
import X.C25721Kw;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;
import com.obwhatsapp.conversationslist.ConversationsFragment;

public abstract class Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment extends WaDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversationslist.Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = (ConversationsFragment.DeleteBroadcastListDialogFragment) this;
            C16150sX r1 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r1, deleteBroadcastListDialogFragment);
            deleteBroadcastListDialogFragment.A03 = C16150sX.A0U(r1);
            deleteBroadcastListDialogFragment.A08 = C16150sX.A1B(r1);
            deleteBroadcastListDialogFragment.A06 = C16150sX.A0i(r1);
            deleteBroadcastListDialogFragment.A00 = (C16760tb) r1.APV.get();
            deleteBroadcastListDialogFragment.A01 = C16150sX.A0M(r1);
            deleteBroadcastListDialogFragment.A02 = C16150sX.A0Q(r1);
            deleteBroadcastListDialogFragment.A04 = C16150sX.A0Y(r1);
            deleteBroadcastListDialogFragment.A05 = (AnonymousClass11A) r1.A5U.get();
            deleteBroadcastListDialogFragment.A07 = (C25721Kw) r1.A6Z.get();
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
