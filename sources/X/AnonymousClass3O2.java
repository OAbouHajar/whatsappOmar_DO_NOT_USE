package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.3O2  reason: invalid class name */
public abstract class AnonymousClass3O2 extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass3O2(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((C603631d) this).A0G = C16150sX.A0T(((C52652eD) ((C52642eC) generatedComponent())).A07);
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
