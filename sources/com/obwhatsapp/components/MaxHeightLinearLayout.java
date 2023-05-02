package com.obwhatsapp.components;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.WaLinearLayout;

public class MaxHeightLinearLayout extends WaLinearLayout {
    public int A00;
    public boolean A01;

    public MaxHeightLinearLayout(Context context) {
        super(context);
        A00();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 != 1073741824) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0016
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x001d
            if (r0 == 0) goto L_0x001a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x001d
        L_0x0016:
            super.onMeasure(r4, r5)
            return
        L_0x001a:
            int r0 = r3.A00
            goto L_0x0023
        L_0x001d:
            int r0 = r3.A00
            int r0 = java.lang.Math.min(r2, r0)
        L_0x0023:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.components.MaxHeightLinearLayout.onMeasure(int, int):void");
    }

    public void setMaxHeight(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            requestLayout();
        }
    }
}
