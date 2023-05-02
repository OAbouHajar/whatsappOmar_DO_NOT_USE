package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.BoundedLinearLayout;
import com.obwhatsapp.components.MaxHeightLinearLayout;

/* renamed from: X.3OR  reason: invalid class name */
public abstract class AnonymousClass3OR extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass3OR(Context context) {
        super(context);
        A00();
    }

    public AnonymousClass3OR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass3OR(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public AnonymousClass3OR(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
    }

    public void A00() {
        if (this instanceof MaxHeightLinearLayout) {
            MaxHeightLinearLayout maxHeightLinearLayout = (MaxHeightLinearLayout) this;
            if (!maxHeightLinearLayout.A01) {
                maxHeightLinearLayout.A01 = true;
                maxHeightLinearLayout.generatedComponent();
            }
        } else if (this instanceof BoundedLinearLayout) {
            BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) this;
            if (!boundedLinearLayout.A02) {
                boundedLinearLayout.A02 = true;
                boundedLinearLayout.generatedComponent();
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
