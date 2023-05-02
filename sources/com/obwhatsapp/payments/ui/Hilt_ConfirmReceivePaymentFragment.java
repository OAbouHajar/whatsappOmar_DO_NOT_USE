package com.obwhatsapp.payments.ui;

import X.AnonymousClass006;
import X.AnonymousClass04o;
import X.AnonymousClass17O;
import X.AnonymousClass1GP;
import X.AnonymousClass2TA;
import X.AnonymousClass5vX;
import X.AnonymousClass5x7;
import X.C110115dX;
import X.C118335uW;
import X.C118955vg;
import X.C119315wt;
import X.C13690nt;
import X.C16040sK;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C18260wP;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_ConfirmReceivePaymentFragment extends WaFragment implements AnonymousClass006 {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_ConfirmReceivePaymentFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (this instanceof Hilt_BrazilConfirmReceivePaymentFragment) {
            Hilt_BrazilConfirmReceivePaymentFragment hilt_BrazilConfirmReceivePaymentFragment = (Hilt_BrazilConfirmReceivePaymentFragment) this;
            if (!hilt_BrazilConfirmReceivePaymentFragment.A02) {
                hilt_BrazilConfirmReceivePaymentFragment.A02 = true;
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) hilt_BrazilConfirmReceivePaymentFragment;
                C17050uS r3 = (C17050uS) ((C17060uT) hilt_BrazilConfirmReceivePaymentFragment.generatedComponent());
                C16150sX r2 = r3.A0b;
                C16150sX.A1E(r2, brazilConfirmReceivePaymentFragment);
                brazilConfirmReceivePaymentFragment.A04 = C110115dX.A0Q(r2);
                brazilConfirmReceivePaymentFragment.A03 = (AnonymousClass1GP) r2.AH4.get();
                brazilConfirmReceivePaymentFragment.A03 = C16150sX.A0U(r2);
                brazilConfirmReceivePaymentFragment.A06 = C16150sX.A0k(r2);
                brazilConfirmReceivePaymentFragment.A00 = C16150sX.A02(r2);
                brazilConfirmReceivePaymentFragment.A01 = (C16040sK) r2.ADr.get();
                brazilConfirmReceivePaymentFragment.A07 = C16150sX.A0t(r2);
                brazilConfirmReceivePaymentFragment.A04 = C16150sX.A0Z(r2);
                brazilConfirmReceivePaymentFragment.A0J = C110115dX.A0V(r2);
                brazilConfirmReceivePaymentFragment.A08 = (AnonymousClass5x7) r2.A2I.get();
                brazilConfirmReceivePaymentFragment.A0H = (AnonymousClass5vX) r2.A2J.get();
                brazilConfirmReceivePaymentFragment.A0E = C110115dX.A0P(r2);
                brazilConfirmReceivePaymentFragment.A0F = C16150sX.A10(r2);
                brazilConfirmReceivePaymentFragment.A0G = (C118335uW) r2.AGB.get();
                brazilConfirmReceivePaymentFragment.A05 = C110115dX.A0D(r2);
                brazilConfirmReceivePaymentFragment.A0B = C110115dX.A0J(r2);
                brazilConfirmReceivePaymentFragment.A09 = r3.A0Y.A0N();
                brazilConfirmReceivePaymentFragment.A0A = (C119315wt) r2.A2Y.get();
                brazilConfirmReceivePaymentFragment.A02 = (C18260wP) r2.A4p.get();
                brazilConfirmReceivePaymentFragment.A0C = C110115dX.A0M(r2);
                brazilConfirmReceivePaymentFragment.A0D = (AnonymousClass17O) r2.AHe.get();
                brazilConfirmReceivePaymentFragment.A0I = (C118955vg) r2.A2T.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            ConfirmReceivePaymentFragment confirmReceivePaymentFragment = (ConfirmReceivePaymentFragment) this;
            C16150sX r1 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            C16150sX.A1E(r1, confirmReceivePaymentFragment);
            confirmReceivePaymentFragment.A04 = C110115dX.A0Q(r1);
            confirmReceivePaymentFragment.A03 = (AnonymousClass1GP) r1.AH4.get();
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
