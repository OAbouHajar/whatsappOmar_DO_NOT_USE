package androidx.lifecycle;

import X.AnonymousClass05T;
import X.AnonymousClass05X;
import X.C001300o;
import X.C009704q;
import X.C011405n;
import X.C016407u;

public final class SavedStateHandleController implements AnonymousClass05T {
    public boolean A00 = false;
    public final C016407u A01;
    public final String A02;

    public SavedStateHandleController(C016407u r2, String str) {
        this.A02 = str;
        this.A01 = r2;
    }

    public void A00(C009704q r3, AnonymousClass05X r4) {
        if (!this.A00) {
            this.A00 = true;
            r3.A00(this);
            r4.A05(this.A01.A00, this.A02);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public void AXa(C011405n r2, C001300o r3) {
        if (r2 == C011405n.ON_DESTROY) {
            this.A00 = false;
            r3.getLifecycle().A01(this);
        }
    }
}
