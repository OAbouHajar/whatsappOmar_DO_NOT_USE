package com.obwhatsapp.text;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.obwhatsapp.WaTextView;

public class AutoSizeTextView extends WaTextView {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public int[] A04;

    public AutoSizeTextView(Context context) {
        super(context);
        A00();
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0;
        this.A04 = null;
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0;
        this.A04 = null;
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0;
        this.A04 = null;
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public final void A0A() {
        int i2;
        int compoundPaddingLeft = (this.A02 - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int[] iArr = this.A04;
        if (iArr != null && iArr.length != 0) {
            TextPaint textPaint = new TextPaint(getPaint());
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.A04;
                int length = iArr2.length;
                if (i3 >= length) {
                    i2 = iArr2[length - 1];
                    break;
                }
                textPaint.setTextSize((float) iArr2[i3]);
                if (textPaint.measureText(getText().toString()) <= ((float) compoundPaddingLeft)) {
                    i2 = this.A04[i3];
                    break;
                }
                i3++;
            }
            if (i2 >= 0) {
                post(new RunnableRunnableShape0S0101000_I0((Object) this, i2, 29));
            }
        }
    }

    public final void A0B() {
        int round = Math.round(this.A00 / getResources().getDisplayMetrics().scaledDensity);
        int round2 = (round - Math.round(this.A01 / getResources().getDisplayMetrics().scaledDensity)) + 1;
        this.A04 = new int[round2];
        for (int i2 = 0; i2 < round2; i2++) {
            this.A04[i2] = Math.round(TypedValue.applyDimension(2, (float) (round - i2), getResources().getDisplayMetrics()));
        }
    }

    public void A0C(int i2) {
        this.A01 = TypedValue.applyDimension(2, (float) 11, getResources().getDisplayMetrics());
        this.A02 = Math.round(TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics()));
        if (this.A00 == 0.0f) {
            this.A00 = getTextSize();
        }
        A0B();
        A0A();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 > 0 && i2 != i4 && i3 != i5) {
            A0A();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        A0A();
    }

    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        this.A00 = getPaint().getTextSize();
        A0B();
        A0A();
    }
}
