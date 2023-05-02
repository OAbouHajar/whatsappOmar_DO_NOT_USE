package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.3O3  reason: invalid class name */
public abstract class AnonymousClass3O3 extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass3O3(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass33z r2 = (AnonymousClass33z) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A01 = C16150sX.A0Z(r1);
            r2.A00 = (C25831Lh) r1.A5Q.get();
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
