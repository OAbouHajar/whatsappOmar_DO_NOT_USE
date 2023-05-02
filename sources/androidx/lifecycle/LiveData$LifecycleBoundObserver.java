package androidx.lifecycle;

import X.AnonymousClass023;
import X.AnonymousClass028;
import X.AnonymousClass05T;
import X.AnonymousClass07G;
import X.C001300o;
import X.C009604p;
import X.C011005f;
import X.C011405n;

public class LiveData$LifecycleBoundObserver extends AnonymousClass07G implements AnonymousClass05T {
    public final C001300o A00;
    public final /* synthetic */ AnonymousClass028 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(C001300o r1, AnonymousClass028 r2, AnonymousClass023 r3) {
        super(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        this.A00.getLifecycle().A01(this);
    }

    public boolean A02() {
        return ((C009604p) this.A00.getLifecycle()).A02.A00(C011005f.STARTED);
    }

    public boolean A03(C001300o r3) {
        return this.A00 == r3;
    }

    public void AXa(C011405n r5, C001300o r6) {
        C001300o r2 = this.A00;
        C011005f r1 = ((C009604p) r2.getLifecycle()).A02;
        C011005f r3 = r1;
        if (r1 == C011005f.DESTROYED) {
            this.A01.A08(this.A02);
            return;
        }
        C011005f r0 = null;
        while (r0 != r1) {
            A01(A02());
            r1 = ((C009604p) r2.getLifecycle()).A02;
            r0 = r3;
            r3 = r1;
        }
    }
}
