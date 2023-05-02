package androidx.preference.internal;

import X.AnonymousClass0NL;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class PreferenceImageView extends ImageView {
    public int A00;
    public int A01;

    public PreferenceImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A01 = Integer.MAX_VALUE;
        this.A00 = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A09, i2, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    public int getMaxHeight() {
        return this.A00;
    }

    public int getMaxWidth() {
        return this.A01;
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i4 = this.A01;
            if (i4 != Integer.MAX_VALUE && (i4 < size || mode == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i3);
            int i5 = this.A00;
            if (i5 != Integer.MAX_VALUE && (i5 < size2 || mode2 == 0)) {
                i3 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxHeight(int i2) {
        this.A00 = i2;
        super.setMaxHeight(i2);
    }

    public void setMaxWidth(int i2) {
        this.A01 = i2;
        super.setMaxWidth(i2);
    }
}
