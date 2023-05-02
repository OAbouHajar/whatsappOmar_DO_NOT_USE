package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.3O6  reason: invalid class name */
public abstract class AnonymousClass3O6 extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;

    public AnonymousClass3O6(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        if (this instanceof C73893pG) {
            C73893pG r1 = (C73893pG) this;
            if (!r1.A02) {
                r1.A02 = true;
                r1.A04 = C16150sX.A0Z(C52652eD.A00(r1.generatedComponent()));
                return;
            }
            return;
        }
        C73883pF r2 = (C73883pF) this;
        if (!r2.A04) {
            r2.A04 = true;
            C16150sX A002 = C52652eD.A00(r2.generatedComponent());
            r2.A04 = C16150sX.A0Z(A002);
            r2.A03 = (C16980tz) A002.AQB.get();
            r2.A01 = C16150sX.A04(A002);
            r2.A02 = C16150sX.A0M(A002);
            r2.A00 = (AnonymousClass1G1) A002.AJl.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
