package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: X.3OK  reason: invalid class name */
public class AnonymousClass3OK extends LinearLayout.LayoutParams {
    public int A00 = 1;
    public Interpolator A01;

    public AnonymousClass3OK() {
        super(-1, -2);
    }

    public AnonymousClass3OK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53362fa.A01);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass3OK(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass3OK(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public AnonymousClass3OK(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
