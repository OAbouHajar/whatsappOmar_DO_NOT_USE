package com.obwhatsapp;

import X.AnonymousClass1VU;
import X.AnonymousClass5OW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class InterceptingEditText extends AnonymousClass1VU {
    public AnonymousClass5OW A00;

    public InterceptingEditText(Context context) {
        super(context);
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        AnonymousClass5OW r0;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (r0 = this.A00) == null) {
            return super.onKeyPreIme(i2, keyEvent);
        }
        r0.AN8();
        return true;
    }

    public void setOnBackButtonListener(AnonymousClass5OW r1) {
        this.A00 = r1;
    }
}
