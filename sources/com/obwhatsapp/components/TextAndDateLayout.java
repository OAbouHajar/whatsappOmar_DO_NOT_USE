package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import X.C93794jm;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TextAndDateLayout extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public AnonymousClass013 A01;
    public C52662eE A02;
    public boolean A03;
    public boolean A04;

    public TextAndDateLayout(Context context) {
        super(context);
        A00();
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01(attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        A01(attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    private int getLastParagraphDirection() {
        Layout layout = ((TextView) getChildAt(0)).getLayout();
        int i2 = this.A00;
        return layout.getParagraphDirection(i2 == 0 ? layout.getLineCount() - 1 : Math.min(i2 - 1, layout.getLineCount() - 1));
    }

    private void setTextViewStyle(int i2) {
        TextView textView = (TextView) getChildAt(0);
        if (i2 > 0) {
            textView.setMaxLines(i2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void A00() {
        if (!this.A04) {
            this.A04 = true;
            this.A01 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C53072ew.A0O, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getInt(1, 0);
                this.A03 = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setTextViewStyle(this.A00);
        if (this.A03) {
            TextView textView = (TextView) getChildAt(0);
            textView.addTextChangedListener(new C93794jm(textView, this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011e, code lost:
        if (r13.A03 == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r4 = 0
            android.view.View r2 = r13.getChildAt(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6 = 1
            android.view.View r12 = r13.getChildAt(r6)
            android.text.Layout r0 = r2.getLayout()
            r11 = 0
            if (r0 != 0) goto L_0x0014
            r11 = 1
        L_0x0014:
            super.onMeasure(r14, r15)
            int r1 = android.view.View.MeasureSpec.getMode(r15)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0036
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0036
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            android.text.Layout r5 = r2.getLayout()
            if (r5 != 0) goto L_0x0037
            java.lang.String r0 = "TextAndDateLayout/onMeasure/error getting textView layout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r13.isInEditMode()
            r10 = 0
            if (r0 != 0) goto L_0x004f
            int r1 = r13.getLastParagraphDirection()
            r0 = -1
            if (r1 != r0) goto L_0x0110
            X.013 r0 = r13.A01
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x011a
        L_0x004f:
            r9 = 0
        L_0x0050:
            int r0 = r5.getLineCount()
            if (r0 <= r6) goto L_0x0122
            int r0 = r13.A00
            if (r0 != 0) goto L_0x0102
            int r0 = r5.getLineCount()
            int r0 = r0 + -1
        L_0x0060:
            int r6 = r5.getLineStart(r0)
            int r0 = r13.A00
            if (r0 != 0) goto L_0x00f4
            int r0 = r5.getLineCount()
            int r0 = r0 + -1
        L_0x006e:
            int r8 = r5.getLineEnd(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00ef
            java.lang.CharSequence r7 = r5.getText()
        L_0x007c:
            java.lang.CharSequence r1 = r7.subSequence(r6, r8)
            android.text.TextPaint r0 = r2.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            int r6 = (int) r0
            int r1 = r13.A00
            if (r1 <= 0) goto L_0x009b
            int r0 = r5.getLineCount()
            if (r1 >= r0) goto L_0x009b
            int r0 = r5.getLineStart(r4)
            java.lang.CharSequence r7 = r7.subSequence(r0, r8)
        L_0x009b:
            int r1 = r2.getMeasuredWidth()
            if (r11 != 0) goto L_0x00c5
            r0 = 10
            int r0 = android.text.TextUtils.indexOf(r7, r0)
            if (r0 < 0) goto L_0x00c5
            android.text.TextPaint r0 = r2.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r7, r0)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            int r7 = (int) r4
            int r0 = r2.getPaddingRight()
            int r7 = r7 + r0
            int r0 = r2.getPaddingLeft()
            int r7 = r7 + r0
            int r1 = java.lang.Math.min(r1, r7)
        L_0x00c5:
            int r0 = r13.getPaddingLeft()
            int r3 = r3 - r0
            int r0 = r13.getPaddingRight()
            int r3 = r3 - r0
            int r0 = r12.getMeasuredWidth()
            int r0 = r0 + r1
            if (r3 < r0) goto L_0x015a
            if (r9 != 0) goto L_0x015a
            int r0 = r12.getMeasuredWidth()
            int r1 = r1 + r0
            int r0 = r13.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r13.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r13.getMeasuredHeight()
            r13.setMeasuredDimension(r1, r0)
            return
        L_0x00ef:
            java.lang.CharSequence r7 = r2.getText()
            goto L_0x007c
        L_0x00f4:
            int r1 = r0 + -1
            int r0 = r5.getLineCount()
            int r0 = r0 + -1
            int r0 = java.lang.Math.min(r1, r0)
            goto L_0x006e
        L_0x0102:
            int r1 = r0 + -1
            int r0 = r5.getLineCount()
            int r0 = r0 + -1
            int r0 = java.lang.Math.min(r1, r0)
            goto L_0x0060
        L_0x0110:
            if (r1 != r6) goto L_0x004f
            X.013 r0 = r13.A01
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x004f
        L_0x011a:
            r10 = 1
            boolean r0 = r13.A03
            r9 = 1
            if (r0 != 0) goto L_0x0050
            goto L_0x004f
        L_0x0122:
            int r0 = r13.getPaddingLeft()
            int r3 = r3 - r0
            int r0 = r13.getPaddingRight()
            int r3 = r3 - r0
            int r1 = r2.getMeasuredWidth()
            int r0 = r12.getMeasuredWidth()
            int r1 = r1 + r0
            if (r3 < r1) goto L_0x016d
            if (r9 != 0) goto L_0x016d
            int r2 = r2.getMeasuredWidth()
            int r0 = r12.getMeasuredWidth()
            int r2 = r2 + r0
            int r0 = r13.getPaddingLeft()
            int r2 = r2 + r0
            int r0 = r13.getPaddingRight()
            int r2 = r2 + r0
            int r0 = r13.getMeasuredWidth()
            if (r2 <= r0) goto L_0x0036
            int r1 = r13.getMeasuredHeight()
        L_0x0156:
            r13.setMeasuredDimension(r2, r1)
            return
        L_0x015a:
            int r0 = r2.getPaddingLeft()
            int r1 = r1 - r0
            int r0 = r2.getPaddingRight()
            int r1 = r1 - r0
            int r0 = r12.getMeasuredWidth()
            int r6 = r6 + r0
            if (r1 < r6) goto L_0x016d
            if (r10 == 0) goto L_0x0036
        L_0x016d:
            int r2 = r13.getMeasuredWidth()
            int r1 = r13.getMeasuredHeight()
            int r0 = r12.getMeasuredHeight()
            int r1 = r1 + r0
            goto L_0x0156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.components.TextAndDateLayout.onMeasure(int, int):void");
    }

    public void setMaxTextLineCount(int i2) {
        if (this.A00 != i2) {
            invalidate();
            setTextViewStyle(i2);
        }
        this.A00 = i2;
    }
}
