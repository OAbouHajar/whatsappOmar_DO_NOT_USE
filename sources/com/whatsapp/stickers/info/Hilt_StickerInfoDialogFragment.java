package com.whatsapp.stickers.info;

import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C16150sX;
import X.C17050uS;
import X.C211613a;
import X.C26141Mm;
import X.C27651Sp;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_StickerInfoDialogFragment extends WaDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.Hilt_StickerInfoDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            StickerInfoDialogFragment stickerInfoDialogFragment = (StickerInfoDialogFragment) this;
            C17050uS r3 = (C17050uS) AnonymousClass3K3.A0b(this);
            C16150sX r2 = r3.A0b;
            AnonymousClass3K2.A18(r2, stickerInfoDialogFragment);
            stickerInfoDialogFragment.A0A = C16150sX.A04(r2);
            stickerInfoDialogFragment.A0K = C16150sX.A1B(r2);
            stickerInfoDialogFragment.A0D = (C211613a) r2.A1E.get();
            stickerInfoDialogFragment.A09 = AnonymousClass3K3.A0a(r2);
            stickerInfoDialogFragment.A0G = (AnonymousClass1CX) r2.ANk.get();
            stickerInfoDialogFragment.A0B = (C26141Mm) r2.A10.get();
            stickerInfoDialogFragment.A0F = (AnonymousClass1MF) r2.ANa.get();
            stickerInfoDialogFragment.A0C = r3.A0Y.A0c();
            stickerInfoDialogFragment.A0J = (C27651Sp) r2.ANj.get();
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
