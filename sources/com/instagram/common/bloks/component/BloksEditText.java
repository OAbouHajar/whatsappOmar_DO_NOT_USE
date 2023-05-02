package com.instagram.common.bloks.component;

import X.AnonymousClass38S;
import X.AnonymousClass5MM;
import X.C99144tY;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class BloksEditText extends EditText {
    public AnonymousClass5MM A00;
    public final int A01;

    public BloksEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public BloksEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = getShadowColor();
    }

    public int getDefaultShadowColor() {
        return this.A01;
    }

    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        AnonymousClass5MM r0 = this.A00;
        if (r0 != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            AnonymousClass38S r02 = ((C99144tY) r0).A00;
            r02.A07 = selectionStart;
            r02.A06 = selectionEnd;
        }
    }

    public void setOnSelectionChangedListener(AnonymousClass5MM r1) {
        this.A00 = r1;
    }
}
