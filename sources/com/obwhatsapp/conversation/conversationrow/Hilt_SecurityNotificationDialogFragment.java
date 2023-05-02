package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass124;
import X.AnonymousClass16S;
import X.AnonymousClass1L0;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C19810z2;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_SecurityNotificationDialogFragment extends WaDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.Hilt_SecurityNotificationDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1M();
        A1J();
    }

    public void A1J() {
        if (this instanceof Hilt_IdentityChangeDialogFragment) {
            Hilt_IdentityChangeDialogFragment hilt_IdentityChangeDialogFragment = (Hilt_IdentityChangeDialogFragment) this;
            if (!hilt_IdentityChangeDialogFragment.A02) {
                hilt_IdentityChangeDialogFragment.A02 = true;
                C17060uT A0b = AnonymousClass3K3.A0b(hilt_IdentityChangeDialogFragment);
                IdentityChangeDialogFragment identityChangeDialogFragment = (IdentityChangeDialogFragment) hilt_IdentityChangeDialogFragment;
                C16150sX r1 = ((C17050uS) A0b).A0b;
                AnonymousClass3K2.A18(r1, identityChangeDialogFragment);
                AnonymousClass3K2.A19(r1, identityChangeDialogFragment);
                identityChangeDialogFragment.A02 = C16150sX.A1B(r1);
                identityChangeDialogFragment.A01 = (AnonymousClass16S) r1.AFt.get();
                identityChangeDialogFragment.A00 = (C19810z2) r1.APZ.get();
            }
        } else if (this instanceof Hilt_DeviceUpdateDialogFragment) {
            Hilt_DeviceUpdateDialogFragment hilt_DeviceUpdateDialogFragment = (Hilt_DeviceUpdateDialogFragment) this;
            if (!hilt_DeviceUpdateDialogFragment.A02) {
                hilt_DeviceUpdateDialogFragment.A02 = true;
                C17060uT A0b2 = AnonymousClass3K3.A0b(hilt_DeviceUpdateDialogFragment);
                DeviceUpdateDialogFragment deviceUpdateDialogFragment = (DeviceUpdateDialogFragment) hilt_DeviceUpdateDialogFragment;
                C16150sX r12 = ((C17050uS) A0b2).A0b;
                AnonymousClass3K2.A18(r12, deviceUpdateDialogFragment);
                AnonymousClass3K2.A19(r12, deviceUpdateDialogFragment);
                deviceUpdateDialogFragment.A02 = C16150sX.A1B(r12);
                deviceUpdateDialogFragment.A01 = (AnonymousClass124) r12.ALe.get();
                deviceUpdateDialogFragment.A00 = (AnonymousClass1L0) r12.A6j.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            SecurityNotificationDialogFragment securityNotificationDialogFragment = (SecurityNotificationDialogFragment) this;
            C16150sX r0 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r0, securityNotificationDialogFragment);
            AnonymousClass3K2.A19(r0, securityNotificationDialogFragment);
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }
}
