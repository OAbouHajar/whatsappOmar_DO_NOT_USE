package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.3O8  reason: invalid class name */
public abstract class AnonymousClass3O8 extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;

    public AnonymousClass3O8(Context context) {
        super(context);
        A01();
    }

    public void A01() {
        C78203xP r1 = (C78203xP) this;
        if (!r1.A00) {
            r1.A00 = true;
            r1.A00 = C16150sX.A0Z(C52652eD.A00(r1.generatedComponent()));
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
