package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/* renamed from: X.2cJ  reason: invalid class name and case insensitive filesystem */
public abstract class C51802cJ extends ListView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C51802cJ(Context context) {
        super(context);
        A01();
    }

    public C51802cJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public C51802cJ(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
    }

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
