package com.obwhatsapp.status.playback.widget;

import X.C1044355i;
import X.C47622Js;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.obwhatsapp.mentions.MentionableEntry;

public class StatusEditText extends MentionableEntry {
    public boolean A00;
    public boolean A01;

    public StatusEditText(Context context) {
        super(context);
        A02();
        this.A01 = false;
    }

    public StatusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A01 = false;
    }

    public StatusEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A01 = false;
    }

    public StatusEditText(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void A0F() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth > 0 && measuredHeight > 0) {
            if (getText() == null) {
                super.setTextSize(2, 32.0f);
                return;
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.density;
            int A02 = C47622Js.A02(getText(), 0, getText().length());
            super.setTextSize(2, (float) C47622Js.A00(A02, (int) f2, this.A01));
            C47622Js.A08(this, A02);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            A0F();
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                post(new C1044355i(this, selectionStart, selectionEnd));
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        A0F();
    }

    public void setCursorPosition(int i2) {
        super.setCursorPosition_internal(i2, i2);
    }

    public void setLinkPreviewPresent(boolean z2) {
        this.A01 = z2;
    }

    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        A0F();
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        A0F();
    }
}
