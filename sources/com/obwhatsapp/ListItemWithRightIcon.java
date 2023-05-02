package com.obwhatsapp;

import X.C16150sX;
import X.C48412Nd;
import X.C52652eD;
import android.content.Context;
import android.util.AttributeSet;

public class ListItemWithRightIcon extends C48412Nd {
    public boolean A00;

    public ListItemWithRightIcon(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A00) {
            this.A00 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A04 = C16150sX.A0Z(A002);
            this.A03 = C16150sX.A0T(A002);
        }
    }

    public int getRootLayoutID() {
        return R.layout.layout0397;
    }
}
