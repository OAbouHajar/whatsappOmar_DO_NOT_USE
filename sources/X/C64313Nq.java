package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.3Nq  reason: invalid class name and case insensitive filesystem */
public class C64313Nq extends FrameLayout.LayoutParams {
    public float A00 = 0.5f;
    public int A01 = 0;

    public C64313Nq(int i2, int i3) {
        super(i2, i3);
    }

    public C64313Nq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53362fa.A06);
        this.A01 = obtainStyledAttributes.getInt(0, 0);
        this.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public C64313Nq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
