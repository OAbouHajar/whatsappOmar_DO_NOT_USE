package com.obwhatsapp.chatinfo;

import X.AnonymousClass15W;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C16070sO;
import X.C16150sX;
import X.C17050uS;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment extends WaDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            ChatInfoActivity$EncryptionExplanationDialogFragment chatInfoActivity$EncryptionExplanationDialogFragment = (ChatInfoActivity$EncryptionExplanationDialogFragment) this;
            C17050uS r3 = (C17050uS) AnonymousClass3K3.A0b(this);
            C16150sX r1 = r3.A0b;
            AnonymousClass3K2.A18(r1, chatInfoActivity$EncryptionExplanationDialogFragment);
            chatInfoActivity$EncryptionExplanationDialogFragment.A05 = C16150sX.A0m(r1);
            chatInfoActivity$EncryptionExplanationDialogFragment.A03 = C16150sX.A0i(r1);
            chatInfoActivity$EncryptionExplanationDialogFragment.A04 = r3.A0Y.A0I();
            chatInfoActivity$EncryptionExplanationDialogFragment.A00 = AnonymousClass3K3.A0a(r1);
            chatInfoActivity$EncryptionExplanationDialogFragment.A01 = C16150sX.A0M(r1);
            chatInfoActivity$EncryptionExplanationDialogFragment.A07 = C16150sX.A18(r1);
            chatInfoActivity$EncryptionExplanationDialogFragment.A06 = (AnonymousClass15W) r1.AOC.get();
            chatInfoActivity$EncryptionExplanationDialogFragment.A02 = (C16070sO) r1.ABY.get();
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
