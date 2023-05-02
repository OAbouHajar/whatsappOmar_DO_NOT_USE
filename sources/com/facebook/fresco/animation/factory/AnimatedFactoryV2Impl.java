package com.facebook.fresco.animation.factory;

import X.AnonymousClass0PN;
import X.AnonymousClass0S4;
import X.AnonymousClass4SM;
import X.AnonymousClass5NW;
import X.C805244e;
import X.C95604mu;

public class AnimatedFactoryV2Impl {
    public AnonymousClass0PN A00;
    public AnonymousClass0S4 A01;
    public C805244e A02;
    public final AnonymousClass4SM A03;
    public final C95604mu A04;
    public final AnonymousClass5NW A05;
    public final boolean A06;

    public AnimatedFactoryV2Impl(AnonymousClass4SM r1, AnonymousClass5NW r2, C95604mu r3, boolean z2) {
        this.A03 = r1;
        this.A05 = r2;
        this.A04 = r3;
        this.A06 = z2;
    }

    public final C805244e A01() {
        C805244e r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C805244e r02 = new C805244e();
        this.A02 = r02;
        return r02;
    }
}
