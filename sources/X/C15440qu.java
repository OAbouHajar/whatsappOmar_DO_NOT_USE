package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.obwhatsapp.KeyboardPopupLayout;

/* renamed from: X.0qu  reason: invalid class name and case insensitive filesystem */
public abstract class C15440qu extends RelativeLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C15440qu(Context context) {
        super(context);
        A01();
    }

    public C15440qu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public C15440qu(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
    }

    public C15440qu(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01();
    }

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            ((KeyboardPopupLayout) this).A05 = (C23061Ai) ((C52652eD) ((C52642eC) generatedComponent())).A07.AC0.get();
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
