package com.obwhatsapp.text;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.obwhatsapp.WaTextView;

public class CondensedTextView extends WaTextView {
    public float A00;
    public TextPaint A01;
    public boolean A02;

    public CondensedTextView(Context context) {
        super(context);
        A00();
        this.A00 = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A00 = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public final void A0A(String str) {
        int measuredWidth;
        TextPaint textPaint = this.A01;
        if (textPaint == null || textPaint.getTextSize() != getPaint().getTextSize()) {
            TextPaint textPaint2 = new TextPaint(getPaint());
            this.A01 = textPaint2;
            textPaint2.setTextScaleX(1.0f);
        }
        float measureText = this.A01.measureText(str);
        if (measureText > 0.0f && (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) > 0) {
            float f2 = (float) measuredWidth;
            float f3 = f2 / measureText;
            if (f3 < 1.0f) {
                float max = Math.max(this.A00, f3);
                while (true) {
                    setTextScaleX(max);
                    if (getPaint().measureText(str) <= f2 || max <= this.A00) {
                        setSingleLine(true);
                        setHorizontallyScrolling(false);
                    } else {
                        max *= 0.99f;
                    }
                }
                setSingleLine(true);
                setHorizontallyScrolling(false);
            } else if (getTextScaleX() != 1.0f) {
                setTextScaleX(1.0f);
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            A0A(getText().toString());
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        A0A(getText().toString());
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A0A(charSequence.toString());
    }

    public void setTextScaleLimit(float f2) {
        this.A00 = f2;
    }

    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        this.A01.setTextSize(getPaint().getTextSize());
        A0A(getText().toString());
    }
}
