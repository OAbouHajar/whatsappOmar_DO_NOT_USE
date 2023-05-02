package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.09K  reason: invalid class name */
public class AnonymousClass09K extends AnonymousClass05K {
    public int A00 = 0;

    public AnonymousClass09K(int i2) {
        super(-2, i2);
        this.A00 = 8388627;
    }

    public AnonymousClass09K(AnonymousClass05K r2) {
        super(r2);
    }

    public AnonymousClass09K(AnonymousClass09K r2) {
        super((AnonymousClass05K) r2);
        this.A00 = r2.A00;
    }

    public AnonymousClass09K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass09K(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass09K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
