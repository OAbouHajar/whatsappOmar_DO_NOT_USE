package com.google.android.material.snackbar;

import X.C004601z;
import X.C53362fa;
import X.C53792gI;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class SnackbarContentLayout extends LinearLayout implements C53792gI {
    public int A00;
    public int A01;
    public Button A02;
    public TextView A03;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53362fa.A0D);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean A00(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.A03.getPaddingTop() == i3 && this.A03.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.A03;
        if (C004601z.A0w(textView)) {
            C004601z.A0h(textView, C004601z.A08(textView), i3, C004601z.A07(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.A02;
    }

    public TextView getMessageView() {
        return this.A03;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A03 = (TextView) findViewById(R.id.snackbar_text);
        this.A02 = (Button) findViewById(R.id.snackbar_action);
    }

    public void onMeasure(int i2, int i3) {
        boolean A002;
        super.onMeasure(i2, i3);
        int i4 = this.A01;
        if (i4 > 0 && getMeasuredWidth() > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            super.onMeasure(i2, i3);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen02e0);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen02df);
        if (this.A03.getLayout().getLineCount() > 1) {
            int i5 = this.A00;
            if (i5 > 0 && this.A02.getMeasuredWidth() > i5) {
                A002 = A00(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2);
            }
            A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
        } else {
            dimensionPixelSize = dimensionPixelSize2;
            A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
        }
        if (A002) {
            super.onMeasure(i2, i3);
        }
    }
}
