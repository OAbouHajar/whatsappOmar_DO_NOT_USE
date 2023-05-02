package com.obwhatsapp.payments.ui.invites;

import X.AnonymousClass006;
import X.AnonymousClass04o;
import X.AnonymousClass175;
import X.AnonymousClass1GO;
import X.AnonymousClass2TA;
import X.AnonymousClass60V;
import X.C110105dW;
import X.C110115dX;
import X.C112715ix;
import X.C13690nt;
import X.C16040sK;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C18260wP;
import X.C227819g;
import X.C227919h;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_PaymentInviteFragment extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C13690nt.A0Y();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1A();
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
            r2.A1A()
            r2.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.invites.Hilt_PaymentInviteFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (this instanceof Hilt_IndiaUpiPaymentInviteFragment) {
            Hilt_IndiaUpiPaymentInviteFragment hilt_IndiaUpiPaymentInviteFragment = (Hilt_IndiaUpiPaymentInviteFragment) this;
            if (!hilt_IndiaUpiPaymentInviteFragment.A02) {
                hilt_IndiaUpiPaymentInviteFragment.A02 = true;
                IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) hilt_IndiaUpiPaymentInviteFragment;
                C17050uS r3 = (C17050uS) ((C17060uT) hilt_IndiaUpiPaymentInviteFragment.generatedComponent());
                C16150sX r2 = r3.A0b;
                C110105dW.A1B(r2, indiaUpiPaymentInviteFragment);
                indiaUpiPaymentInviteFragment.A03 = C16150sX.A0U(r2);
                indiaUpiPaymentInviteFragment.A05 = C16150sX.A0k(r2);
                indiaUpiPaymentInviteFragment.A00 = C16150sX.A02(r2);
                indiaUpiPaymentInviteFragment.A01 = (C16040sK) r2.ADr.get();
                indiaUpiPaymentInviteFragment.A06 = C16150sX.A0t(r2);
                indiaUpiPaymentInviteFragment.A0H = C110115dX.A0Q(r2);
                indiaUpiPaymentInviteFragment.A0C = C110115dX.A0O(r2);
                indiaUpiPaymentInviteFragment.A09 = (AnonymousClass175) r2.AH5.get();
                indiaUpiPaymentInviteFragment.A0D = (C227819g) r2.AHv.get();
                indiaUpiPaymentInviteFragment.A0E = C110115dX.A0P(r2);
                indiaUpiPaymentInviteFragment.A0G = C16150sX.A10(r2);
                indiaUpiPaymentInviteFragment.A0I = r3.A0Y.A0Q();
                indiaUpiPaymentInviteFragment.A04 = C110115dX.A0D(r2);
                indiaUpiPaymentInviteFragment.A0A = (C227919h) r2.AH8.get();
                indiaUpiPaymentInviteFragment.A07 = C110115dX.A0J(r2);
                indiaUpiPaymentInviteFragment.A0K = (AnonymousClass1GO) r2.AHY.get();
                indiaUpiPaymentInviteFragment.A0J = C110105dW.A0O(r2);
                indiaUpiPaymentInviteFragment.A0F = C16150sX.A0z(r2);
                indiaUpiPaymentInviteFragment.A02 = (C18260wP) r2.A4p.get();
                indiaUpiPaymentInviteFragment.A0B = C110115dX.A0M(r2);
                indiaUpiPaymentInviteFragment.A08 = (AnonymousClass60V) r2.ACJ.get();
                indiaUpiPaymentInviteFragment.A0M = (C112715ix) r2.ACG.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            C110105dW.A1B(((C17050uS) ((C17060uT) generatedComponent())).A0b, (PaymentInviteFragment) this);
        }
    }

    public final void A1A() {
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
