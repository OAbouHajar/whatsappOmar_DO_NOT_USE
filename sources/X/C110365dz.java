package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.5dz  reason: invalid class name and case insensitive filesystem */
public abstract class C110365dz extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C110365dz(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            C114225nN r2 = (C114225nN) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A00 = C16150sX.A0T(r1);
            r2.A01 = C16150sX.A1A(r1);
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
