package com.whatsapp.stickers.store;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class StickerStoreRowHeaderLayout extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public StickerStoreRowHeaderLayout(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A01) {
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

    public void onMeasure(int i2, int i3) {
        String str;
        super.onMeasure(i2, i3);
        if (getChildCount() != 4) {
            str = "StickerStoreRowHeaderLayout should have 4 children!";
        } else {
            int measuredWidth = getMeasuredWidth();
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(1);
            View childAt3 = getChildAt(2);
            View childAt4 = getChildAt(3);
            if (childAt == null || childAt3 == null || childAt4 == null || childAt2 == null) {
                str = "StickerStoreRowHeaderLayout should have 4 children! Title View, Animated View, Author View and a Remaining View";
            } else {
                childAt4.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i3);
                int measuredWidth2 = measuredWidth - childAt4.getMeasuredWidth();
                if (measuredWidth2 < 0) {
                    measuredWidth2 = 0;
                }
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, Integer.MIN_VALUE), i3);
                int measuredWidth3 = measuredWidth2 - childAt2.getMeasuredWidth();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, Integer.MIN_VALUE), i3);
                childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, Integer.MIN_VALUE), i3);
                int measuredWidth4 = childAt3.getMeasuredWidth();
                int measuredWidth5 = childAt.getMeasuredWidth();
                if (measuredWidth4 + measuredWidth5 > measuredWidth3) {
                    int i4 = measuredWidth3 / 3;
                    if (i4 > measuredWidth4) {
                        i4 = measuredWidth4;
                    }
                    int i5 = (measuredWidth3 << 1) / 3;
                    if (i5 > measuredWidth5) {
                        i5 = measuredWidth5;
                    }
                    measuredWidth5 = i5;
                    int i6 = measuredWidth3 - (i4 + i5);
                    if (i4 == measuredWidth4) {
                        measuredWidth5 = i5 + i6;
                    } else {
                        i4 += i6;
                    }
                    measuredWidth4 = i4;
                }
                childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, Integer.MIN_VALUE), i3);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth5, Integer.MIN_VALUE), i3);
                return;
            }
        }
        AnonymousClass00B.A08(str);
    }
}
