package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.05K  reason: invalid class name */
public class AnonymousClass05K extends ViewGroup.MarginLayoutParams {
    public int A00;

    public AnonymousClass05K() {
        super(-2, -2);
        this.A00 = 0;
        this.A00 = 21;
    }

    public AnonymousClass05K(int i2, int i3) {
        super(i2, i3);
        this.A00 = 0;
        this.A00 = 8388627;
    }

    public AnonymousClass05K(AnonymousClass05K r2) {
        super(r2);
        this.A00 = 0;
        this.A00 = r2.A00;
    }

    public AnonymousClass05K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass05L.A01);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass05K(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 0;
    }
}
