package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.2i0  reason: invalid class name and case insensitive filesystem */
public abstract class C54682i0 extends ViewPager implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C54682i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
    }

    public void A0O() {
        if (this instanceof C54672hy) {
            C54672hy r1 = (C54672hy) this;
            if (!r1.A00) {
                r1.A00 = true;
                r1.generatedComponent();
            }
        } else if (!this.A01) {
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
