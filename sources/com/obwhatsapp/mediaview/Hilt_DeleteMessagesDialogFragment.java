package com.obwhatsapp.mediaview;

import X.AnonymousClass15W;
import X.AnonymousClass1L9;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C16070sO;
import X.C16150sX;
import X.C16760tb;
import X.C16820th;
import X.C17050uS;
import X.C17240ul;
import X.C18030w2;
import X.C18040w3;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_DeleteMessagesDialogFragment extends WaDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.Hilt_DeleteMessagesDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            DeleteMessagesDialogFragment deleteMessagesDialogFragment = (DeleteMessagesDialogFragment) this;
            C16150sX r2 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r2, deleteMessagesDialogFragment);
            deleteMessagesDialogFragment.A06 = C16150sX.A0U(r2);
            deleteMessagesDialogFragment.A02 = C16150sX.A02(r2);
            deleteMessagesDialogFragment.A0H = C16150sX.A1B(r2);
            deleteMessagesDialogFragment.A0C = C16150sX.A0m(r2);
            deleteMessagesDialogFragment.A0B = C16150sX.A0i(r2);
            deleteMessagesDialogFragment.A03 = (C16760tb) r2.APV.get();
            deleteMessagesDialogFragment.A04 = C16150sX.A0M(r2);
            deleteMessagesDialogFragment.A0A = (C18030w2) r2.A6W.get();
            deleteMessagesDialogFragment.A05 = C16150sX.A0Q(r2);
            deleteMessagesDialogFragment.A0E = (C17240ul) r2.ABK.get();
            deleteMessagesDialogFragment.A08 = (C16820th) r2.A3B.get();
            deleteMessagesDialogFragment.A0F = (AnonymousClass15W) r2.AOC.get();
            deleteMessagesDialogFragment.A0D = (C18040w3) r2.AR0.get();
            deleteMessagesDialogFragment.A07 = C16150sX.A0Y(r2);
            deleteMessagesDialogFragment.A09 = (C16070sO) r2.ABY.get();
            deleteMessagesDialogFragment.A0G = (AnonymousClass1L9) r2.AFI.get();
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
