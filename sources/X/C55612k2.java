package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: X.2k2  reason: invalid class name and case insensitive filesystem */
public abstract class C55612k2 extends RelativeLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C55612k2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            C55602k1 r2 = (C55602k1) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A03 = (C17250um) r1.A7e.get();
            r2.A02 = (AnonymousClass01V) r1.AOi.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
