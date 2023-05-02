package X;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0;

/* renamed from: X.05O  reason: invalid class name */
public final class AnonymousClass05O {
    public boolean A00;
    public final AnonymousClass05X A01 = new AnonymousClass05X();
    public final C001600r A02;

    public AnonymousClass05O(C001600r r2) {
        this.A02 = r2;
    }

    public final void A00() {
        C001600r r4 = this.A02;
        C009704q lifecycle = r4.getLifecycle();
        C18450wi.A0B(lifecycle);
        if (((C009604p) lifecycle).A02 == C011005f.INITIALIZED) {
            lifecycle.A00(new Recreator(r4));
            AnonymousClass05X r1 = this.A01;
            if (!r1.A02) {
                lifecycle.A00(new SavedStateRegistry$$ExternalSyntheticLambda0(r1));
                r1.A02 = true;
                this.A00 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void A01(Bundle bundle) {
        if (!this.A00) {
            A00();
        }
        C009704q lifecycle = this.A02.getLifecycle();
        C18450wi.A0B(lifecycle);
        C009604p r2 = (C009604p) lifecycle;
        if (!r2.A02.A00(C011005f.STARTED)) {
            AnonymousClass05X r22 = this.A01;
            if (!r22.A02) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!r22.A04) {
                r22.A00 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                r22.A04 = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            sb.append(r2.A02);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void A02(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        this.A01.A04(bundle);
    }
}
